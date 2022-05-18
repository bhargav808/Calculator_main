package calculatorApp;

import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("**********---- Bhargav Calculator ----- ***************");
        System.out.println();
        calculator cal = new calculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a, b , c;
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("1=Add, 2=Subtraction, 3=Multiply, 4=Divide");
        c = sc.nextInt();
        switch(c){

        case 1:
            System.out.println("you choose addition!");
            cal.add(a, b);
            break;

        case 2:
            cal.sub(a, b);
            break;

        case 3:
            cal.mul(a, b);
            break;

        case 4:
        	cal.div(a, b);
            break;

        default:
            System.out.println("You did not make a valid choice, please run the program again.");
            System.exit(0);
        }
  }

}
        

 
