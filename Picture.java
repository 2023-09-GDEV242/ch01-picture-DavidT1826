/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  David Thompson
 * @version 2020-09-09
 */
public class Picture
{
    // private Square wall;
    // private Square window;
    // private Triangle roof;
    // private Circle sun;
    // private boolean drawn;
    private Person person;
    private Triangle tableBottom;
    private Square tableTop;
    private Square table;
    private Square card1;
    private Circle mars;
    private Square card2;
    private Circle jupiter;
    private Circle jupiterSpot;
    private Square card3;
    private Circle saturn;
    private Square saturnRing;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // wall = new Square();
        // window = new Square();
        // roof = new Triangle();  
        // sun = new Circle();
        // drawn = false;
        person = new Person();
        tableBottom = new Triangle();
        tableTop = new Square();
        table = new Square();
        card1 = new Square();
        mars = new Circle();
        card2 = new Square();
        jupiter = new Circle();
        jupiterSpot = new Circle();
        card3 = new Square();
        saturn = new Circle();
        saturnRing = new Square();
        drawn = false;
        
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            person.changeSize(100, 50);
            person.moveHorizontal(-250);
            person.makeVisible();
            
            tableBottom.changeColor("brown");
            tableBottom.changeSize(50, 40);
            tableBottom.moveHorizontal(-85);
            tableBottom.moveVertical(70);
            tableBottom.makeVisible();
            
            tableTop.changeColor("brown");
            tableTop.changeSize(30, 90);
            tableTop.moveHorizontal(-225);
            tableTop.moveVertical(70);
            tableTop.makeVisible();
            
            table.changeColor("brown");
            table.changeSize(550, 400);
            table.moveVertical(-300);
            table.moveHorizontal(-100);
            table.makeVisible();
            
            card1.changeColor("black");
            card1.changeSize(100, 75);
            card1.moveVertical(-110);
            card1.moveHorizontal(-80);
            card1.makeVisible();
            
            card2.changeColor("black");
            card2.changeSize(100, 75);
            card2.moveVertical(-30);
            card2.moveHorizontal(70);
            card2.makeVisible();
            
            card3.changeColor("black");
            card3.changeSize(100, 75);
            card3.moveVertical(70);
            card3.moveHorizontal(-80);
            card3.makeVisible();
        }
    }

    /**
     * Change this picture to black/white display
     */
    // public void setBlackAndWhite()
    // {
        // wall.changeColor("black");
        // window.changeColor("white");
        // roof.changeColor("black");
        // sun.changeColor("black");
    // }

    /**
     * Change this picture to use color display
     */
    // public void setColor()
    // {
        // wall.changeColor("red");
        // window.changeColor("black");
        // roof.changeColor("green");
        // sun.changeColor("yellow");
    // }
}