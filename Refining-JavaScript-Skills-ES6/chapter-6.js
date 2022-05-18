/**
 * A simple module which practices the concepts of each section in Chapter 6 of David Flanagan's:
 * JavaScript - The Definitive Guide
 */

/*                                              Key Chapter Takeaways
1. - Any value in JavaScript that is not a string, a number, a Symbol, or true, false, null, or undefined is an object.
2. - Object.prototype is one of the rare objects that has no prototype in that it does not inherit any properties.
3. - You can pass null to create a new object that does not have a prototype, but if you do this, the newly created
object will not inherit anything, not even basic methods like toString()
4. - One use for Object.create() is when you want to guard against unintended (but non-malicious) modification of an
object by a library function that you don’t have control over.
 */


//           ========================= Creating Object with Object.create()  =========================
// TODO: One use for Object.create() is when you want to guard against unintended (but non-malicious) modification


/**
 * Object.create() creates a new object, using its first argument as the prototype of that object:
 */
function objectWithParams() {
    let object = Object.create({x: 1, y: 2});
    console.log("\nObject with parameters: ", object) // prints nothing
}

/**
 * Showcases the output of an object when null is passed
 */
function objectWithNull() {
    let object = Object.create(null); // goes with Chapter Takeaway 3.

    console.log("\nObject with null: ", object);
}

/**
 *
 */
function objectEmpty() {
    let object = Object.create(Object.prototype);
    console.log("\nObject with Object.prototype: ", object)
}

function objectPractice() {
    let object = {};

    object.x = "bmx";
    object.y = "yet-it-compiles";

    let newObject = Object.create(object);

    console.log("\nObject prints by dot operator: ", object.x)
    delete object.x;
    console.log("What happens when a property is deleted: ", object["x"]);

    if (delete object.y){
        console.log("This is how you can use it as a boolean operator.")
    }
}

/**
 * It returns true if the object has an own property or an
 * inherited property by that name:
 */
function containsPropertyName() {
    console.log("\nThe object: ", testingObject)
    console.log("Checks to see if property name exists ", "x" in testingObject)
    console.log("Checks to see if property name exists ", "y" in testingObject)
    console.log("Checks to see if property name exists ", "toString" in testingObject)
}

/**
 *
 */
function hasProperty(){
    let testingObject2 = {x: 1};

    console.log("\nThe object: ", testingObject2)
    console.log("Checks to see if object has the property ", testingObject2.hasOwnProperty("x"))
    console.log("Checks to see if object has the property ", testingObject2.hasOwnProperty("y"))
}

objectWithParams();
objectWithNull();
objectEmpty();
objectPractice();
containsPropertyName();
hasProperty();