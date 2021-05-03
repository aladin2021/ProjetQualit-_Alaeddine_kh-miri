package junit.monprojet;

import java.util.Set;

public class SommeArgent {
	
		private int quantite; 
		private String unite;
		
	    public SommeArgent(int amount, String currency) { 
		    quantite = amount;
	        unite = currency;
	    }
	    public int getQuantite() {
	        return quantite;
	    }
	    public String getUnite() {
	        return unite;
	    }
	    public SommeArgent add(SommeArgent m) {
		       return new SommeArgent(getQuantite()+m.getQuantite(), getUnite());
		   }
	    public SommeArgent (SommeArgent m) throws UniteDistincteException {
	    	if (!m.getUnite().equals(this.getUnite())) {
	    	throw new UniteDistincteException(this, m);
	    	}
	    	else return new SommeArgent(getQuantite()+m.getQuantite(), getUnite());
	    	}
	 
	    public boolean equals(Object anObject)  {
	    	
	    	if (anObject == null) return false;
	    	if (anObject instanceof SommeArgent) {
	    		SommeArgent aMoney = (SommeArgent)anObject;
	    		return aMoney.getUnite().equals(getUnite())
	    				&& getQuantite() == aMoney.getQuantite();
	    	}
	    	return false;
	    }
	    public String toString() {
	    	
	    	 
			Set<String> lesCles =contenu.keySet();
	    	StringBuffer aAfficher =  new StringBuffer("contenu du porte monnaie : \n");
	    	
	    	for (String uneCle : lesCles) {
	    		aAfficher.append(contenu.get(uneCle) + "" + uneCle);
	    	}
	    	return aAfficher.toString();
	    }
}


