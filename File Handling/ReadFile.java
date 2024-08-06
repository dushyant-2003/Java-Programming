

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadFile {
	public static void main(String[] args) throws IOException
	{
		Path pathFileToRead = Paths.get("./resources/data.txt");
		List<String> lines = Files.readAllLines(pathFileToRead);
		lines.stream().map(String::toLowerCase).forEach(System.out::println);
		lines.stream().filter(str->str.contains("a")).forEach(System.out::println);
		
	}
}
