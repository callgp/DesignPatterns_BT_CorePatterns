package hashcode;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Passenger p=new Passenger();
		p.setFirstName("bb");
		p.setLastName("gg");
		p.setId(1234);
		System.out.println(p);//Passenger@15db9742 this comes from toString like class name a@ then hascode..object address used by jvm for hashcode value

		System.out.println(p.hashCode());//prints 1234 as we override hashcode and added id there in Passenger class

	
		Passenger p2=new Passenger();
		p.setFirstName("bb");
		p.setLastName("gg");
		p.setId(1234);
		System.out.println(p);//Passenger@15db9742 this comes from toString like class name a@ then hascode..object address used by jvm for hashcode value

		System.out.println(p.hashCode());//prints 1234 as we override hashcode and added id there in Passenger class

		
		System.out.println(p.equals(p2));//gives false..override equals
	}
	

}
