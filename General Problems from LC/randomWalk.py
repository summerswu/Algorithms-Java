import random

def random_walk(n):
    x = 0
    y = 0
    #initialize the grand 
    for i in range(n):
        step = random.choice(['N','S','E','W'])
        if step == 'N':
            y = y + 1
        elif step == 'S':
            y = y - 1
        elif step =='E':
            x = x + 1
        else:
            x = x - 1
    return (x, y)

for i in range(25):
    walk = random_walk(10)
    print(walk, "Distance", abs(walk[0])+abs(walk[1]) )

def random_walk_2(n):
    x,y = 0, 0
    for i in range(n):
        dx,dy = random.choice([(0,-1),(0,1),(1,0),(-1,0)])
        x+=dx
        y+=dy
    return (x,y)

for i in range(25):
    walk = random_walk(10)
    print(walk, "Distance", abs(walk[0])+abs(walk[1]) )
    

monte_carlo_sample = 10

for i in range(1,31):
    no_transport = 0
    for i in range(monte_carlo_sample):
        walk = random_walk(i)
        distance_FH = abs(walk[0])+abs(walk[1])
        if distance_FH<=4:
            no_transport = no_transport + 1 
    percent_no_transport = float(no_transport / monte_carlo_sample)
    print("The random walk is ",i, "The percent is: ", percent_no_transport)
