import java.util.Random;

/**
 * Created by Артем on 15.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        Field field = new Field();
        Random random = new Random();
        field.initCell();
        int shipRandomCoordinate;
        int shipRandomCoordinate1;

        shipRandomCoordinate = random.nextInt(10);
        Ship ship = new Ship(shipRandomCoordinate);
        field.setShip(ship);
        do{
            shipRandomCoordinate1 = random.nextInt(10);
            Ship ship1 = new Ship(shipRandomCoordinate1);
            field.setShip(ship1);
        }while (shipRandomCoordinate == shipRandomCoordinate1);

        System.out.println("Game Started");
        do {
            field.show();
            int shoot = player.doShot();
            field.hitTheShip(shoot);
        } while (field.isGameNotOver());
    }
}
