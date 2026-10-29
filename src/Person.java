import java.util.Random;

public class Person {
    private int x, y;
    private String image = "\uD83E\uDDDD\u200D♂\uFE0F";
    private int live = 3;
    private int cash = 0;

    Person(int sizeBoard) {
        Random random = new Random();
        x = 1 + random.nextInt(sizeBoard);
        y = sizeBoard;
    }

    Person(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Person() {
        this(1, 1);
    }

    public int getCash() {
        return cash;
    }

    public void addCash(int money) {
        cash = cash + money;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getLive() {
        return live;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public boolean isMoveCorrect(int x, int y) {
        return this.x == x && Math.abs(this.y - y) == 1
                || this.y == y && Math.abs(this.x - x) == 1;
    }

    void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void downLive() {
        if (live <= 0) {
            live = 0;
        } else {
            live--;
        }
    }
}
