public class Computador {
    private IConexaoInternet conexaoInternet;

    public Computador(IConexaoInternet conexaoInternet) {
        this.conexaoInternet = conexaoInternet;
    }

    public IConexaoInternet getConexaoInternet() {
        return conexaoInternet;
    }

    public void setConexaoInternet(IConexaoInternet conexaoInternet) {
        this.conexaoInternet = conexaoInternet;
    }

    public void conectar(){
        System.out.println("Conectando à Internet");
        conexaoInternet.conectar();
        conexaoInternet.verificarStatusConexao();
    }


    public void desconectar(){
        System.out.println("Desconectando");
        conexaoInternet.desconectar();
    }

    

}
