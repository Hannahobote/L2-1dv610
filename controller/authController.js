
import { Auth } from '../model/auth.js'
import { ConsoleUi } from '../view/consoleUI.js'
export class AuthController {

  /**
   * 
   * @param {Auth} model 
   * @param {ConsoleUi} view 
   */
  constructor(model, view ) {
    this.model = model
    this.view = view 
  }

  run() {
    this.view.greeting()
    this.view.getInput()
  }


}