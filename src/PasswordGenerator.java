public class PasswordGenerator {
    private String questions;
    private int limit;
    private String name;

    public PasswordGenerator (String questions, int limit, String name) {
        this.questions = questions;
        this.limit = limit;
        this.name = name;
        PasswordMaker();
    }
    public void PasswordMaker() {
        String password = name;
        String str = questions;
        String firstAnswer = "";
        for (int j = 0; j < limit; j++) {
            if (!(str.substring(j, j + 1).equals(" "))) {
                firstAnswer += str.substring(j, j + 1);
            }
            if (str.substring(j, j + 1).equals(" ")) {
                str = str.substring(j + 1);
                j = limit;
            }
        }
        int numLimit = limit - name.length();
        while (numLimit != 0)   {
            password += firstAnswer;
            numLimit -= firstAnswer.length();
        }
        System.out.println(password);
    }


}
