import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;
public class MavenExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String userInput = scanner.nextLine();
        boolean isNumber = StringUtils.isNumeric(userInput);
        System.out.println("isNumeric?: " + isNumber);
        String flipCase = StringUtils.swapCase(userInput);
        System.out.println("Flipped case: " + flipCase);
        String reversed = StringUtils.reverse(userInput);
        System.out.println("Reversed: " + reversed);
    }

}
