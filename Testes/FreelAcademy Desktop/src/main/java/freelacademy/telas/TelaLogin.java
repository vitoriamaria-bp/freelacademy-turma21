package freelacademy.telas;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;


public class TelaLogin extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaLogin.class.getName());

    public TelaLogin() {
        initComponents();
  
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela de Login");
        setMinimumSize(new java.awt.Dimension(1100, 700));
        setPreferredSize(new java.awt.Dimension(1100, 700));
        setResizable(false);
        getContentPane().setLayout(null);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(130, 250, 460, 40);

        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1);
        jCheckBox1.setBounds(410, 440, 20, 19);
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(130, 360, 460, 40);

        jButton1.setText("ENTRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(270, 520, 150, 60);

        jButton2.setText("ESQUECEU A SENHA ?");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(130, 440, 170, 27);

        jButton3.setText("CADASTRAR - SE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(740, 370, 170, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Marcos Tavares\\Documents\\NetBeansProjects\\FreelAcademy\\src\\main\\java\\src\\Tela Login.png")); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setMaximumSize(new java.awt.Dimension(1100, 700));
        jLabel2.setMinimumSize(new java.awt.Dimension(1100, 700));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, -20, 1100, 700);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        TelaFDashboard tela = new TelaFDashboard();
        tela.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        TelaCadastro tela = new TelaCadastro();
        tela.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        TelaEsqueceSenha tela = new TelaEsqueceSenha();
        tela.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
        
        /*// 1. Cria o JFrame (a janela)
        JFrame frame = new JFrame("Minha Imagem no JFrame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(0, 0);*/
        
        // 2. Cria o objeto ImageIcon
        // O caminho deve ser relativo ao local onde o código está sendo executado.
        // Se a imagem estiver na raiz do projeto, use apenas o nome do arquivo.
        // Substitua "imagem.png" pelo nome real do seu arquivo.
        ImageIcon icone = new ImageIcon("/imagens/Tela_Cadastro.png");

        // 3. Cria o JLabel e associa o ImageIcon a ele
        JLabel labelImagem = new JLabel(icone);
        
        // Opcional: Para centralizar a imagem no JLabel
        labelImagem.setHorizontalAlignment(JLabel.CENTER);

        /*// 4. Adiciona o JLabel ao JFrame
        frame.add(labelImagem);

        // 5. Torna o JFrame visível
        frame.setVisible(true);*/
        
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
        java.awt.EventQueue.invokeLater(() -> new TelaLogin().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
