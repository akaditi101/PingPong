
public class PongScoreTest
{
    public static void main(String[] args)
    {
        PongScore a = new PongScore();
        a.scorePoints(3);
        System.out.println("The score should be 3, it is: " + a.getScore());
    }
}
