public class Main {
    public static void main (String[] args) {
        Person person = new Person();
        Cat cat = new Cat();
        Robot robot = new Robot();
        Wall wall = new Wall();
        Treadmill treadmill = new Treadmill();


        Result [] results = new Result[3];
        results [0] = person;
        results [1] = cat;
        results [2] = robot;

        for (Result r: results) {
            r.run();
            r.jump();
        }

        Obstacle [] obstacles = new Obstacle[2];
        obstacles[0] = wall;
        obstacles[1] = treadmill;

        for (Obstacle o: obstacles) {
            o.sizeObstacle();
        }



                if (robot.robotRun >= treadmill.trackLength)
                {
                    System.out.println( " Робот пробежал");

                } else {
                    System.out.println(" Робот не добежал!!! Нужно зарядить");

                }
                if (robot.robotJump >= wall.wallHeight){
                    System.out.println("Робот перепрыгнул");

                }else {
                    System.out.println("Робот недопрыгнул");

                }

                if (person.personRune >= treadmill.trackLength){
                    System.out.println("Человек добежал");
                }else {
                    System.out.println("Человек не добежал");
                }

                if (person.personJump >= wall.wallHeight){
                    System.out.println("Человек перепрыгнул");

                }else {
                    System.out.println("Человек не перепрыгнул");
                }

                if (cat.catRun >= treadmill.trackLength){
                    System.out.println("Котейка" );
                }else {
                    System.out.println("Котейка не добежал");
                }

                if (cat.сatJump >= wall.wallHeight){
                    System.out.println("Котейка перепрыгнул");
                }else {
                    System.out.println("Котейка не допрыгнул");
                }








    }







}
