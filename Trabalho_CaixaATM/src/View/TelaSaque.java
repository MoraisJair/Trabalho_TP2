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
import View.TelaPrincipal;
import View.TelaSaque;

public class TelaSaque extends javax.swing.JFrame{
    public TelaSaque() {
        initComponents();
        
        Sessao sessao = Sessao.getSessao(); 
        String nomeUsuario = sessao.getNomeCliente();
        Float saldoUsuario = sessao.getSaldo();
        
        txtSaldo.setText(String.valueOf(saldoUsuario));
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        lblValor = new javax.swing.JLabel();
        txtValorSaque = new javax.swing.JTextField();
        btnSair = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();
        lblAlerta = new javax.swing.JLabel();
        txtSaldo = new javax.swing.JTextField();
        lblSaldo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblValor.setFont(new java.awt.Font("Arial", 0, 34));
        lblValor.setText("Valor à sacar: ");

        txtValorSaque.setFont(new java.awt.Font("Arial", 0, 34));
        txtValorSaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorSaqueActionPerformed(evt);
            }
        });

        btnSair.setFont(new java.awt.Font("Arial", 0, 20));
        btnSair.setText("Voltar");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnConfirmar.setFont(new java.awt.Font("Arial", 0, 20));
        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        lblAlerta.setForeground(new java.awt.Color(255, 0, 51));

        txtSaldo.setEditable(false);
        txtSaldo.setFont(new java.awt.Font("Arial", 0, 20));
        txtSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSaldoActionPerformed(evt);
            }
        });

        lblSaldo.setFont(new java.awt.Font("Arial", 0, 34));
        lblSaldo.setText("Saldo: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblValor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAlerta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtValorSaque, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnConfirmar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSair))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(lblAlerta, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValor)
                    .addComponent(txtValorSaque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSair)
                    .addComponent(btnConfirmar))
                .addContainerGap())
        );

        pack();
    }

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {
    	TelaPrincipal tela = new TelaPrincipal(); 
        tela.setVisible(true);
        dispose();
    }

    private void txtValorSaqueActionPerformed(java.awt.event.ActionEvent evt) {}

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {
        int contador = 0 ; 
        if (txtValorSaque.getText().length() > 0) {
        txtValorSaque.setVisible(true);
        contador++;
    } else {
      lblAlerta.setText("Campos obrigatorios");
    }
     
        if(contador == 1) {
            Sessao sessao = Sessao.getSessao();
            try {
            	Class.forName("com.mysql.jdbc.Driver");
                Connection con = null; 
                PreparedStatement pstmt = null; 
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/caixaATM", "root", "teste");
                Statement stm = con.createStatement(); 
                String sql = "select * from conta where nomeCliente = '"+sessao.getNomeCliente()+"'";
                ResultSet resul = stm.executeQuery(sql);
                      
                if (resul.next()) {
                	Float saldoAtualUsuario = Float.valueOf(resul.getString("saldo"));
                    Float valorSaque = Float.valueOf(txtValorSaque.getText());
                    Float calculoSaldoAtual = saldoAtualUsuario - valorSaque; 
                  
                    if(calculoSaldoAtual >= 0){ 
                    	PreparedStatement pUsuario = con.prepareStatement("UPDATE conta SET saldo = ? WHERE idConta = ?");   
                        pUsuario.setFloat(1, calculoSaldoAtual);
                        pUsuario.setInt(2, sessao.getId());
                        pUsuario.execute();
                        pUsuario.close();
                          
                        PreparedStatement pRegistroSaque = con.prepareStatement("INSERT INTO saque (valorSaque, id_conta) values (?, ?)");
                        pRegistroSaque.setFloat(1, valorSaque);
                        pRegistroSaque.setInt(2, sessao.getId());
                        pRegistroSaque.execute();
                        pRegistroSaque.close();
                        JOptionPane.showMessageDialog(null, "Saque efetuado!");
                          
                        sessao.setSaldo(calculoSaldoAtual);
                        TelaPrincipal tela = new TelaPrincipal();
                        tela.setVisible(true);
                        dispose(); 
                        } else 
                        	JOptionPane.showMessageDialog(null, "Saldo insuficiente");
                } else {
                	JOptionPane.showMessageDialog(null, "Saque não efetuado");                       
                }
            } 
            catch (ClassNotFoundException | SQLException | HeadlessException e) {
            	JOptionPane.showConfirmDialog(null, e);
            }
        }
        else {
        	lblAlerta.setText("Campos obrigatorios");
        }
    }
    
    private void txtSaldoActionPerformed(java.awt.event.ActionEvent evt) {}

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaSaque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaSaque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaSaque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaSaque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaSaque().setVisible(true);
            }
        });
    }

    // Variáveis
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel lblAlerta;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JLabel lblValor;
    private javax.swing.JTextField txtSaldo;
    private javax.swing.JTextField txtValorSaque;
}
