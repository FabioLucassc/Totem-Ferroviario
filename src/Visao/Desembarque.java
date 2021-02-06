package Visao;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

public class Desembarque extends javax.swing.JFrame {

    private static Desembarque TelaDesembarque = new Desembarque();
    
//VARIAVEIS -----------------------------------------------------------
    
    private static String EstcaoDesembarque;
    private static int ID_Desembarque;
    private String guardaHora = getHora();
    
//VARIAVEIS -----------------------------------------------------------    
    
    
    

    private Desembarque() {

        initComponents();

    }
    
    
    
    

// GETTTERS ---------------------------------------------------------
    
    public static String getEstcaoDesembarque() {
        return EstcaoDesembarque;
    }
    public static ButtonGroup getBntgEstacoes() {
        return bntgEstacoes;
    }
    public static Desembarque getTelaDesembarque() {
        return TelaDesembarque;
    }
    public static int getID_Desembarque() {
        return ID_Desembarque;
    }
    
    
// GETTTERS ----------------------------------------------------------

// FUNCOES -----------------------------------------------------------
    
   public void btSelecionado(){

        if (Atlantic_City.isSelected()) {
            
            ID_Desembarque=6;
            EstcaoDesembarque = Atlantic_City.getText();

        } else if (Egg_Harbor.isSelected()) {
            
            ID_Desembarque=5;
            EstcaoDesembarque = Egg_Harbor.getText();
        
        } else if (Atco.isSelected()) {
            
            ID_Desembarque=4;
            EstcaoDesembarque = Atco.getText();

        } else if (Lindenwold.isSelected()) {

            ID_Desembarque=3;
            EstcaoDesembarque = Lindenwold.getText();

        } else if (Pennsauken.isSelected()) {

            ID_Desembarque=2;
            EstcaoDesembarque = Pennsauken.getText();

        } else if (Philadelphia.isSelected()) {

            ID_Desembarque=1;
            EstcaoDesembarque = Philadelphia.getText();

        }

    }

    public static void ReativaBnt() {

        if (Atlantic_City.getText().equals(Embarque.getEstcaoEmbarque())) {

            Atlantic_City.setEnabled(true);

        } else if (Egg_Harbor.getText().equals(Embarque.getEstcaoEmbarque())) {

            Egg_Harbor.setEnabled(true);
        } else if (Atco.getText().equals(Embarque.getEstcaoEmbarque())) {

            Atco.setEnabled(true);
        } else if (Lindenwold.getText().equals(Embarque.getEstcaoEmbarque())) {

            Lindenwold.setEnabled(true);
        } else if (Pennsauken.getText().equals(Embarque.getEstcaoEmbarque())) {

            Pennsauken.setEnabled(true);
        } else if (Philadelphia.getText().equals(Embarque.getEstcaoEmbarque())) {

            Philadelphia.setEnabled(true);
        }

    }

    public static void desativaEmbarque() {

        if (Atlantic_City.getText().equals(Embarque.getEstcaoEmbarque())) {

            Atlantic_City.setEnabled(false);

        } else if (Egg_Harbor.getText().equals(Embarque.getEstcaoEmbarque())) {

            Egg_Harbor.setEnabled(false);
        } else if (Atco.getText().equals(Embarque.getEstcaoEmbarque())) {

            Atco.setEnabled(false);
        } else if (Lindenwold.getText().equals(Embarque.getEstcaoEmbarque())) {

            Lindenwold.setEnabled(false);
        } else if (Pennsauken.getText().equals(Embarque.getEstcaoEmbarque())) {

            Pennsauken.setEnabled(false);
        } else if (Philadelphia.getText().equals(Embarque.getEstcaoEmbarque())) {

            Philadelphia.setEnabled(false);
        }

    }
    
