
public enum PaymentType2 {//internally class..extens abstract class java lang Enum so you cannot extend any other..if you want you can implement interface but rare
	CASHS(33),CREDITS(44),DEBITS(55);//internally public static final objects

	
	 int fee;

	 PaymentType2(int fee) {//add default costucor or pass fee to abvove values ie class instances ie objects
		this.fee=fee;
		// TODO Auto-generated constructor stub
	}
	 
	 public int getFee(){
		 return this.fee;
	 }
}
//as class internally can create constructor etc but rare..also main method ok or any other method..getters ok
//end users to use more credit and debit not cash then add some charges you can assign fee