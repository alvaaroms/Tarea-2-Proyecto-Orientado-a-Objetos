package ProgramacionOrientadoObjetos;

public class Combate {
    public static void luchar(Personaje a, Personaje b) {
        if (a == null || b == null) {
            System.out.println("Combate invalido.");
            return;
        }

        System.out.println("== COMBATE ==");
        a.mostrarInfo();
        b.mostrarInfo();

        int turno = 1;
        while (a.estaVivo() && b.estaVivo()) {
            System.out.println("-- Turno " + turno + " --");
            ejecutarAtaque(a, b);
            if (b.estaVivo()) {
                ejecutarAtaque(b, a);
            }
            aplicarCuracionSiProcede(a, turno);
            aplicarCuracionSiProcede(b, turno);
            System.out.println(a.getNombre() + " Vida: " + a.getVida() + " | " + b.getNombre() + " Vida: " + b.getVida());
            turno++;
        }

        Personaje ganador = a.estaVivo() ? a : b;
        System.out.println("Ganador: " + ganador.getNombre());
    }

    private static void ejecutarAtaque(Personaje atacante, Personaje defensor) {
        if (!atacante.estaVivo() || !defensor.estaVivo()) {
            return;
        }
        int danio = atacante.atacar();
        defensor.recibirDanio(danio);
        System.out.println(atacante.getNombre() + " ataca por " + danio + " a " + defensor.getNombre());
    }

    private static void aplicarCuracionSiProcede(Personaje personaje, int turno) {
        if (personaje instanceof Curable && personaje.estaVivo() && turno % 3 == 0) {
            ((Curable) personaje).curar(5);
            System.out.println(personaje.getNombre() + " se cura 5 puntos.");
        }
    }
}

