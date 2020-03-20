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


public class Main {
    
    public static void main(String[] args) {
       
        int n = 7;
        
        printPattern(n);
    }
    
    public static void printPattern(int n)
					{
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }    
}
