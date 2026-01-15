import java.util.ArrayList;

public class Main {

    public static ArrayList<ArrayList<Locations>> theNeighborhood; 
    public static ArrayList<Locations> street;
    private static String mergedGrid = "";
    private static final Locations emptySpace = new Locations();

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

    public ArrayList<ArrayList<Locations>> getTheNeighborhood(){
        return theNeighborhood;
    }
    public ArrayList<Locations> getStreet(){
        return street;
    }
    public String getMergedGrid(){
        return mergedGrid;
    }

    public static void main(String[] args) throws Exception {

        Input runner = new Input();//creates frame object
        
        arrayBuilder(street, theNeighborhood, emptySpace, 7, 7);//creates a 2d array list for holding empty spaces
        
        for (ArrayList<Locations> list: theNeighborhood){ //for every locations arrayList in theNeighborhood Arraylist
            for (Locations element: list){ //for every element in locations arrayList
                mergedGrid += element.toString(); 
            }
            mergedGrid += "\n";
        }
        System.out.println(mergedGrid);
        
        
        /* 
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
        */
       
    }
    

}