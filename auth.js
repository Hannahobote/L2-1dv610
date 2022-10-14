import {SimpleAuth} from './simple-auth/v2/src/controller/simpleAuth.js'

export class Auth {
  
  constructor(model, view ) {
     this.auth = new SimpleAuth(process.env.DB_CONNECTION_STRING);
  }

  register(username, password) {
    return this.auth.register(username, password)
  }

  signIn(username, password) {
    this.auth.signIn(username, password)
  }

  signOut() {
    return this.auth.signOut()
  }

  getCurrentUser() {
    return this.auth.getCurrentSignedInUser()
  }

  getAllUsers() {
    return this.auth.getAllUsers()
  }
}