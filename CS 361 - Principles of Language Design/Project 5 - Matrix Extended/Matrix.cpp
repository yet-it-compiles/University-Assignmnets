/*
Compiled using Visual Studios 2019 - Community
Tyler S. Unsworth
Matrix Part 2
*/

#include <algorithm> // provides min()
using namespace std;
#include "matrix.h"

Matrix::Matrix()
{
    width = 0;
    height = 0;
    values = nullptr;
}

Matrix::Matrix(int size) : Matrix(size, size)
{
    for (int s = 0; s < size; s++)
    {
        values[s][s] = 1;
    }
}

Matrix::Matrix(int height, int width) : Matrix()
{
    resize(height, width);
}

Matrix::Matrix(const Matrix& other) : Matrix(other.height, other.width)
{
    for (int h = 0; h < height; h++)
    {
        for (int w = 0; w < width; w++)
        {
            values[h][w] = other(h, w);
        }
    }
}

Matrix::~Matrix()
{
    if (values != nullptr)
    {
        for (int r = 0; r < height; r++)
        {
            delete[] values[r];
        }

        delete[] values;
    }
}

Matrix::Matrix(Matrix&& other) 
{
    // Declaration of assignments for method variables
    height = other.height; 
    width = other.width; 
    values = other.values; 

    // Declaration of default assignments
    other.height = 0; 
    other.width = 0; 
    other.values = nullptr; 
}

int Matrix::getWidth() const
{
    return width;
}

int Matrix::getHeight() const
{
    return height;
}

void Matrix::resize(int hei, int wid)
{
    long** tmpValues = values;
    values = new long* [hei];
    for (int h = 0; h < hei; h++)
    {
        values[h] = new long[wid];
        for (int w = 0; w < wid; w++)
        {
            values[h][w] = 0.0;
        }
    }
    for (int h = 0; h < min(hei, height); h++)
    {
        for (int w = 0; w < min(wid, width); w++)
        {
            values[h][w] = tmpValues[h][w];
        }
    }
    for (int h = 0; h < height; h++)
    {
        delete[] tmpValues[h];
    }

    delete[] tmpValues;
    width = wid;
    height = hei;
}

// Declaration of logic to transpose the matrix to its transposition
void Matrix::transpose() 
{
    // Declaration of method varibles
    long** storage = values; 
    values = new long* [width]; 
    
    // Declaraion of logic to populate values
    for (int i = 0; i < width; i++) 
    {
        values[i] = new long[height]; 
        for (int j = 0; j < height; j++) 
        {
            values[i][j] = storage[j][i]; // assigns values to temp. storage
        }
    }

    // Declaration of memory deallocation
    for (int i = 0; i < height; i++) 
    {
        delete[] storage[i]; 
    }

    delete[] storage; 

    // Updates the matrix to the tranpo values
    int temp = width;
    width = height;
    height = temp;
}

long& Matrix::operator()(int row, int col)
{
    return values[row][col];
}

long Matrix::operator()(int row, int col) const
{
    return values[row][col];
}

// Declaration of copy constructor
Matrix& Matrix::operator=(const Matrix& other)
{
    if (this != &other) // checks to ensure this is not the same as passed
    {
        // Declaration of values for copy constructor variables
        height = other.height;
        width = other.width;

        // Declaration of logic to populates copy values
        for (int i = 0; i < height; i++)
        {
            for (int j = 0; j < width; j++)
            {
                values[i][j] = other(i, j);
            }
        }
    }
    return *this; // returns pointer
}

// Declaration of logic to deteramine if two Matricies are equal
bool Matrix::operator==(const Matrix& other) const
{
    // Declaraion of conditions to be equal
    if (height == other.height && width == other.width)
    {
        // Declaration of logic to populate values 
        for (int i = 0; i < height; i++)
        {
            for (int j = 0; j < width; j++)
            {
                if (values[i][j] != other(i, j))
                {
                    return false; // the values at each !=
                }
            }
        }
        return true; // they are the same
    }
    return false; // the two are not the same
}

// Declaration of Move constructor logic
Matrix& Matrix:: operator=(Matrix&& other) {
    // Declaration of condition
    if (this != &other) {
        
        // Logic to deallocate memory
        for (int i = 0; i < height; i++)
        {
            delete[] values[i];
        }
        delete[] values;

        // Sets values
        values = other.values;
        width = other.width;
        height = other.height;

        // Assigns others values
        other.values = nullptr;
        other.width = 0;
        other.height = 0;
    }
    return *this;
}