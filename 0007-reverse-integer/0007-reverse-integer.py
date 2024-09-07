class Solution(object):
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        res=0
        if x<0:
            res=int(str(x)[1:][::-1])* -1
        else:
            res=int(str(x)[::-1])
        INT_MAX = 2**31 - 1
        INT_MIN = -2**31

       
        if res > INT_MAX or res < INT_MIN:
            return 0

        return res


      
        
        