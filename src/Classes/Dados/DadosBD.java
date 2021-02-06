
package Classes.Dados;

import Conexao.NewConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DadosBD {
    
   public void Insert(Dados d){
        Connection Acesso = NewConexao.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = Acesso.prepareStatement("INSERT INTO Log "
             + "(NsBilhete_Log,"
             + "DataBilhete_Log," //obs1
             + "HoraBilhete_Log,"
             + "NumCartao_Log,"
             + "EstEmb_Log,"
             + "EstDesemb_Log,"
             + "DataCompra_Log," // obs1 - vai ser o mesmo
             + "HoraEmbarque_Log,"//OBS2 - PEGAR NO DB
             + "QtdBilhetes_Log )"
                + "VALUES(?,?,?,?,?,?,?,?,?)");
          
            
            
            stmt.setString(1, d.getNumSerie());
            stmt.setString(2, d.getDataBilhete());
            stmt.setString(3, d.getHBilhete());
            stmt.setString(4, d.getNumeroCC());
            stmt.setString(5, d.getEstacaoEmb());
            stmt.setString(6, d.getEstacaoDese());
            stmt.setString(7, d.getDataBilhete());
            stmt.setString(8, d.getHEmbarque());
            stmt.setInt(9, d.getQtdBilhetes());
            
         
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            NewConexao.closeConnection(Acesso, stmt);
        }
        
        
    }
    
   public List<Dados> HDiposnivelEnt(String Emb) {

        Connection con = NewConexao.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Dados> BuscaEmb = new ArrayList<>();

        try {
         
              stmt = con.prepareStatement("SELECT HorarioEnt "
                      + "FROM V_BuscaHorario "
                      + "WHERE Nome_Est = ? AND HorarioEnt > SUBSTRING(CONVERT(VARCHAR,SYSDATETIME()),12,8)");
              
           stmt.setString(1,Emb);
        
            
            rs = stmt.executeQuery();

            while (rs.next()) {

                Dados info = new Dados();

                info.setHEmbarque(rs.getString("HorarioEnt"));
                 
                
                BuscaEmb.add(info);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DadosBD.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            NewConexao.closeConnection(con, stmt, rs);
        }

        return BuscaEmb;

    }

   public List<Dados> HDiposnivelSai(String Emb) {

        Connection con = NewConexao.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Dados> BuscaEmb = new ArrayList<>();

        try {
             
              stmt = con.prepareStatement("SELECT HorarioSai "
                      + "FROM V_BuscaHorario "
                      + "WHERE Nome_Est = ? AND HorarioSai > SUBSTRING(CONVERT(VARCHAR,SYSDATETIME()),12,8)");
              
           stmt.setString(1,Emb);
        
            
            rs = stmt.executeQuery();

            while (rs.next()) {

                Dados info = new Dados();

                info.setHEmbarque(rs.getString("HorarioSai"));
                 
                
                BuscaEmb.add(info);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DadosBD.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            NewConexao.closeConnection(con, stmt, rs);
        }

        return BuscaEmb;

    }

      public List<Dados> lotacao(String Emb , String hora , String data) {

        Connection con = NewConexao.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Dados> lotacao = new ArrayList<>();

        try {
             
              stmt = con.prepareStatement("SELECT sum(QtdBilhetes_Log)"
                      + " FROM Log"
                      + " WHERE EstEmb_Log = ?"
                      + " AND HoraEmbarque_Log = ?"
                      + " AND DataCompra_Log = ?");
              
           stmt.setString(1,Emb);
           stmt.setString(2,hora);
           stmt.setString(3,data);
        
            
            rs = stmt.executeQuery();

            while (rs.next()) {

                Dados info = new Dados();

                info.setTotBilhetes(rs.getInt(1));
                 
                
                lotacao.add(info);
            }
            lotacao.get(0).getTotBilhetes();

        } catch (SQLException ex) {
            Logger.getLogger(DadosBD.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            NewConexao.closeConnection(con, stmt, rs);
        }

        return lotacao;

    }
   
   
}



  
  
                

