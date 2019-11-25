/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Inquilino;

import Inquilino.Controlador.CtrInquilino;
import Inquilino.Modelo.ConsultasInquilno;
import Inquilino.Modelo.Inquilino;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Martin
 */
public class PanelInquilino extends javax.swing.JPanel {
   
    public static DefaultTableModel modeloInquilino;
    private static ConsultasInquilno cdInquilno=new ConsultasInquilno();
     private static ArrayList<Inquilino> inquilinos=new ArrayList<Inquilino>();

    /**
     * Creates new form PanelInquilino
     */
     
     
    public PanelInquilino() {
        initComponents();
        modeloInquilino= new DefaultTableModel(){ 
            @Override
	 public boolean isCellEditable(int row, int column) {
         return false;
	}
	};
        
        jTableInquilino.addMouseListener
    (
    	new MouseAdapter()
    	{
    	public void mouseClicked(MouseEvent evnt)
    	{
          if (evnt.getClickCount() > 1)
          {
       Inquilino inquilino=new Inquilino();
       ConsultasInquilno cdInquilino = new ConsultasInquilno();
       Vista.Inquilino.FrmInquilino frmI = new Vista.Inquilino.FrmInquilino();
     // int fila=Vista.Inquilino.PanelInquilino.modeloInquilino.
      //  inquilino.setDni_inquilino(Vista.Inquilino.PanelInquilino.modeloInquilino.getSelectedRow());
      inquilino= PanelInquilino.obtenerInquilinoDeTabla();
      cdInquilino.Buscar(inquilino);
      frmI.jtDni.setText(Integer.toString(inquilino.getDni_inquilino()));
      frmI.jtNombre.setText(inquilino.getNombre_inquilino());
      frmI.jtApellido.setText(inquilino.getApellido_inquilino());
      frmI.jtCuit.setText(inquilino.getCuit_inquilino());
      frmI.jtLugarTrab.setText(inquilino.getLugar_trabajo_inquilino());
      frmI.jtGarante.setText(inquilino.getNom_garante_inquilino());
      frmI.jtDniGarante.setText(Integer.toString(inquilino.getDni_garante_inquilino()));
      CtrInquilino ctrInquilino = new CtrInquilino(inquilino, cdInquilino, frmI);
      ctrInquilino.iniciar();
      PanelInquilino.cargarInquilinos();	
      frmI.btnGuardar.setEnabled(false);
      frmI.jtDni.setEnabled(false);
      frmI.btnLimpiar.setEnabled(false);
          }
    	}
    	}
    );
        
        armarCabeceraInquilino();
        cargarInquilinos();
      //  borrarInquilinos();
    }
     
    public void armarCabeceraInquilino(){
        ArrayList<Object> columnasi=new ArrayList<Object>();
        columnasi.add("DNI inquilino");
        columnasi.add("Nombre");
        columnasi.add("Apellido");
        columnasi.add("CUIT");
        columnasi.add("Lugar trabajo");
        columnasi.add("Garante");
        columnasi.add("DNI garante");
        
        for(Object col:columnasi) 
            modeloInquilino.addColumn(col);
        jTableInquilino.setModel(modeloInquilino);
    }
    public static void cargarInquilinos(){
        inquilinos.clear();
        cdInquilno.obtenerInquilinos(inquilinos);
        borrarInquilinos();
        for(Inquilino inq:inquilinos){
            modeloInquilino.addRow(new Object[] {inq.getDni_inquilino(),inq.getNombre_inquilino(),inq.getApellido_inquilino(),
                inq.getCuit_inquilino(),inq.getLugar_trabajo_inquilino(),inq.getNom_garante_inquilino(),inq.getDni_garante_inquilino()});
        }
        
    }
      public static void borrarInquilinos(){
        int c=modeloInquilino.getRowCount()-1;
        for(int i=c;i>=0;i--)
            modeloInquilino.removeRow(i);
    }
      
