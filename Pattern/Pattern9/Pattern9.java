/*
n = 5

* 
* * 
* * * 
* * * * 
* * * * * 
* * * * 
* * * 
* * 
* 

ToDo:
Step1: Loop Each Row And Column.
Step2: Print * Each Row
Step3: Divide The Diamond To 2 Half Triangles
       A) Print Top Triangle
       B) Print Bottom Triangle
*/


public class Pattern9 {
    
    public static void main(String[] args) {
       
        int n = 5;
        
        printPattern(n);
        
    }
    
    public static void printPattern(int n)
    {
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i = n-1; i >= 1; i--)
        {
            for(int j = i; j >= 1; j--)
            {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }
        
    }
    
}