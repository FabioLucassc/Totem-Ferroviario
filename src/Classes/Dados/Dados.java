package Classes.Dados;

public class Dados {
    
    
    private String EstacaoEmb ;
    private String EstacaoDese;
    private String DataBilhete;
    private int QtdBilhetes;
    private String HEmbarque;
    private String HBilhete;
    private String NumeroCC;
    private String PINCC;
    private String NumSerie;
    private static int totBilhetes;

    public static int getTotBilhetes() {
        return totBilhetes;
    }

    public static void setTotBilhetes(int totBilhetes) {
        Dados.totBilhetes = totBilhetes;
    }

    public String getEstacaoEmb() {
        return EstacaoEmb;
    }

    public void setEstacaoEmb(String EstacaoEmb) {
        this.EstacaoEmb = EstacaoEmb;
    }

    public String getEstacaoDese() {
        return EstacaoDese;
    }

    public void setEstacaoDese(String EstacaoDese) {
        this.EstacaoDese = EstacaoDese;
    }

    public String getDataBilhete() {
        return DataBilhete;
    }

    public void setDataBilhete(String DataBilhete) {
        this.DataBilhete = DataBilhete;
    }

    public int getQtdBilhetes() {
        return QtdBilhetes;
    }

    public void setQtdBilhetes(int QtdBilhetes) {
        this.QtdBilhetes = QtdBilhetes;
    }

    public String getHEmbarque() {
        return HEmbarque;
    }

    public void setHEmbarque(String HEmbarque) {
        this.HEmbarque = HEmbarque;
    }

    public String getHBilhete() {
        return HBilhete;
    }

    public void setHBilhete(String HBilhete) {
        this.HBilhete = HBilhete;
    }

    public String getNumeroCC() {
        return NumeroCC;
    }

    public void setNumeroCC(String NumeroCC) {
        this.NumeroCC = NumeroCC;
    }

    public String getPINCC() {
        return PINCC;
    }

    public void setPINCC(String PINCC) {
        this.PINCC = PINCC;
    }

    public String getNumSerie() {
        return NumSerie;
    }

    public void setNumSerie(String NumSerie) {
        this.NumSerie = NumSerie;
    }
  
    
}
