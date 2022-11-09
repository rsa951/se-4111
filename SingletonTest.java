import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
class SingletonTest {
	static Singleton ShahadSn;
	 static Singleton AshwaqSn1; 
	 static Singleton RemaSn2; 
@BeforeEach
	static void setUpBeforeClass()  {
		ShahadSn = Singleton.getInstance();
		AshwaqSn1 = Singleton.getInstance();
		RemaSn2 = Singleton.getInstance(); }
@Test
	void testSetShconfig() {
		ShahadSn.setShconfig(20);
		 assertEquals(20,ShahadSn.getShconfig());
		 }
@Test
      void testSetAshconfig() {
		 AshwaqSn1.setAshconfig(40);
		 assertEquals(40,AshwaqSn1.getAshconfig);
		 }
@Test
    void testSetReconfig() {
    	 RemaSn2.setReconfig(60);
		 assertEquals(60,RemaSn2.getReconfig);
	 
}
}
