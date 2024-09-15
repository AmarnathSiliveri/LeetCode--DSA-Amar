class Solution(object):
    def containsDuplicate(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        set_of_numbers=set()
        for number in nums:
            if number in set_of_numbers:
                return True
            else:
                set_of_numbers.add(number)
        return False