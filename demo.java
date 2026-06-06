/* JAVA DSA */

// import java.util.*;
// class demo{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int rows = sc.nextInt();
//         int cols = sc.nextInt();

//         int [][] nums = new int[rows][cols];

//         //input
//         //rows
//         for(int i=0;i<rows;i++){
//             //cols
//             for(int j=0;j<cols;j++){
//                 nums[i][j] = sc.nextInt();
//             }
//         }

//         // output

//         for(int i=0;i<rows;i++){
//             for(int j=0;j<cols;j++){
//                 System.out.println(nums[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// // Question


// import java.util.*;
// class demo{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int rows = sc.nextInt();
//         int cols = sc.nextInt();

//         int [][] nums = new int[rows][cols];

//         //input
//         //rows
//         for(int i=0;i<rows;i++){
//             //cols
//             for(int j=0;j<cols;j++){
//                 nums[i][j] = sc.nextInt();
//             }
//         }
//         int x = sc.nextInt();
//         for(int i=0; i<rows; i++){
//             for(int j=0; j<cols; j++){
//                 //compare with x
//                 if(nums[i][j]==x){
//                     System.out.println("x found at location (" + i +", "+ j + ")");
//                 }
//             }
//         }
//     }
// }

/* STRINGS */
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         String firstName = sc.next();
//         String lastName = sc.next();
//         String fullName = firstName + " " + lastName; 
//         System.out.println("Your full name is : " + fullName);
//     }
// }

// COMPARE

// import java.util.Scanner;

// public class demo{
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         String name1 = sc.next();
//         String name2 = sc.next();

//          // Case 1 - s1>s2 : +ve value
//          // Case 2 - s1==s2 : 0
//          // Case 3 - s1<s2 : -ve value
        
//         if(name1.compareTo(name2)==0){
//             System.out.println("String is equal");}
//             else{
//                 System.out.println("String is not equal");
//             }
//         }
//     }



// SubString
// class demo {
//     public static void main(String[] args) {

//         String sentence = "My name is Tony";
//         String name = sentence.substring(11); // break string
//         System.out.println(name);
//     }
// }


/* STRING BUILDER */



// class demo{
//     public static void main(String[] args) {
//         StringBuilder sb = new StringBuilder("Tony");
//         System.out.println(sb);

//         // char at index 0

//         System.out.println(sb.charAt(0));

//         // set char at index 0

//         sb.setCharAt(0,'P');
//         System.out.println(sb);
//     }
// }


// Insert String

// class demo{
//     public static void main(String[] args) {
//         StringBuilder sb = new StringBuilder("Tony");
//         System.out.println(sb);

//         sb.insert(0,'S');
//         System.out.println(sb);

//         // to delete 

//         sb.delete(0,1);
//         System.out.println(sb);
//     }
// }


// To Append

// class demo{
//     public static void main(String[] args) {
//         StringBuilder sb = new StringBuilder("h");
//         sb.append("e");
//         sb.append("l");
//         sb.append("l");
//         sb.append("o");
//         System.out.println(sb);


//     }
// }


// To reverse string

// class demo {
//     public static void main(String[] args) {
//         StringBuilder sb = new StringBuilder("hello");

//         for(int i=0; i<sb.length()/2; i++){
//             int front = i;
//             int back = sb.length()-1-i; // 5-1-0 -> 4
           
//             char frontChar = sb.charAt(front);
//             char backChar = sb.charAt(back);

//             sb.setCharAt(front,backChar);
//             sb.setCharAt(back,frontChar);

//             System.out.println(sb);

//         }
//     }
// }



/* BIT MANIPULATION */

//AND//

// class demo{
//     public static void main(String[] args) {
//         int n = 5; //0101
//         int pos = 2; // position of bit
//         int bitMask = 1<<pos;

//         if((bitMask& n)==0){
//             System.out.println("bit was zero");
//         }
//         else{
//             System.out.println("bit was one");
//         }    }
// }


//SET BIT//

// class demo{
//     public static void main(String[] args) {
//         int n = 5;
//         int pos = 1;
//         int bitMask = 1<<pos;

//         int newNumber = bitMask | n;
//         System.out.println(newNumber);
//     }
// }



//CLEAR BIT//

// class demo{
//     public static void main(String[] args) {
//         int n = 5;
//         int pos = 2;
//         int bitMask = 1<<pos;
//         int notBitMask = ~(bitMask);

