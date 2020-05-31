package comparatorbasedlength;

import java.util.Comparator;

public class StringBufferComparator implements Comparator<StringBuffer> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compare(StringBuffer o1, StringBuffer o2) {
		// TODO Auto-generated method stub
		/*
		String s1=o1.toString();
		String s2=o2.toString();
		return s1.compareTo(s2);*/
		
		int l1=o1.length();
		int l2=o2.length();
		
		
		if(l1<l2){
			return -1;
		}else if(l1>l2){
			return 1;
		}else{
			return 0;
		}
	}

}
