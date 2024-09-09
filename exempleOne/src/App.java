import java.util.concurrent.CompletableFuture;

public class App {

    public static void main(String[] args) throws Exception {
        CompletableFutureExemplo completableFutureExemplo = new CompletableFutureExemplo();

        CompletableFuture completableFuture = CompletableFuture.runAsync(() -> {
            PokemonAbilityFetch pokemonAbilityFetch = new PokemonAbilityFetch("pikachu");
            pokemonAbilityFetch.fetch();
        });

        for(int i = 0; i < 10; i++) {
            System.out.println(i);
            Thread.sleep(3000);
        }
        try {
            completableFuture.get();
            System.out.println("Main thread is running");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
