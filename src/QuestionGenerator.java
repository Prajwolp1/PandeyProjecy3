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
        if (characters > 12) {
            repeat = 2;
        }   else if (characters <= 12) {
            repeat = 1;
        }

        for (int i = repeat; i != 0; i--) {
            int random = (int) (Math.random() * 5);
            String newQuestion = Questions(random);
            System.out.print(newQuestion);
            String answer = scan.nextLine();
            str += " " + answer;
        }
        PasswordGenerator generate = new PasswordGenerator(str, characters, name);
        generate.PasswordMaker();
    }

    public String Questions(int random)   {
        if (random == 1)    {
            return name + ", What is your favorite food? ";
        }
        if (random == 2)    {
            return name + ", What is your favorite word? ";
        }
        if (random == 3)    {
            return name + ", What was the name of your birth city? ";
        }
        if (random == 4)    {
            return name + ", What is the name of your best friend? ";
        }
        if (random == 5)    {
            return name + ", What is your favorite number? ";
        }
        else  {
            return name + ", What is the name of your mother or father? ";
        }
    }
}

