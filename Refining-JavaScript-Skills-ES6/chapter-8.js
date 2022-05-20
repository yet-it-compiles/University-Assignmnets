/**
 * A simple module which practices the concepts of each section in Chapter 8 of David Flanagan's:
 * JavaScript - The Definitive Guide
 */

function getName() {
    return "Yet-it-compiles";
}

const retrieveName = function () {return "Yet-it-compiles"};
console.log("Printing name from function invocation: ", getName());
console.log("Printing name from function expression: ", retrieveName());

const printName = () => {return "My name is, " + getName()};
console.log("\nPrinting name from arrow function: ", printName());

let testingObject1 = {};
testingObject1.x = getName();

console.log("Did this create a new method on testingObject? ", testingObject1.x);

console.log(testingObject1);

function testingFunction(a, b) {
    if (a)
        console.log(a);
    console.log("Hello");
}

console.log("You do not have to pass parameter values... cool")
testingFunction();

let a;
let b;
let c = 3;

b = a || c; // ternary operators
console.log(b)

function testingFunction2 (a=1, b=a*2) {
    console.log(`\n a should be = 1 ${a} and b should be = 2 ${b}`);
}

