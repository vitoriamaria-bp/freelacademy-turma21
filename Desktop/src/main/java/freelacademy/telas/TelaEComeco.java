package freelacademy.telas;

/**
 * Descrição da classe
 * Classe inicial apos login
 * 
 * @author Marcos Tavares
 */

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.JOptionPane;

public class TelaEComeco extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaEComeco.class.getName());

    
    public TelaEComeco() {
        initComponents();
     
    }

    public void close(){
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnConfiguracoes = new javax.swing.JButton();
        btnPerfil = new javax.swing.JButton();
        btnProposta0 = new javax.swing.JButton();
        btnProposta1 = new javax.swing.JButton();
        btnProposta2 = new javax.swing.JButton();
        btnProposta3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela E Dashboard");
        setMinimumSize(new java.awt.Dimension(1100, 700));
        setResizable(false);
        getContentPane().setLayout(null);

        btnConfiguracoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Config btn.png"))); // NOI18N
        btnConfiguracoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfiguracoesActionPerformed(evt);
            }
        });
        getContentPane().add(btnConfiguracoes);
        btnConfiguracoes.setBounds(930, 10, 40, 40);

        btnPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/perfil btn.png"))); // NOI18N
        btnPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerfilActionPerformed(evt);
            }
        });
        getContentPane().add(btnPerfil);
        btnPerfil.setBounds(1000, 10, 40, 40);

        btnProposta0.setText("PROPOSTA");
        btnProposta0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProposta0ActionPerformed(evt);
            }
        });
        getContentPane().add(btnProposta0);
        btnProposta0.setBounds(120, 440, 130, 27);

        btnProposta1.setText("PROPOSTA");
        btnProposta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProposta1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnProposta1);
        btnProposta1.setBounds(370, 440, 130, 27);

        btnProposta2.setText("PROPOSTA");
        btnProposta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProposta2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnProposta2);
        btnProposta2.setBounds(620, 440, 130, 27);

        btnProposta3.setText("PROPOSTA");
        btnProposta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProposta3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnProposta3);
        btnProposta3.setBounds(860, 440, 130, 27);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TelaEComeco.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 1100, 700);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfiguracoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfiguracoesActionPerformed
        //Botão que leva o usuario as configuracoes
        TelaEConfiguracoes tela = new TelaEConfiguracoes();
        tela.setVisible(true);
        
        //fecha janela anterior
        this.dispose();
    }//GEN-LAST:event_btnConfiguracoesActionPerformed

    private void btnPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerfilActionPerformed
        //Botão que leva o usuario ao perfil
        TelaEHome tela = new TelaEHome();
        tela.setVisible(true);
        //função pra fechar janela anterior
            close();
    }//GEN-LAST:event_btnPerfilActionPerformed

    private void btnProposta0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProposta0ActionPerformed
        try{
            Desktop.getDesktop().browse(new URI("http://127.0.0.1:8000/"));
        }
        catch(Exception e)
        {}
    }//GEN-LAST:event_btnProposta0ActionPerformed

    private void btnProposta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProposta2ActionPerformed
        try{
            Desktop.getDesktop().browse(new URI("http://127.0.0.1:8000/"));
        }
        catch(Exception e)
        {}
    }//GEN-LAST:event_btnProposta2ActionPerformed

    private void btnProposta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProposta1ActionPerformed
        try{
            Desktop.getDesktop().browse(new URI("http://127.0.0.1:8000/"));
        }
        catch(Exception e)
        {}
    }//GEN-LAST:event_btnProposta1ActionPerformed

    private void btnProposta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProposta3ActionPerformed
        try{
            Desktop.getDesktop().browse(new URI("http://127.0.0.1:8000/"));
        }
        catch(Exception e)
        {}
    }//GEN-LAST:event_btnProposta3ActionPerformed

    
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new TelaEComeco().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfiguracoes;
    private javax.swing.JButton btnPerfil;
    private javax.swing.JButton btnProposta0;
    private javax.swing.JButton btnProposta1;
    private javax.swing.JButton btnProposta2;
    private javax.swing.JButton btnProposta3;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
