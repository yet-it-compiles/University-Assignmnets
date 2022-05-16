/**
 * A simple module which practices the concepts of each section in Chapter 4 of David Flanagan's:
 * JavaScript - The Definitive Guide
 */


/**
 * Displays two ways to access an objects properties
 */
function propertyAccess() {
    let testingObject = {x: 12, y: 24};
    let testingObjectTwo = [1,2,4,6];

    console.log("Testing using dot method: " + testingObject.x); // displays 12
    console.log("Testing using array access method: " + testingObjectTwo["2"]); // displays 4
}

function increment() {
    let initialValue = 10;

    console.log("\nIncremented Value by 1 after printed: " + initialValue++); // goes to 11
    console.log("New value after increment: " + initialValue); // prints 11

    console.log("Value after decrement: " + initialValue--) // prints 11 -> goes to 10
    console.log("Negates the value: " + -initialValue); // Negates the value
}

/**
 * Simple method which explores the differences of equality
 */
function equality() {
    let string = "123456";
    let number = 123456;

    if (string == number) // passes: Not strict operator [like below] && JS auto converts to the necessary type
        console.log("\nThis will pass");

    if (string === number) // fails: This happens because we are using a strict operator, where there is no auto cast
        console.log("This will surely not pass");

    if (string != number) // passes: These values ARE equal to each other
        console.log("This will not pass, as the values are NOT equal ")

    if (string !== number) // passes: These values ARE equal to each other
        console.log("This ")
}

/**
 * Explores the 'in' operator
 *
 * Checks to see if a property [leftValue] is contained in the object[rightValue]
 */
function inOperator() {
    let object = {x: 1, y: 3};
    let array = [1,2,3];

    console.log("\nx" in object); // evaluates to true since 'x' is a property label
    console.log(0 in array); // evaluates to true since 0 is the property label

    let d = new Date();
    console.log("\nTrue, as d was created with Date(): ", d instanceof Date);
    console.log("True, as all objects are instanceof Object ", d instanceof Object);
    console.log("False, as d is not a number, but an Object && Date(): ", d instanceof Number);
}


propertyAccess()
increment()
equality()
inOperator()

//           ========================= CHAPTER 4: Notes  =========================

/*
1. NaN - Is never equal to itself or to any other value.

2. the equality operator (==) does not evaluate the types during its tests.

3. Strings are sequences of 16-bit integer values
 */