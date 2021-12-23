# Declaration of Data Structures
people = ["Kevin", "Jess", "Tyler"]
people_B = ["Kevin", "Jess", "Tyler", None]
numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

# Declaration of module variables
number_one = 10
number_two = 15

""" ================================================================================================================ """

print("The ID of number_one = ", id(number_one), "and has a value of", number_one)
print("The ID of number_two = ", id(number_two), "and has a value of", number_one)

number_three = number_one + number_two
print("The ID of number_three = ", id(number_three), "and has a value of", number_three)

number_three = 0

number_three = number_three + number_one + number_two
print("The ID of number_three = ", id(number_three), "and has a value of", number_three)

# VIOLATION - the amount doubled
number_three += number_one + number_two
print("The ID of number_three = ", id(number_three), "and has a value of", number_three)

""" 
To fix this, set number_three = 0
"""

number_three += number_one + number_two
print("The ID of number_three = ", id(number_three), "and has a value of", number_three)
