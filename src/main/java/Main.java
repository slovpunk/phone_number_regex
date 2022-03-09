import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Numbers numbers = new NumbersImpl();

        //enter the desired number
        String number = scanner.nextLine();

        String whiteList = null;
        String blackList = null;

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("blacklist.txt"));
        BufferedReader bufferedReader1 = new BufferedReader(new FileReader("whitelist.txt"))) {
            String blackline;
            String whiteline;
            while ((blackline = bufferedReader.readLine()) != null) {
                blackList = blackline;
            }
            while((whiteline = bufferedReader1.readLine()) != null) {
                whiteList = whiteline;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }



        Pattern blacklistPattern = numbers.createRegexPattern(blackList);
        Pattern whitelistPattern = numbers.createRegexPattern(whiteList);


//        String[] msisdns = {"2345646", "4562123", "1231323"};

//        for (String str : msisdns) {
//            if (whitelistPattern.matcher(str).lookingAt() && !blacklistPattern.matcher(str).lookingAt()) {
//                System.out.println(str + " можете купить");
//            } else {
//                System.out.println(str + " не можете купить");
//            }
//        }
    }
}
