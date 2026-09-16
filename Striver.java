

class Striver{
    public static void main(String[] args) {
        int num = 1234;
        int count = 0;

        while(num!=0){
            count++;
            num = num / 10;
        }
        System.out.println("Total Digits = " + count);
    }
}

Reverse a Number //

class Striver{
    public static void main(String[] args) {
         int num = 12345;
         int reverse = 0;
          while(num!=0){
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num/10;
          }
          System.out.println("Reversed Number = " + reverse);
    }
}

Check Palindrome //

import java.util.Scanner;
class Striver{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
    int revNum = 0;
    int dup = n;

    while(n>0){
        int digit = n%10;
        revNum = (revNum*10) + digit;
        n = n/10;
    }
    if(dup==revNum){
        System.out.println("Palindrome");
    } else {
        System.out.println("Not palindrome");
    }
    }
}

Armstrong Number //

import java.util.Scanner;
class Striver{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();

        int original = n;
        int sum = 0;

        while(n>0){
            int digit = n%10;
            sum = sum+(digit*digit*digit);
            n = n/10;
        }
        if(sum==original){
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not Armstrong number");
        }
        }
    }

Print all divisors //

import java.util.Scanner;
class Striver{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            if(n % i == 0){
                System.out.println(i);
            } 
        }
        System.out.println();
    }
}

GCD or HCF //

import java.util.Scanner;
class Striver{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        int a = sc.nextInt();

        System.out.println("Enter number");
        int b = sc.nextInt();

        int gcd =1;

        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
    }
    System.out.println("GCD = " + gcd);
}
}



! BASIC RECURSION !//


Print name N times using recursion //

class Striver{
    public static void printName(int n){
        if(n==0){
            return;
        }
        System.out.println("Himanshu");
        printName(n-1);

    }
    public static void main(String[] args) {
        int n = 10;
        printName(n);
    }
}

	
Sum of First N Numbers //

import java.util.*;
class Striver{

    public static void printN(int n, int sum){
        if(n<1){
            System.out.println(sum);
            return;
        }
        printN(n-1, sum +n);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter n : ");

        int N = sc.nextInt();

        printN(N,0);
    }
}


Factorial of a given number //

class Striver{
    public static int Factorial(int n){
        if(n==0 || n==1){
            return 1;
        } else {
            return n * Factorial(n-1);
        }
    }
    public static void main(String[] args) {
        int n = 0;
        System.out.println(Factorial(n));
    }
}


Reverse an Array //

class Striver {
    public static void reverse(int [] arr, int left, int right){
        if(left>=right){
            return;
        }
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
 
        reverse (arr, left+1, right-1);
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        reverse(arr, 0, arr.length-1);

        for( int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}



! BASIC HASHING !//


Basic Hashing //

class Striver{
    public static void main(String[] args) {
        int [] arr = {1,2,1,3,2};
        int number = 3;
        int count = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]==number){
                count++; 
            }
        }
        System.out.println(count);
    }
}

! SORTING !//

Insertion Sort //

import java.util.Arrays;
class Striver {
    public static void main(String[] args) {
        int []arr = { 14,9,15,12,6,8,13 };

        for(int i=0; i<arr.length-1; i++){
            int j=i;
            while(j>0 &&arr[j-1]arr[j]){
                int temp =arr[j];
               arr[j] =arr[j-1];
               arr[j-1] = temp;
                j--;
            }
        }
        System.out.println(Arrays.toStringarr));
        }
    }


Merge Sort //

class Striver {

    public static void mergeSort(int[] arr, int low, int high){

        if(low>=high){
            return;
        }
        int mid = (high+low)/2;

        mergeSort(arr, low, mid);
        mergeSort(arr,mid+1,high);
        merge(arr, low, mid, high);

    }

    public static void merge(int[]arr, int low, int mid, int high){
        
        int[]temp = new int[arr.length];
        int left = low;
        int right = mid+1;
        int k = 0;

        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp[k++]=arr[left];
                left++;
            }
            else{
                temp[k++]=(arr[right]);
                right++;
            }
        }

        while(left<=mid){
            temp[k++]=(arr[left]);
            left++;
        }
        while(right<=high){
            temp[k++]=(arr[right]);
            right++;
        }

        for(int i=low; i<=high; i++){
            arr[i] = temp[i-low];
        }
        }

    public static void main(String[] args) {
        int[]arr = {3,2,4,1,3};
        mergeSort(arr,0, arr.length-1);
        for(int num : arr){
            System.out.println(num+" ");
        }
    }
}


