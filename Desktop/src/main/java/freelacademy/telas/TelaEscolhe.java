package freelacademy.telas;

/**
 * Descrição da classe
 * Classe onde o usuario deve escolher sua funlção aplicação
 * 
 * @author Marcos Tavares
 */

public class TelaEscolhe extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaEscolhe.class.getName());

    public TelaEscolhe() {
        initComponents();
    }

    public void close(){
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnFreelancer = new javax.swing.JButton();
        btnEmpresa = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela de Escolha");
        setMinimumSize(new java.awt.Dimension(1100, 7700));
        setResizable(false);
        getContentPane().setLayout(null);

        btnFreelancer.setText("FREELANCER");
        btnFreelancer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFreelancerActionPerformed(evt);
            }
        });
        getContentPane().add(btnFreelancer);
        btnFreelancer.setBounds(190, 420, 190, 40);

        btnEmpresa.setText("EMPRESA");
        btnEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpresaActionPerformed(evt);
            }
        });
        getContentPane().add(btnEmpresa);
        btnEmpresa.setBounds(720, 420, 190, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TelaEscolhe.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1100, 690);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFreelancerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFreelancerActionPerformed
        //Botao que leva o usuario ao caminho freelancer
        TelaFreelancer tela = new TelaFreelancer();
        tela.setVisible(true);
        
        //função pra fechar janela anterior
            this.dispose();
    }//GEN-LAST:event_btnFreelancerActionPerformed

    private void btnEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpresaActionPerformed
        //botao que leva o usuario ao caminho empresa
        TelaEmpresa tela = new TelaEmpresa();
        tela.setVisible(true);
        
        //função pra fechar janela anterior
            this.dispose();
    }//GEN-LAST:event_btnEmpresaActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new TelaEscolhe().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEmpresa;
    private javax.swing.JButton btnFreelancer;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
