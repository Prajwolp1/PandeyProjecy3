import java.util.Scanner;

public class WelcomeInterface {
    public WelcomeInterface () {}

    public void welcome(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Password Generator! \n(Make sure that everything is lowercase!)\nBefore we generate a secure and easy password for you, we need to ask you a couple of questions: ");
        System.out.print("Enter your name: ");
        String name = scan.nextLine();

        System.out.print("Do you have a preference for password length (Y or N): ");
        String length = scan.nextLine();
        if (length.equals("Y")) {
            System.out.print("How long should the password be? (Has to be more than 8): ");
            int characters = scan.nextInt();
            scan.nextLine();
            QuestionGenerator generator = new QuestionGenerator(name, characters);
            generator.QuestionRunner();
        }   else if (length.equals("N")) {
            QuestionGenerator generator = new QuestionGenerator(name);
            generator.QuestionRunner();
        }
    }
}
