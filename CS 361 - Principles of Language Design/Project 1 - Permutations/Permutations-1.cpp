/*
 * Tyler S. Unsworth
 * Student ID - 4221732
 * VS 2019 Community edition
 */

#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main(int Count, char* Vector[])
{
    // Declaration of initial starting values to create permutations
    // atoi is used to convert strings values to int values
    int n = atoi(Vector[1]);
    int k = atoi(Vector[2]);

    // Declaration of Data Structure
    vector<int> permutationsVector;

    // Declaration of logic to populate permutation vector
    for (int i = 0; i < n; i++)
    {
        permutationsVector.push_back(i); // adds new element at the end of the vector
    }

    // Declaration of logic to expand permutations
    do
    {
        for (int i = 0; i < k; i++)
        {
            cout << permutationsVector[i]; // prints the permutations
        }

        cout << "\t"; // seperates each set by a tab
        reverse(permutationsVector.begin() + k, permutationsVector.end()); // reverses the list of permutations to show correct order
    } while (next_permutation(permutationsVector.begin(), permutationsVector.end()));

    return 0;
}