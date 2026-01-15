import java.util.ArrayList;
import java.util.concurrent.TimeUnit;


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

        Input runner = new Input();//creates frame object
        
        String neighborhood = "";
        Locations emptySpace = new Locations();//empty location object creation
        ArrayList<Locations> street = new ArrayList<>();
        ArrayList<ArrayList<Locations>> theNeighborhood = new ArrayList<>();
        
        arrayBuilder(street, theNeighborhood, emptySpace, 7, 7);//creates a 2d array list for holding empty spaces
        
        for (ArrayList<Locations> list: theNeighborhood){ //for every locations arrayList in theNeighborhood Arraylist
            for (Locations element: list){ //for every element in locations arrayList
                neighborhood += element.toString(); 
            }
            neighborhood += "\n";
        }
        System.out.println(neighborhood);
        

        while(true){
        System.out.println(runner.getMoveUp());
        if((runner.getMoveUp()) != 0){
            TimeUnit.MILLISECONDS.sleep(10);
            runner.resetMoveDirection(1);
        }
        System.out.println(runner.getMoveDown());
        if((runner.getMoveDown()) != 0){
            TimeUnit.MILLISECONDS.sleep(10);
            runner.resetMoveDirection(2);
        }
        System.out.println(runner.getMoveLeft());
        if((runner.getMoveLeft()) != 0){
            TimeUnit.MILLISECONDS.sleep(10);
            runner.resetMoveDirection(3);
        }
        System.out.println(runner.getMoveRight());
        if((runner.getMoveRight()) != 0){
            TimeUnit.MILLISECONDS.sleep(10);
            runner.resetMoveDirection(4);
        }
        TimeUnit.MILLISECONDS.sleep(50);

        }
        
    }

}