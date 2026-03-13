package freelacademy.telas;

import java.awt.Desktop;
import java.net.URI;

public class TelaAviso extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaAviso.class.getName());

    public TelaAviso() {
        initComponents();
    }

    public void close() { 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSite = new javax.swing.JButton();
        btnContinuarCadastro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela de Aviso");
        setMinimumSize(new java.awt.Dimension(1100, 700));
        setResizable(false);
        getContentPane().setLayout(null);

        btnSite.setText("SITE ");
        btnSite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiteActionPerformed(evt);
            }
        });
        getContentPane().add(btnSite);
        btnSite.setBounds(280, 480, 180, 50);

        btnContinuarCadastro.setText("CONTINUAR CADASTRO");
        btnContinuarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarCadastroActionPerformed(evt);
            }
        });
        getContentPane().add(btnContinuarCadastro);
        btnContinuarCadastro.setBounds(680, 480, 180, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TelaAviso.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -30, 1120, 700);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnContinuarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarCadastroActionPerformed
        //Botão para dar continuidade ao cadastro do usuario
        TelaEscolhe tela = new TelaEscolhe();
        tela.setVisible(true);
        
        // fecha a janela anterior
        this.dispose();
    }//GEN-LAST:event_btnContinuarCadastroActionPerformed

    private void btnSiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiteActionPerformed
        //botão que leva o usuario para o site
        try{
            Desktop.getDesktop().browse(new URI(""));
        }
        catch(Exception e)
        {}
    }//GEN-LAST:event_btnSiteActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new TelaAviso().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContinuarCadastro;
    private javax.swing.JButton btnSite;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
