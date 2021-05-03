package junit.monprojet.test;

import org.junit.Assert;
import org.junit.Test;

import junit.monprojet.PorteMonnaie;
import junit.monprojet.SommeArgent;

public class PorteMonnaieTest {

	@Test
	public void test() {
		PorteMonnaie pm = new PorteMonnaie();
		SommeArgent sa1 =  new SommeArgent(5, "EUR");
		pm.ajouteSomme(sa1);
		SommeArgent sa2 = new SommeArgent(5, "EUR");
		pm.ajouteSomme(sa2);
		//System.out.println(pm);
		PorteMonnaie expected = new PorteMonnaie();
		SommeArgent lasommeTotale = new SommeArgent(10, "EUR" );
		expected.ajouteSomme(lasommeTotale);
		Assert.assertTrue(expected.equals(pm));
	}

}
