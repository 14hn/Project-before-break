import java.util.ArrayList;

public class Npc extends Character {

    public static ArrayList<ArrayList<Locations>> npcTheNeighborhood; 
    public static ArrayList<Locations> npcStreet;
    private int xLoc = 0;
    private int yLoc = 0;
    
    public Npc(int xLoc, int yLoc){
        this.xLoc = xLoc;
        this.yLoc = yLoc;
    }
    public Npc(){
        this(0,0);
    }

    public int getXLoc(){
        return xLoc;
    }
    public int getYLoc(){
        return yLoc; 
    }

    public static void main(String[] args) {
        Locations emptySpace = new Locations();
        Main.arrayBuilder(npcStreet, npcTheNeighborhood, emptySpace, 7, 7);
    }
}
