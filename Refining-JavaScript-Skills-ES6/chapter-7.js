/**
 * A simple module which practices the concepts of each section in Chapter 7 of David Flanagan's:
 * JavaScript - The Definitive Guide
 */
let username = "yet-it-compiles";

console.log("You can call a function before it's constructed: ", printsUsername(username))
/**
 * Simple function which prints the username
 * @param username passed in value
 */
function printsUsername(username) {
    return `Hello, ${username}`;
}
let afterConstructed = printsUsername(username)
console.log("\nYou can call a function after it's constructed: ", afterConstructed);
/**
 * Shows that functions may be uses as expressions
 */
let printUsernameAsExpression = function() {console.log("\nHello there,", username)};
let printUsernameAgain = function theUsersname() {console.log("\nHi, ", username)}

printUsernameAsExpression()
printUsernameAgain()

let testingArrowFunction;
testingArrowFunction = (a, b) => {return a + b};

console.log("\nTesting: ", testingArrowFunction(1,2))