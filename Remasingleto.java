package proj;

public class Remasingleto {
private static Remasingleto ins; 
	
	private Remasingleto() {
		System.out.println("rema aldawood");
	}

	public static Remasingleto getInstance() {
	 if (ins== null) { 
		 ins = new Remasingleto(); 
	} 
	return ins;

}
}
