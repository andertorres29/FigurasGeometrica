/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.figurasgeometrica;





import java.awt.Graphics;


/**
 *
 * @author Ander
 */
public class Grafica extends javax.swing.JFrame {
     
    
    /**
     * Creates new form Grafica
     */
    public Grafica() {
        initComponents();
        ocultarComponentes();
        
    }

    public void dibujar(Graphics g){   
    }
    
    public void ocultarComponentes(){
        jLabel1.setVisible(false);
        labelCoordenadaX1.setVisible(false);
        labelCoordenadaY1.setVisible(false);
        labelCoordenadaX2.setVisible(false);
        labelCoordenadaY2.setVisible(false);
        txtCoordenadaX1.setVisible(false);
        txtCoordenadaY1.setVisible(false);
        txtCoordenadaX2.setVisible(false);
        txtCoordenadaY2.setVisible(false);
        
        jLabel3.setVisible(false);
        labelCoordenadaX3.setVisible(false);
        labelCoordenadaY3.setVisible(false);
        labelCoordenadaX4.setVisible(false);
        labelCoordenadaY4.setVisible(false);
        txtCoordenadaX3.setVisible(false);
        txtCoordenadaY3.setVisible(false);
        txtCoordenadaX4.setVisible(false);
        txtCoordenadaY4.setVisible(false);
        
        labelBase.setVisible(false);
        labelAltura.setVisible(false);
        txtBase.setVisible(false);
        txtAltura.setVisible(false);
        
        jLabel2.setVisible(false);
        labelFigura.setVisible(false);
        labelPerimetro.setVisible(false);
        labelArea.setVisible(false);
        labelResTipo.setVisible(false);
        labelResPeri.setVisible(false);
        labelResArea.setVisible(false);
        
        labelLado1.setVisible(false);
        labelLado2.setVisible(false);
        labelLado3.setVisible(false);
        labelLado4.setVisible(false);
        labelResLado1.setVisible(false);
        labelResLado2.setVisible(false);
        labelResLado3.setVisible(false);
        labelResLado4.setVisible(false);
    }
    
    public void limpiarComponentes(){
        txtCoordenadaX1.setText("");
        txtCoordenadaX2.setText("");
        txtCoordenadaX3.setText("");
        txtCoordenadaX4.setText("");
        txtCoordenadaY1.setText("");
        txtCoordenadaY2.setText("");
        txtCoordenadaY3.setText("");
        txtCoordenadaY4.setText("");
        
        txtBase.setText("");
        txtAltura.setText("");
        
        labelResTipo.setText("");
        labelResPeri.setText("");
        labelResArea.setText("");
        
        labelResLado1.setText("");
        labelResLado2.setText("");
        labelResLado3.setText("");
        labelResLado4.setText("");
    }
    
    public void mostrarComponentesCuadrado(){
        ocultarComponentes();
        limpiarComponentes();
        
        jLabel2.setVisible(true);
        labelCoordenadaX1.setVisible(true);
        labelCoordenadaY1.setVisible(true);
        labelCoordenadaX2.setVisible(true);
        labelCoordenadaY2.setVisible(true);
        txtCoordenadaX1.setVisible(true);
        txtCoordenadaY1.setVisible(true);
        txtCoordenadaX2.setVisible(true);
        txtCoordenadaY2.setVisible(true);
        
        jLabel1.setVisible(true);
        labelFigura.setVisible(true);
        labelPerimetro.setVisible(true);
        labelArea.setVisible(true);
        labelResTipo.setVisible(true);
        labelResPeri.setVisible(true);
        labelResArea.setVisible(true);
        
        labelLado1.setVisible(true);
        labelLado2.setVisible(true);
        labelLado3.setVisible(true);
        labelLado4.setVisible(true);
        labelResLado1.setVisible(true);
        labelResLado2.setVisible(true);
        labelResLado3.setVisible(true);
        labelResLado4.setVisible(true);
    }

