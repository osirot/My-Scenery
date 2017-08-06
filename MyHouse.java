/**
 * A new graphic component. This component is used in
 * the notes to highlight the process of designing a 
 * new object and then implementing it.

 * @author updated by Olga Sirotinsky
 * @version Demo: MyHouse
 */
public class MyHouse extends NscComponent {
  
  // instance variables
  private NscUpTriangle theRoof;
  private NscRectangle theWalls;
  private NscRectangle theDoor;
  
  
  /**
   * Constructor for objects of class MyHouse.
   * This creates a MyHouse object at the specified
   * location
   * @param x the x-coordinate for the object
   * @param y the y-coordinate for the object
   */
  public MyHouse(int x, int y)
  {
    // Specify the constructor for the superclass
    super(x, y, 120, 90);
    
    // Create the roof object
    theRoof = new NscUpTriangle(0, 0, 120, 40);
    // Set the characteristics of the roof
    theRoof.setFilled(true);
    theRoof.setBackground(new java.awt.Color(0x99, 0x33, 0x00));
    // Place the roof in the MyHouse object
    add(theRoof);
    
    // Create the walls object
    theWalls = new NscRectangle(10, 40, 100, 50);
    // Set the characteristics of the walls
    theWalls.setFilled(true);
    theWalls.setBackground(java.awt.Color.blue);
    // Place the walls in the MyHouse object
    add(theWalls);
    
    // Create the door object
    theDoor = new NscRectangle(48, 50, 24, 40);
    // Set the characteristics of the door
    theDoor.setFilled(true);
    theDoor.setBackground(new java.awt.Color(0x99, 0x66, 0x33));
    // Place the door in the MyHouse object
    add(theDoor);
  }
  
  /**
   * Second overloaded constructor for MyHouse with an added
   * color parameter.
   * @param x the x-coordinate for the object
   * @param y the y-coordinate for the object
   * @param color the java.awt.Color chosen to fill walls of object
   */
  public MyHouse(int x, int y, java.awt.Color color )
  {
    
   // Specify the constructor for the superclass
    super(x, y, 120, 90);
    
    // Create the roof object
    theRoof = new NscUpTriangle(0, 0, 120, 40);
    // Set the characteristics of the roof
    theRoof.setFilled(true);
    theRoof.setBackground(new java.awt.Color(0x99, 0x33, 0x00));
    // Place the roof in the MyHouse object
    add(theRoof);
    
    // Create the walls object
    theWalls = new NscRectangle(10, 40, 100, 50);
    // Set the characteristics of the walls
    theWalls.setFilled(true);
    theWalls.setBackground(color);
    // Place the walls in the MyHouse object
    add(theWalls);
    
    // Create the door object
    theDoor = new NscRectangle(48, 50, 24, 40);
    // Set the characteristics of the door
    theDoor.setFilled(true);
    theDoor.setBackground(new java.awt.Color(0x99, 0x66, 0x33));
    // Place the door in the MyHouse object
    add(theDoor);
    
  }

  /**
   * Change the color of the house
   * 
   * @param c The color for the walls of the house
   */
  public void setColor(java.awt.Color c) {
    theWalls.setBackground(c);
    repaint();
  }
  
  /**
   * Retrieve the color of the house
   * 
   * @return The color of the walls of the house
   */
  public java.awt.Color getColor() {
    return theWalls.getBackground();
  }
  
}
