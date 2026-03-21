package freelacademy.telas;

/**
 * Descrição da classe
 * Classe onde o usuario pode visualizar pagamentos e adicionar contas 
 * 
 * @author Marcos Tavares
 */

public class TelaECarteira extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaECarteira.class.getName());

    public TelaECarteira() {
        initComponents();
    }
    
    public void close(){
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSair = new javax.swing.JButton();
        btnHome = new javax.swing.JToggleButton();
        btnPortifolio = new javax.swing.JToggleButton();
        btnProjetos = new javax.swing.JToggleButton();
        btnCarteira = new javax.swing.JToggleButton();
        textContaBancaria = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela Carteira Empresa");
        setMinimumSize(new java.awt.Dimension(1100, 700));
        setResizable(false);
        getContentPane().setLayout(null);

        btnSair.setText("SAIR");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair);
        btnSair.setBounds(30, 600, 130, 40);

        btnHome.setText("HOME");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        getContentPane().add(btnHome);
        btnHome.setBounds(30, 70, 140, 27);

        btnPortifolio.setText("PORTIFOLIO");
        btnPortifolio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPortifolioActionPerformed(evt);
            }
        });
        getContentPane().add(btnPortifolio);
        btnPortifolio.setBounds(30, 110, 140, 27);

        btnProjetos.setText("PROJETOS");
        btnProjetos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProjetosActionPerformed(evt);
            }
        });
        getContentPane().add(btnProjetos);
        btnProjetos.setBounds(30, 150, 140, 27);

        btnCarteira.setText("CARTEIRA");
        btnCarteira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarteiraActionPerformed(evt);
            }
        });
        getContentPane().add(btnCarteira);
        btnCarteira.setBounds(30, 190, 140, 27);
        getContentPane().add(textContaBancaria);
        textContaBancaria.setBounds(310, 170, 680, 40);

        jButton1.setText("SALVAR");
        getContentPane().add(jButton1);
        jButton1.setBounds(570, 470, 120, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TelaECarteira.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1100, 700);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        //Botão que leva o usuario ao inicio das configurações
        TelaEHome tela = new TelaEHome();
        tela.setVisible(true);
        
        //fecha janela anterior
        this.dispose();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnPortifolioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPortifolioActionPerformed
        //Botão que leva o usuario ao portifolio
        TelaEPortifolio tela = new TelaEPortifolio();
        tela.setVisible(true);
        
        //fecha janela anterior
        this.dispose();
    }//GEN-LAST:event_btnPortifolioActionPerformed

    private void btnProjetosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProjetosActionPerformed
        //Botão que leva o usuario ao projetos
        TelaEProjetos tela = new TelaEProjetos();
        tela.setVisible(true);
        
        //fecha janela anterior
        this.dispose();
    }//GEN-LAST:event_btnProjetosActionPerformed

    private void btnCarteiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarteiraActionPerformed
        //Botão que leva o usuario a carteira
        TelaECarteira tela = new TelaECarteira();
        tela.setVisible(true);
        
        //fecha janela anterior
        this.dispose();
    }//GEN-LAST:event_btnCarteiraActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        //Botão que leva o usuario ao inicio
        TelaEComeco tela = new TelaEComeco();
        tela.setVisible(true);
        
        //fecha janela anterior
        this.dispose();
        
    }//GEN-LAST:event_btnSairActionPerformed

    /**
     * @param args the command line arguments
     */
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
        java.awt.EventQueue.invokeLater(() -> new TelaECarteira().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnCarteira;
    private javax.swing.JToggleButton btnHome;
    private javax.swing.JToggleButton btnPortifolio;
    private javax.swing.JToggleButton btnProjetos;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField textContaBancaria;
    // End of variables declaration//GEN-END:variables
}
