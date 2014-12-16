package Vistas;

import java.util.ArrayList;
import proyectoprogramacion2.OrdenCompra;
import proyectoprogramacion2.Producto;
import proyectoprogramacion2.Sistema;

/**
 *
 * @author kate
 */
public class entradaMercaderia extends javax.swing.JFrame {
    Sistema sis;
    private OrdenCompra ordComp;

    /**
     * Creates new form entradaMercaderia
     */
    public entradaMercaderia() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Entrada Mercadería");
        sis = new Sistema();
    }

    public void reliazarCompra() {
        /*
         orden de compra 
         cedula juridica
         */

    }

    public void mostarCompra() {
        txtCliente.setVisible(true);
        txtFactura.setVisible(true);
        jTxtMotivo.setVisible(true);

    }

    public void ocultarCompra() {
        txtCodigoPedecedero.setVisible(false);
        txtCodigoProducto.setVisible(false);
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
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jRadioButtonOrdenCompra = new javax.swing.JRadioButton();
        jRadioButtonDevolucion = new javax.swing.JRadioButton();
        jLCliente = new javax.swing.JLabel();
        jLFactura = new javax.swing.JLabel();
        jLMotivo = new javax.swing.JLabel();
        txtFactura = new javax.swing.JTextField();
        txtCliente = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTxtMotivo = new javax.swing.JTextPane();
        jLabel9 = new javax.swing.JLabel();
        txtCodigoProducto = new javax.swing.JTextField();
        jLProducto = new javax.swing.JLabel();
        jLPedecedero = new javax.swing.JLabel();
        txtCodigoPedecedero = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ENTRADA DE MERCADERIA");

        buttonGroup1.add(jRadioButtonOrdenCompra);
        jRadioButtonOrdenCompra.setText("Orden de Compra");
        jRadioButtonOrdenCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonOrdenCompraActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonDevolucion);
        jRadioButtonDevolucion.setText("Devoulución");

        jLCliente.setText("Cliente:");

        jLFactura.setText("Factura:");

        jLMotivo.setText("Motivo:");

        jButton1.setText("Incorporar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jTxtMotivo);

        jLProducto.setText("Producto");

        jLPedecedero.setText("Pedecedero");

        jLabel10.setText("Código");

        jLabel11.setText("Código");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLProducto)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(jLPedecedero)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCodigoProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(txtCodigoPedecedero))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)))
                .addGap(142, 142, 142)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLMotivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(25, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLCliente)
                                .addGap(8, 8, 8)
                                .addComponent(txtCliente))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLFactura)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFactura)))
                        .addGap(59, 59, 59))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(198, 198, 198))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jRadioButtonOrdenCompra)
                        .addGap(99, 99, 99)
                        .addComponent(jRadioButtonDevolucion))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel1)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonDevolucion)
                    .addComponent(jRadioButtonOrdenCompra))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLFactura)
                    .addComponent(txtFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCliente)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLMotivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(43, 43, 43))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(23, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLProducto)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel9)
                        .addGap(26, 26, 26)
                        .addComponent(jLPedecedero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtCodigoPedecedero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtCodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonOrdenCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonOrdenCompraActionPerformed
        mostarCompra();

    }//GEN-LAST:event_jRadioButtonOrdenCompraActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String codigo = txtCodigoProducto.getText();
        int cantidad = Integer.parseInt(txtCodigoProducto.getText());
        if (jRadioButtonOrdenCompra.isSelected()) {
            sis.ingresarMercaderia(WIDTH, cantidad, codigo, cantidad, cantidad);
        } else {
            sis.salidaProducto(WIDTH, cantidad, codigo, cantidad, cantidad);
        }
        if (jRadioButtonDevolucion.isSelected()){
            
        }
         
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLCliente;
    private javax.swing.JLabel jLFactura;
    private javax.swing.JLabel jLMotivo;
    private javax.swing.JLabel jLPedecedero;
    private javax.swing.JLabel jLProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButtonDevolucion;
    private javax.swing.JRadioButton jRadioButtonOrdenCompra;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTxtMotivo;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtCodigoPedecedero;
    private javax.swing.JTextField txtCodigoProducto;
    private javax.swing.JTextField txtFactura;
    // End of variables declaration//GEN-END:variables
}
