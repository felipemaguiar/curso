package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

import lambdas.Foreach;

public class CriandoStreams {

	public static void main(String[] args) {
		
		Consumer<Object> print =  System.out::print; // ao invés de ficar escrevendo system.out::print - somente escrevo print
		
		Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n");
		langs.forEach(print);
		
		String [] maisLangs = {"Python ", "Lisp ", "Perl ", "Go\n"};
		
		Stream.of(maisLangs).forEach(print);		
		Arrays.stream(maisLangs).forEach(print);
		Arrays.stream(maisLangs, 1, 4).forEach(print);
		
		List<String> outrasLangs = Arrays.asList("C ", "PHP ", "kotlin\n");
		outrasLangs.stream().forEach(print);
		outrasLangs.parallelStream().forEach(print);
		
//		Stream.generate(() -> "a").forEach(print); // Gera uma stream infinita desorganizada
//		Stream.iterate(0, n -> n + 1).forEach(print); // Gera uma stream infinita organizada
		
	}
}
