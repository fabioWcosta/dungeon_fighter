public static void main(String[] args) {
    lutador c1 = new lutador();

    c1.nome = "humano";
    c1.classeArmadura = 10; 
    c1.bonusProficiencia = 2;
    c1.DV = 1;
    c1.hp = 10;

    System.out.println("Pontos de vida do lutador:" + c1.hp);

    float loot = Math.random();
    int item = (int)(1 +loot *(100 - 1));
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
};