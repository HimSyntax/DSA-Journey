                                      // !  D-S-A  ! //


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
//         if(n==0 || n==1){
//             return 1;
//         } else {
//             return n * Factorial(n-1);
//         }
//     }
//     public static void main(String[] args) {
//         int n = 0;
//         System.out.println(Factorial(n));
//     }
// }


// Reverse an Array //

// class Striver {
//     public static void reverse(int [] arr, int left, int right){
//         if(left>=right){
//             return;
//         }
//         int temp = arr[left];
//         arr[left] = arr[right];
//         arr[right] = temp;
 
//         reverse (arr, left+1, right-1);
//     }
//     public static void main(String[] args) {
//         int [] arr = {1,2,3,4,5};
//         reverse(arr, 0, arr.length-1);

//         for( int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }



//! BASIC HASHING !//


// Basic Hashing //

// class Striver{
//     public static void main(String[] args) {
//         int [] arr = {1,2,1,3,2};
//         int number = 3;
//         int count = 0;

//         for(int i=0; i<arr.length; i++){
//             if(arr[i]==number){
//                 count++; 
//             }
//         }
//         System.out.println(count);
//     }
// }

//! SORTING !//

// Insertion Sort //

// import java.util.Arrays;
// class Striver {
//     public static void main(String[] args) {
//         int [] nums = { 14,9,15,12,6,8,13 };

//         for(int i=0; i<=nums.length-1; i++){
//             int j=i;
//             while(j>0 && nums[j-1]>nums[j]){
//                 int temp = nums[j];
//                 nums[j] = nums[j-1];
//                 nums[j-1] = temp;
//                 j--;
//             }
//         }
//         System.out.println(Arrays.toString(nums));
//         }
//     }


// Merge Sort //

// class Striver {

//     public static void mergeSort(int[] arr, int low, int high){

//         if(low>=high){
//             return;
//         }
//         int mid = (high+low)/2;

//         mergeSort(arr, low, mid);
//         mergeSort(arr,mid+1,high);
//         merge(arr, low, mid, high);

//     }

//     public static void merge(int[]arr, int low, int mid, int high){
        
//         int[]temp = new int[arr.length];
//         int left = low;
//         int right = mid+1;
//         int k = 0;

//         while(left<=mid && right<=high){
//             if(arr[left]<=arr[right]){
//                 temp[k++]=arr[left];
//                 left++;
//             }
//             else{
//                 temp[k++]=(arr[right]);
//                 right++;
//             }
//         }

//         while(left<=mid){
//             temp[k++]=(arr[left]);
//             left++;
//         }
//         while(right<=high){
//             temp[k++]=(arr[right]);
//             right++;
//         }

//         for(int i=low; i<=high; i++){
//             arr[i] = temp[i-low];
//         }
//         }

//     public static void main(String[] args) {
//         int[]arr = {3,2,4,1,3};
//         mergeSort(arr,0, arr.length-1);
//         for(int num : arr){
//             System.out.println(num+" ");
//         }
//     }
// }


//! ARRAYS !//

// Largest Element // 

// class Striver {
//     public static void main(String[] args) {
//         int[]arr = {3,2,1,5,2};
//         int largest = arr[0];

//         for(int i=0; i<arr.length; i++){
//             if(arr[i]>largest){
//                 largest = arr[i];
//             }
//         }
//         System.out.println(largest);
//     }
// }


// Second Largest Element //

// class Striver{
//     public static void main(String[] args) {
//         int[]arr = {1,2,4,7,7,5};
//         int largest = arr[0];
//         int sLargest = arr[0];
        
//         for(int i=0; i<arr.length; i++){
//             if(arr[i]>largest){
//                 largest = arr[i];
//             }
//         }
        
//         for(int i=0; i<arr.length; i++){
//             if(arr[i]>sLargest && arr[i]!=largest){
//                 sLargest = arr[i];
//             }
//         }
//         System.out.println(sLargest);
//     }
// }


// Check If The Array Is Sorted II //

// class Striver {
//     public static void main(String[] args) {

//         int[] arr = {1, 2, 2, 3, 3, 4};
//         boolean sorted = true;

//         for (int i = 1; i < arr.length; i++) {

//             if (arr[i] < arr[i - 1]) {
//                 sorted = false;
//                 break;
//             }
//         }

//         System.out.println(sorted);
//     }
// }


// Remove Duplicates from sorted Array //

// class Striver {
//     public static void main(String[] args) {
//         int[]arr = {1,1,2,2,2,3,3};

