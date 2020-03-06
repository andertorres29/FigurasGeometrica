/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.figurasgeometrica;

/**
 *
 * @author Ander
 */
public class Cuadrado extends Figuras{
    private int coorX1;
    private int coorY1;
    private int coorX2;
    private int coorY2;
    private int coorX3;
    private int coorY3;
    private int coorX4;
    private int coorY4;
    private int coorX5;
    private int coorY5;
    private int coorX6;
    private int coorY6;
    private int coorX7;
    private int coorY7;
    private int coorX8;
    private int coorY8;

    public Cuadrado(int coorX1, int coorY1, int coorX2, int coorY2, int coorX3,
            int coorY3, int coorX4, int coorY4, int coorX5, int coorY5, int coorX6, 
            int coorY6, int coorX7, int coorY7, int coorX8, int coorY8) {
        this.coorX1 = coorX1;
        this.coorY1 = coorY1;
        this.coorX2 = coorX2;
        this.coorY2 = coorY2;
        this.coorX3 = coorX3;
        this.coorY3 = coorY3;
        this.coorX4 = coorX4;
        this.coorY4 = coorY4;
        this.coorX5 = coorX5;
        this.coorY5 = coorY5;
        this.coorX6 = coorX6;
        this.coorY6 = coorY6;
        this.coorX7 = coorX7;
        this.coorY7 = coorY7;
        this.coorX8 = coorX8;
        this.coorY8 = coorY8;
    }

    

    public int hallarPerimetro(){
        int per = (getLado1()*2)+(getLado2()*2);
        System.out.println("El perimetro es: "+per);
        return per;
    }
    
    public int hallarArea(){
        int are = getLado1()* getLado2()*2;
        System.out.println("El area es: "+are);
        return are;
    }
    
    public void mostraTipo(){
        System.out.println("EL tipo de figura es: ");
        
    }
}

/*public Cuadrado (String t, int l1, int l2){
        setLado1(l1);
        setLado2(l2);
        this.tipo = t;
    }*/
