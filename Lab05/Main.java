public class Main{
    public static void main(String[] args) {
        //Arguments of 
        int x_size=Integer.valueOf(args[0]);
        int y_size=Integer.valueOf(args[1]);
        int steps=Integer.valueOf(args[2]);
        int preset=Integer.valueOf(args[3]);


        LiveGame game=new LiveGame(x_size,y_size,steps,preset);
        game.printBoard();

        game.play();
    }
}
