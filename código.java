package banco;

import java.util.Scanner;

public class banco {
        public static void main(String[] args) {
               int cpf, senha, opcao;
               //tela de boas vindas
               System.out.println("Bem-vindo ao caixa eletrônico");
               // término de boas vindas
  
               Scanner ret = new Scanner(System.in);

              Scanner abc = new Scanner(System.in);

              System.out.print("Digite seu cpf : ");
                cpf = abc.nextInt();
                
      if(cpf == 1234567890){ 
                
      }else{
          
             System.out.println("Cpf incorreta! tente novamente!");
      }
      
             Scanner ler = new Scanner(System.in);

            Scanner alf = new Scanner(System.in);

            System.out.print("Digite sua senha : ");
                senha = alf.nextInt();
                
      if(senha == 01020304){
                
      }else{
          
            System.out.println("Senha incorreta! tente novamente!"); // ao falhar a senha retorna nessa mensagem //
      }
            //menu
            System.out.println("\tBanco Novo");
            System.out.println("1 - Saldo");
            System.out.println("2 - Depósito");
            System.out.println("3 - Saque");
            System.out.println("0 - Sair");
do{
            System.out.print("Escolha sua opção: ");
            // término do menu
       opcao = ler.nextInt();

       switch(opcao){
       case 1: //Saldo
            System.out.println("Seu saldo atual é R$1.000,00.");
       break;

      case 2: //Depósito
       int deposito; 
        int saldo =  1000;

        
            Scanner bet = new Scanner(System.in);
       System.out.print("Digite um valor para depositar : ");
             deposito = bet.nextInt();
             
            
            saldo = saldo + deposito;
            
    
           System.out.println("Seu novo saldo é  R$ " +saldo );
      
break;

case 3: // Saque
           int saldo1 =  1000;
          Scanner tec = new Scanner(System.in);
       
      System.out.println("Digite o valor que deseja sacar: ");
        int saque = tec.nextInt();
        saque = (saldo1 -saque);
        if(saldo1 <saque){
         System.out.println("você não possui fundos suficientes! ");
            saque = 0;
        }
        
        System.out.println("seu novo saldo é  R$ " + saque);

break;

case 0: // Sair
       System.out.println("Você saiu com sucesso.");
break;

            default:
      System.out.println("Opção inválida.");
            }
        } while(opcao != 0);
    }
}
