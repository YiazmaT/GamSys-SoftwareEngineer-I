package Classes;

public class Usuario {
    private String nome;
    private String senha;
    private String email;
    private String cpf;
    private boolean isAdministrador;
    private Mensagem [] mensagens;
    private Comunidade [] comunidades;
    private ListaDeAmigos amigos;
    private Biblioteca biblioteca;
    private Carrinho carrinho;
    private int idUsuario;

    
    public Usuario(String nome, String senha, String email, String cpf, boolean isAdministrador) {
        this.nome = nome;
        this.senha = senha;
        this.email = email;
        this.cpf = cpf;
        this.isAdministrador = isAdministrador;
        this.amigos = new ListaDeAmigos();
        this.biblioteca = new Biblioteca();
        this.carrinho = new Carrinho();
    }

    public Usuario(String nome, String senha, String email, String cpf, boolean isAdministrador, ListaDeAmigos amigos, Biblioteca biblioteca, Carrinho carrinho, Mensagem [] mensagens, Comunidade [] comunidades) {
        this.nome = nome;
        this.senha = senha;
        this.email = email;
        this.cpf = cpf;
        this.isAdministrador = isAdministrador;
        this.amigos = amigos;
        this.biblioteca = biblioteca;
        this.carrinho = carrinho;
        this.mensagens = mensagens;
        this.comunidades = comunidades;
    }
    
    public void atualizarListaDeComunidades(int idComunidade){
        //
    }
    public void atualizarDados(String nome, String email, String senha, String cpf){
        //
    }
    public void solicitarIntroducaoProdutoCarrinho(int idProduto){
        //    
    }
    public void atualizarBiblioteca(){
        //
    }
    public void adicionarMensagemConversa(String mensagem, int idDestinatario, int idRemetente){
        //
    }
 
    public ListaDeAmigos getListaAmigos(){
        return this.amigos;
    }
    
    public Mensagem[] getMensagem(){
        return mensagens;
    }
    
    public int getIdUsuario(){
        return idUsuario;
    }
    
    public static Usuario buscarUsuario(String email, String senha){
        //Fazer a busca na base de dados;
        //-----------------------------------------------------TODO---------------------
        return new Usuario("nullNome",senha,email,"nullCPF",false);
    }
    
}


