import java.util.Scanner;
public class Fibonacci1{
    static int fib(int n)
    {
        if(n==0){
            return 0;
        }
        if(n==1||n==2){
            return 1;
        }
        return (fib(n-1) + fib(n-2));
    }
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("Fibonacci series of "+n+" numbers is:");
        for(int i=0; i<n; i++){
            System.out.print(fib(i)+" ");
        }
    }
}  
