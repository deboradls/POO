import java.util.Scanner;

class Fibonacci{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x;
        int n1=0, n2=1, n3=1;
        

        System.out.print("X: ");
        x = scan.nextInt();

        while(n1<x){
            System.out.printf("%d ", n1);

            n3 = n1+n2;
            n1 = n2;
            n2 = n3;
        }

    }
}