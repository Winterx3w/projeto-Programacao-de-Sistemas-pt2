public class principal {
        static Usuario[] motoristas = new Usuario[3];
        static Usuario[] passageiros = new Usuario[2];
        static Veiculo[] veiculos = new Veiculo[3];
        static void listarUsuarios(){
            System.out.print("Método listarUsuarios\n");
            for (int i=0; i < motoristas.length; i++){
                System.out.printf("%s\n%s\n%s\n",motoristas[i].nome, motoristas[i].email, motoristas[i].senha);
            }
        }
        void ListarVeiculos(){
            
        } 
        public static void main(String[] args){
            motoristas[0] = new Usuario("pedro", "pedrocarniello273@gmail.com", "pedro123");
            motoristas[1] = new Usuario("adriana", "adriana@gmail.com", "adriana123");
            motoristas[2] = new Usuario("Mateus", "mateus@gmail.com", "mateus123");
            passageiros[0] = new Usuario("luiz", "luiz@gmail.com", "luiz123");
            veiculos[0] = new Veiculo(true, "fiat uno", "FERR0566", 40.00, motoristas[0]);
            motoristas[1].imprimirDados();
            veiculos[0].imprimirDados();
            listarUsuarios();
            veiculos[0].verificarDisponibilidade();
        }
}