/*
Compiled with Visual Studios 2019 - Community
Tyler S. Unsworth
*/

#include <iostream>
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

// Copy constructor
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

// Move constructor
Matrix::Matrix(Matrix&& rhs)
{
    width = rhs.width;
    height = rhs.height;
    values = rhs.values;

    rhs.width = 0;
    rhs.height = 0;
    rhs.values = nullptr;
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

void Matrix::transpose()
{
    long** tmpValues = values;

    values = new long* [width];
    for (int w = 0; w < width; w++)
    {
        values[w] = new long[height];
        for (int h = 0; h < height; h++)
        {
            values[w][h] = tmpValues[h][w];
        }
    }

    for (int h = 0; h < height; h++)
    {
        delete[] tmpValues[h];
    }
    delete[] tmpValues;

    int tmp = height;
    height = width;
    width = tmp;

}

// Copy assignment
Matrix& Matrix::operator=(const Matrix& rhs)
{
    resize(rhs.height, rhs.width);

    for (int h = 0; h < height; h++)
    {
        for (int w = 0; w < width; w++)
        {
            values[h][w] = rhs(h, w);
        }
    }

    return *this;
}

// Move assignment
Matrix& Matrix::operator=(Matrix&& rhs)
{
    if (values != nullptr)
    {
        for (int r = 0; r < height; r++)
        {
            delete[] values[r];
        }

        delete[] values;
    }

    width = rhs.width;
    height = rhs.height;
    values = rhs.values;

    rhs.width = 0;
    rhs.height = 0;
    rhs.values = nullptr;

    return *this;
}

long& Matrix::operator()(int row, int col)
{
    return values[row][col];
}

long Matrix::operator()(int row, int col) const
{
    return values[row][col];
}

bool Matrix::operator==(const Matrix& matrix) const
{
    if (width != matrix.width) return false;
    if (height != matrix.height) return false;

    for (int h = 0; h < height; h++)
    {
        for (int w = 0; w < width; w++)
        {
            if (values[h][w] != matrix.values[h][w]) return false;
        }
    }
    return true;
}

// Creates a new matrix which is the sum of this and another given matrix
Matrix Matrix:: operator+(const Matrix& passed_matrix) const 
{
    // Declares height & width
    int new_height = min(height, passed_matrix.height);
    int new_width = min(width, passed_matrix.width);

    // Declares sum_matrix
    Matrix sum_matrix(new_height, new_width); 

    // Declaration of logic to iterate through matrix
    for (int i = 0; i < new_height; i++)
    {
        // Updates sum matrix
        for (int j = 0; j < new_width; j++) 
        {
            sum_matrix.values[i][j] = values[i][j] + passed_matrix.values[i][j];
        }
    }
    return sum_matrix; 
}

// Adds a given matrix to the current
Matrix& Matrix:: operator+=(const Matrix& passed_matrix) 
{
    // Declares height & width
    int new_height = min(height, passed_matrix.height);  
    int new_width = min(width, passed_matrix.width);  

    // Calls the resize method to resize matrix
    resize(new_height, new_width);  

    // Declaration of logic to iterate through matrix
    for (int i = 0; i < new_height; i++)
    {
        // Updates values
        for (int j = 0; j < new_width; j++) {
            values[i][j] += passed_matrix.values[i][j];
        }
    }
    return *this; 
}

// Creates a new matrix which is the product of this and another matrix
Matrix Matrix:: operator*(const Matrix& passed_matrix) const 
{
    // Declares product matrix
    Matrix product_matrix(height, passed_matrix.width); 

    // Declares height & width
    int new_width = min(width, passed_matrix.height); 

    // Declaration of logic to iterate through matrix
    for (int i = 0; i < height; i++) 
    {
        for (int j = 0; j < passed_matrix.width; j++)
        {
            product_matrix.values[i][j] = 0; // assigns values 
            for (int k = 0; k < new_width; k++)
            {
                product_matrix.values[i][j] += (values[i][k] * passed_matrix.values[k][j]); // multiplies each element 
            }
        }
    }
    return product_matrix; 
}

// Multiplies a given matrix with the current
Matrix& Matrix:: operator*=(const Matrix& passed_matrix) 
{
    // Declares a new width 
    int new_width = min(width, passed_matrix.height); 

    // Initalizes a product matrix 
    Matrix product_matrix(height, passed_matrix.width);
     
    // Declaration of logic to iterate through matrix 
    for (int i = 0; i < height; i++) 
    {
        for (int j = 0; j < passed_matrix.width; j++) 
        {
            product_matrix.values[i][j] = 0; // assigns values = 0 
            for (int k = 0; k < new_width; k++) 
            {
                product_matrix.values[i][j] += (values[i][k] * passed_matrix.values[k][j]); // multiplies each element 
            } 
        }
    }

    // Calls the resize method to resizes the matrix 
    resize(product_matrix.height, product_matrix.width); 

    // Logic to iterate through
    for (int i = 0; i < height; i++)
    {
        for (int j = 0; j < width; j++)
        {
            values[i][j] = product_matrix.values[i][j];
        }
    }
    return *this; 
}

// Creates a new matrix which is the product of this matrix and a given number
Matrix Matrix:: operator*(long number) const 
{
    // Initializes a product matrix
    Matrix product_matrix(height, width);

    // Declaration of logic to iterate through the matrix
    for (int i = 0; i < height; i++)
    {
        for (int j = 0; j < width; j++) {
            product_matrix.values[i][j] = values[i][j] * number; // multiplies each element by the number passed
        }
    }
    return product_matrix;
}

// Multiplies the current with a given number
Matrix& Matrix:: operator*=(long number) 
{

    // Declaration of logic to iterate through the matrix
    for (int i = 0; i < height; i++)
    {
        for (int j = 0; j < width; j++)
        {
            values[i][j] *= number; // multiplies each element by the number passed
        }
    }
    return *this;
}