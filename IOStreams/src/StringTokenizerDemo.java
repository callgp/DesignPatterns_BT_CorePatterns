import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String s="you are creator of your destiny";
		String s="you,are,creator,of,your,destiny";
		
	StringTokenizer st=new StringTokenizer(s,",",false);
	while(st.hasMoreTokens()){
		System.out.println(st.nextToken());
	}
	}

}

//with true
/*you
,
are
,
creator
,
of
,
your
,
destiny*/


//with false
/*you
are
creator
of
your
destiny
*/