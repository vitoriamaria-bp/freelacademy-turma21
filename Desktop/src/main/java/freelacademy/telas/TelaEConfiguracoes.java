package freelacademy.telas;

public class TelaEConfiguracoes extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaEConfiguracoes.class.getName());

    
    public TelaEConfiguracoes() {
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
        comboPais = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnBackup = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela Configurações Emoresa");
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
        btnPerfil.setBounds(30, 80, 140, 23);

        btnSair.setText("SAIR");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair);
        btnSair.setBounds(30, 600, 140, 40);

        comboIdiomas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Português", "Inglês", "Espanhol", "Francês", "Alemão", "Italiano", "Japonês", "Chinês", "Russo", "Árabe" }));
        comboIdiomas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboIdiomasActionPerformed(evt);
            }
        });
        getContentPane().add(comboIdiomas);
        comboIdiomas.setBounds(590, 280, 300, 40);

        comboPais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Brasil", "Estados Unidos", "Canadá", "México", "Argentina", "França", "Alemanha", "Itália", "Japão", "Austrália" }));
        comboPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPaisActionPerformed(evt);
            }
        });
        getContentPane().add(comboPais);
        comboPais.setBounds(590, 340, 300, 40);

        jButton1.setText("BACKUP");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(30, 120, 140, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/branco.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(410, 310, 150, 100);

        btnBackup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TelaEConfiguracoes.png"))); // NOI18N
        btnBackup.setText("jLabel1");
        getContentPane().add(btnBackup);
        btnBackup.setBounds(0, -150, 1100, 990);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerfilActionPerformed
        //Botão que leva o usuario ao perfil
        TelaEHome tela = new TelaEHome();
        tela.setVisible(true);
        
        //fecha janela anterior
        this.dispose();
    }//GEN-LAST:event_btnPerfilActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        //Botão que leva o usuario ao inicio
        TelaEComeco tela = new TelaEComeco();
        tela.setVisible(true);
        
        //fecha janela anterior
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void comboIdiomasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboIdiomasActionPerformed
        //escolhe os idiomas
    }//GEN-LAST:event_comboIdiomasActionPerformed

    private void comboPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPaisActionPerformed
        //escolhe os paises
    }//GEN-LAST:event_comboPaisActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Leva o usuario para a tela de backup
        TelaBackup tela = new TelaBackup();
        tela.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new TelaEConfiguracoes().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnBackup;
    private javax.swing.JButton btnPerfil;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> comboIdiomas;
    private javax.swing.JComboBox<String> comboPais;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
