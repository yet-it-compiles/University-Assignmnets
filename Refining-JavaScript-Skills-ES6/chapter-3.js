/**
 * Simple module which practices the concepts of the first two chapters of the definitive JS guide.
 */

//           ========================= CHAPTER 3: Types, Values, and Variable  =========================
let binaryNumber = 0b10101; // => 21
let hexadecimalDigit = 0xff; // => 255: (15*16 + 15)
let hexadecimalDIgit2 = 0xBADCAFE; // => 195939070

/**
 * Simple function which demonstrates the use of hexadecimal/binary assignment
 */
function printsSpecialNumbers() {
    console.log("Prints the numbers declared above: \n" + binaryNumber + "\n" + hexadecimalDigit + "\n"
        + hexadecimalDIgit2);
}
let oneMillion = 1_000_000;
let a = 1_000;

/**
 * Simple function which prints the numbers. Used to show _ can be used within the number assignmnet
 */
function printsNumbers() {
    console.log("One Million: " + oneMillion);
    console.log(a);
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

    console.log(now)
}

printsSpecialNumbers();
printsNumbers();
divisionByZero();
getTheDateAndTime();

/**
 *
 */
function printStrings() {

}