    public void mostrarComponentesRectangulo(){
        ocultarComponentes();
        limpiarComponentes();
        
        jLabel2.setVisible(true);
        labelCoordenadaX1.setVisible(true);
        labelCoordenadaY1.setVisible(true);
        txtCoordenadaX1.setVisible(true);
        txtCoordenadaY1.setVisible(true);
                       
        labelBase.setVisible(true);
        labelAltura.setVisible(true);
        txtBase.setVisible(true);
        txtAltura.setVisible(true);

        jLabel1.setVisible(true);
        labelFigura.setVisible(true);
        labelPerimetro.setVisible(true);
        labelArea.setVisible(true);
        labelResTipo.setVisible(true);
        labelResPeri.setVisible(true);
        labelResArea.setVisible(true);
        
        labelLado1.setVisible(true);
        labelLado2.setVisible(true);
        labelLado3.setVisible(true);
        labelLado4.setVisible(true);
        labelResLado1.setVisible(true);
        labelResLado2.setVisible(true);
        labelResLado3.setVisible(true);
        labelResLado4.setVisible(true);
    }   
    
    public void mostrarComponentesTriangulo(){
        ocultarComponentes();
        limpiarComponentes();
        
        jLabel2.setVisible(true);
        labelCoordenadaX1.setVisible(true);
        labelCoordenadaY1.setVisible(true);
        labelCoordenadaX2.setVisible(true);
        labelCoordenadaY2.setVisible(true);
        labelCoordenadaX3.setVisible(true);
        labelCoordenadaY3.setVisible(true);
        labelCoordenadaX4.setVisible(true);
        labelCoordenadaY4.setVisible(true);
        txtCoordenadaX1.setVisible(true);
        txtCoordenadaY1.setVisible(true);
        txtCoordenadaX2.setVisible(true);
        txtCoordenadaY2.setVisible(true);
        txtCoordenadaX3.setVisible(true);
        txtCoordenadaY3.setVisible(true);
        txtCoordenadaX4.setVisible(true);
        txtCoordenadaY4.setVisible(true);
       
        jLabel3.setVisible(true);               
        jLabel1.setVisible(true);
        labelFigura.setVisible(true);
        labelPerimetro.setVisible(true);
        labelArea.setVisible(true);
        labelResTipo.setVisible(true);
        labelResPeri.setVisible(true);
        labelResArea.setVisible(true);
        
        labelLado1.setVisible(true);
        labelLado2.setVisible(true);
        labelLado3.setVisible(true);
        labelResLado1.setVisible(true);
        labelResLado2.setVisible(true);
        labelResLado3.setVisible(true);
    }    
    
