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
