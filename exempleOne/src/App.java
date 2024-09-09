public class App {

    public static void main(String[] args) throws Exception {
        MultiThreadExample multiThreadExample1 = new MultiThreadExample("thread 1");
        MultiThreadExample multiThreadExample2 = new MultiThreadExample("thread 2");
        MultiThreadExample multiThreadExample3 = new MultiThreadExample("thread 3");

        Thread threa1 = new Thread(multiThreadExample1);
        Thread threa2 = new Thread(multiThreadExample2);
        Thread threa3 = new Thread(multiThreadExample3);

        threa1.start();
        threa2.start();
        threa3.start();

        threa1.join();
        threa2.join();
        threa3.join();

        for (int i =0; i < 10; i++) {
            System.out.println("Main thread valor atual do lood "+i);
        }
    }
}
