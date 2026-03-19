package freelacademy.telas;


public class TelaFComeco extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaFComeco.class.getName());

    
    public TelaFComeco() {
        initComponents();
    }

    public void close(){
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnConfigurações = new javax.swing.JButton();
        btnPerfil = new javax.swing.JButton();
        btnCandidatar0 = new javax.swing.JButton();
        btnCandidatar1 = new javax.swing.JButton();
        btnCandidatar2 = new javax.swing.JButton();
        btnCandidatar3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela F Dashboard");
        setMinimumSize(new java.awt.Dimension(1100, 700));
        setResizable(false);
        getContentPane().setLayout(null);

        btnConfigurações.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Config btn.png"))); // NOI18N
        btnConfigurações.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConfiguraçõesMouseClicked(evt);
            }
        });
        btnConfigurações.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfiguraçõesActionPerformed(evt);
            }
        });
        getContentPane().add(btnConfigurações);
        btnConfigurações.setBounds(930, 10, 40, 40);

        btnPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/perfil btn.png"))); // NOI18N
        btnPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerfilActionPerformed(evt);
            }
        });
        getContentPane().add(btnPerfil);
        btnPerfil.setBounds(1000, 10, 40, 40);

        btnCandidatar0.setText("CANDIDATAR - SE");
        getContentPane().add(btnCandidatar0);
        btnCandidatar0.setBounds(120, 440, 140, 27);

        btnCandidatar1.setText("CANDIDATAR - SE");
        getContentPane().add(btnCandidatar1);
        btnCandidatar1.setBounds(360, 440, 140, 27);

        btnCandidatar2.setText("CANDIDATAR - SE");
        getContentPane().add(btnCandidatar2);
        btnCandidatar2.setBounds(610, 440, 140, 27);

        btnCandidatar3.setText("CANDIDATAR - SE");
        getContentPane().add(btnCandidatar3);
        btnCandidatar3.setBounds(850, 440, 140, 27);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TelaFComeco.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 1100, 700);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfiguraçõesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfiguraçõesActionPerformed
        //Botao que leva o usuario as configurações
        TelaFConfiguracoes tela = new TelaFConfiguracoes();
        tela.setVisible(true);
        
        //função pra fechar janela anterior
            this.dispose();
    }//GEN-LAST:event_btnConfiguraçõesActionPerformed

    private void btnConfiguraçõesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfiguraçõesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConfiguraçõesMouseClicked

    private void btnPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerfilActionPerformed
        //Botao que leva o usuario ao perfil 
        TelaFHome tela = new TelaFHome();
        tela.setVisible(true);
        
        //função pra fechar janela anterior
            this.dispose();
    }//GEN-LAST:event_btnPerfilActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new TelaFComeco().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCandidatar0;
    private javax.swing.JButton btnCandidatar1;
    private javax.swing.JButton btnCandidatar2;
    private javax.swing.JButton btnCandidatar3;
    private javax.swing.JButton btnConfigurações;
    private javax.swing.JButton btnPerfil;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
