import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) throws Exception {
        List<String>frutas = new ArrayList<>();
        frutas.add("maçâ");
        frutas.add("laranja");

        frutas.stream().forEach(item -> System.out.println(item));
        // utilizando :: (operador metodo de referência)
        frutas.stream().forEach(System.out::println);
        frutas.stream().forEach(String::new);
    }
}
