import { Command } from "commander"
// const program = new Command()

export class ConsoleUi {

  constructor(auth) {
    this.program = new Command()
    this.auth = auth
  }

  menu() {
   this.program
    .version('1.0.0')
    .description('hello, welcome to simple auth')
  }


  registerUserCmd() {
  this.program
    .command('1 <username> <password>')
    .description('Register a user')
    .action(async (username, password) =>console.log(await this.auth.register(username, password)))
  }

  getAllUsersCmd() {
  this.program
    .command('4')
    .description('Get all users')
    .action(async () => console.log(await this.auth.getAllUsers()))
  }

  programParse() {
    this.program.parse(process.argv)
  }
}