! ARRAYS !//

Largest Element // 

class Striver {
    public static void main(String[] args) {
        int[]arr = {3,2,1,5,2};
        int largest = arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
}


Second Largest Element //

class Striver{
    public static void main(String[] args) {
        int[]arr = {1,2,4,7,7,5};
        int largest = arr[0];
        int sLargest = arr[0];
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]>sLargest && arr[i]!=largest){
                sLargest = arr[i];
            }
        }
        System.out.println(sLargest);
    }
}


Check If The Array Is Sorted II //

class Striver {
    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 3, 4};
        boolean sorted = true;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < arr[i - 1]) {
                sorted = false;
                break;
            }
        }

        System.out.println(sorted);
    }
}


Remove Duplicates from sorted Array //

class Striver {
    public static void main(String[] args) {
        int[]arr = {1,1,2,2,2,3,3};

        int i = 0;
        for(int j=1; j<arr.length; j++){
            if(arr[i]!=arr[j]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        for(int k=0; k<=i; k++){
            System.out.println(arr[k]);
        }
    }
}


Left Rotate the Array by One Place //

class Striver{
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5};
        int temp = arr[0];

        for(int i=1; i<arr.length; i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}


Left Rotate Array By K Place //

class Striver {
    
    public static void reverseArray(int[arr, int start, int end){
        while (start<end) { 
            int temp =arr[start];
           arr[start] =arr[end];
           arr[end] = temp;
            start++;
            end--;
        }
    }

    public static int[] rotateArray(int[arr, int k, String direction){
        int n =arr.length;
        if(n==0 || k==0){
            returnarr;
        }
        k = k%n;
        if(direction.equals("Left")){
            reverseArrayarr, 0, k-1);
            reverseArrayarr,  k, n-1);
            reverseArrayarr, 0, n-1);
        }
        returnarr;

    }

    public static void main(String[] args) {
        int[arr = {1,2,3,4,5,6,7};
        int k =3;
        String direction = "Left";

        int[]result = rotateArrayarr, k, direction);

        for(int num : result){
            System.out.print(num + " ");
        }

    }
}


Move Zeroes To End //

class Striver{
    public static void main(String[] args) {
         int[]arr = {1,0,2,3,2,0,0,4,5,1};

         int[]temp = new int[arr.length];
         int j = 0;

         for(int i=0; i<arr.length; i++){
            if(arr[i]!=0){
            temp[j] = arr[i];
            j++;
         }
        }
        for(int i=0; i<j; i++){
            System.out.print(temp[i] + " ");
        }
    }
}


Linear Search //

class Striver{
    public static void main(String[] args) {

        int[]arr = {6,7,8,4,1};
        intarr = 4;
        for(int i=0; i<arr.length; i++){
            if(arr[i]=arr){
                System.out.println(i);
            }
        }
    }
}


Union of two Sorted Array //

import java.util.*;
class Striver{
    public static void main(String[] args) {

        int[]arr1 = {1,1,2,3,4,5};
        int[]arr2 = {2,3,4,5};
        
        Set<Integer>st = new HashSet<>();
        for(int i=0; i<arr1.length; i++){
            st.add(arr1[i]);
        }
        for(int i=0; i<arr2.length; i++){
            st.add(arr2[i]);
        }

        int [] Union = new int[st.size()];
        int i = 0;

        for(int it : st){
            Union[i++] = it;
        }

        System.out.println(Arrays.toString(Union));
    }
}


Find Missing Number //

class Striver{
    public static void main(String[] args) {

        int[]arr = {0,1,2,4,1,5};
        int n = arr.length;

        for(int i=0; i<=n; i++){
            int flag = 0;
            for(int j=0; j<n; j++){
                if(arr[j]==i){
                    flag = 1;
                    break;
                }
            }
            if(flag==0){
                System.out.println(i);
            }
        }

    }
}


!Optimal Solution! //

class Striver {
    
