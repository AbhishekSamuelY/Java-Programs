/*
n = 5

    *
   * *
  *   *
 *     *
*       *
 *     *
  *   *
   * *
    *
    
ToDo:
Step1: Loop Each Row And Column.
Step2: Print * Each Row
*/


public class Pattern15 {
    
    public static void main(String[] args) {
       
        int n = 5;
        printPattern(n);
        
    }
    
    public static void printPattern(int n)
    {
        for(int i = 1; i <= n; i++)
            {
            int temp = n - i;
            while (temp >= 1)
                {
                System.out.print(" ");
                temp--;
            }
            for(int j = 1; j <= i; j++)
                {
                if((j == 1) || (j== i))
                    {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
                System.out.print(" ");
            }
            System.out.println();
        }
        
        for(int a = n-1; a >= 1; a--)
            {
            int temp = n-a;
            while(temp >= 1)
                {
                System.out.print(" ");
                temp--;
            }
            for(int b = a; b >= 1; b--)
                {
                if((b == 1) || (b == a))
                    {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
         
    }
    
}