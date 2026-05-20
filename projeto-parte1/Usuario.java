public class Usuario{
        String nome;
        String email;
        String senha;
        public Usuario(String nome, String email, String senha ){
            this.nome = nome;
            this.email = email;
            this.senha = senha;
        }
        public void imprimirDados(){
            System.out.printf("Método imprimir dados-Usuário\n%s\n%s\n%s\n", this.nome, this.email, this.senha);
        }
    }
