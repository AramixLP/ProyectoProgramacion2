/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vistas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import proyectoprogramacion2.Producto;
import proyectoprogramacion2.Sistema;
import proyectoprogramacion2.empresa;

/**
 *
 * @author kate
 */
public class ReporteProductos extends javax.swing.JFrame {
    ArrayList<Producto> productos = new ArrayList();
    private empresa miEmpresa;

    private Sistema sis;

    /**
     * Creates new form NewJFrame
     */
    public ReporteProductos() {
        initComponents();
        sis = new Sistema();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtBuscarReporteProducto = new javax.swing.JTextArea();
        btnReporte = new javax.swing.JButton();
        btnGuardarReporteProducto = new javax.swing.JButton();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("REPORTE PRODUCTOS");

        txtBuscarReporteProducto.setColumns(20);
        txtBuscarReporteProducto.setRows(5);
        jScrollPane2.setViewportView(txtBuscarReporteProducto);

        btnReporte.setText("Ver Reporte");
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });

        btnGuardarReporteProducto.setText("Guardar Reporte");
        btnGuardarReporteProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarReporteProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(btnReporte)
                        .addGap(57, 57, 57)
                        .addComponent(btnGuardarReporteProducto))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel1)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReporte)
                    .addComponent(btnGuardarReporteProducto))
                .addGap(54, 54, 54))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
        String s="";
        for(Producto p: productos){
            s+=p.informacionProducto();
        }
        txtBuscarReporteProducto.setText(s);
    }//GEN-LAST:event_btnReporteActionPerformed

    private void btnGuardarReporteProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarReporteProductoActionPerformed
        try{
          File f = new File("ReporteProducto.txt");
          FileWriter FW = new FileWriter(f,true);
          BufferedWriter writer = new BufferedWriter(FW);
          
          String texto= "----------REPORTE PRODUCTOS-----------\n";
                  
                  
          for (Producto p: productos){
               texto +="\nCodigo: "+p.getCodigo()+"\nProducto: "+p.getNombre()+"\nExistencia: "+p.getCantidad();
          }
          writer.append(texto);
          writer.close();
      }catch (Exception e){
    }//GEN-LAST:event_btnGuardarReporteProductoActionPerformed
    }
    
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try{
            File file = new File("productos");
            if(file.exists()){
                FileInputStream in = new FileInputStream(file);
                ObjectInputStream entrada = new ObjectInputStream(in);
                
                productos = (ArrayList<Producto>)entrada.readObject();
                
                entrada.close();
            }else{
                throw new Exception();
            }
        }catch(Exception e){
             txtBuscarReporteProducto.setText("Error al recuperar el archivo");
        }

    }//GEN-LAST:event_formWindowOpened

   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarReporteProducto;
    private javax.swing.JButton btnReporte;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtBuscarReporteProducto;
    // End of variables declaration//GEN-END:variables
}
