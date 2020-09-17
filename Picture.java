 /**
 * This class represents a simple picture. This picture shows a guy looking at a sunset while siting in grass.
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
            backsun.moveHorizontal(-30);
            backsun.moveVertical(5);
            backsun.changeSize(100);
            backsun.changeColor("red");
            backsun.makeVisible();
            
            sun.changeColor("yellow");
            sun.moveHorizontal(50);
            sun.moveVertical(30);
            sun.changeSize(100);
            sun.makeVisible();
    
            guy.changeSize(60, 30);
            guy.moveHorizontal(50);
            guy.moveVertical(5);
            guy.changeColor("black");
            guy.makeVisible();
    
            grass1.changeColor("green");
            grass1.moveHorizontal(80);
            grass1.moveVertical(70);
            grass1.changeSize(50, 40);
            grass1.makeVisible();
            
            grass2.changeColor("green");
            grass2.moveHorizontal(100);
            grass2.moveVertical(70);
            grass2.changeSize(50, 40);
            grass2.makeVisible();
            
            grass3.changeColor("green");
            grass3.moveHorizontal(150);
            grass3.moveVertical(70);
            grass3.changeSize(50, 40);
            grass3.makeVisible();
            
            grass4.changeColor("green");
            grass4.moveHorizontal(170);
            grass4.moveVertical(70);
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
        backsun.changeColor("white");
        sun.changeColor("black");
        guy.changeColor("white");
        grass1.changeColor("black");
        grass2.changeColor("black");
        grass3.changeColor("black") ;
        grass4.changeColor("black") ;
        
       
        
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        //wall.changeColor("red");
        //window.changeColor("black");
        //roof.changeColor("green");
        backsun.changeColor("red");
        sun.changeColor("yellow");
        guy.changeColor("black");
        grass1.changeColor("green");
        grass2.changeColor("green");
        grass3.changeColor("green") ;
        grass4.changeColor("green") ;
        
        
    }
}
