nums = [1, 2, 3, 4, 5, 6, 7, 8]
target = 7
x = len(nums)
y = nums[5]
print("This is the len ", x)
print("This is 6th index = ", y)


# range(start, stop, step)
def calc(list_of_numbers, target_int):
    for i in range(len(list_of_numbers)):  # captures the first element
        for j in range(i + 1, len(list_of_numbers)):  # starts at index 2, and stops at the length of the number
            if list_of_numbers[j] == target_int - list_of_numbers[i]:
                """
                if 1 = 7 - 2 ~ 1 != 5 - NO
                if 1 = 7 - 3 ~ 1 != 4 - NO
                if 1 = 7 - 4 ~ 1 != 3 - NO
                ...
                if 1 = 7 - 6 ~ 1 = 1 - YES!
                [0,
                """
                return [i, j]


result = calc(nums, target)

print(result)

print("============================")


def calculated(list_of_numbers, target_int):
    for i in range(len(list_of_numbers)):
        print(i, end=" ")
        print("\nleft\n")

        for j in range(i + 1, len(list_of_numbers)):
            print("Enter")
            print(j, end="-")


calculated(nums, target)
