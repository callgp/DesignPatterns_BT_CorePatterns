package immutable;

public class ImmutableDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="Hello";
		String s2="world";
		
		
		System.out.println("before concat..."+s1+"..."+s2);
		s1.concat(s2);
		System.out.println("after concat.."+s1+"..."+s2);
	}

}


/*before concat...Hello...world
after concat..Hello...world*///creates new  string but separte one

//if you assign back effected...s1.concat(s2);
//s1.concat(s2); if do without assignment after some time garbage collected
