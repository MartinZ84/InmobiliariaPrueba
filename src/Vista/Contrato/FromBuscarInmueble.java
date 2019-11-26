/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Contrato;

import Inquilino.Modelo.Inquilino;
import Inmueble.Modelo.*;
import Propietario.Modelo.ConsultasPropietario;
import Propietario.Modelo.Propietario;
import static Vista.Inmueble.PanelInmueble.borrarInmuebles;
import static Vista.Inmueble.PanelInmueble.cbPropietarios;
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
public class FromBuscarInmueble extends javax.swing.JFrame {
    
    private Inquilino inqui = new Inquilino();
    private Propietario propietario=new Propietario();
    private Inmueble inmueble = new Inmueble();
    private int id_inmueble = -1;
    private TipoInmueble tipoinmueble=new TipoInmueble();
      private ConsultasTipoInmueble consultatipo= new ConsultasTipoInmueble();
    private static ConsultasPropietario consultasp= new ConsultasPropietario();
    private ArrayList<TipoInmueble> tiposinmueble= new ArrayList<TipoInmueble>();
    private static ArrayList<Propietario> propietarios=new ArrayList<Propietario>();
     private static DefaultTableModel modeloInmuebles;
   
    public FromBuscarInmueble() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/imagenes/Inmo2.png")).getImage()) ;// poner imagen a jframe
        modeloInmuebles = new DefaultTableModel(){
             @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
               }
        };
        borrarInmuebles();
        buttonGroup1.add(jRadioButtonDisponible);
        buttonGroup1.add(jRadioButtonNoDisp);
        buttonGroup1.add(jRadioButtonTodos);
        
        jRadioButtonTodos.setSelected(true);
        //--COMBOS
        cargarPropietarios();
        cargarTipoInmueble();
        //--ARMAR TABLE
        armarCabeceraInmueble();
        
        jButtonSeleccionar.setEnabled(false);
    }
    
    public void armarCabeceraInmueble(){
         ArrayList<Object> columnasC=new ArrayList<Object>();
            columnasC.add("ID");
            columnasC.add("Direccion");
            columnasC.add("Caracteristicas");
            columnasC.add("Propietario");
            columnasC.add("Superficie");
            columnasC.add("Precio");
            
        for(Object col:columnasC) {
            modeloInmuebles.addColumn(col);
        }
        jTableInmuebles.setModel(modeloInmuebles);
     }
   
    public static void borrarInmuebles(){
        int c = modeloInmuebles.getRowCount()-1;
        for(int i=c;i>=0;i--)
            modeloInmuebles.removeRow(i);
    }
    public static void cargarInmuebles(ArrayList<Inmueble> inmuebles){
        borrarInmuebles();
       for(Inmueble i:inmuebles){
            modeloInmuebles.addRow(new Object[] {
                i.getId_inmueble(),
                i.getDireccion_inmueble(),
                i.getTipo_inmueble(),
                i.getPropietario().getApellido_propietario(),
                i.getSuperficie(),
                i.getPrecio_base(),
                i.getId_inmueble()
            });
        }
        
    }
    
    public void cargarTipoInmueble(){
      consultatipo.ObtenerTiposInmueble(tiposinmueble);
      TipoInmueble nulo = new TipoInmueble();
      
      jComboBoxTipInmueble.addItem(null);
      for(TipoInmueble tipo:tiposinmueble)
          jComboBoxTipInmueble.addItem(tipo);
  }
    
    public void cargarPropietarios(){
      consultasp.obtenerPropietarios(propietarios);
      Propietario nulo = new Propietario();
        nulo.setApellido_propietario("");
        nulo.setNombre_propietario("");
      jComboBoxPropietarios.addItem(nulo);
      for(Propietario prop:propietarios)
          jComboBoxPropietarios.addItem(prop);
  }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableInmuebles = new javax.swing.JTable();
        jButtonSeleccionar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButtonBuscar = new javax.swing.JButton();
        jButtonLimpiar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxPropietarios = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxTipInmueble = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jRadioButtonDisponible = new javax.swing.JRadioButton();
        jRadioButtonNoDisp = new javax.swing.JRadioButton();
        jRadioButtonTodos = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setName("frameBusquedaInmueble"); // NOI18N

        jTableInmuebles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableInmuebles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableInmueblesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableInmuebles);

        jButtonSeleccionar.setText("Seleccionar");
        jButtonSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeleccionarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

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

        jLabel1.setText("Propietarios:");

        jLabel2.setText("Tipo inmueble:");

        jLabel5.setText("Dirección:");

        jLabel6.setText("Estado Inmueble:");

        jRadioButtonDisponible.setText("Disponible");
        jRadioButtonDisponible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonDisponibleActionPerformed(evt);
            }
        });

        jRadioButtonNoDisp.setText("No Disponible");

        jRadioButtonTodos.setText("Todos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 319, Short.MAX_VALUE)
                        .addComponent(jButtonBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonLimpiar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButtonDisponible)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButtonNoDisp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButtonTodos))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxPropietarios, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxTipInmueble, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jComboBoxPropietarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32))
                            .addComponent(jComboBoxTipInmueble, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jRadioButtonDisponible)
                    .addComponent(jRadioButtonNoDisp)
                    .addComponent(jRadioButtonTodos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
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
                .addContainerGap(115, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSeleccionar)
                    .addComponent(jButtonCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonDisponibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonDisponibleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonDisponibleActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        // TODO add your handling code here:
        List <Inmueble> inmuebleBus = new ArrayList<Inmueble>() ;
        ConsultasInmueble cdInmueble = new ConsultasInmueble();
        
         StringBuffer buffer = new StringBuffer( "SELECT * FROM inmueble WHERE 1=1 " );
         
        if( ((Propietario) jComboBoxPropietarios.getSelectedItem()).getDni_propietario() != 0 ){
            buffer.append(" AND dni_propietario = " + Integer.toString(((Propietario) jComboBoxPropietarios.getSelectedItem()).getDni_propietario()));
        }
        
        if ((jComboBoxTipInmueble.getSelectedItem() != null) && ( ((TipoInmueble) jComboBoxTipInmueble.getSelectedItem()).getId_tipo_inmueble() != -1 )){
            buffer.append(" AND id_tipo_inmueble = " + Integer.toString(((TipoInmueble) jComboBoxTipInmueble.getSelectedItem()).getId_tipo_inmueble()));
        }
             
        if (!txtDireccion.getText().equals("")){
            buffer.append(" AND UPPER(direccion_inmueble) LIKE '%" + txtDireccion.getText().toUpperCase() + "%'");
        } 
        
        if ( jRadioButtonDisponible.isSelected()){
            buffer.append(" AND estado_inmueble LIKE '%Disponible%'");
        } 
        
         if ( jRadioButtonNoDisp.isSelected()){
            buffer.append(" AND estado_inmueble LIKE '%No disponible%'");
        } 
         
         inmuebleBus = cdInmueble.busquedaEspecifica(buffer);
         cargarInmuebles((ArrayList)inmuebleBus);
         if (inmuebleBus.isEmpty()){
              JOptionPane.showMessageDialog(null, "No se encontraron resultados");
          }else{
               cargarInmuebles((ArrayList)inmuebleBus);
          }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        // TODO add your handling code here:
        jComboBoxPropietarios.setSelectedIndex(-1);
        jComboBoxTipInmueble.setSelectedIndex(-1);
        txtDireccion.setText("");
        jRadioButtonTodos.setSelected(true);
    }//GEN-LAST:event_jButtonLimpiarActionPerformed

    private void jButtonSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeleccionarActionPerformed
        // TODO add your handling code here:
        this.setId_inmueble((Integer)jTableInmuebles.getValueAt(jTableInmuebles.getSelectedRow(),0));
        this.dispose();
    }//GEN-LAST:event_jButtonSeleccionarActionPerformed

    private void jTableInmueblesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableInmueblesMouseClicked
        // TODO add your handling code here:
        jButtonSeleccionar.setEnabled(false);
        if(jTableInmuebles.getSelectedRow() != -1){
             jButtonSeleccionar.setEnabled(true);
        }
    }//GEN-LAST:event_jTableInmueblesMouseClicked

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

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
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    public javax.swing.JButton jButtonBuscar;
    public javax.swing.JButton jButtonCancelar;
    public javax.swing.JButton jButtonLimpiar;
    private javax.swing.JButton jButtonSeleccionar;
    public javax.swing.JComboBox jComboBoxPropietarios;
    public javax.swing.JComboBox jComboBoxTipInmueble;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JRadioButton jRadioButtonDisponible;
    public javax.swing.JRadioButton jRadioButtonNoDisp;
    public javax.swing.JRadioButton jRadioButtonTodos;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTableInmuebles;
    public javax.swing.JTextField txtDireccion;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the id_inmueble
     */
    public int getId_inmueble() {
        return id_inmueble;
    }

    /**
     * @param id_inmueble the id_inmueble to set
     */
    public void setId_inmueble(int id_inmueble) {
        this.id_inmueble = id_inmueble;
    }

    
}
