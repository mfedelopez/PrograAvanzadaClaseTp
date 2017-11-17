package unidad;

/**
 * @author Lucas
 * Esta clase act�a como Template Method
 * Hace que sea una plantilla para todas las clases hijos que tenga.
 */
public abstract class Unidad {

	private static final double MULTIPLICADORDEFENSA = 1;
	private static final double INICIOENERGIA = 0;
	protected double saludTope;
	protected double energiaTope;
	protected double salud;
	protected double ataque;
	protected double energia;
	protected double defensa;
	protected Punto ubicacion;

	public Unidad() {
	}

	public Unidad(double salud, double ataque, Punto ubicacion) {
		this.salud = salud;
		this.saludTope = salud;
		this.ataque = ataque;
		this.ubicacion = ubicacion;
		this.defensa = MULTIPLICADORDEFENSA;
		this.energia = INICIOENERGIA;
		this.energiaTope = INICIOENERGIA;
	}
	
	public Unidad(double salud, double ataque, Punto ubicacion, double energia) {
		this(salud,ataque,ubicacion);
		this.energia = energia;
		this.energiaTope = energia;
	}
	
	public double getEnergia() {
		return energia;
	}

	public void setEnergia(double energia) {
		this.energia = energia;
	}
	
	public double getSalud() {
		return salud;
	}

	public void setSalud(double salud) {
		this.salud = salud;
	}

	public double getAtaque() {
		return ataque;
	}

	public double getEnergiaTope() {
		return energiaTope;
	}

	public void setEnergiaTope(double energiaTope) {
		this.energiaTope = energiaTope;
	}

	public void setAtaque(double ataque) {
		this.ataque = ataque;
	}

	public Punto getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(Punto ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	public double getDefensa() {
		return defensa;
	}

	public void setDefensa(double defensa) {
		this.defensa = defensa;
	}

	protected double distanciaConEnemigo(Punto ubicacionEnemigo) {
		return this.ubicacion.distanciaHasta(ubicacionEnemigo);
	}

	public abstract Unidad atacar(Unidad enemigo);
	
	public Unidad defender(Unidad enemigo) {
		double ataqueReal = (enemigo.ataque*this.defensa);
		if ( ataqueReal< this.salud)
			this.salud -= ataqueReal;
		else
			this.salud = 0;
		return this;
	}
	
	
}
