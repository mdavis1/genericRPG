public class Map {
  private String[][] gameMap;
  private Character player;
  private Character[] npcs;

  public Map(){
    gameMap = new String[10][10];  //can be any size
  }

  public Map(int size, Character player, Character[] npcs) {

  }

  @Override
  /**
  Returns the gameboard as a String.  An example in which the player is indicated by a P and npcs are indicated by M's is shown below.
  -  -  -  -  -  -  -  -  -  -
  -  -  -  -  M  -  -  P  -  -
  -  -  -  -  -  -  -  -  -  -
  -  -  -  M  -  -  -  -  -  -
  -  -  -  -  -  -  -  -  -  -
  -  -  -  -  -  -  M  -  -  -
  -  -  -  -  -  -  -  -  -  -
  -  M  -  -  -  -  -  -  -  -
  -  -  -  -  -  -  -  -  -  -
  -  -  -  -  -  -  -  -  -  -
  */
  public String toString() {
    return "";
  }
}