class FirstPerson:
    def __init__(self, first_name, last_name, age):
        self.first_name = first_name
        self.last_name = last_name
        self.age = age if age > 1 else "Invalid Age"

    def __str__(self):
        return f"My name is {self.first_name} {self.last_name} and I am {self.age} years old"


class SecondPerson(FirstPerson):
    """
    This is an example of inheritance, where SecondPerson 'inherits' the code from it's 'parent' or 'superclass'
    """
    pass


def main():
    tyler = FirstPerson("Tyler", "Unsworth", 26)
    jessica = SecondPerson("Jessica", "Unsworth", 23)

    print(tyler)
    print(jessica)


if __name__ == '__main__':
    main()
