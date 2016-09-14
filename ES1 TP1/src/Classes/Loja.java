package Classes;

import java.util.ArrayList;

public class Loja {
    private ArrayList<Software> softwares;

    public Loja() {
        this.carregarProdutos();
    }
    public void alterarInformacoesProduto(String nome, String descricao, int idSoftware){
        //
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
