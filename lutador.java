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
        int inic = (int) (1 + random *(20 - 1));
        this.iniciativa = inic; 
    }
    public void setIniciativa(int iniciativa){
        this.iniciativa = iniciativa;
    }