    public static void main(String[] args) {
    
        int[]arr = {1,2,3,5};
        int n = arr.length+1;
        int xor = 0;

        for(int i=0; i<=n; i++){
            xor = xor^i;
        }
        for(int i=0; i<arr.length; i++){
            xor = xor^arr[i];
        }

        System.out.println(xor);
    }
}


Maximum Consecutives Ones //

class Striver {
    public static void main(String[] args) {
        
        int[]arr = {1,1,0,0,1,1,1,0,1,1,1,1};
        int max = 0;
        int cnt = 0;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]==1){
                cnt++;

                max = Math.max(max,cnt);
            }
            else {
                cnt = 0;
            }
        }
        System.out.println(max);
        }
}


Find the number that appears once, and other numbers twice //

class Striver {
    public static void main(String[] args) {
         
        int[]arr = {1,1,2,3,3,4,4};
        int xor = 0;

        for(int i=0; i<arr.length; i++){
            xor = xor^arr[i];
        }
        System.out.println(xor);
    }
}


Longest subarray with given sum K(positives) //

class Striver{ // Better //
    public static void main(String[] args) {
        
        int[]arr = {1,2,3,1,1,1,1,4,2,3};
        int len = 0;
        int target = 3;

        for(int i=0; i<arr.length; i++){
            int sum = 0;
            for(int j=i; j<arr.length; j++){
                sum+=arr[j];
                if(sum==target){
                len = Math.max(len,j-i+1);
            }
            }
        }
        System.out.println(len);
    }
}

Optimal //

import java.util.HashMap;
import java.util.Map;

class Striver {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 1, 1, 1, 1, 4, 2, 3};
        int k = 3;

        long sum = 0;
        int maxLen = 0;

        Map<Long, Integer> preSumMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            // If subarray starts from index 0
            if (sum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }

            long rem = sum - k;

            // Check if remaining sum exists
            if (preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            // Store prefix sum
            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        }

        System.out.println(maxLen);
    }
}


Two Sum // 

class Striver {
    public static void main(String[] args) {
        
        int[]arr = {1,2,3,5,4,6,3};
        int target = 7;
        int n = arr.length;

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]+arr[j]==target){
                    System.out.println(arr[i]+ " " + arr[j]);
                }
            }
        }
        System.out.println(target);
    }
}


Sort an array of 0's 1's and 2's //

class Striver {
    public static void main(String[] args) {

        int[] arr = {0,1,2,0,1,2,1,2,0,0,1};
        int cnt0 = 0;
        int cnt1 = 0;
        int cnt2 = 0;

        // Count 0s, 1s and 2s
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                cnt0++;
            }
            else if(arr[i] == 1) {
                cnt1++;
            }
            else {
                cnt2++;
            }
        }
        // Put 0s
        for(int i = 0; i < cnt0; i++) {
            arr[i] = 0;
        }
        // Put 1s
        for(int i = cnt0; i < cnt0 + cnt1; i++) {
            arr[i] = 1;
        }
        // Put 2s
        for(int i = cnt0 + cnt1; i < arr.length; i++) {
            arr[i] = 2;
        }
        // Print array
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}


Majority Elements - 1 // 

class Striver {
    public static void main(String[] args) {
        
        int[]arr = {2,2,3,3,1,2,2};
        int n = arr.length;

        for(int i=0; i<n; i++){
            int cnt = 0;
            for(int j=0; j<n; j++){
                if(arr[j]==arr[i]){
                    cnt++;
                }
            }
            if(cnt>n/2){
                System.out.println(arr[i]);
            }
        }
        System.out.println(-1);
    }
}


Kadane's Algorithm //

class Striver {    // Brute //
    public static void main(String[] args) {
        
        int[]arr = {-2,-3,4,-1,-2,1,5,-3};
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        
        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=i; j<n; j++){
                 sum += arr[j];

                 max = Math.max(sum, max);
            }
        }
        System.out.println(max);
    }
}