//         int i = 0;
//         for(int j=1; j<arr.length; j++){
//             if(arr[i]!=arr[j]){
//                 arr[i+1] = arr[j];
//                 i++;
//             }
//         }
//         for(int k=0; k<=i; k++){
//             System.out.println(arr[k]);
//         }
//     }
// }


// Left Rotate the Array by One Place //

// class Striver{
//     public static void main(String[] args) {
//         int[]arr = {1,2,3,4,5};
//         int temp = arr[0];

//         for(int i=1; i<arr.length; i++){
//             arr[i-1] = arr[i];
//         }
//         arr[arr.length-1] = temp;
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }


// Left Rotate Array By K Place //

// class Striver {
    
//     public static void reverseArray(int[]nums, int start, int end){
//         while (start<end) { 
//             int temp = nums[start];
//             nums[start] = nums[end];
//             nums[end] = temp;
//             start++;
//             end--;
//         }
//     }

//     public static int[] rotateArray(int[]nums, int k, String direction){
//         int n = nums.length;
//         if(n==0 || k==0){
//             return nums;
//         }
//         k = k%n;
//         if(direction.equals("Left")){
//             reverseArray(nums, 0, k-1);
//             reverseArray(nums,  k, n-1);
//             reverseArray(nums, 0, n-1);
//         }
//         return nums;

//     }

//     public static void main(String[] args) {
//         int[]nums = {1,2,3,4,5,6,7};
//         int k =3;
//         String direction = "Left";

//         int[]result = rotateArray(nums, k, direction);

//         for(int num : result){
//             System.out.print(num + " ");
//         }

//     }
// }


// Move Zeroes To End //

// class Striver{
//     public static void main(String[] args) {
//          int[]arr = {1,0,2,3,2,0,0,4,5,1};

//          int[]temp = new int[arr.length];
//          int j = 0;

//          for(int i=0; i<arr.length; i++){
//             if(arr[i]!=0){
//             temp[j] = arr[i];
//             j++;
//          }
//         }
//         for(int i=0; i<j; i++){
//             System.out.print(temp[i] + " ");
//         }
//     }
// }


// Linear Search //

// class Striver{
//     public static void main(String[] args) {

//         int[]arr = {6,7,8,4,1};
//         int nums = 4;
//         for(int i=0; i<arr.length; i++){
//             if(arr[i]==nums){
//                 System.out.println(i);
//             }
//         }
//     }
// }


// Union of two Sorted Array //

// import java.util.*;
// class Striver{
//     public static void main(String[] args) {

//         int[]arr1 = {1,1,2,3,4,5};
//         int[]arr2 = {2,3,4,5};
        
//         Set<Integer>st = new HashSet<>();
//         for(int i=0; i<arr1.length; i++){
//             st.add(arr1[i]);
//         }
//         for(int i=0; i<arr2.length; i++){
//             st.add(arr2[i]);
//         }

//         int [] Union = new int[st.size()];
//         int i = 0;

//         for(int it : st){
//             Union[i++] = it;
//         }

//         System.out.println(Arrays.toString(Union));
//     }
// }


// Find Missing Number //

// class Striver{
//     public static void main(String[] args) {

//         int[]arr = {0,1,2,4,1,5};
//         int n = arr.length;

//         for(int i=0; i<=n; i++){
//             int flag = 0;
//             for(int j=0; j<n; j++){
//                 if(arr[j]==i){
//                     flag = 1;
//                     break;
//                 }
//             }
//             if(flag==0){
//                 System.out.println(i);
//             }
//         }

//     }
// }


// !Optimal Solution! //

// class Striver {
    
//     public static void main(String[] args) {
    
//         int[]arr = {1,2,3,5};
//         int n = arr.length+1;
//         int xor = 0;

//         for(int i=0; i<=n; i++){
//             xor = xor^i;
//         }
//         for(int i=0; i<arr.length; i++){
//             xor = xor^arr[i];
//         }

//         System.out.println(xor);
//     }
// }


// Maximum Consecutives Ones //

// class Striver {
//     public static void main(String[] args) {
        
//         int[]arr = {1,1,0,0,1,1,1,0,1,1,1,1};
//         int max = 0;
//         int cnt = 0;
        
//         for(int i=0; i<arr.length; i++){
//             if(arr[i]==1){
//                 cnt++;

//                 max = Math.max(max,cnt);
//             }
//             else {
//                 cnt = 0;
//             }
//         }
//         System.out.println(max);
//         }
// }
