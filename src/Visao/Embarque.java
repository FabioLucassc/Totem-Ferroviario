package Visao;

import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Embarque extends javax.swing.JFrame {

    private static Embarque telaEmbarque = new Embarque();
    private static int ID_Embarque;
    private static String EstcaoEmbarque;

    
    private Embarque() {
        initComponents();
   
    }

    
    // GETTTERS -------------------------------------------------------
    public static Embarque getEmbarque (){
        return telaEmbarque;
  
   }
    
    public static String getEstcaoEmbarque() {
        return EstcaoEmbarque;
    }

    public static ButtonGroup getBntgEstacoes() {
        return bntgEstacoes;
    }

    public static int getID_Embarque() {
        return ID_Embarque;
    }
    
    
    // GETTTERS -------------------------------------------------------
    
    // FUNÇÕES --------------------------------------------------------
    
    public void btSelecionado(){
    
    
        if (Philadelphia.isSelected()){
        
          ID_Embarque=1;
          EstcaoEmbarque = Philadelphia.getText();
        
        }else if (Pennsauken.isSelected()){
           
            ID_Embarque=2;
            EstcaoEmbarque = Pennsauken.getText();
   
        
        }
        else if (Lindenwold.isSelected()){
            
            ID_Embarque=3;
            EstcaoEmbarque = Lindenwold.getText();
        
        }
        else if (Atco.isSelected()){
            
            ID_Embarque=4;
            EstcaoEmbarque = Atco.getText();
        
        }
        else if (Egg_Harbor.isSelected()){
            
            ID_Embarque=5;
            EstcaoEmbarque = Egg_Harbor.getText();
        
        }
        else if (Atlantic_City.isSelected()){
            
            ID_Embarque=6;
            EstcaoEmbarque = Atlantic_City.getText();
        
        }
    
    
    }
    
    // FUNÇÕES --------------------------------------------------------

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bntgEstacoes = new javax.swing.ButtonGroup();
        Philadelphia = new javax.swing.JRadioButton();
        Pennsauken = new javax.swing.JRadioButton();
        Lindenwold = new javax.swing.JRadioButton();
        Atco = new javax.swing.JRadioButton();
        Egg_Harbor = new javax.swing.JRadioButton();
        Atlantic_City = new javax.swing.JRadioButton();
        bntVoltar = new javax.swing.JButton();
        bntAvancar = new javax.swing.JButton();
        bntCancelar = new javax.swing.JButton();
        PainelBanner = new javax.swing.JPanel();
        LabelIcone = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 162, 232));
        setIconImages(null);

        bntgEstacoes.add(Philadelphia);
        Philadelphia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Philadelphia.setText("Philadelphia");

        bntgEstacoes.add(Pennsauken);
        Pennsauken.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Pennsauken.setText("Pennsauken");

        bntgEstacoes.add(Lindenwold);
        Lindenwold.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lindenwold.setText("Lindenwold");

        bntgEstacoes.add(Atco);
        Atco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Atco.setText("Atco");

        bntgEstacoes.add(Egg_Harbor);
        Egg_Harbor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Egg_Harbor.setText("Egg Harbor City");

        bntgEstacoes.add(Atlantic_City);
        Atlantic_City.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Atlantic_City.setText("Atlantic City");

        bntVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Retornar.png"))); // NOI18N
        bntVoltar.setToolTipText("Voltar");
        bntVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntVoltarActionPerformed(evt);
            }
        });

        bntAvancar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Avançar.png"))); // NOI18N
        bntAvancar.setToolTipText("Avançar");
        bntAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntAvancarActionPerformed(evt);
            }
        });

        bntCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Botao Cancelar.png"))); // NOI18N
        bntCancelar.setToolTipText("Cancelar");
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
        Titulo.setText("Selecione a Estação De Embarque:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelBanner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Titulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bntVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bntCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bntAvancar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Lindenwold)
                            .addComponent(Philadelphia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Pennsauken, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Egg_Harbor)
                            .addComponent(Atco)
                            .addComponent(Atlantic_City, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PainelBanner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Philadelphia)
                    .addComponent(Atco, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pennsauken, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Egg_Harbor, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lindenwold)
                    .addComponent(Atlantic_City, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bntAvancar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntVoltar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
        
    private void bntVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntVoltarActionPerformed
     
        
       Inicio.getInicio().setVisible(true);
       this.setVisible(false);
       
        
    }//GEN-LAST:event_bntVoltarActionPerformed

    private void bntAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAvancarActionPerformed

       btSelecionado();
       
       if (bntgEstacoes.getSelection() != null) {
           
            Desembarque.desativaEmbarque();
         
            
            Desembarque.getTelaDesembarque().setVisible(true);
            this.setVisible(false);
        
        }else{
           
           JOptionPane.showMessageDialog(this, "Nenhuma Estação De Embarque Selecionada, Por Favor Selecionar a Estação!");
       }
       
    }//GEN-LAST:event_bntAvancarActionPerformed

    private void bntCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCancelarActionPerformed
    
       Desembarque.ReativaBnt();
       Inicio.getInicio().setVisible(true);
       this.setVisible(false);
        
       
      
    }//GEN-LAST:event_bntCancelarActionPerformed

 
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
                new Embarque().setVisible(true);
            }
        });
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Atco;
    private javax.swing.JRadioButton Atlantic_City;
    private javax.swing.JRadioButton Egg_Harbor;
    private javax.swing.JLabel LabelIcone;
    private javax.swing.JRadioButton Lindenwold;
    private javax.swing.JPanel PainelBanner;
    private javax.swing.JRadioButton Pennsauken;
    private javax.swing.JRadioButton Philadelphia;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton bntAvancar;
    private javax.swing.JButton bntCancelar;
    private javax.swing.JButton bntVoltar;
    private static javax.swing.ButtonGroup bntgEstacoes;
    // End of variables declaration//GEN-END:variables
}
