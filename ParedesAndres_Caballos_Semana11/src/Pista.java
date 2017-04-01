import java.util.ArrayList;

import processing.core.PApplet;

public class Pista {

	private ArrayList<Caballo> caballos;
	private ArrayList<Obstaculo> obs;
	private boolean iniciar=true;
	private PApplet app;
	//private Thread hilo;
	
	public Pista(PApplet app){
		this.app = app;
		caballos= new ArrayList<Caballo>();
		obs = new ArrayList<Obstaculo>();
		for (int i = 0; i <10; i++) {
			caballos.add(	new Caballo(	app,this, 100, (i*40) + 100,  ((float)(1 + Math.random() * 5)))) ;
			obs.add( new Obstaculo(this, 600, (i*40) + 100));
		}
		
	}
	
	public void mostrar(PApplet app){
		for (int i = 0; i < caballos.size(); i++) {
			Caballo c = caballos.get(i);
			c.pintar(app);
			c.parar();
			Obstaculo o = obs.get(i);
			o.pintar(app);
			posiciones(app);
		}
	}
	
	public void posiciones(PApplet app){
		
		
		int llegada = 0;
		for (int i = 0; i < caballos.size(); i++) {
			
			Caballo  c = caballos.get(i);
			if(c.isTerminar() == false){
				llegada+=1;
				app.text(llegada, 50,  (i*40) + 100);
			}
		}
		
	}
	
	public void disparar(){
		if(iniciar==true){
			for (int i = 0; i < caballos.size(); i++) {
				Thread hilo = new Thread(caballos.get(i));
				hilo.start();
			}
		iniciar=false;
		}
	}

	public ArrayList<Caballo> getCaballos() {
		return caballos;
	}

	public void setCaballos(ArrayList<Caballo> caballos) {
		this.caballos = caballos;
	}

	public ArrayList<Obstaculo> getObs() {
		return obs;
	}

	public void setObs(ArrayList<Obstaculo> obs) {
		this.obs = obs;
	}

	public boolean isIniciar() {
		return iniciar;
	}

	public void setIniciar(boolean iniciar) {
		this.iniciar = iniciar;
	}

	public PApplet getApp() {
		return app;
	}

	public void setApp(PApplet app) {
		this.app = app;
	}
	
	
}
