import processing.core.PApplet;

public class Caballo extends Automata {
	
	private PApplet app;
	private int tamano;
	private float velocidad;
	private boolean terminar;
	
	Caballo(PApplet app,Pista p, float posX, float posY, float velocidad){
		super(p, posX, posY);
		tamano = 20;
		this.velocidad = velocidad;
		this.app = app;
		terminar = true;
	}

	public void pintar(PApplet app){
		app.fill(0);
		app.ellipse(posX, posY, tamano, tamano);
	}
	
	public void mover(){
		if(terminar){
			posX+=velocidad;
		}
	}
	
	public void parar(){
		
		if(posX >= app.width){
			terminar = false;
		}
	}
	
	public void caer(Obstaculo refObs){
		if(posX == refObs.getPosX()){
			tamano = 25;
		}
	}
	

	public boolean isTerminar() {
		return terminar;
	}

	public void setTerminar(boolean terminar) {
		this.terminar = terminar;
	}

}
