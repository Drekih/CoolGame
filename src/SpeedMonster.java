import java.util.Random;
import java.util.Scanner;

public class SpeedMonster extends Monster{
    SpeedMonster(int sizeBoard) {
        super(sizeBoard);
        setImage("\uD83D\uDC79");
        sentMoney(100);
    }

    @Override
    public boolean taskMonster(int difficultGame) {
           System.out.println("Решите задачу:");

        if (difficultGame == 1 || difficultGame == 2) {
            Random random = new Random();
            int a = random.nextInt(100000);
            int b = random.nextInt(100000);
            int trueAnswer = a + b;

            System.out.println("Реши пример: " + a + " + " + b + " = ?");
            Scanner scanner = new Scanner(System.in);
            int answer = scanner.nextInt();

            if (trueAnswer == answer) {
                System.out.println("Верно! Ты победил монстра и получил 100 монет");
                return true;
            } else {
                System.out.println("Ты проиграл эту битву!");
                return false;
            }
        } else {
            Random random = new Random();
            int a = random.nextInt(500000);
            int b = random.nextInt(50);
            int trueAnswer = a / b;

            System.out.println("Реши пример: " + a + " / " + b + " = ?");
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
