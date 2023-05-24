package HomeWork_Week3;

/**
 * Wall area
 */

public class Wall
{
    double width;
    double height;

    public static void main(String[] args){
        Wall wall = new Wall (5, 4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());

    }
    public Wall()
    {

    }


    public Wall(double width, double height)
    {
        if (width < 0.0){
            this.width = 0;
        } else {
            this.width = width;
        }

        if (height < 0.0)
        {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getWidth ()
    {
        return this.width;
    }

    public double getHeight ()
    {
        return this.height;
    }

    public double setWidth (double width)
    {
        if (width < 0.0){
            this.width = 0;
        } else {
            this.width = width;
        }
        return width;
    }

    public double setHeight (double height)
    {
        if (height < 0.0){
            this.height = 0;
        } else {
            this.height = height;
        }
        return height;
    }

    public double getArea ()
    {
        return this.width * this.height;
    }
}
