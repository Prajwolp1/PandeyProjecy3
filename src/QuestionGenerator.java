import java.util.Scanner;
public class QuestionGenerator {
    private String name;
    private int characters;
    // Multiple constructor for different instances.
    public QuestionGenerator(String givenName, int characters)    {
        this.name = givenName;
        this.characters = characters;
    }

    public QuestionGenerator(String giveName)   {
        this.name = giveName;
        characters = (int) (Math.random() + 1) * 10;
    }

    //Chooses questions to ask and sends it to PasswordGenerator
    public void QuestionRunner()    {
        Scanner scan = new Scanner(System.in);
        String str = "";

        int count = 0;
        while((str.length() < characters - name.length() - 3) && (count < 3)) {
            int random = (int) (Math.random() * 5);
            String newQuestion = Questions(random);
            System.out.print(newQuestion);
            String answer = scan.nextLine();
            str += "_" + answer;
            count++;
        }

        // Asks the user if they want their name for the password or not
        System.out.print("Do you want to have your name in the password (Y or N): ");
        String yOrN = scan.nextLine();
        if (yOrN.equals("Y"))   {
            PasswordGenerator generate = new PasswordGenerator(str, characters, name);
            generate.PasswordMaker();
        }   else {
            PasswordGenerator generate = new PasswordGenerator(str, characters);
            generate.PasswordMaker();
        }
    }

    // Helper class that is used to get quesitons
    private String Questions(int random)   {
        if (random == 1)    {
            return name + ", What is your favorite food? ";
        }
        if (random == 2)    {
            return name + ", What is your favorite word? ";
        }
        if (random == 3)    {
            return name + ", What is your favorite animal? ";
        }
        if (random == 4)    {
            return name + ", What was the name of your first pet?  ";
        }
        if (random == 5)    {
            return name + ", What is your favorite number? ";
        }
        if (random == 6)  {
            return name + ", What is the name of your mother or father? ";
        }
        return"";
    }
}