class Striver{    // Optimal //
    public static void main(String[]args) {

        int[]arr = {-2,-3,4,-1,-2,1,5,-3};
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i <arr.length; i++) {
            sum +=arr[i];
            max = Math.max(max, sum);

            if (sum < 0) {
                sum = 0;
            }
        }

        System.out.println(max);
    }
}


 Best Time to Buy and Sell Stock // 

class Striver{
    public static void main(String[] args) {
         
        int [] prices = {7,1,5,3,6,4};
        int maxProfit = 0;
        int bestBuy = prices[0];
        for(int i=1; i<prices.length; i++){
            if( prices[i]>bestBuy){
                maxProfit = Math.max(maxProfit, prices[i]-bestBuy);
            }
            bestBuy = Math.min(bestBuy,prices[i]);
        }
        System.out.println(maxProfit);
    }
}


Rearrange array elements by sign //

import java.util.*;
class Striver {
    public static void main(String[] args) {
        
        int[]arr = {3,1,-2,-5,2,-4};
        int n = arr.length;
        int[]positives = {3,1,2};
        int[]negatives = {-2,-5,-4};

        for(int i=0; i<n/2; i++){
           arr[i*2] = positives[i];
           arr[i*2+1] = negatives[i];
        }

        System.out.println(Arrays.toString(arr));
    }
}


Next Permutation //

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Striver {
    public static void main(String[] args) {

        int[] arr = {3, 1, 2};
        List<int[]> list = new ArrayList<>();
        generate(arr, 0, list);

        // Sort permutations
        list.sort((a, b) -> {
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]) {
                    return Integer.compare(a[i], b[i]);
                }
            }
            return 0;
        });

        // Find current permutation
        for (int i = 0; i < list.size(); i++) {
            if (Arrays.equals(arr, list.get(i))) {
                int[] ans;
                if (i + 1 < list.size()) {
                    ans = list.get(i + 1);
                } else {
                    ans = list.get(0);
                }

                // Copy answer into original arr
                for (int j = 0; j < arr.length; j++) {
                    arr[j] = ans[j];
                }
                break;
            }
        }

        // Print answer
        System.out.println(Arrays.toString(arr));
    }

    public static void generate(int[] arr, int index, List<int[]> list) {

        if (index == arr.length) {
            list.add(arr.clone());
            return;
        }
        for (int i = index; i < arr.length; i++) {
            swap(arr, index, i);
            generate(arr, index + 1, list);
            swap(arr, index, i);
        }
    }

    public static void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        System.out.println(Arrays.toString(arr));
    }
}


Optimal //

