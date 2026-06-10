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



/* RECURSION */  // CLASS 1 //

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



//Print x^n (stack height = n)
// class demo{
//     public static int calcPower(int x, int n){
//         if(n==0){ //base case 1
//             return 1;
//         }
//         if(x==0){ //base case 2
//             return 0;
//         }
//         int xPownm1 = calcPower(x, n-1); //kaam
//         int xPown = x * xPownm1;
//         return xPown;
//     }
//     public static void main(String[] args) {
//         int x = 2, n =5;
//         int ans = calcPower(x,n);
//         System.out.println(ans);
//     }
// }



//Print x^n (stack height = logn)
// class demo{
//     public static int calcPower(int x, int n){
//         if(n==0){ //base case 1
//             return 1;
//         }
//         if(x==0){ //base case 2
//             return 0;
//         }

        //if n is even 
//         if(n%2==0){
//             return calcPower(x, n/2) * calcPower(x, n/2);
//         }
//         else{ //n is odd
//             return calcPower(x,n/2) * calcPower(x,n/2)*x;
//         }
//     }
//     public static void main(String[] args) {
//         int x=2, n=5;
//         int ans = calcPower(x,n);
//         System.out.println(ans);
//     }
// }





/* RECURSION */  // CLASS 2 //

// Tower of Hanoi // 

// O(2^n-1)~O(2^n) // 
// T(n) = 2T(n-1)+1 // 
// 2^n-1 T(1)+2^n-2+2^n-3+...
// x=n-1 //

// class demo{
//         public static void towerOfHanoi( int n , String src, String helper , String dest){
//                 if(n==1){
//                         System.out.println("transfer disk" + n + " from " + src + " to " +dest);
//                         return;
//                 }
//                 towerOfHanoi(n-1, src , dest, helper);
//                 System.out.println("transfer disk" + n + " from " + src + " to " + dest);
//                 towerOfHanoi(n-1, helper, src, dest);
//         }
//         public static void main(String[] args) {
//                 int n = 3;
//                 towerOfHanoi(n, "S", "H", "D");
//         }
// }



// Print a string in reverse //
// time complexity = O(n) //
// class demo{
//         public static void printRev(String str, int idx){
//                 if(idx==0){
//                         System.out.println(str.charAt(idx));
//                         return;
//                 }
//                 System.out.println(str.charAt(idx));
//                 printRev(str, idx-1);
//         }
//         public static void main(String[] args) {
//                 String str = "abcd";
//                 printRev(str, str.length()-1);
//         }
// }



// Find the 1st & last occurance of an element in string //
// time complexity = O(n) //
// class demo{
//         public static int first = -1;
//         public static int last = -1;

//         public static void findOccurance( String str, int idx, char element){
//                 if(idx==str.length()){
//                         System.out.println(first);
//                         System.out.println(last);
//                         return;
//                 }
                
//                 char currChar = str.charAt(idx);
//                 if(currChar==element){
//                         if(first == -1){
//                                 first = idx;
//                         } else{
//                                 last = idx;
//                         }
//                 }
//                 findOccurance(str, idx+1, element);
//         }
//         public static void main(String[] args) {
//                 String str = "abaacdaefaah";
//                 findOccurance(str, 0,'a');
//         }
// }



// Check if an array is sorted( strictly increasing) //
// time complexity = O(n) //
// class demo{
//         public static boolean isSorted( int arr[], int idx){
//                 if(idx==arr.length-1){
//                         return true;
//                 }
//                 if(arr[idx] < arr[idx+1]){
//                         //array is sorted till now
//                         return isSorted(arr, idx+1);
//                 } else {
//                         return false;

//                 }
//         }
//         public static void main(String[] args) {
//                 int arr[] = {1,3,4,5};
//                 System.out.println(isSorted(arr, 0));
//         }
// }



// Move all 'x' to the end of the string //
// time complexity = O(2n) which is O(n) //
// class demo{
//         public static void moveAllX( String str, int idx, int count, String newString){
//                 if(idx==str.length()){
//                         for(int i=0; i<count; i++){
//                                 newString += 'x';
//                         }
//                         System.out.println(newString);
//                         return;
//                 }
//                 char currChar = str.charAt(idx);
//                 if(currChar == 'x'){
//                         count++;
//                         moveAllX(str, idx+1, count, newString);
//                 } else {
//                         newString += currChar; // newString = newString + currChar
//                         moveAllX(str, idx+1, count, newString);
//                 }
//         }
//         public static void main(String[] args) {
//                 String str = "axbcxxd";
//                 moveAllX(str, 0, 0, "");
//         }
// }



// Remove duplicates in a string //
// time complexity = O(n) // 
// class demo{
//         public static boolean[] map = new boolean[26];

//         public static void removeDuplicates( String str, int idx, String newString){
//                 if(idx==str.length()){
//                         System.out.println(newString);
//                         return;
//                 }
//                 char currChar = str.charAt(idx);
//                 if(map[currChar - 'a']){
//                         removeDuplicates(str, idx+1, newString);
//                 } else {
//                         newString += currChar;
//                         map[currChar - 'a'] = true;
//                         removeDuplicates(str, idx+1, newString);
//                 }
//         }
//         public static void main(String[] args) {
//                 String str = "abbccda";
//                 removeDuplicates(str, 0, " ");
//         }
// }



// Print all the subsequences of a string //
// time complexity = O(2^n) //
// class demo{
//         public static void subsequences( String str, int idx, String newString){
//                 if(idx==str.length()){
//                         System.out.println(newString);
//                         return;
//                 }
//                 char currChar = str.charAt(idx);

//                 // to be
//                 subsequences(str, idx+1, newString+currChar);

//                 // or not to be
//                 subsequences(str, idx+1, newString);
//         }
//       public static void main(String[] args) {
//         String str = "abc";
//         subsequences(str, 0, "");
//       }  
// }


// SPECIAL VARIATION OF THE ABOVE QUESTION //


// Print all unique subsequences of a string //
// import java.util.HashSet;
// class demo{
//         public static void subsequences(String str, int idx, String newString, HashSet<String>set){
//                 if(idx==str.length()){
//                         if(set.contains(newString)){
//                                 return;
//                         } else {
//                                 System.out.println(newString);
//                                 set.add(newString);                        
//                                 return;
//                         }
//                 }

//                 char currChar = str.charAt(idx);
                
//                 subsequences(str, idx+1, newString+currChar, set);

//                 subsequences(str, idx+1, newString, set);
//         }

//         public static void main(String[] args) {
//                 String str = "aaa";
//                 HashSet<String>set = new HashSet<>();
//                 subsequences(str, 0, "", set);
//         }
// }



// Print keypad combination //
// time complexity = O(4^n) //
// class demo{
//         public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

//         public static void printComb(String str, int idx, String combination){
//                 if(idx==str.length()){
//                         System.out.println(combination);
//                         return;
//                 }
//                 char currChar = str.charAt(idx);
//                 String mapping = keypad[currChar - '0'];

//                 for(int i=0; i<mapping.length(); i++){
//                         printComb(str, idx+1, combination+mapping.charAt(i));
//                 }
//         }
//         public static void main(String[] args) {
//                 String str = "4";
//                 printComb(str, 0, "");
//                 }
// }



/* RECURSION */   // CLASS 3 //
