package arahman7162;

public class ARahmanLib {
    public static Boolean isPalinDrome(String str) {
        String output = "";
        if (str.length() > 0) {  // check if length of string is greater than 0
            for (int i = str.length() - 1; i >= 0; i--) {  //sets i to the last character of the string's length. Decrementing the length by 1.
                output = output + str.substring(i, i + 1); // output is equal to the characters of string at a certain range that being i, beginning index and i+1, ending index.
            }
        } else {
            System.out.println("no characters in string");
        }
        return (output.equals(str)); // returns true or false for output depending on the string passed.
    }

    public static String cutOut(String theStr, String subStr) {

        int x = theStr.indexOf(subStr) + subStr.length(); //creates an integer variable and adds the length of substring to the position of the first instance the substring is mentioned

        return theStr.substring(x);  //returns theStr from index of it's characters at x
    }

    public static int sumUpTo(int number){

        int sum = 0; //variable used to store the sum of the numbers

        if (number > 0) { // num has to be greater than 0

            for (int i = 0; i <= number; i++) { //repeats until the number passed from user is reached.

                sum = sum + i; //increments index into sum
            }
        } else {

            return number; //returns number if not greater than 0
        }

        return sum;  // Returns the sum of all the numbers
    }
    public static String dateStr(String str) {
        String month = str.substring(0, 2);//stores the  str substring property takes characters from index 0 to index 2 into month.
        String date = str.substring(3, 5); //stores the  str  substring property takes characters from index 3 to index 5 into date.
        String output = date + "-" + month + "-" + str.substring(6); //links or adds  all the variables and dashes into a string called "out"

        return output; //returns output string
    }

    public static int gcd (int a, int b) {

          if (b == 0) {
             return  a;
          }
          else {
              return gcd(b, a % b);
          }
          // Find a through recursion. if b is 0, return a , else, find greatest common denominator of b and the mod of a and b.
    }

    public static int lcm (int a, int b) {

        return Math.abs(a * b) / gcd(a, b); // returns the absolute value of a times b in case if it's negative and divides by the greatest common denominator of a and b.
    }

    public static int leastCommonMultiple (int num1, int num2, int num3) { // num 1 to 3 are the numbers for the lcm.

        return  lcm(num1, lcm(num2, num3)); // lcm of num 1, 2 , and 3.
    }
}

