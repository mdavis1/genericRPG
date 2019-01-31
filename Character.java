public interface Character {
    
  String getName();
  int getHealth();
  int getMaxHealth();
  int getExperience();
  int getAttackPower();

  void setAttackPower(int attackPower);

  /**
  Returns how much health is decreased by, also changes health
  */
  int decreaseHealth(int opponentAttackPower);

  /**
  Returns how much experience was changed, also changes experience
  */
  int gainExperience(int experienceChange);

  /**
  Returns value that represents health offset that will be protected by attack, returns 0 if defense is unsuccessful.  Ex: if 5 is returned, then the possible damage in health from an attack would be reduced by 5
  */
  int defend();

  /**
  Returns true if dodge successful
  */
  boolean dodge();

  /**
  Heals character, plus returns amount by which character healed
  */
  int heal();

  /**
  Determine result of attack.  Uses dodge() and defend() to determine if opponent successfully dodges and/or defends against an attack.  Uses decreaseHealth() on opponent once attack is determined.  Returns a strings the prints out the attack and the result of the attack.  A simple example of the string that could result from this method is below.
  brawler1 attacks monster3
  Opponent Defense: 2 Total Attack: 5
  */
  String attack(Character opponent);

  /**
  Returns relevant information about the character as a String.  A simple example of a return value for a Character is shown below.
  brawler1 class Brawler
  Health: 14
  Experience: 1
  Power: 4
  */
  String toString(); //returns 


  /* The methods below will not be used until you start on milestone 4
  int getXPosition();
  int getYPosition();
  String getCharacterSymbol();
  void setXPosition(int xPosition);
  void setYPosition(int getYPosition);
  void setCharacterSymbol(String characterSymbol);
  */
    
}