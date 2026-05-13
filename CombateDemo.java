package ProgramacionOrientadoObjetos;

public class CombateDemo {
    public static void main(String[] args) {
        Personaje guerrero = new Guerrero("Leon", 40, 8, 4);
        Personaje mago = new Mago("Nora", 30, 6, 10);
        Personaje arquero = new Arquero("Iris", 35, 7, 5);

        Combate.luchar(guerrero, mago);
        System.out.println();

        Personaje arquero2 = new Arquero("Pax", 32, 7, 6);
        Personaje guerrero2 = new Guerrero("Dante", 45, 9, 3);
        Combate.luchar(arquero2, guerrero2);
    }
}

