import java.util.ArrayList;

public class Location{
// create loaction objects
// empty location should be in main then types of location in their own class
    private String type;
    private boolean canInteract;


    public Location(){
        type = "emnpty";
        canInteract = false;
}
    public Location(String type, Boolean canInteract){
        this.type = type;
        this.canInteract = canInteract;
    }

public static void location(String[] args) throws Exception {
    Location emptySpace = new Location();
    ArrayList<Location> playArea = new ArrayList<>();

    ArrayList<Location> row1 = new ArrayList<>();
    for (int i = 0; i >= 5; i++){
        row1.add(emptySpace);
    }
    playArea.addAll(row1);

    ArrayList<Location> row2 = new ArrayList<>();
    for (int i = 0; i >= 5; i++){
        row2.add(emptySpace);
    }
    playArea.addAll(row2);

    ArrayList<Location> row3 = new ArrayList<>();
    for (int i = 0; i >= 5; i++){
        row3.add(emptySpace);
    }
    playArea.addAll(row3);

    ArrayList<Location> row4 = new ArrayList<>();
    for (int i = 0; i >= 5; i++){
        row4.add(emptySpace);
    }
    playArea.addAll(row4);

    ArrayList<Location> row5 = new ArrayList<>();
    for (int i = 0; i >= 5; i++){
        row5.add(emptySpace);
    }
    playArea.addAll(row5);

    System.out.println(playArea);
    

    }
}