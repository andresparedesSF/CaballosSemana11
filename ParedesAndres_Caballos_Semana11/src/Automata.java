import processing.core.PApplet;

public abstract class Automata implements Runnable{
	
	protected Pista ref;
	protected float posX, posY;
	private boolean vivo;
	
	Automata(Pista ref, float posX, float posY){
		this.ref = ref;
		this.posX = posX;
		this.posY = posY;
		vivo = true;
	}

	public abstract void pintar(PApplet app);
	
	public abstract void mover();
	
	public void run() {
		while(vivo){
			try{
				mover();
				Thread.sleep(33);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
	
	
	
	

	public Pista getRef() {
		return ref;
	}

	public void setRef(Pista ref) {
		this.ref = ref;
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

	public boolean isVivo() {
		return vivo;
	}

	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}
	
}
