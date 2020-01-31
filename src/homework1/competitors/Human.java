package homework1.competitors;

public class Human implements Competitor{
    private String name;

    private int maxRunDistance;
    private int maxJumpHeigth;

    private boolean active = true;

    public Human( String name, int maxRunDistance, int maxJumpHeigth) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeigth = maxJumpHeigth;
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
        if (heigth <= maxJumpHeigth) {
            System.out.println(name + " успешно перепрыгнул");
        } else {
            System.out.println(name + " провалил тест на прыжок");
            active = false;
        }
    }


    @Override
    public boolean isDistance() {
        return active;
    }


}
