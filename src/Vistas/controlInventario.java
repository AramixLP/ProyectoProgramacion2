/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import proyectoprogramacion2.Producto;
import proyectoprogramacion2.Proveedor;

/**
 *
 * @author Aramis
 */
public class controlInventario extends javax.swing.JFrame implements Serializable {

    private ArrayList<Proveedor> proveedores = new ArrayList();//arrays paracmetrizados
    private ArrayList<Producto> productos = new ArrayList();
    private ArrayList<Producto> entradaMercaderia = new ArrayList();
    private ArrayList<Producto> salidaMercaderia = new ArrayList();

    public ArrayList<Proveedor> getProveedores() {
        return proveedores;
    }

    public void setProveedores(ArrayList<Proveedor> proveedores) {
        this.proveedores = proveedores;
    }
    /**
     * Creates new form controlInventario
     */
    public controlInventario() {
        initComponents();
        this.setTitle("Empresa X Cédula Jurídica 3-101-234 Teléfono 22456787");// información se ve en barra de título
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
         this.addWindowListener(new WindowAdapter() {//cuando escuche clic del botón "x" cierre la ventana
            @Override
            public void windowClosing(WindowEvent e) {
                 cerrarAplicacion();
            }
        });
         this.setLocationRelativeTo(null);
       
    }

    public void cerrarAplicacion() {
        if (JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(this, "Desea cerrar la aplicacion?", "Cerrar", JOptionPane.YES_NO_OPTION)) {
            
            System.exit(0);
        }//end cerrarAplicacion
    }
    
    public void crearArchivo(String nombreArchivo,ArrayList<Proveedor> datos){
      
         
    }
 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuSalidaMercaderia = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItemGeneProductos = new javax.swing.JMenuItem();
        jMenuProveedor = new javax.swing.JMenuItem();
        jMenuMovimientos = new javax.swing.JMenuItem();
        jMenuEntradas = new javax.swing.JMenuItem();
        jMenuSalidas = new javax.swing.JMenuItem();
        jMenuExistenciaActual = new javax.swing.JMenuItem();
        jMenuAuditoria = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        jMenuItem4.setText("jMenuItem4");

        jMenuItem6.setText("jMenuItem6");

        jMenuItem16.setText("jMenuItem16");

        jMenuItem17.setText("jMenuItem17");

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 283, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                controlInventario.this.windowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jMenu1.setText("Registro");

        jMenuItem5.setText("Producto");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem7.setText("Proveedor");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Mercadería");

        jMenuItem8.setText("Entrada de Mercadería");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuSalidaMercaderia.setText("Salida de Mercadería");
        jMenuSalidaMercaderia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSalidaMercaderiaActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuSalidaMercaderia);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Reportes");

        jMenuItemGeneProductos.setText("General Productos");
        jMenuItemGeneProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGeneProductosActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemGeneProductos);

        jMenuProveedor.setText("Proveedor");
        jMenuProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuProveedorActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuProveedor);

        jMenuMovimientos.setText("General de movimientos");
        jMenuMovimientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuMovimientosActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuMovimientos);

        jMenuEntradas.setText("Entradas");
        jMenu3.add(jMenuEntradas);

        jMenuSalidas.setText("Salidas");
        jMenuSalidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSalidasActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuSalidas);

        jMenuExistenciaActual.setText("Existencia Actual");
        jMenu3.add(jMenuExistenciaActual);

        jMenuAuditoria.setText("Auditoria");
        jMenu3.add(jMenuAuditoria);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 283, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuSalidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSalidasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuSalidasActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        Registro r = new Registro();//inicializo ventana de registro de producto
        r.setVisible(true);//para que se vea la ventana
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        RegistroProveedor rP = new RegistroProveedor();//inicializo ventana de registro de producto pedecedero
        rP.setVisible(true);//para que se vea la ventana
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void windowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_windowClosing
        try {//cuando se cierre la ventana que me guarde toda la informacion en un archivo
            if (JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(this, "Desea cerrar la aplicacion?", "Cerrar", JOptionPane.YES_NO_OPTION)) {
            
            System.exit(0);
        }//end cerrarAplicacion
        
                File file = new File("Archivos");
                FileOutputStream in = new FileOutputStream(file);
                ObjectOutputStream salida = new ObjectOutputStream(in);
                    salida.writeObject(productos); 
                    
                    salida.writeObject(entradaMercaderia); 
                    salida.writeObject(salidaMercaderia);                   
                salida.close();
                
            } catch (Exception e) {
                
            }
    
    }//GEN-LAST:event_windowClosing

    private void jMenuItemGeneProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGeneProductosActionPerformed
         ReporteProductos r = new ReporteProductos();//inicializo ventana de reporte general de producto
        r.setVisible(true);//para que se vea la ventana
    }//GEN-LAST:event_jMenuItemGeneProductosActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        entradaMercaderia entMer = new entradaMercaderia();//inicializo ventana de entrada mercaderia
        entMer.setVisible(true);//para que se vea la ventana
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuSalidaMercaderiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSalidaMercaderiaActionPerformed
         SalidaMercaderia salMer = new SalidaMercaderia();//inicializo ventana de salida mercaderia
        salMer.setVisible(true);//para que se vea la ventana
    }//GEN-LAST:event_jMenuSalidaMercaderiaActionPerformed

    private void jMenuProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuProveedorActionPerformed
        ReporteProveedores rePro = new ReporteProveedores();//inicializo ventana de reporte general de proveedor
        rePro.setVisible(true);//para que se vea la ventana
    }//GEN-LAST:event_jMenuProveedorActionPerformed

    private void jMenuMovimientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuMovimientosActionPerformed
        
    }//GEN-LAST:event_jMenuMovimientosActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(controlInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(controlInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(controlInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(controlInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new controlInventario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuItem jMenuAuditoria;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuEntradas;
    private javax.swing.JMenuItem jMenuExistenciaActual;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItemGeneProductos;
    private javax.swing.JMenuItem jMenuMovimientos;
    private javax.swing.JMenuItem jMenuProveedor;
    private javax.swing.JMenuItem jMenuSalidaMercaderia;
    private javax.swing.JMenuItem jMenuSalidas;
    // End of variables declaration//GEN-END:variables
}