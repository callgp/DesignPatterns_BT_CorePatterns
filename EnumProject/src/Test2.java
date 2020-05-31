
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PaymentType pt=PaymentType.CREDIT;
		System.out.println(pt);//toString overriden to retunr name of constant
		
		PaymentType[] values = PaymentType.values();
		for(PaymentType paymentType:values){
			System.out.println(paymentType);
			System.out.println(paymentType.ordinal());//gives position of each cosntant
		
		}

	}

}
