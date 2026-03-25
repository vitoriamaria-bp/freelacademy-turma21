package freelacademy.telas;

/**
 * Descrição da classe
 * Classe onde o usuario pode ter acesso ao sistema
 * 
 * @author Marcos Tavares
 */

import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class TelaHome extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaHome.class.getName());

    public TelaHome() {
        initComponents();
    }
    
    public void close(){
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEntrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Inicial");
        setMinimumSize(new java.awt.Dimension(1100, 700));
        setResizable(false);
        getContentPane().setLayout(null);

        btnEntrar.setText("ENTRAR");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEntrar);
        btnEntrar.setBounds(890, 10, 180, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/branco.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(530, 10, 90, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/branco.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(680, 10, 110, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/branco.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(410, 10, 70, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TelaHome.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1100, 680);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        //botao que loga o usuario 
        TelaLogin tela = new TelaLogin();
        tela.setVisible(true);
        
        //função pra fechar janela anterior
            this.dispose();
    }//GEN-LAST:event_btnEntrarActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new TelaHome().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
