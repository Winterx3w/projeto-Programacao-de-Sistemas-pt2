import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
public class principal {
        //ArrayLists
        static ArrayList<Motorista> motoristasArrayList = new ArrayList();
        static ArrayList<Passageiros> passageirosArrayList = new ArrayList();
        static ArrayList<Veiculo> veiculosArrayList = new ArrayList();
        static ArrayList<Veiculo> veiculosVipArrayList = new ArrayList();

        static void listarMotoristas(){
            System.out.print("Listagem de motoristas\n\n");
            for (int i = 0; i < motoristasArrayList.size(); i++){
                System.out.print("------ Motorista " + i + " ------");
                motoristasArrayList.get(i).imprimirDados();
                System.out.print("\n");
           }
        }

        static void listarPassageiros(){
            System.out.print("Listagem de passageiros\n");
            System.out.print("\n=============================\n");
            for (int i = 0; i < passageirosArrayList.size(); i++){
                System.out.print("------ Passageiro " + i + " ------");
                passageirosArrayList.get(i).imprimirDados();
                System.out.print("\n");
           }
        }

        static void listarCarrosComuns(){
            System.out.print("Método listarCarrosComuns\n");
            System.out.print("\n=============================\n");
            for (int i = 0; i < veiculosArrayList.size(); i++){
                System.out.print("----- Carro Comum " + i + " ------");
                veiculosArrayList.get(i).imprimirDados();
                System.out.print("\n");
           }
        } 

            static void listarCarrosVips(){
            System.out.print("Método listarCarrosVips\n");
            System.out.print("=============================\n");
            for (int i = 0; i < veiculosVipArrayList.size(); i++){
                veiculosVipArrayList.get(i).imprimirDados();
                System.out.print("\n");
           }
        }
        static void digiteParaContinuar(){
            Scanner sc = new Scanner(System.in);
            System.out.print("DIGITE PARA VOLTAR AO MENU: ");
            String caracterer = sc.nextLine();
        }
        static int menu(){
            Scanner sc = new Scanner(System.in);
            System.out.print("\n-------MENU-------");
            System.out.print("\n1 - LISTAR MOTORISTAS");
            System.out.print("\n2 - LISTAR PASSAGEIROS");
            System.out.print("\n3 - LISTAR VEICULOS");
            System.out.print("\n4 - RESERVAR VIAGEM");
            System.out.print("\n5 - SAIR\n");
            System.out.print(">>>");
            int esc = sc.nextInt();
            return esc;
        } 
        

        public static void main(String[] args){
            boolean chaveSaida = false;
            //criando objeto reservarViagem
            ReservarViagem reserva = new ReservarViagem();
            //Scanner
            Scanner sc = new Scanner(System.in);
            ArrayList<String>historico1 = new ArrayList<>();
            historico1.add("Corrida : Jardin das Flores - Vila Yara | Data: 2026-05-10");
            historico1.add("Corrida : Veloso - KM 18 | Data: 2025-12-10");

            ArrayList<String>historico2 = new ArrayList<>();
            historico2.add("Corrida: Centro | Data: 2026-04-08");
            historico2.add("Corrida: Shopping | Data: 2025-05-12");

            ArrayList<String>historico3 = new ArrayList<>();
            historico3.add("Corrida: Centro | Data: 2025-05-10");
            historico3.add("Corrida: Shopping | Data: 2025-05-12");
            motoristasArrayList.add(new Motorista(123456 , 7.5 ,"Pedro", "pedrocarniello273@gmail.com", "pedro123"));
            motoristasArrayList.add(new Motorista(8976586 , 8.5 ,"Adriana", "adriana@gmail.com", "adriana123"));
            motoristasArrayList.add(new Motorista(42094756 , 9.9 , "Mateus", "mateus@gmail.com", "mateus123"));
            passageirosArrayList.add(new Passageiros("Marcos", "marcos@gmail.com", "marcos123", historico1, "carapicuiba"));
            passageirosArrayList.add(new Passageiros("luiz", "luiz@gmail.com", "luiz123",historico2, "perdizes"));
            passageirosArrayList.add(new Passageiros("laura", "laura@gmail.com", "laura123",historico3, "alphaville"));
            veiculosArrayList.add(new CarroComum(true, "fiat uno", "FERR0566", 40.00, motoristasArrayList.get(0)));
            veiculosArrayList.add(new CarroComum(false, "duster", "5305DFSF", 70.00, motoristasArrayList.get(1)));
            veiculosVipArrayList.add(new CarroVip("Video Game" , "MSNBB867" , true, "corsa", "PIPVCOXV5", 90.00, motoristasArrayList.get(2)));
            veiculosVipArrayList.add(new CarroVip("Coca gelada" , "SDASFDS34" , true, "mustangue", "FFLN45FR3", 200.00, motoristasArrayList.get(2)));
            reserva.reservarViagem(passageirosArrayList.get(0), veiculosArrayList.get(1), LocalDate.now(), passageirosArrayList.get(0).destino);
            System.out.print(reserva.calcularCusto(true));
            while (chaveSaida != true){
            int esc = (menu());
            if (esc == 1){
                listarMotoristas();
                digiteParaContinuar();
            }
            if (esc == 2){
                listarPassageiros();
                digiteParaContinuar();
            }
            if (esc == 3){
                listarCarrosComuns();
                listarCarrosVips();
                digiteParaContinuar();
            }
            if (esc == 4){
                System.out.print("ESCOLHA UM PASSAGEIRO:\n");
                for (int i = 0; i< passageirosArrayList.size(); i++){
                    System.out.println("passageiro n*" + i +": " + passageirosArrayList.get(i).nome);
                }
                int num = sc.nextInt();
                Passageiros passageiro_esc = passageirosArrayList.get(num);
                String dest_esc = passageirosArrayList.get(num).destino;
                System.out.print("ESCOLHA UM CARRO:\n");
                for (int i = 0; i< veiculosArrayList.size(); i++){
                    System.out.println("carro n*" + i +": " + veiculosArrayList.get(i).modelo);
                }
                
                Veiculo carro_esc = veiculosArrayList.get(sc.nextInt());
                reserva.reservarViagem(passageiro_esc, carro_esc, LocalDate.now(), dest_esc);
                digiteParaContinuar();
            }/*
            while (resp != 0) {
                System.out.print("PRESSIONE QUALQUR TECLA PARA VOLTAR PARA VOLTAR");
                
            }
            */
            if (esc == 5){
                System.out.print("saindo...");
                chaveSaida = true;
                
            }
        }
        }
}