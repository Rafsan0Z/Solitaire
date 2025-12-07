# Solitaire
A web app version of the game Solitaire

This branch is SOLEY dedicated to creating an algorithm that ensures all generated games will be solvable

Here lies the crucial idea:

We can start with a solved state and then work backwords to create a game, making sure to "unwind" in a correct way

Some amount of cards should be left after all the table cards are filled, which will be shuffled into the starting hand

Ideas on how to backtrack from a solved state

Have 4 stacks of interchanging color cards from Ace to King, and then start placing down the cards with the remaining slots (We have to be careful to not generate the same pile of games)

Lets assume we have 4 occupied stacks and then 4 empty stacks. We can pick at random any of the 4 stacks at random and put it, at random, in one of the empty stacks. 

Inevitably the other 4 stacks will be filled enough, will the originally filled 4 stacks still having some cards left. 

At this point, make those 4 stacks empty, and take the sort the remaining cards into those empty stacks in a similar way the first set of empty stacks were filled

After those 4 stacks are filled to a satisfactory limit, the remaining cards will be shuffled and form the initial hand

This will produce games with random difficulty 

