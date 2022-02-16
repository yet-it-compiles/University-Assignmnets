/*
 * Project: 
 * Completion time: ? hours
 * 
 * Honor code: “I pledge that I have neither given nor received help from anyone
 * other than the instructor or the TAs for all program components included here.”
 */
       
package package4;
import java.util.ArrayList;

class MyVector {

    // Declaration of constant Data Structure 
    final protected ArrayList<Double> VECTORARRAY;

    /**
     * MyVector constructor that initializes a new ArrayList and then stores the
     * values from the parameter array into the ArrayList.
     *
     * @param initvalues - array of doubles containing initial value
     */
    MyVector(double[] initvalues) {
        VECTORARRAY = new ArrayList<>();

        for (double digit : initvalues) {
            VECTORARRAY.add(digit);
        }
    }

    /**
     * Creates a copy constructor and assigns the values from the Vector field
     * to the new copy vector Array
     *
     * @param copy is a copy of the MyVector object
     */
    MyVector(MyVector copy) {
        VECTORARRAY = new ArrayList<>();

        for (int i = 0; i < copy.size(); i++) {
            VECTORARRAY.add(copy.get(i));
        }
    }

    /**
     * Gets the size of the vectorArray and returns the int size of theArray/
     * ArrayList as an integer
     *
     * @return the number of elements in MyVector array
     */
    public int size() {
        return VECTORARRAY.size();
    }

    /**
     * Returns the value at the specified index
     * 
     * @param index some integer that represents the index
     * @return a double value at the index requested
     */
    public double get(int index) {
        return VECTORARRAY.get(index);
    }

    /**
     * Evaluates the addition between two vectors, stores it in a new array then
     * returns in the form of a new object
     *
     * @param newVector to return and store values
     * @return a nee vector object representing the addition
     */

    /**
     * Evaluates the subtraction between two vectors, stores it in a new array
     * then returns in the form of a new object
     *
     * @param newVector is the returned structure storing the new values
     * @return array with new data
     */
    public MyVector minus(MyVector newVector) {
        double[] vector = new double[this.size()];

        for (int i = 0; i < this.size(); i++) {
            vector[i] = this.get(i) - newVector.get(i);
        }
        return new MyVector(vector);
    }

    /**
     * Evaluated the amount needed to be scaled by, then returns a new object
     *
     * @param digit is the new data object to return
     * @return returns the object with new data
     */
    public MyVector scaledBy(double digit) {
        double d1 = 0;
        double[] vector = new double[this.size()];

        for (int i = 0; i < this.size(); i++) {
            vector[i] = this.get(i) * digit;
        }
        return new MyVector(vector);
    }

    /**
     * Evaluates the dot product of two vectors then returns that value
     *
     * @param newVector creates a new vector to multiply it to
     * @return the dot product of two vectors
     */
    public double dot(MyVector newVector) {
        double evaluationOfDot = 0;

        for (int i = 0; i < this.size(); i++) {
            evaluationOfDot += this.get(i) * newVector.get(i);
        }
        return evaluationOfDot;
    }

    /**
     * Evaluates the absolute value of the vector
     *
     * @return the abs of the vector
     */
    public double abs() {
        return Math.sqrt(this.dot(this));
    }

    /**
     * returns the human readable string representation of MyVector object
     *
     * @return the string representation of a vector
     */
    @Override
    public String toString() {
        return "<" + VECTORARRAY.toString().replace("[", "").replace("]", "") + ">";
    }

    /**
     * Overrides the equals method, and returns true or false if the objects are
     * equal or not
     * @param obj a generic object
     * @return a boolean value if the objects equal each other or not
     */
    @Override
    public boolean equals(Object obj) {
        if (this.VECTORARRAY == obj) {
            return true;
        }

        MyVector test = (MyVector) obj; // declares polymorphic object
        if (test.VECTORARRAY == VECTORARRAY) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        for (int i = 0; i < test.size(); i++) {
            if (this.get(i) != test.get(i)) {
                return false;
            }
        }
        return true;
    }
}
