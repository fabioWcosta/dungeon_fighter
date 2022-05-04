public class principal {
        public static void main(String[] args) {
            lutador l[] = new  lutador[6];
            l [1] = ["humano", 10, 2, 1, 10};
            
            l1.nome = "humano";
            l1.classeArmadura = 10; 
            l1.bonusProficiencia = 2;
            l1.DV = 1;
            l1.hp = 10;
        
            System.out.println("Pontos de vida do lutador:" + l1.hp);
            System.out.println("Iniciativa do lutador:" + l1.iniciativa);
        
            l1.iniciativa();

            /*
            public int setInic(){
                double randomico = Math.random();
                int resultado = (int) (1 + randomico * (6-1));
                return resultado;
            }
            */
        }
}
