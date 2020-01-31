package homework1.competitors;

public class Robot implements Competitor{
    String name;

    int maxRunDistance;
    int maxJumpHeigth;

    boolean active;

    public Robot( String name, int maxRunDistance, int maxJumpHeigth) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeigth = maxJumpHeigth;
        this.active = true;
    }

    @Override
    public void run(int dist) {
        if (dist <= maxRunDistance) {
            System.out.println(name + " успешно пробежал");
        } else {
            System.out.println(name + " провалил тест на бег");
            active = false;
        }

    }

    @Override
    public void jump(int heigth) {


    }

    @Override
    public boolean isDistance() {
        return false;
    }

    }



