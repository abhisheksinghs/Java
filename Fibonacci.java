/**b)	The Fibonacci values in the sequence are 1 and 1. Every subsequent value is the sum of the two values preceding it. Write a java program that uses both recursive and non-recursive functions to print the nth value in the fibbonacci sequence.
Program:*/
import java.lang.*;
import java.util.*;
class Fibonacci
  {
    public static void main(String args[])
    {
      int a=0,b=1,c;
      System.out.print("Enter n value");
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int i=0;
      System.out.println("Fibonacci series for n is");
      System.out.print(a+" "+b+" ");
      while(i<=n)
        {
          c=a+b;
          a=b;
          b=c;
          System.out.print(c+" ");
          i++;
        }
    }
  }
