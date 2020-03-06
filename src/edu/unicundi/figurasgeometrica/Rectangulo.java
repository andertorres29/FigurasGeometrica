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
public class Rectangulo extends Figuras{
    private int coorX1;
    private int coorY1;
    private int base;
    private int altura;

    public Rectangulo(int coorX1, int coorY1, int base, int altura) {
        this.coorX1 = coorX1;
        this.coorY1 = coorY1;
        this.base = base;
        this.altura = altura;
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
    
      
}
/* public void mostraTipo(){
        System.out.println("EL tipo de figura es: "+tipo);
        
    }*/