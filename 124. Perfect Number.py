class Solution:
    def checkPerfectNumber(self, num: int) -> bool:
        factors = []
        if num <= 0:
            return False
        for i in range(1, int(math.ceil(num**0.5))):
            if num%i == 0:
                factors.append(i)
                factors.append(num/i)
        
        sum = 0
        if factors:
            sum = reduce(lambda x, y:x+y, factors)-num
        return sum == num