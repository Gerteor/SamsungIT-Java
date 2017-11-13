package Recursion;

import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {


        System.out.println(Factorial(6));
        System.out.println(Fibonachi(9));
        System.out.println(gcd(212141241,43252352));
        Show();
    }

    static int Factorial(int number){
        if (number == 1 || number == 0) return 1;
        if (number == 2) return 2;
        return Factorial(number - 1 ) * number;
    }

    static int Fibonachi(int number){
        if(number == 0) return 0;
        if (number == 1) return 1;
        return Fibonachi(number - 1) + Fibonachi(number - 2);
    }

    static int gcd(int a, int b){
        if(a == 0) return b;
        if(b == 0) return a;
        if(a > b) return gcd(a % b, b);
        else return gcd(a, b % a);
    }

    static void Show(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n == 0) return;
        Show();
        System.out.print(n + " ");
    }
}
