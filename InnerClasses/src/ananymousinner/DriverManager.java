package ananymousinner;

public class DriverManager {
	static Connection getConnection(){
		Connection con=new Connection(){

			@Override
			public void createStatement() {
				// TODO Auto-generated method stub
				System.out.println("anonymous inner class method");
				
			}
			
		};
		return con;
	}

}
