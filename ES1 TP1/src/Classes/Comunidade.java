package Classes;

public class Comunidade {
    private String nome;
    private boolean tipo;
    private String descricao;
    private Usuario [] membros;

    public Comunidade(String nome, boolean tipo, String descricao) {
        this.nome = nome;
        this.tipo = tipo;
        this.descricao = descricao;
        this.membros = null;
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
