""" Demonstrates common uses of lists """

# Initializing a list
print("Initial List:")
list_of_names = ['Kevin', 'Kai', 'Elvis', 'Jessica', 'Tyler']
list_of_numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

# Examples of adding elements to a list
list_of_names.append("Hatef")  # adds Hatef to the end of the list

"""
.extend takes in a list of elements to append to the back
"""
list_of_names.extend(["Dean", "Chris", "Todd"])  # appends multiple elements to the back of the list at once

list_of_names.insert(0, "Jaida")  # Inserts an element to a desired index

# Examples of removing elements from a list
list_of_names.remove("Jaida")  # removes a specific element
list_of_names.pop()  # removes the last element
print(list_of_names)

""" ================================================================================================================ """
print("\nList of Numbers: ", list_of_numbers)

sliced_list = list_of_numbers[:5]  # substrings the list from the specified index (0-4)
sliced_list2 = list_of_numbers[5:]  # substrings the list from the specified index (4 - n-1)
sliced_list3 = list_of_numbers[:]  # takes the entire list
sliced_list4 = list_of_numbers[::-1]  # prints the list backwards

print("Takes the first 5 numbers", sliced_list)
print("Takes the last set of numbers", sliced_list2)
print("The entire list", sliced_list3)
print("Reverses the entire list", sliced_list4)
