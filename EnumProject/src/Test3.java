
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PaymentType2 pt=PaymentType2.CREDITS;
		System.out.println(pt);//toString overriden to retunr name of constant
		
		PaymentType2[] values = PaymentType2.values();
		for(PaymentType2 paymentType:values){
			System.out.println(paymentType);
			System.out.println(paymentType.ordinal());//gives position of each cosntant
			System.out.println(paymentType.getFee());
		}

	}

}
//CASHS(33),CREDITS(44),DEBITS(55);

/*CREDITS
CASHS
0
33
CREDITS
1
44
DEBITS
2
55*/
