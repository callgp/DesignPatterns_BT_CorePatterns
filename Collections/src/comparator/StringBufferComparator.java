package comparator;

import java.util.Comparator;

public class StringBufferComparator implements Comparator<StringBuffer> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compare(StringBuffer o1, StringBuffer o2) {
		// TODO Auto-generated method stub
		
		String s1=o1.toString();
		String s2=o2.toString();
		return s1.compareTo(s2);
	}

}
