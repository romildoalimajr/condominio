/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;

/**
 *
 * @author 55839
 */
public class TelaInicial extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     */
    public TelaInicial() {
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

        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuCadastro = new javax.swing.JMenu();
        menuCadUsuario = new javax.swing.JMenuItem();
        menuCadFuncionario = new javax.swing.JMenuItem();
        menuCadInquilino = new javax.swing.JMenuItem();
        menuConsulta = new javax.swing.JMenu();
        menuConsUsuario = new javax.swing.JMenuItem();
        menuConsFuncionario = new javax.swing.JMenuItem();
        menuConsInquilino = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenu();

        jMenuItem2.setText("jMenuItem2");

        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Condomínio Salles Cauás");

        menuCadastro.setText("Cadastro");

        menuCadUsuario.setText("Usuário");
        menuCadUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadUsuarioActionPerformed(evt);
            }
        });
        menuCadastro.add(menuCadUsuario);

        menuCadFuncionario.setText("Funcionário");
        menuCadastro.add(menuCadFuncionario);

        menuCadInquilino.setText("Inquilino");
        menuCadInquilino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadInquilinoActionPerformed(evt);
            }
        });
        menuCadastro.add(menuCadInquilino);

        jMenuBar1.add(menuCadastro);

        menuConsulta.setText("Consulta");

        menuConsUsuario.setText("Usuario");
        menuConsUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsUsuarioActionPerformed(evt);
            }
        });
        menuConsulta.add(menuConsUsuario);

        menuConsFuncionario.setText("Funcionário");
        menuConsulta.add(menuConsFuncionario);

        menuConsInquilino.setText("Inquilino");
        menuConsInquilino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsInquilinoActionPerformed(evt);
            }
        });
        menuConsulta.add(menuConsInquilino);

        jMenuBar1.add(menuConsulta);

        menuSair.setText("Sair");
        menuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairActionPerformed(evt);
            }
        });
        jMenuBar1.add(menuSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(816, 639));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_menuSairActionPerformed

    private void menuConsInquilinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsInquilinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuConsInquilinoActionPerformed

    private void menuConsUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuConsUsuarioActionPerformed

    private void menuCadInquilinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadInquilinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuCadInquilinoActionPerformed

    private void menuCadUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadUsuarioActionPerformed
        // TODO add your handling code here:
        TelaCadastroUsuario cadastro = new TelaCadastroUsuario();
        cadastro.setVisible(true);

    }//GEN-LAST:event_menuCadUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem menuCadFuncionario;
    private javax.swing.JMenuItem menuCadInquilino;
    private javax.swing.JMenuItem menuCadUsuario;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenuItem menuConsFuncionario;
    private javax.swing.JMenuItem menuConsInquilino;
    private javax.swing.JMenuItem menuConsUsuario;
    private javax.swing.JMenu menuConsulta;
    private javax.swing.JMenu menuSair;
    // End of variables declaration//GEN-END:variables
}