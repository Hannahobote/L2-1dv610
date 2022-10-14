import { timeStamp } from "console"

export class view {

  constructor() {
    this.username
    this.password 
  }

  getUsername() {
    this.username = document.querySelector('#username').value
  }

  setUsername(name) {
    this.username = name
  }

  getPassword() {
    this.password = document.querySelector('#password').value

  }

  setPassword(password) {
    this.password = password
  }

  hideSignInForm() {

  }

  showLoginForm() {

  }

  onSubmit() {
    // prevent default
  }
} 