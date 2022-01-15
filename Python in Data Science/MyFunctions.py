"""
Author : Tyler S. Unsworth
Date   : 07/07/2021
File   : My Functions.py
"""


def multiplyTogether(message, *args):
    """Prints out the message.Multiples together all of the parameters and returns the result."""

    print("Using the function multiplyTogether()")
    multiple = 1

    for i in args:
        multiple *= i

    print("Message is : ", message)
    return multiple


def addTogether(message, *args):
    """Prints out the message.Adds together all of the parameters and returns the result."""

    print("Using the function addTogether()")
    addend = 0

    # Declaration of Logic
    for i in args:
        addend += i  # Adds each parameter together

    print("Message is : ", message)
    return addend


def calculateAverage(*args):
    """Calculates the average of all of the parameters passed in. Returns the average."""

    print("Using the function calculateAverage()")
    return (sum(args)) / (len(args))


def findMin(*args):
    """Finds  and returns the smallest value and its location from the parameters passed in."""
    print("Using the function findMin()")

    min_value = min(args)

    index_found = args.index(min_value) # stores the index of the min value

    return min_value, index_found


def findTwoLargest(*args):
    """Finds  and returns two largest values from the parameters passed in"""
    print("Using the function findTwoLargest()")

    list_of_args = list(args)

    max_value = max(list_of_args)    # stores max value

    list_of_args.remove(max_value)  # removes the max value

    second_max_value = max(list_of_args)

    return max_value, second_max_value

def countLargest(*args):
    """Finds and returns the largest value and its occurrence."""

    largest_value = max(args)

    occurrence = args.count(largest_value)

    return largest_value, occurrence
