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
public class Triangulo extends Figuras{
    private int coorX1; private int coorY1; private int coorX2; private int coorY2;
    private int coorX3; private int coorY3; private int coorX4; private int coorY4;
    private int coorX5; private int coorY5; private int coorX6; private int coorY6;

    public Triangulo(int coorX1, int coorY1, int coorX2, int coorY2, int coorX3, int coorY3, int coorX4, int coorY4, int coorX5, int coorY5, int coorX6, int coorY6) {
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
    }
    
    public int hallarArea(){
        int are = (getLado1() * getLado2())/2;
        System.out.println("El area es: "+are);
        return are;
    }
    
    
}
/*public Triangulo (String t, int l1, int l2, int l3){
        setLado1(l1);
        setLado2(l2);
        this.lado3 = l3;
        this.tipo = t;
}
public int hallarPerimetro(){
        int per = getLado1() + getLado2() + lado3;
        System.out.println("El perimetro es: "+per);
        return per;
  
}

public void mostraTipo(){
        System.out.println("EL tipo de figura es: "+tipo);
        
    }*/