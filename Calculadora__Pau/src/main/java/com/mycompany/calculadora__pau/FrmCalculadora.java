/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.calculadora__pau;

import javax.swing.JLabel;

public class FrmCalculadora extends javax.swing.JFrame {

    public float num1, num2;
    public String signo;
    

    
    
    public FrmCalculadora() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpPantalla = new javax.swing.JPanel();
        txtOperacion = new javax.swing.JLabel();
        jpTeclado = new javax.swing.JPanel();
        btn_Potencia = new javax.swing.JButton();
        btn_AC = new javax.swing.JButton();
        btn_Multiplicar = new javax.swing.JButton();
        btn_Porcentaje = new javax.swing.JButton();
        btn_Dividir = new javax.swing.JButton();
        btn_Igual = new javax.swing.JButton();
        btn_Sumar = new javax.swing.JButton();
        btn_Restar = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_1 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_0 = new javax.swing.JButton();
        btn_Decimal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpPantalla.setBackground(new java.awt.Color(215, 200, 229));
        jpPantalla.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtOperacion.setFont(new java.awt.Font("Century Gothic", 1, 40)); // NOI18N
        txtOperacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jpPantalla.add(txtOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 280, 80));

        getContentPane().add(jpPantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 130));

        jpTeclado.setBackground(new java.awt.Color(237, 235, 237));
        jpTeclado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Potencia.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn_Potencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btn1.png"))); // NOI18N
        btn_Potencia.setText("^");
        btn_Potencia.setBorderPainted(false);
        btn_Potencia.setFocusPainted(false);
        btn_Potencia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Potencia.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/btn1.png"))); // NOI18N
        btn_Potencia.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/btn1_pressed.png"))); // NOI18N
        btn_Potencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PotenciaActionPerformed(evt);
            }
        });
        jpTeclado.add(btn_Potencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 50, 50));

        btn_AC.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btn_AC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btn1.png"))); // NOI18N
        btn_AC.setText("AC");
        btn_AC.setBorderPainted(false);
        btn_AC.setFocusPainted(false);
        btn_AC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_AC.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/btn1.png"))); // NOI18N
        btn_AC.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/btn1_pressed.png"))); // NOI18N
        btn_AC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ACActionPerformed(evt);
            }
        });
        jpTeclado.add(btn_AC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 50));

        btn_Multiplicar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn_Multiplicar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btn1.png"))); // NOI18N
        btn_Multiplicar.setText("x");
        btn_Multiplicar.setBorderPainted(false);
        btn_Multiplicar.setFocusPainted(false);
        btn_Multiplicar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Multiplicar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/btn1.png"))); // NOI18N
        btn_Multiplicar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/btn1_pressed.png"))); // NOI18N
        btn_Multiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MultiplicarActionPerformed(evt);
            }
        });
        jpTeclado.add(btn_Multiplicar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 50, 50));

        btn_Porcentaje.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_Porcentaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btn1.png"))); // NOI18N
        btn_Porcentaje.setText("%");
        btn_Porcentaje.setBorderPainted(false);
        btn_Porcentaje.setFocusPainted(false);
        btn_Porcentaje.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Porcentaje.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/btn1.png"))); // NOI18N
        btn_Porcentaje.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/btn1_pressed.png"))); // NOI18N
        btn_Porcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PorcentajeActionPerformed(evt);
            }
        });
        jpTeclado.add(btn_Porcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 50, 50));

        btn_Dividir.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        btn_Dividir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btn1.png"))); // NOI18N
        btn_Dividir.setText("÷");
        btn_Dividir.setBorderPainted(false);
        btn_Dividir.setFocusPainted(false);
        btn_Dividir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Dividir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/btn1.png"))); // NOI18N
        btn_Dividir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/btn1_pressed.png"))); // NOI18N
        btn_Dividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DividirActionPerformed(evt);
            }
        });
        jpTeclado.add(btn_Dividir, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 50, 50));

        btn_Igual.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn_Igual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btn1.png"))); // NOI18N
        btn_Igual.setText("=");
        btn_Igual.setBorderPainted(false);
        btn_Igual.setFocusPainted(false);
        btn_Igual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Igual.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/btn1.png"))); // NOI18N
        btn_Igual.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/btn1_pressed.png"))); // NOI18N
        btn_Igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_IgualActionPerformed(evt);
            }
        });
        jpTeclado.add(btn_Igual, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 50, 50));

        btn_Sumar.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btn_Sumar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btn1.png"))); // NOI18N
        btn_Sumar.setText("+");
        btn_Sumar.setBorderPainted(false);
        btn_Sumar.setFocusPainted(false);
        btn_Sumar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Sumar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/btn1.png"))); // NOI18N
        btn_Sumar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/btn1_pressed.png"))); // NOI18N
        btn_Sumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SumarActionPerformed(evt);
            }
        });
        jpTeclado.add(btn_Sumar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 50, 50));

        btn_Restar.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btn_Restar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btn1.png"))); // NOI18N
        btn_Restar.setText("-");
        btn_Restar.setBorderPainted(false);
        btn_Restar.setFocusPainted(false);
        btn_Restar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Restar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/btn1.png"))); // NOI18N
        btn_Restar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/btn1_pressed.png"))); // NOI18N
        btn_Restar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RestarActionPerformed(evt);
            }
        });
        jpTeclado.add(btn_Restar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 50, 50));

        btn_4.setFont(new java.awt.Font("Century Gothic", 1, 17)); // NOI18N
        btn_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btn2.png"))); // NOI18N
        btn_4.setText("4");
        btn_4.setBorderPainted(false);
        btn_4.setFocusPainted(false);
        btn_4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/btn2.png"))); // NOI18N
        btn_4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/btn2_pressed.png"))); // NOI18N
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });
        jpTeclado.add(btn_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 50, 50));

        btn_7.setFont(new java.awt.Font("Century Gothic", 1, 17)); // NOI18N
        btn_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btn2.png"))); // NOI18N
        btn_7.setText("7");
        btn_7.setBorderPainted(false);
        btn_7.setFocusPainted(false);
        btn_7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/btn2.png"))); // NOI18N
        btn_7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/btn2_pressed.png"))); // NOI18N
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });
        jpTeclado.add(btn_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 50, 50));

        btn_8.setFont(new java.awt.Font("Century Gothic", 1, 17)); // NOI18N
        btn_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btn2.png"))); // NOI18N
        btn_8.setText("8");
        btn_8.setBorderPainted(false);
        btn_8.setFocusPainted(false);
        btn_8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/btn2.png"))); // NOI18N
        btn_8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/btn2_pressed.png"))); // NOI18N
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });
        jpTeclado.add(btn_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 50, 50));

        btn_9.setFont(new java.awt.Font("Century Gothic", 1, 17)); // NOI18N
        btn_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btn2.png"))); // NOI18N
        btn_9.setText("9");
        btn_9.setBorderPainted(false);
        btn_9.setFocusPainted(false);
        btn_9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/btn2.png"))); // NOI18N
        btn_9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/btn2_pressed.png"))); // NOI18N
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });
        jpTeclado.add(btn_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 50, 50));

        btn_6.setFont(new java.awt.Font("Century Gothic", 1, 17)); // NOI18N
        btn_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btn2.png"))); // NOI18N
        btn_6.setText("6");
        btn_6.setBorderPainted(false);
        btn_6.setFocusPainted(false);
        btn_6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/btn2.png"))); // NOI18N
        btn_6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/btn2_pressed.png"))); // NOI18N
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });
        jpTeclado.add(btn_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 50, 50));

        btn_5.setFont(new java.awt.Font("Century Gothic", 1, 17)); // NOI18N
        btn_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btn2.png"))); // NOI18N
        btn_5.setText("5");
        btn_5.setBorderPainted(false);
        btn_5.setFocusPainted(false);
        btn_5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/btn2.png"))); // NOI18N
        btn_5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/btn2_pressed.png"))); // NOI18N
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });
        jpTeclado.add(btn_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 50, 50));

        btn_1.setFont(new java.awt.Font("Century Gothic", 1, 17)); // NOI18N
        btn_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btn2.png"))); // NOI18N
        btn_1.setText("1");
        btn_1.setBorderPainted(false);
        btn_1.setFocusPainted(false);
        btn_1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/btn2.png"))); // NOI18N
        btn_1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/btn2_pressed.png"))); // NOI18N
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });
        jpTeclado.add(btn_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 50, 50));

        btn_2.setFont(new java.awt.Font("Century Gothic", 1, 17)); // NOI18N
        btn_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btn2.png"))); // NOI18N
        btn_2.setText("2");
        btn_2.setBorderPainted(false);
        btn_2.setFocusPainted(false);
        btn_2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/btn2.png"))); // NOI18N
        btn_2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/btn2_pressed.png"))); // NOI18N
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });
        jpTeclado.add(btn_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 50, 50));

        btn_3.setFont(new java.awt.Font("Century Gothic", 1, 17)); // NOI18N
        btn_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btn2.png"))); // NOI18N
        btn_3.setText("3");
        btn_3.setBorderPainted(false);
        btn_3.setFocusPainted(false);
        btn_3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/btn2.png"))); // NOI18N
        btn_3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/btn2_pressed.png"))); // NOI18N
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });
        jpTeclado.add(btn_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 50, 50));

        btn_0.setFont(new java.awt.Font("Century Gothic", 1, 17)); // NOI18N
        btn_0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btn2.png"))); // NOI18N
        btn_0.setText("0");
        btn_0.setBorderPainted(false);
        btn_0.setFocusPainted(false);
        btn_0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_0.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/btn2.png"))); // NOI18N
        btn_0.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/btn2_pressed.png"))); // NOI18N
        btn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_0ActionPerformed(evt);
            }
        });
        jpTeclado.add(btn_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 50, 50));

        btn_Decimal.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btn_Decimal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btn2.png"))); // NOI18N
        btn_Decimal.setText(".");
        btn_Decimal.setBorderPainted(false);
        btn_Decimal.setFocusPainted(false);
        btn_Decimal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Decimal.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/btn2.png"))); // NOI18N
        btn_Decimal.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/btn2_pressed.png"))); // NOI18N
        btn_Decimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DecimalActionPerformed(evt);
            }
        });
        jpTeclado.add(btn_Decimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 50, 50));

        getContentPane().add(jpTeclado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 300, 370));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ACActionPerformed
        txtOperacion.setText("");
    }//GEN-LAST:event_btn_ACActionPerformed

    private void btn_PotenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PotenciaActionPerformed
        num1=Float.parseFloat(txtOperacion.getText());
        signo="^";
        txtOperacion.setText("");
    }//GEN-LAST:event_btn_PotenciaActionPerformed

    private void btn_PorcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PorcentajeActionPerformed
        num1=Float.parseFloat(txtOperacion.getText());
        signo="%";
        txtOperacion.setText("");
    }//GEN-LAST:event_btn_PorcentajeActionPerformed

    private void btn_DividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DividirActionPerformed
        num1=Float.parseFloat(txtOperacion.getText());
        signo="/";
        txtOperacion.setText("");
    }//GEN-LAST:event_btn_DividirActionPerformed

    private void btn_MultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MultiplicarActionPerformed
        num1=Float.parseFloat(txtOperacion.getText());
        signo="*";
        txtOperacion.setText("");
    }//GEN-LAST:event_btn_MultiplicarActionPerformed

    private void btn_RestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RestarActionPerformed
        num1=Float.parseFloat(txtOperacion.getText());
        signo="-";
        txtOperacion.setText("");
    }//GEN-LAST:event_btn_RestarActionPerformed

    private void btn_SumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SumarActionPerformed
        num1=Float.parseFloat(txtOperacion.getText());
        signo="+";
        txtOperacion.setText("");
    }//GEN-LAST:event_btn_SumarActionPerformed

    private void btn_IgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_IgualActionPerformed
        num2=Float.parseFloat(txtOperacion.getText());
        
        switch(signo){
            case "/":if(num2==0)
                    {
                        txtOperacion.setText("No se puede dividir entre 0");
                    }
                    else    
                    {
                        txtOperacion.setText(entero(num1/num2));
                    }
            break;
            case "*": txtOperacion.setText(entero(num1*num2));
            break;
            case "-": txtOperacion.setText(entero(num1-num2));
            break;
            case "+": txtOperacion.setText(entero(num1+num2));
            break;  
            case "^":txtOperacion.setText(entero(calcularPotencia(num1, num2)));
            break;
            case "%":txtOperacion.setText(entero((num2/100)*num1));
        }
    }//GEN-LAST:event_btn_IgualActionPerformed

    private void btn_DecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DecimalActionPerformed
        if(!(txtOperacion.getText().contains("."))){
            addNumero(".");
        }
    }//GEN-LAST:event_btn_DecimalActionPerformed

    private void btn_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_0ActionPerformed
        addNumero("0");
    }//GEN-LAST:event_btn_0ActionPerformed

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
        addNumero("1");
    }//GEN-LAST:event_btn_1ActionPerformed

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        addNumero("2");
    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
        addNumero("3");
    }//GEN-LAST:event_btn_3ActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
        addNumero("4");
    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
        addNumero("5");
    }//GEN-LAST:event_btn_5ActionPerformed

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
        addNumero("6");
    }//GEN-LAST:event_btn_6ActionPerformed

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
        addNumero("7");
    }//GEN-LAST:event_btn_7ActionPerformed

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
        addNumero("8");
    }//GEN-LAST:event_btn_8ActionPerformed

    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
        addNumero("9");
    }//GEN-LAST:event_btn_9ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCalculadora().setVisible(true);
            }
        });
    }
    
    public void addNumero(String digito){
        txtOperacion.setText(txtOperacion.getText()+digito);
    }
    
    public String entero(float resultado){
        String retorno="";
        retorno=Float.toString(resultado);
        
        if(resultado%1==0){
            retorno=retorno.substring(0, retorno.length()-2);
        }
        return retorno;
    }
    
    public static float calcularPotencia(float num1, float num2) {
        float resultado = 1;
        for (int i = 0; i < num2; i++) {
            resultado *= num1;
        }
        return resultado;
    }
    
    public JLabel getTxtOperacion() {
        return txtOperacion;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_0;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton btn_AC;
    private javax.swing.JButton btn_Decimal;
    private javax.swing.JButton btn_Dividir;
    private javax.swing.JButton btn_Igual;
    private javax.swing.JButton btn_Multiplicar;
    private javax.swing.JButton btn_Porcentaje;
    private javax.swing.JButton btn_Potencia;
    private javax.swing.JButton btn_Restar;
    private javax.swing.JButton btn_Sumar;
    private javax.swing.JPanel jpPantalla;
    private javax.swing.JPanel jpTeclado;
    private javax.swing.JLabel txtOperacion;
    // End of variables declaration//GEN-END:variables
}
