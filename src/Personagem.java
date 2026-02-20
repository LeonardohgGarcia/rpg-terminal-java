import java.util.Scanner;

public class Personagem
{   // incio da classe personagem
    // criando uma instancia de Funcionalidades
    Funcionalidades func = new Funcionalidades();
    // criando varaiveis de status

    int vida;
    int dano;
    int defesa;
    int estamina;

    // variavel de classe
    int classe;

    public Personagem()
    {
        escolherClasse();
    }

    public int escolherClasse()
    {   //inicio do metodo escolherClasse

        //puxando metodo lerInteiro da instancia de Funcionalidade
        classe = func.lerInteiro("Escolha sua classe: (1 - GUERREIRO. 2 - MAGO. 3 - ARQUEIRO.) ");


        while (classe < 1 || classe > 3)
        {   //loop para validação da classe
            System.out.println("Opção inválida! Escolha entre 1, 2 ou 3.");
            classe = func.lerInteiro("Escolha sua classe: (1 - GUERREIRO. 2 - MAGO. 3 - ARQUEIRO.) ");
        }   //fim do loop


        if (classe == 1)
        {   //estrutura de condição para atribuição dos valores da classe
            vida = 100;
            dano = 15;
            defesa = 10;
            estamina = 80;
        } else if (classe == 2)
        {
            vida = 60;
            dano = 25;
            defesa = 5;
            estamina = 120;
        } else if (classe == 3)
        {
            vida = 80;
            dano = 20;
            defesa = 7;
            estamina = 100;
        }
        return classe;
    }   //fim do metodo escolherClasse

    public void exibirStatus()
    {
        String nomeClasse = "";
        if (classe == 1)
        {
            nomeClasse = "GUERREIRO";
        } else if (classe == 2)
        {
            nomeClasse = "MAGO";
        } else
        {
            nomeClasse = "ARQUEIRO";
        }

        func.separador();
        System.out.println(nomeClasse);
        System.out.println("Vida: " + vida);
        System.out.println("Dano: " + dano);
        System.out.println("Defesa: " + defesa);
        System.out.println("Estamina: " + estamina);
        func.separador();

    }

    public void restaurar()
    {
        if (classe == 1){
            vida = 100;
            estamina = 80;
        } else if (classe == 2) {
            vida = 60;
            estamina = 100;
        } else {
            vida = 120;
            estamina = 100;
        }
    }
}
