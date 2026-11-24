/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.marcosbermudo.tpv.view;

import java.io.*;
import java.nio.file.*;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import com.itextpdf.html2pdf.ConverterProperties;

import javax.swing.JOptionPane;
import com.itextpdf.html2pdf.HtmlConverter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

import javax.imageio.ImageIO;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alumno
 */
public class TPV extends javax.swing.JFrame {

    public static DefaultTableModel modelo;
    private HashMap<Integer, DefaultTableModel> pedidos;
    private int currentPedido;


    public TPV() {

        initComponents();
        jTable2.setPreferredSize(null);
        jTable2.setMinimumSize(null);
        jTable2.setMaximumSize(null);
        jPanel2.setMinimumSize(new java.awt.Dimension(180, 0));
        jPanel2.setMaximumSize(null);
        jPanel3.setMinimumSize(new java.awt.Dimension(300, 0));
        jPanel3.setPreferredSize(new java.awt.Dimension(320, 0));
        jPanel3.setMaximumSize(null);
        jTable2.setFillsViewportHeight(true);
        jTable2.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        pedidos = new HashMap<>();
        currentPedido = 1;
        crearNuevoPedido(currentPedido);
        modelo = pedidos.get(currentPedido);
        jTable2.setModel(modelo);
        actualizarTotalCuenta();
        try {
            java.net.URL logo = getClass().getResource("/logo.jpg");
            if (logo != null) setIconImage(ImageIO.read(logo));
        } catch (IOException e) {
            System.err.println("No se pudo cargar el logo: " + e.getMessage());
        }
        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));
        jSpinner1.addChangeListener(e -> cambiarPedido((int) jSpinner1.getValue()));
        setExtendedState(TPV.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel7 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jPanel4 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setMaximumSize(new java.awt.Dimension(150, 32767));
        jPanel2.setMinimumSize(new java.awt.Dimension(150, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(150, 474));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel7.setBackground(new java.awt.Color(153, 153, 255));
        jPanel7.setLayout(new javax.swing.BoxLayout(jPanel7, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane2.setViewportView(jPanel7);

        jPanel2.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel2, java.awt.BorderLayout.LINE_START);

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));
        jPanel3.setMinimumSize(new java.awt.Dimension(280, 0));
        jPanel3.setPreferredSize(new java.awt.Dimension(300, 474));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jScrollPane3.setMaximumSize(new java.awt.Dimension(225, 32767));
        jScrollPane3.setMinimumSize(new java.awt.Dimension(225, 16));
        jScrollPane3.setPreferredSize(new java.awt.Dimension(225, 402));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable2.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable2.setMaximumSize(new java.awt.Dimension(225, 80));
        jTable2.setMinimumSize(new java.awt.Dimension(225, 80));
        jTable2.setPreferredSize(new java.awt.Dimension(225, 80));
        jScrollPane3.setViewportView(jTable2);

        jPanel3.add(jScrollPane3, java.awt.BorderLayout.CENTER);

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setMaximumSize(new java.awt.Dimension(225, 50));
        jPanel5.setMinimumSize(new java.awt.Dimension(225, 50));
        jPanel5.setPreferredSize(new java.awt.Dimension(225, 50));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jPanel6.setBackground(new java.awt.Color(204, 204, 255));
        jPanel6.setMaximumSize(new java.awt.Dimension(225, 100));
        jPanel6.setMinimumSize(new java.awt.Dimension(225, 100));
        jPanel6.setPreferredSize(new java.awt.Dimension(225, 100));
        jPanel6.setLayout(new java.awt.GridLayout(1, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText(" Total:");
        jLabel1.setMaximumSize(new java.awt.Dimension(33, 50));
        jLabel1.setMinimumSize(new java.awt.Dimension(33, 50));
        jLabel1.setPreferredSize(new java.awt.Dimension(33, 50));
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel6.add(jLabel1);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("0.00");
        jPanel6.add(jLabel3);

        jButton1.setBackground(new java.awt.Color(204, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Cobrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton1);

        jPanel5.add(jPanel6, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel5, java.awt.BorderLayout.PAGE_END);

        jPanel8.setBackground(new java.awt.Color(153, 153, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jLabel2.setText("MESA");
        jPanel8.add(jLabel2, java.awt.BorderLayout.CENTER);
        jPanel8.add(jSpinner1, java.awt.BorderLayout.LINE_END);

        jPanel3.add(jPanel8, java.awt.BorderLayout.PAGE_START);

        jPanel1.add(jPanel3, java.awt.BorderLayout.LINE_END);

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.setLayout(new java.awt.CardLayout());
        jPanel1.add(jPanel4, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, "card2");

        jMenu1.setText("Categoría");

        jMenuItem1.setText("Añadir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem4.setText("Editar");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setText("Eliminar");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Productos");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });

        jMenuItem2.setText("Añadir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (jTable2.isEditing() && !jTable2.getCellEditor().stopCellEditing()) return;
        if (modelo.getRowCount() > 0) {
            int pagoRealizado = JOptionPane.showConfirmDialog(this, "¿Quiere realizar ya el pago de los productos?", "Confirmar pago", JOptionPane.YES_NO_OPTION);

            if (pagoRealizado == JOptionPane.YES_OPTION) {
                try {
                    Path factura = exportPDF();
                    modelo.setRowCount(0);
                    JOptionPane.showMessageDialog(this, "Cobro simulado registrado. Factura: " + factura);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "No se pudo generar la factura. El pedido se conserva: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Añade al menos un producto", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        CrearCategoria categoria = new CrearCategoria(this, true);
        categoria.modificar(1);
        categoria.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        if (jPanel4.getComponentCount() > 0) {
            CrearProducto cc = new CrearProducto(this, true);
            cc.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Crea al menos una categoría", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        if (TPV.jPanel7.getComponentCount() == 0) {
            JOptionPane.showMessageDialog(null, "No existe ninguna categoría");
        } else {
            CrearCategoria categoria = new CrearCategoria(this, true);
            categoria.modificar(2);
            categoria.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        if (TPV.jPanel7.getComponentCount() == 0) {
            JOptionPane.showMessageDialog(null, "No existe ninguna categoría");
        } else {
            CrearCategoria categoria = new CrearCategoria(this, true);
            categoria.modificar(3);
            categoria.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2MouseClicked

    public void actualizarTotalCuenta() {
        BigDecimal total = BigDecimal.ZERO;
        for (int i = 0; i < modelo.getRowCount(); i++) {
            total = total.add((BigDecimal) modelo.getValueAt(i, 3));
        }
        jLabel3.setText(total.setScale(2).toPlainString() + " €");
    }

    private void crearNuevoPedido(int pedido) {
        DefaultTableModel nuevoModelo = new DefaultTableModel(null,
                new String[]{"Cantidad", "Producto", "Precio", "Total"}) {
            @Override
            public boolean isCellEditable(int fila, int columna) {
                return columna == 0;
            }

            @Override
            public void setValueAt(Object valor, int fila, int columna) {
                if (columna != 0) {
                    super.setValueAt(valor, fila, columna);
                    return;
                }
                int cantidad;
                try {
                    cantidad = Integer.parseInt(valor.toString().trim());
                    if (cantidad < 0) throw new NumberFormatException();
                } catch (NumberFormatException | NullPointerException e) {
                    JOptionPane.showMessageDialog(TPV.this, "Introduce una cantidad entera no negativa.");
                    return;
                }
                if (cantidad == 0) {
                    removeRow(fila);
                } else {
                    BigDecimal precio = (BigDecimal) getValueAt(fila, 2);
                    super.setValueAt(cantidad, fila, 0);
                    super.setValueAt(precio.multiply(BigDecimal.valueOf(cantidad)), fila, 3);
                }
            }
        };
        nuevoModelo.addTableModelListener(e -> {
            if (modelo == nuevoModelo) actualizarTotalCuenta();
        });
        pedidos.put(pedido, nuevoModelo);
    }

    private void cambiarPedido(int nuevoPedido) {
        if (jTable2.isEditing()) jTable2.getCellEditor().stopCellEditing();
        if (!pedidos.containsKey(nuevoPedido)) crearNuevoPedido(nuevoPedido);
        currentPedido = nuevoPedido;
        modelo = pedidos.get(nuevoPedido);
        jTable2.setModel(modelo);
        actualizarTotalCuenta();
    }

    public static void añadirProducto(String producto, BigDecimal precio, int cantidad) {
        if (jTable2.isEditing()) jTable2.getCellEditor().stopCellEditing();
        for (int i = 0; i < modelo.getRowCount(); i++) {
            if (producto.equals(modelo.getValueAt(i, 1))
                    && precio.compareTo((BigDecimal) modelo.getValueAt(i, 2)) == 0) {
                modelo.setValueAt((Integer) modelo.getValueAt(i, 0) + cantidad, i, 0);
                return;
            }
        }
        modelo.addRow(new Object[]{cantidad, producto, precio, precio.multiply(BigDecimal.valueOf(cantidad))});
    }

    private String escaparHtml(String texto) {
        return texto.replace("&", "&amp;").replace("<", "&lt;")
                .replace(">", "&gt;").replace("\"", "&quot;").replace("'", "&#39;");
    }

    private Path exportPDF() throws IOException {
        String html = Files.readString(Path.of("index.html"), StandardCharsets.UTF_8);
        String inicio = "<!-- START -->";
        int desde = html.indexOf(inicio);
        int hasta = html.indexOf("<!-- END -->");
        if (desde < 0 || hasta < desde + inicio.length()) {
            throw new IOException("Plantilla HTML incorrecta");
        }
        StringBuilder filas = new StringBuilder();
        BigDecimal total = BigDecimal.ZERO;
        for (int i = 0; i < modelo.getRowCount(); i++) {
            filas.append("<tr>");
            for (int k = 0; k < modelo.getColumnCount(); k++) {
                filas.append("<td style='text-align:center;'>")
                        .append(escaparHtml(modelo.getValueAt(i, k).toString())).append("</td>");
            }
            filas.append("</tr>");
            total = total.add((BigDecimal) modelo.getValueAt(i, 3));
        }
        LocalDateTime ahora = LocalDateTime.now();
        filas.append("<tr><td colspan='4'>Total: ").append(total.setScale(2).toPlainString())
                .append(" €</td></tr><tr><td colspan='4'>Fecha: ")
                .append(ahora.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")))
                .append("</td></tr>");
        html = html.substring(0, desde + inicio.length()) + filas + html.substring(hasta);
        Path carpeta = Path.of("Historial Facturas", ahora.format(DateTimeFormatter.ofPattern("yyyy-MM")),
                ahora.format(DateTimeFormatter.ofPattern("dd")));
        Files.createDirectories(carpeta);
        Path pdf = Files.createTempFile(carpeta, ahora.format(DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss_")), ".pdf");
        try (OutputStream salida = Files.newOutputStream(pdf)) {
            ConverterProperties propiedades = new ConverterProperties();
            propiedades.setBaseUri(Path.of(".").toAbsolutePath().toUri().toString());
            HtmlConverter.convertToPdf(html, salida, propiedades);
        } catch (IOException | RuntimeException e) {
            Files.deleteIfExists(pdf);
            throw e;
        }
        return pdf;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    public static javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner jSpinner1;
    public static javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
