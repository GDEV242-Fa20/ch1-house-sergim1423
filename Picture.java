 /**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Sergius Manolov
 * @version 2020-09-16 
 */
public class Picture
{
    private Square backsun;
    //private Square wall;
    //private Square window;
    private Triangle grass1;
    private Triangle grass2;
    private Triangle grass3;
    private Triangle grass4;
    private Circle sun;
    private Person guy;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        //wall = new Square();
        //window = new Square();
        //roof = new Triangle(); 
        grass1 = new Triangle();
        grass2 = new Triangle();
        grass3 = new Triangle();
        grass4 = new Triangle();
        guy = new Person();
        backsun = new Square (); 
        sun = new Circle();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            backsun.moveHorizontal(230);
            backsun.moveVertical(80);
            backsun.changeSize(100);
            backsun.changeColor("red");
            backsun.makeVisible();
            
            sun.changeColor("yellow");
            sun.moveHorizontal(230);
            sun.moveVertical(90);
            sun.changeSize(100);
            sun.makeVisible();
    
            guy.changeSize(60, 30);
            guy.moveHorizontal(280);
            guy.moveVertical(190);
            guy.changeColor("black");
            guy.makeVisible();
    
            grass1.changeColor("green");
            grass1.moveHorizontal(220);
            grass1.moveVertical(180);
            grass1.changeSize(50, 40);
            grass1.makeVisible();
            
            grass2.changeColor("green");
            grass2.moveHorizontal(240);
            grass2.moveVertical(180);
            grass2.changeSize(50, 40);
            grass2.makeVisible();
            
            grass3.changeColor("green");
            grass3.moveHorizontal(340);
            grass3.moveVertical(180);
            grass3.changeSize(50, 40);
            grass3.makeVisible();
            
            grass4.changeColor("green");
            grass4.moveHorizontal(320);
            grass4.moveVertical(180);
            grass4.changeSize(50, 40);
            grass4.makeVisible();
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        //wall.changeColor("black");
        //window.changeColor("white");
        //roof.changeColor("black");
        grass1.changeColor("black");
        grass2.changeColor("black");
        grass3.changeColor("black") ;
        grass4.changeColor("black") ;
        guy.changeColor("white");
        backsun.changeColor("white");
        sun.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        //wall.changeColor("red");
        //window.changeColor("black");
        //roof.changeColor("green");
        sun.changeColor("yellow");
        grass1.changeColor("green");
        grass2.changeColor("green");
        grass3.changeColor("green") ;
        grass4.changeColor("green") ;
        guy.changeColor("black");
        backsun.changeColor("red");
    }
}
