package inheritance;

import java.lang.String;
import java.util.Scanner;

public class If_Statement {
        public static void main(String[] args) {
            int age;
            System.out.println("Enter your age");
            Scanner sc = new Scanner(System.in);
            age = sc.nextInt();
            if (age>56){
                System.out.println("You are experienced");
            }
            else if(age>46) {
                System.out.println("You are semi_experienced");
            }
            else{
                System.out.println("you are not experienced");
            }
        }
    }

