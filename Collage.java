
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
        Picture canvas = new Picture(1600, 1920);
        Picture source = new Picture("collage.jpg");
        canvas.cropAndCopy(source, 0, 799, 0, 959, 0, 0);
        Picture source2 = new Picture("collage.jpg");
        source2.negate();
        canvas.cropAndCopy(source2, 0, 799, 0, 959, 0, 960);
        Picture source3 = new Picture("collage.jpg");
        source3.mirrorHorizontal();
        canvas.cropAndCopy(source3, 0, 799, 0, 959, 800, 960);
        Picture source4 = new Picture("collage.jpg");
        source4.makeMagenta();
        canvas.cropAndCopy(source4, 0, 799, 0, 959, 800, 0);
        canvas.explore();
        canvas.write("NathanOliver.jpg");
    }
}
