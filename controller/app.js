
import { Auth } from '../model/auth.js'
import { ConsoleUi } from '../view/consoleUI.js'
import {AuthController}  from './authController.js'

try {

  const model = new Auth()
  const view = new ConsoleUi()
  const controller = new AuthController(model, view)
  controller.run()
  
} catch (error) {
  
}