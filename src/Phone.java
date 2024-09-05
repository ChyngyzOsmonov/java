public class Phone {
    private String number;
    private String type; // mobile или landline

    public Phone(String number, String type) {
        this.number = number;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String getNumber() {
        return number;
    }
}
