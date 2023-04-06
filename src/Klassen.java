import java.util.Scanner;

public class Klassen {

    

    public void klassenmenü() {
        Scanner sc = new Scanner(System.in);

         Integer versuche = 3;
         Integer klassenmenü = 0;
    
            System.out.println("\nSie haben 3 Versuche die richtige Auswahl Ihrer Klasse zu treffen.\n");

        do {
            System.out.println("Mit der (1) wählen Sie den Krieger aus \nMit der (2) wählen Sie den Magier \nMit der (3) wählen Sie den Assasinen");
            klassenmenü = sc.nextInt();
            sc.nextLine();
    
            
        if(klassenmenü <1 || klassenmenü >3) {
            versuche -=1;
            if(versuche == 0) {
                System.out.println("Sie haben alle Versuche verbraucht");
                System.exit(0);

            } else if (versuche == 2) {
                System.out.println("Ungültige Eingabe. Sie haben nur noch " + versuche + " " + "Versuche frei.");
            
            } else if (versuche == 1) {
                System.out.println("Ungültige Eingabe. Sie haben nur noch " + versuche + " " + "Versuch frei.");
            }

            }
             
        }while(klassenmenü <1 || klassenmenü >3);

        switch(klassenmenü) {
            case 1: System.out.println("Sie haben sich für den Krieger entschieden.");
                    System.out.println("Bitte geben Sie den Namen Ihres Charakters ein:");
                    String charakterName = sc.nextLine();
                    System.out.println("Der Krieger startet mit folgenden Eigenschaften:");
                    Krieger krieger = new Krieger(charakterName,1,0,2,2,2,20,0,3,5);
                    System.out.println(String.format("Name: %s\nSpielerlvl: %d\nXp: %d\nStärke: %d\nIntelligenz: %d\nGeschicklichkeit: %d\nAusdauer: %d\nMana: %d\nRüstung: %d\nGold beträgt: %d",
                    krieger.getName(), krieger.getPlayerlvl(), krieger.getXp(), krieger.getStärke(), krieger.getIntelligenz(), krieger.getGeschicklichkeit(), krieger.getAusdauer(), krieger.getMana(), krieger.getRüstung(), krieger.getGold()));
                    Geschichte epilog0 = new Geschichte();
                    epilog0.epilog(charakterName);
                    break;
            case 2: System.out.println("Sie haben sich für den Magier entschieden.");
                    System.out.println("Bitte geben Sie den Namen Ihres Charakters ein:");
                    String charakterName1 = sc.nextLine();
                    System.out.println("Der Magier startet mit folgenden Eigenschaften:");
                    Magier magier = new Magier(charakterName1,1,0,4,1,1,8,10,1,5);
                    System.out.println(String.format("Name: %s\nSpielerlvl: %d\nXp: %d\nStärke: %d\nIntelligenz: %d\nGeschicklichkeit: %d\nAusdauer: %d\nMana: %d\nRüstung: %d\nGold beträgt: %d",
                    magier.getName(), magier.getPlayerlvl(), magier.getXp(), magier.getStärke(), magier.getIntelligenz(), magier.getGeschicklichkeit(), magier.getAusdauer(), magier.getMana(), magier.getRüstung(), magier.getGold()));
                    Geschichte epilog1 = new Geschichte();
                    epilog1.epilog(charakterName1);
                    break;
            case 3: System.out.println("Sie haben sich für den Assasinen entschieden.");
                    System.out.println("Bitte geben Sie den Namen Ihres Charakters ein:");
                    String charakterName2 = sc.nextLine();
                    System.out.println("Der Assasine startet mit folgenden Eigenschaften:");
                    Assasine assasine = new Assasine(charakterName2,1,0,3,1,1,15,0,2,5);
                    System.out.println(String.format("Name: %s\nSpielerlvl: %d\nXp: %d\nGeschicklichkeit: %d\nStärke: %d\nIntelligenz: %d\nAusdauer: %d\nMana: %d\nRüstung: %d\nGold beträgt: %d",
                    assasine.getName(), assasine.getPlayerlvl(), assasine.getXp(), assasine.getGeschicklichkeit(), assasine.getStärke(), assasine.getIntelligenz(), assasine.getAusdauer(), assasine.getMana(), assasine.getRüstung(), assasine.getGold()));
                    Geschichte epilog2 = new Geschichte();
                    epilog2.epilog(charakterName2);
                    break;
            }
        
          }
    }

