public class ConexaoWiFi implements IConexaoInternet {

    private String nomeRede;
    private String senhaRede;

    public ConexaoWiFi(String nomeRede, String senhaRede) {
        this.nomeRede = nomeRede;
        this.senhaRede = senhaRede;
    }

    @Override
    public void verificarStatusConexao() {
        // Implementar lógica para verificar o status da conexão Wi-Fi
        System.out.println("Verificando status da conexão Wi-Fi...");
        // Simular status conectado
        System.out.println("Status: Conectado");
    }

    @Override
    public String identificarTipoConexao() {
        return "Wi-Fi";
    }

    @Override
    public void conectar() {
        // Implementar lógica para conectar à rede Wi-Fi
        System.out.println("Conectando à rede Wi-Fi: " + nomeRede);
        // Simular conexão bem-sucedida
        System.out.println("Conexão estabelecida com sucesso!");
    }

    @Override
    public void desconectar() {
        // Implementar lógica para desconectar da rede Wi-Fi
        System.out.println("Desconectando da rede Wi-Fi: " + nomeRede);
        // Simular desconexão bem-sucedida
        System.out.println("Desconectado com sucesso!");
    }
}
