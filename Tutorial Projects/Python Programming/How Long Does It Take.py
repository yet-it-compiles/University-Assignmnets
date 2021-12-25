import itertools
import timeit
from itertools import combinations

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


def first_test():
    """ docstring """
    a = 2+2
    b = 3+3
    c = 4+4

    return a, b, c


def second_test():
    """ docstring """
    a = 2+2
    b = 3+3
    c = 4+4

    storage.append(a)
    storage.append(b)
    storage.append(c)

    return storage


if __name__ == '__main__':
    print("\n First functions recorded time: ", end=" ")
    print(timeit.timeit('first_test()', setup='from __main__ import first_test', number=1000))

    print("\n Second functions recorded time: ", end=" ")
    print(timeit.timeit('second_test()', setup='from __main__ import second_test', number=1000))

    time_delta1 = timeit.timeit('first_test()', setup='from __main__ import first_test', number=1000)
    time_delta2 = timeit.timeit('second_test()', setup='from __main__ import second_test', number=1000)
    time_delta = time_delta1 - time_delta2

    print("The difference between Test 1 and Test 2: ", time_delta)


""" =========================================Yielding Results======================================================= """

"""
Return vs. Yield - Return is faster


"""