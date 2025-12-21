
public class Locations{
// create loaction objects
// empty location should be in main then types of location in their own class
    private String type;
    private boolean canInteract;


    public Locations(){
        type = "x"; //x represents an empty space visually when displaying the play area
        canInteract = false;
}
    public Locations(String type, Boolean canInteract){
        this.type = type;
        this.canInteract = canInteract;
    }

    public String getSpace (){
        return type;
    }

    public Boolean getCanInteract(){
        return canInteract;
    }
    
    public String toString(){
        return type + " ";
    }

    
public static void location(String[] args) throws Exception {
    

    }
}