    private String getHora() {
  
    DateFormat dateFormat = new SimpleDateFormat("HH:mm");
    Date date = new Date();
    return dateFormat.format(date);
}

// FUNCOES ------------------------------------------------------------ 
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bntgEstacoes = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        Atlantic_City = new javax.swing.JRadioButton();
        Egg_Harbor = new javax.swing.JRadioButton();
        Atco = new javax.swing.JRadioButton();
        Lindenwold = new javax.swing.JRadioButton();
        Pennsauken = new javax.swing.JRadioButton();
        Philadelphia = new javax.swing.JRadioButton();
        bntVoltar = new javax.swing.JButton();
        bntAvancar = new javax.swing.JButton();
        bntCancelar = new javax.swing.JButton();
        PainelBanner = new javax.swing.JPanel();
        LabelIcone = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);

        bntgEstacoes.add(Atlantic_City);
        Atlantic_City.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Atlantic_City.setText("Atlantic City");

        bntgEstacoes.add(Egg_Harbor);
        Egg_Harbor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Egg_Harbor.setText("Egg Harbor City");

        bntgEstacoes.add(Atco);
        Atco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Atco.setText("Atco");

        bntgEstacoes.add(Lindenwold);
        Lindenwold.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lindenwold.setText("Lindenwold");

        bntgEstacoes.add(Pennsauken);
        Pennsauken.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Pennsauken.setText("Pennsauken");

        bntgEstacoes.add(Philadelphia);
        Philadelphia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Philadelphia.setText("Philadelphia");

        bntVoltar.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        bntVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Retornar.png"))); // NOI18N
        bntVoltar.setToolTipText("Voltar");
        bntVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntVoltarActionPerformed(evt);
            }
        });

        bntAvancar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Avançar.png"))); // NOI18N
        bntAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntAvancarActionPerformed(evt);
            }
        });

        bntCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Botao Cancelar.png"))); // NOI18N
        bntCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCancelarActionPerformed(evt);
            }
        });

        PainelBanner.setBackground(new java.awt.Color(51, 153, 255));

        LabelIcone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Bilhetagem.png"))); // NOI18N

        javax.swing.GroupLayout PainelBannerLayout = new javax.swing.GroupLayout(PainelBanner);
        PainelBanner.setLayout(PainelBannerLayout);
        PainelBannerLayout.setHorizontalGroup(
            PainelBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelBannerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LabelIcone, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PainelBannerLayout.setVerticalGroup(
            PainelBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelIcone, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );

        Titulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Selecione a Estação De Desembarque:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelBanner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(bntVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addComponent(bntCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addComponent(bntAvancar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Egg_Harbor)
                    .addComponent(Atlantic_City)
                    .addComponent(Atco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Philadelphia)
                    .addComponent(Pennsauken)
                    .addComponent(Lindenwold))
                .addGap(123, 123, 123))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PainelBanner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Atlantic_City, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Lindenwold, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Egg_Harbor, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pennsauken, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Atco, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Philadelphia, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bntVoltar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bntCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bntAvancar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bntVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntVoltarActionPerformed
     
        Embarque.getBntgEstacoes().clearSelection();
        ReativaBnt();
        
        Embarque.getEmbarque().setVisible(true);
        this.setVisible(false);
        

    }//GEN-LAST:event_bntVoltarActionPerformed

    private void bntAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAvancarActionPerformed
       btSelecionado();
       Horario_Qtd.LimpaHrSelecionada();
       
        if (Embarque.getID_Embarque() < ID_Desembarque) {
            
            
            Horario_Qtd.BuscHrDisp_Ent(Embarque.getEstcaoEmbarque());
            
        }else{
        
            Horario_Qtd.BuscHrDisp_Sai(Embarque.getEstcaoEmbarque());
            
        }
       
       
        if (Horario_Qtd.jTableHrDisponivel.getRowCount()<=0){
            
           JOptionPane.showMessageDialog(this, "Sem Horários Disponveis Hoje Para Estação de Embarque Selecionada");
           
        }else  if (bntgEstacoes.getSelection() != null) {
            Horario_Qtd.getTelaHorario().setVisible(true);
            this.setVisible(false);
        } else {

            JOptionPane.showMessageDialog(this, "Nenhuma Estação De Desembarque Selecionada, Por Favor Selecionar a Estação!");
        }


    }//GEN-LAST:event_bntAvancarActionPerformed
    /**/
    private void bntCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCancelarActionPerformed

        ReativaBnt();

        Inicio.getInicio().setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_bntCancelarActionPerformed
    /**/
 
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Embarque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Embarque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Embarque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Embarque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       //Create and display the form 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Desembarque().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JRadioButton Atco;
    private static javax.swing.JRadioButton Atlantic_City;
    private static javax.swing.JRadioButton Egg_Harbor;
    private javax.swing.JLabel LabelIcone;
    private static javax.swing.JRadioButton Lindenwold;
    private javax.swing.JPanel PainelBanner;
    private static javax.swing.JRadioButton Pennsauken;
    private static javax.swing.JRadioButton Philadelphia;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton bntAvancar;
    private javax.swing.JButton bntCancelar;
    private javax.swing.JButton bntVoltar;
    private static javax.swing.ButtonGroup bntgEstacoes;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
