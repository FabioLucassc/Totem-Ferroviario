
package Visao;

import Classes.Dados.Dados;
import Classes.Dados.DadosBD;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.util.Date;

public class FacSimile extends javax.swing.JFrame {

    private static FacSimile TelaTicket = new FacSimile();
    
  // VARIAVEIS --------------------------------------------------
    
   // public String dias[]=new String[4],horas[]=new String[4];
    public  String datas = getData() ,horarios = Horario_Qtd.getHrEmbarque();
   /* private  String d1,d2,m1,m2,h1,h2,min1,min2;
    private  char guardaData[] = datas.toCharArray();
    private  char guardaHorario[] = horarios.toCharArray();*/
    
  // VARIAVEIS ----------------------------------------------------
    
    private FacSimile() {
        initComponents();
       /* colocarDadosVertical();
        
        digititoDia1.setText(d1);
        DigitoDia2.setText(d2);
        DigitoMes1.setText(m1);
        DigitoMes2.setText(m2);*/
       
    
    }
    
    
    

    public JPanel getTicket() {
        return Ticket;
    }

    public static FacSimile getTelaTicket() {
        return TelaTicket;
    }
    
    
// GETTTERS -------------------------------------------------------
    
    private  String getData() {
        
        DateFormat dateFormat = new SimpleDateFormat("ddMM");
        Date date = new Date();
        return dateFormat.format(date);
    }
    private  String getDataForBD() {
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date();
        return dateFormat.format(date);
    }
   /* private  String getHora() {

        DateFormat dateFormat = new SimpleDateFormat("HHmm");
        Date date = new Date();
        return dateFormat.format(date);
    }*/
    private  String getHoraForBD() {

        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }

// GETTTERS -------------------------------------------------------
  
