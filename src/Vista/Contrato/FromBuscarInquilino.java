/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Contrato;

import Inquilino.Modelo.Inquilino;
import Inmueble.Modelo.*;
import Inquilino.Modelo.ConsultasInquilno;
import java.awt.event.WindowListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class FromBuscarInquilino extends javax.swing.JFrame {
    
    private Inquilino inqui = new Inquilino();
    private Inmueble inmueble = new Inmueble();
    private int dni_inquilino;
     private static ConsultasInquilno cdInquilno=new ConsultasInquilno();
     private static ArrayList<Inquilino> inquilinos=new ArrayList<Inquilino>();
     public static DefaultTableModel modeloInquilino;
   
    public FromBuscarInquilino() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/imagenes/Inmo2.png")).getImage()) ;// poner imagen a jframe
        modeloInquilino = new DefaultTableModel(){
             @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
               }
        };
        
         armarCabeceraInquilino();
       // cargarInquilinos();
        jButtonSeleccionar.setEnabled(false);
    }
    
    public void armarCabeceraInquilino(){
        ArrayList<Object> columnasi=new ArrayList<Object>();
        columnasi.add("DNI inquilino");
        columnasi.add("Nombre");
        columnasi.add("Apellido");
        columnasi.add("CUIT");
        
        for(Object col:columnasi) 
            modeloInquilino.addColumn(col);
        jTableInquilino.setModel(modeloInquilino);
    }
    
    public static void cargarInquilinos(ArrayList<Inquilino> inquilinos){
        borrarInquilinos();
       for(Inquilino i:inquilinos){
            modeloInquilino.addRow(new Object[] {
                i.getDni_inquilino(),
                i.getNombre_inquilino(),
                i.getApellido_inquilino(),
                i.getCuit_inquilino()
            });
        }
        
    }
    
     public static void borrarInquilinos(){
        int c=modeloInquilino.getRowCount()-1;
        for(int i=c;i>=0;i--)
            modeloInquilino.removeRow(i);
    }
     
    public static void cargarInquilinos(){
        inquilinos.clear();
        cdInquilno.obtenerInquilinos(inquilinos);
        borrarInquilinos();
        for(Inquilino inq:inquilinos){
            modeloInquilino.addRow(new Object[] {
                inq.getDni_inquilino(),
                inq.getNombre_inquilino(),
                inq.getApellido_inquilino(),
                inq.getCuit_inquilino()
            });
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableInquilino = new javax.swing.JTable();
        jButtonSeleccionar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButtonBuscar = new javax.swing.JButton();
        jButtonLimpiar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jtDni = new javax.swing.JTextField();
        JtNombre_inqui = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtApellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setName("frameBusquedaInquilino"); // NOI18N

        jTableInquilino.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Dni", "Nombre", "Apellido"
            }
        ));
        jTableInquilino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableInquilinoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableInquilino);

        jButtonSeleccionar.setText("Seleccionar");
        jButtonSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeleccionarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jButtonLimpiar.setText("Limpiar");
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });

        jLabel4.setText("DNI:");

        jtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtDniKeyTyped(evt);
            }
        });

        JtNombre_inqui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtNombre_inquiActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre");

        jLabel3.setText("Apellido:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 351, Short.MAX_VALUE)
                .addComponent(jButtonBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonLimpiar))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtDni, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                    .addComponent(JtNombre_inqui))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JtNombre_inqui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonBuscar)
                    .addComponent(jButtonLimpiar)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jButtonSeleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSeleccionar)
                    .addComponent(jButtonCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDniKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(Character.isLetter(c)) {
            getToolkit().beep();
            evt.consume();
            // Error.setText("Ingresa Solo Numeros");
        }
    }//GEN-LAST:event_jtDniKeyTyped

    private void JtNombre_inquiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtNombre_inquiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtNombre_inquiActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        // TODO add your handling code here:
        List <Inquilino> inquilinoBus = new ArrayList<Inquilino>() ;
        ConsultasInquilno cdInquilino = new ConsultasInquilno();
        
         StringBuffer buffer = new StringBuffer( "SELECT * FROM inquilino WHERE 1=1 " );
         
                    
        if (!JtNombre_inqui.getText().equals("")){
            buffer.append(" AND UPPER(nombre_inquilino) LIKE '%" + JtNombre_inqui.getText().toUpperCase() + "%'");
        } 
        if (!jtApellido.getText().equals("")){
            buffer.append(" AND UPPER(apellido_inquilino) LIKE '%" + jtApellido.getText().toUpperCase() + "%'");
        }
        if (!jtDni.getText().equals("")){
            buffer.append(" AND dni_inquilino LIKE '%" + jtDni.getText() + "%'");
        }
         inquilinoBus = cdInquilino.busquedaEspecifica(buffer);
        
           if (inquilinoBus.isEmpty()){
              JOptionPane.showMessageDialog(null, "No se encontraron resultados");
            }else{
                cargarInquilinos((ArrayList)inquilinoBus);
           }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        // TODO add your handling code here:
        jtDni.setText("");
        jtApellido.setText("");
        JtNombre_inqui.setText("");
    }//GEN-LAST:event_jButtonLimpiarActionPerformed

    private void jButtonSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeleccionarActionPerformed
        // TODO add your handling code here:
        this.setDni_inquilino((Integer)jTableInquilino.getValueAt(jTableInquilino.getSelectedRow(),0));
        this.dispose();
    }//GEN-LAST:event_jButtonSeleccionarActionPerformed

    private void jTableInquilinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableInquilinoMouseClicked
        // TODO add your handling code here:
        jButtonSeleccionar.setEnabled(false);
        if(jTableInquilino.getSelectedRow() != -1){
             jButtonSeleccionar.setEnabled(true);
        }
    }//GEN-LAST:event_jTableInquilinoMouseClicked

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
            java.util.logging.Logger.getLogger(FromBuscarInmueble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FromBuscarInmueble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FromBuscarInmueble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FromBuscarInmueble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FromBuscarInmueble().setVisible(true);
            }
        });
        
     
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField JtNombre_inqui;
    public javax.swing.JButton jButtonBuscar;
    public javax.swing.JButton jButtonCancelar;
    public javax.swing.JButton jButtonLimpiar;
    private javax.swing.JButton jButtonSeleccionar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTableInquilino;
    public javax.swing.JTextField jtApellido;
    public javax.swing.JTextField jtDni;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the dni_inquilino
     */
    public int getDni_inquilino() {
        return dni_inquilino;
    }

    /**
     * @param dni_inquilino the dni_inquilino to set
     */
    public void setDni_inquilino(int dni_inquilino) {
        this.dni_inquilino = dni_inquilino;
    }
}
