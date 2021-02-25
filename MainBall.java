import processing.core.PApplet;

public class MainBall extends PApplet{

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int BALLNUMBER = 4;
    BallParameters[] Balls;

    public static void main(String[] args) {
        PApplet.main("MainBall",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH,HEIGHT);
        InitializeBalls();
    }

    public void InitializeBalls()
    {
        Balls=new BallParameters[BALLNUMBER];
        for (int i=0;i<BALLNUMBER;i++){
            Balls[i]=new BallParameters(this,i+1,(i+1)*HEIGHT/5);
        }
    }
    @Override
    public void draw() {
        for (BallParameters Ball:Balls){
            Ball.drawBall();

        }
    }
}
