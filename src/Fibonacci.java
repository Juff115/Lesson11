import hsa.*;
public class Fibonacci {

    public static void main(String[] args) {
        int fib, ans;
        Console c= new Console();
        while (true){
        c.print("Enter the fibonacci number you want the answer to that is between 1-15: ");
        fib=c.readInt();
        if(fib>0 && fib<=15)break;
        }
        ans=fibonacci(fib);
        c.println("The answer is "+ ans);
        
        
    }
    static int fibonacci(int n){
        if(n <=2) return 1;
        else return fibonacci(n-1) + fibonacci(n-2);
    }
}
