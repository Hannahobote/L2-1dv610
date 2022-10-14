import {Auth} from "./auth.js"

const template = document.createElement('template')
template.innerHTML = `

<style>

</style>

  <!--signIn form form-->

  <form class="signIn">
    <h3>Login</h3>

    <div class="grid">
  
  <!--diplays error msg on error-->
    <div id="errorEvent" ></div>

      <label for="username">
        username
        <input type="text" id="username" name="username" placeholder="username" required>
      </label>
  
      <label for="password">
        password
        <input type="password" id="password" name="password" placeholder="password" required>
      </label>
  
    </div>

    <button type="submit" id="submitBtn">Submit</button>

 </form>

`
customElements.define('sign-in',
/**
 * Login Component.
 *
 */
  class extends HTMLElement {
  /**
   * Constructor.
   *
   */
    constructor () {
      super()
      this.attachShadow({ mode: 'open' })
        .appendChild(template.content.cloneNode(true))
      this.submitBtn = this.shadowRoot.querySelector('#submitBtn')
      this.username = this.shadowRoot.querySelector('#username')
      this.password = this.shadowRoot.querySelector('#password')
      this.errorBox = this.shadowRoot.querySelector('#errorEvent')
      this.auth = new Auth()

    }

    /**
     * Adds events.
     *
     */
    connectedCallback () {
      this.events()
    }

    disconnectedCallback() {
      this.events()
    }
    
    events() {
      // prevent default and send value.
      this.submitBtn.addEventListener('click', evt => {
        evt.preventDefault()
        this.signIn(evt)
      })
    }

    signIn(e) {
      console.log('im signined in')
      console.log(this.username.value)
      console.log(this.password.value)
      const result = this.auth.signIn(this.username.value, this.password.value)
      console.log(result)

    }


    setErrorMsg(msg) {
      this.errorBox.textContent = msg
    }

    resetErrorMsg(msg) {
      this.errorBox.textContent = ''
    }

    /**
     * Cutsome Event.
     *
     */
    useNickName () {
      this.dispatchEvent(new window.CustomEvent('nickName', { detail: { name: this.setNickName() } }))
    }
  }
)
