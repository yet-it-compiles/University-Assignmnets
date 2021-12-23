"""
When you want a variable to take on different values, instead of making conditional statement blocks, you can rather use
Ternary operators in Python
"""

# Declares the possible options that you want the variable to take on
option1 = 15
option2 = 10

# Declaration of Ternary Operator
option3 = option1 if option2 > option1 else None
print("Ternary Operator Resultant: ", option3)

# SAME logic as above
if option2 > option1:
    option3 = option1
else:
    option3 = None


print(option3)
