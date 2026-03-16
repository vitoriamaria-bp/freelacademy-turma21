package freelacademy.telas;

import java.awt.Desktop;
import java.net.URL;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class TelaAviso extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaAviso.class.getName());

    public TelaAviso() {
        initComponents();
        
        /*deixando em tela cheia
        setExtendedState(MAXIMIZED_BOTH);*/
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela de Aviso");
        setMinimumSize(new java.awt.Dimension(1100, 700));
        setPreferredSize(new java.awt.Dimension(1100, 700));
        setResizable(false);
        getContentPane().setLayout(null);

        jButton1.setText("SITE ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(280, 480, 180, 50);

        jButton2.setText("CONTINUAR CADASTRO");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(680, 480, 180, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Marcos Tavares\\Documents\\NetBeansProjects\\FreelAcademy\\src\\main\\java\\src\\Tela Aviso Usuario.png")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -30, 1120, 700);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        TelaEscolhe tela = new TelaEscolhe();
        tela.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            Desktop.getDesktop().browse(new URL("https://youtu.be/0acgpCo6HFc?si=sR6xCRNstLmoZvHe").toURI());
        }
        catch(Exception e)
        {}
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
        java.awt.EventQueue.invokeLater(() -> new TelaAviso().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
