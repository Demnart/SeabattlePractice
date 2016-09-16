import java.util.Random;

/**
 * Created by Артем on 15.09.2016.
 */
public class Field {
    public static final int SIZE = 10;
    char[] cells = new char[SIZE];
    Ship ship;

    void initCell() {
        for (int i = 0; i < cells.length; i++) {
            cells[i] = '.';
        }
    }

    void setShip(Ship ship) {
        this.ship = ship;
        cells[ship.position] = 'X';
    }

    void show() {
        System.out.println(cells);
    }

    void hitTheShip(int shoot) {
        switch (cells[shoot]) {
            case '.':
                System.out.println("Вы промазали");
                cells[shoot] = '*';
                show();
                break;
            case 'X':
                System.out.println("Вы Попали");
                cells[shoot] = '!';
                show();
                break;
            case '*':
                System.out.println("Вы пытаетесь стрелять в ту же ячейку");
                show();
                break;
        }
    }

    boolean isGameNotOver() {
        for (char cell : cells) {
            if (cell == 'X') {
                return true;
            }
        }
        return false;
    }

}
