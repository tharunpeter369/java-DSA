package basic;

import java.util.Scanner;

public class FunctionsAndMethods {
    static int p =9;
    public static void main(String[] args) {

        sum();
        System.out.print("Enterddddd");
        int p =5;
        int i = 10;
//        if(i>v){
//            int v = 60;
//        }
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter num for check prime or not?");
        int primVal = inp.nextInt();
        System.out.println( primeCheck(primVal));

    }

    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number1");
    }

//    check for the prime number

    static boolean primeCheck(int num){
        if(num <= 1){
            return false;
        }
        int itr = 2;
       while (itr * itr <= num){
        if(num % itr == 0){
          return false;
         }
         itr = itr + 1;
       }
       return itr * itr > num;
    }

//    access modifier (we'll look in OOP') return_type name(){
//    return statment;
//}

}