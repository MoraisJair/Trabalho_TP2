package View;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.HeadlessException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import SingletonSession.Sessao;
import View.TelaCadastrar;
import View.TelaLogin;
import View.TelaPrincipal;

public class TelaLogin extends javax.swing.JFrame{
	public TelaLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        btnAcessar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        lblLogin = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        txtUsuario = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        lblVersao = new javax.swing.JLabel();
        lblFundo = new javax.swing.JLabel();
        lblCadastro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lblCadastro.setFont(new java.awt.Font("Arial", 0, 50));
        lblCadastro.setForeground(new java.awt.Color(255, 255, 255));
        lblCadastro.setText("BB - Banco Boituva");
        getContentPane().add(lblCadastro);
        lblCadastro.setBounds(20, 30, 550, 80);

        lblLogin.setFont(new java.awt.Font("Arial", 0, 20));
        lblLogin.setForeground(new java.awt.Color(255, 255, 100));
        lblLogin.setText("Login");
        getContentPane().add(lblLogin);
        lblLogin.setBounds(20, 120, 100, 50);

        lblSenha.setFont(new java.awt.Font("Arial", 0, 20));
        lblSenha.setForeground(new java.awt.Color(255, 255, 100));
        lblSenha.setText("Senha");
        getContentPane().add(lblSenha);
        lblSenha.setBounds(20, 180, 100, 50);
        
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(120, 130, 600, 35);
        getContentPane().add(txtSenha);
        txtSenha.setBounds(120, 190, 600, 35);
                
        btnAcessar.setFont(new java.awt.Font("Arial", 0, 20));
        btnAcessar.setText("Acessar");
        btnAcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcessarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAcessar);
        btnAcessar.setBounds(120, 290, 120, 50);
        
        btnSair.setFont(new java.awt.Font("Arial", 0, 20));
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair);
        btnSair.setBounds(260, 290, 120, 50);
        
        btnCadastrar.setFont(new java.awt.Font("Arial", 0, 20));
        btnCadastrar.setText("Novo Cliente" + "");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrar);
        btnCadastrar.setBounds(460, 290, 260, 50);

        lblVersao.setForeground(new java.awt.Color(255, 255, 0));
        lblVersao.setText("CaixaATM v1.0");
        getContentPane().add(lblVersao);
        lblVersao.setBounds(640, 370, 180, 14);

        lblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/ImgLogin2.jpg")));
        getContentPane().add(lblFundo);
        lblFundo.setBounds(0, 0, 750, 407);

        setSize(new java.awt.Dimension(750, 450));
        setLocationRelativeTo(null);
    }

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {}

    private void btnAcessarActionPerformed(java.awt.event.ActionEvent evt) {
        try {
        	Class.forName("com.mysql.jdbc.Driver");
            Connection con = null; 
            PreparedStatement pstmt = null; 
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/caixaATM", "root", "teste");
            Statement stm = con.createStatement(); 
            String sql = "select * from conta where login = '"+txtUsuario.getText()+"' and senha like '"+txtSenha.getText()+"'";
            ResultSet rs = stm.executeQuery(sql);

            if (rs.next()) {
            	String nomeUsuario = rs.getString("nomeCliente");
                Float saldoUsuario = rs.getFloat("saldo");
                int idUsuario = rs.getInt("idConta");
                
                Sessao sessao = Sessao.getSessao();
                sessao.setNomeCliente(String.valueOf(nomeUsuario));
                sessao.setSaldo(saldoUsuario);
                sessao.setId(idUsuario);
                          
                TelaPrincipal tela = new TelaPrincipal();
                tela.setVisible(true);        
                dispose();
                
            }else{
            	JOptionPane.showMessageDialog(null, "Dados icorretos");                       
            }
        } 
        catch (ClassNotFoundException | SQLException | HeadlessException e) {
        	JOptionPane.showConfirmDialog(null, e);
        }
    }

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {
        TelaCadastrar tela = new TelaCadastrar();
        tela.setVisible(true);
        dispose(); 
    }

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {
    	dispose();
    }

    public static void main(String args[]) {
    	try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variáveis
    private javax.swing.JButton btnAcessar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel lblCadastro;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblVersao;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
}