  /*  public  void colocarDadosVertical(){
        
    //------ DIA E MES ---------
    
        d1 = ""+guardaData[0];
        d2 = ""+guardaData[1];
        m1 = ""+guardaData[2];
        m2 =""+guardaData[3];

       
    //------ DIA E MES ----------
    
        
        
    
 }*/
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Ticket = new javax.swing.JPanel();
        logoSNTF = new javax.swing.JLabel();
        DescDesem = new javax.swing.JLabel();
        EstacaoDeEmbarque = new javax.swing.JLabel();
        DescEmbarque = new javax.swing.JLabel();
        EstacaoDeEmbarque1 = new javax.swing.JLabel();
        jLabelQRCode = new javax.swing.JLabel();
        jLabelNumSerie = new javax.swing.JLabel();
        digititoDia1 = new javax.swing.JLabel();
        DigitoDia2 = new javax.swing.JLabel();
        DigitoMes2 = new javax.swing.JLabel();
        DigitoMes1 = new javax.swing.JLabel();
        CarcH1 = new javax.swing.JLabel();
        CarcH2 = new javax.swing.JLabel();
        CarcMin1 = new javax.swing.JLabel();
        CarcMin2 = new javax.swing.JLabel();
        PainelBanner = new javax.swing.JPanel();
        LabelIcone = new javax.swing.JLabel();
        bntConfirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Ticket.setBackground(new java.awt.Color(255, 255, 255));
        Ticket.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 153, 255), null));
        Ticket.setAutoscrolls(true);
        Ticket.setEnabled(false);

        logoSNTF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/LogoSNTF 140x130.jpg"))); // NOI18N

        DescDesem.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        DescDesem.setText("Desembarque:");

        EstacaoDeEmbarque.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        EstacaoDeEmbarque.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        EstacaoDeEmbarque.setText(Embarque.getEstcaoEmbarque());

        DescEmbarque.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        DescEmbarque.setText("Embarque:");

        EstacaoDeEmbarque1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        EstacaoDeEmbarque1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        EstacaoDeEmbarque1.setText(Desembarque.getEstcaoDesembarque());

        jLabelQRCode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/QR 129.png"))); // NOI18N

        jLabelNumSerie.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabelNumSerie.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNumSerie.setText(Compra.getNumSerie());

        digititoDia1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        digititoDia1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        DigitoDia2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        DigitoDia2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        DigitoMes2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        DigitoMes2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        DigitoMes1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        DigitoMes1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        CarcH1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        CarcH1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        CarcH2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        CarcH2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        CarcMin1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        CarcMin1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        CarcMin2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        CarcMin2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout TicketLayout = new javax.swing.GroupLayout(Ticket);
        Ticket.setLayout(TicketLayout);
        TicketLayout.setHorizontalGroup(
            TicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TicketLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(logoSNTF, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(digititoDia1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DigitoDia2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DigitoMes1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DigitoMes2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(TicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(EstacaoDeEmbarque, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(EstacaoDeEmbarque1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(DescDesem, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DescEmbarque, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(TicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CarcH1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CarcH2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CarcMin1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CarcMin2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNumSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(TicketLayout.createSequentialGroup()
                        .addComponent(jLabelQRCode, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        TicketLayout.setVerticalGroup(
            TicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TicketLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TicketLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(TicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TicketLayout.createSequentialGroup()
                                .addComponent(logoSNTF, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TicketLayout.createSequentialGroup()
                                .addComponent(DescEmbarque)
                                .addGap(18, 18, 18)
                                .addComponent(EstacaoDeEmbarque, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(DescDesem)
                                .addGap(18, 18, 18)
                                .addComponent(EstacaoDeEmbarque1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25))))
                    .addGroup(TicketLayout.createSequentialGroup()
                        .addGroup(TicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(TicketLayout.createSequentialGroup()
                                .addComponent(jLabelQRCode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelNumSerie))
                            .addGroup(TicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(TicketLayout.createSequentialGroup()
                                    .addComponent(digititoDia1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(DigitoDia2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(DigitoMes1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(DigitoMes2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(TicketLayout.createSequentialGroup()
                                    .addComponent(CarcH1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(CarcH2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(CarcMin1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(CarcMin2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        PainelBanner.setBackground(new java.awt.Color(51, 153, 255));

        LabelIcone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Emissao.png"))); // NOI18N

        javax.swing.GroupLayout PainelBannerLayout = new javax.swing.GroupLayout(PainelBanner);
        PainelBanner.setLayout(PainelBannerLayout);
        PainelBannerLayout.setHorizontalGroup(
            PainelBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelBannerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LabelIcone)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PainelBannerLayout.setVerticalGroup(
            PainelBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelIcone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bntConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Confirmar_1.png"))); // NOI18N
        bntConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelBanner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(490, Short.MAX_VALUE)
                .addComponent(bntConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(Ticket, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(PainelBanner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(Ticket, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(bntConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bntConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntConfirmarActionPerformed
       
        Dados d = new Dados();
        DadosBD BD = new DadosBD();
        
        d.setNumSerie(Compra.getNumSerie()); // NUMSERIE GERADI
        d.setDataBilhete(getDataForBD()); //OBS1 - VAI SER IGUAL DATA COMPRA 
        d.setHBilhete(getHoraForBD());
        d.setNumeroCC(Compra.getNumeroCC());
        d.setEstacaoEmb(Embarque.getEstcaoEmbarque());
        d.setEstacaoDese(Desembarque.getEstcaoDesembarque());
        d.setDataBilhete(getDataForBD()); //IGUAL OBS1
        d.setHEmbarque(Horario_Qtd.getHrEmbarque()); 
        d.setQtdBilhetes(Horario_Qtd.getQtdeBilhetes());
        
        BD.Insert(d);
        
        Inicio.getInicio().setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_bntConfirmarActionPerformed

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
            java.util.logging.Logger.getLogger(FacSimile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FacSimile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FacSimile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FacSimile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FacSimile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel CarcH1;
    public static javax.swing.JLabel CarcH2;
    public static javax.swing.JLabel CarcMin1;
    public static javax.swing.JLabel CarcMin2;
    private javax.swing.JLabel DescDesem;
    private javax.swing.JLabel DescEmbarque;
    public static javax.swing.JLabel DigitoDia2;
    public static javax.swing.JLabel DigitoMes1;
    public static javax.swing.JLabel DigitoMes2;
    private javax.swing.JLabel EstacaoDeEmbarque;
    private javax.swing.JLabel EstacaoDeEmbarque1;
    private javax.swing.JLabel LabelIcone;
    private javax.swing.JPanel PainelBanner;
    private javax.swing.JPanel Ticket;
    private javax.swing.JButton bntConfirmar;
    public static javax.swing.JLabel digititoDia1;
    private javax.swing.JLabel jLabelNumSerie;
    private javax.swing.JLabel jLabelQRCode;
    private javax.swing.JLabel logoSNTF;
    // End of variables declaration//GEN-END:variables
}