class Solution {
    public void nextPermutation(int[] nums) {

        int n = nums.length;

        // Step 1: Find the breakpoint
        int i = n - 2;

        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        // Step 2: Find the next greater element
        if (i >= 0) {
            int j = n - 1;

            while (nums[j] <= nums[i]) {
                j--;
            }

            // Swap
            swap(nums, i, j);
        }

        // Step 3: Reverse the remaining part
        reverse(nums, i + 1, n - 1);
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void reverse(int[] nums, int left, int right) {
        while (left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }
}


Leaders in an Array //

import java.util.ArrayList;
import java.util.List;

class Striver {
    public static void main(String[] args) {
        
        int[]arr = {1, 2, 5, 3, 1, 2};
        int n = arr.length;
        List<Integer> ans = new ArrayList<>();

        for(int i=0; i<n; i++){
            boolean leader = true;
            for(int j=i+1; j<n; j++){
                if(arr[j]>arr[i]){
                    leader = false;
                    break;
                }
            }
            if(leader==true){
                ans.add(arr[i]);
            }
        }
        System.out.println(ans);
    }
}

Optimal

import java.util.*;
class Striver {
    public static void main(String[] args) {
        int[]arr = {10,22,8,12,3,0,6};
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        List<Integer>ans = new ArrayList<>();

        for(int i=n-1; i>=0; i--){
            if(arr[i]>max){
                ans.add(arr[i]);
            }
            max = Math.max(max,arr[i]);
        }
        System.out.println(ans);
    }
}


Longest Consecutive Sequence in an Array //

class Solution {
    // Function to search for a given number in the array
    private boolean linearSearch(int[] a, int num) {
        // Get length of the array
        int n = a.length;
        // Traverse through the array to check if the number exists
        for (int i = 0; i < n; i++) {
            // If element matches the number, return true
            if (a[i] == num)
                return true;
        }
        // Number not found
        return false;
    }

    // Function to find the length of the longest consecutive sequence
    public int longestConsecutive(int[] nums) {
        // If the array is empty, no sequence exists
        if (nums.length == 0) {
            return 0;
        }
        // Get length of the array
        int n = nums.length;
        // Initialize the longest sequence length to 1 (minimum possible)
        int longest = 1;
        // Iterate over each element of the array
        for (int i = 0; i < n; i++) {
            // Store the current number
            int x = nums[i];
            // Start sequence length count from 1
            int cnt = 1;
            // Search for consecutive numbers starting from x + 1
            while (linearSearch(nums, x + 1) == true) {
                // Move to the next consecutive number
                x += 1;   
                // Increase the count of the current sequence
                cnt += 1;
            }
            // Update the longest sequence length if the current is longer
            longest = Math.max(longest, cnt);
        }
        // Return the longest consecutive sequence length found
        return longest;
    }

    public static void main(String[] args) {
        // Input array of integers
        int[] a = {100, 4, 200, 1, 3, 2};
        // Create an instance of Solution class
        Solution solution = new Solution();
        // Call the function and store the result
        int ans = solution.longestConsecutive(a);
        // Output the result
        System.out.println("The longest consecutive sequence is " + ans);
    }
}


Set Matrix Zero //

class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    for (int col = 0; col < n; col++) {
                        if (matrix[i][col] != 0)
                            matrix[i][col] = -1;
                    }
                    for (int row = 0; row < m; row++) {
                        if (matrix[row][j] != 0)
                            matrix[row][j] = -1;
                    }
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == -1)
                    matrix[i][j] = 0;
            }
        }
    }
}

public class Striver{
    public static void main(String[] args) {
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        
        Solution sol = new Solution();
        sol.setZeroes(matrix);
        
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}


Rotate matrix by 90 degrees //

class Striver {
    public static void main(String[] args) {
        
        int[][]matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int n = matrix.length;
        int[][]ans = new int [n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                ans[j][n-1-i] = matrix[i][j];
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(ans[i][j] + " ");
            }
        }
        System.out.println();
    }
}


class Solution {  // OPTIMAL
    public void rotateMatrix(int[][] matrix) {

        int n = matrix.length;

        // Transpose
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // Reverse each row
        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = n - 1;
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;

                left++;
                right--;
            }
        }
    }
}


Pascal's Triangle I //

import java.util.*;
class Striver {

    static int nCr(int n, int r){
            int res = 1;
            for(int i=0; i<r; i++){
                res = res*(n-i);
                res = res/(i+1);
            }
            return res;
        }

    public static void main(String[] args) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = 4;
        int r = 2;

        System.out.println(nCr(n,r));
    }
}

! Leetcode !//

import java.util.*;
class Striver{
    public list<list<Integer>> generate(int numRows) {

        list<list<Integer>> ans = new Arraylist<>();

        for(int i=0; i<numRows; i++){
            list<Integer> row = new Arraylist<>();
            for(int j=0; j<=i; j++){
                row.add(nCr(i,j));
            }
            ans.add(row);
        }
        return ans;
    }

        public int nCr( int r, int c){

            int res = 1;

            for(int i=0; i<c; i++){
                res = res*(r-i);
                res = res/(i+1);
            }
        return res;
    }
}


// Majority Element II //

import java.util.*;
class Striver {
    public static void main(String[] args) {
        
        int[]arr = {1, 2, 1, 1, 3, 2,2};
        int n = arr.length;
        int cnt = 0;

        List<Integer>list = new ArrayList<>();

        for(int i=0; i<n; i++){
            if(list.contains(arr[i])){
                continue;
            }
            cnt = 0;

            for(int j=0; j<n; j++){
                if(arr[j]==arr[i]){
                    cnt++;
                }
            }
                if(cnt>n/3){
                    list.add(arr[i]);
                }
            }
        System.out.println(list);
    }
}
