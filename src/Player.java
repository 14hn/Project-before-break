import java.util.ArrayList;


public class Player extends Character{
    public static ArrayList<ArrayList<Locations>> playerTheNeighborhood; 
    public static ArrayList<Locations> playerStreet;
    private int xLoc = 0;
    private int yLoc = 0;

    public int getXloc(){
        return xLoc;
    }
    public int getYloc(){
        return yLoc;
    }
    public Player(int xLoc, int yLoc){
        this.xLoc = xLoc;
        this.yLoc = yLoc;
    }
public static void main(String[] args) {
}       
    }
