package Classes;

import java.util.ArrayList;

public class Comunidade {
    private String nome;
    private boolean tipo;
    private String descricao;
    private ArrayList<Usuario> membros;
    private ArrayList<Post> posts;
    private int idComunidade;
    
    public Comunidade(String nome, boolean tipo, String descricao,int idComunidade) {
        this.nome = nome;
        this.tipo = tipo;
        this.descricao = descricao;
        this.membros = null;
        posts = new ArrayList<>();
        this.idComunidade = idComunidade;
        this.membros = new ArrayList<Usuario>();
    }

    public int getIdComunidade() {
        return idComunidade;
    }

    public void setIdComunidade(int idComunidade) {
        this.idComunidade = idComunidade;
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
        posts.add(new Post(texto, idRemetente));
    }
    public void removerMembro(int idMembro){
        //
    }

    public int getMembrosAt(int posiComunidade) {
        if(posiComunidade < membros.size()){
            return membros.get(posiComunidade).getIdUsuario();
        }return -1;
    }
}
