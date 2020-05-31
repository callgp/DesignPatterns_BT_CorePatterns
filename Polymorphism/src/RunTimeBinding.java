
public class RunTimeBinding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AppleLaptop m1=new MACBookPro();
		m1.start();
		m1.shutdown();
	//	m1.prosmethod();//not visible as applelaptop type due to run time polymorphism cannot see child specific method..so do downcast to see that specific child method using specic child reference
		
		MACBookPro m3=(MACBookPro)m1;
		m3.prosmethod();//we can see here child specific method..then downcast to see that
		
		AppleLaptop m2=new MACBookAir();
		m2.start();
		m2.shutdown();
		
		MACBookAir m4=(MACBookAir)m2;
	}

}
