import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureExemplo {
    public void run() throws ExecutionException, InterruptedException {
        CompletableFuture.supplyAsync(() -> {
            PokemonAbilityFetch pokemonAbilityFetch = new PokemonAbilityFetch("pikachu");
                String response = pokemonAbilityFetch.fetch();
                return response;
        }).thenRun(() -> {
            System.out.println("busca na API completa!");
        }).get();
    }
}

// runAsync é usado quando apenas quero executar uma tarefa
// supplyAsync é usado quando espero um resultado (retorno)
// get() o código fica bloqueante (throws ExecutionException, InterruptedException)