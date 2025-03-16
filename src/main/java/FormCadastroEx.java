//Lucas Carvalho Batista Canhadas Genvigir

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormCadastroEx extends javax.swing.JFrame {

    private ExAluno exAluno;
    private static GerPessoas gerPessoas = new GerPessoas();
    
    private static FormCadastroEx formCadastroExunico;

    public FormCadastroEx() {
        initComponents();
    }
    
     //Método Sigleton
    public static FormCadastroEx getFormCadastroEx(){
        if(formCadastroExunico == null){
            formCadastroExunico = new FormCadastroEx();
        }
        
        return formCadastroExunico;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSexo = new javax.swing.JLabel();
        lblCampeonato = new javax.swing.JLabel();
        ctSexo = new javax.swing.JTextField();
        ctCampeonato = new javax.swing.JTextField();
        lblAnoForm = new javax.swing.JLabel();
        lblCidade = new javax.swing.JLabel();
        ctAnoForm = new javax.swing.JTextField();
        ctCidade = new javax.swing.JTextField();
        lblCurso = new javax.swing.JLabel();
        ctCurso = new javax.swing.JTextField();
        lblQuantMod = new javax.swing.JLabel();
        ctQuantMod = new javax.swing.JTextField();
        lblNomeMod = new javax.swing.JLabel();
        lblCpf = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        ctCpf = new javax.swing.JTextField();
        ctNome = new javax.swing.JTextField();
        btLimpar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        btCadastrar = new javax.swing.JButton();
        lblIdade = new javax.swing.JLabel();
        ctNomeMod = new javax.swing.JTextField();
        ctIdade = new javax.swing.JTextField();
        btConsulta = new javax.swing.JButton();
        btAltera = new javax.swing.JButton();
        btExclui = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblExAluno = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Ex Aluno");

        lblSexo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSexo.setText("SEXO:");

        lblCampeonato.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCampeonato.setText("NOME DO CAMPEONATO:");

        lblAnoForm.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblAnoForm.setText("ANO DE FORMATURA:");

        lblCidade.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCidade.setText("CIDADE:");

        lblCurso.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCurso.setText("CURSO:");

        lblQuantMod.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblQuantMod.setText("NÚMERO DE MODALIDADES:");

        lblNomeMod.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNomeMod.setText("NOME DA MODALIDADE:");

        lblCpf.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCpf.setText("CPF:");

        lblNome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNome.setText("NOME:");

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

        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        lblIdade.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblIdade.setText("IDADE:");

        btConsulta.setText("Consultar pelo Cpf");
        btConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultaActionPerformed(evt);
            }
        });

        btAltera.setText("Alterar pelo Cpf");
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

        tblExAluno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "CPF", "NOME", "IDADE", "SEXO", "ANO DE FORMATURA", "CURSO", "CAMPEONATO", "CIDADE", "N° MODALIDADES", "NOME DA MODALIDADE"
            }
        ));
        jScrollPane1.setViewportView(tblExAluno);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1403, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btCadastrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btConsulta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btAltera)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btExclui))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ctCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                .addComponent(lblCurso)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ctCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                .addComponent(ctCampeonato, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAnoForm)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ctAnoForm, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSair)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
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
                    .addComponent(lblAnoForm)
                    .addComponent(ctAnoForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCurso)
                    .addComponent(ctCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrar)
                    .addComponent(btConsulta)
                    .addComponent(btAltera)
                    .addComponent(btExclui))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLimpar)
                    .addComponent(btSair))
                .addGap(16, 16, 16))
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

    private void btConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultaActionPerformed
        consultar();
    }//GEN-LAST:event_btConsultaActionPerformed

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
        exAluno = (ExAluno) gerPessoas.consPesCod(cpf);

        if (exAluno != null) {
            ctCpf.setText(Integer.toString(exAluno.getCpf()));
            ctNome.setText(exAluno.getNome());
            ctIdade.setText(Integer.toString(exAluno.getIdade()));
            ctSexo.setText(exAluno.getSexo());
            ctAnoForm.setText(Integer.toString(exAluno.getAnoForm()));
            ctCurso.setText(exAluno.getCurso());
            ctCampeonato.setText(exAluno.getEvento().getCampeonato());
            ctCidade.setText(exAluno.getEvento().getCidade());
            ctQuantMod.setText(Integer.toString(exAluno.getEvento().getModalidade().getQuantidade()));
            ctNomeMod.setText(exAluno.getEvento().getModalidade().getNomeMod());

            int x = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir este ExAluno", "Confirmação de Exclusão", JOptionPane.YES_NO_CANCEL_OPTION);
            if (x == 0) {
                gerPessoas.removerPessoaPorCpf(cpf);
                JOptionPane.showMessageDialog(null, "ExAluno excluído com sucesso", "Exclusão de ExAluno", JOptionPane.INFORMATION_MESSAGE);
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
        exAluno = gerPessoas.atualizaDadCpf(exAluno);
        
        if(exAluno != null){
            ctCpf.setText(Integer.toString(exAluno.getCpf()));
            ctNome.setText(exAluno.getNome());
            ctIdade.setText(Integer.toString(exAluno.getIdade()));
            ctSexo.setText(exAluno.getSexo());
            ctAnoForm.setText(Integer.toString(exAluno.getAnoForm()));
            ctCurso.setText(exAluno.getCurso());
            ctCampeonato.setText(exAluno.getEvento().getCampeonato());
            ctCidade.setText(exAluno.getEvento().getCidade());
            ctQuantMod.setText(Integer.toString(exAluno.getEvento().getModalidade().getQuantidade()));
            ctNomeMod.setText(exAluno.getEvento().getModalidade().getNomeMod());
            
            JOptionPane.showMessageDialog(null, "Dados de ExAluno atualizados com sucesso", "Atualização de Dados", 1);
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
        DefaultTableModel modelo = (DefaultTableModel)tblExAluno.getModel();
        int posLin = 0;
        
        modelo.setRowCount(posLin);
        
        for(ExAluno exAluno : gerPessoas.getBdEx()){
            modelo.insertRow(posLin, new Object[]{exAluno.getCpf(),exAluno.getNome(), exAluno.getIdade(), exAluno.getSexo(), exAluno.getAnoForm(), exAluno.getCurso(), exAluno.getEvento().getCampeonato(), exAluno.getEvento().getCidade(), exAluno.getEvento().getModalidade().getQuantidade(), exAluno.getEvento().getModalidade().getNomeMod()});
            posLin++;
        }
        
    }
    
    public void consultar(){
        exAluno = new ExAluno();
        try{
        int cpf = (Integer.parseInt(ctCpf.getText())); 
        exAluno = (ExAluno) gerPessoas.consPesCod(cpf);
        
        if(exAluno != null){
            ctCpf.setText(Integer.toString(exAluno.getCpf()));
            ctNome.setText(exAluno.getNome());
            ctIdade.setText(Integer.toString(exAluno.getIdade()));
            ctSexo.setText(exAluno.getSexo());
            ctAnoForm.setText(Integer.toString(exAluno.getAnoForm()));
            ctCurso.setText(exAluno.getCurso());
            ctCampeonato.setText(exAluno.getEvento().getCampeonato());
            ctCidade.setText(exAluno.getEvento().getCidade());
            ctQuantMod.setText(Integer.toString(exAluno.getEvento().getModalidade().getQuantidade()));
            ctNomeMod.setText(exAluno.getEvento().getModalidade().getNomeMod());
            
            JOptionPane.showMessageDialog(null, "Confirme os dados do ExAluno", "Confirmação de Dados", 1);
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
        exAluno = new ExAluno();
        
        try {
            exAluno.setCpf(Integer.parseInt(ctCpf.getText()));
            exAluno.setNome(ctNome.getText());
            exAluno.setIdade(Integer.parseInt(ctIdade.getText()));
            exAluno.setSexo(ctSexo.getText());
            exAluno.setCurso(ctCurso.getText());
            exAluno.setAnoForm(Integer.parseInt(ctAnoForm.getText()));
            exAluno.evento.setCampeonato(ctCampeonato.getText());
            exAluno.evento.setCidade(ctCidade.getText());
            exAluno.evento.modalidade.setQuantidade(Integer.parseInt(ctQuantMod.getText()));
            exAluno.evento.modalidade.setNomeMod(ctNomeMod.getText());
            
            exAluno = gerPessoas.CadExAluno(exAluno);
            
            if(exAluno != null){
                JOptionPane.showMessageDialog(null, "ExAluno cadastrado com sucesso", "Cadastro Ok", 1);
                limpar();
            }
            else{
                JOptionPane.showMessageDialog(null, "Já existe pessoa com este Cpf", "Erro de Cadastro", 0);
                ctCpf.setText("");
                ctCpf.requestFocus();
            }
        } catch (CpfInvException ex) {
            //Logger.getLogger(CadastroA.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "O Cpf deve ser um número entre 1 e 1000", "Erro de Cpf", 0);
            ctCpf.setText("");
            ctCpf.requestFocus();
        }catch (IdadeInvException ex) {
            //Logger.getLogger(CadastroA.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "A Idade deve ser entre 17 e 70", "Erro de Idade", 0);
            ctIdade.setText("");
            ctIdade.requestFocus();
        }catch (QuantidadeInvException ex) {
            //Logger.getLogger(CadastroA.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "A quantidade deve ser entre 1 e 5", "Erro na Quantidade de Modalidades", 0);
            ctQuantMod.setText("");
            ctQuantMod.requestFocus();
        } catch (AnoFormInvException ex) {
            //Logger.getLogger(FormCadastroEx.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "O ano deve ser entre 1990 e 2024", "Erro no Ano de Formatura", 0);
            ctAnoForm.setText("");
            ctAnoForm.requestFocus();
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
        ctAnoForm.setText("");
        ctCurso.setText("");
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
            java.util.logging.Logger.getLogger(FormCadastroEx.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCadastroEx.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCadastroEx.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCadastroEx.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCadastroEx().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAltera;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btConsulta;
    private javax.swing.JButton btExclui;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSair;
    private javax.swing.JTextField ctAnoForm;
    private javax.swing.JTextField ctCampeonato;
    private javax.swing.JTextField ctCidade;
    private javax.swing.JTextField ctCpf;
    private javax.swing.JTextField ctCurso;
    private javax.swing.JTextField ctIdade;
    private javax.swing.JTextField ctNome;
    private javax.swing.JTextField ctNomeMod;
    private javax.swing.JTextField ctQuantMod;
    private javax.swing.JTextField ctSexo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAnoForm;
    private javax.swing.JLabel lblCampeonato;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblCurso;
    private javax.swing.JLabel lblIdade;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNomeMod;
    private javax.swing.JLabel lblQuantMod;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JTable tblExAluno;
    // End of variables declaration//GEN-END:variables
}
