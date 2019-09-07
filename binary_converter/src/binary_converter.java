import java.util.Scanner;

public class binary_converter {
    public static void main(String[] args){
        System.out.println(">>> Welcome to BinaryConverter");
        System.out.println(">>> Version 1.0.0 | Jacob Gualtieri");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        //Asking for the input from the user.
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.print("Please Enter a Binary Number: ");
        String usr_num = scan.nextLine(); //saves the user's input as a string.

        Character[] reversed_num = reverseNum(usr_num);
        int sum = evaluateDecimal(reversed_num);
        printSum(usr_num, sum);
    }
    public static Character[] reverseNum(String usr_num){
        Character[] reversed_num = new Character[usr_num.length()];
        for (int i = 0; i < usr_num.length(); ++i){
            int end_idx = (usr_num.length()-i)-1;
            Character temp1 = usr_num.charAt(i);
            Character temp2 = usr_num.charAt(end_idx);
            reversed_num[i] = temp2;
            reversed_num[end_idx] = temp1;
        }
        return reversed_num;
    }
    public static int evaluateDecimal(Character[] reversed_num){
        int sum = 0;
        for (int i = 0; i < reversed_num.length; ++i){
            if (reversed_num[i] == '1'){
                sum += Math.pow(2,i);
            }
        }
        return sum;
    }
    public static void printSum(String usr_num, int sum){
        System.out.print(usr_num);
        System.out.print(" = ");
        System.out.println(sum);
    }
}