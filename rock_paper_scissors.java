//java program for rock paper scissor game

import java.util.Random;
import java.util.Scanner;
// import java.util.random;
public class rock_paper_scissors {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Random ran= new Random();
        System.out.println("Enter 1--> Rock, 2--> Paper and 3--> Sissors");
        int user =sc.nextInt();
        int randomNum=ran.nextInt(3)+1;

        if(user==1 && randomNum==3 || user==3&& randomNum==2 || user ==2&& randomNum==1){
            System.out.println("You win");
        }
        else if(user==randomNum){
            System.out.println("Draw");

        }
        else if(user==3&& randomNum==1 || user ==1 && randomNum==2|| user==2&& randomNum==3){
            System.out.println("Computer win.");

        }
        else{
            System.out.println("Enter valid input");
        }
        sc.close();
    }
    
}
