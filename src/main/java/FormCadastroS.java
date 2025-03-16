//Lucas Carvalho Batista Canhadas Genvigir

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormCadastroS extends javax.swing.JFrame {

    private Servidor servidor;
    private static GerPessoas gerPessoas = new GerPessoas();

    private static FormCadastroS FormCadastroSunico;
    
    public FormCadastroS() {
        initComponents();
    }

    //Método Sigleton
    public static FormCadastroS getFormCadastroS(){
        if(FormCadastroSunico == null){
            FormCadastroSunico = new FormCadastroS();
        }
        
        return FormCadastroSunico;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ctCampeonato = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        lblSetor = new javax.swing.JLabel();
        ctCpf = new javax.swing.JTextField();
        lblCidade = new javax.swing.JLabel();
        ctNome = new javax.swing.JTextField();
        ctSetor = new javax.swing.JTextField();
        btLimpar = new javax.swing.JButton();
        ctCidade = new javax.swing.JTextField();
        btSair = new javax.swing.JButton();
        lblFuncao = new javax.swing.JLabel();
        btCadastrar = new javax.swing.JButton();
        ctFuncao = new javax.swing.JTextField();
        lblIdade = new javax.swing.JLabel();
        lblQuantMod = new javax.swing.JLabel();
        ctNomeMod = new javax.swing.JTextField();
        lblSexo = new javax.swing.JLabel();
        ctQuantMod = new javax.swing.JTextField();
        ctIdade = new javax.swing.JTextField();
        lblCampeonato = new javax.swing.JLabel();
        lblNomeMod = new javax.swing.JLabel();
        ctSexo = new javax.swing.JTextField();
        lblCpf = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblServidor = new javax.swing.JTable();
        btConsultar = new javax.swing.JButton();
        btAltera = new javax.swing.JButton();
        btExclui = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(" Cadastro Servidor");

        lblNome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNome.setText("NOME:");

        lblSetor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSetor.setText("SETOR");

        lblCidade.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCidade.setText("CIDADE:");

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        lblFuncao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblFuncao.setText("FUNÇÃO");

        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        lblIdade.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblIdade.setText("IDADE:");

        lblQuantMod.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblQuantMod.setText("NÚMERO DE MODALIDADES:");

        lblSexo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSexo.setText("SEXO:");

        lblCampeonato.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCampeonato.setText("NOME DO CAMPEONATO:");

        lblNomeMod.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNomeMod.setText("NOME DA MODALIDADE:");

        lblCpf.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCpf.setText("CPF:");

        tblServidor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "CPF", "NOME", "IDADE", "SEXO", "SETOR", "FUNCÃO", "CAMPEONATO", "CIDADE", "N° MODALIDADES", "NOME DA MODALIDADE"
            }
        ));
        jScrollPane1.setViewportView(tblServidor);

        btConsultar.setText("Consultar pelo Cpf");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        btAltera.setText("Alterar pelo CPf");
        btAltera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlteraActionPerformed(evt);
            }
        });

        btExclui.setText("Excluir pelo Cpf");
        btExclui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ctCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblNome)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ctNome, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblCpf)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ctCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblSexo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ctSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblIdade)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ctIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblFuncao)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ctFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblQuantMod)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ctQuantMod, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblNomeMod)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ctNomeMod, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblCampeonato)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ctCampeonato)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSetor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ctSetor, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btCadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btConsultar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btAltera)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btExclui))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1403, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btSair)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCpf)
                    .addComponent(ctCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ctNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIdade)
                    .addComponent(ctIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSexo)
                    .addComponent(ctSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSetor)
                    .addComponent(ctSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFuncao)
                    .addComponent(ctFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCampeonato)
                    .addComponent(ctCampeonato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCidade)
                    .addComponent(ctCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ctQuantMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQuantMod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeMod)
                    .addComponent(ctNomeMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrar)
                    .addComponent(btConsultar)
                    .addComponent(btAltera)
                    .addComponent(btExclui))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLimpar)
                    .addComponent(btSair))
                .addGap(60, 60, 60))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        CadastrarEx();
        listarTab();
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        consultar();
    }//GEN-LAST:event_btConsultarActionPerformed

    private void btAlteraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlteraActionPerformed
        alterar();
        listarTab();
    }//GEN-LAST:event_btAlteraActionPerformed

    private void btExcluiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluiActionPerformed
        excluir();
        listarTab();
    }//GEN-LAST:event_btExcluiActionPerformed

    public void excluir() {
    try {
        int cpf = Integer.parseInt(ctCpf.getText()); 
        servidor = (Servidor) gerPessoas.consPesCod(cpf);

        if (servidor != null) {
            ctCpf.setText(Integer.toString(servidor.getCpf()));
            ctNome.setText(servidor.getNome());
            ctIdade.setText(Integer.toString(servidor.getIdade()));
            ctSexo.setText(servidor.getSexo());
            ctSetor.setText(servidor.getSetor());
            ctFuncao.setText(servidor.getFuncao());
            ctCampeonato.setText(servidor.getEvento().getCampeonato());
            ctCidade.setText(servidor.getEvento().getCidade());
            ctQuantMod.setText(Integer.toString(servidor.getEvento().getModalidade().getQuantidade()));
            ctNomeMod.setText(servidor.getEvento().getModalidade().getNomeMod());

            int x = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir este Servidor", "Confirmação de Exclusão", JOptionPane.YES_NO_CANCEL_OPTION);
            if (x == 0) {
                gerPessoas.removerPessoaPorCpf(cpf);
                JOptionPane.showMessageDialog(null, "Servidor excluído com sucesso", "Exclusão de ExAluno", JOptionPane.INFORMATION_MESSAGE);
                limpar();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Não existe pessoa com este CPF", "CPF Inexistente", JOptionPane.WARNING_MESSAGE);
            limpar();
        }
    } catch (NumberFormatException nfe) {
        JOptionPane.showMessageDialog(null, "O CPF deve ser um número válido", "Erro de CPF", JOptionPane.ERROR_MESSAGE);
        ctCpf.setText("");
        ctCpf.requestFocus();
    }
}

    
    public void alterar(){
        try{
        int cpf = (Integer.parseInt(ctCpf.getText())); 
        servidor = gerPessoas.atualizaDadCpf(servidor);
        
        if(servidor != null){
            ctCpf.setText(Integer.toString(servidor.getCpf()));
            ctNome.setText(servidor.getNome());
            ctIdade.setText(Integer.toString(servidor.getIdade()));
            ctSexo.setText(servidor.getSexo());
            ctSetor.setText(servidor.getSetor());
            ctFuncao.setText(servidor.getFuncao());
            ctCampeonato.setText(servidor.getEvento().getCampeonato());
            ctCidade.setText(servidor.getEvento().getCidade());
            ctQuantMod.setText(Integer.toString(servidor.getEvento().getModalidade().getQuantidade()));
            ctNomeMod.setText(servidor.getEvento().getModalidade().getNomeMod());
            
            JOptionPane.showMessageDialog(null, "Dados de Servidor atualizados com sucesso", "Atualização de Dados", 1);
            limpar();
        }
        else{
            JOptionPane.showMessageDialog(null, "Não existe pessoa com este Cpf", "Cpf Inexistente", 0);
            limpar();
        }        
        }//fim try
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "O Cpf deve ser um número entre 1 e 1000", "Erro de Cpf", 0);
            ctCpf.setText("");
            ctCpf.requestFocus();
        }
        
    }
    
    public void listarTab(){
        DefaultTableModel modelo = (DefaultTableModel)tblServidor.getModel();
        int posLin = 0;
        
        modelo.setRowCount(posLin);
        
        for(Servidor servidor : gerPessoas.getBdS()){
            modelo.insertRow(posLin, new Object[]{servidor.getCpf(),servidor.getNome(), servidor.getIdade(), servidor.getSexo(), servidor.getSetor(), servidor.getFuncao(), servidor.getEvento().getCampeonato(), servidor.getEvento().getCidade(), servidor.getEvento().getModalidade().getQuantidade(), servidor.getEvento().getModalidade().getNomeMod()});
            posLin++;
        }
        
    }
    
    public void consultar(){
        servidor = new Servidor();
        try{
        int cpf = (Integer.parseInt(ctCpf.getText())); 
        servidor = (Servidor) gerPessoas.consPesCod(cpf);
        
        if(servidor != null){
            ctCpf.setText(Integer.toString(servidor.getCpf()));
            ctNome.setText(servidor.getNome());
            ctIdade.setText(Integer.toString(servidor.getIdade()));
            ctSexo.setText(servidor.getSexo());
            ctSetor.setText(servidor.getSetor());
            ctFuncao.setText(servidor.getFuncao());
            ctCampeonato.setText(servidor.getEvento().getCampeonato());
            ctCidade.setText(servidor.getEvento().getCidade());
            ctQuantMod.setText(Integer.toString(servidor.getEvento().getModalidade().getQuantidade()));
            ctNomeMod.setText(servidor.getEvento().getModalidade().getNomeMod());
            
            JOptionPane.showMessageDialog(null, "Confirme os dados do Servidor", "Confirmação de Dados", 1);
            limpar();
        }
        else{
            JOptionPane.showMessageDialog(null, "Não existe pessoa com este Cpf", "Cpf Inexistente", 0);
            limpar();
        }
        }//fim try
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "O Cpf deve ser um número entre 1 e 1000", "Erro de Cpf", 0);
            ctCpf.setText("");
            ctCpf.requestFocus();
        }
    }
    
    public void CadastrarEx(){
        servidor = new Servidor();
        
        try {
            servidor.setCpf(Integer.parseInt(ctCpf.getText()));
            servidor.setNome(ctNome.getText());
            servidor.setIdade(Integer.parseInt(ctIdade.getText()));
            servidor.setSexo(ctSexo.getText());
            servidor.setSetor(ctSetor.getText());
            servidor.setFuncao(ctFuncao.getText());
            servidor.evento.setCampeonato(ctCampeonato.getText());
            servidor.evento.setCidade(ctCidade.getText());
            servidor.evento.modalidade.setQuantidade(Integer.parseInt(ctQuantMod.getText()));
            servidor.evento.modalidade.setNomeMod(ctNomeMod.getText());
            
            servidor = gerPessoas.CadServidor(servidor);
            
            if(servidor != null){
                JOptionPane.showMessageDialog(null, "Servidor cadastrado com sucesso", "Cadastro Ok", 1);
                limpar();
            }
            else{
                JOptionPane.showMessageDialog(null, "Já existe pessoa com este Cpf", "Erro de Cadastro", 0);
                ctCpf.setText("");
                ctCpf.requestFocus();
            }
        } catch (CpfInvException s) {
            //Logger.getLogger(CadastroA.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "O Cpf deve ser um número entre 1 e 1000", "Erro de Cpf", 0);
            ctCpf.setText("");
            ctCpf.requestFocus();
        }catch (IdadeInvException s) {
            //Logger.getLogger(CadastroA.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "A Idade deve ser entre 17 e 70", "Erro de Idade", 0);
            ctIdade.setText("");
            ctIdade.requestFocus();
        }catch (QuantidadeInvException s) {
            //Logger.getLogger(CadastroA.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "A quantidade deve ser entre 1 e 5", "Erro na Quantidade de Modalidades", 0);
            ctQuantMod.setText("");
            ctQuantMod.requestFocus();
        }
    }
        
     public void sair(){
        int resp = JOptionPane.showConfirmDialog(null, "Deseja sair?", "Saida", JOptionPane.YES_NO_CANCEL_OPTION);
        if(resp == 0){
            this.dispose();
        }
    }
    
    public void limpar(){
        ctCpf.setText("");
        ctNome.setText("");
        ctIdade.setText("");
        ctSexo.setText("");
        ctSetor.setText("");
        ctFuncao.setText("");
        ctQuantMod.setText("");
        ctNomeMod.setText("");
        ctCampeonato.setText("");
        ctCidade.setText("");
        ctCpf.requestFocus();          
    }
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
            java.util.logging.Logger.getLogger(FormCadastroS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCadastroS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCadastroS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCadastroS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCadastroS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAltera;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btExclui;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSair;
    private javax.swing.JTextField ctCampeonato;
    private javax.swing.JTextField ctCidade;
    private javax.swing.JTextField ctCpf;
    private javax.swing.JTextField ctFuncao;
    private javax.swing.JTextField ctIdade;
    private javax.swing.JTextField ctNome;
    private javax.swing.JTextField ctNomeMod;
    private javax.swing.JTextField ctQuantMod;
    private javax.swing.JTextField ctSetor;
    private javax.swing.JTextField ctSexo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCampeonato;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblFuncao;
    private javax.swing.JLabel lblIdade;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNomeMod;
    private javax.swing.JLabel lblQuantMod;
    private javax.swing.JLabel lblSetor;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JTable tblServidor;
    // End of variables declaration//GEN-END:variables
}
