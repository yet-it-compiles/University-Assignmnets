class MyFirstClass:
    """ docstring """
    first_name = ""
    last_name = ""

    def programmer_identity(self, first_name, last_name):
        self.first_name = "Tyler"
        self.last_name = ""




def main():
    first_class = MyFirstClass  # creates an object reference
    first_class.random = 23

    print(first_class.programmer_identity(first_class, "Ty", "uns"))


if __name__ == '__main__':
    main()
