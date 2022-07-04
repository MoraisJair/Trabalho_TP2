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

public class TelaTransferencia extends javax.swing.JFrame{
    public TelaTransferencia() {
        initComponents();
        Sessao sessao = Sessao.getSessao(); 
        String nomeUsuario = sessao.getNomeCliente();
        Float saldoUsuario = sessao.getSaldo();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        lblApresentacao = new javax.swing.JLabel();
        lblAgencia = new javax.swing.JLabel();
        lblConta = new javax.swing.JLabel();
        lblValor = new javax.swing.JLabel();
        btnConfirmar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        txtAgencia = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        lblAlerta = new javax.swing.JLabel();
        txtConta = new javax.swing.JTextField();

        lblApresentacao.setFont(new java.awt.Font("Arial", 0, 25));
        lblApresentacao.setText("Transferência entre contas");
        lblAgencia.setFont(new java.awt.Font("Arial", 0, 20));
        lblAgencia.setText("Número da agência");
        lblConta.setFont(new java.awt.Font("Arial", 0, 20));
        lblConta.setText("Conta");
        lblValor.setFont(new java.awt.Font("Arial", 0, 20));
        lblValor.setText("Valor a transferir");

        btnConfirmar.setFont(new java.awt.Font("Arial", 0, 20));
        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        btnSair.setFont(new java.awt.Font("Arial", 0, 20));
        btnSair.setText("Voltar");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        txtAgencia.setEditable(false);
        txtAgencia.setFont(new java.awt.Font("Arial", 0, 25));
        txtAgencia.setText("001");
        txtAgencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgenciaActionPerformed(evt);
            }
        });

        txtValor.setFont(new java.awt.Font("Arial", 0, 25));
        txtValor.setText("");
        txtConta.setFont(new java.awt.Font("Arial", 0, 25));
        lblAlerta.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblApresentacao)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAgencia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAgencia))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblConta)
                            .addComponent(lblValor))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtValor)
                            .addComponent(txtConta)))
                    .addComponent(lblAlerta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(184, Short.MAX_VALUE)
                .addComponent(btnConfirmar)
                .addGap(18, 18, 18)
                .addComponent(btnSair)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(lblApresentacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAlerta, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAgencia)
                    .addComponent(txtAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblConta)
                    .addComponent(txtConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValor)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirmar)
                    .addComponent(btnSair))
                .addContainerGap())
        );
        pack();
    }

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {
        TelaPrincipal tela = new TelaPrincipal(); 
        tela.setVisible(true);
        dispose();
    }
    private void txtAgenciaActionPerformed(java.awt.event.ActionEvent evt) {}

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {
        int contador = 0;
      
        if (txtAgencia.getText().length() > 0) {
        txtAgencia.setVisible(true);
        contador++;
       
        } else {
        	lblAlerta.setText("- Preencha todos os campos -");
        }
        
        if (txtConta.getText().length() > 0) {
        	txtConta.setVisible(true);
        	contador++;
        } else {
        	lblAlerta.setText("- Preencha todos os campos -");
        }
        
        if (txtValor.getText().length() > 0) {
        	txtValor.setVisible(true);
        	contador++;
        } else {
        	lblAlerta.setText("- Preencha todos os campos -");
        }
        
        if (contador == 3){
        	Sessao sessao = Sessao.getSessao();
            try {
            	Class.forName("com.mysql.jdbc.Driver");
                Connection con = null; 
                PreparedStatement pstmt = null; 
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/caixaATM", "root", "teste");
                Statement stm = con.createStatement(); 
                String sql = "select * from conta where nomeCliente = '"+sessao.getNomeCliente()+"'";
                ResultSet rs = stm.executeQuery(sql);
                 
                if (rs.next()) {
                	Float saldoAtualUsuario = Float.valueOf(rs.getString("saldo"));
                    Float saldoDigitado = Float.valueOf(txtValor.getText());
                    Float calculoSaldoAtual = saldoAtualUsuario - saldoDigitado; 
                     
                    if (calculoSaldoAtual >= 0) {  
                    	PreparedStatement pUsuario = con.prepareStatement("UPDATE conta SET saldo = ? WHERE idConta = ?");   
                        pUsuario.setFloat(1, calculoSaldoAtual);
                        pUsuario.setInt(2, sessao.getId());
                        pUsuario.execute();
                        pUsuario.close();
                          
                        PreparedStatement pRegistroTransferencia = con.prepareStatement("INSERT INTO transferencia (valor, id_conta) values (?, ?)");
                        pRegistroTransferencia.setFloat(1, saldoDigitado);
                        pRegistroTransferencia.setInt(2, sessao.getId());
                        pRegistroTransferencia.execute();
                        pRegistroTransferencia.close();
                          
                        Statement stmRecebimento = con.createStatement();
                        String sqlRecebimento = "select * from conta where login = '"+txtConta.getText()+"'";
                        ResultSet rsRecebimento = stmRecebimento.executeQuery(sqlRecebimento);
                          
                        if (rsRecebimento.next()) {  
                        	Float saldoAtualRecebimento = Float.valueOf(rsRecebimento.getString("saldo"));                    
                        	Float calculoSaldoRecebido = saldoAtualRecebimento + saldoDigitado;
                          
                        	PreparedStatement pRecebimento = con.prepareStatement("UPDATE conta SET saldo = ? WHERE login = ?");
                        	pRecebimento.setFloat(1, calculoSaldoRecebido);
                        	pRecebimento.setInt(2, Integer.valueOf(txtConta.getText()));
                        	pRecebimento.execute();
                        	pRecebimento.close();
                          
                        	JOptionPane.showMessageDialog(null, "Transferência realizada!");
                        	sessao.setSaldo(calculoSaldoAtual);
                        	TelaPrincipal tela = new TelaPrincipal(); 
                        	tela.setVisible(true);
                        	dispose(); 
                        }
                    } else {
                    	JOptionPane.showMessageDialog(null, "Saldo insuficiente");
                    }
                } else {
                	JOptionPane.showMessageDialog(null, "Depósito não pode ser efetuado");                       
                }
            } 
            catch (ClassNotFoundException | SQLException | HeadlessException e) {
            	JOptionPane.showConfirmDialog(null, e);
            }
        } else {
        	lblAlerta.setText("- Preencha todos os campos -");
        }
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
            java.util.logging.Logger.getLogger(TelaTransferencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaTransferencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaTransferencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaTransferencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaTransferencia().setVisible(true);
            }
        });
    }

    // Variáveis
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel lblAlerta;
    private javax.swing.JLabel lblApresentacao;
    private javax.swing.JLabel lblAgencia;
    private javax.swing.JLabel lblConta;
    private javax.swing.JLabel lblValor;
    private javax.swing.JTextField txtAgencia;
    private javax.swing.JTextField txtConta;
    private javax.swing.JTextField txtValor;

}
