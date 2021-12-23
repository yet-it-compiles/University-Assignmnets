# Declaration of Data Structures
people = ["Kevin", "Jess", "Tyler"]
cars = ["Aston", "Audi", "McLaren"]
numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]

# Declaration of module variables
numbers_one = 10
numbers_two = 15
text = "Backend (Java) -> Frontend (Python, HTML, CSS)"

""" ================================================================================================================ """

"""
This is a normal function call, nothing new
"""


def do_something():
    """ docstring """
    print(sum(numbers))


"""
Parameterized function with an unknown number of accepted parameters
"""


def do_something(*args):
    """ docstring """
    print("Inside method, reference value: ", id(args), end="\n\n")


"""
This is a keyword argument passed function
"""


def do_something02(greeting, farewell):
    """ docstring """
    print(greeting, "and", farewell)


"""
When we pass a reference and change the received reference to something else, the connection between the passed and 
received parameter is broken.
"""
print("Example of how all values are 'passed by reference'", id(numbers_one))
do_something(numbers_one)

"""
This strategy allows you to return multiple values from a function
"""


"""
Yield are used in Python generators. A generator function is defined like a normal function, but whenever it needs to 
generate a value, it does so with the yield keyword rather than return. If the body of a def contains yield, the 
function automatically becomes a generator function.
"""
def do_something3(x, y, z):
    """ docstring """
    yield print(x + y)
    yield print(x * z)
    yield print("Finished!")


for each_yield in do_something3(4, 5, 2):
    print(each_yield)

do_something02(greeting="Hello", farewell="Goodbye :)")
do_something3(x=1, y=2, z=3)
