package freelacademy.telas;

/**
 * Descrição da classe
 * Classe onde o usuario deve realizar o login 
 * 
 * @author Marcos Tavares
 */

import conexaodb.ConexaoDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class TelaLogin extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaLogin.class.getName());

    public TelaLogin() {
        initComponents();
  
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textEmailLogin = new javax.swing.JTextField();
        btnSalvarSenha = new javax.swing.JCheckBox();
        textSenhaLogin = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnEsqueceuSenha = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela de Login");
        setMinimumSize(new java.awt.Dimension(1100, 700));
        setResizable(false);
        getContentPane().setLayout(null);

        textEmailLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textEmailLoginActionPerformed(evt);
            }
        });
        getContentPane().add(textEmailLogin);
        textEmailLogin.setBounds(130, 250, 460, 40);

        btnSalvarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvarSenha);
        btnSalvarSenha.setBounds(410, 440, 20, 19);

        textSenhaLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textSenhaLoginActionPerformed(evt);
            }
        });
        getContentPane().add(textSenhaLogin);
        textSenhaLogin.setBounds(130, 360, 460, 40);

        btnLogin.setText("ENTRAR");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin);
        btnLogin.setBounds(270, 540, 150, 50);

        btnEsqueceuSenha.setText("ESQUECEU A SENHA ?");
        btnEsqueceuSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEsqueceuSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(btnEsqueceuSenha);
        btnEsqueceuSenha.setBounds(130, 440, 170, 23);

        btnCadastrar.setText("CADASTRAR - SE");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrar);
        btnCadastrar.setBounds(740, 370, 170, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TelaLogin.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setMaximumSize(new java.awt.Dimension(1100, 700));
        jLabel2.setMinimumSize(new java.awt.Dimension(1100, 700));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, -20, 1100, 700);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalvarSenhaActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
                                 

    String EMAIL = textEmailLogin.getText();
    String PASSWORD = textSenhaLogin.getText();

    try {

        Connection conn = ConexaoDB.getConexao();

        String sql = "SELECT * FROM tb_freelancer WHERE email=? AND senha=?";

        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, EMAIL);
        stmt.setString(2, PASSWORD);

        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {

            JOptionPane.showMessageDialog(null, "Login realizado!");

            new TelaFComeco().setVisible(true);
            this.dispose();

        } else {

            JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos!");

        }

    } catch (Exception e) {

        JOptionPane.showMessageDialog(null, "Erro: " + e);

    }


    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        //botao que leva o usuario ao cadastro
        TelaCadastro tela = new TelaCadastro();
        tela.setVisible(true);
        
        //função pra fechar janela anterior
            this.dispose();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnEsqueceuSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEsqueceuSenhaActionPerformed
        //botao que leva o usuario a recuperação de senha
        TelaEsqueceSenha tela = new TelaEsqueceSenha();
        tela.setVisible(true);
        
        //função pra fechar janela anterior
            this.dispose();
    }//GEN-LAST:event_btnEsqueceuSenhaActionPerformed

    private void textEmailLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textEmailLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textEmailLoginActionPerformed

    private void textSenhaLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textSenhaLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textSenhaLoginActionPerformed

    public static void main(String args[]){
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
        java.awt.EventQueue.invokeLater(() -> new TelaLogin().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnEsqueceuSenha;
    private javax.swing.JButton btnLogin;
    private javax.swing.JCheckBox btnSalvarSenha;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField textEmailLogin;
    private javax.swing.JPasswordField textSenhaLogin;
    // End of variables declaration//GEN-END:variables
}
