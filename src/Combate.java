public class Combate
{
    Personagem heroi;
    Inimigos inimigo;
    Funcionalidades func = new Funcionalidades();

    public Combate(Personagem heroi, Inimigos inimigo) // construtor de combate
    {
        this.heroi = heroi;
        this.inimigo = inimigo;
    } // fim do construtor

    public void iniciar() //inicio do metodo iniciar
    {
        heroi.exibirStatus();

        System.out.println();

        inimigo.exibirStatus();

        while (heroi.vida > 0 && inimigo.vida > 0)
        {
            turnoJogador();
            turnoInimigo();
        }

        func.separador();
        if (heroi.vida > 0) {
        System.out.println("VITÓRIA!");

        } else {
        System.out.println("DERROTA!");
        }
        func.separador();
        System.out.println();

    } // fim do metodo iniciar

    public void turnoJogador()
    {
        System.out.println("MENU DE ATAQUE");
        System.out.println("1 - Ataque Normal");
        System.out.println("2 - Ataque Especial");
        System.out.println();


        int escolha = func.lerInteiro("escolha sua ação: ");

        while (escolha < 1 || escolha > 2)
        {
            System.out.println("Por favor escolha uma entre as opções 1 e 2!");
            escolha = func.lerInteiro("Escolha sua ação: ");

        }

        if (escolha == 1) {
            System.out.println("Você escolheu ataque normal!");
        } else if (escolha == 2) {
            System.out.println("Você escolheu ataque especial!");
        }


        int danoBase;

        if (escolha == 1)
        {
            danoBase = heroi.dano;
        } else {
            danoBase = (int) (heroi.dano * 1.5);
            heroi.estamina -= 20;
        }

        int dano = calcularDano(danoBase, inimigo.defesa);
        System.out.println("Você causou " + dano + " de dano!");
        inimigo.vida -= dano;
        System.out.println(inimigo.nome + " HP: " + inimigo.vida);
        System.out.println();
    }

    public void turnoInimigo()
    {
        if (inimigo.vida > 0)
        {
            System.out.println(inimigo.nome + " ataca!");

            int dano = calcularDano(inimigo.dano, heroi.defesa);
            heroi.vida -= dano;

            System.out.println(inimigo.nome + " causou " + dano + " de dano!");
            System.out.println("Você tem " + heroi.vida + " de HP restante!");
            System.out.println();
        }

    }

    public int calcularDano(int ataque, int defesa)
    {
        int dano = ataque - defesa;

        if (dano < 1)
        {
            dano = 1;
        }

        return dano;
    }
}
