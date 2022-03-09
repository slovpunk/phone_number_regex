import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        Numbers numbers = new NumbersImpl();

        String whiteList = "444,4562123,555";
        Pattern blacklistPattern = numbers.createRegexPattern("345678,2345646,1231323");
        Pattern whitelistPattern = numbers.createRegexPattern(whiteList);


        String[] msisdns = {"2345646", "4562123", "1231323"};

        boolean isWhiteList = whiteList == null || whiteList.isEmpty();

        for (String str : msisdns) {
            if ((whitelistPattern.matcher(str).lookingAt() && isWhiteList) && !blacklistPattern.matcher(str).lookingAt()) {
                System.out.println(str + " можете купить");
            } else {
                System.out.println(str + " не можете купить");
            }
        }
    }
}
