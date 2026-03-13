package freelacademy.telas;

import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class TelaHome extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaHome.class.getName());

    public TelaHome() {
        initComponents();
    }
    
    public void close(){
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEntrar = new javax.swing.JButton();
        btnComoFunciona = new javax.swing.JButton();
        btnPoliticaPrivacidade = new javax.swing.JButton();
        btnTermosCond = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Inicial");
        setMinimumSize(new java.awt.Dimension(1100, 700));
        setResizable(false);
        getContentPane().setLayout(null);

        btnEntrar.setText("ENTRAR");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEntrar);
        btnEntrar.setBounds(890, 10, 180, 40);

        btnComoFunciona.setText("Como Funciona");
        btnComoFunciona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComoFuncionaActionPerformed(evt);
            }
        });
        getContentPane().add(btnComoFunciona);
        btnComoFunciona.setBounds(340, 10, 130, 30);

        btnPoliticaPrivacidade.setText("Politica de Privacidade");
        btnPoliticaPrivacidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPoliticaPrivacidadeActionPerformed(evt);
            }
        });
        getContentPane().add(btnPoliticaPrivacidade);
        btnPoliticaPrivacidade.setBounds(480, 10, 170, 30);

        btnTermosCond.setText("Termos e Condições de Uso");
        btnTermosCond.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTermosCondActionPerformed(evt);
            }
        });
        getContentPane().add(btnTermosCond);
        btnTermosCond.setBounds(660, 10, 190, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TelaHome.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1100, 680);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        //botao que loga o usuario 
        TelaLogin tela = new TelaLogin();
        tela.setVisible(true);
        
        //função pra fechar janela anterior
            this.dispose();
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void btnPoliticaPrivacidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPoliticaPrivacidadeActionPerformed
        //botao que leva o usuario as politicas de privacidade
        TelaPoliticaPrivacidade tela = new TelaPoliticaPrivacidade();
        tela.setVisible(true);
        
        //função para fechar janela anterior
            this.dispose();
    }//GEN-LAST:event_btnPoliticaPrivacidadeActionPerformed

    private void btnComoFuncionaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComoFuncionaActionPerformed
        //botao que leva o usuario ao como funciona
        TelaComoFunciona tela = new TelaComoFunciona();
        tela.setVisible(true);
        
        //função que fecha janela anterior
            this.dispose();
    }//GEN-LAST:event_btnComoFuncionaActionPerformed

    private void btnTermosCondActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTermosCondActionPerformed
        //botao que leva o usuario aos Termos de Uso
        TelaTermosCond tela = new TelaTermosCond();
        tela.setVisible(true);
        
        //Função que fecha janela anterior
            this.dispose();
    }//GEN-LAST:event_btnTermosCondActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new TelaHome().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComoFunciona;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnPoliticaPrivacidade;
    private javax.swing.JButton btnTermosCond;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
