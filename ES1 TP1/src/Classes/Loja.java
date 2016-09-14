package Classes;

import java.util.ArrayList;

public class Loja {
    private ArrayList<Software> softwares;

    public Loja() {
        this.carregarProdutos();
        softwares = new ArrayList<Software>();
    }
    public void alterarInformacoesProduto(String nome, String descricao, int idSoftware, float valor){
        for(Software a: softwares){
            if(a.getIdSoftware() == idSoftware) a.alteraInformacoes(nome,descricao,valor);
        }
    }
    public void carregarProdutos(){
        //
    }
    public ArrayList<Software> localizarProdutos(String nome){
        ArrayList<Software> produtosEncontrados = new ArrayList<Software>();
        for(Software a: softwares){
            if(a.getNome().contains(nome))produtosEncontrados.add(a);
        }
        return produtosEncontrados;
    }
}
