import org.code.theater.*;
import org.code.media.*;

/**
 * Represents a Scene to be played in the Theater using data from
 * a chosen dataset
 */
public class DataScene extends Scene {

    private Game[] games; // 1D array of Game objects

    /** Constructor */
    public DataScene() {
        games = createGames();
    }

    /**
     * Returns a 1D array of Game objects using the txt files
     */
    public Game[] createGames() {
        String[] nameArray = FileReader.toStringArray("Name.txt");
        String[] publisherArray = FileReader.toStringArray("Publisher.txt");
        String[] dateArray = FileReader.toStringArray("Date.txt");

        Game[] tempArray = new Game[nameArray.length];
        for (int i = 0; i < tempArray.length; i++) {
            tempArray[i] = new Game(nameArray[i], publisherArray[i], dateArray[i]);
        }

        return tempArray;
    }

/*
*Gets a random Game and gets all of its data
*/
  public int randomGame(){
int randomIndex = (int) (Math.random() * games.length);

    // Get the random Game object and return its toString representation
    return randomIndex;
      
    }
  
  /*
*Draw the Scene 
*/
  public void drawScene() { 
    int randomGame = randomGame();
    System.out.println("Random Game: \n" + randomGame);
 for (int i = 5; i >= 0; i--) {  
    clear("navy"); // Clear the screen with a navy background
    
   drawText("Random Game ", 90, 45);
    drawText("Name: "+ games[randomGame].getName(), 30, 100);
    drawText("Publisher: "+ games[randomGame].getPublisher(), 30, 150);
    drawText("Date: "+ games[randomGame].getDate(), 30, 200);
    
    setTextColor(Color.WHITE); // Set text color to white for visibility
    drawText(String.valueOf(i), 200, 300); // Draw the current number
    pause(1); // Pause for 1 second
}

    
  }
}