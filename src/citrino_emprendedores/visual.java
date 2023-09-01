/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citrino_emprendedores;

import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.SftpException;
import java.awt.Color;
import java.awt.Component;
import logica.milogica;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author belu
 */
public class visual extends javax.swing.JFrame {

    public milogica ml = new milogica();

    /**
     * Creates new form visual
     */
    public visual() {

        initComponents();
        this.setLocationRelativeTo(null);
        comboEmprendimientos.setModel(ml.cargarEmprendimientos());
        comboEmprendimientos2.setModel(ml.cargarEmprendimientos());

        tablaArticulos.setModel(ml.cargarArticulos());

        tablaEmprendedores.setModel(ml.cargarEmprendedores());
        tablaCompradores.setModel(ml.cargarCompradores());

        DescripcionCorta.setLineWrap(true);
        DescripcionLarga.setLineWrap(true);

        final JPopupMenu menu = new JPopupMenu("Menu");
        JMenuItem eliminar = new JMenuItem("Eliminar");
        menu.add(eliminar);

        labelImg1.setComponentPopupMenu(menu);
        labelImg2.setComponentPopupMenu(menu);
        labelImg3.setComponentPopupMenu(menu);
        labelImg4.setComponentPopupMenu(menu);
        labelImg5.setComponentPopupMenu(menu);
        labelImg6.setComponentPopupMenu(menu);

        eliminar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                Component target = menu.getInvoker();
                int r = tablaArticulos.getSelectedRow();
                int idarticulo = Integer.parseInt(tablaArticulos.getValueAt(r, 0).toString());
                //eliminarImagen(idarticulo);

                int idimagen = 0;
                
                if (target == labelImg1) {
                    idimagen = Integer.parseInt(labelImg1.getText());
                } else if (target == labelImg2) {
                    idimagen = Integer.parseInt(labelImg2.getText());
                } else if (target == labelImg3) {
                    idimagen = Integer.parseInt(labelImg3.getText());
                } else if (target == labelImg4) {
                    idimagen = Integer.parseInt(labelImg4.getText());
                } else if (target == labelImg5) {
                    idimagen = Integer.parseInt(labelImg5.getText());
                } else if (target == labelImg6) {
                    idimagen = Integer.parseInt(labelImg6.getText());
                }
                
                eliminarImagen(idarticulo, idimagen);

            }
        });

