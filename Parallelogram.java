/**
 * Created by JASON_ on 2015/3/8.
 */
public abstract class Parallelogram implements Shape {
    protected int height, width;
    protected boolean filled = false;
    //public int i,a;

    protected void prcahr(int i, char a){
        for(int j = 1; j <= i; j++)
            System.out.print(a);
    }
}
