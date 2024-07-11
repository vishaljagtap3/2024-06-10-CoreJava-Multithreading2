public class Car implements Runnable {

    private String title;
    private int maxSpeed;

    public Car(String title, int maxSpeed) {
        this.title = title;
        this.maxSpeed = maxSpeed;
        new Thread(this).start();
    }

    public void start() {
        new Thread(this).start();
    }

    @Override
    public void run() {
        for(int i = 0; i <= 100; i++) {
            System.out.println(title + " completed " + i  +" kms");
            try {
                Thread.sleep(250 - maxSpeed);
            } catch (InterruptedException e) {
            }
        }
        System.out.println(title + " Over");
    }
}
