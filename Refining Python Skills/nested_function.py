# Declaration of Data Structures
people = ["Kevin", "Jess", "Tyler"]
cars = ["Aston", "Audi", "McLauren", "Ferrari"]
tup = (1, 2, 3)
numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]
storage = []

# Declaration of module variables
number_one = 10
number_two = 15
text = "Backend (Java) -> Frontend (Python, HTML, CSS)"

""" ================================================================================================================ """

"""
1. As closures are used as callback functions, they provide some sort of data hiding. This helps us to reduce the use 
of global variables.

2.  When we have few functions in our code, closures prove to be an efficient way. But if we need to have many 
functions, then go for class (OOP).
"""


# This allows for you to call both the functions
# 1
def do_something():
    print("This is inside the first function")

    def do_something_else():
        print("This is inside the second function")

    do_something_else()


if __name__ == '__main__':
    do_something()  # 1.

""" ================================================================================================================ """


def do_something_2():
    print("This is inside the first function")

    def do_something_else_2():
        print("This is inside the second function")

    return do_something_else_2


if __name__ == '__main__':
    print("\nThis is the second example")
    function_call = do_something_2()
    function_call()
