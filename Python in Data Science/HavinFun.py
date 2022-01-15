import sys

# Declaration of Print Statements
ASK_NAME = "Please enter your name "
ASK_AGE = "Please enter your age "


# Declaration of Variables
total_sum = 0


def get_information():
    users_name = input(ASK_NAME)
    first_name = users_name.split()[0]  # stores first name
    last_name = users_name.split()[-1]  # stores last name
    users_age = eval(input(""))


def list_play_ground(total_sum):
    list_of_numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

    for each_element in list_of_numbers:
        total_sum += each_element
    print("Total sum would be - ", total_sum)


# Declaration of Function Calls
# get_information()
list_play_ground(total_sum)
