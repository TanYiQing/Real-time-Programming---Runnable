import java.util.Scanner;

public class MyRunnable{
    public static void main (String[]args){
        int x = 0,y=0;
        Scanner scan=new Scanner(System.in);
        System.out.print("Please input x:");
        x=scan.nextInt();
        System.out.print("Please input y:");
        y=scan.nextInt();

        Runnable printodd =new PrintOdd(x,y);
        Runnable printeven=new PrintEven(x,y);

        Thread t1=new Thread(printeven);
        Thread t2=new Thread(printodd);
        t1.start();
        t2.start();
    }
}


class PrintOdd implements Runnable{
    int a,b;
    public PrintOdd(int a,int b){
        this.a=a;
        this.b=b;
    }

    public void run(){
        for(int i=a;i<=b;i++) {
            if(i%2!=0) {
                System.out.println(i);
            }
        }
    }
}

class PrintEven implements Runnable{
    int a,b;
    public PrintEven(int a,int b){
        this.a=a;
        this.b=b;
    }

    public void run(){
        for(int i=a;i<=b;i++) {
            if(i%2==0){
                System.out.println(i);
            }

        }
    }
}
