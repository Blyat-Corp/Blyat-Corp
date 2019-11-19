package idle_game;

import processing.core.PApplet;

public class Main extends PApplet {
	public static double points = 0;
	public static double priceMod = 1.7;
	Upgrades clicker = new Upgrades(this, 1, 1.1, "Auto-Clicker", 10, 200, 300);

	public static void main(String[] args) {

		PApplet.main("idle_game.Main");

	}

	public void settings() {
		size(800, 800);

	}

	public void setup() {
		frameRate(60);
	}

	public void draw() {

		fill(90, 150, 70);
		background(30, 100, 69);
		buyMenu();
		counter();
		cursor();
		clicker.upgrade();
		coords(); //Methode um Koordinaten zu sehen

	}

	private void buyMenu() {
		fill(47, 143, 73);
		rect(200, 170, 400, 600);
		button();

	}

	private void button() {
		fill(93, 148, 100);
		rect(480, 200, 100, 30);
		fill(0);
		textSize(25);
		textAlign(LEFT);
		text((int) clicker.price, 500, 225);
		text(clicker.bought, 450, 225);
	}

	public void coords() {
		fill(0);
		text(mouseX,100,100);
		text(mouseY,100,200);

	}

	public void counter() {
		fill(47, 143, 73);
		rect(width / 4, 50, 400, 100);
		fill(0, 0, 0);
		textAlign(CENTER);
		text((int) points, 400, 125);
		textSize(75);

	}

	public void cursor() {
		noCursor();
		fill(166, 145, 43);
		ellipse(mouseX, mouseY, 25, 25);
	}

	public void mouseClicked() {
		if (mouseX >= 200 && mouseX <= 600 && mouseY >= 50 && mouseY <= 150) {
			points = points + 1000;
		}
		clicker.buy();

	}

}
