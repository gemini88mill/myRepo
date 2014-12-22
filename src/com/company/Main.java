package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("hello world");

        int fibNumOne = 1;
        int fibNumTwo = 1;
        int fib = 1;

        int startingNum = 15;

        for (int x = 0; x < startingNum; ++x){

            System.out.print(fib + " ");

            fib = x;
            fib = fibNumOne + fibNumTwo;
            fibNumOne = fibNumTwo;
            fibNumTwo = fib;

            //System.out.println(fibCalc(fibNumOne, fibNumTwo, fib));

        }


    }

    public static int fibCalc(int first, int second, int fib) {
        //x(n) = x(n-1) + x(n-2)

        fib = first + second;
        first = second;
        second = fib;

        return fib;
    }
}
