import {Auth} from "./auth.js"

const template = document.createElement('template')
template.innerHTML = `

<form class="registerUser">

    <h1>Welcom to simple Auth</h1>
    <h3>Register an account</h3>

    <div class="grid">
  

      <label for="registerUsername">
        username
        <input type="text" id="registerUsername" name="registerUsername" placeholder="register Username" required>
      </label>
  
      <label for="registerPassword">
        password
        <input type="text" id="registerPassword" name="registerPassword" placeholder="register Password" required>
      </label>
  
    </div>

    <button type="submit" id="registerSubmitBtn">Submit</button>
    <button type="submit" id="IsAUserBtn">I already have an account</button>


  </form>
`
customElements.define('register-user',
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
