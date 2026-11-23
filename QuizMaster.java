import java.util.Scanner;

public class QuizMaster {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            String[] intrebari = {
                "Care este capitala Japoniei?",
                "Câte planete are Sistemul Solar?",
                "Cine a creat limbajul Java?",
                "Care este cel mai mare ocean?",
                "Ce înseamnă HTML?"
            };
            
            String[][] variante = {
                {"A. Beijing", "B. Tokyo", "C. Seoul", "D. Bangkok"},
                {"A. 7", "B. 8", "C. 9", "D. 10"},
                {"A. James Gosling", "B. Bill Gates", "C. Steve Jobs", "D. Elon Musk"},
                {"A. Atlantic", "B. Indian", "C. Arctic", "D. Pacific"},
                {"A. High Text Machine Language",
                    "B. HyperText Markup Language",
                    "C. Home Tool Markup Language",
                    "D. Hyper Transfer Main Language"}
            };
            
            char[] raspunsuriCorecte = {'B', 'B', 'A', 'D', 'B'};
            
            int scor = 0;
            
            System.out.println("================================");
            System.out.println("       BINE AI VENIT LA QUIZ!");
            System.out.println("================================");
            
            for (int i = 0; i < intrebari.length; i++) {
                
                System.out.println("\nIntrebarea " + (i + 1));
                System.out.println(intrebari[i]);
                
                for (String varianta : variante[i]) {
                    System.out.println(varianta);
                }
                
                System.out.print("Raspunsul tau: ");
                String raspuns = scanner.nextLine().trim();
                
                if (raspuns.length() == 1 &&
                        Character.toUpperCase(raspuns.charAt(0))
                        == raspunsuriCorecte[i]) {
                    
                    System.out.println("Corect! +10 puncte");
                    scor += 10;
                    
                } else {
                    System.out.println("Raspuns gresit!");
                }
            }
            
            System.out.println("\n================================");
            System.out.println("           REZULTAT FINAL");
            System.out.println("================================");
            
            System.out.println("Scorul tau: " + scor + "/50");
            
            if (scor == 50) {
                System.out.println("Excelent! Esti un geniu!");
            } else if (scor >= 30) {
                System.out.println("Foarte bine! Continua asa!");
            } else if (scor >= 10) {
                System.out.println("Nu-i rau! Mai exerseaza!");
            } else {
                System.out.println("Mai incearca! Poti mai mult!");
            }
        }
    }
}
