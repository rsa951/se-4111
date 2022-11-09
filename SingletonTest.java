import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import lll.Sc;

class SingletonTest {
	
	static Singleton ShahadSn;
	 static Singleton AshwaqSn1; 
	
	@BeforeEach
	static void setUpBeforeClass()  {
		ShahadSn = Singleton.getInstance();
		AshwaqSn1 = Singleton.getInstance();
		 	
	}

	@Test
	void testSetShconfig() {
		ShahadSn.setShconfig(20);
		 assertEquals(20,ShahadSn.getShconfig());
		 AshwaqSn1.setAshconfig(40);
		 assertEquals(40,AshwaqSn1.getAshconfig);
		 
	}

}


