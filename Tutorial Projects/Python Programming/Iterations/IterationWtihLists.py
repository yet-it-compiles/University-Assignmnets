# Declaration of lists
list_of_numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]  # sum = 10
list_of_numbers_b = [7, 8, 9, 10]  # sum = 34

# Declaration of module variables
forward_sum = 0
backward_sum = 0
total_sum = forward_sum + backward_sum

target = 5

"""
index represents i, and keeps the index/iteration count
each_set represents the tuple of each number

each_set[0] will access the first element of the last captured set
each_set[1] will access the second element of the last captured set
"""
for index_a, each_number in enumerate(list_of_numbers):

    if target - each_number == 0:
        print(index_a)


