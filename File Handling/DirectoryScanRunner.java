

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.Predicate;

public class DirectoryScanRunner {
	public static void main(String[] args) throws IOException
	{
		Files.list(Paths.get(".")).forEach(System.out::println);
		
		Path currentDirectory = Paths.get(".");
//		Files.walk(currentDirectory,2).forEach(System.out::println);
		
		Predicate<? super Path> predicate = path -> String.valueOf(path).contains(".java");
		
		
		Files.walk(currentDirectory,1)
		.filter(predicate)
		.forEach(System.out::println);
	
	}
}
