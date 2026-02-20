public class Inimigos
{
    Funcionalidades func = new Funcionalidades();
    String nome;
    int vida;
    int dano;
    int defesa;

    public Inimigos(int tipo) //construtor Inimigos
    {
        if (tipo == 1) {
            nome = "Goblin";
            vida = 40;
            dano = 8;
            defesa = 3;
        } else if (tipo == 2) {
            nome = "Orc";
            vida = 70;
            dano = 12;
            defesa = 6;
        } else if (tipo == 3) {
            nome = "Dragão";
            vida = 120;
            dano = 18;
            defesa = 10;
        }
    } //fim do construtor

    public void exibirStatus()
    {
        func.separador();
        System.out.println(nome);
        System.out.println("Vida: " + vida);
        System.out.println("Dano: " + dano);
        System.out.println("Defesa: " + defesa);
        func.separador();
    }
}
