public class Moto extends Veiculo{


    public String placa;

    public Moto(String modelo, String marca, String placa) {
        super.modelo = modelo;
        super.marca = marca;
        this.placa = placa;
    }


    @Override
    public void contratoAluguel(int dias){
        System.out.println("\n\nDetalhes do contrato:");
        System.out.println("\nMoto alugadz:");
        System.out.println("\n- Marca: " + super.marca);
        System.out.println("\n- Modelo: " + super.modelo);
        System.out.println("\n- Placa: " + this.placa);
        System.out.println("\nDuração do aluguel: " + dias + " dias");
        System.out.println("\nCusto total do contrato: R$" + dias*40);
    }
}
