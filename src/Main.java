public class Main {
    public static void main(String[] args) {
        Commis commisA = (Commis) FPersonnel.createPersonnel(EPersonnel.COMMIS, "Bob");
        Chef chefA = (Chef) FPersonnel.createPersonnel(EPersonnel.CHEF, "Toto");
        Serveur serveurA = (Serveur) FPersonnel.createPersonnel(EPersonnel.SERVEUR, "Tata");

        System.out.println(commisA.getNom());
        System.out.println(chefA.getNom());
        System.out.println(serveurA.getNom());

    }
}