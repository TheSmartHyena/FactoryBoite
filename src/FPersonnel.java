public class FPersonnel {
    public static APersonnel createPersonnel(EPersonnel type, String nom) {
        APersonnel result = null;

        switch(type) {
            case CHEF:
                result = new Chef(nom);
                break;
            case COMMIS:
                result = new Commis(nom);
                break;
            case SERVEUR:
                result = new Serveur(nom);
                break;
        }

        return result;
    }
}
