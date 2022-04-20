public class principal {
        public static void main(String[] args) {
            lutador c1 = new lutador();
        
            c1.nome = "humano";
            c1.classeArmadura = 10; 
            c1.bonusProficiencia = 2;
            c1.DV = 1;
            c1.hp = 10;
            //c1.iniciativa;
        
            System.out.println("Pontos de vida do lutador:" + c1.hp);
            System.out.println("Iniciativa do lutador:" + c1.iniciativa);
        
            
            /*
            public int setInic(){
                double randomico = Math.random();
                int resultado = (int) (1 + randomico * (6-1));
                return resultado;
            }
            */
        }
}
