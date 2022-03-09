import org.apache.commons.lang3.StringUtils;

import java.util.regex.Pattern;

public class NumbersImpl implements Numbers {

    @Override
    public Pattern createRegexPattern(String listString) {
        String[] array = StringUtils.split(listString, ',');
        String regexString = StringUtils.join(array, '|');
//        String regexString = listString.replace(',', '|');
        return Pattern.compile(regexString);
    }

    @Override
    public boolean isMsisdnValid(String msisdn) {
        if (msisdn == null) return false;
        return Pattern.compile("(70|77|55|99)[0-9]{7}").matcher(msisdn).matches();
    }
}
