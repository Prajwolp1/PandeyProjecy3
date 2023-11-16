import java.util.Scanner;
public class QuestionGenerator {
    private String name;
    private int characters;
    public QuestionGenerator(String givenName, int characters)    {
        this.name = givenName;
        this.characters = characters;
    }

    public void QuestionRunner()    {
        Scanner scan = new Scanner(System.in);
        String str = "";
        int repeat = 0;
        if (characters > 8) {
            repeat = 3;
        }   else {
            repeat = 2;
        }

        for (int i = repeat; i != 0; i--) {
            int random = (int) (Math.random() * 5);
            String newQuestion = Questions(random);
            System.out.print(newQuestion);
            String answer = scan.nextLine();
            str += " " + answer;
            System.out.println(" ");
        }
        PasswordGenerator generate = new PasswordGenerator(str, characters);
    }

    public String Questions(int random)   {
        if (random == 1)    {
            return"What is your favorite food? ";
        }
        if (random == 2)    {
            return"How many siblings do you have? ";
        }
        if (random == 3)    {
            return"What was the name of your birth city? ";
        }
        if (random == 4)    {
            return"What is your favorite artist to listen to? ";
        }
        if (random == 5)    {
            return"What is your favorite number? ";
        }
        else  {
            return"What is the name of your mother? ";
        }
    }
}

