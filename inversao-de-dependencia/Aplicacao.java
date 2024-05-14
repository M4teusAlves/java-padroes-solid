public class Aplicacao {

    public static void main(String[] args) {

        // Exemplo de uso com conexão Wi-Fi
        IConexaoInternet conexaoWifi = new ConexaoWiFi("MinhaRede", "senhaSegura");
        conexaoWifi.conectar();
        conexaoWifi.verificarStatusConexao();
        
        System.out.println("\n");

        // Exemplo de uso com conexão Ethernet
        IConexaoInternet conexaoEthernet = new ConexaoEthernet();
        conexaoEthernet.conectar();
        conexaoEthernet.verificarStatusConexao();
        
        System.out.println("\n");

        // Desconectar ambas as conexões (apenas para demonstração)
        conexaoWifi.desconectar();
        conexaoEthernet.desconectar();
    }
}
