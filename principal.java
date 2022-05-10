public class principal {
        public static void main(String[] args) {

            lutador l = new lutador ("humano", 14, 2, 1, 10, "espada longa", 5, 2);
            asdfasdf
            
            //lutador l [] = new  lutador[6];
            //l [1] = {"humano", 10, 2, 1, 10};
            

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
