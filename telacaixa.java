package br.com.sistemafrentecaixa.view;

import javax.swing.UnsupportedLookAndFeelException;
 import java.text.DecimalFormat; 

public class TelaCaixa extends javax.swing.JFrame {

    double saldoTotal;
    /**
     * Graziela Guimarães
     */
    public TelaCaixa() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        valor = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jlabelSaldoInicial = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Valor da venda");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione uma opção", "Dinheiro", "Débito", "Crédito" }));

        jLabel3.setText("Forma de pagamento");

        jButton1.setText("Confirmar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jlabelSaldoInicial.setForeground(new java.awt.Color(153, 0, 0));
        jlabelSaldoInicial.setText("Saldo inicial");

        jButton2.setText("Sair");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jMenu1.setText("Fechar");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Fechamento de caixa");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(216, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jlabelSaldoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(valor, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(248, 248, 248))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(40, 40, 40)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlabelSaldoInicial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(789, 471));
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         

        /**
         * Botão confirmar venda*
         */
        //Saldo de abertura do caixa recebido da tela anterior
        double saldoInicial = (Double.parseDouble(jlabelSaldoInicial.getText()));

        //Taxa do cartão de crédito a vista
        double taxaCredito = 4.99 * 100;

        //Taxa do cartão de débito
        double taxaDebito = 1.99 * 100;

        //Valor do produto a venda (Digitado no campo valor da venda)
        double valorVenda = Double.parseDouble(valor.getText());

        double desconto = 0;
        double saldo = 0;
        
        
        
        
        
        
        
        
        if(jComboBox1.getSelectedItem().equals("Selecione uma opção")){
            jlabelSaldoInicial.setText("Selecione a forma de pagamento");
            
            valor.setText("");
        jComboBox1.setSelectedItem("Selecione uma opção");
        }

        //Opção do jComboBox - Débito
        if (jComboBox1.getSelectedItem().equals("Débito")) {

            desconto = taxaDebito / valorVenda;
            saldo = valorVenda - desconto;
            
           
 
            DecimalFormat df = new DecimalFormat("#,###.00");
            df.format(saldo);

            jlabelSaldoInicial.setText("Valor recebido na venda por débito: " + saldo);
            
            saldoTotal = saldoInicial + saldo;
            
            valor.setText("");
        jComboBox1.setSelectedItem("Selecione uma opção");
            

        }

        //Opção do jComboBox - Crédito  
        if (jComboBox1.getSelectedItem().equals("Crédito")) {

            desconto = taxaCredito / valorVenda;
            saldo = valorVenda - desconto;
            
            DecimalFormat df = new DecimalFormat("#,###.00");
            df.format(saldo);

            jlabelSaldoInicial.setText("Valor recebido na venda por crédito: " + saldo);
            
            saldoTotal = saldoInicial + saldo;
            
            valor.setText("");
        jComboBox1.setSelectedItem("Selecione uma opção");
           

        }

        //Opção do jComboBox - Dinheiro
        if (jComboBox1.getSelectedItem().equals("Dinheiro")) {

            desconto = 0.0;
            saldo = valorVenda - desconto;
            
            DecimalFormat df = new DecimalFormat("#,###.00");
            df.format(saldo);

            jlabelSaldoInicial.setText("Valor recebido na venda por dinheiro: " + saldo);
            
            saldoTotal = saldoInicial + saldo;
            
            valor.setText("");
        jComboBox1.setSelectedItem("Selecione uma opção");
           

        }

    

        
    }                                        

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        
        
        
        
    }                                      

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        
       
        //Fechar caixa
        valor.setText("");
        jComboBox1.setSelectedItem("Selecione uma opção");
        jlabelSaldoInicial.setText("Total: R$" + saldoTotal);
    }                                          

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       
        System.exit(0);
    }                                        

   
    public static void main(String args[]) throws UnsupportedLookAndFeelException {
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCaixa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    public static javax.swing.JLabel jlabelSaldoInicial;
    private javax.swing.JTextField valor;
    // End of variables declaration                   
}
