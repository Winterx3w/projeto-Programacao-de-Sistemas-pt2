public class Motorista extends Usuario {
    int CNH;
    double notaMedia;

public Motorista(int CNH, double notaMedia,String nome,String email, String senha){
    super(nome ,email ,senha);
    this.CNH = CNH;
    this.notaMedia = notaMedia;
}
@Override
 public void tipoUsuario(){
    System.out.println("Tipo: Motorista");
}
@Override
    public void imprimirDados() {
        super.imprimirDados();
        System.out.printf("CNH: %d\nNota Média: %.1f\n", this.CNH, this.notaMedia);
    }
}

