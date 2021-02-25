import processing.core.PApplet;

public class BallParameters {
    PApplet object;
    private final int DIAMETER=10;
    private int CoordinateX;
    private int steps;
    private int Height;

    public BallParameters(PApplet object,int steps,int Height)
    {
        this.object=object;
        CoordinateX=0;
        this.steps=steps;
        this.Height=Height;

    }

    public void drawBall(){
        object.ellipse(CoordinateX,Height,DIAMETER,DIAMETER);
        MoveForward();
    }

    public void MoveForward() {
        this.CoordinateX+=steps;
    }

}
