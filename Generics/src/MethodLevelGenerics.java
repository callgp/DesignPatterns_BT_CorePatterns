
public class MethodLevelGenerics {
public <T> void method(T t){
	
}

public <T extends Runnable> void method2(T t){
	
}

public <T extends Runnable&Comparable<String>> method3(T t){
	
}
}
//generic compile time not run times
//right date sent by compieler
//once done it removes it..called type erasure...list map everywhere type erased later on
//done for backward compatible..for running older versions.. important
//sun never mandates..then old code wont work an d all need to rewritted headache