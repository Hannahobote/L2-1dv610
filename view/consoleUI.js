export class ConsoleUi {

  constructor() {
    this.arguments = process.argv.slice(2)
  }

  greeting() {
    console.log("hello, welcome to simple auth")
  }

  getInput() {
    return this.arguments
  }
}