package View;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class TelaCadastrar extends javax.swing.JFrame{
    public TelaCadastrar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        lblCadastro = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblCPF = new javax.swing.JLabel();
        lblRG = new javax.swing.JLabel();
        lblConta = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        lblAgencia = new javax.swing.JLabel();
        txtNomeCliente = new javax.swing.JTextField();
        txtCpfCliente = new javax.swing.JTextField();
        txtRgCliente = new javax.swing.JTextField();
        txtLogin = new javax.swing.JTextField();
        txtSenha = new javax.swing.JTextField();
        txtAgencia = new javax.swing.JTextField();
        btnSair = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        txtAlerta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblCadastro.setFont(new java.awt.Font("Arial", 0, 25));
        lblCadastro.setText("Cadastro");
        lblNome.setFont(new java.awt.Font("Arial", 0, 15));
        lblNome.setText("Nome Completo:");
        lblCPF.setFont(new java.awt.Font("Arial", 0, 15));
        lblCPF.setText("CPF:");
        lblRG.setFont(new java.awt.Font("Arial", 0, 15));
        lblRG.setText("RG: ");

        txtNomeCliente.setFont(new java.awt.Font("Arial", 0, 20));
        txtNomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeClienteActionPerformed(evt);
            }
        });

        btnSair.setFont(new java.awt.Font("Arial", 0, 20));
        btnSair.setText("Voltar");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnCadastrar.setFont(new java.awt.Font("Arial", 0, 20));
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        txtAlerta.setForeground(new java.awt.Color(255, 0, 0));

        lblConta.setFont(new java.awt.Font("Arial", 0, 15));
        lblConta.setText("Login:");
        lblSenha.setFont(new java.awt.Font("Arial", 0, 15));
        lblSenha.setText("Senha:");
        lblAgencia.setFont(new java.awt.Font("Arial", 0, 15));
        lblAgencia.setText("Agência:");
        
        txtCpfCliente.setFont(new java.awt.Font("Arial", 0, 20));
        txtRgCliente.setFont(new java.awt.Font("Arial", 0, 20));
        txtLogin.setFont(new java.awt.Font("Arial", 0, 20));
        txtSenha.setFont(new java.awt.Font("Arial", 0, 20));

        txtAgencia.setEditable(false);
        txtAgencia.setFont(new java.awt.Font("Arial", 0, 20));
        txtAgencia.setText("001");
        txtAgencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgenciaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblCadastro)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblRG)
                        .addGap(108, 108, 108)
                        .addComponent(txtRgCliente))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 220, Short.MAX_VALUE)
                        .addComponent(btnCadastrar)
                        .addGap(100, 100, 100)
                        .addComponent(btnSair))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCPF)
                            .addComponent(lblNome))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAlerta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNomeCliente)
                            .addComponent(txtCpfCliente)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSenha)
                        .addGap(92, 92, 92)
                        .addComponent(txtSenha))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAgencia)
                            .addComponent(lblConta))
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAgencia)
                            .addComponent(txtLogin))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCadastro)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtAlerta, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCPF)
                    .addComponent(txtCpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRG)
                    .addComponent(txtRgCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAgencia)
                    .addComponent(txtAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblConta)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSenha)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSair)
                    .addComponent(btnCadastrar))
                .addContainerGap())
        );
        pack();
    }

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {
        int contador = 0; 
        if (txtCpfCliente.getText().length() > 0) {
        	txtCpfCliente.setVisible(true);
        	contador++;
        }else{
        	txtAlerta.setText("** Campos obrigatorios **");
        }
      
        if (txtNomeCliente.getText().length() > 0) {
        	txtNomeCliente.setVisible(true);
        	contador++;
        }else{
        	txtAlerta.setText("** Campos obrigatorios **");
        }
        
        if (txtRgCliente.getText().length() > 0) {
        	txtRgCliente.setVisible(true);
        	contador++;
        }else{
        	txtAlerta.setText("** Campos obrigatorios **");
        }
            
        if (txtLogin.getText().length() > 0) {
        	txtLogin.setVisible(true);
        	contador++;
        }else{
        	txtAlerta.setText("** Campos obrigatorios **");
        }
                    
        if (txtSenha.getText().length() > 0) {
        	txtSenha.setVisible(true);
        	contador++;
        
        }else{
        	txtAlerta.setText("** Campos obrigatorios **");
        }
            
        if(contador ==5) {
        	String nomeCliente = txtNomeCliente.getText().toString(); 
            String cpfCliente = txtCpfCliente.getText().toString(); 
            String rgCliente = txtRgCliente.getText().toString(); 
            float saldoInicial = 20; 
            String saldo = Float.valueOf(saldoInicial).toString(); 
            String agencia = Integer.valueOf(txtAgencia.getText()).toString();
            String login = Integer.valueOf(txtLogin.getText()).toString();
            String senha = Integer.valueOf(txtSenha.getText()).toString(); 
            Connection con = null; 
            PreparedStatement pstmt = null; 
            try {
            	Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/caixaATM", "root", "teste");
                pstmt = con.prepareStatement("INSERT INTO conta (login, senha, nomeCliente, cpfCliente, rgCliente, agencia, saldo) VALUES (?,?,?,?,?,?, ?)"); 
                pstmt.setString(1, login);
                pstmt.setString(2, senha);
                pstmt.setString(3, nomeCliente);
                pstmt.setString(4, cpfCliente);
                pstmt.setString(5, rgCliente);
                pstmt.setString(6, agencia);
                pstmt.setString(7, saldo);
                pstmt.execute(); 
                con.close();
                JOptionPane.showMessageDialog(null, "Inserido com sucesso!");         
            }catch (Exception e){
                JOptionPane.showConfirmDialog(null, e);
            }
        }else{  
                txtAlerta.setText("Preencha todos os campos");
        } 
    
    }
        
        private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {
        	TelaLogin login = new TelaLogin(); 
        	login.setVisible(true);
        	dispose();  
        }
        
        private void txtNomeClienteActionPerformed(java.awt.event.ActionEvent evt) {}

        private void txtAgenciaActionPerformed(java.awt.event.ActionEvent evt) {}

        public static void main(String args[]) {
        	try {
        		for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        			if ("Nimbus".equals(info.getName())) {
        				javax.swing.UIManager.setLookAndFeel(info.getClassName());
        				break;
        			}
        		}
        	} catch (ClassNotFoundException ex) {
        		java.util.logging.Logger.getLogger(TelaCadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        	} catch (InstantiationException ex) {
        		java.util.logging.Logger.getLogger(TelaCadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        	} catch (IllegalAccessException ex) {
        		java.util.logging.Logger.getLogger(TelaCadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        	} catch (javax.swing.UnsupportedLookAndFeelException ex) {
        		java.util.logging.Logger.getLogger(TelaCadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        	}

        	java.awt.EventQueue.invokeLater(new Runnable() {
        		public void run() {
        			new TelaCadastrar().setVisible(true);
        		}
        	});
        }

        // Variáveis
        private javax.swing.JButton btnCadastrar;
        private javax.swing.JButton btnSair;
        private javax.swing.JLabel txtAlerta;
        private javax.swing.JLabel lblCadastro;
        private javax.swing.JLabel lblNome;
        private javax.swing.JLabel lblCPF;
        private javax.swing.JLabel lblRG;
        private javax.swing.JLabel lblConta;
        private javax.swing.JLabel lblSenha;
        private javax.swing.JLabel lblAgencia;
        private javax.swing.JTextField txtAgencia;
        private javax.swing.JTextField txtCpfCliente;
        private javax.swing.JTextField txtLogin;
        private javax.swing.JTextField txtNomeCliente;
        private javax.swing.JTextField txtRgCliente;
        private javax.swing.JTextField txtSenha;
}
