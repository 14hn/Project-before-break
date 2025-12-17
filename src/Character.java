public class Character {
    private String name;
    private int xLoc;
    private int yLoc;
    private Boolean canControl;

    public Character(){
        name = "bob";
        xLoc = 0;
        yLoc = 0;
        canControl = false;
    }

    public Character(String name, int xLoc, int yLoc, Boolean canControl){
        this.name = name;
        this.xLoc = xLoc;
        this.yLoc = yLoc;
        this.canControl = canControl;
    }


}
