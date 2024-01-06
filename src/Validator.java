import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Validator {
    static String str;
    static boolean isArabian;
    static void validateInputData() {
        Scanner scan = new Scanner(System.in);
        str = scan.nextLine();
        Pattern arabian = Pattern.compile("^([0-9]|10) (\\+|\\-|\\/|\\*) ([0-9]|10)$");
        Pattern rome = Pattern.compile("^((I{1}(I{0,2}|V{0,1}|X{0,1}))|(V{1}(I{0,3}))|X{1}) (\\+|\\-|\\/|\\*) ((I{1}(I{0,2}|V{0,1}|X{0,1}))|(V{1}(I{0,3}))|X{1})$");
        Matcher arabianMatcher = arabian.matcher(str);
        Matcher romeMatcher = rome.matcher(str);

        if (arabianMatcher.find()) {
            isArabian = true;
            Transformer.transformStringToArabianArithmetic();
        } else if (romeMatcher.find()) {
            Transformer.transformStringToRome();
        } else {
            System.out.println("Неверные данные");
        }
    }
}
