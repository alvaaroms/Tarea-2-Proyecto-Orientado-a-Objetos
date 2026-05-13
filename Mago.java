package ProgramacionOrientadoObjetos;

public class Mago extends Personaje implements Curable {
    private int mana;

    public Mago(String nombre, int vida, int ataque, int mana) {
        super(nombre, vida, ataque);
        setMana(mana);
    }

    @Override
    public int atacar() {
        return getAtaqueBase() + (mana / 2);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Mago -> Nombre: " + getNombre() + " | Vida: " + getVida() + " | Ataque: " + getAtaque() + " | Mana: " + mana);
    }

    @Override
    public void curar(int puntos) {
        if (puntos <= 0) {
            return;
        }
        setVida(getVida() + puntos);
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = Math.max(0, mana);
    }
}

