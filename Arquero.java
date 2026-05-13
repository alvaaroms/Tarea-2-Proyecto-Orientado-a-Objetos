package ProgramacionOrientadoObjetos;

public class Arquero extends Personaje {
    private int precision;

    public Arquero(String nombre, int vida, int ataque, int precision) {
        super(nombre, vida, ataque);
        setPrecision(precision);
    }

    @Override
    public int atacar() {
        return getAtaqueBase() + precision;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Arquero -> Nombre: " + getNombre() + " | Vida: " + getVida() + " | Ataque: " + getAtaque() + " | Precision: " + precision);
    }

    public int getPrecision() {
        return precision;
    }

    public void setPrecision(int precision) {
        this.precision = Math.max(0, precision);
    }
}

