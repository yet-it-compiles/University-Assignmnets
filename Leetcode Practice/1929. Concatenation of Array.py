class Solution:
    def getConcatenation(self, nums):
        """
        Since the list passed already contains the first set of numbers, we should append to the back
        :type nums: List[int]
        :rtype: List[int]
        """
        for each_element in range(0, len(nums)):
            nums.append(nums[each_element])
        return nums





number_list = [1, 3, 2, 1]
target_number = 9

result = Solution().getConcatenation(number_list)
