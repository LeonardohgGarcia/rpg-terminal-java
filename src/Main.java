public class Main {
    public static void main(String[] args)
    {

        Funcionalidades func = new Funcionalidades();

        Inimigos Goblin = new Inimigos(1);
        Inimigos Orc = new Inimigos(2);
        Inimigos Dragão = new Inimigos(3);

        while (true)
        {
            System.out.println("Seja bem vindo ao meu RPG de terminal!");
            System.out.println("1 - Iniciar jogo");
            System.out.println("2 - Sair");

            int escolha = func.lerInteiro("Faça sua escolha: ");

            while (escolha < 1 || escolha > 2)
            {
                System.out.println("Opção invalida!");
                escolha = func.lerInteiro("Faça sua escolha: ");
            }

            if (escolha == 1) {
                System.out.println("Por favor escolha seu heroi!");
                Personagem heroi = new Personagem();

                Combate combate = new Combate(heroi, Goblin);
                combate.iniciar();
                heroi.restaurar();

                Combate combate1 = new Combate(heroi, Orc);
                combate1.iniciar();
                heroi.restaurar();

                Combate combate2 = new Combate(heroi, Dragão);
                combate2.iniciar();
                heroi.restaurar();
                if (heroi.vida > 0) {
                    func.separador();
                    System.out.println("PARABÉNS! VOCÊ ZEROU O JOGO!");
                    func.separador();
                    break;
                }


            } else if (escolha == 2) {
                break;
            }

        }
    }
}