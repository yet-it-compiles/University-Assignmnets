/*
 * Software : Compiled using Visual Studios 2019 - Community
 * Author : Tyler S. Unsworth
 * Student ID : 42221732
 */

#include <iostream>
#include <fstream>
#include <string>
#include <vector>

using namespace std;

/*
 * Declaration of QuickSelect algorithm, which captures the last element and moves smaller elements to the left, while
 * moving the greater elements to the right
*/
int quickSelect(int arr[], int leftSide, int rightSide)
{
    for (int i = leftSide; i <= rightSide - 1; i++)
    {
        if (arr[i] <= arr[rightSide])
        {
            swap(arr[leftSide], arr[i]);
            leftSide++;
        }
    }
    swap(arr[leftSide], arr[rightSide]);
    return leftSide;
}

/*
 * A Function which calculates the given pth percentile, and returns the pth smallest element
 */
int percentile(int p, int S[], int size)
{
    int leftSide = 0; // starts at index 0 of array
    do
    {
        int pivotLeft = quickSelect(S, leftSide, size); // captures the left pivot
        // if the left pivot is == to the percentile
        if (pivotLeft == p)
        {
            return S[pivotLeft];
        }
        if (pivotLeft > p)
        {
            size = pivotLeft - 1; // deincrement the left, as the pivor is greater
        }
        else
        {
            leftSide = pivotLeft + 1;
        }

    } while (leftSide <= size);
    return -1;
}

/*
 Prints to console the desired percentiles
*/
int main()
{
    // Declaration of Data Structures
    vector<int> vectorStorage;
    string string;

    ifstream file1("data1.txt"); // starts reading from the given file

    getline(file1, string);

    // Declaration of logic to populate vectorStorage
    while (!file1.eof())
    {
        getline(file1, string);
        if (file1.eof()) break;
        vectorStorage.push_back(stoi(string));
    }

    // Declaration of Logic to Calculate each Percentile
    int percentile25 = (vectorStorage.size() - 1) * 0.25;
    percentile25 = percentile(percentile25, &vectorStorage[0], vectorStorage.size() - 1);

    int percentile50 = (vectorStorage.size() - 1) * 0.5;
    percentile50 = percentile(percentile50, &vectorStorage[0], vectorStorage.size() - 1);

    int percentile75 = round((vectorStorage.size() - 1) * 0.75); // using round to return the integral value to yield correct calculation
    percentile75 = percentile(percentile75, &vectorStorage[0], vectorStorage.size() - 1);

    // Prints the solution to the console
    cout << "25: " << percentile25 << endl;
    cout << "50: " << percentile50 << endl;
    cout << "75: " << percentile75 << endl;
}