# -*- coding: utf-8 -*-
"""
Date: 06/28/2021
File: CallingFunctions
Author: Tyler S. Unsworth
"""
import random

"""A function to get the min value
and index location
Parameters : 
    1.)A list of numbers
Return : 
    1.)min value
    2.)index location
"""
def minValue(numbers):
    num_min = numbers[0]
    location = 0
    for i in range(len(numbers)):
        if numbers[i] < num_min:
            num_min = numbers[i]
            location = i
    return (num_min, location)



"""A function to get the max value
and index location
Parameters : 
    1.)A list of numbers
Return : 
    1.)max value
    2.)index location
"""
def maxValue(numbers):
    num_max = numbers[0]
    location = 0
    for i in range(len(numbers)):
        if numbers[i] > num_max:
            num_max = numbers[i]
            location = i
    return (num_max, location)



"""A function to print, min or max value
and the corresponding index location
Parameters : 
    1.)flag (0 for min, everything else for max)
    2.)a number, 
    3.)index location
Return : None
"""
def printResults(flag, num, index):
    if flag == 0:
        print("The min value is  ", num, ", it's at index ", index, ".")
    else:
        print("The max value is  ", num, ", it's at index ", index, ".")



"""A function to print the list with commas
Parameters : a list
Return : None
"""
def printList(nums):
    last_element = nums[len(nums)-1]
    for i in nums:
        if last_element == i:
            print(i, end=".")
        else:
            print(i, end=", ")
    print()



"""A function to populate a list
The list is shuffled after it is populated
Parameters : 
    1.)starting number
    2.)ending number
    3.)increment
Return : A list
"""
def createList(start=0, end=50, increment=1):
    nums = []
    for i in range(start, end, increment):
        nums.append(i)
    random.shuffle(nums)
    return nums



"""Write the code to call correct functions to do the following:
    1.create a list of numbers which are multiples of 3, between 3 and 50
    2.print out the list
    3.find the index location of minimum value
    4.find the index location of maximum value
    5.Print out the minimum value and index
    6.print out the maximum value and index
"""

#1.create a list of numbers which are
#multiples of 3, between 3 and 50
numbers = createList(3, 50, 3)

#2.print out the list
printList(numbers)

#3.find the index location of minimum value
values = minValue(numbers)

x, y = minValue(numbers)
max_num, index = maxValue(numbers)

#4. gets the max value and its index location
values_max = maxValue(numbers)

#5. Calls a function and gets the min value
print("The min value is", x, ", it's at index ", y, ".")
print("The max value is", max_num, ", it's at index ", index, ".")