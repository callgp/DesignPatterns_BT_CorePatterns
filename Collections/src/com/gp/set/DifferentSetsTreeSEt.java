package com.gp.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;

public class DifferentSetsTreeSEt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random obj=new Random();
		
		//HashSet<Integer> set=new HashSet<>();
		
		LinkedHashSet<Integer> set=new LinkedHashSet<>();
		
		for(int i=1;i<=5;i++){
			int number=obj.nextInt(10);
			set.add(number);
			
			System.out.println(number);
		}

		System.out.println("linked hashset elements "+set);
	}

}
//no duplicate 9... also stores in same order of 9 then 7 then 0
/*9
7
0
9
0
linked hashset elements [9, 7, 0]*/


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
