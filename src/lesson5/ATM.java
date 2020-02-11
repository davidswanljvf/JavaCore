package lesson5;

public class ATM {
    int money;

    public ATM(int money) {
        this.money = money;
    }

    public synchronized void take(int amount, String user) {
        if (money >= amount) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            money -= amount;
            System.out.println(user + " get " + amount);
        } else {
            System.out.println(user + " can't get money");
        }
    }


    public void info() {
        System.out.println("ATM: " + money);
    }
}
