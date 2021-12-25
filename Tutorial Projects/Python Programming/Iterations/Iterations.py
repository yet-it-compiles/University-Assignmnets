""" This module will aid in different techniques for iterating """
# To print out a range of numbers
print("A number list in order")
for each_number in range(6):  # prints out numbers from range 0-5
    print(each_number) if each_number == 5 else print(each_number, end="-")

# To print out each number backwards
print("\nA number list backwards")
for each_number in reversed(range(6)):
    print(each_number, end=" ")

# To print every other number
print("\n\nPrints out every other number")
for each_number in range(0, 11, 2):  # starting, to what (n-1), increment
    print(each_number, end=" ")

print("\n\nPrints out every other odd number in reverse")
for each_number in reversed(range(1, 11, 2)):
    print(each_number, end=" ")


