public class principal {
        public static void main(String[] args) {

            Lutador l[] = new Lutador 
            
            //("humano", 14, 2, 1, 10, "espada longa", 5, 2);
            
            //Lutador l[] = new Lutador [5];
            

            System.out.println("Pontos de vida do lutador:" + l.hp);
            System.out.println("Iniciativa do lutador:" + l.iniciativa);
        
            l.iniciativa();

            /*
            public int setInic(){
                double randomico = Math.random();
                int resultado = (int) (1 + randomico * (6-1));
                return resultado;
            }
            */
        }
}
