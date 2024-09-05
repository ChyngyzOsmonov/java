package compulsory;

public class StringUtil {
    private StringActions stringActions;

    public StringUtil(StringActions stringActions) {
        this.stringActions = stringActions;
    }

    public String concatenate(String s1, String s2) {
        return stringActions.concate(s1, s2);
    }

    public int getCountChars(String s) {
        return stringActions.countChars(s);
    }

    public char getCharAt(String s, int index) {
        return stringActions.findChar(s, index);
    }
}
