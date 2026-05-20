import java.time.LocalDate;
public class ReservarViagem {
    private Usuario passageiro;
    private Veiculo veiculo;
    private LocalDate data;
    private double custo;
    private String destino;

    public void reservarViagem(Usuario p, Veiculo v, LocalDate data, String destino) {
        this.passageiro = p;
        this.veiculo = v;
        this.data = data;
        System.out.print("RESERVA DE VIAGEM\n");
        System.out.println("Passageiro: " + this.passageiro.nome);
        System.out.println("Veiculo: " + this.veiculo.modelo);
        System.out.println("Data: " + this.data);
        System.out.println("Destino: " + this.destino);
    }

    public double getCalcularCusto() {
        return this.custo;
    }

    public double calcularCusto(boolean incluirTaxaServico) {
        if (incluirTaxaServico) {
            return this.custo * 1.5;
        }
        return this.custo;
    }
}
