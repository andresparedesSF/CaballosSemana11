import processing.core.PApplet;

public class ControlVista extends PApplet{
	
	Pista p;
	
	@Override
	public void settings() {
		size(1200,700);
	}
	
	@Override
	public void setup() {
		p = new Pista(this);
	}
	
	@Override
	public void draw() {
		background(255);
		p.mostrar(this);
	}
	
	@Override
	public void mousePressed() {
		p.disparar();
	}
	
}
