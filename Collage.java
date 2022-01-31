
/**
 * Write a description of class Collage here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Collage
{
    public static void collage()
    {
        Picture canvas = new Picture(1200, 960);
        Picture source = new Picture("collage.jpg");
        canvas.explore();
        //canvas.cropAndCopy(source, 0, 799, 0, 959, 0, 0);
        canvas.explore();
    }
}
