public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Sistema de Alugel de veiculos Não testamos isso");

        Bicicleta bicicleta = new Bicicleta("Mountain Bike", "Caloi", "123456");

        Carro carro = new Carro("UNO", "Fiat", "MHD10823", 4);

        Moto moto = new Moto("Sahara 300", "Honda", "DHJ2123");

        
        carro.contratoAluguel(10);

        moto.contratoAluguel(10);

        bicicleta.contratoAluguel(3);

    }
}
