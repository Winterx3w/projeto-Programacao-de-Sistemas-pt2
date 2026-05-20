import java.util.ArrayList;
public class Passageiros extends Usuario {
    ArrayList<String> historicoViagens;
    String destino;

    public Passageiros(String nome, String email, String senha, ArrayList<String> historicoViagens, String destino) {
        super(nome, email, senha);
        this.historicoViagens = historicoViagens;
        this.destino = destino;
    }

    @Override
 public void tipoUsuario(){
    System.out.println("Tipo: Passageiro");
}

 public void ExibirHistorico(){
    for (int i = 0 ; i < historicoViagens.size(); i++){
        System.out.println(historicoViagens.get(i));

    }
 }
 @Override
public void imprimirDados() {
    super.imprimirDados();
    System.out.println("Histórico de Viagens:");
    for (String viagem : this.historicoViagens) {
        System.out.printf("- %s\n", viagem);
    }
}
}

