import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileInputStream fs=null;
		try {
			fs=new FileInputStream(new File("C:\\gpFolder\\gpJava\\myFile.txt"));//while saving make sure put in " " file name in windows browser otherwise says cannot find..after saving it should not say as .txt//https://www.youtube.com/watch?v=SslMi6ptwH8
			System.out.println("file opened");
			
			int i;
			while((i=fs.read())!=-1){
			//	System.out.print((char)i);
				System.out.print(i);//if remove the char see all numbers there representing bytes jibberish 1191011089911110910132116111327379328311611410197109115115
			}
			fs.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				fs.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("\nfile closed");
		}
	}
	
	/*file opened
	welcome to IO Streamss
	file closed*/


}
