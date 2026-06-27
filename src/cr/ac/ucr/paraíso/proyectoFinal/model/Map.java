package cr.ac.ucr.paraíso.proyectoFinal.model;

import cr.ac.ucr.paraíso.proyectoFinal.Enemy;

public class Map {
    public boolean esCeldaTransitable(int x, int y) {
return false;
        class Mapa {

            private int filas;
            private int columnas;

            public Mapa(int filas, int columnas) {
                this.filas = filas;
                this.columnas = columnas;
            }

            public void mostrarMapa(Character jugador, Enemy enemigo) {

                for (int i = 0; i < filas; i++) {

                    for (int j = 0; j < columnas; j++) {

                        if (i == jugador.getPosY() && j == jugador.getPosX()) {
                            System.out.print(" J ");
                        } else if (i == enemigo.getPosY() && j == enemigo.getPosX()) {
                            System.out.print(" E ");
                        } else {
                            System.out.print(" . ");
                        }
                    }

                    System.out.println();
                }
            }
        }
    }
}
