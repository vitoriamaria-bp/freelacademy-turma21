package freelacademy.telas;

public class TelaFConfiguracoes extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaFConfiguracoes.class.getName());

    
    public TelaFConfiguracoes() {
        initComponents();
    }

    public void close(){
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalvar = new javax.swing.JButton();
        btnPerfil = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        comboIdiomas = new javax.swing.JComboBox<>();
        comboRegiao = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela Configurações Freelancer");
        setMinimumSize(new java.awt.Dimension(1100, 700));
        setResizable(false);
        getContentPane().setLayout(null);

        btnSalvar.setText("SALVAR");
        getContentPane().add(btnSalvar);
        btnSalvar.setBounds(560, 470, 160, 50);

        btnPerfil.setText("PERFIL");
        btnPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerfilActionPerformed(evt);
            }
        });
        getContentPane().add(btnPerfil);
        btnPerfil.setBounds(30, 80, 130, 27);

        btnSair.setText("SAIR");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair);
        btnSair.setBounds(20, 600, 140, 40);

        comboIdiomas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Português", "Inglês", "Espanhol", "Francês", "Alemão", "Italiano", "Japonês", "Chinês", "Russo", "Árabe" }));
        getContentPane().add(comboIdiomas);
        comboIdiomas.setBounds(590, 290, 300, 40);

        comboRegiao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Brasil", "Estados Unidos", "Canadá", "México", "Argentina", "França", "Alemanha", "Itália", "Japão", "Austrália" }));
        getContentPane().add(comboRegiao);
        comboRegiao.setBounds(590, 350, 300, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TelaFConfigurações.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -80, 1100, 850);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerfilActionPerformed
        //Botao que leva o usuario ao perfil
        TelaFHome tela = new TelaFHome();
        tela.setVisible(true);
        
        //função pra fechar janela anterior
            this.dispose();
    }//GEN-LAST:event_btnPerfilActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        //Botao que leva o usuario ao inicio 
        TelaFComeco tela = new TelaFComeco();
        tela.setVisible(true);
        
        //função pra fechar janela anterior
            this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    
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
        java.awt.EventQueue.invokeLater(() -> new TelaFConfiguracoes().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPerfil;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> comboIdiomas;
    private javax.swing.JComboBox<String> comboRegiao;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
