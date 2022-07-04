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

public class TelaDeposito extends javax.swing.JFrame{
    public TelaDeposito() {
        initComponents();
        
        Sessao sessao = Sessao.getSessao(); 
        String nomeUsuario = sessao.getNomeCliente();
        Float saldoUsuario = sessao.getSaldo();
        txtNomeUsuario.setText(nomeUsuario);
        txtSaldo.setText(String.valueOf(saldoUsuario));
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        btnVoltar = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();
    	lblValor = new javax.swing.JLabel();
        lblSaldo = new javax.swing.JLabel();
        txtNomeUsuario = new javax.swing.JLabel();
        txtSaldo = new javax.swing.JTextField();
        txtValorDeposito = new javax.swing.JTextField();
        txtAlerta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblValor.setFont(new java.awt.Font("Arial", 0, 25));
        lblValor.setText("Valor a depositar para: ");

        txtNomeUsuario.setFont(new java.awt.Font("Arial", 0, 25));
        txtSaldo.setFont(new java.awt.Font("Arial", 0, 25));
        txtSaldo.setEditable(false);
        txtSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSaldoActionPerformed(evt);
            }
        });

        lblSaldo.setFont(new java.awt.Font("Arial", 0, 25));
        lblSaldo.setText("Saldo: ");

        txtValorDeposito.setFont(new java.awt.Font("Arial", 0, 25));
        txtValorDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorDepositoActionPerformed(evt);
            }
        });

        btnVoltar.setFont(new java.awt.Font("Arial", 0, 20));
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnConfirmar.setFont(new java.awt.Font("Arial", 0, 20));
        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        txtAlerta.setFont(new java.awt.Font("Arial", 0, 20));
        txtAlerta.setForeground(new java.awt.Color(155, 155, 155));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtValorDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblValor, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNomeUsuario)))
                        .addContainerGap(50, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnConfirmar)
                        .addGap(26, 26, 26)
                        .addComponent(btnVoltar)
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtAlerta)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblValor, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtValorDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(txtAlerta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnVoltar)
                            .addComponent(btnConfirmar))
                        .addGap(43, 43, 43))))
        );
        pack();
    }

    private void txtSaldoActionPerformed(java.awt.event.ActionEvent evt) {}

    private void txtValorDepositoActionPerformed(java.awt.event.ActionEvent evt) {}

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {
        TelaPrincipal tela = new TelaPrincipal(); 
        tela.setVisible(true);
        dispose();
    }

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {
        int contador = 0; 
        if(txtSaldo.getText().length() > 0){ 
            txtSaldo.setVisible(true);
            contador++;
        } else 
            txtAlerta.setText("Informe um valor!");
        
        if(contador == 1){
            Sessao sessao = Sessao.getSessao();
             try {
            	 Class.forName("com.mysql.jdbc.Driver");
                 Connection con = null; 
                 PreparedStatement pstmt = null; 
                 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/caixaATM", "root", "teste");
                 Statement stm = con.createStatement(); 
                      
                 //Consulta ao banco de dados
                 String sql = "select * from conta where nomeCliente = '"+sessao.getNomeCliente()+"'";
                 ResultSet resul = stm.executeQuery(sql);
                 if (resul.next()) {
                	 Float saldoAtualUsuario = Float.valueOf(resul.getString("saldo"));
                     Float saldoDigitado = Float.valueOf(txtValorDeposito.getText());
                     Float calculoSaldoAtual = saldoAtualUsuario + saldoDigitado; 
                     if (saldoDigitado >= 50) {  
                    	 PreparedStatement pUsuario = con.prepareStatement("UPDATE conta SET saldo = ? WHERE idConta = ?");   
                         pUsuario.setFloat(1, calculoSaldoAtual);
                         pUsuario.setInt(2, sessao.getId());
                         pUsuario.execute();
                         pUsuario.close();
                          
                         PreparedStatement pRegistroDeposito = con.prepareStatement("INSERT INTO deposito (valorDeposito, id_conta) values (?, ?)");
                         pRegistroDeposito.setFloat(1, saldoDigitado);
                         pRegistroDeposito.setInt(2, sessao.getId());
                         pRegistroDeposito.execute();
                         pRegistroDeposito.close();
                          
                         JOptionPane.showMessageDialog(null, "Depósito efetuado!");
                         sessao.setSaldo(calculoSaldoAtual);
                         TelaPrincipal tela = new TelaPrincipal(); 
                         tela.setVisible(true);
                         dispose(); 
                         } else 
                        	 JOptionPane.showMessageDialog(null, "Valor mínimo de depósito: R$50,00");
                         } else {
                        	 JOptionPane.showMessageDialog(null, "Deposito não realizado");                       
                         }

                  } catch (ClassNotFoundException | SQLException | HeadlessException e) {
                      JOptionPane.showConfirmDialog(null, e);
                  }
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
            java.util.logging.Logger.getLogger(TelaDeposito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDeposito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDeposito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDeposito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDeposito().setVisible(true);
            }
        });
    }

    // Variáveis
    private javax.swing.JButton btnVoltar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JLabel lblValor;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JLabel txtAlerta;
    private javax.swing.JLabel txtNomeUsuario;
    private javax.swing.JTextField txtSaldo;
    private javax.swing.JTextField txtValorDeposito;
}
