package cr.ac.ucr.paraíso.proyectoFinal;

import cr.ac.ucr.paraíso.proyectoFinal.model.Character;

public class Enemy {
    public static boolean estaVivo() {
    }

    public void atack(Character jugador) {
    }

    public static class Enemigo extends Character {

        public Enemigo(String nombre, int vidaMax, int fuerzaAtaque, int posX, int posY) {
            super(nombre, vidaMax, fuerzaAtaque, posX, posY);
        }

        public void atackJugador(Character jugador) {
            Enemy enemy;
            Enemigo Character = null;
            atack (Character);
        }

        private void atack(Character jugador) {
        }

        public boolean estaVivo() {
        }

        public String getVidaActual() {
        }

        public void recibirDano(int fuerzaAtaque) {
        }
    }

    public static class Enemy extends cr.ac.ucr.paraíso.proyectoFinal.Enemy {
        public Enemy(String orco, int i, int i1, int i2, int i3) {
            super();
        }

        public String getVidaActual() {
        }
    }
}
