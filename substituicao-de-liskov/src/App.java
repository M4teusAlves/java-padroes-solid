import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Sistema de Alugel de veiculos Não testamos isso");

        List<Veiculo> veiculos = new ArrayList<>();

        veiculos.add(new Bicicleta("Mountain Bike", "Caloi", "123456"));
        veiculos.add(new Carro("UNO", "Fiat", "MHD10823", 4));
        veiculos.add(new Moto("Sahara 300", "Honda", "DHJ2123"));


        
        for (Veiculo veiculo : veiculos) {
            veiculo.contratoAluguel(20);
        }

    }
}
