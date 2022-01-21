/*
Compiled Using: VS Studio 2019 - Community
Tyler S. Unsworth
Matrix Assignment
*/

#include <iostream>
#include <vector>
#include <sstream>
#include <string>
//#include "matrix.h" 

using namespace std;

// Declaration of Matrix class which defines functionality for the Matrix
class Matrix
{
    // Declaration of private fields
    vector<vector<long>> matrix;
    int height;
    int width;

// Declaration of public variables to use in the Matrix
public:
    Matrix();
    explicit Matrix(int);
    Matrix(int, int);
    ~Matrix();

    // Declaration of Matrix constants
    int getWidth() const;
    int getHeight() const;

    void resize(int, int);
    long& operator()(int&, int&);
};


// Creates a default constructor Matrix of 0x0
Matrix::Matrix()
{
    width = 0;
    height = 0;
    matrix.resize(0); // resizes the matrix to 0, to ensure 0x0
}

// Creates a parameterized identity matrix of size x size 
Matrix::Matrix(int size)
{
    // Assingns the private variables to size
    width = size;
    height = size;

    matrix.resize(height);

    // Declaration of logic to create Identity Matrix
    for (int i = 0; i < height; i++)
    {
        matrix[i].resize(width, 0);
    }

    // Declaration of Logic to create diagonal values of 1
    for (int i = 0; i < size; i++)
    {
        for (int j = 0; j < size; j++)
        {
            if (i == j)
            {
                matrix[i][j] = 1;
            }
        }
    }
}

// Creates a Matrix of size height x width
Matrix::Matrix(int height, int width)
{
    matrix.resize(height);

    for (int i = 0; i < height; i++)
    {
        matrix[i].resize(width, 0);
    }
}

// Declaration of Deconstructor
Matrix::~Matrix()
{
    // Declaration of logic for deconstrucor
    for (int i = 0; i < height; i++)
    {
        matrix[i].clear();
    }
    matrix.clear();
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
void Matrix::resize(int new_height, int new_width)
{
    cout << "passed" << endl;
}

// Declaration of operator which returns the reference to the value in the position
long& Matrix::operator()(int& row, int& col)
{
    return this -> matrix[row][col];
}