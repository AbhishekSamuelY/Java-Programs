/*
n = 5

    *
   **
  ***
 ****
*****

ToDo:
Step1: Loop Each Row And Column.
Step2: Print * Each Row
*/


public class Pattern3 {
    
    public static void main(String[] args) {
       
        int n = 5;
        
        printPattern(n);
        
    }
    
    public static void printPattern(int n)
    {
        for(int i = 1; i <= n; i++)
        {
            int temp = n-i;
            while(temp > 0)
                {
                System.out.print(" ");
                temp--;
            }
            for(int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}