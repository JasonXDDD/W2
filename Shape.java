/**
 * Created by JASON_ on 2015/3/3.
 */
public interface Shape {
    int Consrectangle = 1;
    int Conssquare = 2;
    int Consupperleft = 3;
    int Consupperright = 4;
    int Consdownleft = 5;
    int Consdownright = 6;
    int Consupperisosceles = 7;
    int Consdownisosceles = 8;
    int Consrightparallelogram = 9;
    int Consleftparallelogram = 10;
    public abstract void show();
}
