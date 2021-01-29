import java.util.Random;

public class Person implements Result {
    Random random = new Random();
     int personRune = random.nextInt(300) + 200;
     int personJump = random.nextInt(4) + 2;

    public Person () {
    }

    public Person (int personRune, int personJump) {
        this.personRune = personRune;
        this.personJump = personJump;
    }





    @Override
    public void jump () {
        System.out.println(" человек прыгнул на :" +personJump + "метра");
    }

    @Override
    public void run () {
        System.out.println(" человек пробежал :" + personRune + "метров");
    }
}
