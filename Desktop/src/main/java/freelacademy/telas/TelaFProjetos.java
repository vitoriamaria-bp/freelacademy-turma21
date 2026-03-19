package freelacademy.telas;

public class TelaFProjetos extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaFProjetos.class.getName());

    public TelaFProjetos() {
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
        jTextField2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela Projetos Freelancer");
        setAlwaysOnTop(true);
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
        btnSair.setBounds(30, 610, 140, 40);

        jTextField2.setText("Descrição do Projeto");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(280, 210, 700, 50);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o Status", "Em Andamento", "Concluido", "Pausado" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(430, 360, 340, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TelaFProjetos.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, -10, 1100, 700);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        //botao que leva o usuario ao inicio das configurações
        TelaFHome tela = new TelaFHome();
        tela.setVisible(true);
        
        //função pra fechar janela anterior
            this.dispose();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnCurriculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCurriculoActionPerformed
        ////botao que leva o usuario ao curriculo
        TelaFCurriculo tela = new TelaFCurriculo();
        tela.setVisible(true);
        
        //função pra fechar janela anterior
            this.dispose();
                    
    }//GEN-LAST:event_btnCurriculoActionPerformed

    private void btnProjetosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProjetosActionPerformed
        ////botao que leva o usuario aos projetos
        TelaFProjetos tela = new TelaFProjetos();
        tela.setVisible(true);
        
        //função pra fechar janela anterior
            this.dispose();
    }//GEN-LAST:event_btnProjetosActionPerformed

    private void btnCarteiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarteiraActionPerformed
        //botao que leva o usuario a carteira
        TelaFCarteira tela = new TelaFCarteira();
        tela.setVisible(true);
        
        //função pra fechar janela anterior
            this.dispose();
    }//GEN-LAST:event_btnCarteiraActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        ////botao que leva o usuario inicio 
        TelaFComeco tela = new TelaFComeco();
        tela.setVisible(true);
        
        //função pra fechar janela anterior
            this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new TelaFProjetos().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnCarteira;
    private javax.swing.JToggleButton btnCurriculo;
    private javax.swing.JToggleButton btnHome;
    private javax.swing.JToggleButton btnProjetos;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
