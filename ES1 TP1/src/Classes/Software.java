package Classes;

public class Software {
    private String nome;
    private String descricao;
    private float preco;
    private boolean baixado;

    public Software(String nome, String descricao, float preco, boolean baixado) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.baixado = baixado;
    }
    
    public boolean possuiUpdate(){
        boolean update=true;
        //
        return true;
    }
    public void baixarUpdate(){
        //
    }
    public void fazerDownloadSoftware(){
        //
    }
    public void marcarBaixado(){
        //
    }
}
