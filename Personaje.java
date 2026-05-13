package ProgramacionOrientadoObjetos;

public abstract class    Personaje {
    private String nombre;
    private int vida;
    private int ataque;

    protected Personaje(String nombre, int vida, int ataque) {
        setNombre(nombre);
        setVida(vida);
        setAtaque(ataque);
    }

    public abstract int atacar();

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + " | Vida: " + vida + " | Ataque: " + ataque);
    }

    public void recibirDanio(int danio) {
        if (danio <= 0) {
            return;
        }
        vida = Math.max(0, vida - danio);
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            this.nombre = "SinNombre";
            return;
        }
        this.nombre = nombre.trim();
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = Math.max(0, vida);
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = Math.max(0, ataque);
    }

    protected int getAtaqueBase() {
        return ataque;
    }
}

