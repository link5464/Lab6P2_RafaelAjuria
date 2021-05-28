/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6p2_rafaelajuria;


import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author rajur
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog_AgregarIntegrante = new javax.swing.JDialog();
        jLabel_Nombre = new javax.swing.JLabel();
        jTextField_Nombre = new javax.swing.JTextField();
        jTextField_Apellido = new javax.swing.JTextField();
        jLabel_Apellido = new javax.swing.JLabel();
        jTextField_Nacionalidad = new javax.swing.JTextField();
        jLabel_Nacionalidad = new javax.swing.JLabel();
        jSpinner_Edad = new javax.swing.JSpinner();
        jLabel_Edad = new javax.swing.JLabel();
        jTextField_NumJugador = new javax.swing.JTextField();
        jLabel_NumJugador = new javax.swing.JLabel();
        jSpinner_DurCont = new javax.swing.JSpinner();
        jLabel_DurCont = new javax.swing.JLabel();
        jTextField_Especialidad = new javax.swing.JTextField();
        jLabel_Especialidad = new javax.swing.JLabel();
        jTextField_Titulo = new javax.swing.JTextField();
        jLabel_Titulo = new javax.swing.JLabel();
        jLabel_TipoIntegrante = new javax.swing.JLabel();
        jRadioButton_Jugador = new javax.swing.JRadioButton();
        jRadioButton_Psicologo = new javax.swing.JRadioButton();
        jRadioButton_Preparador = new javax.swing.JRadioButton();
        jRadioButton_Entrenador = new javax.swing.JRadioButton();
        jButton_AgregarIntegrante = new javax.swing.JButton();
        buttonGroup_Integrante = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree_Integrantes = new javax.swing.JTree();
        jButton_Menu = new javax.swing.JButton();
        jButton_Salir = new javax.swing.JButton();

        jLabel_Nombre.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_Nombre.setText("Nombre:");

        jLabel_Apellido.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_Apellido.setText("Apellido");

        jLabel_Nacionalidad.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_Nacionalidad.setText("Nacionalidad:");

        jSpinner_Edad.setModel(new javax.swing.SpinnerNumberModel(18, 18, 40, 1));

        jLabel_Edad.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_Edad.setText("Edad:");

        jLabel_NumJugador.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_NumJugador.setText("Num.Jugador/ID:");

        jSpinner_DurCont.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));

        jLabel_DurCont.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_DurCont.setText("Dur. de Cont.:");

        jLabel_Especialidad.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_Especialidad.setText("Especialidad:");

        jLabel_Titulo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_Titulo.setText("Titulo Universit:");

        jLabel_TipoIntegrante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_TipoIntegrante.setText("Tipo de Integrante");

        buttonGroup_Integrante.add(jRadioButton_Jugador);
        jRadioButton_Jugador.setText("Jugador");

        buttonGroup_Integrante.add(jRadioButton_Psicologo);
        jRadioButton_Psicologo.setText("Psicologo");

        buttonGroup_Integrante.add(jRadioButton_Preparador);
        jRadioButton_Preparador.setText("Preparador");

        buttonGroup_Integrante.add(jRadioButton_Entrenador);
        jRadioButton_Entrenador.setText("Entrenador");

        jButton_AgregarIntegrante.setText("Agregar");
        jButton_AgregarIntegrante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_AgregarIntegranteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jDialog_AgregarIntegranteLayout = new javax.swing.GroupLayout(jDialog_AgregarIntegrante.getContentPane());
        jDialog_AgregarIntegrante.getContentPane().setLayout(jDialog_AgregarIntegranteLayout);
        jDialog_AgregarIntegranteLayout.setHorizontalGroup(
            jDialog_AgregarIntegranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog_AgregarIntegranteLayout.createSequentialGroup()
                .addGroup(jDialog_AgregarIntegranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog_AgregarIntegranteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jDialog_AgregarIntegranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDialog_AgregarIntegranteLayout.createSequentialGroup()
                                .addComponent(jLabel_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDialog_AgregarIntegranteLayout.createSequentialGroup()
                                .addComponent(jLabel_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDialog_AgregarIntegranteLayout.createSequentialGroup()
                                .addGroup(jDialog_AgregarIntegranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_Nacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jDialog_AgregarIntegranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_Nacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jDialog_AgregarIntegranteLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel_DurCont, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner_DurCont, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDialog_AgregarIntegranteLayout.createSequentialGroup()
                                .addComponent(jLabel_NumJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_NumJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDialog_AgregarIntegranteLayout.createSequentialGroup()
                                .addComponent(jLabel_Especialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_Especialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDialog_AgregarIntegranteLayout.createSequentialGroup()
                                .addComponent(jLabel_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jDialog_AgregarIntegranteLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel_TipoIntegrante, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDialog_AgregarIntegranteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jRadioButton_Jugador, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton_Preparador, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDialog_AgregarIntegranteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jRadioButton_Psicologo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton_Entrenador, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDialog_AgregarIntegranteLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jButton_AgregarIntegrante, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDialog_AgregarIntegranteLayout.setVerticalGroup(
            jDialog_AgregarIntegranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog_AgregarIntegranteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDialog_AgregarIntegranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Nombre)
                    .addComponent(jTextField_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialog_AgregarIntegranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Apellido)
                    .addComponent(jTextField_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialog_AgregarIntegranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Nacionalidad)
                    .addComponent(jTextField_Nacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialog_AgregarIntegranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Edad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialog_AgregarIntegranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_NumJugador)
                    .addComponent(jTextField_NumJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialog_AgregarIntegranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner_DurCont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_DurCont))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialog_AgregarIntegranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Especialidad)
                    .addComponent(jTextField_Especialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialog_AgregarIntegranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Titulo)
                    .addComponent(jTextField_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_TipoIntegrante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialog_AgregarIntegranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton_Jugador)
                    .addComponent(jRadioButton_Preparador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialog_AgregarIntegranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton_Psicologo)
                    .addComponent(jRadioButton_Entrenador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_AgregarIntegrante))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Integrantes");
        jTree_Integrantes.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane1.setViewportView(jTree_Integrantes);

        jButton_Menu.setText("Menu");
        jButton_Menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_MenuMouseClicked(evt);
            }
        });

        jButton_Salir.setText("Salir");
        jButton_Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_SalirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jButton_Menu)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_Salir)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_SalirMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton_SalirMouseClicked

    private void jButton_AgregarIntegranteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_AgregarIntegranteMouseClicked
        // TODO add your handling code here:
        DefaultTreeModel Integrantes=(DefaultTreeModel) jTree_Integrantes.getModel();
        DefaultMutableTreeNode Root = (DefaultMutableTreeNode) Integrantes.getRoot();
        DefaultMutableTreeNode NodoIntegrante;
        DefaultMutableTreeNode NodoJugador = new DefaultMutableTreeNode("Jugadores");
        DefaultMutableTreeNode NodoPsicologos = new DefaultMutableTreeNode("Psicologos");
        DefaultMutableTreeNode NodoEntrenador = new DefaultMutableTreeNode("Entrenadores");
        DefaultMutableTreeNode NodoPreparadorFisico = new DefaultMutableTreeNode("Preparadores Fisicos");
        if(jRadioButton_Jugador.isSelected())
        {
           
           NodoIntegrante = new DefaultMutableTreeNode(new Jugador(
                   Integer.parseInt(jTextField_NumJugador.getText()),
                   (Integer) jSpinner_DurCont.getValue(),
                   jTextField_Nombre.getText(),
                   jTextField_Apellido.getText(),
                   jTextField_Nacionalidad.getText(),
                   (Integer) jSpinner_Edad.getValue()
                    ));
           NodoJugador.add(NodoIntegrante);
           Root.add(NodoJugador);
        }
        if(jRadioButton_Psicologo.isSelected())
        {
            
        }
        if(jRadioButton_Entrenador.isSelected())
        {
            
        }
        if(jRadioButton_Preparador.isSelected())
        {
            
        }
        Integrantes.reload();
    }//GEN-LAST:event_jButton_AgregarIntegranteMouseClicked

    private void jButton_MenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_MenuMouseClicked
        // TODO add your handling code here:
        jDialog_AgregarIntegrante.pack();
        jDialog_AgregarIntegrante.setLocationRelativeTo(this);
        jDialog_AgregarIntegrante.setVisible(true);
    }//GEN-LAST:event_jButton_MenuMouseClicked

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup_Integrante;
    private javax.swing.JButton jButton_AgregarIntegrante;
    private javax.swing.JButton jButton_Menu;
    private javax.swing.JButton jButton_Salir;
    private javax.swing.JDialog jDialog_AgregarIntegrante;
    private javax.swing.JLabel jLabel_Apellido;
    private javax.swing.JLabel jLabel_DurCont;
    private javax.swing.JLabel jLabel_Edad;
    private javax.swing.JLabel jLabel_Especialidad;
    private javax.swing.JLabel jLabel_Nacionalidad;
    private javax.swing.JLabel jLabel_Nombre;
    private javax.swing.JLabel jLabel_NumJugador;
    private javax.swing.JLabel jLabel_TipoIntegrante;
    private javax.swing.JLabel jLabel_Titulo;
    private javax.swing.JRadioButton jRadioButton_Entrenador;
    private javax.swing.JRadioButton jRadioButton_Jugador;
    private javax.swing.JRadioButton jRadioButton_Preparador;
    private javax.swing.JRadioButton jRadioButton_Psicologo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner_DurCont;
    private javax.swing.JSpinner jSpinner_Edad;
    private javax.swing.JTextField jTextField_Apellido;
    private javax.swing.JTextField jTextField_Especialidad;
    private javax.swing.JTextField jTextField_Nacionalidad;
    private javax.swing.JTextField jTextField_Nombre;
    private javax.swing.JTextField jTextField_NumJugador;
    private javax.swing.JTextField jTextField_Titulo;
    private javax.swing.JTree jTree_Integrantes;
    // End of variables declaration//GEN-END:variables
}
