public class Main {
    public static void main(String[] args) {

        Thread.currentThread().setName("My Main Thread");

        Car c1 = new Car("Maruti", 200);
        Car c2 = new Car("Tata", 220);
        Car c3 = new Car("Mahindra", 210);

        /*c1.start();
        c2.start();
        c3.start();*/


        /*Thread t1 = new Thread(c1);
        t1.start();

        new Thread(c2).start();
        new Thread(c3).start();*/

        /*c1.start();
        c2.start();
        c3.start();*/

    }
}