    public void calcularLadosCuadrado(){
        String tipo = "Cuadrado";
        int coorX1,coorY1,coorX2,coorY2,mayor,menor,valorLado,perimetro,area;
        int coorX3,coorY3,coorX4,coorY4;
        int coorX5,coorY5,coorX6,coorY6;
        int coorX7,coorY7,coorX8,coorY8;
        coorX1 = Integer.parseInt(txtCoordenadaX1.getText());
        coorY1 = Integer.parseInt(txtCoordenadaY1.getText());
        coorX2 = Integer.parseInt(txtCoordenadaX2.getText());

        if (coorX1>coorX2){
            mayor = coorX1; menor = coorX2; valorLado = mayor - menor;
            
            coorY2 = coorY1;
            coorX3 = coorX2;
            coorY3 = coorY2;
            coorX4 = coorX2;
            coorY4 = coorY2 - valorLado;
            coorX5 = coorX4;
            coorY5 = coorY4;
            coorX6 = coorX4 + valorLado;
            coorY6 = coorY4;
            coorX7 = coorX6;
            coorY7 = coorY6;
            coorX8 = coorX6;
            coorY8 = coorY6 + valorLado;
            
            area = valorLado + valorLado + valorLado + valorLado;
            perimetro = valorLado*2;
            String per = String.valueOf(perimetro);
            String are = String.valueOf(area);
            String vaLado = String.valueOf(valorLado);
            labelResTipo.setText(tipo);
            labelResArea.setText(are);
            labelResPeri.setText(per);
            labelResLado1.setText(vaLado);
            labelResLado2.setText(vaLado);
            labelResLado3.setText(vaLado);
            labelResLado4.setText(vaLado);
            
            Graphics p=panelGrafica.getGraphics();
            p.drawLine(coorX1, coorY1, coorX2, coorY2);
            p.drawLine(coorX3, coorY3, coorX4, coorY4);
            p.drawLine(coorX5, coorY5, coorX6, coorY6);
            p.drawLine(coorX7, coorY7, coorX8, coorY8);

            //System.out.println("EL VALOR DEL CUADRADO ES: "+coorX1+coorY1+coorX2+coorY2+coorX3+coorY3+coorX4+coorY4+coorX5+coorY5+coorX6+coorY6+coorX7+coorY7+coorX8+coorY8);    
        }else{
            mayor = coorX2; menor = coorX1; valorLado = mayor - menor;
            
            coorY2 = coorY1;
            coorX3 = coorX2;
            coorY3 = coorY2;
            coorX4 = coorX2;
            coorY4 = coorY2 - valorLado;
            coorX5 = coorX4;
            coorY5 = coorY4;
            coorX6 = coorX4 - valorLado;
            coorY6 = coorY4;
            coorX7 = coorX6;
            coorY7 = coorY6;
            coorX8 = coorX6;
            coorY8 = coorY6 + valorLado;
            
            area = valorLado*4;
            perimetro = valorLado*2;
            String per = String.valueOf(perimetro);
            String are = String.valueOf(area);
            String vaLado = String.valueOf(valorLado);
            labelResTipo.setText(tipo);
            labelResArea.setText(are);
            labelResPeri.setText(per);
            labelResLado1.setText(vaLado);
            labelResLado2.setText(vaLado);
            labelResLado3.setText(vaLado);
            labelResLado4.setText(vaLado);
            
            Graphics p=panelGrafica.getGraphics();
            p.drawLine(coorX1, coorY1, coorX2, coorY2);
            p.drawLine(coorX3, coorY3, coorX4, coorY4);
            p.drawLine(coorX5, coorY5, coorX6, coorY6);
            p.drawLine(coorX7, coorY7, coorX8, coorY8);
            //System.out.println("EL VALOR DEL CUADRADO ES: "+coorX1+coorY1+coorX2+coorY2+coorX3+coorY3+coorX4+coorY4+coorX5+coorY5+coorX6+coorY6+coorX7+coorY7+coorX8+coorY8);  
        }
    }

    public void calcularLadosRectangulo(){
        String tipo = "Rectangulo";
        int baseRect, alturaRect, coorX1, coorY1, area, perimetro;
        Graphics p=panelGrafica.getGraphics();
        
        baseRect = Integer.parseInt(txtBase.getText());
        alturaRect = Integer.parseInt(txtAltura.getText());
        coorX1 = Integer.parseInt(txtCoordenadaX1.getText());
        coorY1 = Integer.parseInt(txtCoordenadaY1.getText());
        
        area = baseRect * alturaRect;
        perimetro = (baseRect*2)+(alturaRect*2);
        String bas = String.valueOf(baseRect);
        String alt = String.valueOf(alturaRect);
        String per = String.valueOf(perimetro);
        String are = String.valueOf(area);
        labelResTipo.setText(tipo);
        labelResArea.setText(are);
        labelResPeri.setText(per);
        labelResLado1.setText(bas);
        labelResLado2.setText(alt);
        labelResLado3.setText(bas);
        labelResLado4.setText(alt);
        
        p.drawRect(coorX1, coorY1, baseRect, alturaRect);
    }
    
