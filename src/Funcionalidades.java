import java.util.Scanner;

public class Funcionalidades
{   //inicio da classe

    Scanner leitor = new Scanner(System.in);

    public int lerInteiro(String mensagem )
    {   //inicio do metodo lerInteiro
        System.out.print(mensagem);
        int valorInt;


        while (true)
        {   // loop para validação de numero inteiro
            if (leitor.hasNextInt())
            {
                valorInt = leitor.nextInt();
                break;
            }
            else
            {
                System.out.println("Entrada inválida! Digite um número.");
                leitor.next();
            }
        }   // fim do loop

        return valorInt;
    }   // fim do metodo lerInteiro

    public void separador()
    {   //inicio do metodo separador
        String divisor = "=".repeat(159);
        System.out.println(divisor);
    }   //fim do metodo separador

    public void pausar()
    {   // inico do metodo pausar
        System.out.print("Aperte ENTER para continuar.");
        leitor.nextLine();
        String despausar = leitor.nextLine();
    }   // fim do metodo pausar


}   //fim da classe

