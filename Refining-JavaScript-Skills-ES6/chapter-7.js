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
console.log("You can call a function after it's constructed: ", afterConstructed);
/**
 * Shows that functions may be uses as expressions
 */
let printUsernameAsExpression = function () {
    console.log("\nHello there,", username)
};
let printUsernameAgain = function theUsersname() {
    console.log("\nHi, ", username)
}

printUsernameAsExpression()
printUsernameAgain()

let testingArrowFunction;
testingArrowFunction = (a, b) => {
    return a + b
};

console.log("\nHow to use arrowfunction return: ", testingArrowFunction(1, 2))

function compute(a, b) {
    return `The value of a=${a}, and the value of b=${b}`

    function findSum() {
        return a + b;

        function findProduct() {
            return a * b;
        }
    }
}

let testing = compute(6, 6);

let computeTwice = compute(6, 6) + compute(6, 6);
console.log("You can add functions together " + computeTwice)

function computation(a, b) {
    this.sumResult = a + b;

}

let calculator = { // An object literal
    operand1: 1,
    operand2: 1,
    add() {
        this.result = this.operand1 + this.operand2;
    }
};

calculator.add();
console.log("You can also access the result this way: ", calculator.result)

let person = {
    name: "Yet",
    middleName: "it",
    lastName: "compiles",
    toString : function () {
        return this.name + " " + this.middleName + " " + this.lastName;
    },
    toLocaleString: function () {
        return `${this.name}-${this.middleName}-${this.lastName}`
    }
};

console.log(`\nHello there ${person.name}-${person.middleName}-${person["lastName"]}`);
console.log("By the overriden toString() function property: ", person.toString())
console.log("By the overriden toLocalString() function property: ", person.toLocaleString())

console.log("\nShows how Object.assign() works")
 let testingObject1 = Object.create(Object.prototype);
 let testingObject2 = {x: 1, y: 2, z: 3};
testingObject1["r"] = 4;
 console.log("\nThis is object1: ", testingObject1)
console.log("This is object2: ", testingObject2)

Object.assign(testingObject1, testingObject2)

console.log("\nThis is object1: ", testingObject1)
console.log("This is object2: ", testingObject2)

console.log("\n")

for (let eachElement in Object.keys(testingObject2))
    console.log(eachElement)
