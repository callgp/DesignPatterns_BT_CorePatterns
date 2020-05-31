package com.gp.set;

import java.util.HashSet;
import java.util.Random;

public class DifferentSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random obj=new Random();
		
		HashSet<Integer> set=new HashSet<>();
		for(int i=1;i<=5;i++){
			int number=obj.nextInt(10);
			set.add(number);
			
			System.out.println(number);
		}

		System.out.println("hashset elements "+set);
	}

}

//duplicate 7 element removed by hasset
/*7
2
9
7
0
hashset elements [0, 2, 7, 9]*/

//below for 100...see duplicates removed by hashset


/*30
39
39
2
82
hashset elements [2, 82, 39, 30]*/
//duplicate 39 is gone
