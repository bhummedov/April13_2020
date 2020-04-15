package TwoDimArray;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class BiggestNumber {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter the 1st number: ");
//        int num1 = in.nextInt();
//        System.out.print("Enter the 2nd number: ");
//        int num2 = in.nextInt();
//        System.out.print("Enter the 3rd number: ");
//        int num3 = in.nextInt();
//        public static void main(String[] args) {
//
//            int num1 = 10, num2 = 20, num3 = 7;
//
//            if( num1 >= num2 && num1 >= num3)
//                System.out.println(num1+" is the largest Number");
//
//            else if (num2 >= num1 && num2 >= num3)
//                System.out.println(num2+" is the largest Number");
//
//            else
//                System.out.println(num3+" is the largest Number");
//        }
//    }
//   }
//}
    int counter = 1;
    int number;
    int largest = 0;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number: ");
    number = input.nextInt();

        while(counter < 3)
    {
        System.out.println("Enter the number: ");
        number = input.nextInt();

        if(largest < number) {
            largest = number;
        }

        counter++;

    }

        System.out.println("the largest number is " + largest);
}
}




