package cr.ac.ucr.paraíso.proyectoFinal;

import cr.ac.ucr.paraíso.proyectoFinal.model.Character;

public class Enemy {
    public static boolean estaVivo() {
        return false;
    }

    public void atack(Character jugador) {
    }

    public int getPosY() {
        return 0;
    }

    public int getPosX() {
        return 0;
    }

    public static class Enemigo extends Character {

        public Enemigo(String nombre, int vidaMax, int fuerzaAtaque, int posX, int posY) {
            super(nombre, vidaMax, fuerzaAtaque, posX, posY);
        }

        public void atackJugador(Character jugador) {
            enemy enemy;
            Enemigo Character = null;
            atack (Character);
        }

        private void atack(Character jugador) {
        }

        public int estaVivo() {
            return 0;
        }

        public String getVidaActual() {
            return "";
        }

        public void recibirDano(int fuerzaAtaque) {
        }
    }

    public static class enemy extends cr.ac.ucr.paraíso.proyectoFinal.Enemy {
        public enemy(String orco, int i, int i1, int i2, int i3) {
            super();
        }

        public String getVidaActual() {
            return "";
        }
    }
}
