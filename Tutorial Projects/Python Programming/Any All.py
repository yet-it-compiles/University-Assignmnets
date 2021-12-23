# Declaration of Data Structures
people = ["Kevin", "Jess", "Tyler"]
people_B = ["Kevin", "Jess", "Tyler", False]
numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

""" ================================================================================================================ """

"""
Any 
Returns true if any of the items is True. It returns False if empty or all are false. 
Any can be thought of as a sequence of OR operations on the provided iterables.
"""
print("The ANY values: ")
print(any(people))
print(any(people_B))

"""
All
Returns true if all of the items are True (or if the iterable is empty).
"""
print("\nThe ALL values: ")
print(all(people))
print(all(people_B))
