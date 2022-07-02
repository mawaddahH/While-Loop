import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner UserInput = new Scanner (System.in);
        System.out.print("PLEASE add any number to revers it: ");
		while(!UserInput.hasNextInt()) {
            UserInput.next();

            System.out.println("PLEASE add any number to revers it: ");
            System.err.println("You Entered INVALID input");

		}

            int Num = UserInput.nextInt(); //convert UserInput object to int
            int remainder,reverseNum =0; // to save the result

             while(Num !=0) {
            	 remainder=Num%10;
            	 reverseNum=reverseNum*10+remainder;
            	 Num=Num/10;
             }
             
             System.out.println("The reverseNum is ="+reverseNum);
             System.out.println("THANK YOU");

        UserInput.close();
	}

}
