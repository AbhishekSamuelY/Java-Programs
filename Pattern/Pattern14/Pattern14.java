/*
n = 5

*********
 *     *
  *   *
   * *
    *
    
ToDo:
Step1: Loop Each Row And Column.
Step2: Print * Each Row
*/


public class Pattern14 {
    
    public static void main(String[] args) {
       
        int n = 5;
        printPattern(n);
        
    }
    
    public static void printPattern(int n)
    {
        for(int k = 1; k <= 11; k++)
                {
            System.out.print("*");
            }
        System.out.println();
        for(int i = n; i >= 1; i--)
            {
            int temp = n-i+1;
            while(temp >= 1)
                {
                System.out.print(" ");
                temp--;
            }
            for(int j = i; j >= 1; j--)
                {
                						if((j == 1) || (j == i))
                    {
                    System.out.print("*");
                }
               
                 else {
                    System.out.print(" ");
                }
                    System.out.print(" ");
            }
            System.out.println();
        }
         
    }
    
}