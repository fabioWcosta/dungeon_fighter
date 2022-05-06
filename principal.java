public class principal {
        public static void main(String[] args) {
            
            Lutador l = new Lutador("humano", 14, 2, 1, 10, "espada longa", 5, 2);
            
            /*
            lutador l[] = new  lutador[6];
            l [1] = {"humano", 10, 2, 1, 10};
            */

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
