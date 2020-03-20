/*
n = 5

        * 
      * * 
    * * * 
  * * * * 
* * * * * 

ToDo:
Step1: Loop Each Row And Column.
Step2: Print * Each Row
Step3: Give Additional Space For Each * with Space For Shape
*/

public class Pattern6 {
    
    public static void main(String[] args) {
       
        int n = 5;
        
        printPattern(n);
        
    }
    
    public static void printPattern(int n)
    {
        for(int i = 1; i <= n; i++)
        {
            int temp = (n-i)*2;
            while(temp >= 1)
                {
                System.out.print(" ");
                temp--;
            }
            for(int j = 1; j <= i; j++)
            {
                
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }
        
    }
    
}