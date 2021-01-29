import java.util.Random;

public class Wall implements Obstacle{
    Random random = new Random();
    int wallHeight = random.nextInt(4) +1 ;

    public Wall () {
    }

    public Wall (int wallHeight) {
        this.wallHeight = wallHeight;
    }
    public void walls (){
        System.out.println( "высота стены " + wallHeight);
    }


    @Override
    public void sizeObstacle () {
        System.out.println( "высота стены :" + wallHeight + "метра");
    }
}
