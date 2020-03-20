/*
n = 5

1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15
    
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
        int k = 1;
        for(int i = 1; i <= n; i++)
            {
            for(int j = 1; j <= i; j++)
                {
                System.out.print(k++);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    
}