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
 * 
 * Esentially, the left side of the picuture shows a person looking at a table. 
 * The right side of the picture shows the top of the table, which contains
 * three cards. The three cards represent three planets: Mars, Jupiter, and Saturn. 
 * I also had to adjust the Square class so that the length and width
 * could be adjusted, so that I could get the cards and the table top to 
 * the proper dimentions, and I added the color brown in Canvas to use for the table.
 * 
 */
public class Picture
{
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
            
            mars.changeColor("red");
            mars.changeSize(30);
            mars.moveVertical(-60);
            mars.moveHorizontal(15);
            mars.makeVisible();
            
            card2.changeColor("black");
            card2.changeSize(100, 75);
            card2.moveVertical(-20);
            card2.moveHorizontal(70);
            card2.makeVisible();
            
            jupiter.changeColor("yellow");
            jupiter.changeSize(55);
            jupiter.moveVertical(20);
            jupiter.moveHorizontal(155);
            jupiter.makeVisible();
            
            jupiterSpot.changeColor("red");
            jupiterSpot.changeSize(20);
            jupiterSpot.moveVertical(40);
            jupiterSpot.moveHorizontal(165);
            jupiterSpot.makeVisible();
            
            card3.changeColor("black");
            card3.changeSize(100, 75);
            card3.moveVertical(70);
            card3.moveHorizontal(-80);
            card3.makeVisible();
            
            saturn.changeColor("yellow");
            saturn.changeSize(45);
            saturn.moveVertical(115);
            saturn.moveHorizontal(15);
            saturn.makeVisible();
            
            saturnRing.changeColor("white");
            saturnRing.changeSize(5, 44);
            saturnRing.moveVertical(105);
            saturnRing.moveHorizontal(-64);
            saturnRing.makeVisible();
            
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
     {
       tableBottom.changeColor("black");
       tableTop.changeColor("black");
       table.changeColor("black");
       card1.changeColor("white");
       mars.changeColor("black");
       card2.changeColor("white");
       jupiter.changeColor("black");
       jupiterSpot.changeColor("white");
       card3.changeColor("white");
       saturn.changeColor("black");
       saturnRing.changeColor("white");
       
     }

    /**
     * Change this picture to use color display
     */
    public void setColor()
     {
        tableBottom.changeColor("brown");
        tableTop.changeColor("brown");
        table.changeColor("brown");
        card1.changeColor("black");
        mars.changeColor("red");
        card2.changeColor("black");
        jupiter.changeColor("yellow");
        jupiterSpot.changeColor("red");
        card3.changeColor("black");
        saturn.changeColor("yellow");
        saturnRing.changeColor("white");
     }
}