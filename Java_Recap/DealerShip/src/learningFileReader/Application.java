package learningFileReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
			File file = new File("myTemp.txt");
			BufferedReader br = null;
			try {
				FileReader fileReader = new FileReader(file);
				br = new BufferedReader(fileReader);
				String line = br.readLine();
				
				while(line != null) {
					System.out.println(line);
					line = br.readLine();
				}
			}catch(FileNotFoundException fe){
				
			}catch(IOException ie) {
				
			}finally {
				br.close();
			}
	}

}
