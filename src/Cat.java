import java.util.Random;

public class Cat implements Result {
    Random random = new Random();
    int catRun = random.nextInt(200) + 100;
    int сatJump =random.nextInt(3) + 1;


    public Cat () {
    }

    public Cat (int catRun, int сatJump) {
        this.catRun = catRun;
        this.сatJump = сatJump;
    }






    @Override
    public void jump () {
        System.out.println( " кот прыгнул на : " + сatJump + "метра" );
    }

    @Override
    public void run () {
        System.out.println(" кот пробежал : " + catRun + "метров");
    }


}
