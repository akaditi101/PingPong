

public class PongPaddleTest
{
    public static void main(String[]args){
    PongPaddle pong = new PongPaddle(5, 6, 7, 8);
    System.out.println("The Right x-coordinate should be 13, it is: " + pong.getRightX());
    System.out.println("The left x-coordinate should be 6, it is: " + pong.getLeftX());
    System.out.println("The bottom y-coordinate should be 13, it is: " + pong.getBottomY());
    System.out.println("The top y-coordinate should be 5, it is: " + pong.getTopY());
    System.out.println("The x coordinates should be: 6, 13; it is: (" + pong.getLeftX() + "," + pong.getRightX() + ")");
    System.out.println("The y coordinates should be: 5, 13; it is: (" + pong.getTopY() + "," + pong.getBottomY() + ")");
    PongPaddle pong2 = new PongPaddle(10, 10, 10, 10);
    System.out.println("The Right x-coordinate should be 20, it is: " + pong2.getRightX());
    System.out.println("The left x-coordinate should be 10, it is: " + pong2.getLeftX());
    System.out.println("The bottom y-coordinate should be 20, it is: " + pong2.getBottomY());
    System.out.println("The top y-coordinate should be 10, it is: " + pong2.getTopY());
    System.out.println("The x coordinates should be: 10, 20; it is: (" + pong2.getLeftX() + "," + pong2.getRightX() + ")");
    System.out.println("The y coordinates should be: 10, 20; it is: (" + pong2.getTopY() + "," + pong2.getBottomY() + ")");
     PongPaddle pong3 = new PongPaddle(20, 20, 20, 20);
    System.out.println("The Right x-coordinate should be 40, it is: " + pong3.getRightX());
    System.out.println("The left x-coordinate should be 20, it is: " + pong3.getLeftX());
    System.out.println("The bottom y-coordinate should be 40, it is: " + pong3.getBottomY());
    System.out.println("The top y-coordinate should be 20, it is: " + pong3.getTopY());
    System.out.println("The x coordinates should be: 20, 40; it is: (" + pong3.getLeftX() + "," + pong3.getRightX() + ")");
    System.out.println("The y coordinates should be: 20, 40; it is: (" + pong3.getTopY() + "," + pong3.getBottomY() + ")");
   }   
}
