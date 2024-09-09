public class App {

    public interface FactorialNumber {
        boolean test(int a, int b);
    }
    public static void main(String[] args) throws Exception {
        FactorialNumber isFactor = (a, b) -> (b % a) == 0;

        if (isFactor.test(9, 5)) {
            System.out.println("5 is a factor of 9");
        } else {
            System.out.println("5 is not a factor of 9");
        }
    }
}
