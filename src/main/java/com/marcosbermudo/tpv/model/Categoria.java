/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.marcosbermudo.tpv.model;

import com.marcosbermudo.tpv.view.TPV;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComponent;
import javax.swing.JLabel;

/**
 *
 * @author Alumno
 */
public class Categoria extends javax.swing.JPanel {

    /**
     * Creates new form categoria
     */
    public String nombre;
    public String rutaImagenC;
    private static Categoria categoriaActiva;

    public Categoria(String nombre) {
        initComponents();
        this.nombre = nombre;
        setMaximumSize(new java.awt.Dimension(Integer.MAX_VALUE, 100));
        setPreferredSize(new java.awt.Dimension(160, 100));
        setMinimumSize(new java.awt.Dimension(140, 80));
        jLabel1.setText(nombre);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                setBackground(new Color(255, 102, 102));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setBackground(Categoria.this == categoriaActiva
                        ? new Color(255, 204, 204) : new Color(255, 153, 153));
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                for (Component comp : TPV.jPanel7.getComponents()) {
                    if (comp instanceof Categoria) comp.setBackground(new Color(255, 153, 153));
                }
                categoriaActiva = Categoria.this;
                setBackground(new Color(255, 204, 204));
                for (Component comp : TPV.jPanel4.getComponents()) {
                    comp.setVisible(Categoria.this.nombre.equals(comp.getName()));
                }
                TPV.jPanel1.revalidate();
                TPV.jPanel1.repaint();
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 153, 153));
        setMaximumSize(new java.awt.Dimension(32767, 100));
        setMinimumSize(new java.awt.Dimension(120, 80));
        setPreferredSize(new java.awt.Dimension(160, 100));
        setLayout(new java.awt.BorderLayout());
        add(jLabel2, java.awt.BorderLayout.CENTER);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(jLabel1, java.awt.BorderLayout.PAGE_START);
    }// </editor-fold>//GEN-END:initComponents
    public String getNombre() {
        return nombre;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

}
