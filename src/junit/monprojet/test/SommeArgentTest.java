package junit.monprojet.test;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import junit.monprojet.SommeArgent;
import junit.monprojet.UniteDistincteException;



public class SommeArgentTest {
	private SommeArgent m12CHF;
	private SommeArgent m14CHF;
	
	private static int nbPasseDansInit = 0;
	private static int nbPasseDansAfter = 0;
	@Before
	public void initialisations(){
		m12CHF= new SommeArgent(12, "CHF"); // (1)
		m14CHF= new SommeArgent(14, "CHF");
	System.out.println(++nbPasseDansInit + "1ime passage avant exécution d'une méthode de test");
	}
	@After
	public void apresTest() {
		System.out.println(++nbPasseDansAfter + "1ime passage APRES exécution d'une méthode de test");
	}
	
	
	private int getQuantite() {
		 //TODO Auto-generated method stub
		 return 0;
	}
	private Object getUnite() {
	     // TODO Auto-generated method stub
	return null;
    }
	
	@Test
	public void testAdd(){
		SommeArgent m12CHF= new SommeArgent(12, "CHF"); // (1)
		SommeArgent m14CHF= new SommeArgent(14, "CHF");
		SommeArgent expected = new SommeArgent(26, "CHF"); 
		SommeArgent result = m12CHF.add(m14CHF); // (2) 
		Assert.assertTrue(expected.equals(result)); // (3)
	}
	@Test
	  public void testAdd(SommeArgent m) throws UniteDistincteException {
		SommeArgent expected = new SommeArgent(26, "CHF"); 
		SommeArgent result = m12CHF.add(m14CHF); // (2) 
		Assert.assertTrue(expected.equals(result)); // (3)
	}
	@Test(expected = UniteDistincteException.class)
	public void leveExceptionPourAddition() throws UniteDistincteException {
		SommeArgent autreSomme = new SommeArgent(12, "USD");
		m12CHF.add(autreSomme);
	}
	
	
	@Test
	public void TestEquals(){
		SommeArgent m12CHF= new SommeArgent(12, "CHF"); 
		SommeArgent m14CHF= new SommeArgent(14, "CHF"); 
		SommeArgent m14USD= new SommeArgent(14, "USD");
		Assert.assertTrue(!m12CHF.equals(null));
		Assert.assertEquals(m12CHF, m12CHF);
		Assert.assertEquals(m12CHF, new SommeArgent(12, "CHF")); // (1)
		Assert.assertTrue(!m12CHF.equals(m14CHF));
		Assert.assertTrue(!m14USD.equals(m14CHF));
	}

	
}
