'''
Author : Tyler S. Unsworth
Date   : 07/05/2021
File   : People.py
'''

import sys


class Human:
    """ Defines a class that defines generic behavior for a Human """

    def __init__(self, name, age):
        self.name = name
        self.age = age

    def hobby(self):
        print("Likes watching Netflix.\n")

    def info(self):
        print(self.name.title(), " is ", self.age, " years old.")


class Hiker(Human):
    """ Defines a class that defines generic behavior for a Hiker """

    def hobby(self):
        print("Likes going on hikes.\n")


class Scientist(Human):
    """ Defines a class that defines generic behavior for a scientist """

    def __init__(self, name, age, lab):
        super().__init__(name, age)
        self.lab = lab

    def hobby(self):
        print("Likes doing scientific experiments.")

    def labName(self):
        print("Works at the ", self.lab)


class Swimmer(Human):
    def __init__(self, name, age, hours):
        super().__init__(name, age)
        self.hours = hours

    def hoursSwimming(self):
        print("Swims ", self.hours, " per week.")

    def hobby(self):
        print("Likes swimming in the lake.")


class ScientificSwimmer(Scientist):
    """ Defines a Scientific Swimmer, inherits from two other classes"""

    def __init__(self, name, age, lab):  # Would be (self, name, age, lab, hours)
        super().__init__(name, age, lab)
        # super().__init__(name, age, hours)
        """ I was not able to figure out the final code for this segment, I posted in the thread you asked me to last time
         however, I was unable to get a response. """


# Declaration of Object Instance Initializations
person = Human("megan", 20)
person.info()
person.hobby()

the_hiker = Hiker("jack", 43)
the_hiker.info()
the_hiker.hobby()

the_scientist = Scientist("mike flex", 27, "research laboratory.\n")
the_scientist.info()
the_scientist.hobby()
the_scientist.labName()

the_swimmer = Swimmer("tom accer", 23, 15)
the_swimmer.info()
the_swimmer.hobby()
the_swimmer.hoursSwimming()

the_ScientificSwimmer = ScientificSwimmer("\nJohn Smith", 30, "nuclear laboratory")
the_ScientificSwimmer.info()
the_ScientificSwimmer.hobby()
the_ScientificSwimmer.labName()
