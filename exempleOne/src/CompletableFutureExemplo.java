import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureExemplo {
    public void run() throws ExecutionException, InterruptedException {
        CompletableFuture.supplyAsync(() -> {
            PokemonAbilityFetch pokemonAbilityFetch = new PokemonAbilityFetch("pikachu");
                String response = pokemonAbilityFetch.fetch();
                return response;
        }).thenAccept((result) -> {
            System.out.println("task result: " + result);
        }).get();
    }
}

// runAsync é usado quando apenas quero executar uma tarefa
// supplyAsync é usado quando espero um resultado (retorno)
// get() o código fica bloqueante (throws ExecutionException, InterruptedException)