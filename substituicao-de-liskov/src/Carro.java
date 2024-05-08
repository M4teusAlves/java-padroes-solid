public class Carro extends Veiculo{
    

    private String placa;
    private int numeroPortas;

    public Carro(String modelo, String marca, String placa, int numeroPortas) {
        super(modelo, marca);
        this.placa = placa;
        this.numeroPortas = numeroPortas;
    }


    public String getPlaca() {
        return placa;
    }


    public void setPlaca(String placa) {
        this.placa = placa;
    }


    public int getNumeroPortas() {
        return numeroPortas;
    }


    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    @Override
    public void contratoAluguel(int dias){
        System.out.println("\n\nDetalhes do contrato:");
        System.out.println("\nCarro alugado:");
        System.out.println("\n- Marca: " + super.getMarca());
        System.out.println("\n- Modelo: " + super.getModelo());
        System.out.println("\n- Placa: " + this.placa);
        System.out.println("\n- Numero de portas: " + this.numeroPortas + "portas");
        System.out.println("\nDuração do aluguel: " + dias + " dias");
        System.out.println("\nCusto total do contrato: R$" + dias*60);
    }

}
