import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        String num2 = "1,2,3,4,5,6,7,8,9,0";
        String Account = "Khant Hpone";
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println("Enter num2: ");



        if(input == 123){
            System.out.println("Your info is in this file");
        }else if(input == 234) {
            System.out.println("Your Gmail");


        }else if(input == 345) {
            System.out.println("Your family's info");

        }else {
            System.out.println("Nothing to show.");
        }

    }
}
