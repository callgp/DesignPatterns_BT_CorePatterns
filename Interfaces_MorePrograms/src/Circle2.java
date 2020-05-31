
public interface Circle2 {
	
	//abstract void calculateArea();//abstract is redundant
	
	//private void calculateArea();//Illegal modifier for the interface method calculateArea; only public, abstract, default, static and strictfp are permitted
	
	float pi=3.14f;//ok to have variables in interfaces..by default public static final
	void calculateArea(float radius);
	void calculateArea();
	//int calculateArea();//cannot change to int as it breaks method signature
}
