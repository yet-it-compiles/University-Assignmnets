# Declaration of Data Structures

people = ["Kevin", "Jess", "Tyler"]
cars = ["Aston", "Audi", "McLauren", "Ferrari", False]
tup = (1, 2, 3)
numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]

# Declaration of module variables
number_one = 10
number_two = 15
text = "Backend (Java) -> Frontend (Python, HTML, CSS)"

""" ================================================================================================================ """

"""
Enumerate is built-in python function that takes input as iterator, list etc and returns a tuple containing index and
data at that index in the iterator sequence. For example, enumerate(cars), returns a iterator that will return
(0, cars[0]), (1, cars[1]), (2, cars[2]), and so on.
"""

# Enumerates over a given structure, and may store both the index and value
print("This is Enumeration: ")
for index, each_person in enumerate(people):
    print(index, each_person)

# Zipping allows combining two like/different structures and combine the elements in some way. Keeping the same elements
print("\nThis is Zipping: ")
for each_person, each_car in zip(people, cars):
    print(each_person, each_car)


print("\nThis is Zipping with a Tuple and List: ")
for each_person, each_car in zip(tup, people):
    print(each_person, each_car)





