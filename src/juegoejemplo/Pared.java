
package juegoejemplo;


public class Pared {
    //La Pared tiene una dimensión 5 x 5
    private int posX;//entre 0 y 85
    private int posY;//entre 0 y 17

    public Pared() {
        
        posX=(int)(Math.random()*80);
        posY=(int)(Math.random()*17);
        System.out.println("Posición de la pared "+posX+" "+posY);
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }
    
    
    
}
