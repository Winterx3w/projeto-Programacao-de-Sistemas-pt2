public class CarroVip extends Veiculo {
    String servicoDeBordo;
    String wifi;


    public CarroVip(String servicoDeBordo ,String wifi,Boolean disponivel , String modelo, String placa, double precoPorViagem, Usuario motorista){
        super(disponivel, modelo, placa, precoPorViagem, motorista);
        this.servicoDeBordo = servicoDeBordo;
        this.wifi = wifi;
    }

    @Override 
    public void imprimirDados(){
            System.out.printf("Serviço de Bordo: %s\nWifi: %s\n", this.servicoDeBordo, this.wifi);
        }


    @Override
    public double calcularCusto(){
        return precoPorViagem *  1.5;
}
}

