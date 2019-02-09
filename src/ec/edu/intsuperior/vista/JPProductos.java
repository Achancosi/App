/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.controlador.Controlador;

/**
 *
 * @author userpc
 */
public class JPProductos extends javax.swing.JPanel {
Controlador controlador;
    /**
     * Creates new form JPProductos
     * @param controlador
     */
    public JPProductos(Controlador controlador) {
        initComponents();
        this.controlador=controlador;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setLayout(new java.awt.GridLayout(6, 2));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Codigo");
        jPanel1.add(jLabel1);

        jTextField1.setMinimumSize(new java.awt.Dimension(120, 20));
        jTextField1.setPreferredSize(new java.awt.Dimension(70, 20));
        jPanel1.add(jTextField1);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Detalle");
        jPanel1.add(jLabel2);

        jTextField2.setMinimumSize(new java.awt.Dimension(120, 20));
        jTextField2.setPreferredSize(new java.awt.Dimension(70, 20));
        jPanel1.add(jTextField2);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Iva");
        jPanel1.add(jLabel3);

        jTextField3.setMinimumSize(new java.awt.Dimension(120, 20));
        jTextField3.setPreferredSize(new java.awt.Dimension(70, 20));
        jPanel1.add(jTextField3);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Precio de Compra");
        jPanel1.add(jLabel4);

        jTextField4.setMinimumSize(new java.awt.Dimension(120, 20));
        jTextField4.setPreferredSize(new java.awt.Dimension(70, 20));
        jPanel1.add(jTextField4);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Precio de Venta");
        jPanel1.add(jLabel5);

        jTextField5.setMinimumSize(new java.awt.Dimension(120, 20));
        jTextField5.setPreferredSize(new java.awt.Dimension(70, 20));
        jPanel1.add(jTextField5);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Stock");
        jPanel1.add(jLabel6);

        jTextField6.setMinimumSize(new java.awt.Dimension(120, 20));
        jTextField6.setPreferredSize(new java.awt.Dimension(70, 20));
        jPanel1.add(jTextField6);

        add(jPanel1);

        jToolBar1.setFloatable(false);
        jToolBar1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/intsuperior/recursos/new_add_insert_file_13948.png"))); // NOI18N
        jButton1.setToolTipText("NUEVO");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton1);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/intsuperior/recursos/save_icon-icons.com_53618.png"))); // NOI18N
        jButton2.setToolTipText("GUARDAR");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton2);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/intsuperior/recursos/organizer_calendar_clock_pencil_10047.png"))); // NOI18N
        jButton3.setToolTipText("EDITAR");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton3);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/intsuperior/recursos/delete-file_40456.png"))); // NOI18N
        jButton4.setToolTipText("ELIMINAR");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton4);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/intsuperior/recursos/find_search_card_user_16713.png"))); // NOI18N
        jButton7.setToolTipText("BUSCAR");
        jButton7.setFocusable(false);
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton7);

        add(jToolBar1);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}