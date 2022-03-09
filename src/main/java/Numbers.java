import java.util.regex.Pattern;

public interface Numbers {
    Pattern createRegexPattern(String listString);
    boolean isMsisdnValid(String msisdn);
}
