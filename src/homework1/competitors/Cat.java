package homework1.competitors;


public class Cat extends Animal implements Competitor {
    private boolean active;
    private int maxRunDistance;
    private int maxJumpHeight;

    public Cat(String name, int runDistance, int jumpHeight) {
        super(name);
        this.name = name;
        this.active = true;
        this.maxRunDistance = runDistance;
        this.maxJumpHeight = jumpHeight;
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
        if (heigth <= maxJumpHeight) {
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
