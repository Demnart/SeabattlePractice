import java.util.Scanner;

/**
 * Created by Артем on 15.09.2016.
 */
public class Player {
    int doShot() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваши координаты");
        String coordinate = scanner.nextLine();
        int s = Integer.parseInt(coordinate);
        System.out.println("Координаты приняты");
        return s;
    }
}
