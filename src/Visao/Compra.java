
package Visao;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Compra extends javax.swing.JFrame {

    private static Compra TelaCompra = new Compra();

// VARIAVEIS -------------------------------------------------------------------
    
   private static String NumeroCC;
   private static String NumeroPINCC;
   private static String NumSerie = getNSerie();
   private static String DataAtual = getData();
   private JTextField AuxiliarFocus;
 
// VARIAVEIS -------------------------------------------------------------------
    
   
    private Compra() {
        initComponents();
        

    }  
    
    
   // GETTTERS -------------------------------------------------------
   
    
    public static String getNumeroCC() {
        return NumeroCC;
    }

    public static String getNumeroPINCC() {
        return NumeroPINCC;
    }

    public static String getNumSerie() {
        return NumSerie;
    }
   
    public static Compra getTelaCompra() {
        return TelaCompra;
    }
      
    
   // GETTTERS -------------------------------------------------------
    
    
    
   // FUNÇÕES --------------------------------------------------------
    
    private static String getData(){
        
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date();
        return dateFormat.format(date);
    }
    
     private static String getNSerie() {
    
    DateFormat dateFormat = new SimpleDateFormat("ddMMyyHHmmss");
    Date date = new Date();
    return dateFormat.format(date);
}
    public static void guardaCC (){
        
        NumeroCC = txtCC.getText();
        NumeroPINCC=txtPIN.getText();
    
    }
       
    private void pegaFoco(){
        
       
        
    if(txtCC.isFocusOwner()){
        
        AuxiliarFocus=txtCC;
       
        
    }else{
        
        AuxiliarFocus=txtPIN;

    }
    
    }
    
    public static void limpaDadosCC(){
    
        txtCC.setText("");
        txtPIN.setText("");
    
    }
    
    private static void dadosForTicket(){
    
        String d1,d2,m1,m2,h1,h2,min1,min2;
        char guardaHorario[] = Horario_Qtd.getHrEmbarque().toCharArray();
        char guardaData[] = DataAtual.toCharArray();
        
     //------HORA E MINUTO--------
    
        h1 = ""+guardaHorario[0];
        h2 = ""+guardaHorario[1];
        min1 = ""+guardaHorario[3];
        min2 = ""+guardaHorario[4];
        
        d1 = ""+guardaData[0];
        d2 = ""+guardaData[1];
        m1 = ""+guardaData[3];
        m2 =""+guardaData[4];

        
     
    //------HORA E MINUTO--------
    
        FacSimile.CarcH1.setText(h1);
        FacSimile.CarcH2.setText(h2);
        FacSimile.CarcMin1.setText(min1);
        FacSimile.CarcMin2.setText(min2);
    
        FacSimile.digititoDia1.setText(d1);
        FacSimile.DigitoDia2.setText(d2);
        FacSimile.DigitoMes1.setText(m1);
        FacSimile.DigitoMes2.setText(m2);
    
    }
    
    // FUNÇÕES --------------------------------------------------------
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bntVoltar = new javax.swing.JButton();
        bntCancelar = new javax.swing.JButton();
        bntAvancar = new javax.swing.JButton();
        DescPinCC = new javax.swing.JLabel();
        DescCC = new javax.swing.JLabel();
        PainelBanner = new javax.swing.JPanel();
        LabelIcone = new javax.swing.JLabel();
        txtCC = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        B0 = new javax.swing.JButton();
        B1 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        B6 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        B7 = new javax.swing.JButton();
        B8 = new javax.swing.JButton();
        B9 = new javax.swing.JButton();
        BC = new javax.swing.JButton();
        SelectInfo = new javax.swing.JLabel();
        txtPIN = new javax.swing.JTextField();

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

        DescPinCC.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DescPinCC.setText("Insira o PIN do Cartão de Credito:");

        DescCC.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DescCC.setText("Insira o Número do Cartão de Credito:");

        PainelBanner.setBackground(new java.awt.Color(51, 153, 255));

        LabelIcone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Cartao.png"))); // NOI18N

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

        txtCC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCCMouseClicked(evt);
            }
        });
        txtCC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCCKeyTyped(evt);
            }
        });

        B0.setText("0");
        B0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B0ActionPerformed(evt);
            }
        });

        B1.setText("1");
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        B2.setText("2");
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });

        B3.setText("3");
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });

        B6.setText("6");
        B6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B6ActionPerformed(evt);
            }
        });

        B5.setText("5");
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });

        B4.setText("4");
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });

        B7.setText("7");
        B7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B7ActionPerformed(evt);
            }
        });

        B8.setText("8");
        B8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B8ActionPerformed(evt);
            }
        });

        B9.setText("9");
        B9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B9ActionPerformed(evt);
            }
        });

        BC.setText("C");
        BC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SelectInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(B4, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                                    .addComponent(B7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(B5, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                                    .addComponent(B8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(B0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(B9, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                            .addComponent(B6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(B3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SelectInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(B9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(B7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(B8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(B4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(B0, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(BC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        txtPIN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPINMouseClicked(evt);
            }
        });
        txtPIN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPINKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelBanner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bntVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                        .addComponent(bntCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                        .addComponent(bntAvancar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DescCC, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DescPinCC, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCC, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPIN, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(PainelBanner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(DescCC, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtCC, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(DescPinCC, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtPIN, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bntAvancar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntVoltar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bntVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntVoltarActionPerformed
        Horario_Qtd.LimpaHrSelecionada();
        
        if (Embarque.getID_Embarque() < Desembarque.getID_Desembarque()) {
            
            
            Horario_Qtd.BuscHrDisp_Ent(Embarque.getEstcaoEmbarque());
            
        }else{
        
            Horario_Qtd.BuscHrDisp_Sai(Embarque.getEstcaoEmbarque());
            
        }

        
        Horario_Qtd.getTelaHorario().setVisible(true);
        this.setVisible(false);
        
        
    }//GEN-LAST:event_bntVoltarActionPerformed

    private void bntAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAvancarActionPerformed
        guardaCC();
        dadosForTicket();
        
        if (txtCC.getText().length() < 16){
       
                JOptionPane.showMessageDialog(this, "Numero do Cartão De Crétido Inferior a 16 Digitos");
       
       }else if(txtPIN.getText().length() < 3){
       
                JOptionPane.showMessageDialog(this, "Numero do PIN inferior a 3 Digitos");
                
       }else{
           
                NumSerie =getNSerie();
                this.setVisible(false);
                FacSimile.getTelaTicket().setVisible(true);
                
       }
    }//GEN-LAST:event_bntAvancarActionPerformed

    private void bntCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCancelarActionPerformed
        
        Inicio.getInicio().setVisible(true);
        this.setVisible(false);
        Desembarque.ReativaBnt();
       
        
    }//GEN-LAST:event_bntCancelarActionPerformed

    private void txtCCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCCKeyTyped
        String caracteres = "";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "use o teclado virtual");
        }
    }//GEN-LAST:event_txtCCKeyTyped

    private void B0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B0ActionPerformed
        // TODO add your handling code here:

          if(AuxiliarFocus == txtPIN && txtPIN.getText().length() <= 2 ){ 
           
            AuxiliarFocus.setText(AuxiliarFocus.getText() + "0");
       
       }else if(AuxiliarFocus == txtCC && txtCC.getText().length() <= 15 ){ 
           
            AuxiliarFocus.setText(AuxiliarFocus.getText() + "0");
       
       }else if(AuxiliarFocus == txtPIN && txtPIN.getText().length() > 2  ) {
       
           JOptionPane.showMessageDialog(this, "Maximo 3 Digitos");
           
       }else if(AuxiliarFocus == txtCC && txtCC.getText().length() > 15 ){
       
           JOptionPane.showMessageDialog(this, "Maximo 16 Digitos");
       
       }
    }//GEN-LAST:event_B0ActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
       
        if(AuxiliarFocus == txtPIN && txtPIN.getText().length() <= 2 ){ 
           
            AuxiliarFocus.setText(AuxiliarFocus.getText() + "1");
       
       }else if(AuxiliarFocus == txtCC && txtCC.getText().length() <= 15 ){ 
           
            AuxiliarFocus.setText(AuxiliarFocus.getText() + "1");
       
       }else if(AuxiliarFocus == txtPIN && txtPIN.getText().length() > 2  ) {
       
           JOptionPane.showMessageDialog(this, "Maximo 3 Digitos");
           
       }else if(AuxiliarFocus == txtCC && txtCC.getText().length() > 15 ){
       
           JOptionPane.showMessageDialog(this, "Maximo 16 Digitos");
       
       }
        
    }//GEN-LAST:event_B1ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        // TODO add your handling code here:

         if(AuxiliarFocus == txtPIN && txtPIN.getText().length() <= 2 ){ 
           
            AuxiliarFocus.setText(AuxiliarFocus.getText() + "2");
       
       }else if(AuxiliarFocus == txtCC && txtCC.getText().length() <= 15 ){ 
           
            AuxiliarFocus.setText(AuxiliarFocus.getText() + "2");
       
       }else if(AuxiliarFocus == txtPIN && txtPIN.getText().length() > 2  ) {
       
           JOptionPane.showMessageDialog(this, "Maximo 3 Digitos");
           
       }else if(AuxiliarFocus == txtCC && txtCC.getText().length() > 15 ){
       
           JOptionPane.showMessageDialog(this, "Maximo 16 Digitos");
       
       }
    }//GEN-LAST:event_B2ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
        // TODO add your handling code here:

          if(AuxiliarFocus == txtPIN && txtPIN.getText().length() <= 2 ){ 
           
            AuxiliarFocus.setText(AuxiliarFocus.getText() + "3");
       
       }else if(AuxiliarFocus == txtCC && txtCC.getText().length() <= 15 ){ 
           
            AuxiliarFocus.setText(AuxiliarFocus.getText() + "3");
       
       }else if(AuxiliarFocus == txtPIN && txtPIN.getText().length() > 2  ) {
       
           JOptionPane.showMessageDialog(this, "Maximo 3 Digitos");
           
       }else if(AuxiliarFocus == txtCC && txtCC.getText().length() > 15 ){
       
           JOptionPane.showMessageDialog(this, "Maximo 16 Digitos");
       
       }
    }//GEN-LAST:event_B3ActionPerformed

    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B6ActionPerformed
        // TODO add your handling code here:

          if(AuxiliarFocus == txtPIN && txtPIN.getText().length() <= 2 ){ 
           
            AuxiliarFocus.setText(AuxiliarFocus.getText() + "6");
       
       }else if(AuxiliarFocus == txtCC && txtCC.getText().length() <= 15 ){ 
           
            AuxiliarFocus.setText(AuxiliarFocus.getText() + "6");
       
       }else if(AuxiliarFocus == txtPIN && txtPIN.getText().length() > 2  ) {
       
           JOptionPane.showMessageDialog(this, "Maximo 3 Digitos");
           
       }else if(AuxiliarFocus == txtCC && txtCC.getText().length() > 15 ){
       
           JOptionPane.showMessageDialog(this, "Maximo 16 Digitos");
       
       }
    }//GEN-LAST:event_B6ActionPerformed

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
        // TODO add your handling code here:

         if(AuxiliarFocus == txtPIN && txtPIN.getText().length() <= 2 ){ 
           
            AuxiliarFocus.setText(AuxiliarFocus.getText() + "5");
       
       }else if(AuxiliarFocus == txtCC && txtCC.getText().length() <= 15 ){ 
           
            AuxiliarFocus.setText(AuxiliarFocus.getText() + "5");
       
       }else if(AuxiliarFocus == txtPIN && txtPIN.getText().length() > 2  ) {
       
           JOptionPane.showMessageDialog(this, "Maximo 3 Digitos");
           
       }else if(AuxiliarFocus == txtCC && txtCC.getText().length() > 15 ){
       
           JOptionPane.showMessageDialog(this, "Maximo 16 Digitos");
       
       }
    }//GEN-LAST:event_B5ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
        // TODO add your handling code here:

         if(AuxiliarFocus == txtPIN && txtPIN.getText().length() <= 2 ){ 
           
            AuxiliarFocus.setText(AuxiliarFocus.getText() + "4");
       
       }else if(AuxiliarFocus == txtCC && txtCC.getText().length() <= 15 ){ 
           
            AuxiliarFocus.setText(AuxiliarFocus.getText() + "4");
       
       }else if(AuxiliarFocus == txtPIN && txtPIN.getText().length() > 2  ) {
       
           JOptionPane.showMessageDialog(this, "Maximo 3 Digitos");
           
       }else if(AuxiliarFocus == txtCC && txtCC.getText().length() > 15 ){
       
           JOptionPane.showMessageDialog(this, "Maximo 16 Digitos");
       
       }
    }//GEN-LAST:event_B4ActionPerformed

    private void B7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B7ActionPerformed
        // TODO add your handling code here:

         if(AuxiliarFocus == txtPIN && txtPIN.getText().length() <= 2 ){ 
           
            AuxiliarFocus.setText(AuxiliarFocus.getText() + "7");
       
       }else if(AuxiliarFocus == txtCC && txtCC.getText().length() <= 15 ){ 
           
            AuxiliarFocus.setText(AuxiliarFocus.getText() + "7");
       
       }else if(AuxiliarFocus == txtPIN && txtPIN.getText().length() > 2  ) {
       
           JOptionPane.showMessageDialog(this, "Maximo 3 Digitos");
           
       }else if(AuxiliarFocus == txtCC && txtCC.getText().length() > 15 ){
       
           JOptionPane.showMessageDialog(this, "Maximo 16 Digitos");
       
       }
    }//GEN-LAST:event_B7ActionPerformed

    private void B8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B8ActionPerformed
        // TODO add your handling code here:

          if(AuxiliarFocus == txtPIN && txtPIN.getText().length() <= 2 ){ 
           
            AuxiliarFocus.setText(AuxiliarFocus.getText() + "8");
       
       }else if(AuxiliarFocus == txtCC && txtCC.getText().length() <= 15 ){ 
           
            AuxiliarFocus.setText(AuxiliarFocus.getText() + "8");
       
       }else if(AuxiliarFocus == txtPIN && txtPIN.getText().length() > 2  ) {
       
           JOptionPane.showMessageDialog(this, "Maximo 3 Digitos");
           
       }else if(AuxiliarFocus == txtCC && txtCC.getText().length() > 15 ){
       
           JOptionPane.showMessageDialog(this, "Maximo 16 Digitos");
       
       }
    }//GEN-LAST:event_B8ActionPerformed

    private void B9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B9ActionPerformed
        // TODO add your handling code here:

          if(AuxiliarFocus == txtPIN && txtPIN.getText().length() <= 2 ){ 
           
            AuxiliarFocus.setText(AuxiliarFocus.getText() + "9");
       
       }else if(AuxiliarFocus == txtCC && txtCC.getText().length() <= 15 ){ 
           
            AuxiliarFocus.setText(AuxiliarFocus.getText() + "9");
       
       }else if(AuxiliarFocus == txtPIN && txtPIN.getText().length() > 2  ) {
       
           JOptionPane.showMessageDialog(this, "Maximo 3 Digitos");
           
       }else if(AuxiliarFocus == txtCC && txtCC.getText().length() > 15 ){
       
           JOptionPane.showMessageDialog(this, "Maximo 16 Digitos");
       
       }
    }//GEN-LAST:event_B9ActionPerformed

    private void BCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCActionPerformed
        // TODO add your handling code here:
        AuxiliarFocus.setText("");
    }//GEN-LAST:event_BCActionPerformed

    private void txtCCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCCMouseClicked
            txtCC.grabFocus();
            txtCC.requestFocus();
            txtCC.requestFocusInWindow();
            txtCC.hasFocus();
            txtCC.isFocusable();
            pegaFoco();
    }//GEN-LAST:event_txtCCMouseClicked

    private void txtPINMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPINMouseClicked
        txtPIN.grabFocus();
        txtPIN.requestFocus();
        txtPIN.requestFocusInWindow();
        txtPIN.hasFocus();
        txtPIN.isFocusable();
         pegaFoco();
    }//GEN-LAST:event_txtPINMouseClicked

    private void txtPINKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPINKeyTyped
         String caracteres = "";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "use o teclado virtual");
        }
        
    }//GEN-LAST:event_txtPINKeyTyped

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
            java.util.logging.Logger.getLogger(Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Compra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B0;
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JButton B6;
    private javax.swing.JButton B7;
    private javax.swing.JButton B8;
    private javax.swing.JButton B9;
    private javax.swing.JButton BC;
    private javax.swing.JLabel DescCC;
    private javax.swing.JLabel DescPinCC;
    private javax.swing.JLabel LabelIcone;
    private javax.swing.JPanel PainelBanner;
    private javax.swing.JLabel SelectInfo;
    private javax.swing.JButton bntAvancar;
    private javax.swing.JButton bntCancelar;
    private javax.swing.JButton bntVoltar;
    private javax.swing.JPanel jPanel1;
    private static javax.swing.JTextField txtCC;
    private static javax.swing.JTextField txtPIN;
    // End of variables declaration//GEN-END:variables
}
