import java.util.Random;

public class Robot implements Result{
     Random random = new Random();
     int robotRun = random.nextInt(400) + 50;
     int robotJump = 2;

    public Robot () {
    }

    public Robot (int robotRun, int robotJump) {
        this.robotRun = robotRun;
        this.robotJump = robotJump;
    }



    @Override
    public void jump () {
        System.out.println( " робот прыгнул на : " + robotJump + "метра" );
    }

    @Override
    public void run () {
        System.out.println(" робот пробежал : " + robotRun + "метров");
    }
}

