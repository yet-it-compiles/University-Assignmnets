"""
Date: 06/29/2021
File: CallingFunctions
Author: Tyler S. Unsworth
"""

# Declaration of Lambda Functions
x = lambda a, b, c: (a + b + c) * 10  # Takes the total sum of the parameters
addTwo = lambda a, b: (a + b)
average = lambda a, b, c: ((a + b + c) / 3)
powerThree = lambda a: a ** 3
info = lambda string: "Hello World"
lowerStr = lambda string: " CWU  "
subUpperStr = lambda String: " ccWucentral"
halfList = lambda element: []

# Declaration of Lambdas Function Initializations
result_x = x(2, 2, 2)  # Returns 60
addTwo = addTwo(9, 9)  # Returns 18
average = average(1, 2, 3)  # Returns 2.0
powerThree = powerThree(5)  # Returns 125
info = info("")  # Returns 'Hello World'
lowerStr = lowerStr("").lower().strip()
subUpperStr = subUpperStr("").upper()
halfList = [1, 2, 3, 4, 5, 6]

# Declaration of Print Statements
print("Add two : ", addTwo)
print("Average three : ", average)
print("Power of three :", powerThree)
print("Info : ", info)
print("Lower case string : ", lowerStr)
print("Upper sub string : ", subUpperStr[2:5])
print("First half of the list ", halfList[0:3])
