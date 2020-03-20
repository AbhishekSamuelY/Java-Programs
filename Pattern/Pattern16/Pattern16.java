/*
n = 5

1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5
    
ToDo:
Step1: Loop Each Row And Column.
Step2: Print * Each Row
*/

public class Pattern16 {
    
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
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}