package freelacademy.telas;


public class TelaFCarteira extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaFCarteira.class.getName());

    public TelaFCarteira() {
        initComponents();
    }

    public void close(){
      
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnHome = new javax.swing.JToggleButton();
        btnCurriculo = new javax.swing.JToggleButton();
        btnProjetos = new javax.swing.JToggleButton();
        btnCarteira = new javax.swing.JToggleButton();
        btnSair = new javax.swing.JButton();
        textContaBancaria = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela Carteira Freelancer");
        setMinimumSize(new java.awt.Dimension(1100, 700));
        setResizable(false);
        getContentPane().setLayout(null);

        btnHome.setText("HOME");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        getContentPane().add(btnHome);
        btnHome.setBounds(30, 90, 140, 27);

        btnCurriculo.setText("CURRICULO");
        btnCurriculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCurriculoActionPerformed(evt);
            }
        });
        getContentPane().add(btnCurriculo);
        btnCurriculo.setBounds(30, 130, 140, 27);

        btnProjetos.setText("PROJETOS");
        btnProjetos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProjetosActionPerformed(evt);
            }
        });
        getContentPane().add(btnProjetos);
        btnProjetos.setBounds(30, 170, 140, 27);

        btnCarteira.setText("CARTEIRA");
        btnCarteira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarteiraActionPerformed(evt);
            }
        });
        getContentPane().add(btnCarteira);
        btnCarteira.setBounds(30, 210, 140, 27);

        btnSair.setText("SAIR");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair);
        btnSair.setBounds(30, 610, 130, 40);
        getContentPane().add(textContaBancaria);
        textContaBancaria.setBounds(310, 170, 680, 40);

        jButton1.setText("SALVAR");
        getContentPane().add(jButton1);
        jButton1.setBounds(570, 470, 120, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TelaFCarteira.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1100, 700);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        //botao que leva o usuario ao inicio das confihurações
        TelaFHome tela = new TelaFHome();
        tela.setVisible(true);
        
        //função pra fechar janela anterior
            this.dispose();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnCurriculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCurriculoActionPerformed
        //botao que leva o usuario ao curriculo
        TelaFCurriculo tela = new TelaFCurriculo();
        tela.setVisible(true);
        
        //função pra fechar janela anterior
            this.dispose();
    }//GEN-LAST:event_btnCurriculoActionPerformed

    private void btnProjetosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProjetosActionPerformed
        //botao que leva o usuario aos projetos
        TelaFProjetos tela = new TelaFProjetos();
        tela.setVisible(true);
        
        //função pra fechar janela anterior
            this.dispose();
    }//GEN-LAST:event_btnProjetosActionPerformed

    private void btnCarteiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarteiraActionPerformed
        //Botao que leva o usuario a carteira
        TelaFCarteira tela = new TelaFCarteira();
        tela.setVisible(true);
        
        //função pra fechar janela anterior
            this.dispose();
    }//GEN-LAST:event_btnCarteiraActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new TelaFCarteira().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnCarteira;
    private javax.swing.JToggleButton btnCurriculo;
    private javax.swing.JToggleButton btnHome;
    private javax.swing.JToggleButton btnProjetos;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField textContaBancaria;
    // End of variables declaration//GEN-END:variables
}
