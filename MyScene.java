// Allow short name access to java.awt.Color
import java.awt.Color;

/**
 * This is the shell for assignment: MyScene.
 * This program draws a simple scene using additional
 * classes that the student creates.
 * 
 
 * @author updated by Olga Sirotinsky
 * @version Assignment 4: MyScene (standard)
 */
public class MyScene extends NscWindow {

  // instance variables
  private MyHouse house;
  private MyHouse house2;
  private MyHouse house3;
  private MyTree tree1;
  private MyTree tree2;
  private MyTree tree3;
  
  
  /**
   * Constructor for objects of class MyScene
   */
  public MyScene() {
    // Specify the constructor for the superclass
    super(10, 10, 400, 300);
    // set characteristics for the object
    setTitle("My Scene");
    
    // Draw the sky
    getContentPane().setBackground(new Color(0x00, 0xCC, 0xFF));
    
    // Draw some grass
    NscRectangle grass = new NscRectangle(0, 100, 400, 200);
    grass.setBackground(new Color(0x00, 0x99, 0x00));
    grass.setFilled(true);
    add(grass);
    
    //draw tree(s)
     tree1= new MyTree(10, 15); 
     add(tree1);
     tree2= new MyTree(315, 20);
     add(tree2);
     tree3= new MyTree(40, 115, Color.orange);
     add(tree3);
    
    // Draw a house(s)
    house = new MyHouse(100, 110);
    add(house);
    house2 = new MyHouse(200, 30, Color.MAGENTA);
    add(house2);
    house3 = new MyHouse(255, 130, Color.YELLOW);
    add(house3);    
    
     // request a rerendering of the window
    repaint();       
  }
  
  
  /**
   * Alter the scene, by changing colors
   */
  public void change1() {
    // change the color of the house
    house.setColor(Color.red);
    house2.setColor(Color.pink);
    house3.setColor(Color.CYAN);
    
    //change the color of the tree
    tree1.setColor(Color.red);
    tree2.setColor(Color.orange);
    tree3.setColor(Color.green);
    
    // request a rerendering of the window
    repaint();
  }
  
  
  /**
   * Alter the scene, by changing location
   */
  public void change2() {
    // change the location of the house
    house.setLocation(40, 115);
      
    //change location of the trees
    tree1.setLocation(100,0);
    tree2.setLocation(10, 20);
    tree3.setLocation(200, 130);
    
    // request a rerendering of the window
    repaint();
  }
  
  /**
   * Alter the scene, by changing size
   */
  public void change3() {
    // change the size of the house
    house.setSize(80, 60);
    // request a rerendering of the window
    repaint();
  }
  
  /**
   * Alter the scene, restoring original settings
   */
  public void reset() {
    // reset the initial values for the house 
    house.setLocation(95, 105);
    house.setColor(Color.blue);
    house2.setColor(Color.MAGENTA);
    house3.setColor(Color.yellow);
    //house.setSize(120, 90);
    
    //reset initial values for trees 
    tree1.setLocation(10, 15);
    tree2.setLocation(315, 20);
    tree3.setLocation(40, 115);
    tree1.setColor(new Color(30, 120, 100));
    tree2.setColor(new Color(30, 120, 100));
    tree3.setColor(Color.orange); 
    
    // request a rerendering of the window
    repaint();
  }
  
  /**
   * The application method, to test your code
   *
   * @param args The command-line arguments
   */
  public static void main(String[] args) {

     // declare a MyScene reference
     MyScene aScene;
     // instantiate MyScene
     aScene = new MyScene();
     // pause
     javax.swing.JOptionPane.showMessageDialog(null, "Press OK to continue");

     // test setColor
     aScene.change1();
     javax.swing.JOptionPane.showMessageDialog(null, "Press OK to continue");

     // test setLocation
     aScene.change2();
     javax.swing.JOptionPane.showMessageDialog(null, "Press OK to continue");

     // test setSize
     //I am commenting this section out because it is not called for in Standard version.  
     //aScene.change3(); 
     //javax.swing.JOptionPane.showMessageDialog(null, "Press OK to continue");

     // reset initial values
     aScene.reset();
  }
  
}
