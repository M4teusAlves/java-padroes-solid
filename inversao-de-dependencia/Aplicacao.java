public class Aplicacao {

    public static void main(String[] args) {

        Computador computador1 = new Computador(new ConexaoWiFi("MinhaRede", "senhaSegura"));

        Computador computador2 = new Computador(new ConexaoEthernet());

        // Exemplo de uso com conexão Wifi
        computador1.conectar();;
        
        System.out.println("\n");

        // Exemplo de uso com conexão Ethernet
        computador2.conectar();;
        
        System.out.println("\n");

        // Desconectar ambas as conexões (apenas para demonstração)
        computador1.desconectar();
        computador2.desconectar();
    }
}
