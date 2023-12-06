import java.util.Scanner;
public class PasswordGenerator {
    private String questions;
    private int limit;
    private String name;

    public PasswordGenerator (String questions, int limit, String name) {
        this.questions = questions;
        this.limit = limit;
        this.name = name;
    }
    public PasswordGenerator (String questions, int limit)  {
        this.questions = questions;
        this.limit = limit;
        name = "";
    }
    public void PasswordMaker() {
        Scanner scan = new Scanner(System.in);
        String password = name + questions;
        // replaces any a's with @'s
        String newStr = password.replace('a','@');
        // replaces any o's with 0's
        newStr = newStr.replace('o','0');
        //replace any i's with !'s
        newStr = newStr.replace('i', '!');
        if (newStr.length() < limit) {
            System.out.println(tooLongOrShort(newStr));
        }   else   {
            System.out.println(tooLongOrShort(newStr,2));
        }

        System.out.print("\nAre you happy with this password (Y or N): ");
        String yorN = scan.nextLine();

        if  (yorN.equals("N"))    {
            QuestionGenerator newWelcome = new QuestionGenerator(name,limit);
            newWelcome.QuestionRunner();
        }
    }

    public String tooLongOrShort (String newStr) {
        for (int i = 0; i != (limit - newStr.length()); i++)    {
            newStr += (int)(Math.random() * 9) + 1;
        }
        return newStr;
    }

    public String tooLongOrShort (String newStr, int count) {
        int remain = newStr.length() - limit;
        newStr = newStr.substring(0,newStr.length() - (remain + count));
        int i = 0;
        while (i < count)   {
            newStr += (int)(Math.random() * 9);
            i++;
        }
        return newStr;
    }

}
