package homework1;

import homework1.competitors.*;
import homework1.obstacle.Cross;
import homework1.obstacle.Course;
import homework1.obstacle.Obstacle;
import homework1.obstacle.Wall;

public class Main {
    public static void main(String[] args) {
        Team team1 = new Team(
                new Human("Vasia",1000,2),
                new Cat("Barsik",500,3),
                new Robot("Tob",10000,1),
                new Cat("Murka",1000,3)

        );
        Team team2 = new Team (
                new Human("Peta",900,2),
                new Cat("Barsik",500,3),
                new Robot("Bot",10000,1)

        );

        Obstacle[] obstacles ={
                new Wall(5),
                new Cross(500)
        };

        Course course = new Course(
                new Cross(50),
                new Wall(2),
                new Cross(90)
        );
        System.out.println("Команда Альфа");
        course.doIt(team1);

        System.out.println();

        System.out.println("Команда Beta");
        course.doIt(team2);

    }
}
