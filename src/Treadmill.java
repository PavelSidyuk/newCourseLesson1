import java.util.Random;

public class Treadmill implements Obstacle{ // беговая дорожка
    Random random = new Random();
    int trackLength = random.nextInt(200) + 300;

    public Treadmill () {
    }

    public Treadmill (int trackLength) {
        this.trackLength = trackLength;
    }

    @Override
    public void sizeObstacle () {
        System.out.println(" длина  дорожки :" + trackLength + "метров");
    }
}

