
import { Auth } from './auth.js'
import { ConsoleUi } from './consoleUi.js'
import { Command } from "commander"

try {

  const auth = new Auth()
  const program = new Command()
  const ui = new ConsoleUi(auth)

  ui.menu()
  ui.registerUserCmd()
  ui.getAllUsersCmd()
  ui.programParse()

  // application start
  /*program
    .version('1.0.0')
    .description('hello, welcome to simple auth')


  // register users 
  program
    .command('1 <username> <password>')
    .description('Register a user')
    .action(async (username, password) =>console.log(await auth.register(username, password)))

  // get all users 
  program
    .command('4')
    .description('Get all users')
    .action(async () => console.log(await auth.getAllUsers()))

  program.parse(process.argv)*/

} catch (error) {

}