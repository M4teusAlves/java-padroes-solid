public interface IConexaoInternet {
    void verificarStatusConexao();
    String identificarTipoConexao();
    void conectar();
    void desconectar();
}

