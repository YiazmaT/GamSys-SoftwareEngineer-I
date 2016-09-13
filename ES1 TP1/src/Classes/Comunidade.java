package Classes;

import java.util.ArrayList;

public class Comunidade {
    private String nome;
    private boolean tipo;
    private String descricao;
    private Usuario [] membros;
    private ArrayList<Post> posts;
    
    public Comunidade(String nome, boolean tipo, String descricao) {
        this.nome = nome;
        this.tipo = tipo;
        this.descricao = descricao;
        this.membros = null;
        posts = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Usuario[] getMembros() {
        return membros;
    }

    public void setMembros(Usuario[] membros) {
        this.membros = membros;
    }

    public ArrayList<Post> getPosts() {
        return posts;
    }

    public void setPosts(ArrayList<Post> posts) {
        this.posts = posts;
    }
    
    
    public void atualizaListaDeMembros(int idSolicitado){
        //
    }
    public void atualizarDados(String nome, boolean tipo, String descricao){
        //
    }
    public void criarNovoPost(int idRemetente, String texto){
        //
    }
    public void removerMembro(int idMembro){
        //
    }
}
