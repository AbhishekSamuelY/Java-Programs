/*
n = 5

 * 
* *
***
* *
* *

ToDo:
Step1: Loop Each Row And Column.
Step2: Print * Each Row
*/


public class Pattern12 {
    
    public static void main(String[] args) {
       
        printPattern();
        
    }
    
    public static void printPattern()
    {
        
        for(int a = 1; a <= 3; a++)
            {
            if (a == 2)
                {
                System.out.print("*");
            }
            else
                {
                System.out.print(" ");
            }
        }
        System.out.println();
        for(int b = 1; b <= 5; b++)
            {
            for(int c = 1; c <= 3; c++)
                {
                if(b == 2)
                    {
                    System.out.print("*");
                }
                else if(c == 2)
                        {
                    System.out.print(" ");
                }
                else 
                    {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    
}