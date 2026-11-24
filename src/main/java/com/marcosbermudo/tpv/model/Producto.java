/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.marcosbermudo.tpv.model;

import com.marcosbermudo.tpv.view.TPV;
import java.awt.Color;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Alumno
 */
public class Producto extends javax.swing.JPanel {

    /**
     * Creates new form Producto
     */
    public String nombre;
    public BigDecimal precio;

    public Producto(String nombre, BigDecimal precio) {
        initComponents();
        this.precio = precio;
        this.nombre = nombre;

        this.jLabel2.setPreferredSize(new java.awt.Dimension(160, 48));
        this.jLabel2.setMinimumSize(new java.awt.Dimension(0, 0));
        this.jLabel2.setText(nombre);
        this.jLabel1.setText(String.format("%.2f €", precio));

        this.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent e) {
                setBackground(new Color(255, 102, 102));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setBackground(new Color(255, 153, 153));
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                setBackground(new Color(255, 204, 204));

                TPV.añadirProducto(Producto.this.nombre, Producto.this.precio, 1);

                TPV.jPanel1.revalidate();
                TPV.jPanel1.repaint();

            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 153, 153));
        setMaximumSize(new java.awt.Dimension(131, 131));
        setMinimumSize(new java.awt.Dimension(131, 131));
        setPreferredSize(new java.awt.Dimension(131, 131));
        setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("jLabel1");
        add(jLabel1, java.awt.BorderLayout.CENTER);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("jLabel1");
        jLabel2.setMaximumSize(new java.awt.Dimension(160, 160));
        jLabel2.setMinimumSize(new java.awt.Dimension(120, 120));
        jLabel2.setPreferredSize(new java.awt.Dimension(140, 140));
        add(jLabel2, java.awt.BorderLayout.PAGE_START);

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.BorderLayout());

        jButton1.setText("Editar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, java.awt.BorderLayout.LINE_END);

        jButton2.setText("Borrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, java.awt.BorderLayout.LINE_START);

        add(jPanel1, java.awt.BorderLayout.PAGE_END);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nuevoNombre = JOptionPane.showInputDialog(this, "Introduce el nuevo nombre del producto:", nombre);

        if (nuevoNombre == null || nuevoNombre.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El nombre no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
            return; 
        }

        String nuevoPrecioText = JOptionPane.showInputDialog(this, "Introduce el nuevo precio del producto:", precio);

        if (nuevoPrecioText == null) return;
        BigDecimal nuevoPrecio;
        try {
            nuevoPrecio = new BigDecimal(nuevoPrecioText.trim().replace(',', '.')).setScale(2, RoundingMode.UNNECESSARY);
            if (nuevoPrecio.signum() <= 0) {
                throw new NumberFormatException("El precio debe ser mayor que 0.");
            }
        } catch (NumberFormatException | ArithmeticException e) {
            JOptionPane.showMessageDialog(this, "El precio no es válido. Asegúrate de ingresar un número válido mayor que 0.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        this.nombre = nuevoNombre.trim();
        this.precio = nuevoPrecio;

        jLabel2.setText(nuevoNombre);
        jLabel1.setText(String.format("%.2f €", nuevoPrecio));

        JOptionPane.showMessageDialog(this, "Producto actualizado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int confirm = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que deseas eliminar este producto?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            this.setVisible(false);

            JPanel panelPadre = (JPanel) this.getParent();
            panelPadre.remove(this);

            panelPadre.revalidate();
            panelPadre.repaint();

            JOptionPane.showMessageDialog(this, "Producto eliminado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
