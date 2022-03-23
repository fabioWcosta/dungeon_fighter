public class lutador {

    //variáveis
    String nome;
    int classeArmadura; 
    int bonusProficiencia;
    int DV;
    int hp;
    int dano;
    int iniciativa;

    //métodos principais
    public double getIniciativa(){
        return this.iniciativa;
        double random = Math.random();

        this.iniciativa = random; 
    }


}
