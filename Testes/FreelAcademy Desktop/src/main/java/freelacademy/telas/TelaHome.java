package freelacademy.telas;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class TelaHome extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaHome.class.getName());

    public TelaHome() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Inicial");
        setMinimumSize(new java.awt.Dimension(1100, 700));
        setPreferredSize(new java.awt.Dimension(1100, 700));
        setResizable(false);
        getContentPane().setLayout(null);

        jButton1.setText("ENTRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(880, 10, 180, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Marcos Tavares\\Documents\\NetBeansProjects\\FreelAcademy\\src\\main\\java\\src\\TelaHome.png")); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1100, 680);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        TelaLogin tela = new TelaLogin();
        tela.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new TelaHome().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
