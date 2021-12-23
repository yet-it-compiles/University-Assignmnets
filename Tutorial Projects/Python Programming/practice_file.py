import template_file


# Declaration of Data Structures
people = ["Kevin", "Jess", "Tyler"]
cars = ["Aston", "Audi", "McLauren", "Ferrari"]
tup = (1, 2, 3)
numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]

# Declaration of module variables
number_one = 10
number_two = 15
text = "Backend (Java) -> Frontend (Python, HTML, CSS)"

""" ================================================================================================================ """


for each_person, each_car in zip(people, cars):
    print(each_person)
    print(each_car)
print()
for each_car in cars:
    print(each_car)

