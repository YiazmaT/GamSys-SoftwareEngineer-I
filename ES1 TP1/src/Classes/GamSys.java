package Classes;

public class GamSys {
    private Loja loja;
    private Usuario usuarioLogado;

    public GamSys() {
        this.loja = new Loja();
        
    }
    public void adicionarAComunidade(int idComunidade, int idSolicitado){
        //
    }
    public void adicionarUsuario(int idSolicitado, int idSolicitante){
        //
    }
    public void atualizarListaAmigo(int idNovoAmigo){
        //
    }
    public void alterarDadosComunidade(String nome, boolean tipo, String descricao, int idComunidade){
        //
    }
    public void atualizarDadosUsuario(String nome, String email, String senha, String cpf){
        //
    }
    public void alteraProdutoLoja(String nome, String descricao, int idSoftware){
        //
    }
    public void atualizarSoftware(int idSoftware){
        //
    }
    public void downloadSoftware(int idSoftware){
        //
    }
    public void introduzirProdutoCarrinho(int idProduto){
        //
    }
    public void fazerPagamento(int numeroCartao){
        //
    }
    public void criarComunidade(String nome, boolean tipo, String descricao, int idCriador){
        //
    }
    public void criarConta(String nome, String email, String senha, String cpf){
        //
    }
    public void enviarMensagem(int idDestinatario, int idRemetente, String mensagem){
        //
    }
    public void procurarProduto(String nome){
        //
    }
    public void enviarMensagemComunidade(int idComunidade, int idRemetente, String texto){
        //
    }
    public void buscarUsuario(String email, String senha){
        //
    }
    public void removerUsuarioComunidade(int idMembro, int idComunidade){
        //
    }
}
