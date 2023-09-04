package index;

import java.util.Scanner;

public class Index {

   
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //input
        int year;
        System.out.println("Enter the Year: ");
        year=in.nextInt();
        //check leap year
      if(year % 100==0)
      {
          if(year % 400==0)
          {
              System.out.println("Leap year");
          }
          else{
              System.out.println("It is not a leap year");
          }
      }
      else{
            if(year % 4==0) 
            {
                System.out.println("leap year");   
            }
            else{
                System.out.println("It is not a leap year");
            }
              }

    }
    
}
