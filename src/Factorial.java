import hsa.*;
public class Factorial {

    public static void main(String[] args) {
        int fac, ans;
        Console c= new Console();
        while (true){
        c.print("Enter the factorial you want the answer to that is between 1-15: ");
        fac=c.readInt();
        if(fac>0 && fac<=15)break;
        }
        ans = factorial(fac);
        c.println("The answer is: " +ans);
        
    }
    static int factorial(int n){
            if(n==1) return 1;
            else return n* factorial(n-1);
    }
    
}
