u1= input("Name 1:")
u2= input("Name 2:")

while True:
    u1_ans= input("User1 response :").lower()
    u2_ans= input("User2 response :").lower()

    if u1_ans==u2_ans:
        print("Match tie !")
    elif u1_ans=='rock':
         if u2_ans=='scissors':
            print("Rock wins!")
         else:
            print("Paper wins!")   

    elif u1_ans=='scissors':
         if u2_ans=='rock':
            print("Rock wins!")
         else:
            print("Scissors wins!") 

    elif u1_ans=='paper':
         if u2_ans=='rock':
            print("Paper wins!")
         else:
            print("Scissors wins!") 

    else :
        print("Invalid Input")
    repeat =input("Do you want to play again  ?").lower()
    if(repeat=='yes'):
        pass
    elif (repeat=='no'):
        raise SystemExit
    else:
        print("Invalid input. Exiting now")
        raise SystemExit




