import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureExemplo {
    public void run() throws ExecutionException, InterruptedException {
        CompletableFuture.runAsync(() -> {
            PokemonAbilityFetch pokemonAbilityFetch = new PokemonAbilityFetch("pikachu");
                pokemonAbilityFetch.fetch();
        }).get();
    }
}

// runAsync é usado quando apenas quero executar uma tarefa
// supplyAsync é usado quando espero um resultado (retorno)
// get() o código fica bloqueante (throws ExecutionException, InterruptedException)