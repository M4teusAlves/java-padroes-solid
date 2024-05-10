public class Bicicleta extends Veiculo{
    
    public String notaFiscal;

    public Bicicleta(String modelo, String marca, String notaFiscal) {
        super.modelo = modelo;
        super.marca = marca;
        this.notaFiscal = notaFiscal;
    }

    @Override
    public void contratoAluguel(int dias){
        System.out.println("\n\nDetalhes do contrato:");
        System.out.println("\nBicicleta alugada:");
        System.out.println("\n- Marca: " + super.marca);
        System.out.println("\n- Modelo: " + super.modelo);
        System.out.println("\n- Nota Fiscal: " + this.notaFiscal);
        System.out.println("\nDuração do aluguel: " + dias + " dias");
        System.out.println("\nCusto total do contrato: R$" + dias*15);
    }
}
