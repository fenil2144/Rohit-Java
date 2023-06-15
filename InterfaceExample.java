import java.io.Serializable;

interface Language{
	
	String name  = "Python";
	
	void getName(String name);
	void getNumberOfCharachters();
	default void printNumber() {
		System.out.println("I am printing Number");
	}
	
}

class JavaLanguage extends HelloWorld implements Language,Serializable {

	@Override
	public void getName(String name) {
		System.out.println("Name: "+name);
	}

	@Override
	public void getNumberOfCharachters() {
		System.out.println("I am Returning Number of Characters");
	}
	public void depositDigitalCurrency() {
		System.out.println("I am Depositing Digital Currencies");
	}
	
}



public class InterfaceExample extends JavaLanguage{
	public static void main(String[] args) {
//		Language interfaceObj  = new Language();
		JavaLanguage javaLanguageObj = new JavaLanguage();
		javaLanguageObj.getName("Java");
		javaLanguageObj.depositDigitalCurrency();
	}

	
	

}
