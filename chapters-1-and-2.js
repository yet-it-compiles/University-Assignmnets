/**
 * A simple module which practices the concepts of each section in Chapter 1 & 2 of David Flanagan's:
 * JavaScript - The Definitive Guide
 */

// Declares variables
let firstIntro = "Hello";
const langauge = " JavaScript"
let secondIntro = ", my new friend!";

let minimumAge = 0;


/**
 * Simple function which prints the standard "Hello new language" phrase
 */
function printIntro(){
    let intro = firstIntro + `${langauge}` + secondIntro
    console.log(intro)
    console.log("\u{1F600}"); // prints a smiling face
}

function incrementNumber(){
    while (minimumAge < 18){
        minimumAge++;
    }
    console.log("You should now be 18, since 18=" + minimumAge)
}

printIntro(firstIntro, secondIntro)
incrementNumber()