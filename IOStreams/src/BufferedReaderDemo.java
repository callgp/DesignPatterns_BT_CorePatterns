import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BufferedReaderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileReader fr=null;
		BufferedReader br=null;
		
		
		try {
			fr=new FileReader("C:\\gpFolder\\gpJava\\myFile2.txt");
			br=new BufferedReader(fr);
			int count=0;
			
			String line;
			while((line=br.readLine())!=null){
			StringTokenizer st=new StringTokenizer(line)	;
			
			while(st.hasMoreTokens()){
				System.out.println(st.nextToken());
				count++;
			}
				
			}
			System.out.println("no of cwords  "+count);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}




/*welcome
to
IO
Streamss
www
welcome
to
IO
Streamss
aaa
welcome
to
IO
Streamss
bbb
no of cwords  15*/
