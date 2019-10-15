package idle_game;

import processing.core.PApplet;

public class Main extends PApplet {
	double priceMod = 1.7;
	int points = 0;
	Upgrades clicker = new Upgrades(1, 1.001, "Auto-Clicker", 10);

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

		// coords(); //Methode um Koordinaten zu sehen

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
	}

	public void coords() {
		System.out.println(mouseX + ", " + mouseY);

	}

	public void counter() {
		fill(47, 143, 73);
		rect(width / 4, 50, 400, 100);
		fill(0, 0, 0);
		textAlign(CENTER);
		text(points, 400, 125);
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
		if (mouseX >= 480 && mouseX <= 580 && mouseY >= 200 && mouseY <= 230) {
			if (points >= clicker.price) {
				points = points - (int) clicker.price;
				clicker.bought++;
				System.out.println(clicker.bought);
				if (clicker.bought > 0) {
					clicker.price = clicker.price * priceMod;
					clicker.price = (int) clicker.price;
				}

			}

		}
	}
}