    public void calcularLadosTriangulo(){
        String tipo = "Triangulo";
        int mayor,menor,valorLado1,valorLado2,valorLado3,perimetro,area;
        int coorX1,coorY1,coorX2,coorY2;
        int coorX3,coorY3,coorX4,coorY4;
        int coorX5,coorY5,coorX6,coorY6;
        coorX1 = Integer.parseInt(txtCoordenadaX1.getText());
        coorY1 = Integer.parseInt(txtCoordenadaY1.getText());
        coorX2 = Integer.parseInt(txtCoordenadaX2.getText());
        coorY2 = Integer.parseInt(txtCoordenadaY1.getText());
        coorX4 = Integer.parseInt(txtCoordenadaX4.getText());
        coorY4 = Integer.parseInt(txtCoordenadaY4.getText());
        
        if (coorY1>coorY2){
            coorX3 = coorX2;
            coorY3 = coorY2;
            coorX5 = coorX4;
            coorY5 = coorY4;
            coorX6 = coorX1;
            coorY6 = coorY1;
            valorLado1 = coorY1 - coorY2;
            valorLado2 = coorY3 - coorY4;
            valorLado3 = coorY6 - coorY5;
            
            perimetro = valorLado1 + valorLado2 + valorLado3;
            area = (valorLado1 * valorLado2) /2;
            String are = String.valueOf(area);
            String per = String.valueOf(perimetro);
            String vaLado1 = String.valueOf(valorLado1);
            String vaLado2 = String.valueOf(valorLado2);
            String vaLado3 = String.valueOf(valorLado3);
            labelResTipo.setText(tipo);
            labelResArea.setText(are);
            labelResPeri.setText(per);
            labelResLado1.setText(vaLado1);
            labelResLado2.setText(vaLado2);
            labelResLado3.setText(vaLado3);
            
            Graphics p=panelGrafica.getGraphics();
            p.drawLine(coorX1, coorY1, coorX2, coorY2);
            p.drawLine(coorX3, coorY3, coorX4, coorY4);
            p.drawLine(coorX5, coorY5, coorX6, coorY6);
           
        }else {
            coorX3 = coorX2;
            coorY3 = coorY2;
            coorX5 = coorX4;
            coorY5 = coorY4;
            coorX6 = coorX1;
            coorY6 = coorY1;
            valorLado1 = coorY2 - coorY1;
            valorLado2 = coorY4 - coorY3;
            valorLado3 = coorY5 - coorY6;
            
            perimetro = valorLado1 + valorLado2 + valorLado3;
            area = (valorLado1 * valorLado2) /2;
            String are = String.valueOf(area);
            String per = String.valueOf(perimetro);
            String vaLado1 = String.valueOf(valorLado1);
            String vaLado2 = String.valueOf(valorLado2);
            String vaLado3 = String.valueOf(valorLado3);
            labelResTipo.setText(tipo);
            labelResArea.setText(are);
            labelResPeri.setText(per);
            labelResLado1.setText(vaLado1);
            labelResLado2.setText(vaLado2);
            labelResLado3.setText(vaLado3);
            
            Graphics p=panelGrafica.getGraphics();
            p.drawLine(coorX1, coorY1, coorX2, coorY2);
            p.drawLine(coorX3, coorY3, coorX4, coorY4);
            p.drawLine(coorX5, coorY5, coorX6, coorY6);
        }          
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        labelTituloPrincipal = new javax.swing.JLabel();
        labelTituloGrafica = new javax.swing.JLabel();
        labelTituloGrafica1 = new javax.swing.JLabel();
        panelGrafica = new javax.swing.JPanel();
        btnGraficar = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();
        btnRestablecer = new javax.swing.JButton();
        panelCoordenadas = new javax.swing.JPanel();
        labelTipo = new javax.swing.JLabel();
        cbxTipoFigura = new javax.swing.JComboBox();
        labelCoordenadaX1 = new javax.swing.JLabel();
        labelCoordenadaY1 = new javax.swing.JLabel();
        labelCoordenadaX2 = new javax.swing.JLabel();
        labelCoordenadaY2 = new javax.swing.JLabel();
        labelCoordenadaX3 = new javax.swing.JLabel();
        labelCoordenadaY3 = new javax.swing.JLabel();
        labelCoordenadaX4 = new javax.swing.JLabel();
        labelCoordenadaY4 = new javax.swing.JLabel();
        txtCoordenadaX1 = new javax.swing.JTextField();
        txtCoordenadaY1 = new javax.swing.JTextField();
        txtCoordenadaX2 = new javax.swing.JTextField();
        txtCoordenadaY2 = new javax.swing.JTextField();
        txtCoordenadaX3 = new javax.swing.JTextField();
        txtCoordenadaY3 = new javax.swing.JTextField();
        txtCoordenadaX4 = new javax.swing.JTextField();
        txtCoordenadaY4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelBase = new javax.swing.JLabel();
        labelAltura = new javax.swing.JLabel();
        txtBase = new javax.swing.JTextField();
        txtAltura = new javax.swing.JTextField();
        labelFigura = new javax.swing.JLabel();
        labelArea = new javax.swing.JLabel();
        labelPerimetro = new javax.swing.JLabel();
        labelResTipo = new javax.swing.JLabel();
        labelResArea = new javax.swing.JLabel();
        labelResPeri = new javax.swing.JLabel();
        labelLado1 = new javax.swing.JLabel();
        labelLado2 = new javax.swing.JLabel();
        labelLado3 = new javax.swing.JLabel();
        labelLado4 = new javax.swing.JLabel();
        labelResLado1 = new javax.swing.JLabel();
        labelResLado2 = new javax.swing.JLabel();
        labelResLado3 = new javax.swing.JLabel();
        labelResLado4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelPrincipal.setBackground(new java.awt.Color(0, 153, 153));
        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTituloPrincipal.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        labelTituloPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        labelTituloPrincipal.setText("FIGURAS GEOMETRICAS");
        panelPrincipal.add(labelTituloPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 460, 60));

