package deqo;

/**
 * Interface représentant une question à choix multiple ou à choix exclusif
 */
public interface QuestionAChoix {

    /**
     * Opération permettant de récupérer l'énoncé de la question
     * @return l'énoncé de la question
     */
    public String getEnonce();

    /**
     * Opération permettant de récupérer le score donné par un choix.
     * Exemple :
     * Pour l'énoncé : "L'année 2016 est une année bissextile. 1. Vrai, 2. Faux"
     * L'année 2016 étant bissextile, le score donné par l'indice 1 est de 100 et le score de l'indice 2 est 0
     * @param indiceChoix l'indice du choix
     * @return le score donné par cette indice
     */
    public float getScoreForIndice(int indiceChoix);

}
