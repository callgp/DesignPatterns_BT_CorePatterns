package com.gp.custom.exceptions;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//throw new UncheckedCustomExceptions("business exception occureed");
		try {
			throw new CheckedCustomExceptions("business exception needs to be handled for checked");
		} catch (CheckedCustomExceptions e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
