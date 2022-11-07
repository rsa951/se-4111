import static org.junit.Assert.*;

public class SingletonTest {
	
	 static singleton ShahadSn; 
	 static singleton AshwaqSn1; 
	 static singleton RemaSn2; 

@Before
	 public void SetUpclass() {
		 ShahadSn = singleton.getInstance();
		AshwaqSn1 = singleton.getInstance();
		RemaSn2 = singleton.getInstance();
		
		 
	 }
@Test	
public void TestSetconfig() {
	 ShahadSn.setShconfig(20);
	 assertEquals(20,ShahadSn.getShconfig);
	 AshwaqSn1.setAshconfig(40);
	 assertEquals(40,AshwaqSn1.getAshconfig);
	 RemaSn2.setReconfig(60);
	 assertEquals(60,RemaSn2.getReconfig);
}

}
