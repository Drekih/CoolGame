import java.util.Random;
import java.util.Scanner;

public class Monster {
    private String image = "\uD83E\uDDB9\u200D♂\uFE0F";
    private final int x, y;
    private int money = 10;

    Monster(int sizeBoard) {
        Random random = new Random();
        x = 1 + random.nextInt(sizeBoard);
        y = 1 + random.nextInt(sizeBoard - 1);
    }

    public int getMoney() {
        return money;
    }

    protected void sentMoney(int value) {
        money = value;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public boolean conflictPerson(int personX, int personY) {
        return personX == x && personY == y;
    }

    public boolean taskMonster(int difficultGame) {
        System.out.println("Решите задачу:");

        if (difficultGame == 1 || difficultGame == 2) {
            Random random = new Random();
            int a = random.nextInt(100);
            int b = random.nextInt(100);
            int trueAnswer = a + b;

            System.out.println("Реши пример: " + a + " + " + b + " = ?");
            Scanner scanner = new Scanner(System.in);
            int answer = scanner.nextInt();

            if (trueAnswer == answer) {
                System.out.println("Верно! Ты победил монстра и получил 10 монет");
                return true;
            } else {
                System.out.println("Ты проиграл эту битву!");
                return false;
            }
        } else {
            Random random = new Random();
            int a = random.nextInt(500);
            int b = random.nextInt(500);
            int trueAnswer = a + b;

            System.out.println("Реши пример: " + a + " + " + b + " = ?");
            Scanner scanner = new Scanner(System.in);
            int answer = scanner.nextInt();

            if (trueAnswer == answer) {
                System.out.println("Верно! Ты победил монстра");
                return true;
            } else {
                System.out.println("Ты проиграл эту битву!");
                return false;
            }

        }
    }
}