//         int newNumber = notBitMask & n;
//         System.out.println(newNumber);
//     }
// }



//UPDATE BIT//

// import java.util.Scanner;

// class demo{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int oper = sc.nextInt();
//         //oper=1 ; set oper=0; clear
//         int n = 5; //0101
//         int pos = 1;

//         int bitMask = 1<<pos;

//         if(oper==1){ //update bit 1 else update to 0

//         // set operation
//         int newNumber = bitMask | n;
//         System.out.println(newNumber);
//         } else{
//             // clear
//             int newBitMask = ~(bitMask);
//             int newNumber = newBitMask & n;
//             System.out.println(newNumber);
//         }
//     }
// }


/* SORTING */

// BUBBLE SORT //

// class demo{
//     public static void printArray(int arr[]) {
//         for( int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
//     public static void main(String[] args) {
//         int arr[] = {7,8,3,1,2};

//         //Time complexity = O(n^2)
//         //bubblesort
//         for(int i=0; i<arr.length-1; i++){
//           for(int j=0; j<arr.length-i-1; j++){
//             if(arr[j]>arr[j+1]){
//                 //swap
//                 int temp = arr[j];
//                 arr[j] = arr[j+1];
//                 arr[j+1] = temp;
//             }
//           }  
//         } 
//         printArray(arr);
//     }
// }


// SELECTION SORT //

// class demo{

//     public static void printArray(int arr[]){
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
//     public static void main(String[] args) {
//         int arr[] = {7,8,3,1,2};
        
//         //Time complexity =n O(n^2)
//         //SelectionSort

//         for(int i=0; i<arr.length-1; i++){
//             int smallest = i;
//             for(int j=i+1; j<arr.length; j++){
//                 if(arr[smallest]>arr[j]){
//                     smallest = j;
//                 }
//             }
//             int temp = arr[smallest];
//             arr[smallest] = arr[i];
//             arr[i] = temp;
//         }
//         printArray(arr);
//     }
// }


// INSERTION SORT //

// class demo{

//     public static void printArray(int arr[]){
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
//     public static void main(String[] args) {
//         int arr[] = {7,8,3,1,2};

//         // InsertionSort //
//         for(int i=1; i<arr.length; i++){
//             int current =arr[i];
//             int j = i-1;
//             while(j>=0 && current<arr[j]){
//                 arr[j+1] = arr[j];
//                 j--;
//             }

//             //placement
//             arr[j+1] = current;
//         }
//         printArray(arr);
//     }
// }



/* RECURSION */

// A function that calls itself
// f(x) = x^2 - given
// f(f(x)) = f(x^2)



// print nums from 5-1
// class demo{

//     public static void printNumb(int n){
//         if(n==0){
//             return;
//         }
//         System.out.println(n);
//         printNumb(n-1);
//     }
//     public static void main(String[] args) {
//         int n = 5;
//         printNumb(n); // n=5
//     }
// }



//print nums from 1-5
// class demo{

//     public static void printNumb(int n){
//         if(n==6 ){
//             return;
//         }
//         System.out.println(n);
//         printNumb(n+1);
//     }
//     public static void main(String[] args) {
//         int n=1;
//         printNumb(n); //n=1
//     }
// }



//Print sum of all n natural nums
// class demo{
//     public static void printSum(int i, int n, int sum){
//         if(n==i){
//             sum+=i;
//             System.out.println(sum);
//             return;
//         }
//         sum+=i;
//         printSum(i+1, n, sum);
//     }

//     public static void main(String[] args) {
//         printSum(1, 5, 0);
//     }
// }




//Print factorial of n num
// class demo{
//     public static int calcfactorial(int n){
//         if(n==1 || n==0){
//             return 1;
//         }
//         int fact_nm1 = calcfactorial(n-1);
//         int fact_n = n * fact_nm1;
//         return fact_n;
//     }

//     public static void main(String[] args) {
//         int n=5;
//         int ans = calcfactorial(n);
//         System.out.println(ans);
//     }
// }



//Print the fibonacci sequence till n'th term
// class demo{
//     public static void printFib(int a, int b, int n){
//         if(n==0){
//             return;
//         }
//         int c = a+b;
//         System.out.println(c);
//         printFib(b,c,n-1);
//     }
//     public static void main(String[]args){
//         int a = 0 , b = 1;
//         System.out.println(a);
//         System.out.println(b);
//         int n = 7;
//         printFib(a, b, n-2);
//     }
// }
