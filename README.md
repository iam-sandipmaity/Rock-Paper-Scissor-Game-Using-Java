# Rock Paper Scissors Game (Java)

## Overview
This is a simple Rock Paper Scissors game implemented in Java. The user plays against the computer, and the game keeps track of the scores to determine the winner.

## Rules
- Rock (0) beats Scissors (2)
- Paper (1) beats Rock (0)
- Scissors (2) beats Paper (1)
- If both the user and computer choose the same option, the match is a tie.

## How to Play
1. Clone the repository:
   ```sh
   git clone https://github.com/sandimaity/Rock-Paper-Scissor-Game-Using-Java.git
   ```
2. Navigate to the project folder:
   ```sh
   cd Rock-Paper-Scissor-Game-Using-Java
   ```
3. Compile the Java file:
   ```sh
   javac Game.java
   ```
4. Run the program:
   ```sh
   java Program.Game
   ```
5. Enter the number of rounds you want to play.
6. Choose your move:
   - Enter `0` for Rock
   - Enter `1` for Paper
   - Enter `2` for Scissors
7. The computer will randomly generate its move, and the winner of each round will be displayed.
8. After all rounds, the final result will be shown.

## Features
- Allows the user to select the number of rounds.
- Generates a random move for the computer.
- Displays both the user and computer choices for each round.
- Keeps track of scores and declares the final winner.

## Example Gameplay
```
How Many Time You Want To Play The Game? : 3

Enter 0 for Rock, 1 for Paper, 2 for Scissor : 1
Computer Choice is Rock
User Choice is Paper
You Win🏆🥇

Enter 0 for Rock, 1 for Paper, 2 for Scissor : 2
Computer Choice is Scissor
User Choice is Scissor
Match tie🎁⛔

Enter 0 for Rock, 1 for Paper, 2 for Scissor : 0
Computer Choice is Paper
User Choice is Rock
You Lose😭

You won 1 time & Computer won 1 time.
You Draw the Challenge!
Game Drawn!
```

## Dependencies
- Java Development Kit (JDK) installed
- A Java-supported terminal

## License
This project is open-source and free to use.

## Author
[Sandi Maity](https://github.com/sandimaity)

