package Classes;

public class Software {
    private String nome;
    private String descricao;
    private float preco;
    private boolean baixado;
    private int idSoftware;

    public Software(String nome, String descricao, float preco, boolean baixado,int idSoftware) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.baixado = baixado;
        this.idSoftware = idSoftware;
    }

    public int getIdSoftware() {
        return idSoftware;
    }

    public void setIdSoftware(int idSoftware) {
        this.idSoftware = idSoftware;
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public boolean isBaixado() {
        return baixado;
    }

    public void setBaixado(boolean baixado) {
        this.baixado = baixado;
    }
    
    
}
