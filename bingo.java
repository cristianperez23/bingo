import java.util.*;
import java.util.Random;
import java.util.Scanner;

public class bingo {


   public static void main(String[] args) {

      int attempts = 0;
      Scanner scan = new Scanner(System.in);


      int bingo_board[] = new int [25];
      Arrays.fill(bingo_board, 0);
      
      for (int i = 0; i < bingo_board.length; i++) {
         if (i == 4 || i == 9 || i == 14 || i == 19) {
            System.out.print(bingo_board[i] + "\n");
         }
         else {
            System.out.print(bingo_board[i]);
         }
       }

      System.out.println();  
      
      
      Random rand = new Random();
      int bound = 25;
      
      System.out.print("You ready to play BINGO? Press 1 for yes or 0 for no: ");
      int x = scan.nextInt();
      
      while (x == 1) {
         int rand_value = rand.nextInt(bound); 
         attempts++;
         System.out.println("The random bingo chip location is " + rand_value);
         if (bingo_board[rand_value] == 1) {
            System.out.println("Space already filled!");
            for (int i = 0; i < bingo_board.length; i++) {
               if (i == 4 || i == 9 || i == 14 || i == 19) {
                  System.out.print(bingo_board[i] + "\n");
               }
               else {
                  System.out.print(bingo_board[i]);
                  }
                }
              }
         else {
            bingo_board[rand_value] = 1;
            for (int i = 0; i < bingo_board.length; i++) {
         if (i == 4 || i == 9 || i == 14 || i == 19) {
            System.out.print(bingo_board[i] + "\n");
         }
         else {
            System.out.print(bingo_board[i]);
         }
       }
     }
     
      boolean bingo = false;
      System.out.println();
      System.out.print("Do you think you have BINGO? Press 1 for yes or 0 for no: ");
      int b = scan.nextInt();
      if (b == 1) {
         if ((bingo_board[0] == 1 && bingo_board[1] == 1 && bingo_board[2] == 1 && bingo_board[3] == 1 && bingo_board[4] == 1) 
         || (bingo_board[5] == 1 && bingo_board[6] == 1 && bingo_board[7] == 1 && bingo_board[8] == 1 && bingo_board[9] == 1) 
         || (bingo_board[10] == 1 && bingo_board[11] == 1 && bingo_board[12] == 1 && bingo_board[13] == 1 && bingo_board[14] == 1) 
         || (bingo_board[15] == 1 && bingo_board[16] == 1 && bingo_board[17] == 1 && bingo_board[18] == 1 && bingo_board[19]== 1) 
         || (bingo_board[20] == 1 && bingo_board[21] == 1 && bingo_board[22] == 1 && bingo_board[23] == 1 && bingo_board[24]== 1)) {
            System.out.println("You got BINGO! -> horizontal");
            System.out.println("Attempts: " + attempts);
            bingo = true;
         }
         if ((bingo_board[0] == 1 && bingo_board[5] == 1 && bingo_board[10] == 1 && bingo_board[15] == 1 && bingo_board[20] == 1) 
         ||(bingo_board[1] == 1 && bingo_board[6] == 1 && bingo_board[11] == 1 && bingo_board[16] == 1 && bingo_board[21] == 1) 
         || (bingo_board[2] == 1 && bingo_board[7] == 1 && bingo_board[12] == 1 && bingo_board[17] == 1 && bingo_board[22] == 1) 
         || (bingo_board[3] == 1 && bingo_board[8] == 1 && bingo_board[13] == 1 && bingo_board[18] == 1 && bingo_board[23] == 1) 
         || (bingo_board[4] == 1 && bingo_board[9] == 1 && bingo_board[14] == 1 && bingo_board[19] == 1 && bingo_board[24] == 1)) {
            System.out.println("You got BINGO! -> vertical");
            System.out.println("Attempts: " + attempts);
            bingo = true;
            
         }
         if ((bingo_board[0] == 1 && bingo_board[6] == 1 && bingo_board[12] == 1 && bingo_board[18] == 1 && bingo_board[24] == 1) 
         || (bingo_board[4] == 1 && bingo_board[8] == 1 && bingo_board[12] == 1 && bingo_board[16] == 1 && bingo_board[20] == 1)){
            System.out.println("You got BINGO! -> diagonal");
            System.out.println("Attempts: " + attempts);
            bingo = true;
         }
         if (bingo != true) {
            System.out.println("Sorry no bingo :( Keep trying!");
         } 
      }
     
     
      System.out.println();
      System.out.print("Press 1 to continue or 0 to exit program: ");
      x = scan.nextInt();
   }
     
     
 }
}