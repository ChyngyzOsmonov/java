public class HomeTaskRegex {
    public boolean isValidPhoneNumber(String phoneNumber) {
        String regex = "\\(\\d{3}\\) \\d{3}-\\d{3}-\\d{3}";
        return phoneNumber.matches(regex);
    }

    public String replaceFooWithBar(String input) {
        return input.replaceAll("foo", "bar");
    }

    public boolean isValidTime(String time) {
        String regex = "^([01]\\d|2[0-3]):[0-5]\\d$";
        return time.matches(regex);
    }
}
