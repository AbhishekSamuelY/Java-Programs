/*
n = 5

* * * * * 
* * * * 
* * * 
* * 
* 

ToDo:
Step1: Loop Each Row And Column.
Step2: Print * Each Row
*/

public class Main {
    
    public static void main(String[] args) {
       
        int n = 5;
        
        printPattern(n);
        
    }
    
    public static void printPattern(int n)
    {
        for(int i = n; i >= 1; i--)
        {
            for(int j = i; j >= 1; j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    
}