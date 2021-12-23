""" Simple module which covers how to take in multiple values """
first_name = str(input("Please enter your first name: "))
print(first_name)


# By using the ( split() ) method
first_name, middle_name, last_name = str(input("Please enter your first name: ")).split()

print(first_name)
print(middle_name)
print(last_name)

