/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Contrato.Controlador.*;
import Contrato.Modelo.*;
import Inmueble.Modelo.ConsultasInmueble;
import Inmueble.Controlador.CrlInmueble;
import Vista.Inmueble.FormInmueble;
import Inmueble.Modelo.Inmueble;
import Inquilino.Modelo.Inquilino;
import Propietario.Controlador.CtrPropietario;
import Propietario.Modelo.ConsultasPropietario;
import Propietario.Modelo.Propietario;
import Vista.Propietario.panelPropietarioList;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import Inquilino.Modelo.ConsultasInquilno;
import Inquilino.Controlador.CtrInquilino;
import Vista.Contrato.FromContrato;
import Vista.Contrato.PanelContratoList;
import Vista.Inmueble.PanelInmueble;
import Vista.Inquilino.PanelInquilino;
import java.awt.Dimension;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class fromMenu extends javax.swing.JFrame {

   private Propietario propietario=new Propietario();
    private Inmueble inmueble=new Inmueble();
    private static ConsultasPropietario consultasp= new ConsultasPropietario();
    private static ConsultasInmueble consultasi=new ConsultasInmueble();
    private static ArrayList<Inmueble> inmuebles=new ArrayList<Inmueble>();
    private static DefaultTableModel modeloinmuebles;
    
   // private static ConsultasInquilino cdInquilino= new ConsultasInquilino();
    
    public fromMenu() {
         initComponents();
         cargarPanelInmueble();
         cargarPanelInquilino();
         cargarPanelPropietario();
         cargarPanelContrato();
                 //panelinmueble.setEnabled(true);
                 //panelinmueble.setVisible(true);
        this.setTitle("Inmobliaria");
        //this.setExtendedState(this.MAXIMIZED_BOTH);
        this.setResizable(false);
        this.setSize(new Dimension(1240, 600));
        this.setMinimumSize(new Dimension(1000, 600));
        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/imagenes/Inmo2.png")).getImage()) ;// poner imagen a jframe
        modeloinmuebles=new DefaultTableModel();
        
        
        
        
    }
 /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPaneMenu = new javax.swing.JTabbedPane();
        jPanelContrato = new javax.swing.JPanel();
        jButtonContratoNuevo = new javax.swing.JButton();
        jButtonContratoAbrir = new javax.swing.JButton();
        jPanelPropietario = new javax.swing.JPanel();
        jSalirPro = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanelInquilino = new javax.swing.JPanel();
        jbtnNuevoInquilino = new javax.swing.JButton();
        jbtnAbrirInquilino = new javax.swing.JButton();
        jbtnBorrarInquilino = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSalirInq = new javax.swing.JLabel();
        jPanelInmueble = new javax.swing.JPanel();
        jSalirInm = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPaneMenu.setName("aasds"); // NOI18N
        jTabbedPaneMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPaneMenuMouseClicked(evt);
            }
        });

        jButtonContratoNuevo.setText("Nuevo");
        jButtonContratoNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonContratoNuevoActionPerformed(evt);
            }
        });

        jButtonContratoAbrir.setText("Abrir");
        jButtonContratoAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonContratoAbrirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelContratoLayout = new javax.swing.GroupLayout(jPanelContrato);
        jPanelContrato.setLayout(jPanelContratoLayout);
        jPanelContratoLayout.setHorizontalGroup(
            jPanelContratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContratoLayout.createSequentialGroup()
                .addGap(653, 653, 653)
                .addComponent(jButtonContratoNuevo)
                .addGap(60, 60, 60)
                .addComponent(jButtonContratoAbrir)
                .addContainerGap(544, Short.MAX_VALUE))
        );
        jPanelContratoLayout.setVerticalGroup(
            jPanelContratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelContratoLayout.createSequentialGroup()
                .addContainerGap(472, Short.MAX_VALUE)
                .addGroup(jPanelContratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonContratoNuevo)
                    .addComponent(jButtonContratoAbrir))
                .addGap(229, 229, 229))
        );

        jTabbedPaneMenu.addTab("Contrato", jPanelContrato);

        jSalirPro.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jSalirPro.setText("Salir");
        jSalirPro.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jSalirPro.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jSalirPro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSalirProMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Lista propietarios");

        javax.swing.GroupLayout jPanelPropietarioLayout = new javax.swing.GroupLayout(jPanelPropietario);
        jPanelPropietario.setLayout(jPanelPropietarioLayout);
        jPanelPropietarioLayout.setHorizontalGroup(
            jPanelPropietarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPropietarioLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 979, Short.MAX_VALUE)
                .addComponent(jSalirPro)
                .addGap(135, 135, 135))
        );
        jPanelPropietarioLayout.setVerticalGroup(
            jPanelPropietarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPropietarioLayout.createSequentialGroup()
                .addComponent(jSalirPro, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 695, Short.MAX_VALUE))
            .addGroup(jPanelPropietarioLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPaneMenu.addTab("Propietario", jPanelPropietario);

        jbtnNuevoInquilino.setText("Nuevo");
        jbtnNuevoInquilino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNuevoInquilinoActionPerformed(evt);
            }
        });

        jbtnAbrirInquilino.setText("Abrir");
        jbtnAbrirInquilino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAbrirInquilinoActionPerformed(evt);
            }
        });

        jbtnBorrarInquilino.setText("Borrar");
        jbtnBorrarInquilino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBorrarInquilinoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Lista inquilinos");

        jSalirInq.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jSalirInq.setText("Salir");
        jSalirInq.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jSalirInq.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jSalirInq.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSalirInqMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelInquilinoLayout = new javax.swing.GroupLayout(jPanelInquilino);
        jPanelInquilino.setLayout(jPanelInquilinoLayout);
        jPanelInquilinoLayout.setHorizontalGroup(
            jPanelInquilinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInquilinoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSalirInq)
                .addGap(141, 141, 141))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInquilinoLayout.createSequentialGroup()
                .addContainerGap(829, Short.MAX_VALUE)
                .addComponent(jbtnNuevoInquilino)
                .addGap(35, 35, 35)
                .addComponent(jbtnAbrirInquilino)
                .addGap(34, 34, 34)
                .addComponent(jbtnBorrarInquilino)
                .addGap(296, 296, 296))
        );
        jPanelInquilinoLayout.setVerticalGroup(
            jPanelInquilinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInquilinoLayout.createSequentialGroup()
                .addGroup(jPanelInquilinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSalirInq, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelInquilinoLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 285, Short.MAX_VALUE)
                .addGroup(jPanelInquilinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnNuevoInquilino)
                    .addComponent(jbtnAbrirInquilino)
                    .addComponent(jbtnBorrarInquilino))
                .addGap(368, 368, 368))
        );

        jTabbedPaneMenu.addTab("Inquilino", jPanelInquilino);

        jSalirInm.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jSalirInm.setText("Salir");
        jSalirInm.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jSalirInm.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jSalirInm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSalirInmMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelInmuebleLayout = new javax.swing.GroupLayout(jPanelInmueble);
        jPanelInmueble.setLayout(jPanelInmuebleLayout);
        jPanelInmuebleLayout.setHorizontalGroup(
            jPanelInmuebleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInmuebleLayout.createSequentialGroup()
                .addContainerGap(1205, Short.MAX_VALUE)
                .addComponent(jSalirInm)
                .addGap(140, 140, 140))
        );
        jPanelInmuebleLayout.setVerticalGroup(
            jPanelInmuebleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInmuebleLayout.createSequentialGroup()
                .addComponent(jSalirInm, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 695, Short.MAX_VALUE))
        );

        jTabbedPaneMenu.addTab("Inmueble", jPanelInmueble);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneMenu)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneMenu)
        );

        jTabbedPaneMenu.getAccessibleContext().setAccessibleName("Menu");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cargarPanelInquilino(){
        PanelInquilino panelinquilino=new PanelInquilino();
                 javax.swing.GroupLayout jPanelInquilinoLayout = new javax.swing.GroupLayout(jPanelInquilino);
                jPanelInquilino.setLayout(jPanelInquilinoLayout);
        jPanelInquilinoLayout.setHorizontalGroup(
            jPanelInquilinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInquilinoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelinquilino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(519, Short.MAX_VALUE))
        );
        jPanelInquilinoLayout.setVerticalGroup(
            jPanelInquilinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInquilinoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelinquilino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(537, Short.MAX_VALUE))
        );
    }
    private void cargarPanelInmueble(){
        PanelInmueble panelinmueble=new PanelInmueble();
                 javax.swing.GroupLayout jPanelInmuebleLayout = new javax.swing.GroupLayout(jPanelInmueble);
                jPanelInmueble.setLayout(jPanelInmuebleLayout);
        jPanelInmuebleLayout.setHorizontalGroup(
            jPanelInmuebleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInmuebleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelinmueble, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(519, Short.MAX_VALUE))
        );
        jPanelInmuebleLayout.setVerticalGroup(
            jPanelInmuebleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInmuebleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelinmueble, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(337, Short.MAX_VALUE))
        );
    }
    private void cargarPanelPropietario(){
        panelPropietarioList panelpropietario=new panelPropietarioList();
                 javax.swing.GroupLayout jPanelPropietarioLayout = new javax.swing.GroupLayout(jPanelPropietario);
                jPanelPropietario.setLayout(jPanelPropietarioLayout);
        jPanelPropietarioLayout.setHorizontalGroup(
            jPanelPropietarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPropietarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelpropietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(519, Short.MAX_VALUE))
        );
        jPanelPropietarioLayout.setVerticalGroup(
            jPanelPropietarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPropietarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelpropietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(537, Short.MAX_VALUE))
        );
    }
    private void cargarPanelContrato(){
        PanelContratoList panelContratoList=new PanelContratoList();
                 javax.swing.GroupLayout jPanelContratoLayout = new javax.swing.GroupLayout(jPanelContrato);
                jPanelContrato.setLayout(jPanelContratoLayout);
        jPanelContratoLayout.setHorizontalGroup(
            jPanelContratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContratoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelContratoList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(519, Short.MAX_VALUE))
        );
        jPanelContratoLayout.setVerticalGroup(
            jPanelContratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContratoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelContratoList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(537, Short.MAX_VALUE))
        );
    }
    private void jTabbedPaneMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPaneMenuMouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jTabbedPaneMenuMouseClicked

    private void jbtnNuevoInquilinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNuevoInquilinoActionPerformed
        // TODO add your handling code here:
        Inquilino inquilino=new Inquilino();
      
        ConsultasInquilno cdInquilino = new ConsultasInquilno();
        Vista.Inquilino.FrmInquilino frmI = new Vista.Inquilino.FrmInquilino();
        CtrInquilino ctrInquilino = new CtrInquilino(inquilino, cdInquilino, frmI);
        
        ctrInquilino.iniciar();
        frmI.setVisible(true);
        frmI.btnModificar.setEnabled(false);
        frmI.btnBorrar.setEnabled(false);
         //PanelInquilino.cargarInquilinos();
        
        
    }//GEN-LAST:event_jbtnNuevoInquilinoActionPerformed

    private void jbtnAbrirInquilinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAbrirInquilinoActionPerformed
        // TODO add your handling code here:
       Inquilino inquilino=new Inquilino();
       ConsultasInquilno cdInquilino = new ConsultasInquilno();
       Vista.Inquilino.FrmInquilino frmI = new Vista.Inquilino.FrmInquilino();
     // int fila=Vista.Inquilino.PanelInquilino.modeloInquilino.
      //  inquilino.setDni_inquilino(Vista.Inquilino.PanelInquilino.modeloInquilino.getSelectedRow());
      inquilino= PanelInquilino.obtenerInquilinoDeTabla();
       if (inquilino==null)
           { JOptionPane.showMessageDialog(null, "No se selecciono ningun inquilino de la tabla");}
            else {
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
       // this.setEnabled(false);
       }
               
    }//GEN-LAST:event_jbtnAbrirInquilinoActionPerformed

    private void jbtnBorrarInquilinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBorrarInquilinoActionPerformed
        // TODO add your handling code here:
          Inquilino inquilino=new Inquilino();
           ConsultasInquilno cdInquilino = new ConsultasInquilno();
           inquilino= PanelInquilino.obtenerInquilinoDeTabla();
        
             if (inquilino==null)
           { JOptionPane.showMessageDialog(null, "No se selecciono ningun inquilino de la tabla");}
            else {
            int i =JOptionPane.showConfirmDialog(this,"¿Desea eliminar el inquilino seleccionado?","Confirmar Eliminación",JOptionPane.YES_NO_OPTION);
            if(i==0){
             i = JOptionPane.showConfirmDialog(this,"¿Realmente desea eliminar el inquilino seleccionado?","Confirmar Eliminación",JOptionPane.YES_NO_OPTION);
            if(i==0)
             {              
           if(cdInquilino.Borrar(inquilino))
           {
           JOptionPane.showMessageDialog(null, "Se elimino inquilino", "Info", JOptionPane.WARNING_MESSAGE);
           PanelInquilino.cargarInquilinos();
           } else  JOptionPane.showMessageDialog(null, "No se puede eliminar inquilino. Verifique si tiene un contrato realizado", "Info", JOptionPane.WARNING_MESSAGE);
             }
            }
           }
    }//GEN-LAST:event_jbtnBorrarInquilinoActionPerformed

    private void jSalirProMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSalirProMouseClicked
        // TODO add your handling code here:
         int i =JOptionPane.showConfirmDialog(this,"¿Desea Salir del sistema?","Confirmar salida",JOptionPane.YES_NO_OPTION);
            if(i==0){
        System.exit(0);
        setDefaultCloseOperation(Login.EXIT_ON_CLOSE);
            }
    }//GEN-LAST:event_jSalirProMouseClicked

    private void jSalirInqMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSalirInqMouseClicked
        // TODO add your handling code here:
                 int i =JOptionPane.showConfirmDialog(this,"¿Desea Salir del sistema?","Confirmar salida",JOptionPane.YES_NO_OPTION);
            if(i==0){
        System.exit(0);
        setDefaultCloseOperation(Login.EXIT_ON_CLOSE);
            }
    }//GEN-LAST:event_jSalirInqMouseClicked

    private void jSalirInmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSalirInmMouseClicked
        // TODO add your handling code here:
           int i =JOptionPane.showConfirmDialog(this,"¿Desea Salir del sistema?","Confirmar salida",JOptionPane.YES_NO_OPTION);
            if(i==0){
        System.exit(0);
        setDefaultCloseOperation(Login.EXIT_ON_CLOSE);
            }
    }//GEN-LAST:event_jSalirInmMouseClicked

    private void jButtonContratoNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonContratoNuevoActionPerformed
        // TODO add your handling code here:
        Contrato cont = new Contrato();
        ConsultaContrato podCont = new ConsultaContrato();
        FromContrato frmCont = new FromContrato();

        CtrlContrato ctrl = new CtrlContrato(cont,podCont,frmCont);
        ctrl.iniciar();

    }//GEN-LAST:event_jButtonContratoNuevoActionPerformed

    private void jButtonContratoAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonContratoAbrirActionPerformed
        // TODO add your handling code here:
        Contrato contrato = new Contrato();
        ConsultaContrato cdContrato = new ConsultaContrato();
        ConsultasInquilno cdInquilino = new ConsultasInquilno();
        ConsultasInmueble cdInmueble = new ConsultasInmueble();
        FromContrato fromCont = new FromContrato();

        contrato = PanelContratoList.obtenerContratoDeTabla();
        if (contrato==null)
        { JOptionPane.showMessageDialog(null, "No se selecciono ningun inquilino de la tabla");}
        else {
            cdContrato.Buscar(contrato);
            fromCont.txtID_contrato.setText(Integer.toString(contrato.getId_contrato()));

            fromCont.jComboBoxEstadoContrato.setSelectedItem(contrato.getEstado_contrato());
            fromCont.txtMonto.setText(String.valueOf(contrato.getMonto()));
            fromCont.jDateChooserFecIni.setDate(Date.from(contrato.getFecha_ini().atStartOfDay(ZoneId.systemDefault()).toInstant()));
            fromCont.jDateChooserFecFin.setDate(Date.from(contrato.getFecha_fin().atStartOfDay(ZoneId.systemDefault()).toInstant()));

            CtrlContrato ctrlContrato = new CtrlContrato(contrato, cdContrato, fromCont);
            ArrayList<Inquilino> inquilinos=new ArrayList<Inquilino>();
            cdInquilino.obtenerInquilinos(inquilinos);
            for(Inquilino inq:inquilinos ){
                if(contrato.getDni_inquilino() == inq.getDni_inquilino()){

                    fromCont.jComboBoxInquilino.getModel().setSelectedItem(inq);
                    break;
                }
            }
            ArrayList<Inmueble> inmuebles=new ArrayList<Inmueble>();
            cdInmueble.obtenerInmuebles(inmuebles);
            for(Inmueble inm:inmuebles ){
                if(contrato.getId_inmueble() == inm.getId_inmueble()){

                    fromCont.jComboBoxInmueble.getModel().setSelectedItem(inm);
                    break;
                }
            }
            ctrlContrato.iniciar();
            //PanelContratoList.cargarContratos();false
            fromCont.jButtonBuscarInmueble.setEnabled(false);
            fromCont.jButtonBuscarInquilino.setEnabled(false);
            fromCont.jComboBoxInmueble.setEnabled(false);
            fromCont.jComboBoxInquilino.setEnabled(false);
            fromCont.jDateChooserFecFin.setEnabled(false);
            fromCont.jDateChooserFecIni.setEnabled(false);
            fromCont.txtMonto.setEditable(false);
            fromCont.jButtonGuardar.setEnabled(false);
            fromCont.txtID_contrato.setEditable(false);
            fromCont.jButtonLimpiar.setEnabled(false);
            // this.setEnabled(false);
        }
    }//GEN-LAST:event_jButtonContratoAbrirActionPerformed

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
            java.util.logging.Logger.getLogger(fromMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fromMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fromMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fromMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 new Login().setVisible(true);

                 
                 
                 
            /* new fromMenu().setVisible(true);
             fromMenu tablero=new fromMenu();
             tablero.setLocationRelativeTo(null);
             tablero.setVisible(true);*/
                
                //PROPIETARIO
          //    panelPropietarioList panelPropietarioList= new panelPropietarioList();
             // tablero.jPanelPropietario.add(panelPropietarioList);
              //panelPropietarioList.isEnabled();
                
                //inquilino
              //  PanelInquilino panelInquilino= new PanelInquilino();
              //  tablero.jPanelInquilino.add(panelInquilino);
               // panelInquilino.isEnabled();
                
            }
        });
        
        
     
    }
    
    public void enabledPanel (boolean flag){
         this.setVisible(flag);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButtonContratoAbrir;
    public javax.swing.JButton jButtonContratoNuevo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JPanel jPanelContrato;
    public static javax.swing.JPanel jPanelInmueble;
    private javax.swing.JPanel jPanelInquilino;
    private javax.swing.JPanel jPanelPropietario;
    private javax.swing.JLabel jSalirInm;
    private javax.swing.JLabel jSalirInq;
    private javax.swing.JLabel jSalirPro;
    public static javax.swing.JTabbedPane jTabbedPaneMenu;
    private javax.swing.JButton jbtnAbrirInquilino;
    private javax.swing.JButton jbtnBorrarInquilino;
    private javax.swing.JButton jbtnNuevoInquilino;
    // End of variables declaration//GEN-END:variables
}