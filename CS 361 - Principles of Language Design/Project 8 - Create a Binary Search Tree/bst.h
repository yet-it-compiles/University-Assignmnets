
#ifndef __BST_H__
#define __BST_H__


#include <stdbool.h>


struct Node
{
    int key;
    int value;
    
    struct Node* left;
    struct Node* right;
};

typedef struct BST
{
    int size;
    struct Node* root;
} BST;


// Creates a new empty binary search tree;
BST* newTree();

// Deletes the whole tree and frees allocated memory.
void deleteTree(BST* tree);

// Inserts a key-value pair into a tree.
// Updates the value if a node with the given key already exists in the tree.
void insert(BST* tree, int key, int value);

// Determines if the tree contains a node with the given key.
bool contains(BST* tree, int key);

// Returns the value associated with the given key.
// Returns 0 if no such key is stored.
int getValue(BST* tree, int key);

// Deletes the key-value pair with the given key.
// Does nothing if no such key-value pair exists in the tree.
void delete(BST* tree, int key);

#endif
