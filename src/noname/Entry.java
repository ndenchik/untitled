package noname;


public class Entry {

    static ArrayList<Orc> orcs = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        orcs.add(new Orc("fsfs", 23, 23));

        boolean exit = false;
        System.out.println("Bonjour bienvenue sur Orc App 2000 PLUS");

        while(!exit){

            displayMenu();
            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    createOrc();
                    break;
                case 2:
                    deleteOrc();
                    break;
                case 3:
                    listOrcs();
                    break;
                case 4:
                    DisplayForceTotale();
                    break;
                case 5:
                    System.out.println("Merci goodbye");
                    exit = true;
                    break;
            }
        }
    }

    private static void DisplayForceTotale() {
        int total = 0;
        for (Orc orc : orcs) {
            total += orc.getForce();
        }
        System.out.println("Force Totale: "+total);
    }

    private static void listOrcs() {
        for (Orc orc : orcs) {
            System.out.printf("Name: %s, Force: %s, Vie: %s \n", orc.getName(), orc.getForce(), orc.getHealth());
        }
    }

    private static void deleteOrc() {
        System.out.println("Ok, qui veux tu supprimer? (mettre le nom)? >");
        String orcName = sc.next();
        boolean deleteSuccess = false;
        Iterator it = orcs.iterator();

        while(it.hasNext()){
            Orc o = (Orc) it.next();
            if(o.getName().equalsIgnoreCase(orcName)){
                it.remove();
                deleteSuccess = true;
                break;
            }
        }
        System.out.println(deleteSuccess ? "Suppression OK!" : "Rien dans la base correspondant a ce nom");
    }

    private static void createOrc() {
        System.out.print("Nom >");
        String name = sc.next();
        System.out.print("Force >");
        int force = sc.nextInt();
        System.out.print("Vie >");
        int vie = sc.nextInt();

        orcs.add(new Orc(name, force, vie));
        System.out.println("Insertion OKLM");
    }

    public static void displayMenu(){
        System.out.println("Que voulez vous faire?");
        System.out.println("\t 1: Ajouter un Orc");
        System.out.println("\t 2: Supprimer un Orc");
        System.out.println("\t 3: Lister un Orc");
        System.out.println("\t 4: Afficher force totale");
        System.out.println("\t 5: Quitter le system");
    }
}
