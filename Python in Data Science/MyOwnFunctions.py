"""
Date: 06/29/2021
File: CallingFunctions
Author: Tyler S. Unsworth
"""


def list_creation():
    """Function creates a list from [1-13] and returns it"""
    list_of_numbers = range(1, 14)
    return list(list_of_numbers)


def sum_of_elements():
    """Function takes the sum of each element in the list and returns 91"""
    total_sum = 0
    number_list = list_creation()
    for each_element in number_list:
        total_sum += each_element  # should be 91
    print("The total sum of the list is ", total_sum)


def product_of_elements():
    """Function takes the product of each element in the list and returns 91"""
    total_product = 1
    number_list = list_creation()
    for each_element in number_list:
        total_product *= each_element  # should be 6,227,020,800
    print("The total product of the list is ", total_product)


def print_evens():
    """Function prints the even numbers in the list and returns it"""
    number_list = list_creation()

    # Declaration of Even Print Logic
    for each_element in number_list:
        if each_element % 2 == 0:
            print(each_element, end=",")


# Declaration of Function Calls
function_call = [list_creation(), sum_of_elements(), product_of_elements(), print_evens()]