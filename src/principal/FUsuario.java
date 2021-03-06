/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import DAO.ctrlUsuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import modelo.Usuario;

/**
 *
 * @author semuso
 */
public class FUsuario extends javax.swing.JFrame {
    ctrlUsuario ctrlU = new ctrlUsuario();
    Usuario u = new Usuario();
    
    public void carregarCb(JComboBox cb) {
        ResultSet rs;
        rs=ctrlU.encontrarTipos(); 
        try { 
            while(rs.next()){ 
                String tipo = rs.getString(1);                
                cb.addItem(tipo); 
                cb.updateUI(); 

            } 
        } catch (SQLException ex) { 
                Logger.getLogger(FMontagem.class.getName()).log(Level.SEVERE, null, ex); 
        }
    }
    
    public void resetar(){
        edtNome.setText("");
        edtLogin.setText("");
        edtSenha.setText("");
        edtCSenha.setText("");
        edtNome.setEnabled(true);
        edtLogin.setEnabled(true);
        edtSenha.setEnabled(true);
        edtCSenha.setEnabled(true);
        cbTipo.setSelectedIndex(0);
    }
    

    /**
     * Creates new form FUsuario
     */
    public FUsuario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        edtNome = new javax.swing.JTextField();
        edtLogin = new javax.swing.JTextField();
        edtSenha = new javax.swing.JPasswordField();
        edtCSenha = new javax.swing.JPasswordField();
        btnCriar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        cbTipo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Criação de Usuários");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Nome");

        jLabel2.setText("Login");

        jLabel3.setText("Senha");

        jLabel4.setText("Confirma Senha");

        edtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtSenhaActionPerformed(evt);
            }
        });

        btnCriar.setText("Criar");
        btnCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarActionPerformed(evt);
            }
        });

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        jButton1.setText("Limpar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o Tipo Acesso" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edtNome)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(edtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(edtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(edtCSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(cbTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnCriar)
                .addGap(18, 18, 18)
                .addComponent(btnConsultar)
                .addGap(18, 18, 18)
                .addComponent(btnAlterar)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(edtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(edtCSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(edtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCriar)
                    .addComponent(btnConsultar)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void edtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtSenhaActionPerformed

    private void btnCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarActionPerformed
        if ("".equals(edtNome.getText()) || "".equals(edtLogin.getText()) || "".equals(String.valueOf(edtSenha.getPassword())) || "".equals(String.valueOf(edtCSenha.getPassword())))
            JOptionPane.showOptionDialog(null,"Por favor, preencha todos os campos","Campo Vazio",JOptionPane.DEFAULT_OPTION,
                JOptionPane.WARNING_MESSAGE,null, null, null);
        else{
            if (!String.valueOf(edtSenha.getPassword()).equals(String.valueOf(edtCSenha.getPassword())))
                JOptionPane.showOptionDialog(null,"Campo senha diferente de confirma senha","Confirma Senha",JOptionPane.DEFAULT_OPTION,
                JOptionPane.WARNING_MESSAGE,null, null, null);
            else {
                u.setNome(edtNome.getText());
                u.setLogin(edtLogin.getText());
                u.setSenha(String.valueOf(edtSenha.getPassword()));
                u.setTipo(ctrlU.encontrarCodigo((String) cbTipo.getSelectedItem()));
                int erro=ctrlU.criarUsuario(u);
                if(erro==0){
                    JOptionPane.showMessageDialog(null,"Criação concluída com êxito!");
                    resetar();
                }else
                    JOptionPane.showMessageDialog(null,"Falha na criação !");
            }
        } 
        
    }//GEN-LAST:event_btnCriarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        resetar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        String nome = edtNome.getText();
        String login = edtLogin.getText();
        int rc=ctrlU.consultar(login, nome, u);
        if (rc!=0){
            resetar();
             JOptionPane.showMessageDialog(null,"Usuário não encontrado(a)");
        }
        else {
           edtNome.setText(u.getNome());
           edtLogin.setText(u.getLogin());
           cbTipo.setSelectedItem(ctrlU.encontrarTipo(u.getTipo()));
           edtLogin.setEnabled(false);
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        carregarCb(cbTipo);
    }//GEN-LAST:event_formWindowOpened

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if ("".equals(edtNome.getText()) || "".equals(edtLogin.getText()) || "".equals(String.valueOf(edtSenha.getPassword())) || "".equals(String.valueOf(edtCSenha.getPassword())))
            JOptionPane.showOptionDialog(null,"Por favor, preencha todos os campos","Campo Vazio",JOptionPane.DEFAULT_OPTION,
                JOptionPane.WARNING_MESSAGE,null, null, null);
        else{
            if (!String.valueOf(edtSenha.getPassword()).equals(String.valueOf(edtCSenha.getPassword())))
                JOptionPane.showOptionDialog(null,"Campo senha diferente de confirma senha","Confirma Senha",JOptionPane.DEFAULT_OPTION,
                JOptionPane.WARNING_MESSAGE,null, null, null);
            else {
                u.setNome(edtNome.getText());
                u.setLogin(edtLogin.getText());
                u.setSenha(String.valueOf(edtSenha.getPassword()));
                u.setTipo(ctrlU.encontrarCodigo((String) cbTipo.getSelectedItem()));
                int resp=JOptionPane.showConfirmDialog(null,"Deseja realmente alterar os dados do login "+u.getLogin()+" ?");
                if(resp==JOptionPane.YES_OPTION){
                int erro=ctrlU.alterarUsuario(u);
                if(erro==0){
                    JOptionPane.showMessageDialog(null,"Alteração concluída com êxito");
                    resetar();
                }else
                    JOptionPane.showMessageDialog(null,"Falha na alteração");
                }
            }
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        String nome = edtNome.getText();
        String login = edtLogin.getText();
        int rc=ctrlU.consultar(login, nome, u);
        if (rc!=0){
            resetar();
             JOptionPane.showMessageDialog(null,"Usuário não encontrado(a)");
        }
        else {
           int resp=JOptionPane.showConfirmDialog(null,"Deseja resalmente excluir o login "+u.getLogin()+" ?");
           if (resp==JOptionPane.YES_OPTION){
               int erro=ctrlU.excluirUsuario(u.getLogin());
               if(erro==0){
                   JOptionPane.showMessageDialog(null,"Exclusão concluída com êxito");
                   resetar();
                }else
                  JOptionPane.showMessageDialog(null,"Falha na exclusão"); 
           }
        }        
    }//GEN-LAST:event_btnExcluirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(FUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FUsuario fu = new FUsuario();
                fu.setLocationRelativeTo(null);
                fu.setResizable(false);
                fu.setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnCriar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JComboBox<String> cbTipo;
    private javax.swing.JPasswordField edtCSenha;
    private javax.swing.JTextField edtLogin;
    private javax.swing.JTextField edtNome;
    private javax.swing.JPasswordField edtSenha;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
