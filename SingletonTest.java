import static org.junit.Assert.*;

public class SingletonTest {
	
	 static singleton ShahadSn; 
	 
@Before
	 public void SetUpclass() {
		 ShahadSn = singleton.getInstance();
	 }
@Test	
public void TestSetconfig() {
	 ShahadSn.setShconfig(20);
	 assertEquals(20,ShahadSn.getShconfig);
}

}
