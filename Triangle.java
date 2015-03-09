/**
 * Created by JASON_ on 2015/3/3.
 */
public abstract class Triangle implements Shape{
    protected int height;
    protected boolean filled = false;
    //public int i,a;

    protected void prcahr(int i, char a){
        for(int j = 1; j <= i; j++)
            System.out.print(a);
    }
}
