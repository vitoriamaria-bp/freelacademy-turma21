package freelacademy.telas;

public class TelaEsqueceSenha extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaEsqueceSenha.class.getName());

    public TelaEsqueceSenha() {
        initComponents();
    }

    public void close(){
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtEmail = new javax.swing.JTextField();
        btnRecebeEmail = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela de Esqueci a Senha");
        setMinimumSize(new java.awt.Dimension(1100, 700));
        setResizable(false);
        getContentPane().setLayout(null);
        getContentPane().add(txtEmail);
        txtEmail.setBounds(200, 340, 690, 50);

        btnRecebeEmail.setText("RECEBER EMAIL");
        btnRecebeEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecebeEmailActionPerformed(evt);
            }
        });
        getContentPane().add(btnRecebeEmail);
        btnRecebeEmail.setBounds(680, 470, 210, 50);

        btnVoltar.setText("VOLTAR AO INICIO");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar);
        btnVoltar.setBounds(200, 470, 210, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Tela Esqueci a Senha.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -20, 1100, 700);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRecebeEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecebeEmailActionPerformed
        //Botao que leva o usuario pop-up
        TelaCaixaEntrada tela = new TelaCaixaEntrada();
        tela.setVisible(true);
    }//GEN-LAST:event_btnRecebeEmailActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        //Botao que leva o usuario ao login
        TelaLogin tela = new TelaLogin();
        tela.setVisible(true);
        
        //função pra fechar janela anterior
            this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    public static void main(String args[]) {
        
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new TelaEsqueceSenha().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRecebeEmail;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtEmail;
    // End of variables declaration//GEN-END:variables
}
