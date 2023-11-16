import java.util.Scanner;
public class Main {
    public static void main(String[] args)  {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Password Generator! \n\nBefore we generate a secure and easy password for you, we need to ask you a couple of questions: ");
        System.out.print("Enter your name: ");
        String name = scan.nextLine();

        System.out.println("How long should the password be? (Should be at least 8)");
        int characters = scan.nextInt();
        scan.nextLine();
        QuestionGenerator generator = new QuestionGenerator(name, characters);

    }
}
