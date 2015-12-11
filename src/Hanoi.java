import hsa.*;
public class Hanoi {
    static int nummoves=0;
    static Console c= new Console();
    
    public static void main(String[] args) {
    int rings;
    while (true){
        c.print("Enter amount of rings between 3-10, to see how many moves it will take: ");
        rings=c.readInt();
        if(rings>2 && rings<=10)break;
        }
    move(rings,1,3,2);
    c.println("Total moves = "+nummoves);
    }
    
    public static void move(int n, int i, int j, int k){
        if (n>0){
            nummoves++;
            move(n-1,i,k,j);
            c.println("Move ring "+n+" from peg "+i+" to peg "+j);
            move(n-1,k,j,i);
        }
    }
    
}
