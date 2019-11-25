/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Inquilino;

import javax.swing.ImageIcon;

/**
 *
 * @author Martin
 */
public class FrmInquilino extends javax.swing.JFrame {

    /**
     * Creates new form FrmInquilino
     */
    public FrmInquilino() {
        initComponents();
         this.setIconImage(new ImageIcon(getClass().getResource("/imagenes/Inmo2.png")).getImage()) ;// poner imagen a jframe
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jtLugarTrab = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jlCuit = new javax.swing.JLabel();
        jtDniGarante = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jlDniGarante = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jtApellido = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtCuit = new javax.swing.JTextField();
        jlbInquilino = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtGarante = new javax.swing.JTextField();
        btnBorrar = new javax.swing.JButton();
        jtDni = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel7.setText("Garante");

        jtLugarTrab.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jlCuit.setText("CUIT");

        jtDniGarante.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtDniGarante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtDniGaranteKeyTyped(evt);
            }
        });

        jtNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNombreActionPerformed(evt);
            }
        });
        jtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtNombreKeyTyped(evt);
            }
        });

        jlDniGarante.setText("DNI Garante");

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        jLabel6.setText("Lugar de trabajo");

        jtApellido.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtApellidoKeyTyped(evt);
            }
        });

        jLabel2.setText("DNI");

        jtCuit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtCuit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtCuitKeyTyped(evt);
            }
        });

        jlbInquilino.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbInquilino.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbInquilino.setText("Inquilino");

        jLabel3.setText("Nombre");

        jtGarante.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtGarante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtGaranteKeyTyped(evt);
            }
        });

        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        jtDni.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtDniActionPerformed(evt);
            }
        });
        jtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtDniKeyTyped(evt);
            }
        });

        jLabel4.setText("Apellido");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jtLugarTrab, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtCuit, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtApellido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                    .addComponent(jtGarante)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jlDniGarante)
                                .addGap(18, 18, 18)
                                .addComponent(jtDniGarante))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jlCuit)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jlbInquilino, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(109, 109, 109))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(263, 263, 263)
                                        .addComponent(btnLimpiar))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btnGuardar)
                        .addGap(36, 36, 36)
                        .addComponent(btnModificar)
                        .addGap(40, 40, 40)
                        .addComponent(btnBorrar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jlbInquilino, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCuit)
                    .addComponent(jtCuit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtLugarTrab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtGarante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtDniGarante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlDniGarante))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnModificar)
                    .addComponent(btnBorrar)
                    .addComponent(btnLimpiar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void jtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNombreActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void jtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtDniActionPerformed

    private void jtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDniKeyTyped
        // TODO add your handling code here:
                 char c=evt.getKeyChar();      
         if (Character.isDigit(c)){           
       } else 
       {
           getToolkit().beep();
           evt.consume(); 
       }
       if(jtDni.getText().length()>7){
            getToolkit().beep();
           evt.consume(); 
       }  
    }//GEN-LAST:event_jtDniKeyTyped

    private void jtDniGaranteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDniGaranteKeyTyped
        // TODO add your handling code here:
             char c=evt.getKeyChar();      
         if (Character.isDigit(c)){           
       } else 
       {
           getToolkit().beep();
           evt.consume(); 
       }
       if(jtDniGarante.getText().length()>7){
            getToolkit().beep();
           evt.consume(); 
       }          
    }//GEN-LAST:event_jtDniGaranteKeyTyped

    private void jtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNombreKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();      
         if (Character.isLetter(c)|| Character.isWhitespace(c)){           
       } else 
       {
           getToolkit().beep();
           evt.consume(); 
       }
        
    }//GEN-LAST:event_jtNombreKeyTyped

    private void jtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtApellidoKeyTyped
    char c=evt.getKeyChar();      
         if (Character.isLetter(c)|| Character.isWhitespace(c)){ 
             
       } else 
       {
           getToolkit().beep();
           evt.consume(); 
       }        // TODO add your handling code here:
    }//GEN-LAST:event_jtApellidoKeyTyped

    private void jtCuitKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtCuitKeyTyped
    char c=evt.getKeyChar();      
         if (Character.isLetter(c)){   
             getToolkit().beep();
            evt.consume(); 
       } else 
       {
           
       }        // TODO add your handling code here:
    }//GEN-LAST:event_jtCuitKeyTyped

    private void jtGaranteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtGaranteKeyTyped
        char c=evt.getKeyChar();
        if(Character.isLetter(c)|| Character.isWhitespace(c))
        {}
        else{
        getToolkit().beep();
           evt.consume();       }  // TODO add your handling code here:
    }//GEN-LAST:event_jtGaranteKeyTyped

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
            java.util.logging.Logger.getLogger(FrmInquilino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmInquilino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmInquilino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmInquilino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmInquilino().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnBorrar;
    public javax.swing.JButton btnGuardar;
    public javax.swing.JButton btnLimpiar;
    public javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jlCuit;
    private javax.swing.JLabel jlDniGarante;
    private javax.swing.JLabel jlbInquilino;
    public javax.swing.JTextField jtApellido;
    public javax.swing.JTextField jtCuit;
    public javax.swing.JTextField jtDni;
    public javax.swing.JTextField jtDniGarante;
    public javax.swing.JTextField jtGarante;
    public javax.swing.JTextField jtLugarTrab;
    public javax.swing.JTextField jtNombre;
    // End of variables declaration//GEN-END:variables
}
