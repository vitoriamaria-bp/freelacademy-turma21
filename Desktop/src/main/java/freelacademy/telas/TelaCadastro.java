package freelacademy.telas;

/**
 * Descrição da classe
 * Classe onde permite o usuario se cadastrar ao sistema
 * 
 * @author Marcos Tavares
 */

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TelaCadastro extends javax.swing.JFrame {
    
    public TelaCadastro() {
        initComponents(); 
        try {
            javax.swing.text.MaskFormatter mascara = 
        new javax.swing.text.MaskFormatter("(##) #####-####");
            mascara.setPlaceholderCharacter('_');
            textTelefone.setFormatterFactory(
        new javax.swing.text.DefaultFormatterFactory(mascara)
    );
} catch (java.text.ParseException e) {
    e.printStackTrace();
}
    }
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textName = new javax.swing.JTextField();
        textEmail = new javax.swing.JTextField();
        textSenha = new javax.swing.JPasswordField();
        checkSalvarSenha = new javax.swing.JCheckBox();
        btnCadastrar = new javax.swing.JButton();
        textConfirmSenha = new javax.swing.JPasswordField();
        btnJaTenhoConta = new javax.swing.JButton();
        textTelefone = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela de Cadastro");
        setMinimumSize(new java.awt.Dimension(1100, 700));
        setResizable(false);
        getContentPane().setLayout(null);

        textName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNameActionPerformed(evt);
            }
        });
        getContentPane().add(textName);
        textName.setBounds(130, 140, 450, 40);
        getContentPane().add(textEmail);
        textEmail.setBounds(130, 220, 450, 40);

        textSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(textSenha);
        textSenha.setBounds(130, 360, 450, 40);
        getContentPane().add(checkSalvarSenha);
        checkSalvarSenha.setBounds(400, 490, 20, 19);

        btnCadastrar.setText("CADASTRAR");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrar);
        btnCadastrar.setBounds(270, 540, 150, 50);
        getContentPane().add(textConfirmSenha);
        textConfirmSenha.setBounds(130, 436, 450, 40);

        btnJaTenhoConta.setText("JÁ TENHO UMA CONTA ");
        btnJaTenhoConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJaTenhoContaActionPerformed(evt);
            }
        });
        getContentPane().add(btnJaTenhoConta);
        btnJaTenhoConta.setBounds(740, 370, 170, 50);

        textTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTelefoneActionPerformed(evt);
            }
        });
        getContentPane().add(textTelefone);
        textTelefone.setBounds(130, 290, 450, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Tela Cadastro.png"))); // NOI18N
        jLabel2.setText("cadastrar");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, -20, 1100, 700);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        System.out.println("BOTÃO FOI CLICADO");

// 1️⃣ Validar campos
if (textName.getText().isEmpty() ||
    textEmail.getText().isEmpty() ||
    textTelefone.getText().contains("_") ||
    textSenha.getPassword().length == 0) {

    javax.swing.JOptionPane.showMessageDialog(this,
            "Preencha todos os campos corretamente!");
    return;
}

// 2️⃣ Validar senha igual
String senhaDigitada = new String(textSenha.getPassword());
String confirmar = new String(textConfirmSenha.getPassword());

if (!senhaDigitada.equals(confirmar)) {
    javax.swing.JOptionPane.showMessageDialog(this,
            "As senhas não coincidem!");
    return;
}

// 3️⃣ Conexão com banco
String servidor = "DESKTOP-NHTT4M9";
String banco = "db_freelacademy";
String usuarioBanco = "sa";
String senhaBanco = "marcos";

String url = "jdbc:sqlserver://" + servidor + ":1433"
        + ";databaseName=" + banco
        + ";user=" + usuarioBanco
        + ";password=" + senhaBanco
        + ";encrypt=true;trustServerCertificate=true";

try {
    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

    try (Connection conecta = DriverManager.getConnection(url)) {

        String sql = "INSERT INTO tb_freelancer (Nome, Email, Telefone, Senha) VALUES (?, ?, ?, ?)";

        try (PreparedStatement pst = conecta.prepareStatement(sql)) {

            pst.setString(1, textName.getText());
            pst.setString(2, textEmail.getText());
            pst.setString(3, textTelefone.getText());
            pst.setString(4, senhaDigitada);
            

            // 🟢 Try-catch específico para UNIQUE
            try {
                int linhas = pst.executeUpdate();

                if (linhas > 0) {
                    javax.swing.JOptionPane.showMessageDialog(this,
                            "Cadastro realizado com sucesso!");

                    TelaAviso tela = new TelaAviso();
                    tela.setVisible(true);
                    this.dispose();
                }

            } catch (SQLException e) {
                if (e.getMessage().contains("UQ_Email")) {
                    JOptionPane.showMessageDialog(this, "Email já cadastrado!");
                } else if (e.getMessage().contains("UQ_Telefone")) {
                    JOptionPane.showMessageDialog(this, "Telefone já cadastrado!");
                } else {
                    JOptionPane.showMessageDialog(this, "Erro no cadastro: " + e.getMessage());
                }
                return; // ⚠ impede abrir a tela de sucesso se deu erro
            }

        }
    }

} catch (Exception e) {
    e.printStackTrace();
}
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnJaTenhoContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJaTenhoContaActionPerformed
        //Botão que leva o usuario ao login
        TelaLogin tela = new TelaLogin();
        tela.setVisible(true);
        
        // fecha a janela anterior
        this.dispose();
    }//GEN-LAST:event_btnJaTenhoContaActionPerformed

    private void textNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNameActionPerformed

    private void textSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textSenhaActionPerformed

    private void textTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTelefoneActionPerformed
        try {
            javax.swing.text.MaskFormatter mascara =
                new javax.swing.text.MaskFormatter("(##) #####-####");

            mascara.setPlaceholderCharacter('_'); // mostra os underscores
            mascara.setAllowsInvalid(true);       // permite digitar parcialmente
            mascara.setOverwriteMode(true);       // substitui caracteres no lugar

            textTelefone.setFormatterFactory(
                new javax.swing.text.DefaultFormatterFactory(mascara)
            );

        } catch (java.text.ParseException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_textTelefoneActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnJaTenhoConta;
    private javax.swing.JCheckBox checkSalvarSenha;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField textConfirmSenha;
    private javax.swing.JTextField textEmail;
    private javax.swing.JTextField textName;
    private javax.swing.JPasswordField textSenha;
    private javax.swing.JFormattedTextField textTelefone;
    // End of variables declaration//GEN-END:variables
}
