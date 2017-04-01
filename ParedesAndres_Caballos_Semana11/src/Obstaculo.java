import processing.core.PApplet;

public class Obstaculo{
	
	private Pista p;
	private float posX;
	private float posY;
	private int tamano;
	
	Obstaculo(Pista p, float posX, float posY){
		this.p = p;
		this.posX = posX;
		this.posY = posY;
		tamano = 20;
	}

	public void pintar(PApplet app){
		app.fill(0,255,255);
		app.rectMode(app.CENTER);
		app.rect(posX, posY, tamano, tamano);
		app.rectMode(app.CENTER);
	}

	public float getPosX() {
		return posX;
	}

	public void setPosX(float posX) {
		this.posX = posX;
	}

	public float getPosY() {
		return posY;
	}

	public void setPosY(float posY) {
		this.posY = posY;
	}

	public int getTamano() {
		return tamano;
	}

	public void setTamano(int tamano) {
		this.tamano = tamano;
	}

	
}
