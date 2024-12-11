import org.code.theater.*;
import org.code.media.*;
/**
 * Represents a Game with a name, publisher name, and a date
 */
public class Game {

  private String name;     // name of the game
  private String publisher; //publisher name 
  private String date; // date of the game was realeased

  /** Constructor */
  public Game( String name, String publisher, String date) {
    this.name = name;
    this.publisher = publisher;
    this.date = date;
  }

  /**
  *Accessor Method for game name
  */
  public String getName() {
    return name;
  }
  /**
  *Accessor Method for publisher name
  */
  public String getPublisher() {
    return publisher;
  }
  /**
  *Accessor Method for date
  */
  public String getDate() {
    return date;
  }
  
 /*
 *To String Method 
 */
  public String toString() {
    return "Name: "+ name + "\nPublisher: "+ publisher + "\nDate: "+ date;
  }
  
}