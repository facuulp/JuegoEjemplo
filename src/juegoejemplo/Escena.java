package juegoejemplo;

import java.util.Scanner;

public class Escena {

    private Auto auto;
    private Pared pared;

    public Escena(Auto auto) {
        this.auto = auto;
        this.pared = new Pared();
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    public void jugar() {
        boolean chocado=false;

        Scanner leer = new Scanner(System.in);

        do {
            
            
            System.out.println("--------------- MENU COMANDOS ---------------");
            System.out.println("w. Mover arriba" + "\n" + "s. Mover abajo" + "\n"
                    + "a. Mover izquierda" + "\n" + "d. Mover derecha" + "\n" + "e. Salir menú");

            System.out.print("Ingrese la opcion: ");
            String comando = leer.nextLine();

            switch (comando.toLowerCase()) {
                case "w":
                    auto.moverArriba();

                    System.out.println("-----------------------------------------------------------------");
                    System.out.println("Pared: " + "X:" + pared.getPosX() + " - " + "Y:" + pared.getPosY());
                    System.out.println("Posicion Auto: " + " X: " + auto.getPosX() + " Y: " + auto.getPosY());

                    if (auto.getPosX() == pared.getPosX() && auto.getPosY() == pared.getPosY()) {
                        System.out.println("El auto chocó");
                        chocado=true;
                        
                    }
                    break;

                case "s":
                    auto.moverAbajo();
                    
                    System.out.println("-----------------------------------------------------------------");
                    System.out.println("Pared: " + "X:" + pared.getPosX() + " - " + "Y:" + pared.getPosY());
                    System.out.println("Posicion Auto: " + " X: " + auto.getPosX() + " Y: " + auto.getPosY());
                    if (auto.getPosX() == pared.getPosX() && auto.getPosY() == pared.getPosY()) {
                        System.out.println("El auto chocó");
                        chocado=true;
                    }
                    break;

                case "a":
                    auto.moverIzquierda();
                    
                    System.out.println("-----------------------------------------------------------------");
                    System.out.println("Pared: " + "X:" + pared.getPosX() + " - " + "Y:" + pared.getPosY());
                    System.out.println("Posicion Auto: " + " X: " + auto.getPosX() + " Y: " + auto.getPosY());

                    if (auto.getPosX() == pared.getPosX() && auto.getPosY() == pared.getPosY()) {
                        System.out.println("El auto chocó");
                        chocado=true;
                    }
                    break;
                case "d":
                    auto.moverDerecha();
                    
                    System.out.println("-----------------------------------------------------------------");
                    System.out.println("Pared: " + "X:" + pared.getPosX() + " - " + "Y:" + pared.getPosY());
                    System.out.println("Posicion Auto: " + " X: " + auto.getPosX() + " Y: " + auto.getPosY());

                    if (auto.getPosX() == pared.getPosX() && auto.getPosY() == pared.getPosY()) {
                        System.out.println("El auto chocó");
                        chocado=true;
                    }
                    break;
                case "e":
                    System.out.println("salir");

                    break;
                default:
                    System.out.println("Comando Incorrecto");

            }
        } while (!chocado);

        //Utilizando Scanner
        //A ---Izquierda
        //S---Abajo
        //D--Derecha
        //W---Para arriba
        //E---Salir del juego
        //si el auto choca con la pared, el auto queda chocado.
    }

}
