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
    public void setIniciativa(int iniciativa){
        this.iniciativa = iniciativa;
    }

    function getRandomArbitrary(min, max) {
        return Math.random() * (max - min) + min;
      }


