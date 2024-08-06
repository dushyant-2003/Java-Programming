
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class WriteFile {
	public static void main(String[] args) throws IOException
	{
		Path pathFileToWrite = Paths.get("./resources/data.txt");
		List<String> lst = List.of("Apple","Boy","Cat");
		Files.write(pathFileToWrite, lst);
	}
}
