package ProgramacionOrientadoObjetos;

public class Guerrero extends Personaje {
    private int fuerza;

    public Guerrero(String nombre, int vida, int ataque, int fuerza) {
        super(nombre, vida, ataque);
        setFuerza(fuerza);
    }

    @Override
    public int atacar() {
        return getAtaqueBase() + fuerza;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Guerrero -> Nombre: " + getNombre() + " | Vida: " + getVida() + " | Ataque: " + getAtaque() + " | Fuerza: " + fuerza);
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = Math.max(0, fuerza);
    }
}
