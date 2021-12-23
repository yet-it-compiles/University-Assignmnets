names = ["Tyler", "Quan", "Elvis", "Hatef", None]

"""
If you want to unpack an unknown amount of variables
"""
def something(p1, p2, p3, p4, p5):
    print(p1)
    print(p2)
    print(p3)


something(*names)


# UNIVERSAL WAY
def do_something(*args):
    for each_element in args:
        print(each_element, end="*\n")


do_something(*names)
