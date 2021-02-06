package Visao;

import Classes.Dados.Dados;
import Classes.Dados.DadosBD;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Horario_Qtd extends javax.swing.JFrame {
    

    private static int qtdeBilhetes;
    private static int totBilhetes;
    private static int dispBilhete;
    private static int sobra;
    private String testePega;
    private static Horario_Qtd TelaHorario = new Horario_Qtd();
    private static String HrEmbarque;
    

    private Horario_Qtd() {
        initComponents();
        ModeloTabela();

    }

    
    
// GETTTERS -------------------------------------------------------
    
    public static int getQtdeBilhetes() {
        return qtdeBilhetes;
    }

    public static Horario_Qtd getTelaHorario() {
        return TelaHorario;
    }

    public static String getHrEmbarque() {
        return HrEmbarque;
    }
    
    
// GETTTERS -------------------------------------------------------
    
//FUNÇÕES ----------------------------------------------------------
    
    public static void DefaultSpinner(){

        Qtd.setValue(1);

    }

    public static void LimpaHrSelecionada(){

      MostraSelecionado.setText("");

    }

    public static void ModeloTabela(){
        DefaultTableModel modelo = (DefaultTableModel) jTableHrDisponivel.getModel();
        jTableHrDisponivel.setRowSorter(new TableRowSorter(modelo));
  
  }
    
    public static void BuscHrDisp_Ent(String Emb) {

          DefaultTableModel modelo = (DefaultTableModel) jTableHrDisponivel.getModel();
          modelo.setNumRows(0);
          DadosBD dBD = new DadosBD();

          for (Dados d : dBD.HDiposnivelEnt(Emb)) {

              modelo.addRow(new Object[]{
                  d.getHEmbarque(),



              });



          }

       }
    
    public static void BuscHrDisp_Sai(String Emb) {

          DefaultTableModel modelo = (DefaultTableModel) jTableHrDisponivel.getModel();
          modelo.setNumRows(0);
          DadosBD dBD = new DadosBD();

          for (Dados d : dBD.HDiposnivelSai(Emb)) {

              modelo.addRow(new Object[]{
                  d.getHEmbarque(),



              });



          }

       }

    private static void buscLota(String Emb,String hora, String Data){
       Dados d = new Dados();
       DadosBD dbd = new DadosBD();
       
       dbd.lotacao(Emb, hora, Data);
       
       totBilhetes=Dados.getTotBilhetes();
   
   }
    
    private static String getData(){
        
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date();
        return dateFormat.format(date);
    }
  
//FUNÇÕES ----------------------------------------------------------
  
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bntVoltar = new javax.swing.JButton();
        bntCancelar = new javax.swing.JButton();
        bntAvancar = new javax.swing.JButton();
        Qtd = new javax.swing.JSpinner();
        Horario = new javax.swing.JLabel();
        descQtd = new javax.swing.JLabel();
        PainelBanner = new javax.swing.JPanel();
        LabelIcone = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableHrDisponivel = new javax.swing.JTable();
        TitleDispo = new javax.swing.JLabel();
        MostraSelecionado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bntVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Retornar.png"))); // NOI18N
        bntVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntVoltarActionPerformed(evt);
            }
        });

        bntCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Botao Cancelar.png"))); // NOI18N
        bntCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCancelarActionPerformed(evt);
            }
        });

        bntAvancar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Avançar.png"))); // NOI18N
        bntAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntAvancarActionPerformed(evt);
            }
        });

        Qtd.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        Qtd.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));
        Qtd.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Qtd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                QtdKeyTyped(evt);
            }
        });

        Horario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Horario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Horario.setText("Horários Disponíveis:");
        Horario.setToolTipText("");
        Horario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        descQtd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        descQtd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        descQtd.setText("Quantidade de Bilhetes a Serem Comprados:");
        descQtd.setToolTipText("");
        descQtd.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        descQtd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        PainelBanner.setBackground(new java.awt.Color(51, 153, 255));

        LabelIcone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Ticket.png"))); // NOI18N

        javax.swing.GroupLayout PainelBannerLayout = new javax.swing.GroupLayout(PainelBanner);
        PainelBanner.setLayout(PainelBannerLayout);
        PainelBannerLayout.setHorizontalGroup(
            PainelBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelBannerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LabelIcone, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PainelBannerLayout.setVerticalGroup(
            PainelBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelIcone, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );

        jTableHrDisponivel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTableHrDisponivel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DISPONIBILIDADE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableHrDisponivel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableHrDisponivelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableHrDisponivel);

        TitleDispo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleDispo.setText("Horario Selecionado:");

        MostraSelecionado.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelBanner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bntVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                                .addComponent(bntCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(MostraSelecionado, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TitleDispo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bntAvancar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Qtd, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Horario, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(descQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(PainelBanner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Horario, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(Qtd, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(TitleDispo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(MostraSelecionado, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bntAvancar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(bntVoltar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bntVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntVoltarActionPerformed

        //Desembarque.ReativaBnt();
        Desembarque.getBntgEstacoes().clearSelection();
        
        Desembarque.getTelaDesembarque().setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_bntVoltarActionPerformed

    private void bntAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAvancarActionPerformed

        HrEmbarque = MostraSelecionado.getText();
        qtdeBilhetes = Integer.parseInt(Qtd.getValue().toString());
        
        buscLota(Embarque.getEstcaoEmbarque(), HrEmbarque, getData());
        dispBilhete=totBilhetes+qtdeBilhetes;
        
        
        if ("".equals(HrEmbarque)) {
            JOptionPane.showMessageDialog(this, "Nenhum Horário Selecionado");
            
        }else if (dispBilhete>12){
            sobra=12-totBilhetes;
            JOptionPane.showMessageDialog(this, "Quantidade de bilhetes selecionada indisponivel,"
                    + " A quantidade de bilhetes disponivel para esta estação de embarque é: "+sobra);
        
        
        }else{
            
            this.setVisible(false);
            Compra.getTelaCompra().setVisible(true);
            
        }
    }//GEN-LAST:event_bntAvancarActionPerformed

    private void bntCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCancelarActionPerformed
        
        DefaultSpinner();
        Inicio.getInicio().setVisible(true);
        this.setVisible(false);
        Desembarque.ReativaBnt();
        Desembarque.getBntgEstacoes().clearSelection();
        
    }//GEN-LAST:event_bntCancelarActionPerformed

    private void QtdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_QtdKeyTyped
         String caracteres = "";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Utilize A Barra de Adição");
        }
    }//GEN-LAST:event_QtdKeyTyped

    private void jTableHrDisponivelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableHrDisponivelMouseClicked
        
        MostraSelecionado.setText(jTableHrDisponivel.getValueAt(jTableHrDisponivel.getSelectedRow(),0).toString());
        
    }//GEN-LAST:event_jTableHrDisponivelMouseClicked

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
            java.util.logging.Logger.getLogger(Horario_Qtd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Horario_Qtd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Horario_Qtd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Horario_Qtd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Horario_Qtd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Horario;
    private javax.swing.JLabel LabelIcone;
    private static javax.swing.JTextField MostraSelecionado;
    private javax.swing.JPanel PainelBanner;
    private static javax.swing.JSpinner Qtd;
    private javax.swing.JLabel TitleDispo;
    private javax.swing.JButton bntAvancar;
    private javax.swing.JButton bntCancelar;
    private javax.swing.JButton bntVoltar;
    private javax.swing.JLabel descQtd;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTableHrDisponivel;
    // End of variables declaration//GEN-END:variables
}
