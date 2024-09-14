public class Main {
    /*
    Écrivez une méthode nommée getGreatestCommonDivisor avec deux paramètres de type int appelés first et second.

Si l’un des paramètres est inférieur à 10, la méthode doit retourner -1 pour indiquer une valeur invalide.

La méthode doit retourner le plus grand diviseur commun des deux nombres (int).
Le plus grand diviseur commun est le plus grand entier positif qui peut diviser entièrement chacun des deux nombres (c’est-à-dire sans laisser de reste).

Exemple pour 12 et 30 :

	•	12 peut être divisé par : 1, 2, 3, 4, 6, 12
	•	30 peut être divisé par : 1, 2, 3, 5, 6, 10, 15, 30
	•	Le plus grand diviseur commun est 6, car 6 divise à la fois 12 et 30 sans laisser de reste.

EXEMPLES D’ENTRÉES/SORTIES :

	•	getGreatestCommonDivisor(25, 15); → devrait retourner 5 car les deux peuvent être divisés par 5 sans reste.
	•	getGreatestCommonDivisor(12, 30); → devrait retourner 6 car les deux peuvent être divisés par 6 sans reste.
	•	getGreatestCommonDivisor(9, 18); → devrait retourner -1 car le premier paramètre est inférieur à 10.
	•	getGreatestCommonDivisor(81, 153); → devrait retourner 9 car les deux peuvent être divisés par 9 sans reste.

CONSEIL :

	•	Utilisez une boucle while ou for pour vérifier si les deux nombres peuvent être divisés sans reste.
	•	Trouvez le minimum des deux nombres.

REMARQUE : La méthode getGreatestCommonDivisor doit être définie comme public static, comme nous l’avons fait jusqu’à présent dans le cours.

REMARQUE : N’ajoutez pas de méthode main dans le code de la solution.
     */
    public static int getGreatestCommonDivisor(int nombre1, int nombre2){
        if(nombre1 < 10 || nombre2 < 10){
            return -1;
        }
        int plusPetitNombre = Integer.min(nombre1, nombre2);
        int pgcd = 1;
        for (int compteur = 1; compteur <= plusPetitNombre; compteur++) {
            if (nombre1 % compteur == 0 && nombre2 % compteur == 0) {
                if(pgcd < compteur){
                    pgcd = compteur;
                }
            }
        }
        return pgcd;
    }
    public static void main(String[] args){
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));
    }
}
