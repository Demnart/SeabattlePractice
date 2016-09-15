/**
 * Created by Артем on 15.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        Field field = new Field();
        Ship ship = new Ship();
        field.initCell();
        field.setShip(ship);
        field.showShip();
        field.show();

        do {
            int i = player.doShot();
            field.hitTheShip(i);
        } while (field.isGameNotOver());
    }
}