        labelTituloGrafica.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelTituloGrafica.setForeground(new java.awt.Color(255, 255, 255));
        labelTituloGrafica.setText("Panel Grafica");
        panelPrincipal.add(labelTituloGrafica, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        labelTituloGrafica1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelTituloGrafica1.setForeground(new java.awt.Color(255, 255, 255));
        labelTituloGrafica1.setText("Panel Coordenadas & Resultados");
        panelPrincipal.add(labelTituloGrafica1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, -1, -1));

        panelGrafica.setBackground(new java.awt.Color(255, 255, 255));
        panelGrafica.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelPrincipal.add(panelGrafica, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 400, 340));

        btnGraficar.setText("GRAFICAR");
        btnGraficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraficarActionPerformed(evt);
            }
        });
        panelPrincipal.add(btnGraficar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 430, 110, 40));

        btnCalcular.setText("CALCULAR");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        panelPrincipal.add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 430, 110, 40));

        btnRestablecer.setText("RESTABLECER");
        btnRestablecer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestablecerActionPerformed(evt);
            }
        });
        panelPrincipal.add(btnRestablecer, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 430, 110, 40));

        panelCoordenadas.setBackground(new java.awt.Color(0, 102, 102));
        panelCoordenadas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTipo.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        labelTipo.setForeground(new java.awt.Color(255, 255, 255));
        labelTipo.setText("Figura");
        panelCoordenadas.add(labelTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 180, 20));

        cbxTipoFigura.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione:", "Cuadrado", "Rectangulo", "Triangulo" }));
        cbxTipoFigura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTipoFiguraActionPerformed(evt);
            }
        });
        panelCoordenadas.add(cbxTipoFigura, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 180, 20));

        labelCoordenadaX1.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        labelCoordenadaX1.setForeground(new java.awt.Color(255, 255, 255));
        labelCoordenadaX1.setText(" X1");
        panelCoordenadas.add(labelCoordenadaX1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 50, 10));

        labelCoordenadaY1.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        labelCoordenadaY1.setForeground(new java.awt.Color(255, 255, 255));
        labelCoordenadaY1.setText("Y1");
        panelCoordenadas.add(labelCoordenadaY1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 50, 10));

        labelCoordenadaX2.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        labelCoordenadaX2.setForeground(new java.awt.Color(255, 255, 255));
        labelCoordenadaX2.setText(" X2");
        panelCoordenadas.add(labelCoordenadaX2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 40, 10));

        labelCoordenadaY2.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        labelCoordenadaY2.setForeground(new java.awt.Color(255, 255, 255));
        labelCoordenadaY2.setText(" Y2");
        panelCoordenadas.add(labelCoordenadaY2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 40, 10));

        labelCoordenadaX3.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        labelCoordenadaX3.setForeground(new java.awt.Color(255, 255, 255));
        labelCoordenadaX3.setText(" X3");
        panelCoordenadas.add(labelCoordenadaX3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 40, 10));

        labelCoordenadaY3.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        labelCoordenadaY3.setForeground(new java.awt.Color(255, 255, 255));
        labelCoordenadaY3.setText("Y3");
        panelCoordenadas.add(labelCoordenadaY3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 40, 10));

        labelCoordenadaX4.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        labelCoordenadaX4.setForeground(new java.awt.Color(255, 255, 255));
        labelCoordenadaX4.setText(" X4");
        panelCoordenadas.add(labelCoordenadaX4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 40, 10));

        labelCoordenadaY4.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        labelCoordenadaY4.setForeground(new java.awt.Color(255, 255, 255));
        labelCoordenadaY4.setText("Y4");
        panelCoordenadas.add(labelCoordenadaY4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 40, 10));
        panelCoordenadas.add(txtCoordenadaX1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 40, 20));
        panelCoordenadas.add(txtCoordenadaY1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 40, 20));
        panelCoordenadas.add(txtCoordenadaX2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 40, 20));
        panelCoordenadas.add(txtCoordenadaY2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 40, 20));
        panelCoordenadas.add(txtCoordenadaX3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 40, 20));
        panelCoordenadas.add(txtCoordenadaY3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 40, 20));
        panelCoordenadas.add(txtCoordenadaX4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 40, 20));
        panelCoordenadas.add(txtCoordenadaY4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 40, 20));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Resultados:");
        panelCoordenadas.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Coordenadas 1ra Linea");
        panelCoordenadas.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Coordenadas 2da Linea ");
        panelCoordenadas.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, 20));

        labelBase.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        labelBase.setForeground(new java.awt.Color(255, 255, 255));
        labelBase.setText("Base");
        panelCoordenadas.add(labelBase, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 60, -1));

        labelAltura.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        labelAltura.setForeground(new java.awt.Color(255, 255, 255));
        labelAltura.setText("Altura");
        panelCoordenadas.add(labelAltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 60, -1));
        panelCoordenadas.add(txtBase, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 60, -1));
        panelCoordenadas.add(txtAltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 60, 20));

        labelFigura.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        labelFigura.setForeground(new java.awt.Color(255, 255, 255));
        labelFigura.setText("Tipo:");
        panelCoordenadas.add(labelFigura, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 30, 10));

        labelArea.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        labelArea.setForeground(new java.awt.Color(255, 255, 255));
        labelArea.setText("Area:");
        panelCoordenadas.add(labelArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 30, 10));

        labelPerimetro.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        labelPerimetro.setForeground(new java.awt.Color(255, 255, 255));
        labelPerimetro.setText("Perimetro:");
        panelCoordenadas.add(labelPerimetro, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 60, 10));
        panelCoordenadas.add(labelResTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 140, 20));
        panelCoordenadas.add(labelResArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 110, 20));
        panelCoordenadas.add(labelResPeri, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 110, 20));

        labelLado1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        labelLado1.setForeground(new java.awt.Color(255, 0, 0));
        labelLado1.setText("Lado1");
        panelCoordenadas.add(labelLado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 30, -1));

        labelLado2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        labelLado2.setForeground(new java.awt.Color(255, 0, 0));
        labelLado2.setText("Lado2");
        panelCoordenadas.add(labelLado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 30, -1));

        labelLado3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        labelLado3.setForeground(new java.awt.Color(255, 0, 0));
        labelLado3.setText("Lado3");
        panelCoordenadas.add(labelLado3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 30, -1));

        labelLado4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        labelLado4.setForeground(new java.awt.Color(255, 0, 0));
        labelLado4.setText("Lado4");
        panelCoordenadas.add(labelLado4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 30, -1));

        labelResLado1.setForeground(new java.awt.Color(255, 0, 0));
        panelCoordenadas.add(labelResLado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 40, 20));

        labelResLado2.setForeground(new java.awt.Color(255, 0, 0));
        panelCoordenadas.add(labelResLado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 40, 20));

        labelResLado3.setForeground(new java.awt.Color(255, 0, 0));
        panelCoordenadas.add(labelResLado3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 40, 20));

        labelResLado4.setForeground(new java.awt.Color(255, 0, 0));
        panelCoordenadas.add(labelResLado4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 40, 20));

        panelPrincipal.add(panelCoordenadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, 370, 280));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxTipoFiguraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTipoFiguraActionPerformed
        String figu = cbxTipoFigura.getSelectedItem().toString();
        if (figu.equals("Cuadrado")) {
            mostrarComponentesCuadrado();
        } else if (figu.equals("Rectangulo")) {
           mostrarComponentesRectangulo(); 
        } else if (figu.equals("Triangulo")) {
            mostrarComponentesTriangulo();
        } else {
            ocultarComponentes();
        }
    }//GEN-LAST:event_cbxTipoFiguraActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnGraficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraficarActionPerformed
        String figu = cbxTipoFigura.getSelectedItem().toString();
        if (figu.equals("Cuadrado")) {
            calcularLadosCuadrado();
        } else if (figu.equals("Rectangulo")) {
            calcularLadosRectangulo();
        } else if (figu.equals("Triangulo")) {
            calcularLadosTriangulo();
        } else {
            ocultarComponentes();
        }

    }//GEN-LAST:event_btnGraficarActionPerformed

    private void btnRestablecerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestablecerActionPerformed
        
    }//GEN-LAST:event_btnRestablecerActionPerformed

   
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Grafica().setVisible(true);
            }
        });
    }
    
    
   /* public void mostrarComponentesTriangulo(){
        ocultarComponentes();
        labelBase.setVisible(true);
        labelAltura.setVisible(true);
        labelLado3.setVisible(true);
        txtBase.setVisible(true);
        txtAltura.setVisible(true);
        txtLado3.setVisible(true);
        txtBase.setText("");
        txtAltura.setText("");
        txtLado3.setText("");
        labelLado3.setText("Lado 3");
        

        labelFigura.setVisible(true);
        labelPerimetro.setVisible(true);
        labelArea.setVisible(true);
        labelResTipo.setVisible(true);
        labelResPeri.setVisible(true);
        labelResArea.setVisible(true);
        labelResTipo.setText("");
        labelResPeri.setText("");
        labelResArea.setText("");
        
        labelCoordenadaX1.setVisible(true);
        labelCoordenadaY1.setVisible(true);
        txtCoordenadaX1.setVisible(true);
        txtCoordenadaY1.setVisible(true);
        
        labelCoordenadaX2.setVisible(true);
        labelCoordenadaY2.setVisible(true);
        txtCoordenadaX2.setVisible(true);
        txtCoordenadaY2.setVisible(true);
        
        labelCoordenadaX3.setVisible(true);
        labelCoordenadaY3.setVisible(true);
        txtCoordenadaX3.setVisible(true);
        txtCoordenadaY3.setVisible(true);
        
        txtCoordenadaX1.setText("");
        txtCoordenadaY1.setText("");
        
        txtCoordenadaX2.setText("");
        txtCoordenadaY2.setText("");
  
        txtCoordenadaX3.setText("");
        txtCoordenadaY3.setText("");
    }*/

    /*public void calcularDatosCuadrado(){
        String tipo = "Cuadrado";
        int lad1, lad2, perimetro, area;
        try {
            labelResTipo.setText(tipo);
            lad1 = Integer.parseInt(txtBase.getText());
            lad2 = Integer.parseInt(txtAltura.getText());
            perimetro = (lad1 * 2) + (lad2 * 2);
            area = lad1 * lad2;
            String per = String.valueOf(perimetro);
            String are = String.valueOf(area);
            labelResPeri.setText(per);
            labelResArea.setText(are);
        } catch (NumberFormatException ex) {

        }
    }
    
    public void calcularDatosRectangulo(){
        String tipo = "Rectangulo";
        int lad1, lad2, perimetro, area;
        try {
            labelResTipo.setText(tipo);
            lad1 = Integer.parseInt(txtBase.getText());
            lad2 = Integer.parseInt(txtAltura.getText());
            perimetro = (lad1 * 2) + (lad2 * 2);
            area = lad1 * lad2;
            String per = String.valueOf(perimetro);
            String are = String.valueOf(area);
            labelResPeri.setText(per);
            labelResArea.setText(are);
        } catch (NumberFormatException ex) {

        }
    }
    
    public void calcularDatosTriangulo(){
      
        int lad1, lad2, lad3, perimetro, area;
        try {
            lad1 = Integer.parseInt(txtBase.getText());
            lad2 = Integer.parseInt(txtAltura.getText());
            lad3 = Integer.parseInt(txtLado3.getText());
            if (lad1 == lad2 && lad1 == lad3){
                String tipo = "Triangulo Equilatero";
                labelResTipo.setText(tipo);
            } else if ((lad1 == lad2 && lad1 != lad3) || (lad2 == lad3 && lad2 != lad1) || (lad3 == lad1 && lad3 != lad2)){
                String tipo = "Triangulo Isosceles";
                labelResTipo.setText(tipo);
            } else if (lad1 != lad2 && lad1 != lad3 && lad2 != lad3){
                String tipo = "Triangulo Escaleno";
                labelResTipo.setText(tipo);
            }
            perimetro = lad1 + lad2 + lad3;
            area = (lad1 * lad2) / 2;
            String per = String.valueOf(perimetro);
            String are = String.valueOf(area);
            labelResPeri.setText(per);
            labelResArea.setText(are);
            
        } catch (NumberFormatException ex) {

        }
    }
    */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnGraficar;
    private javax.swing.JButton btnRestablecer;
    private javax.swing.JComboBox cbxTipoFigura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel labelAltura;
    private javax.swing.JLabel labelArea;
    private javax.swing.JLabel labelBase;
    private javax.swing.JLabel labelCoordenadaX1;
    private javax.swing.JLabel labelCoordenadaX2;
    private javax.swing.JLabel labelCoordenadaX3;
    private javax.swing.JLabel labelCoordenadaX4;
    private javax.swing.JLabel labelCoordenadaY1;
    private javax.swing.JLabel labelCoordenadaY2;
    private javax.swing.JLabel labelCoordenadaY3;
    private javax.swing.JLabel labelCoordenadaY4;
    private javax.swing.JLabel labelFigura;
    private javax.swing.JLabel labelLado1;
    private javax.swing.JLabel labelLado2;
    private javax.swing.JLabel labelLado3;
    private javax.swing.JLabel labelLado4;
    private javax.swing.JLabel labelPerimetro;
    private javax.swing.JLabel labelResArea;
    private javax.swing.JLabel labelResLado1;
    private javax.swing.JLabel labelResLado2;
    private javax.swing.JLabel labelResLado3;
    private javax.swing.JLabel labelResLado4;
    private javax.swing.JLabel labelResPeri;
    private javax.swing.JLabel labelResTipo;
    private javax.swing.JLabel labelTipo;
    private javax.swing.JLabel labelTituloGrafica;
    private javax.swing.JLabel labelTituloGrafica1;
    private javax.swing.JLabel labelTituloPrincipal;
    private javax.swing.JPanel panelCoordenadas;
    private javax.swing.JPanel panelGrafica;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtBase;
    private javax.swing.JTextField txtCoordenadaX1;
    private javax.swing.JTextField txtCoordenadaX2;
    private javax.swing.JTextField txtCoordenadaX3;
    private javax.swing.JTextField txtCoordenadaX4;
    private javax.swing.JTextField txtCoordenadaY1;
    private javax.swing.JTextField txtCoordenadaY2;
    private javax.swing.JTextField txtCoordenadaY3;
    private javax.swing.JTextField txtCoordenadaY4;
    // End of variables declaration//GEN-END:variables
}
