/*
 * Name - Tyler S. Unsworth
 * Student ID - 4221732  TODO - check to make sure
 * Development IDE Used - VS 2019 Community edition
 */

#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

        int main(int Count, char* Vector[])
        {
        // Declaration of initial starting values to create permutations
        int n = atoi(Vector[1]);
        int k = atoi(Vector[2]);

        // Declaration of Data Structure
        vector<int> permutations;


        // Declaration of logic to populate permutation vector
        for (int i = 0; i < n; i++)
        {
        permutations.push_back(i);
        }

        // Declaration of logic to expand permutations
        do
        {
        for (int i = 0; i < k; i++)
        {
        cout << myVect[i]; // prints the permutations
        }

        cout << "\t"; // seperates each set by a tab
        reverse(myVect.begin() + k, myVect.end()); // reverses the list of permutations to show correct order
        }
        while (next_permutation(myVect.begin(), myVect.end()));

        return 0;
        }