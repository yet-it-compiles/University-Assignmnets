import operator
import itertools

# Declaration of Data Structures
people = ["Kevin", "Jess", "Tyler"]
cars = ["Aston", "Audi", "McLauren", "Ferrari"]


"""
Python’s Itertool is a module that provides various functions
that work on iterators to produce complex iterators. This module works as a fast, memory-efficient tool that is used
either by themselves or in combination to form iterator algebra.
"""

# .cycle() prints all the values in order, one char at a time
print("Shows what the itertools.cycle does")
count = 0
for each_number in itertools.cycle("21"):
    if count >= 7:
        break
    count = count + 1

""" ================================================================================================================ """


def testing():
    iterator = iter(people)
    print(iterator.__next__())

    if iterator.__next__() == "Kevin":
        "found!"

testing()





