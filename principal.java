public class principal {
        public static void main(String[] args) {

            lutador l[] = new lutador [5];
            lutador l[] = new lutador[1];
            
            lutador l[0] = ("humano", 14, 2, 1, 10, "espada longa", 5, 2);

            System.out.println("Pontos de vida do lutador:" + l[1].hp);
            System.out.println("Iniciativa do lutador:" + l[1].iniciativa);
        
            l[1].iniciativa();
            
        }
}
