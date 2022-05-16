/**
 * Simple module which practices the concepts of the first two chapters of the definitive JS guide.
 */

//           ========================= CHAPTER 3: Types, Values, and Variable  =========================
let binaryNumber = 0b10101; // => 21
let hexadecimalDigit = 0xff; // => 255: (15*16 + 15)
let hexadecimalDIgit2 = 0xBADCAFE; // => 195939070

let oneMillion = 1_000_000;
let equalsOneMole = 6.022_140_74e23;

/**
 * Simple function which demonstrates the use of hexadecimal/binary assignment
 */
function printsSpecialNumbers() {
    console.log("Prints the numbers declared above: \n" + binaryNumber + "\n" + hexadecimalDigit + "\n"
        + hexadecimalDIgit2);
}

/**
 * Simple function which prints the numbers. Used to show _ can be used within the number assignmnet
 */
function printsNumbers() {
    let toConvertToBinary = 26;
    console.log("Underscores with numbers " + oneMillion + `\nMoles: ${equalsOneMole}`);

    console.log("Converts 26 to binary " + toConvertToBinary.toString(2));

    let gravitationalConstant = 6.67430e-11;
    console.log("Rounded Up: " + gravitationalConstant.toFixed(13)); //  controls amount of decimals to see
}

function neatMethods() {
    let gravitationalConstant = "\nThis is the value of gravity 6.67430";
    let toParse = "6.67430 [gravity]";

    console.log("Showcase parseFlat() method which removes the text " + parseFloat(toParse));
}

/**
 * Simple function which demonstrates division by zero
 */
function divisionByZero(){
    console.log(0/0); // Returns NaN ->  "Not a number"
}

/**
 * Simple DatTime example
 */
function getTheDateAndTime() {
    let timestamp = Date.now();
    let dateToday = new Date();

    console.log(timestamp);
}

/**
 * Simple function which showcases how to use escape sequences in strings
 */
function printStrings() {
    let stringExample = "I believe he said \"ES6 is the new JavaScript Standard\".";
    console.log(stringExample);
}

/**
 * Simple function which compares two strings
 */
function stringComparison() {
    let stringExampleOne = "Hello JavaScript"; // 16 characters
    let stringExampleOneHalf = "Hello JavaScript";
    let stringExampleTwo = "Javascript Hello."; // 17 characters

    console.log(stringExampleOne < stringExampleTwo); // should be true as example one has 16 v. the second 17
    console.log(stringExampleOne === stringExampleOneHalf)
}

function toBooleanConversion() {
    if (Object)
        console.log("Objects are always true")
    console.log(binaryNumber.toString())
}

/**
 * Practices the concept of Symbols
 */
function symbolPractice() {
    const MY_KEY = Symbol();
    let symbol = Symbol('aSymbol');
    let symbol2 = Symbol('aSymbol');

    console.log(symbol === symbol2); // returns false, as symbols are always unique

    // Possible Use Case
    let object = {};
    object[MY_KEY] = 123;

    console.log(object[MY_KEY]); // prints 123
}

printsSpecialNumbers();
printsNumbers();
divisionByZero();
getTheDateAndTime();
neatMethods()
printStrings();
stringComparison();
toBooleanConversion()
symbolPractice()