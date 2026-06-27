package cr.ac.ucr.paraíso.proyectoFinal.model;

import cr.ac.ucr.paraíso.proyectoFinal.Enemy;

public class Character {
    public Character(String nombre, int vidaMax, int fuerzaAtaque, int posX, int posY) {
    }

    public static void atack(Enemy enemy) {
    }

    public boolean estaVivo() {


        String getVidaActual;
        {

            int getPosY;
            {


                int getPosX;
                {


                    class Personaje {
                        private String nombre;
                        private int vidaMax;
                        private int vidaActual;
                        private int fuerzaAtaque;
                        private int posX;
                        private int posY;

                        public Personaje(String nombre, int vidaMax, int fuerzaAtaque, int posX, int posY) {
                            this.nombre = nombre;
                            this.vidaMax = vidaMax;
                            this.vidaActual = vidaMax; // Inicia con la vida al máximo
                            this.fuerzaAtaque = fuerzaAtaque;
                            this.posX = posX;
                            this.posY = posY;
                        }

                        public boolean estaVivo() {
                            return this.vidaActual > 0;
                        }

                        public void recibirDano(int cantidad) {
                            this.vidaActual -= cantidad;
                            if (this.vidaActual < 0) {
                                this.vidaActual = 0;
                            }
                        }

                        public void atack(Enemy.Enemigo objetivo) {
                            if (objetivo != null && this.estaVivo()) {
                                objetivo.recibirDano(this.fuerzaAtaque);
                            }
                        }

                        // Getters y Setters
                        public String getNombre() {
                            return nombre;
                        }

                        public void setNombre(String nombre) {
                            this.nombre = nombre;
                        }

                        public int getVidaMax() {
                            return vidaMax;
                        }

                        public void setVidaMax(int vidaMax) {
                            this.vidaMax = vidaMax;
                        }

                        public int getVidaActual() {
                            return vidaActual;
                        }

                        public void setVidaActual(int vidaActual) {
                            this.vidaActual = vidaActual;
                        }

                        public int getFuerzaAtaque() {
                            return fuerzaAtaque;
                        }

                        public void setFuerzaAtaque(int fuerzaAtaque) {
                            this.fuerzaAtaque = fuerzaAtaque;
                        }

                        public int getPosX() {
                            return posX;
                        }

                        public void setPosX(int posX) {
                            this.posX = posX;
                        }

                        public int getPosY() {
                            return posY;
                        }

                        public void setPosY(int posY) {
                            this.posY = posY;
                        }
                    }
                }
            }
        }


        int getPosY ;{
            return 0;
        }
    }

    public String getVidaActual() {
        return "";
    }

    public int getPosX() {
        return 0;
    }

    public int getPosY() {
        return 0;
    }
}