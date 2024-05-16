A classic memory game, including a GUI for the user and game logic.
containing:
Card class - representing a card
Contains attributes that represent the value of the card, whether the card is shown or not, whether its pair has already been found or not.
get/set methods.
Game class -  contains a two-dimensional array of Card, a variable that represents the player whose turn it is now, a method that initializes a new game, a method that is responsible for performing a step in the game. A method responsible for checking whether the game is over and declaring a winner.
The activity class - the onCreate method dynamically creates the cards on the board, for each ID card and defines a listener for the click event. The display of the current queue is refined at every step. and handle the click event of the "New Game" button
Have a nice game!
