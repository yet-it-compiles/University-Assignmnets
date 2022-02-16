package package2;
/**
 * Initializes this Sequence object to be empty, with an initial capacity of ten
 * elements.
 * @param <E> generic 
 */
public class Sequence<E> {
    E data[];
    private int size = 10;
    private int currentCount = 0;
   
    /**
     * Default constructor for the sequence object
     * Sets the data to a cast to a new element, then enters the size and count
     * to 0
     */
    public Sequence() {
        this.data = (E[]) new Object[size]; // casts E[] to the new object
        this.size = 10;
        this.currentCount = 0;
    }

    /**
     * parameterized constructor that takes in an integer representing the 
     * capacity of the data structure, casts the generic to a new Object that 
     * takes in some capacity
     * @param capacity of the data structure
     */
    public Sequence(int capacity) {
        this.size = capacity;
        this.data = (E[]) new Object[capacity]; // casts E[] to the new object
        this.currentCount = 0;
    }

    /**
     * Returns the size of the array
     * @return the size of an array declared as a field
     */
    public int size() {
        return this.data.length;
    }
    
/**
 * Checks to see if the array is full then prints an error message if so, 
 * then returns the incremented data/
 * @param element name of the generic
 */
    public void append(E element) {
        if (size <= currentCount)
            System.err.println("Maximum capacity reached, please try again");
        
        data[currentCount++] = element; // short hand increment before assigning
    }
    /**
     * returns the kth index of the array
     * @param k - where k is the index
     * @return the element at the kth index
     */
    public E get(int k){
        if(currentCount <= k)
            System.err.println("You have exceeded the indexs contained");
        
        return data[k];
    }

    /**
     * 
     * @param k represents the given index
     * @param newElement is a new element being returned
     */
    public void set(int k, E newElement){
        if(k >= size)
            System.err.println("The capacity has already been reached");
        
        data[k] = newElement;
    }
}