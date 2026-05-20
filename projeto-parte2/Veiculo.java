import java.util.ArrayList;
public abstract class Veiculo{
        Boolean disponivel;
        String modelo;
        String placa;
        double precoPorViagem;
        Usuario motorista;
        public Veiculo(Boolean disponivel, String modelo, String placa, double precoPorViagem, Usuario motorista){
            this.disponivel = disponivel;
            this.modelo = modelo;
            this.placa = placa;
            this.precoPorViagem = precoPorViagem;
            this.motorista = motorista;
        }
        public void verificarDisponibilidade(){
            if (this.disponivel.equals(true)){
                System.out.print("checado e está disponivel");
            }
            else if (this.disponivel.equals(false)){
                System.out.print("checado e não está disponivel");
            }
        }
        public void imprimirDados(){
            System.out.printf("Veiculo:\nDisponibilidade: %b\nModelo: %s\nPlaca: %s\nPreço: %.2f\n", this.disponivel, this.modelo, this.placa, this.precoPorViagem);
            System.out.print("\nDados do motorista");
            this.motorista.imprimirDados();
        }

        public abstract double calcularCusto(); 
    }
