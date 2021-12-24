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
If you want to unpack an unknown amount of variables
"""


def something(*args):
    """ docstring """
    for each_person in args:
        storage.append(each_person)


something(people[0], people[1], people[2])


# UNIVERSAL WAY
def do_something(*args):
    """ docstring """
    for each_element in args:
        storage.append(each_element)


do_something(*people)
