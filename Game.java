package Program;

import java.util.Random;
import java.util.Scanner;

//        rock = 0
//        paper = 1
//        scissor = 2

public class Game {
    static int computerInput,userInput;
    public static void computerChose(){
        if (computerInput == 0){
            System.out.println("Computer Choice is Rock");
        }
        else if (computerInput == 1){
            System.out.println("Computer Choice is paper");
        }
        else if (computerInput == 2){
            System.out.println("Computer Choice is scissor");
        }
    }
    public static void userChose(){
        if (userInput == 0){
            System.out.println("User Choice is Rock");
        }
        else if (userInput == 1){
            System.out.println("User Choice is paper");
        }
        else if (userInput == 2){
            System.out.println("User Choice is scissor");
        }
    }
    public static void getChoice(){
        System.out.println();
        computerChose();
        userChose();
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("How Many Time You Want To Play The Game? : ");
        int n = sc.nextInt(21);
        int countUser = 0, countComputer =0;
        for (int i = 0; i < n; i++){
            System.out.println();
            System.out.print("Enter 0 for Rock, 1 for Paper, 2 for Scissor : ");
            userInput = sc.nextInt(3);

            Random rnd = new Random();
            computerInput = rnd.nextInt(3);


            if(userInput == computerInput){
                getChoice();
                System.out.println("Match tie🎁⛔");
            }
            else if((userInput == 0 && computerInput == 2)||(userInput == 1 && computerInput == 0)||(userInput == 2 && computerInput == 1)){
                getChoice();
                System.out.println("You Win🏆🥇");
                countUser++;
            }
            else {
                getChoice();
                System.out.println("You Lose😭");
                countComputer++;
            }
        }

        System.out.println("\n\n");

        if(countUser > countComputer){
            System.out.format("You won %d time & Computer won %d time.\nYou win the Challenge!",countUser,countComputer);
        }
        else if(countUser < countComputer){
            System.out.format("You won %d time & Computer won %d time.\nYou Lose the Challenge!",countUser,countComputer);
            System.out.println("You Lose!");
        }
        else {
            System.out.format("You won %d time & Computer won %d time.\nYou Drawn the Challenge!",countUser,countComputer);
            System.out.println("Game Drawn!");
        }
    }
}
