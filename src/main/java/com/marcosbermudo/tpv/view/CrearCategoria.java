/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.marcosbermudo.tpv.view;

import com.marcosbermudo.tpv.service.CategoriaXML;
import com.marcosbermudo.tpv.model.Categoria;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;


public class CrearCategoria extends javax.swing.JDialog {


    public JButton[] jb;
    private Color colorSeleccionado;
    String ruta = "";

    boolean existe = false;

    public CrearCategoria(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        JButton[] buttons = {this.jButton3};

        for (JButton button : buttons) {
            ImageIcon icon = (ImageIcon) button.getIcon();
            if (icon != null) {
                Image image = icon.getImage();

                Image newImage = image.getScaledInstance(button.getWidth(), button.getHeight(), Image.SCALE_SMOOTH);

                ImageIcon newIcon = new ImageIcon(newImage);

                button.setIcon(newIcon);
            }
        }

        try {

            java.net.URL imgURL = getClass().getResource("/color.png");

            if (imgURL != null) {

                ImageIcon icon = new ImageIcon(imgURL);

                Image scaledImage = icon.getImage().getScaledInstance(
                    jButton3.getWidth(), 
                    jButton3.getHeight(), 
                    Image.SCALE_SMOOTH
                );

                jButton3.setIcon(new ImageIcon(scaledImage));
            } else {
                System.err.println("No se encontró la imagen en src/main/resources/color.png");
            }
        } catch (Exception e) {
            System.err.println("Error al cargar la imagen: " + e.getMessage());
        }
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                    jButton1ActionPerformed(null);
                }
            }
        });
    }

    private boolean categoriaExiste(String nombre) {
        for (Component comp : TPV.jPanel7.getComponents()) {
            if (comp instanceof Categoria && ((Categoria) comp).nombre.equals(nombre)) {
                return true;
            }
        }
        return false;
    }

    private Color generarColorAleatorio() {
        Random random = new Random();
        int r = 180 + random.nextInt(56);
        int g = 180 + random.nextInt(56);
        int b = 180 + random.nextInt(56);
    
        return new Color(r, g, b);    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jTextField1.setForeground(new java.awt.Color(153, 153, 153));
        jTextField1.setText("Añadir Categoría...");
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });

        jButton1.setText("Crear");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setMaximumSize(new java.awt.Dimension(30, 30));
        jPanel2.setMinimumSize(new java.awt.Dimension(30, 30));
        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanel2.setLayout(new javax.swing.OverlayLayout(jPanel2));

        jButton3.setBackground(new java.awt.Color(204, 204, 255));
        jButton3.setBorderPainted(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setMaximumSize(new java.awt.Dimension(30, 30));
        jButton3.setMinimumSize(new java.awt.Dimension(30, 30));
        jButton3.setOpaque(true);
        jButton3.setPreferredSize(new java.awt.Dimension(30, 30));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);

        jLabel2.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        jLabel2.setText("Categoría");

        jButton4.setText("Cancelar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setText("Añadir imagen");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jButton5.setText("Editar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Eliminar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jButton6)
                            .addGap(36, 36, 36)
                            .addComponent(jButton5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addGap(27, 27, 27)
                .addComponent(jButton4)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Random random = new Random();
    private List<Categoria> categorias;

    public void modificar(int visible) {
        if (visible == 1) {
            jButton5.setEnabled(false);
            jButton6.setEnabled(false);
        } else if (visible == 2) {
            jButton1.setEnabled(false);
            jButton6.setEnabled(false);
        } else if (visible == 3) {
            jButton1.setEnabled(false);
            jButton5.setEnabled(false);
            jLabel1.setEnabled(false);
        }
        this.repaint();
        this.revalidate();
    }


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        categorias = new ArrayList<>();
        String nombreCategoria = jTextField1.getText().trim();
        if (nombreCategoria.isEmpty() || nombreCategoria.equals("Añadir Categoría...")) {
            JOptionPane.showMessageDialog(this, "El nombre de la categoría no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (categoriaExiste(nombreCategoria)) {
            JOptionPane.showMessageDialog(this, "Ya existe una categoría con este nombre.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Categoria c = new Categoria(nombreCategoria);
        c.jLabel1.setText(nombreCategoria);
        TPV.jPanel7.add(c);
        c.setName(nombreCategoria);

        ////////
        categorias.add(c);
        CategoriaXML.guardarCategorias(categorias);
        ////////

        TPV.jPanel7.add(Box.createRigidArea(new Dimension(0, 10)));
        PanelProductos pp = new PanelProductos();
        pp.jPanel1.setBackground(colorSeleccionado != null ? colorSeleccionado : generarColorAleatorio());
        TPV.jPanel4.add(pp);
        pp.setName(nombreCategoria);

        for (int i = 0; i < TPV.jPanel4.getComponentCount() - 1; i++) {
            ((JPanel) TPV.jPanel4.getComponent(i)).setVisible(false);
        }

        if (jLabel1.getIcon() != null) {
            Icon icon = jLabel1.getIcon();
            ImageIcon imc = (ImageIcon) icon;
            Image imagen = imc.getImage();
            c.rutaImagenC = imc.getDescription();
            System.out.println(c.rutaImagenC);
            ImageIcon nico = new ImageIcon(imagen.getScaledInstance(150, 120, Image.SCALE_SMOOTH));
            c.rutaImagenC = ruta;
            c.jLabel2.setIcon(nico);
        }
        TPV.jPanel1.revalidate();
        TPV.jPanel1.repaint();
        this.dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        jTextField1.setText("");
        jTextField1.setForeground(Color.black);
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            Image icon = ImageIO.read(new File(""));
            this.setIconImage(icon);
        } catch (IOException e) {
            System.out.println("Problemas al cargar la imagen");
        }
        Color nuevoColor = JColorChooser.showDialog(this, "Selecciona un color", Color.WHITE);
        if (nuevoColor != null) {
            colorSeleccionado = nuevoColor;
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        String nuevoNombre = "";
        String nombre = "";
        int id = 0, id2 = 0;
        for (int i = 0; i < TPV.jPanel7.getComponentCount(); i += 2) {
            if (TPV.jPanel7.getComponent(i).getName().equalsIgnoreCase(jTextField1.getText())) {
                id = i;
                nombre = TPV.jPanel7.getComponent(i).getName();
                existe = true;
            }
        }
        for (int j = 0; j < TPV.jPanel4.getComponentCount(); j++) {
            if (TPV.jPanel4.getComponent(j).getName().equalsIgnoreCase(jTextField1.getText())) {
                id2 = j;
            }
        }
        if (jTextField1.getText().trim().equals("") || jTextField1.getText().equals("Nombre de la nueva categoría")) {

            JOptionPane.showMessageDialog(null, "El campo no puede estar vacio");

        } else if (!existe) {
            JOptionPane.showMessageDialog(null, "La categoría no existe");
        } else if (existe) {

            nuevoNombre = JOptionPane.showInputDialog(null, "Antiguo nombre: " + nombre + "\nIngrese el nuevo nombre de la categoria");
            if (nuevoNombre == null || nuevoNombre.trim().isEmpty()) return;
            nuevoNombre = nuevoNombre.trim();
            if (!nuevoNombre.equalsIgnoreCase(nombre) && categoriaExiste(nuevoNombre)) {
                JOptionPane.showMessageDialog(this, "Ya existe esa categoría");
                return;
            }

            Categoria cat = null;
            cat = (Categoria) TPV.jPanel7.getComponent(id);
            cat.nombre = nuevoNombre;
            cat.jLabel1.setText(nuevoNombre);
            TPV.jPanel7.getComponent(id).setName(nuevoNombre);
            TPV.jPanel4.getComponent(id2).setName(nuevoNombre);
            if (jLabel1.getIcon() != null) {
                Icon icon = jLabel1.getIcon();
                ImageIcon imc = (ImageIcon) icon;
                Image imagen = imc.getImage();
                cat.rutaImagenC = imc.getDescription();
                System.out.println(cat.rutaImagenC);
                ImageIcon ico = new ImageIcon(imagen.getScaledInstance(cat.jLabel2.getWidth(), cat.jLabel2.getHeight(), Image.SCALE_SMOOTH));
                cat.rutaImagenC = ruta;
                cat.jLabel2.setIcon(ico);
            }
            TPV.jPanel1.repaint();
            TPV.jPanel1.revalidate();
            this.dispose();
        }


    }//GEN-LAST:event_jButton5ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        JFileChooser jfile = new JFileChooser();
        FileNameExtensionFilter filtrado = new FileNameExtensionFilter("JPG", "jpg", "PNG", "png");
        jfile.setFileFilter(filtrado);
        int respuesta = jfile.showOpenDialog(this);
        if (respuesta == JFileChooser.APPROVE_OPTION) {
            ruta = jfile.getSelectedFile().getPath();
            Image mI = new ImageIcon(ruta).getImage();
            ImageIcon mIc = new ImageIcon(mI.getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_SMOOTH));
            jLabel1.setIcon(mIc);
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        int id = 0, id2 = 0;
        for (int i = 0; i < TPV.jPanel7.getComponentCount(); i += 2) {

            if (TPV.jPanel7.getComponent(i).getName().equalsIgnoreCase(jTextField1.getText())) {
                id = TPV.jPanel7.getComponentZOrder(TPV.jPanel7.getComponent(i));
                existe = true;
            }
        }
        for (int j = 0; j < TPV.jPanel4.getComponentCount(); j++) {
            if (TPV.jPanel4.getComponent(j).getName().equalsIgnoreCase(jTextField1.getText())) {
                id2 = TPV.jPanel4.getComponentZOrder(TPV.jPanel4.getComponent(j));
            }
        }
        if (jTextField1.getText().trim().equals("") || jTextField1.getText().equals("Nombre de la nueva categoria")) {
            JOptionPane.showMessageDialog(null, "El campo no puede estar vacio");
        } else if (!existe) {
            JOptionPane.showMessageDialog(null, "La categoría no existe");

        } else {
            int op = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea eliminar la categoría y sus productos?", "Confirmación", JOptionPane.YES_NO_OPTION);
            if (op == 0) {
                TPV.jPanel7.remove(id);
                TPV.jPanel7.remove(id);
                TPV.jPanel4.remove(id2);
                TPV.jPanel1.repaint();
                TPV.jPanel1.revalidate();
            }
            this.dispose();
        }
    }//GEN-LAST:event_jButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
