import java.util.ArrayList;

public class Main {
    
    @SuppressWarnings({ "rawtypes", "unchecked" })//warnings suppressed as the only use for this function is to build arrays for each object
    public static ArrayList arrayBuilder(ArrayList nameOfRow, ArrayList compleArrayList, Locations objectName, int xSize, int ySize){
        for (int i = 0; i <= xSize-1; i++){
            nameOfRow.add(objectName);
        }
        for (int i = 0; i <= ySize-1; i++){
            compleArrayList.add(nameOfRow);
        }
        return compleArrayList;
    }
    public static void main(String[] args) throws Exception {
        String neighborhood = "";
        new Input();
        Locations emptySpace = new Locations();
        ArrayList<ArrayList<Locations>> theNeighborhood = new ArrayList<>();
        ArrayList<Locations> street = new ArrayList<>();
            
        arrayBuilder(street, theNeighborhood, emptySpace, 7, 7);
        
        for (ArrayList<Locations> list: theNeighborhood){
            for (Locations element: list){
                neighborhood += element.toString();
            }
            neighborhood += "\n";
        }
        System.out.println(neighborhood);
    }

}