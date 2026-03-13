package freelacademy.telas;

public class TelaFreelancer extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaFreelancer.class.getName());
 
    public TelaFreelancer() {
        initComponents();
    }
    
    public void close(){

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnImportarFoto = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnPronto = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela Freelancer");
        setMinimumSize(new java.awt.Dimension(1100, 700));
        setResizable(false);
        getContentPane().setLayout(null);

        btnImportarFoto.setText("Importar Foto");
        btnImportarFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportarFotoActionPerformed(evt);
            }
        });
        getContentPane().add(btnImportarFoto);
        btnImportarFoto.setBounds(30, 210, 130, 27);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar área", "Editor de video e fotos", "Editor de audio", "Desenvolvedor de sites e aplicações Desktop", "Desenvolvedor de sites e aplicações Mobile", "Marketing Digital" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(280, 200, 790, 40);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(280, 320, 780, 40);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(280, 440, 780, 40);

        btnSalvar.setText("SALVAR");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvar);
        btnSalvar.setBounds(390, 600, 190, 30);

        btnPronto.setText("PRONTO");
        btnPronto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProntoActionPerformed(evt);
            }
        });
        getContentPane().add(btnPronto);
        btnPronto.setBounds(780, 600, 190, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TelaFreelancer.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1100, 700);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnImportarFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportarFotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnImportarFotoActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnProntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProntoActionPerformed
        //botao que leva o usuario ao inicio 
        TelaFComeco tela = new TelaFComeco();
        tela.setVisible(true);
        
        //função pra fechar janela anterior
            this.dispose();
    }//GEN-LAST:event_btnProntoActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new TelaFreelancer().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImportarFoto;
    private javax.swing.JButton btnPronto;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