//        labelImg1.addMouseListener(new MouseAdapter() {
//            public void mouseClicked(MouseEvent e) {
//                //right mouse click event
//                if (SwingUtilities.isRightMouseButton(e) && e.getClickCount() == 1) {
//                    menu.show(labelImg1, e.getX(), e.getY());
//
//                    
//               
//                }
//            }
//        });
//
//        labelImg2.addMouseListener(new MouseAdapter() {
//            public void mouseClicked(MouseEvent e) {
//                //right mouse click event
//                if (SwingUtilities.isRightMouseButton(e) && e.getClickCount() == 1) {
//                    menu.show(labelImg2, e.getX(), e.getY());
//                }
//            }
//        });
//
//        labelImg3.addMouseListener(new MouseAdapter() {
//            public void mouseClicked(MouseEvent e) {
//                //right mouse click event
//                if (SwingUtilities.isRightMouseButton(e) && e.getClickCount() == 1) {
//                    menu.show(labelImg3, e.getX(), e.getY());
//                }
//            }
//        });
//
//        labelImg4.addMouseListener(new MouseAdapter() {
//            public void mouseClicked(MouseEvent e) {
//                //right mouse click event
//                if (SwingUtilities.isRightMouseButton(e) && e.getClickCount() == 1) {
//                    menu.show(labelImg4, e.getX(), e.getY());
//                }
//            }
//        });
//
//        labelImg5.addMouseListener(new MouseAdapter() {
//            public void mouseClicked(MouseEvent e) {
//                //right mouse click event
//                if (SwingUtilities.isRightMouseButton(e) && e.getClickCount() == 1) {
//                    menu.show(labelImg5, e.getX(), e.getY());
//
//                }
//            }
//        });
//
//        labelImg6.addMouseListener(new MouseAdapter() {
//            public void mouseClicked(MouseEvent e) {
//                //right mouse click event
//                if (SwingUtilities.isRightMouseButton(e) && e.getClickCount() == 1) {
//                    menu.show(labelImg6, e.getX(), e.getY());
//                }
//            }
//        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nombreArticulo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        DescripcionCorta = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        comboEmprendimientos = new javax.swing.JComboBox<>();
        ingresarArticulos = new javax.swing.JButton();
        ModificarArticulos = new javax.swing.JButton();
        eliminarArticulos = new javax.swing.JButton();
        precioArticulo = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        DescripcionLarga = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        stockArticulo = new javax.swing.JTextField();
        Limpiar = new javax.swing.JButton();
        buscarImg = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        nombrecat = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaArticulos = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelImg2 = new javax.swing.JLabel();
        labelImg3 = new javax.swing.JLabel();
        labelImg1 = new javax.swing.JLabel();
        labelImg5 = new javax.swing.JLabel();
        labelImg6 = new javax.swing.JLabel();
        labelImg4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tablaPedidos = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        comboEmprendimientos2 = new javax.swing.JComboBox<>();
        jPanel11 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaCompradores = new javax.swing.JTable();
        jLabel21 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaEmprendedores = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        modificarEmprendedores = new javax.swing.JButton();
        modificarCompradores = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        nombreUser = new javax.swing.JTextField();
        apeliidoUser = new javax.swing.JTextField();
        telefonoUser = new javax.swing.JTextField();
        gradoUser = new javax.swing.JTextField();
        mailUser = new javax.swing.JTextField();
        bachUser = new javax.swing.JTextField();
        nacimientoUser = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        direccionUser = new javax.swing.JTextArea();
        emprendedor = new javax.swing.JLabel();
        comprador = new javax.swing.JLabel();
        limpiarUsuarios = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(51, 51, 51));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setForeground(new java.awt.Color(102, 102, 102));
        jPanel2.setToolTipText("");

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Precio:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Desripción Corta:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Desripción Larga:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Nombre:");

        nombreArticulo.setBackground(new java.awt.Color(51, 51, 51));
        nombreArticulo.setForeground(new java.awt.Color(255, 255, 255));
        nombreArticulo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nombreArticulo.setCaretColor(new java.awt.Color(255, 255, 255));
        nombreArticulo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreArticuloKeyTyped(evt);
            }
        });

        DescripcionCorta.setBackground(new java.awt.Color(51, 51, 51));
        DescripcionCorta.setColumns(20);
        DescripcionCorta.setForeground(new java.awt.Color(255, 255, 255));
        DescripcionCorta.setRows(5);
        DescripcionCorta.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DescripcionCorta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                DescripcionCortaMouseReleased(evt);
            }
        });
        DescripcionCorta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DescripcionCortaKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(DescripcionCorta);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Emprendimiento:");

        comboEmprendimientos.setBackground(new java.awt.Color(51, 51, 51));
        comboEmprendimientos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboEmprendimientos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        comboEmprendimientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEmprendimientosActionPerformed(evt);
            }
        });

        ingresarArticulos.setBackground(new java.awt.Color(0, 102, 102));
        ingresarArticulos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ingresarArticulos.setText("Ingresar");
        ingresarArticulos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ingresarArticulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarArticulosActionPerformed(evt);
            }
        });

        ModificarArticulos.setBackground(new java.awt.Color(0, 102, 102));
        ModificarArticulos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ModificarArticulos.setText("Modificar");
        ModificarArticulos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ModificarArticulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarArticulosActionPerformed(evt);
            }
        });

        eliminarArticulos.setBackground(new java.awt.Color(0, 102, 102));
        eliminarArticulos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        eliminarArticulos.setText("Eliminar");
        eliminarArticulos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        eliminarArticulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarArticulosActionPerformed(evt);
            }
        });

        precioArticulo.setBackground(new java.awt.Color(51, 51, 51));
        precioArticulo.setForeground(new java.awt.Color(255, 255, 255));
        precioArticulo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        precioArticulo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                precioArticuloKeyTyped(evt);
            }
        });

        DescripcionLarga.setBackground(new java.awt.Color(51, 51, 51));
        DescripcionLarga.setColumns(20);
        DescripcionLarga.setForeground(new java.awt.Color(255, 255, 255));
        DescripcionLarga.setRows(5);
        DescripcionLarga.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DescripcionLarga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DescripcionLargaKeyTyped(evt);
            }
        });
        jScrollPane3.setViewportView(DescripcionLarga);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Stock:");

        stockArticulo.setBackground(new java.awt.Color(51, 51, 51));
        stockArticulo.setForeground(new java.awt.Color(255, 255, 255));
        stockArticulo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        stockArticulo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                stockArticuloKeyTyped(evt);
            }
        });

        Limpiar.setBackground(new java.awt.Color(0, 102, 102));
        Limpiar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Limpiar.setText("Limpiar");
        Limpiar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });

        buscarImg.setBackground(new java.awt.Color(0, 102, 102));
        buscarImg.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buscarImg.setText("Buscar Imagen");
        buscarImg.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buscarImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarImgActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Categoria:");

        nombrecat.setBackground(new java.awt.Color(51, 51, 51));
        nombrecat.setForeground(new java.awt.Color(255, 255, 255));
        nombrecat.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nombrecat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombrecatKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addComponent(Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ingresarArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ModificarArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(eliminarArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(218, 218, 218)
                                .addComponent(buscarImg, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 116, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3))
                                .addGap(14, 14, 14)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1)
                                    .addComponent(nombreArticulo)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6))
                                .addGap(14, 14, 14)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboEmprendimientos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(precioArticulo)
                                    .addComponent(jScrollPane3)
                                    .addComponent(stockArticulo, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(61, 61, 61)
                                .addComponent(nombrecat)))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(nombreArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(27, 27, 27)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(precioArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(comboEmprendimientos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(stockArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(nombrecat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buscarImg, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ingresarArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ModificarArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eliminarArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tablaArticulos.setBackground(new java.awt.Color(51, 51, 51));
        tablaArticulos.setForeground(new java.awt.Color(255, 255, 255));
        tablaArticulos.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaArticulos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tablaArticulosMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tablaArticulos);

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setText("Seleccione un artículo para modificarlo, eliminarlo o agregarle una imagen");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(jLabel8))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 901, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel8)
                .addGap(44, 44, 44))
        );

        jPanel5.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Artículos");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(619, 619, 619)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        labelImg2.setBackground(java.awt.Color.gray);
        labelImg2.setForeground(java.awt.Color.gray);

        labelImg3.setBackground(java.awt.Color.gray);
        labelImg3.setForeground(java.awt.Color.gray);

        labelImg1.setBackground(java.awt.Color.gray);
        labelImg1.setForeground(java.awt.Color.gray);

        labelImg5.setBackground(java.awt.Color.white);
        labelImg5.setForeground(java.awt.Color.gray);

        labelImg6.setBackground(java.awt.Color.white);
        labelImg6.setForeground(java.awt.Color.gray);

        labelImg4.setBackground(java.awt.Color.white);
        labelImg4.setForeground(java.awt.Color.gray);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelImg1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107)
                        .addComponent(labelImg2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(labelImg3, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(labelImg4, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(labelImg5, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(labelImg6, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(161, 161, 161))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelImg2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                    .addComponent(labelImg3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                    .addComponent(labelImg1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                    .addComponent(labelImg6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                    .addComponent(labelImg4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                    .addComponent(labelImg5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Artículos", jPanel2);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jPanel6.setBackground(new java.awt.Color(0, 102, 102));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tablaPedidos.setBackground(new java.awt.Color(51, 51, 51));
        tablaPedidos.setForeground(new java.awt.Color(255, 255, 255));
        tablaPedidos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane7.setViewportView(tablaPedidos);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setText("Pedidos");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(299, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(381, 381, 381))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(194, 194, 194))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(255, 255, 255))
        );

        jPanel13.setBackground(new java.awt.Color(0, 102, 102));
        jPanel13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel38.setText("Seleccione un emprendimiento");

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel40.setText("Emprendimiento: ");

        comboEmprendimientos2.setBackground(new java.awt.Color(51, 51, 51));
        comboEmprendimientos2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboEmprendimientos2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        comboEmprendimientos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEmprendimientos2ActionPerformed(evt);
            }
        });
        comboEmprendimientos2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                comboEmprendimientos2KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel38)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboEmprendimientos2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(76, 76, 76))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel38)
                .addGap(78, 78, 78)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboEmprendimientos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        jPanel11.setBackground(new java.awt.Color(0, 102, 102));
        jPanel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel13.setText("Emprendimientos");

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel14.setText("Emprendimientos");

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel15.setText("Emprendimientos");

        jLabel17.setBackground(new java.awt.Color(0, 0, 0));
        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel17.setText("Emprendimientos");

        jLabel18.setBackground(new java.awt.Color(0, 0, 0));
        jLabel18.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(420, 420, 420)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel18)))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(436, 436, 436)
                        .addComponent(jLabel17)))
                .addContainerGap(853, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addGap(41, 41, 41)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(177, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 222, Short.MAX_VALUE))
                .addContainerGap(463, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Emprendimientos", jPanel1);

        jPanel8.setBackground(new java.awt.Color(51, 51, 51));

        jPanel9.setBackground(new java.awt.Color(0, 102, 102));
        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tablaCompradores.setBackground(new java.awt.Color(51, 51, 51));
        tablaCompradores.setForeground(new java.awt.Color(255, 255, 255));
        tablaCompradores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaCompradores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tablaCompradoresMouseReleased(evt);
            }
        });
        jScrollPane4.setViewportView(tablaCompradores);

        jLabel21.setBackground(java.awt.Color.black);
        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel21.setText("Compradores");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addGap(651, 651, 651))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addGap(11, 11, 11)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(0, 102, 102));
        jPanel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel22.setBackground(java.awt.Color.black);
        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel22.setText("Emprendedores");

        tablaEmprendedores.setBackground(new java.awt.Color(51, 51, 51));
        tablaEmprendedores.setForeground(new java.awt.Color(255, 255, 255));
        tablaEmprendedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaEmprendedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tablaEmprendedoresMouseReleased(evt);
            }
        });
        jScrollPane5.setViewportView(tablaEmprendedores);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel22)
                .addGap(636, 636, 636))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(0, 102, 102));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        modificarEmprendedores.setBackground(new java.awt.Color(0, 102, 102));
        modificarEmprendedores.setText("Modificar");
        modificarEmprendedores.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        modificarEmprendedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarEmprendedoresActionPerformed(evt);
            }
        });

        modificarCompradores.setBackground(new java.awt.Color(0, 102, 102));
        modificarCompradores.setText("Modificar");
        modificarCompradores.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        modificarCompradores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarCompradoresActionPerformed(evt);
            }
        });

        jLabel23.setBackground(java.awt.Color.black);
        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel23.setText("Seleccione en la tabla el susuario que desee modificar (no se modificara nombre de usuario ni contraseña)");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setText("Nombre:");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setText("Apellido:");

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setText("Dirección:");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setText("Teléfono:");

        jLabel28.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel28.setText("Mail:");

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel29.setText("Nacimiento:");

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel30.setText("Grado:");

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel31.setText("Bachillerato:");

        nombreUser.setBackground(new java.awt.Color(51, 51, 51));
        nombreUser.setForeground(new java.awt.Color(255, 255, 255));
        nombreUser.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        apeliidoUser.setBackground(new java.awt.Color(51, 51, 51));
        apeliidoUser.setForeground(new java.awt.Color(255, 255, 255));
        apeliidoUser.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        telefonoUser.setBackground(new java.awt.Color(51, 51, 51));
        telefonoUser.setForeground(new java.awt.Color(255, 255, 255));
        telefonoUser.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        gradoUser.setBackground(new java.awt.Color(51, 51, 51));
        gradoUser.setForeground(new java.awt.Color(255, 255, 255));
        gradoUser.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        mailUser.setBackground(new java.awt.Color(51, 51, 51));
        mailUser.setForeground(new java.awt.Color(255, 255, 255));
        mailUser.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        bachUser.setBackground(new java.awt.Color(51, 51, 51));
        bachUser.setForeground(new java.awt.Color(255, 255, 255));
        bachUser.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        nacimientoUser.setBackground(new java.awt.Color(51, 51, 51));
        nacimientoUser.setForeground(new java.awt.Color(255, 255, 255));
        nacimientoUser.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        direccionUser.setBackground(new java.awt.Color(51, 51, 51));
        direccionUser.setColumns(20);
        direccionUser.setForeground(new java.awt.Color(255, 255, 255));
        direccionUser.setRows(5);
        direccionUser.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane6.setViewportView(direccionUser);

        emprendedor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        emprendedor.setText("Emprendedor ");

        comprador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comprador.setText("Comprador");

        limpiarUsuarios.setBackground(new java.awt.Color(0, 102, 102));
        limpiarUsuarios.setText("Limpiar");
        limpiarUsuarios.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        limpiarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarUsuariosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jLabel23)
                .addContainerGap())
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(gradoUser, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombreUser, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(apeliidoUser, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(telefonoUser, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mailUser, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addGap(18, 18, 18)
                        .addComponent(bachUser, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nacimientoUser, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(limpiarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(modificarEmprendedores, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(85, 85, 85)
                                .addComponent(modificarCompradores, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addComponent(emprendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(comprador, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 125, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel23)
                .addGap(17, 17, 17)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel24)
                        .addComponent(jLabel25)
                        .addComponent(jLabel27)
                        .addComponent(jLabel28)
                        .addComponent(nombreUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(apeliidoUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(telefonoUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mailUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nacimientoUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel26)
                                    .addComponent(jLabel30)
                                    .addComponent(jLabel31)
                                    .addComponent(gradoUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bachUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(0, 9, Short.MAX_VALUE)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emprendedor)
                            .addComponent(comprador))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(limpiarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modificarEmprendedores, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modificarCompradores, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jPanel12.setBackground(new java.awt.Color(0, 102, 102));
        jPanel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel20.setBackground(new java.awt.Color(0, 0, 0));
        jLabel20.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel20.setText("Emprendimientos");

        jLabel32.setBackground(new java.awt.Color(0, 0, 0));
        jLabel32.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel32.setText("Emprendimientos");

        jLabel33.setBackground(new java.awt.Color(0, 0, 0));
        jLabel33.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel33.setText("Emprendimientos");

        jLabel34.setBackground(new java.awt.Color(0, 0, 0));
        jLabel34.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel34.setText("Emprendimientos");

        jLabel35.setBackground(new java.awt.Color(0, 0, 0));
        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel35.setText("Usuarios");

        jLabel36.setBackground(new java.awt.Color(0, 0, 0));
        jLabel36.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel36.setText("Emprendimientos");

        jLabel37.setBackground(new java.awt.Color(0, 0, 0));
        jLabel37.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel37.setText("Emprendimientos");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(420, 420, 420)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(jLabel32)
                    .addComponent(jLabel33)
                    .addComponent(jLabel34)
                    .addComponent(jLabel36)
                    .addComponent(jLabel37))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel35)
                .addGap(659, 659, 659))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(164, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Usuarios", jPanel8);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limpiarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarUsuariosActionPerformed
        nombreUser.setText("");
        apeliidoUser.setText("");
        telefonoUser.setText("");
        mailUser.setText("");
        nacimientoUser.setText("");
        direccionUser.setText("");
        gradoUser.setText("");
        bachUser.setText("");
        tablaCompradores.clearSelection();
        tablaEmprendedores.clearSelection();
    }//GEN-LAST:event_limpiarUsuariosActionPerformed

    private void modificarCompradoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarCompradoresActionPerformed

        modificarCompradores();
    }//GEN-LAST:event_modificarCompradoresActionPerformed

    private void modificarEmprendedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarEmprendedoresActionPerformed
        modificarEmprendedores();
    }//GEN-LAST:event_modificarEmprendedoresActionPerformed

    private void tablaEmprendedoresMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaEmprendedoresMouseReleased
        modificarCompradores.setVisible(false);
        comprador.setVisible(false);
        modificarEmprendedores.setVisible(true);
        emprendedor.setVisible(true);
        extraertablaEmprendedores();
    }//GEN-LAST:event_tablaEmprendedoresMouseReleased

    private void tablaCompradoresMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaCompradoresMouseReleased
        modificarEmprendedores.setVisible(false);
        emprendedor.setVisible(false);
        modificarCompradores.setVisible(true);
        comprador.setVisible(true);
        extraertablaCompradores();
    }//GEN-LAST:event_tablaCompradoresMouseReleased

    private void comboEmprendimientos2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboEmprendimientos2KeyReleased

    }//GEN-LAST:event_comboEmprendimientos2KeyReleased

    private void comboEmprendimientos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEmprendimientos2ActionPerformed
        String idEmprendimientoStr[] = comboEmprendimientos2.getSelectedItem().toString().split("-");
        int idEmprendimiento = Integer.parseInt(idEmprendimientoStr[0]);
        tablaPedidos.setModel(ml.cargarPedidos(idEmprendimiento));
    }//GEN-LAST:event_comboEmprendimientos2ActionPerformed

    private void tablaArticulosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaArticulosMouseReleased

        int r = tablaArticulos.getSelectedRow();
        int idarticulo = Integer.parseInt(tablaArticulos.getValueAt(r, 0).toString());
        nombreArticulo.setText(tablaArticulos.getValueAt(r, 1).toString());
        DescripcionCorta.setText(tablaArticulos.getValueAt(r, 5).toString());
        DescripcionLarga.setText(tablaArticulos.getValueAt(r, 4).toString());
        precioArticulo.setText(tablaArticulos.getValueAt(r, 2).toString());
        stockArticulo.setText(tablaArticulos.getValueAt(r, 3).toString());
        nombrecat.setText(tablaArticulos.getValueAt(r, 7).toString());

        try {
            cargarImagenes(idarticulo);
        } catch (IOException ex) {
            Logger.getLogger(visual.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JSchException ex) {
            Logger.getLogger(visual.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SftpException ex) {
            Logger.getLogger(visual.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tablaArticulosMouseReleased

    private void nombrecatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombrecatKeyTyped
        nombrecat.setBackground(new java.awt.Color(51, 51, 51));
    }//GEN-LAST:event_nombrecatKeyTyped

    private void buscarImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarImgActionPerformed
        String relativo = "";

        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.dir") + "/fotos"));

        //filter the files
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg", "gif", "png");
        file.addChoosableFileFilter(filter);
        int result = file.showSaveDialog(null);

        //Si el usuario elije guardar
        if (result == JFileChooser.APPROVE_OPTION) {

            File selectedFile = file.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            relativo = path;

            //            for (int i = 0; i < 7; i++) {
                //
                //                JLabel[] labelImg = {
                    //                   labelImg1,
                    //                   labelImg2,
                    //                   labelImg3,
                    //                   labelImg4,
                    //                   labelImg5,
                    //                   labelImg6
                    //
                    //            };
                //
                //                labelImg[i].setIcon(ResizeImage(path));
                //            }
            int result2 = JOptionPane.showConfirmDialog(rootPane, "Seguro que queres ingresar esta imagen?", "visual",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
            if (result2 == JOptionPane.YES_OPTION) {

                //Path de donde esta trabajando el usuario
                Path base = Paths.get(System.getProperty("user.dir"));

                //Path absoluto de la imagen
                Path absoluto = Paths.get(relativo);

                //Los convierte en un path relativo
                Path pathRelative = base.relativize(absoluto);
                String url = pathRelative.toString();

                if (url.isEmpty()) {
                    JOptionPane.showMessageDialog(rootPane, "Debe seleccionar una imagen");
                } else {

                    boolean error2 = true;

                    try {
                        int r = tablaArticulos.getSelectedRow();
                        int idarticulo = Integer.parseInt(tablaArticulos.getValueAt(r, 0).toString());
                        datos.imagenes datosImagenes = new datos.imagenes();
                        ArrayList<datos.imagenes> imagenes = datosImagenes.getImagenes(idarticulo);

                        System.out.println(imagenes.size());
                        if (imagenes.size() == 6) {
                            JOptionPane.showMessageDialog(rootPane, "Has llegado al limite de imagenes para este articulo, si queres ingresar otra elimina alguna");
                            error2 = false;
                        } else if (imagenes.size() > 6) {
                            JOptionPane.showMessageDialog(rootPane, "Error, has superado el maximo de imagenes para un articulo");
                        } else {
                            error2 = datosImagenes.ingresarImagen(url, idarticulo);
                        }

                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(rootPane, "Debe seleccionar un articulo de la tabla");
                    }

                    if (!error2) {

                        int r = tablaArticulos.getSelectedRow();
                        int idarticulo = Integer.parseInt(tablaArticulos.getValueAt(r, 0).toString());
                        try {
                            cargarImagenes(idarticulo);
                            //                    int r = tablaArticulos.getSelectedRow();
                            //                    int idarticulo = Integer.parseInt(tablaArticulos.getValueAt(r, 0).toString());
                            //                    tablaImagenes.setModel(ml.cargarImagenes(idarticulo));
                        } catch (IOException ex) {
                            Logger.getLogger(visual.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (JSchException ex) {
                            Logger.getLogger(visual.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (SftpException ex) {
                            Logger.getLogger(visual.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Hubo un error al cargar la imagen.");
                    }

                }

            } else if (result2 == JOptionPane.NO_OPTION) {

                JOptionPane.showMessageDialog(rootPane, "No se ha cargado la imagen.");

            }

        }
    }//GEN-LAST:event_buscarImgActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        nombreArticulo.setText("");
        DescripcionCorta.setText("");
        DescripcionLarga.setText("");
        precioArticulo.setText("");
        stockArticulo.setText("");
        tablaArticulos.clearSelection();
        nombrecat.setText("");
    }//GEN-LAST:event_LimpiarActionPerformed

    private void stockArticuloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stockArticuloKeyTyped
        stockArticulo.setForeground(Color.WHITE);
    }//GEN-LAST:event_stockArticuloKeyTyped

    private void DescripcionLargaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DescripcionLargaKeyTyped
        DescripcionLarga.setBackground(new java.awt.Color(51, 51, 51));
    }//GEN-LAST:event_DescripcionLargaKeyTyped

    private void precioArticuloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precioArticuloKeyTyped
        precioArticulo.setForeground(Color.WHITE);
    }//GEN-LAST:event_precioArticuloKeyTyped

    private void eliminarArticulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarArticulosActionPerformed

        boolean parseado = false;

        try {
            int r = tablaArticulos.getSelectedRow();
            int idarticulo = Integer.parseInt(tablaArticulos.getValueAt(r, 0).toString());
            parseado = true;

            datos.articulos datosArticulos = new datos.articulos();
            boolean error = datosArticulos.borrarArticulo(idarticulo);

            if (!error) {
                tablaArticulos.setModel(ml.cargarArticulos());
                nombreArticulo.setText("");
                DescripcionCorta.setText("");
                DescripcionLarga.setText("");
                precioArticulo.setText("");
                stockArticulo.setText("");
                nombrecat.setText("");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Hubo un error al eliminar el articulo");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar un articulo de la tabla");
        }

    }//GEN-LAST:event_eliminarArticulosActionPerformed

    private void ModificarArticulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarArticulosActionPerformed
        modificararticulos();
    }//GEN-LAST:event_ModificarArticulosActionPerformed

    private void ingresarArticulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarArticulosActionPerformed

        String nombrearticulo = this.nombreArticulo.getText();
        String descCorta = DescripcionCorta.getText();
        String descLarga = DescripcionLarga.getText();
        boolean parseado = true;

        try {
            Integer.parseInt(comboEmprendimientos.getSelectedItem().toString().split("-")[0]);
        } catch (Exception ex) {
            parseado = false;
            JOptionPane.showMessageDialog(rootPane, "Error, debe seleccionar el emprendimiento al que pertenece el articulo");
            comboEmprendimientos.setBackground(Color.red);
        }

        try {
            Integer.parseInt(precioArticulo.getText());

            if (Integer.parseInt(precioArticulo.getText()) < 0) {
                Integer.parseInt("asd");
            }

        } catch (Exception ex) {
            parseado = false;
            JOptionPane.showMessageDialog(rootPane, "Error, el precio debe ser un valor numerico positivo");
            precioArticulo.setForeground(Color.red);
        }

        try {
            Integer.parseInt(stockArticulo.getText());

            if (Integer.parseInt(stockArticulo.getText()) < 0) {
                Integer.parseInt("asd");
            }

        } catch (Exception ex) {
            parseado = false;
            JOptionPane.showMessageDialog(rootPane, "Error, el stock debe ser un valor numerico positivo");
            stockArticulo.setForeground(Color.red);

        }

        if (parseado) {

            int precio = Integer.parseInt(precioArticulo.getText());
            String idEmprendimientoStr[] = comboEmprendimientos.getSelectedItem().toString().split("-");
            int idEmprendimiento = Integer.parseInt(idEmprendimientoStr[0]);
            int stock = Integer.parseInt(stockArticulo.getText());

            String nombreCategoria = nombrecat.getText();

            boolean verificado = ml.verificarIngresoArticulo(nombrearticulo, descCorta, descLarga, precio, idEmprendimiento, stock, nombreCategoria);
            verificado = true;

            if (nombrearticulo.isEmpty()) {
                nombreArticulo.setBackground(Color.red);
                verificado = false;
                JOptionPane.showMessageDialog(rootPane, "Error, el nombre no puede estar vacio");
            }

            if (descCorta.isEmpty()) {
                DescripcionCorta.setBackground(Color.red);
                verificado = false;
                JOptionPane.showMessageDialog(rootPane, "Error, la descripcion corta no puede estar vacia");
            }

            if (descLarga.isEmpty()) {
                DescripcionLarga.setBackground(Color.red);
                verificado = false;
                JOptionPane.showMessageDialog(rootPane, "Error, la descripcion larga no puede estar vacia");
            }

            if (nombreCategoria.isEmpty()) {
                nombrecat.setBackground(Color.red);
                verificado = false;
                JOptionPane.showMessageDialog(rootPane, "Error, la categoria no puede estar vacia");
            }

            if (verificado) {

                datos.articulos datosArticulos = new datos.articulos();

                boolean error = datosArticulos.ingresarArticulos(nombrearticulo, descCorta, descLarga, precio, idEmprendimiento, stock, nombreCategoria);

                if (!error) {
                    tablaArticulos.setModel(ml.cargarArticulos());
                    limpiararticulos();
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Hubo un error al cargar el articulo.");
                }

            }

        }

    }//GEN-LAST:event_ingresarArticulosActionPerformed

    private void comboEmprendimientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEmprendimientosActionPerformed
        comboEmprendimientos.setBackground(new java.awt.Color(51, 51, 51));
    }//GEN-LAST:event_comboEmprendimientosActionPerformed

    private void DescripcionCortaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DescripcionCortaKeyTyped
        DescripcionCorta.setBackground(new java.awt.Color(51, 51, 51));
    }//GEN-LAST:event_DescripcionCortaKeyTyped

    private void DescripcionCortaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DescripcionCortaMouseReleased

    }//GEN-LAST:event_DescripcionCortaMouseReleased

    private void nombreArticuloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreArticuloKeyTyped
        nombreArticulo.setBackground(new java.awt.Color(51, 51, 51));
    }//GEN-LAST:event_nombreArticuloKeyTyped

    //funciones de articulos
    private void limpiararticulos() {
        nombreArticulo.setText("");
        DescripcionLarga.setText("");
        DescripcionCorta.setText("");
        precioArticulo.setText("");
        stockArticulo.setText("");
        labelImg1.setText("");
    }

    private void modificararticulos() {

        String nombrearticulo = this.nombreArticulo.getText();
        String descCorta = DescripcionCorta.getText();
        String descLarga = DescripcionLarga.getText();
        boolean parseado = true;

        try {
            Integer.parseInt(comboEmprendimientos.getSelectedItem().toString().split("-")[0]);
        } catch (Exception ex) {
            parseado = false;
            JOptionPane.showMessageDialog(rootPane, "Error, debe seleccionar el emprendimiento al que pertenece el articulo");
            comboEmprendimientos.setBackground(Color.red);
        }

        try {
            Integer.parseInt(precioArticulo.getText());

            if (Integer.parseInt(precioArticulo.getText()) < 0) {
                Integer.parseInt("asd");
            }

        } catch (Exception ex) {
            parseado = false;
            JOptionPane.showMessageDialog(rootPane, "Error, el precio debe ser un valor numerico positivo");
            precioArticulo.setForeground(Color.red);
        }

        try {
            Integer.parseInt(stockArticulo.getText());

            if (Integer.parseInt(stockArticulo.getText()) < 0) {
                Integer.parseInt("asd");
            }

        } catch (Exception ex) {
            parseado = false;
            JOptionPane.showMessageDialog(rootPane, "Error, el stock debe ser un valor numerico positivo");
            stockArticulo.setForeground(Color.red);

        }

        if (parseado) {

            String precio = precioArticulo.getText();
            String idEmprendimientoStr[] = comboEmprendimientos.getSelectedItem().toString().split("-");
            int idEmprendimiento = Integer.parseInt(idEmprendimientoStr[0]);
            String stock = stockArticulo.getText();

            boolean verificado = true;

            if (nombrearticulo.isEmpty()) {
                nombreArticulo.setBackground(Color.red);
                verificado = false;
                JOptionPane.showMessageDialog(rootPane, "Error, el nombre no puede estar vacio");
            }

            if (descCorta.isEmpty()) {
                DescripcionCorta.setBackground(Color.red);
                verificado = false;
                JOptionPane.showMessageDialog(rootPane, "Error, la descripcion corta no puede estar vacia");
            }

            if (descLarga.isEmpty()) {
                DescripcionLarga.setBackground(Color.red);
                verificado = false;
                JOptionPane.showMessageDialog(rootPane, "Error, la descripcion larga no puede estar vacia");
            }

            if (verificado) {

                int r = tablaArticulos.getSelectedRow();
                String codigo = tablaArticulos.getValueAt(r, 0).toString();
                String nombre = nombreArticulo.getText();
                String descC = DescripcionCorta.getText();
                String descL = DescripcionLarga.getText();
                String categoria = nombrecat.getText();

                boolean error = ml.modificararticulos(codigo, precio, stock, descL, descC, idEmprendimiento, nombre, categoria);
                if (error == true) {
                    JOptionPane.showMessageDialog(null, "Los datos se han modificado correctamente");
                    tablaArticulos.setModel(ml.cargarArticulos());
                    nombreArticulo.setText("");
                    DescripcionCorta.setText("");
                    DescripcionLarga.setText("");
                    precioArticulo.setText("");
                    stockArticulo.setText("");
                    nombrecat.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "Ha ocurido un error");
                }

            }

        }

    }

    //funciones de emprendedores-compradores
    private void extraertablaEmprendedores() {
        int r = tablaEmprendedores.getSelectedRow();
        nombreUser.setText(tablaEmprendedores.getValueAt(r, 8).toString());
        apeliidoUser.setText(tablaEmprendedores.getValueAt(r, 1).toString());
        telefonoUser.setText(tablaEmprendedores.getValueAt(r, 6).toString());
        mailUser.setText(tablaEmprendedores.getValueAt(r, 10).toString());
        direccionUser.setText(tablaEmprendedores.getValueAt(r, 7).toString());
        gradoUser.setText(tablaEmprendedores.getValueAt(r, 9).toString());
        bachUser.setText(tablaEmprendedores.getValueAt(r, 3).toString());

    }

    private void modificarEmprendedores() {
        int r = tablaEmprendedores.getSelectedRow();
        String codigo = tablaEmprendedores.getValueAt(r, 0).toString();
        String nombre = nombreUser.getText();
        String apellido = apeliidoUser.getText();
        String telefono = telefonoUser.getText();
        String direccion = direccionUser.getText();
        String mail = mailUser.getText();
        String bachillerato = bachUser.getText();
        String grado = gradoUser.getText();

        boolean error = ml.modificaremprendedores(codigo, nombre, apellido, direccion, mail, bachillerato, grado, telefono);
        if (error == true) {
            JOptionPane.showMessageDialog(null, "los datos se han modificado correctamente");
        } else {
            JOptionPane.showMessageDialog(null, "ha ocurido un error");
        }
        tablaEmprendedores.setModel(ml.cargarEmprendedores());
        limpiaremprendedores();
    }

    private void limpiaremprendedores() {

        nombreUser.setText("");
        apeliidoUser.setText("");
        telefonoUser.setText("");
        mailUser.setText("");
        direccionUser.setText("");
        gradoUser.setText("");
        bachUser.setText("");
    }

    private void extraertablaCompradores() {
        int r = tablaCompradores.getSelectedRow();
        nombreUser.setText(tablaCompradores.getValueAt(r, 1).toString());
        apeliidoUser.setText(tablaCompradores.getValueAt(r, 2).toString());
        telefonoUser.setText(tablaCompradores.getValueAt(r, 5).toString());
        mailUser.setText(tablaCompradores.getValueAt(r, 3).toString());
        nacimientoUser.setText(tablaCompradores.getValueAt(r, 6).toString());

    }

    private void modificarCompradores() {
        int r = tablaCompradores.getSelectedRow();
        String codigo = tablaCompradores.getValueAt(r, 0).toString();
        String nombre = nombreUser.getText();
        String apellido = apeliidoUser.getText();
        String telefono = telefonoUser.getText();
        String nacimiento = nacimientoUser.getText();
        String mail = mailUser.getText();

        boolean error = ml.modificarcompradores(codigo, nombre, apellido, nacimiento, mail, telefono);
        if (error == true) {
            JOptionPane.showMessageDialog(null, "los datos se han modificado correctamente");
        } else {
            JOptionPane.showMessageDialog(null, "ha ocurido un error");
        }
        tablaCompradores.setModel(ml.cargarCompradores());
        limpiarcompradores();
    }

    private void limpiarcompradores() {

        nombreUser.setText("");
        apeliidoUser.setText("");
        telefonoUser.setText("");
        mailUser.setText("");
        nacimientoUser.setText("");

    }

    private void eliminarImagen(int idarticulo, int idimagen) {

        boolean parseado = false;

        try {
            parseado = true;
            datos.imagenes datosImagenes = new datos.imagenes();
            boolean error = datosImagenes.borrarImagen(idimagen);

            if (!error) {

                cargarImagenes(idarticulo);

            } else {
                JOptionPane.showMessageDialog(rootPane, "Hubo un error al eliminar la imagen");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar una imagen de la tabla");
        }

    }

    private void cargarImagenes(int idarticulo) throws IOException, JSchException, SftpException {

        datos.imagenes datosImagenes = new datos.imagenes();
        ArrayList<datos.imagenes> imagenes = datosImagenes.getImagenes(idarticulo);

        labelImg1.setText("");
        labelImg2.setText("");
        labelImg3.setText("");
        labelImg4.setText("");
        labelImg5.setText("");
        labelImg6.setText("");
        labelImg1.setIcon(null);
        labelImg2.setIcon(null);
        labelImg3.setIcon(null);
        labelImg4.setIcon(null);
        labelImg5.setIcon(null);
        labelImg6.setIcon(null);

        if (imagenes.size() > 6) {
            JOptionPane.showMessageDialog(rootPane, "Error, el maximo de imagenes por articulo es 6, elimine alguna");
        } else {

            for (int i = 0; i < imagenes.size(); i++) {

                JLabel[] labelImg = {
                    labelImg1,
                    labelImg2,
                    labelImg3,
                    labelImg4,
                    labelImg5,
                    labelImg6

                };

    
                
                datos.imagenes miImagen = imagenes.get(i);
                labelImg[i].setText(String.valueOf(miImagen.getIdImagen()));
                
                
                InputStream image = datosImagenes.getImagenesFileZilla(miImagen.getUrl());
                Image image2 = ImageIO.read(image);

                ImageIcon MyImage = new ImageIcon(image2);
                Image img = MyImage.getImage();
                Image newImg = img.getScaledInstance(labelImg1.getWidth(), labelImg1.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon image3 = new ImageIcon(newImg);
                
                labelImg[i].setIcon(image3);

                
                
            }

        }

    }

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
            java.util.logging.Logger.getLogger(visual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(visual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(visual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(visual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new visual().setVisible(true);

            }

        });

    }

    public ImageIcon ResizeImage(String ImagePath) {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(labelImg1.getWidth(), labelImg1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea DescripcionCorta;
    private javax.swing.JTextArea DescripcionLarga;
    private javax.swing.JButton Limpiar;
    private javax.swing.JButton ModificarArticulos;
    private javax.swing.JTextField apeliidoUser;
    private javax.swing.JTextField bachUser;
    private javax.swing.JButton buscarImg;
    private javax.swing.JComboBox<String> comboEmprendimientos;
    private javax.swing.JComboBox<String> comboEmprendimientos2;
    private javax.swing.JLabel comprador;
    private javax.swing.JTextArea direccionUser;
    private javax.swing.JButton eliminarArticulos;
    private javax.swing.JLabel emprendedor;
    private javax.swing.JTextField gradoUser;
    private javax.swing.JButton ingresarArticulos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel labelImg1;
    private javax.swing.JLabel labelImg2;
    private javax.swing.JLabel labelImg3;
    private javax.swing.JLabel labelImg4;
    private javax.swing.JLabel labelImg5;
    private javax.swing.JLabel labelImg6;
    private javax.swing.JButton limpiarUsuarios;
    private javax.swing.JTextField mailUser;
    private javax.swing.JButton modificarCompradores;
    private javax.swing.JButton modificarEmprendedores;
    private javax.swing.JTextField nacimientoUser;
    private javax.swing.JTextField nombreArticulo;
    private javax.swing.JTextField nombreUser;
    private javax.swing.JTextField nombrecat;
    private javax.swing.JTextField precioArticulo;
    private javax.swing.JTextField stockArticulo;
    private javax.swing.JTable tablaArticulos;
    private javax.swing.JTable tablaCompradores;
    private javax.swing.JTable tablaEmprendedores;
    private javax.swing.JTable tablaPedidos;
    private javax.swing.JTextField telefonoUser;
    // End of variables declaration//GEN-END:variables

        
        
       
}
   

