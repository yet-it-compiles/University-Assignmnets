/*
Compiled Using: VS Studio 2019 - Community
Tyler S. Unsworth
Lab 4 - Matrix Assignment
*/

#include <iostream> 
#include <vector> 
#include <sstream>  
#include <string>  
#include "matrix.h" 

using namespace std; 

// Creates a default constructor Matrix of 0x0
Matrix::Matrix() 
{
    Matrix(0); // creates a 0x0 matrix
}

// Creates a parameterized identity matrix of size x size 
Matrix::Matrix(int size) 
{
	// Declares heigh, width to the size of the matrix
    this->height = size; 
    this->width = size; 

    values = new long* [height]; // initializes values

	// Declaration of logic to populate width
	for (int i = 0; i < height; i++) 
	{
	    values[i] = new long[width]; 
		// Declaration of logic to populate height
	    for (int j = 0; j < width; j++) 
		{
			// Declaration of logic to populate matrix w/ diagnol 1s
		    if (i == j)
			    values[i][j] = 1; // every time they meet, set element to 1
		    else
			    values[i][j] = 0; // set to 0
		}
	}
}

// Creates a Matrix of size height x width
Matrix::Matrix(int height, int width) 
{
    values = new long* [height]; // allocates memory 
    this->height = height; 
    this->width = width; 

	// Iterates over rows
    for (int i = 0; i < height; i++) 
	{
	    values[i] = new long[width]; 

		// Iterates over the columns 
	    for (int j = 0; j < width; j++) 
		{
		    values[i][j] = 0; 
		}
	}
}

// Declaration of Deconstructor
Matrix::~Matrix()  
{
	// Iterates through each element and deallocates memeory
    for (int i = 0; i < height; i++) 
	{
	    delete[] values[i]; 
	}
    delete[] values; 
}


// Declaration of Accessor Method to return width
int Matrix::getWidth() const 
{
    return width; 
}

// Declaration of Accessor Method to return height
int Matrix::getHeight() const 
{
    return height; 
}

// Declaration of resize method, which changes the size of the Matrix to height x width
void Matrix::resize(int height, int width) 
{
    long** resize_values = new long* [height]; // declares an array storage container

    if (height != this->height || width != this->width) // Checks to ensure values are !=
	{
		// Declaration of logic to populatte rows
	    for (int i = 0; i < height; ++i) 
		{
		    resize_values[i] = new long[width]; 

			// Declaration of logic to populatte length 
		    for (int j = 0; j < width; j++) 
			{
			    if (i < this->height && j < this->width)  // if these are the same 
				{
					resize_values[i][j] = values[i][j]; 
				}
			    else
					resize_values[i][j] = 0; // sets the rest to 0 
			}
		}

		// Releases the all values from memory
	    for (int i = 0; i < this->height; i++) 
		{
		    delete[] values[i]; // releases each element of values
		}
	    
		delete[] resize_values; // releases memeory for the storage array

	    values = resize_values; /// assins values to the storage

		// Updates values
	    this->height = height; 
	    this->width = width; 
	}
}

// Declaration of operator which returns the reference to the value in the position
long& Matrix::operator()(const int row, const int col)
{ 
    return this->values[row][col]; 
}

long Matrix::operator()(const int row, const int col) const
{
    return this->values[row][col]; 
}