      public static Inquilino  obtenerInquilinoDeTabla(){
        Inquilino inquilino=new Inquilino();
          
      int fila=jTableInquilino.getSelectedRow();
      if (fila > -1){
       inquilino.setDni_inquilino((int)jTableInquilino.getValueAt(fila, 0));
       cdInquilno.Buscar(inquilino);
       return inquilino;
      } else{ // JOptionPane.showMessageDialog(null, "Inquilino Guardado");
      //return inquilino;
        return null;      
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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JtNombre_inqui = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtApellido = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jtDni = new javax.swing.JTextField();
        jbLimpiar = new javax.swing.JButton();

        jTableInquilino.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableInquilino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableInquilinoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableInquilino);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Busqueda Inquilino");

        jLabel2.setText("Nombre");

        JtNombre_inqui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtNombre_inquiActionPerformed(evt);
            }
        });

        jLabel3.setText("Apellido:");

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jLabel4.setText("DNI:");

        jtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtDniKeyTyped(evt);
            }
        });

        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jButtonBuscar)
                            .addGap(28, 28, 28)
                            .addComponent(jbLimpiar))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel1))
                            .addGap(196, 196, 196)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JtNombre_inqui, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JtNombre_inqui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonBuscar)
                    .addComponent(jbLimpiar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(153, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void JtNombre_inquiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtNombre_inquiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtNombre_inquiActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
    // Inquilino inq=new Inquilino();
     List <Inquilino> inquilinosBus = new ArrayList<Inquilino>() ;
       ConsultasInquilno cdInquilino = new ConsultasInquilno();
       
       StringBuffer buffer = new StringBuffer( "SELECT * FROM inquilino WHERE " );
       
       if ((JtNombre_inqui.getText().length() < 1)
           &&(jtApellido.getText().length() < 1) && ( jtDni.getText().length()<1))
      {
            borrarInquilinos();
           cargarInquilinos();
      }
      else {
       if ((JtNombre_inqui.getText() != null && JtNombre_inqui.getText().length() > 0)
           &&( jtApellido.getText() != null && jtApellido.getText().length() > 0 ) && ( jtDni.getText() != null && jtDni.getText().length() > 0 ))
       {
           buffer.append("nombre_inquilino LIKE '%"+JtNombre_inqui.getText()+"%' AND apellido_inquilino LIKE '%"+jtApellido.getText()+"%' AND dni_inquilino LIKE '%"+jtDni.getText()+"%'");
       }
       else {
            if ((JtNombre_inqui.getText() != null && JtNombre_inqui.getText().length() > 0)
           &&( jtApellido.getText() != null && jtApellido.getText().length() > 0 )){
              buffer.append("nombre_inquilino LIKE '%"+JtNombre_inqui.getText()+"%' AND apellido_inquilino LIKE '%"+jtApellido.getText()+"%'");  
            } 
            else {
              if ((JtNombre_inqui.getText() != null && JtNombre_inqui.getText().length() > 0) && ( jtDni.getText() != null && jtDni.getText().length() > 0 ))
              {
                  buffer.append("nombre_inquilino LIKE '%"+JtNombre_inqui.getText()+"%' AND dni_inquilino LIKE '%"+jtDni.getText()+"%'");
              } 
              else{
                  if(( jtApellido.getText() != null && jtApellido.getText().length() > 0 ) && ( jtDni.getText() != null && jtDni.getText().length() > 0 ))
                  {
                     buffer.append (" apellido_inquilino LIKE '%"+jtApellido.getText()+"%' AND dni_inquilino LIKE '%"+jtDni.getText()+"%'");
                  }
                  else {
                      if( JtNombre_inqui.getText() != null && JtNombre_inqui.getText().length() > 0 ) 
                      { //suponiendo que el parámetro fuera un String
                      buffer.append( "nombre_inquilino LIKE '%"+JtNombre_inqui.getText()+"%'" );
                      }
                      else {
                         if( jtApellido.getText() != null && jtApellido.getText().length() > 0 ) 
                         { //suponiendo que el parámetro fuera un String
                          buffer.append( "apellido_inquilino LIKE '%"+ jtApellido.getText()+"%'");
                          } 
                          else {
                             if( jtDni.getText() != null && jtDni.getText().length() > 0 ) 
                             { //suponiendo que el parámetro fuera un String
                               buffer.append( "dni_inquilino LIKE '%"+jtDni.getText()+"%'" );
                             } 
                             //else{
                             ///    cargarInquilinos();
                             //}
                      }
                   }
                }
              }
            }
             inquilinosBus=cdInquilino.busquedaXNomApeDni(buffer);//.(JtNombre_inqui.getText());
             borrarInquilinos();
            if (inquilinosBus.isEmpty()){
              JOptionPane.showMessageDialog(null, "No se encontraron resultados");
            } else {
             for(Inquilino inq: inquilinosBus){
                modeloInquilino.addRow(new Object[] {inq.getDni_inquilino(),inq.getNombre_inquilino(),inq.getApellido_inquilino(),
                inq.getCuit_inquilino(),inq.getLugar_trabajo_inquilino(),inq.getNom_garante_inquilino(),inq.getDni_garante_inquilino()});
              }
            }
       }
       
    }
       
      
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jTableInquilinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableInquilinoMouseClicked
        // TODO add your handling code here:
     /*   Inquilino inquilino=new Inquilino();
       ConsultasInquilno cdInquilino = new ConsultasInquilno();
       Vista.Inquilino.FrmInquilino frmI = new Vista.Inquilino.FrmInquilino();
     // int fila=Vista.Inquilino.PanelInquilino.modeloInquilino.
      //  inquilino.setDni_inquilino(Vista.Inquilino.PanelInquilino.modeloInquilino.getSelectedRow());
      inquilino= PanelInquilino.obtenerInquilinoDeTabla();
      cdInquilino.Buscar(inquilino);
      frmI.jtDni.setText(Integer.toString(inquilino.getDni_inquilino()));
      frmI.jtNombre.setText(inquilino.getNombre_inquilino());
      frmI.jtApellido.setText(inquilino.getApellido_inquilino());
      frmI.jtCuit.setText(inquilino.getCuit_inquilino());
      frmI.jtLugarTrab.setText(inquilino.getLugar_trabajo_inquilino());
      frmI.jtGarante.setText(inquilino.getNom_garante_inquilino());
      frmI.jtDniGarante.setText(Integer.toString(inquilino.getDni_garante_inquilino()));
      CtrInquilino ctrInquilino = new CtrInquilino(inquilino, cdInquilino, frmI);
        ctrInquilino.iniciar();
        PanelInquilino.cargarInquilinos();*/
    }//GEN-LAST:event_jTableInquilinoMouseClicked

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        // TODO add your handling code here:y
        JtNombre_inqui.setText("");
        jtApellido.setText("");
        jtDni.setText("");
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDniKeyTyped
        // TODO add your handling code here:
            char c=evt.getKeyChar();      
          if(Character.isLetter(c)) {
              getToolkit().beep();
              evt.consume();
                // Error.setText("Ingresa Solo Numeros");
          } 
    }//GEN-LAST:event_jtDniKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JtNombre_inqui;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable jTableInquilino;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtDni;
    // End of variables declaration//GEN-END:variables
}
