public class lutador {

    //variáveis
    String nome;
    int classeArmadura; 
    int bonusProficiencia;
    int DV;
    int hp;
    int dano;
    int iniciativa;
    int item;

    //métodos principais
    public double getIniciativa(){
        double random = Math.random();
        int inic = (int) (1 + random *(20 - 1));
        this.iniciativa = inic; 
        return this.iniciativa; 
        System.out.println("A iniciativa de fulano é " + iniciativa + "!");
    }
    public void setIniciativa(int iniciativa){
        this.iniciativa = iniciativa;
    }


    
    /* CÓDIGO PARA OUTRO SISTEMA: chosen undead!
    double loot = Math.random();
    int lootItem = (int)(1 +loot *(100 - 1));
    System.out.println("Resultado do Loot: " + item);

    if(item == 1){
        System.out.println("Adaga (1d4 de dano)");
    }else if(item == 2){
        System.out.println("Punhal (1d4 de dano)");
    }else if(item == 3){
        System.out.println("Porrete (1d4 de dano)");
    }else if(item == 4){
        System.out.println("Maça leve enferrujada (1d4 de dano)");
    }else if(item == 5){
        System.out.println("Porrete reforçado(1d6 de dano)");
    }else if(item == 6){
        System.out.println("Espada curta (1d6 de dano)");
    }
    */
};


