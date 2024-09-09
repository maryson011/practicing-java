import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureExemplo {
    public void run() throws ExecutionException, InterruptedException {
        CompletableFuture.supplyAsync(() -> {
            PokemonAbilityFetch pokemonAbilityFetch = new PokemonAbilityFetch("pikachu");
                String response = pokemonAbilityFetch.fetch();
                return response;
        }).thenCombine(CompletableFuture.supplyAsync(() -> {
            PokemonAbilityFetch pokemonAbilityFetch = new PokemonAbilityFetch("charmander");
                String response = pokemonAbilityFetch.fetch();
                return response;
        }), (a, b) -> {
            System.out.println("Pikachu response: " + a);
            System.out.println("charmander response: " + b);
            return "done";
        }).get();
    }
}

// runAsync é usado quando apenas quero executar uma tarefa
// supplyAsync é usado quando espero um resultado (retorno)
// get() o código fica bloqueante (throws ExecutionException, InterruptedException)