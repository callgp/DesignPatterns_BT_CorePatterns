import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderAndWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr=null;
		FileWriter fw=null;
		
		fr=new FileReader("C:\\gpFolder\\gpJava\\myFile.txt");
		fw=new FileWriter("C:\\gpFolder\\gpJava\\newFile.txt");
		
		int ch;
		
		while((ch=fr.read())!=-1){
			fw.write(ch);
		}
		fr.close();
		fw.close();

	}

}
