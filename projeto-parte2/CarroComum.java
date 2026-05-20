public class CarroComum extends Veiculo {

    public CarroComum(Boolean disponivel, String modelo, String placa, double precoPorViagem, Usuario motorista){
        super(disponivel, modelo, placa, precoPorViagem, motorista);
    }

    @Override
    public double calcularCusto(){
        return precoPorViagem;
}
}
