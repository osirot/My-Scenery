import java.awt.Color;

/** 
 * MyTree class creates a new tree graphic component. 
 *
 * @author Olga Sirotinsky
 * @version Assignment: MyScene (Standard)
 */
public class MyTree extends NscComponent {
    //instance variables
    private NscRectangle theTrunk;
    private NscUpTriangle theLeaves;

    
    /**
     * Constructor for the MyTree class.
     * Creates a MyTree object at specified location.
     * @param x the x-coordinate for the object
     * @param y the y-coordinate for the object
     */
    public MyTree(int x, int y){
        //  the constructor for the superclass
        super(x, y, 60, 125);
        
         // Create the trunk object
        theTrunk= new NscRectangle(20, 80, 20, 40);
        // Set the characteristics of the trunk
        theTrunk.setFilled(true);
        theTrunk.setBackground(new Color(0x99, 0x66, 0x33));
        add(theTrunk);
        
        // Create the leaves object
        theLeaves= new NscUpTriangle(0, 0, 60, 95);
        // Set the characteristics of the leaves
        theLeaves.setFilled(true);
        theLeaves.setBackground(new Color(30, 120, 100));
        add(theLeaves);  
        
    }
    
    
    /**
     * Overloaded Constructor for the MyTree class.
     * Creates a MyTree object at specified location and color.
     * @param x the x-coordinate for the object
     * @param y the y-coordinate for the object
     * @param color the color MyTree will be filled with. 
     */
    public MyTree(int x, int y, java.awt.Color color){
      //  the constructor for the superclass
      super(x, y, 60, 125);
      
      // Create the trunk object
      theTrunk= new NscRectangle(20, 80, 20, 40);
      // Set the characteristics of the trunk
      theTrunk.setFilled(true);
      theTrunk.setBackground(new Color(0x99, 0x66, 0x33));
      add(theTrunk);
      
      // Create the leaves object
      theLeaves= new NscUpTriangle(0, 0, 60, 95);
      // Set the characteristics of the leaves
      theLeaves.setFilled(true);
      theLeaves.setBackground(color);
      add(theLeaves);
      }
    
    
    /**
     * Change the color of the house     * 
     * @param color The color for the leaves of the house
     */
    public void setColor(java.awt.Color color) {
      theLeaves.setBackground(color);
      repaint();
    }

    
    /**
     * Retrieve the color of the leaves     * 
     * @return The color of the leaves of the tree
     */
    public java.awt.Color getColor() {
      return theLeaves.getBackground();
    }  


}