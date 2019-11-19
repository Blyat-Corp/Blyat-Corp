package idle_game;

import processing.core.PApplet;

public class Upgrades {
	double upgradeModifier;
	String upgradeName;
	double price;
	int flatAdd;
	int bought;
	int i = 0;
	PApplet main;
	int buttonY1;
	int buttonY2;
	
	public Upgrades(PApplet p, int pFlatAdd, double pUpgradeModifier, String pName, int pPrice, int pY1, int pY2) {
		this.upgradeModifier = pUpgradeModifier;
		this.upgradeName = pName;
		this.flatAdd = pFlatAdd;
		this.price = pPrice;
		this.buttonY1 = pY1;
		this.buttonY2 = pY2;
		main = p;

	}

	public void upgrade() {
		i++;
		System.out.println(i);
		if (this.bought > 0) {

			if (i % 60 == 0) {
				Main.points = Main.points + (this.bought * this.upgradeModifier) + this.flatAdd;

			}
		}
		if (i == 61) {
			i = 0;
		}
	}

	public void buy() {
		if (main.mouseX >= 480 && main.mouseX <= 580 && main.mouseY >= buttonY1 && main.mouseY <= buttonY2) {
			if (Main.points >= this.price) {
				Main.points = Main.points - (int) this.price;
				this.bought++;
				if (this.bought > 0) {
					this.price = this.price * Main.priceMod;
					this.price = (int) this.price;
				}

			}
		}
	}
}