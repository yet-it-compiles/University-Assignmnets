# Declaration of logic to create a close together half star
print("Close together half star")
for each_column in range(1, 6):
    for each_row in range(1, each_column+1):
        print("*", end="")
    print()

# Declaration of logic to create a seperated star
print("\nHalf space-seperated star")
for each_column in range(1, 6):
    for each_row in range(1, each_column+1):
        print("*", end=" ")
    print()

# Declaration of logic to create a seperated star
print("\nHalf space-seperated star")
for each_column in range(1, 6):
    for each_row in range(1, each_column):
        print("*", end=" ")
    print()
