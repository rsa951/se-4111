import static org.junit.Assert.*;



public class SingeltonTest {
	 static singleton ShahadSn; 
	 
    @Before
	 public void setUpClass() {
		 ShahadSn = singleton.getInstance();
	 }
    @Test	
public void TestSetconfig() {
	 ShahadSn.(20);
	 assertEquals(20,ShahadSn.getShconfig);
}
}
