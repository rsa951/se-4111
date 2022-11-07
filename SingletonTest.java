import static org.junit.Assert.*;

public class SingletonTest {
	
	 static singleton ShahadSn; 
	 
@Before
	 public void SetUpclass() {
		 ShahadSn = singleton.getInstance();
		AshwaqSn1 = singleton.getInstance();
		 
	 }
@Test	
public void TestSetconfig() {
	 ShahadSn.setShconfig(20);
	 assertEquals(20,ShahadSn.getShconfig);
	 AshwaqSn1.setAshconfig(40);
	 assertEquals(40,AshwaqSn1.getAshconfig);
}

}
