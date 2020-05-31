
public interface Circle {
	
	//abstract void calculateArea();//abstract is redundant
	
	//private void calculateArea();//Illegal modifier for the interface method calculateArea; only public, abstract, default, static and strictfp are permitted
	
	float pi=3.14f;//must assign value as final //ok to have variables in interfaces..by default public static final
	void calculateArea();
}
