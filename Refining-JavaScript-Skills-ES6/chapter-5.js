/**
 * A simple module which practices the concepts of each section in Chapter 5 of David Flanagan's:
 * JavaScript - The Definitive Guide
 */
let username = "unknown";

/**
 * Simple function which shows if\else
 */
function conditionalIfPractice() {
    console.log("Username evaluation: ", !username)
    if (!username) // If username is null, undefined, false, 0, "", or NaN
        console.log(username);
    else
        console.log("What is your username?");
}

/**
 * Simple function which plays with switch logic control
 */
function conditionalSwitchPractice() {
    switch (username) {
        case "bmxfreestyle":
            console.log("This is the correct username! Welcome.");
            break;
        case "unknown":
            return "Who are you?"
        default:
            console.log(`Welcome ${username}`);
            break;
    }
}

/**
 * Simple function which practices the concept of the for of loop
 *
 * Notes: For of loop seems equivalent to Javas for each loop
 * The for/of loop works with iterable objects.
 */
function conditionalForOfLoopPractice() {
    let arrayOfNumbers = [1,2,3,4,5,6,7];
    let dictOfNumbers = {first: 1, second: 2, third: 3}
    let sum1 = 0, sum2 = 0;

    for (let eachElement of arrayOfNumbers) // iterates through the array and calculates its sum
        sum1 += eachElement;

    for (let eachElement of Object.values(dictOfNumbers)) // iterates through the dictionary and calculates its sum
        sum2 += eachElement;

    for (let [eachKey, eachValue] of Object.entries(dictOfNumbers)) // iterates through the array and returns key/value
        // pairs
        console.log("Here are the keys: ", eachKey, " Here are each value", eachValue)

    console.log("The sum of each element is: ", sum1)
    console.log("The sum2 of each element is: ", sum2)
}

conditionalIfPractice();
conditionalSwitchPractice();
conditionalForOfLoopPractice();