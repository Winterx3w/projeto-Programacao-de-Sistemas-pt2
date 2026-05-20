public class Veiculo{
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
            System.out.printf("Veiculo:\n%b\n%s\n%s\n%.2f\n", this.disponivel, this.modelo, this.placa, this.precoPorViagem);
            this.motorista.imprimirDados();
        }
    }
