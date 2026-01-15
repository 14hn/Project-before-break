import java.util.ArrayList;

public class Npc extends Character {
    
    public Npc(){

    }
    public static void main(String[] args) {
        ArrayList<Npc> npcStreet = new ArrayList<>();
        ArrayList<ArrayList<Npc>> npcTheNeighborhood = new ArrayList<>();
        new Npc();
        Locations emptySpace = new Locations();
        Main.arrayBuilder(npcStreet, npcTheNeighborhood, emptySpace, 7, 7);
    }
}
