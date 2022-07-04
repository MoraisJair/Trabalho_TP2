package View;

import SingletonSession.Sessao;
import View.TelaDeposito;
import View.TelaLogin;
import View.TelaPrincipal;
import View.TelaSaque;
import View.TelaTransferencia;

public class TelaPrincipal extends javax.swing.JFrame{

	public TelaPrincipal() {
        initComponents();
     
        Sessao sessao = Sessao.getSessao(); 
        String nomeUsuario = sessao.getNomeCliente();
        Float saldoUsuario = sessao.getSaldo();
        
        lblNome.setText(nomeUsuario);
        txtSaldo.setText(String.valueOf(saldoUsuario));
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        lblNome = new javax.swing.JLabel();
        lblSaldoAtual = new javax.swing.JLabel();
        lblApresentacao = new javax.swing.JLabel();
        txtSaldo = new javax.swing.JTextField();
        btnSaque = new javax.swing.JButton();
        btnDepositar = new javax.swing.JButton();
    	btnTransferir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNome.setFont(new java.awt.Font("Noto Sans Light", 0, 30));
        lblSaldoAtual.setFont(new java.awt.Font("Arial", 0, 25));
        lblSaldoAtual.setText("SALDO ATUAL ");
        lblApresentacao.setFont(new java.awt.Font("Arial", 0, 30));
        lblApresentacao.setText("AUTOATENDIMENTO: ");

        txtSaldo.setFont(new java.awt.Font("Arial", 0, 25));
        txtSaldo.setEditable(false);
        txtSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSaldoActionPerformed(evt);
            }
        });
 
        btnSaque.setFont(new java.awt.Font("Arial", 0, 20));
        btnSaque.setText("Sacar dinheiro");
        btnSaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaqueActionPerformed(evt);
            }
        });

        btnDepositar.setFont(new java.awt.Font("Arial", 0, 20));
        btnDepositar.setText("Depósitar");
        btnDepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositarActionPerformed(evt);
            }
        });
        
        btnTransferir.setFont(new java.awt.Font("Arial", 0, 20));
        btnTransferir.setText("Transferir para outra conta");
        btnTransferir.setActionCommand("Transferir");
        btnTransferir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferirActionPerformed(evt);
            }
        });

        btnSair.setFont(new java.awt.Font("Arial", 0, 20));
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSair))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblApresentacao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNome)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnSaque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnTransferir, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                    .addComponent(btnDepositar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
                                .addComponent(lblSaldoAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 237, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(btnSair)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblSaldoAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblApresentacao)
                            .addComponent(lblNome))
                        .addGap(20, 20, 20)
                        .addComponent(btnTransferir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSaque, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDepositar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        setSize(new java.awt.Dimension(750, 450));
        setLocationRelativeTo(null);
    }

    private void btnTransferirActionPerformed(java.awt.event.ActionEvent evt) {
        TelaTransferencia tela = new TelaTransferencia(); 
        tela.setVisible(true);
        dispose(); 
    }

    private void btnSaqueActionPerformed(java.awt.event.ActionEvent evt) {
        TelaSaque tela = new TelaSaque(); 
        tela.setVisible(true);
        dispose();
    }

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {
        TelaLogin login = new TelaLogin();
        login.setVisible(true);
        dispose(); 
    }

    private void txtSaldoActionPerformed(java.awt.event.ActionEvent evt) {}

    private void btnDepositarActionPerformed(java.awt.event.ActionEvent evt) {
        TelaDeposito deposito = new TelaDeposito(); 
        deposito.setVisible(true);
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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variáveis
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSaldoAtual;
    private javax.swing.JLabel lblApresentacao;
    private javax.swing.JTextField txtSaldo;
    private javax.swing.JButton btnSaque;
    private javax.swing.JButton btnDepositar;
    private javax.swing.JButton btnTransferir;
    private javax.swing.JButton btnSair;

    void setLblNome(String sqlNome) {
        throw new UnsupportedOperationException("Não suportado.");
    }

    void setTxtSaldo(Float sqlSaldo) {
        throw new UnsupportedOperationException("Não suportado.");
    }
}
