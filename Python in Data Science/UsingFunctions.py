"""
Author : Tyler S. Unsworth
Date   : 07/07/2021
File   : My Functions.py
"""

import MyFunctions as X

# Declaration of console statements
result_1 = X.multiplyTogether("Hello!", 2, 2, 2)
print("The result is : ", result_1, "\n**************")

result_2 = X.addTogether("HI!", 5, 2, 3)
print("The result is : ", result_2, "\n**************")

result_3 = X.calculateAverage(2, 1, 3)
print("Average is : ", result_3, "\n**************")

result_4 = X.findMin(10, 5, -4, 2, 7, 8)
print("Smallest Value is : ", result_4[0], " at location: ", result_4[1], "\n**************")

result_5 = X.findTwoLargest(-2, 30, -4, 9, 1, 6)
print("The result is : ", result_5, "\n**************")

result_6 = X.countLargest(2, 2, 899, 56, -9, 87, 899, 764, -100, 899, 2, 2)
print("Largest number is : ", result_6[0], " it's in the sequence ", result_6[1], " times.")
