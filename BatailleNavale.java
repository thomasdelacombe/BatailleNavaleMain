public class BatailleNavale {
  
  public static void main(String[] args){
  //Initialisation : choix du mode jeu : JVJ, JVO ; placement bateaux
    
    /*boucle du jeu : Affichage des coups joués, nb bateaux restants à adversaire.
    choix case à attaquer : check si déjà attaquée ou pas
    */
    
    char[][] test = {{'O','O','X','O','O','O','O','O','O','O'},{'O','O','X','O','O','O','O','O','O','O'},{'O','O','X','O','O','O','O','O','O','O'},{'O','O','O','O','O','O','O','O','O','O'},{'O','O','O','O','O','O','O','O','O','O'},{'O','O','O','O','O','O','O','O','O','O'},{'O','O','O','O','O','O','O','O','O','O'},{'O','O','O','O','O','O','O','O','O','O'},{'O','O','O','O','O','O','O','O','O','O'},{'O','O','O','O','O','O','O','O','O','O'}};
     AffichageGrille(test);
    
      
  
  }
  
  
  
  /**
     * Méthode pour affichage de la grille
     * Prend la grille en paramètre
     * Ne retourne rien
     */
    public static void AffichageGrille(char[][] coups){
        System.out.print("     ");
        for(byte i = 0; i < coups[0].length ; i+=1){
            System.out.print(i+1 + "  ");
        }
        System.out.println("\n");
        for(byte i = 0; i < coups.length ; i+=1){
            if (i+1<10){
                System.out.print(" ");
            }
            System.out.print(i+1 + "   ");
            
            for(byte j = 0; j < coups[i].length ; j+=1){
                System.out.print(coups[i][j] + "  ");
            }
            System.out.println();
        }
    }
  
}
