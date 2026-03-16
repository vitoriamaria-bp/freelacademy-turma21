package freelacademy.telas;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class TelaCadastro extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaCadastro.class.getName());

    public TelaCadastro() {
        initComponents();
        
        /*deixando em tela cheia
        setExtendedState(MAXIMIZED_BOTH);*/
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jPasswordField2 = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela de Cadastro");
        setMinimumSize(new java.awt.Dimension(1100, 700));
        setPreferredSize(new java.awt.Dimension(1100, 700));
        setResizable(false);
        getContentPane().setLayout(null);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(130, 140, 450, 40);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(130, 220, 450, 40);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(130, 290, 450, 40);
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(130, 360, 450, 40);
        getContentPane().add(jCheckBox1);
        jCheckBox1.setBounds(400, 490, 180, 19);

        jButton1.setText("ENTRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(270, 540, 150, 50);
        getContentPane().add(jPasswordField2);
        jPasswordField2.setBounds(130, 436, 450, 40);

        jButton2.setText("JÁ TENHO UMA CONTA ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(740, 350, 180, 70);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Marcos Tavares\\Documents\\NetBeansProjects\\FreelAcademy\\src\\main\\java\\src\\Tela Cadastro.png")); // NOI18N
        jLabel2.setText("cadastrar");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, -20, 1100, 700);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        TelaAviso tela = new TelaAviso();
        tela.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        TelaLogin tela = new TelaLogin();
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
        ImageIcon icone = new ImageIcon("teste.png.png");

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
        java.awt.EventQueue.invokeLater(() -> new TelaCadastro().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
