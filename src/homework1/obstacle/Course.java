package homework1.obstacle;

import homework1.competitors.Competitor;
import homework1.competitors.Team;

public class Course {
    private Obstacle[] obstacles;

    public Course(Obstacle... obstacles) {
        this.obstacles = obstacles;
    }

    public void doIt(Team team) {
        for (Competitor competitor : team.getCompeptitor()) {
            for (Obstacle obstacle : obstacles) {
                obstacle.doIt(competitor);
                if (!competitor.isDistance()) {
                    break;
                }
            }
        }
    }
}
