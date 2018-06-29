import java.io.*;
import java.io.IOException;

public class HighScore {
	private String fileName = "HighScore.txt";
	private boolean append_to_file = true;
	
	
	public HighScore( String HighScore , boolean append_value ) {

		HighScore = fileName;
		append_to_file = append_value;

	}
	
	public void writeToFile( String textLine ) throws IOException {
		
		FileWriter write = new FileWriter( fileName , append_to_file);
		
		PrintWriter print_line = new PrintWriter( write );
		
		print_line.printf("HighScore");
		
		print_line.close();
		
	}

}
