package freelacademy.telas;

/**
 * Descrição da classe
 * Classe para adicionar dados sobre o usuario
 * 
 * @author Marcos Tavares
 */

public class TelaEmpresa extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaEmpresa.class.getName());

    public TelaEmpresa() {
        initComponents();
    }

    public void close(){
      
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnImportarFoto = new javax.swing.JButton();
        txtDescricao = new javax.swing.JTextField();
        txtContato = new javax.swing.JTextField();
        txtDisponibilidade = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnPronto = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela Empresa");
        setMinimumSize(new java.awt.Dimension(1100, 700));
        setResizable(false);
        getContentPane().setLayout(null);

        btnImportarFoto.setText("Importar Foto");
        getContentPane().add(btnImportarFoto);
        btnImportarFoto.setBounds(30, 210, 130, 27);

        txtDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescricaoActionPerformed(evt);
            }
        });
        getContentPane().add(txtDescricao);
        txtDescricao.setBounds(280, 210, 780, 40);
        getContentPane().add(txtContato);
        txtContato.setBounds(280, 310, 780, 40);
        getContentPane().add(txtDisponibilidade);
        txtDisponibilidade.setBounds(280, 410, 780, 40);

        btnSalvar.setText("SALVAR");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvar);
        btnSalvar.setBounds(400, 610, 180, 30);

        btnPronto.setText("PRONTO");
        btnPronto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProntoActionPerformed(evt);
            }
        });
        getContentPane().add(btnPronto);
        btnPronto.setBounds(790, 610, 190, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TelaEmpresa.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1100, 700);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
      //botao salvar alterações   
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnProntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProntoActionPerformed
        //Botão que leva o usuario ao inicio
        TelaEComeco tela = new TelaEComeco();
        tela.setVisible(true);
        
        //fecha janela anterior
        this.dispose();
    }//GEN-LAST:event_btnProntoActionPerformed

    private void txtDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoActionPerformed
        //
    }//GEN-LAST:event_txtDescricaoActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new TelaEmpresa().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImportarFoto;
    private javax.swing.JButton btnPronto;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtContato;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtDisponibilidade;
    // End of variables declaration//GEN-END:variables
}
