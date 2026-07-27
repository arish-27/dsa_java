public class GetterandSetters {
    // 1. Add a private field to store the name
    private String name;
    private String game;
    // 2. Add the setter method (setName)
    public void setName(String newName,String newGame) {
        this.name = newName;
        this.game=newGame;
    }
    public String getGame() {
        return game;
    }
    // 3. Add the getter method (getName)
    public String getName() {
        return name;
    }
    // The main method remains the same and will now work
    public static void main(String[] args) {
        GetterandSetters myObj = new GetterandSetters();
        myObj.setName("arish","cricket");
        System.out.println(myObj.getName());
        System.out.println(myObj.getGame());
    }
}
