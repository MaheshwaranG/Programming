def countingValleys(n, steps):
    valleyCount, stepBal = 0, 0
    for char in steps:
        if char == 'D' and stepBal == 0:
            # ++ and -- operator will not works on python
            valleyCount += 1 
        if char == 'U':
            stepBal +=1
        elif char == 'D':
            stepBal -=1    
    return valleyCount
    
if __name__ == "__main__":
    n = int(input())
    steps = input();
    print(countingValleys(n, steps))


