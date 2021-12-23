import Tuples as t

def main():
    print("enter")
    myFunction()
    t.myFunction()


def myFunction():
    var = 'The value of __name__ is ' + __name__
    print(var)


if __name__ == '__main__':
    main()
    print(__name__)
