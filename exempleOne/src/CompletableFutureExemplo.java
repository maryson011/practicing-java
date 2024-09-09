import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureExemplo {
    public void run() throws ExecutionException, InterruptedException {
        CompletableFuture pikachu = CompletableFuture.supplyAsync(() -> {
            PokemonAbilityFetch pokemonAbilityFetch = new PokemonAbilityFetch("pikachu");
                String response = pokemonAbilityFetch.fetch();
                return response;
        });
        CompletableFuture charmander = CompletableFuture.supplyAsync(() -> {
            PokemonAbilityFetch pokemonAbilityFetch = new PokemonAbilityFetch("charmander");
                String response = pokemonAbilityFetch.fetch();
                return response;
        });

        CompletableFuture bulbasaur = CompletableFuture.supplyAsync(() -> {
            PokemonAbilityFetch pokemonAbilityFetch = new PokemonAbilityFetch("bulbasaur");
                String response = pokemonAbilityFetch.fetch();
                return response;
        });

        CompletableFuture squirtle = CompletableFuture.supplyAsync(() -> {
            PokemonAbilityFetch pokemonAbilityFetch = new PokemonAbilityFetch("squirtle");
                String response = pokemonAbilityFetch.fetch();
                return response;
        });

        CompletableFuture allPokemons = CompletableFuture.allOf(pikachu, charmander, bulbasaur, squirtle);

        // allPokemons.get();
        allPokemons.thenRun(() -> {
            try {
                System.out.println("Pikachu" + pikachu.get());
                System.out.println("Charmander" + charmander.get());
                System.out.println("Bulbasaur " + bulbasaur.get());
                System.out.println("Squirtle " + squirtle.get());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).get();

    }
}

// runAsync é usado quando apenas quero executar uma tarefa
// supplyAsync é usado quando espero um resultado (retorno)
// get() o código fica bloqueante (throws ExecutionException, InterruptedException)