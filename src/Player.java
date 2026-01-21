import java.util.ArrayList;


public class Player extends Character{
    public static ArrayList<ArrayList<Locations>> playerTheNeighborhood; 
    public static ArrayList<Locations> playerStreet;

    public Player(){

       



    }
public static void main(String[] args) {
        Player bob = new Player();
        Locations emptySpace = new Locations();
        Main.arrayBuilder(playerStreet, playerTheNeighborhood, emptySpace, 7, 7);
}       
    }
