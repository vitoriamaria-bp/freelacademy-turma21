package freelacademy.telas;

/**
 * Descrição da classe
 * Classe onde da opção do usuario realizar o Backup, quando quiser
 * 
 * @author Marcos Tavares
 */

import conexaodb.Backup;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TelaBackup extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaBackup.class.getName());

    public TelaBackup() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBackup = new javax.swing.JButton();
        txtMensagem = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela de Backup");
        setMinimumSize(new java.awt.Dimension(450, 280));
        setResizable(false);
        getContentPane().setLayout(null);

        btnBackup.setText("FAZER  BACKUP");
        btnBackup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackupActionPerformed(evt);
            }
        });
        getContentPane().add(btnBackup);
        btnBackup.setBounds(260, 170, 130, 40);
        getContentPane().add(txtMensagem);
        txtMensagem.setBounds(77, 230, 280, 0);

        btnVoltar.setText("VOLTAR");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar);
        btnVoltar.setBounds(60, 170, 130, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TelaBackup.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 450, 280);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackupActionPerformed
        Backup back = new Backup();
        try{
            back.fazerBackup();
            txtMensagem.setText("Backup realizado com sucesso!");
        } catch(Exception ex) {
            txtMensagem.setText("Erro ao realizar o backup!");
            Logger.getLogger(TelaBackup.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnBackupActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        //volta o usuario a tela anterior
        TelaFConfiguracoes tela = new TelaFConfiguracoes();
        tela.setVisible(true);
        
        //Fecha a tela atual
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new TelaBackup().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackup;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel txtMensagem;
    // End of variables declaration//GEN-END:variables
}
