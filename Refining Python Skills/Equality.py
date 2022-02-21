# Declaration of Data Structures
people = ["Kevin", "Jess", "Tyler"]
people_B = ["Kevin", "Jess", "Tyler", None]
numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

# Declaration of module variables
number_one = 10
number_two = 10.0
number_three = number_two

""" ================================================================================================================ """

"""
== refers to the sameness of the two values. If the values themselves are the same
is refers to the reference location of the two values
"""

print("Evaluation using equality '==': ", number_one == number_two)  # true, as 10 = 10
print("Evaluation using equality 'is': ", number_one is number_three)  # false, as references are different

print("\nThe ID of number_three = ", id(number_one), "and has a value of", number_one)
print("The ID of number_three = ", id(number_two), "and has a value of", number_two)


