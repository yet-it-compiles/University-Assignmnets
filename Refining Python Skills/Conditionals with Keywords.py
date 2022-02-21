# Declaration of Data Structures
people = ["Kevin", "Jess", "Tyler"]
numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

# Declaration of module variables
numbers_one = 10
numbers_two = 15

""" ================================================================================================================ """

# Checking if the magnitude of the values are the same
if numbers_one == numbers_two or numbers_one is numbers_two:
    print("This is False")
else:
    print("This is True")

if numbers_one is numbers_two:
    print("This is false")

if numbers_one is not numbers_two:
    print("This is True")


