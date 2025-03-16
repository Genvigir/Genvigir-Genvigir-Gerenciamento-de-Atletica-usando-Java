//Lucas Carvalho Batista Canhadas Genvigir

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormCadastroA extends javax.swing.JFrame {
    
    private Aluno aluno;
    private static GerPessoas gerPessoas = new GerPessoas();
    
    private static FormCadastroA formCadastroAunico;

    private FormCadastroA() {
        initComponents();
    }
    
    //Método Sigleton
    public static FormCadastroA getFormCadastroA(){
        if(formCadastroAunico == null){
            formCadastroAunico = new FormCadastroA();
        }
        
        return formCadastroAunico;
    }
                 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCpf = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        ctCpf = new javax.swing.JTextField();
        ctNome = new javax.swing.JTextField();
        btLimpar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        btCadastrar = new javax.swing.JButton();
        lblIdade = new javax.swing.JLabel();
        ctIdade = new javax.swing.JTextField();
        lblSexo = new javax.swing.JLabel();
        ctSexo = new javax.swing.JTextField();
        lblRa = new javax.swing.JLabel();
        ctRa = new javax.swing.JTextField();
        lblCurso = new javax.swing.JLabel();
        ctCurso = new javax.swing.JTextField();
        lblQuantMod = new javax.swing.JLabel();
        ctQuantMod = new javax.swing.JTextField();
        lblNomeMod = new javax.swing.JLabel();
        ctNomeMod = new javax.swing.JTextField();
        lblCampeonato = new javax.swing.JLabel();
        ctCampeonato = new javax.swing.JTextField();
        lblCidade = new javax.swing.JLabel();
        ctCidade = new javax.swing.JTextField();
        btConsultar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAluno = new javax.swing.JTable();
        btAlterar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Aluno");

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

        lblSexo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSexo.setText("SEXO:");

        lblRa.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblRa.setText("RA:");

        lblCurso.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCurso.setText("CURSO:");

        lblQuantMod.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblQuantMod.setText("NÚMERO DE MODALIDADES:");

        lblNomeMod.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNomeMod.setText("NOME DA MODALIDADE:");

        lblCampeonato.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCampeonato.setText("NOME DO CAMPEONATO:");

        lblCidade.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCidade.setText("CIDADE:");

        btConsultar.setText("Consultar pelo Cpf");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        tblAluno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "CPF", "NOME", "IDADE", "SEXO", "RA", "CURSO", "CAMPEONATO", "CIDADE", "N° MODALIDADES", "NOME DA MODALIDADE"
            }
        ));
        jScrollPane1.setViewportView(tblAluno);

        btAlterar.setText("Alterar pelo Cpf");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        btExcluir.setText("Excluir pelo Cpf");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
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
                        .addComponent(btLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btSair))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ctCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lblNome)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ctNome, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lblCpf)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ctCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lblIdade)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ctIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lblCurso)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ctCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lblCampeonato)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ctCampeonato)
                            .addGap(365, 365, 365))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblQuantMod)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ctQuantMod, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(426, 426, 426))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(btCadastrar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btConsultar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btAlterar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btExcluir))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lblNomeMod)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ctNomeMod, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lblSexo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ctSexo))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lblRa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ctRa, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1403, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
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
                    .addComponent(lblRa)
                    .addComponent(ctRa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuantMod)
                    .addComponent(ctQuantMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeMod)
                    .addComponent(ctNomeMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrar)
                    .addComponent(btConsultar)
                    .addComponent(btAlterar)
                    .addComponent(btExcluir))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 60, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLimpar)
                    .addComponent(btSair))
                .addContainerGap())
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
        CadastrarAluno();
        listarTab();
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        consultar();
    }//GEN-LAST:event_btConsultarActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        alterar();
        listarTab();
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        excluir();
        listarTab();
    }//GEN-LAST:event_btExcluirActionPerformed

    public void excluir() {
    try {
        int cpf = Integer.parseInt(ctCpf.getText()); 
        aluno = (Aluno) gerPessoas.consPesCod(cpf);

        if (aluno != null) {
            ctCpf.setText(Integer.toString(aluno.getCpf()));
            ctNome.setText(aluno.getNome());
            ctIdade.setText(Integer.toString(aluno.getIdade()));
            ctSexo.setText(aluno.getSexo());
            ctRa.setText(Integer.toString(aluno.getRa()));
            ctCurso.setText(aluno.getCurso());
            ctCampeonato.setText(aluno.getEvento().getCampeonato());
            ctCidade.setText(aluno.getEvento().getCidade());
            ctQuantMod.setText(Integer.toString(aluno.getEvento().getModalidade().getQuantidade()));
            ctNomeMod.setText(aluno.getEvento().getModalidade().getNomeMod());

            int x = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir este Aluno", "Confirmação de Exclusão", JOptionPane.YES_NO_CANCEL_OPTION);
            if (x == 0) {
                gerPessoas.removerPessoaPorCpf(cpf);
                JOptionPane.showMessageDialog(null, "Aluno excluído com sucesso", "Exclusão de Aluno", JOptionPane.INFORMATION_MESSAGE);
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
        aluno = gerPessoas.atualizaDadCpf(aluno);
        
        if(aluno != null){
            ctCpf.setText(Integer.toString(aluno.getCpf()));
            ctNome.setText(aluno.getNome());
            ctIdade.setText(Integer.toString(aluno.getIdade()));
            ctSexo.setText(aluno.getSexo());
            ctRa.setText(Integer.toString(aluno.getRa()));
            ctCurso.setText(aluno.getCurso());
            ctCampeonato.setText(aluno.getEvento().getCampeonato());
            ctCidade.setText(aluno.getEvento().getCidade());
            ctQuantMod.setText(Integer.toString(aluno.getEvento().getModalidade().getQuantidade()));
            ctNomeMod.setText(aluno.getEvento().getModalidade().getNomeMod());
            
            JOptionPane.showMessageDialog(null, "Dados de Aluno atualizados com sucesso", "Atualização de Dados", 1);
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
        DefaultTableModel modelo = (DefaultTableModel)tblAluno.getModel();
        int posLin = 0;
        
        modelo.setRowCount(posLin);
        
        for(Aluno aluno : gerPessoas.getBdA()){
            modelo.insertRow(posLin, new Object[]{aluno.getCpf(),aluno.getNome(), aluno.getIdade(), aluno.getSexo(), aluno.getRa(), aluno.getCurso(), aluno.getEvento().getCampeonato(), aluno.getEvento().getCidade(), aluno.getEvento().getModalidade().getQuantidade(), aluno.getEvento().getModalidade().getNomeMod()});
            posLin++;
        }
        
    }
    
    public void consultar(){
        aluno = new Aluno();
        try{
        int cpf = (Integer.parseInt(ctCpf.getText())); 
        aluno = (Aluno) gerPessoas.consPesCod(cpf);
        
        if(aluno != null){
            ctCpf.setText(Integer.toString(aluno.getCpf()));
            ctNome.setText(aluno.getNome());
            ctIdade.setText(Integer.toString(aluno.getIdade()));
            ctSexo.setText(aluno.getSexo());
            ctRa.setText(Integer.toString(aluno.getRa()));
            ctCurso.setText(aluno.getCurso());
            ctCampeonato.setText(aluno.getEvento().getCampeonato());
            ctCidade.setText(aluno.getEvento().getCidade());
            ctQuantMod.setText(Integer.toString(aluno.getEvento().getModalidade().getQuantidade()));
            ctNomeMod.setText(aluno.getEvento().getModalidade().getNomeMod());
            
            JOptionPane.showMessageDialog(null, "Confirme os dados do Aluno", "Confirmação de Dados", 1);
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
    
    public void CadastrarAluno(){
        aluno = new Aluno();
        
        try {
            aluno.setCpf(Integer.parseInt(ctCpf.getText()));
            aluno.setNome(ctNome.getText());
            aluno.setIdade(Integer.parseInt(ctIdade.getText()));
            aluno.setSexo(ctSexo.getText());
            aluno.setRa(Integer.parseInt(ctRa.getText()));
            aluno.setCurso(ctCurso.getText());
            aluno.evento.setCampeonato(ctCampeonato.getText());
            aluno.evento.setCidade(ctCidade.getText());
            aluno.evento.modalidade.setQuantidade(Integer.parseInt(ctQuantMod.getText()));
            aluno.evento.modalidade.setNomeMod(ctNomeMod.getText());
            
            aluno = gerPessoas.CadAl(aluno);
            
            if(aluno != null){
                JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso", "Cadastro Ok", 1);
                limpar();
            }
            else{
                JOptionPane.showMessageDialog(null, "Já existe pessoa com este Cpf", "Erro de Cadastro", 0);
                ctCpf.setText("");
                ctCpf.requestFocus();
            }
        } catch (CpfInvException a) {
            //Logger.getLogger(FormCadastroA.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "O Cpf deve ser um número entre 1 e 1000", "Erro de Cpf", 0);
            ctCpf.setText("");
            ctCpf.requestFocus();
        }catch (IdadeInvException a) {
            //Logger.getLogger(FormCadastroA.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "A Idade deve ser entre 17 e 70", "Erro de Idade", 0);
            ctIdade.setText("");
            ctIdade.requestFocus();
        }catch (RAInvException raie) {
            //Logger.getLogger(FormCadastroA.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "O Ra deve ser entre 1800 e 2600", "Erro de Ra", 0);
            ctRa.setText("");
            ctRa.requestFocus();
        } catch (QuantidadeInvException a) {
            //Logger.getLogger(FormCadastroA.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "A quantidade deve ser entre 1 e 5", "Erro na Quantidade de Modalidades", 0);
            ctQuantMod.setText("");
            ctQuantMod.requestFocus();
        }catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "O Cpf deve ser um número entre 1 e 1000", "Erro de Cpf", 0);
            ctCpf.setText("");
            ctCpf.requestFocus();
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
        ctRa.setText("");
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
            java.util.logging.Logger.getLogger(FormCadastroA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCadastroA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCadastroA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCadastroA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCadastroA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSair;
    private javax.swing.JTextField ctCampeonato;
    private javax.swing.JTextField ctCidade;
    private javax.swing.JTextField ctCpf;
    private javax.swing.JTextField ctCurso;
    private javax.swing.JTextField ctIdade;
    private javax.swing.JTextField ctNome;
    private javax.swing.JTextField ctNomeMod;
    private javax.swing.JTextField ctQuantMod;
    private javax.swing.JTextField ctRa;
    private javax.swing.JTextField ctSexo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCampeonato;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblCurso;
    private javax.swing.JLabel lblIdade;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNomeMod;
    private javax.swing.JLabel lblQuantMod;
    private javax.swing.JLabel lblRa;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JTable tblAluno;
    // End of variables declaration//GEN-END:variables
}
