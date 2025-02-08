package _43_Guess_the_Number_Game;

import java.util.Scanner;
import java.util.Random;
/*
    Create a class Game, which allows a user to  "Guess the Number"
    game once . Game should have the following methods:
    1. constructor to generate a random number
    2. takeUserInput() to take a user input of number
    3. isCorrectNumber() to detect whether the number entered by the user is true
    4. getter and setter for noOfGuesses
    use properties such as noOfGuesses(int), etc. to get this task done!
 */

class Game{
    public int number;
    public int inputNumber;
    public int noOfGuesses = 0;
    public int getNoOfGuesses() {
        return noOfGuesses;
    }
    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }
     Game(){
        Random rand = new Random();  // It is computer random number, which we have to guess
        this.number = rand.nextInt(100);
    }
    void takeUserInput(){
        System.out.println("Guess the number :");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }
    boolean isCorrectNumber(){
        noOfGuesses++;
        if(inputNumber==number){
            System.out.format("Yes you guessed it right , it was %d \n You guessed it in %d attempts ",number ,noOfGuesses);
            return true;
        }
        else if (inputNumber>number) {
            System.out.println(" Think low number  ");
        }
        else if (inputNumber<number) {
            System.out.println("Think High number ");
        }
        return false;
    }
}
public class guess_game {
    public static void main(String[] args) {
        boolean b = false;
        while(!b){
        Game g = new Game();
        g.takeUserInput();
        b = g.isCorrectNumber();
        }
    }
}
