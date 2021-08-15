package AplikasiListOOP;
import java.util.Scanner;

public class InputListUtil {

    private static Scanner scanner = new Scanner(System.in);

    public static String input(String info){
        System.out.println(info + " Masupkan : ");
        String data = scanner.nextLine();
        return data;
    }


}
