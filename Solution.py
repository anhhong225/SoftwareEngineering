###########################################
## Multiples of 3 and 5 below 1000
## Hong Trinh - 438443
###########################################
s = 0
for i in range(0,1000):
  if (i % 3 == 0 or i % 5 == 0):
    s = s + i
print("The multiples of 3 or 5 below 1000: ", s)
    
