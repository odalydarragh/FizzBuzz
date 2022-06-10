import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner askNum = new Scanner(System.in);
        System.out.print("Please enter your number here: ");
        int userNum = askNum.nextInt();

        if ((userNum % 2)== 0)
            System.out.println("Buzz");

        else if ((userNum % 5) == 0)
            System.out.println("Fizz");

        else System.out.println(userNum);


    }
}
