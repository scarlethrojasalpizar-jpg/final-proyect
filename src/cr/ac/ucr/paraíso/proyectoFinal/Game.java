package cr.ac.ucr.paraíso.proyectoFinal;

import cr.ac.ucr.paraíso.proyectoFinal.model.Character;

import java.util.Scanner;

public class Game {

    public class Juego {

        public static void main(String[] args) {

            Scanner teclado = new Scanner(System.in);

                Character jugador = new Character("Caballero", 100, 20, 0, 0);
            Enemy enemy = new Enemy.Enemy ("Orco", 80, 15, 5, 5);

            System.out.println("=== COMIENZA EL JUEGO ===");

            while (jugador.estaVivo() && enemy.estaVivo()) {

                System.out.println("\nVida del jugador: " + jugador.getVidaActual());
                System.out.println("Vida del enemigo: " + ((Enemy.Enemy) enemy).getVidaActual());

                System.out.println("\n1. Atacar");
                System.out.println("2. Salir");

                int opcion = teclado.nextInt();

                if (opcion == 1) {

                    jugador.atack(enemy);
                    System.out.println("¡Atacaste al enemigo!");

                    if (enemy.estaVivo()) {
                        enemy.atack(jugador);
                        System.out.println("El enemigo te atacó.");
                    }

                } else {
                    System.out.println("Juego terminado.");
                    break;
                }
            }

            if (!Enemy.estaVivo()) {
                System.out.println("\n¡Ganaste!");
            }

            if (!jugador.estaVivo()) {
                System.out.println("\nPerdiste.");
            }

            teclado.close();
        }
    }
}
