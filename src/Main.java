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

        System.out.println("Game Started");
        do {
            int shoot = player.doShot();
            field.hitTheShip(shoot);
        } while (field.isGameNotOver());
    }
}
