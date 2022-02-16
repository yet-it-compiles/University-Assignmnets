# Author : Tyler S. Unsworth
# Date   : 06/22/2021
# File   : Cars.py

# Declaration of import statement
import sys

# Declaration of Prompt and storage of user entered number
day_num = eval(input("Please enter a number between 1 and 7 "))
season = input("What season is it? ")

# Declaration of Variables
days = ""
month = ""

# Declaration of numberEnteredByUser Logic
if day_num == 1:
    day = "Monday"
elif day_num == 2:
    day = "Tuesday"
elif day_num == 3:
    day = "Wednesday"
elif day_num == 4:
    day = "Thursday"
elif day_num == 5:
    day = "Friday"
elif day_num == 6:
    day = "Saturday"
elif day_num == 7:
    day = "Sunday"
else:  # Cleanly exits the program if the user enters a wrong number
    print("This number is out of range...")
    sys.exit()

# Declaration of Lists
spring = ["Spring", "spring", "SPRING"]
summer = ["Summer", "summer", "SUMMER"]
fall = ["Fall", "fall", "FALL"]
winter = ["Winter", "winter", "WINTER"]

# Declaration of seasonEnteredByUser Logic
if season == spring[0] or season == spring[1] or season == spring[2]:
    month = "March"
elif season == winter[0] or season == winter[1] or season == winter[2]:
    month = "December"
elif season == fall[0] or season == fall[1] or season == fall[2]:
    month = "September"
elif season == summer[0] or season == summer[1] or season == summer[2]:
    if day_num <= 3:
        month = "June"
    else:
        month = "July"
else:  # Cleanly exits the program if the user enters a wrong number
    print("Season does not exist...")
    sys.exit()
    # TODO figure out why it goes to the else loop

# Program Output To Console
print("\nThe day is", day, "which is day number : ", day_num)
print("The month is", month, "which is in the : ", season)

# Declaration of Conditional
if season == "Summer" and day_num == 6:
    print("Go swimming")
