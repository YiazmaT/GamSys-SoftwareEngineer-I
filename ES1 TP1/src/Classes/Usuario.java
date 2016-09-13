package Classes;

import java.util.ArrayList;

public class Usuario {

    
    private String nome;
    private String senha;
    private String email;
    private String cpf;
    private boolean isAdministrador;
    private ArrayList<Classes.Mensagem> mensagens;
    private ArrayList<Classes.Comunidade> comunidades;
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
        this.mensagens = new ArrayList<Mensagem>();
        this.comunidades = new ArrayList<Comunidade>();
    }

    public Usuario(String nome, String senha, String email, String cpf, boolean isAdministrador, ListaDeAmigos amigos, Biblioteca biblioteca, Carrinho carrinho, ArrayList<Mensagem> mensagens, ArrayList<Comunidade> comunidades) {
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
    public void solicitarIntroducaoProdutoCarrinho(Software produto){
        carrinho.adicionarProdutoCarrinho(produto);
    }
    public void atualizarBiblioteca(){
        while(carrinho.possuiItens()){
            biblioteca.atualizarBiblioteca(carrinho.getIdCarrinho());
        }
    }
    
    public void adicionarMensagemConversa(String mensagem, int idDestinatario, int idRemetente){
        //
    }
 
    public ListaDeAmigos getListaAmigos(){
        return this.amigos;
    }
    
    public ArrayList<Mensagem> getMensagem(){
        return mensagens;
    }
    
    public int getIdUsuario(){
        return idUsuario;
    }
    
    public void atualizarListaAmigos(int idNovoAmigo){
        amigos.adicionarNovoAmigo(idNovoAmigo);
    }
    
    public static Usuario buscarUsuario(String email, String senha){
        //Fazer a busca na base de dados;
        //-----------------------------------------------------TODO---------------------
        return new Usuario("nullNome",senha,email,"nullCPF",false);
    }
    static Usuario buscarUsuario(int idSolicitado) {
        //Facer a busca na base de dados;
        // --------------------------------TODO
        return new Usuario("nullNome","nullSenha","nullLogin","nullCPF",false);
    }
    
    public Carrinho getCarrinho(){
        return carrinho;
    }
    
    public Biblioteca getBiblioteca(){
        return biblioteca;
    }

    void atualizarSoftware(int idSoftware) {
        biblioteca.baixarAtualizacao(idSoftware);
    }
    
    public ArrayList<Comunidade> getComunidade(){
        return comunidades;
    }
}


