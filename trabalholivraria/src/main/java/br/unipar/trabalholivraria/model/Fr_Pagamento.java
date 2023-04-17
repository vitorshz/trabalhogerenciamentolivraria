package br.unipar.trabalholivraria.model;
public class Fr_Pagamento {
    private int cd_Formapagamento;
    private String ds_FormaPagamento;
    
    public Fr_Pagamento(){
        
    }
    public Fr_Pagamento(int cd_Formapagamento, String ds_Formapagamento){
        this.cd_Formapagamento = cd_Formapagamento;
       this.ds_FormaPagamento = ds_Formapagamento;
    }
    public int getcd_Formapagamento(){
        return cd_Formapagamento;
    }
    public void setcd_Formapagamento(int cd_Formapagamento){
        this.cd_Formapagamento = cd_Formapagamento;
    }
    public String getds_FormaPagamento(){
        return ds_FormaPagamento;
    }
     public void setds_FormaPagamento(String ds_FormaPagamento){
      this.ds_FormaPagamento = ds_FormaPagamento;
    }

    @Override
    public String toString() {
        return "Fr_Pagamento " + ds_FormaPagamento + '}';
    }
}
