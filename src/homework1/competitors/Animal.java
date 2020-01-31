package homework1.competitors;


public class Animal implements Competitor {
    private String type;
    String name;

    private int maxRunDistance;
    private int maxJumpHeigth;


    private boolean onDistance;

    Animal(String name) {
      this.onDistance = true;
    }

    @Override
    public void run(int dist) {
        if (dist <= maxRunDistance) {
            System.out.println(type + " " + name + " успешно пробежала");
        } else {
            System.out.println(type + " " + name + " провалила тест на бег");
        onDistance = false;
        }
    }

    @Override
    public void jump(int heigth) {
        if (heigth <= maxJumpHeigth) {
            System.out.println(type + " " + name + " успешно перепрыгнула");
        } else {
            System.out.println(type + " " + name + " провалила тест на прыжок");
            onDistance = false;
        }
    }

    @Override
    public boolean isDistance() {
        return onDistance;
    }


}
