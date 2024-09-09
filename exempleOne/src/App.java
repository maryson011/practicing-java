

public class App {

    public static void main(String[] args) throws Exception {
        CompletableFutureExemplo completableFutureExemplo = new CompletableFutureExemplo();
        for(int i = 0; i < 10; i++) {
            System.out.println(i);
            Thread.sleep(3000);
        }
        try {
            completableFutureExemplo.run();
            System.out.println("Main thread is running");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
