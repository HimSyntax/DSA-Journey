                        // ! STRIVER A.2.Z DSA ! //


//! BASIC MATHS !//


// Count Digits //

// class Striver{
//     public static void main(String[] args) {
//         int num = 1234;
//         int count = 0;

//         while(num!=0){
//             count++;
//             num = num / 10;
//         }
//         System.out.println("Total Digits = " + count);
//     }
// }

// Reverse a Number //

// class Striver{
//     public static void main(String[] args) {
//          int num = 12345;
//          int reverse = 0;
//           while(num!=0){
//             int digit = num % 10;
//             reverse = reverse * 10 + digit;
//             num = num/10;
//           }
//           System.out.println("Reversed Number = " + reverse);
//     }
// }

// Check Palindrome //

// import java.util.Scanner;
// class Striver{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
        
//     int revNum = 0;
//     int dup = n;

//     while(n>0){
//         int digit = n%10;
//         revNum = (revNum*10) + digit;
//         n = n/10;
//     }
//     if(dup==revNum){
//         System.out.println("Palindrome");
//     } else {
//         System.out.println("Not palindrome");
//     }
//     }
// }

// Armstrong Number //

// import java.util.Scanner;
// class Striver{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter Number");
//         int n = sc.nextInt();

//         int original = n;
//         int sum = 0;

//         while(n>0){
//             int digit = n%10;
//             sum = sum+(digit*digit*digit);
//             n = n/10;
//         }
//         if(sum==original){
//             System.out.println("Armstrong number");
//         } else {
//             System.out.println("Not Armstrong number");
//         }
//         }
//     }

// Print all divisors //

// import java.util.Scanner;
// class Striver{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         for(int i=1; i<=n; i++){
//             if(n % i == 0){
//                 System.out.println(i);
//             } 
//         }
//         System.out.println();
//     }
// }

// GCD or HCF //

// import java.util.Scanner;
// class Striver{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter number");
//         int a = sc.nextInt();

//         System.out.println("Enter number");
//         int b = sc.nextInt();

//         int gcd =1;

//         for (int i = 1; i <= a && i <= b; i++) {
//             if (a % i == 0 && b % i == 0) {
//                 gcd = i;
//             }
//     }
//     System.out.println("GCD = " + gcd);
// }
// }



//! BASIC RECURSION !//


// Print name N times using recursion //

// class Striver{
//     public static void printName(int n){
//         if(n==0){
//             return;
//         }
//         System.out.println("Himanshu");
//         printName(n-1);

//     }
//     public static void main(String[] args) {
//         int n = 10;
//         printName(n);
//     }
// }

	
// Sum of First N Numbers //

// import java.util.*;
// class Striver{

//     public static void printN(int n, int sum){
//         if(n<1){
//             System.out.println(sum);
//             return;
//         }
//         printN(n-1, sum +n);
//     }
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter n : ");

//         int N = sc.nextInt();

//         printN(N,0);
//     }
// }


// Factorial of a given number //

// class Striver{
//     public static int Factorial(int n){
//         if(n==1){
//             return 1;
//         } else {
//             return n * Factorial(n-1);
//         }
//     }
//     public static void main(String[] args) {
//         int n = 6;
//         System.out.println(Factorial(n));
//     }
// }
