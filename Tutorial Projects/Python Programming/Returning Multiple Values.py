# Declaration of Data Structures
people = ["Kevin", "Jess", "Tyler"]
cars = ["Aston", "Audi", "McLaren"]
tup = (1, 2, 3)
numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]

# Declaration of module variables
number_one = 10
number_two = 15
text = "Backend (Java) -> Frontend (Python, HTML, CSS)"

""" ================================================================================================================ """


def do_something():
    """ docstring """
    value = number_one + number_two
    return text, value


resultant_text, resultant_value = do_something()

print(resultant_text)
print(resultant_value)
