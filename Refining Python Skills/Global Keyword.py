""" Simple module which goes over the uses of global """

"""
All variables declared outside some scope is considered a global variable, consequently, all vars declared within a
scope are local. 

Global keyword should only be used within a function, and is used so that variable can be modified
"""

count = 5  # all variables outside a scope is global
print("Initial value of 'global' variable = ", count)


# This doesn't work because 'count' is global, but declared local within the function - ERROR
# def some_method():
#     count = count + 1
#     print(count)

def some_method():
    global count
    sum = count + 1  # 5 + 1 = 6
    print("Sum of this = ", sum)


some_method()
