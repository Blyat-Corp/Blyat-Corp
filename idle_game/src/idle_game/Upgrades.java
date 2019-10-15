package idle_game;

public class Upgrades {
	double upgradeModifier;
	String upgradeName;
	double price;
	int flatAdd;
	int bought;
	
	
	public Upgrades(int pFlatAdd, double pUpgradeModifier, String pName, int pPrice) {
		this.upgradeModifier = pUpgradeModifier;
		this.upgradeName = pName;
		this.flatAdd = pFlatAdd;
		this.price = pPrice;
		
	}

}
