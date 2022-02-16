/*
Compiled using Visual Studios 2019 - Community
Tyler S. Unsworth
42221732
*/

#include <iostream>
#include <fstream>
#include <string>
using namespace std;

// A simple function which reverses the characters of each word;
void reverse(string &str, int i, int j){
  
    // Declaration of logic to calculate the length of a word
    int lengthOfWord = (j - i + 1)/2;
    int tracker = i;
  
   // Logic to reverse the given word
   while(lengthOfWord--){
       swap(str[tracker], str[j]); // convert from int to string
       j--;
       tracker++;
   }
}  

int main()
{
    ifstream file("input.txt");

    while (file.good()) // while the file can be read
    {
        string line;
        getline(file, line); // allows multiple words to be read

        // Declaration of logic to complete the problem
        for (int i = 0; i < line.length(); i++)
        {
            int tracker = i;

            // Declaration of logic to find space
            while (line[tracker] != ' ' && tracker != line.length())
                tracker++;

            // Calls the function to reverse the word
            reverse(line, i, tracker - 1);

            // Declaration of set up for the next word
            i = tracker;
        }

        cout << line << endl;  // prints solution

        if (file.eof())
        {
            break;
        }
    }
}