/**
 * Created by JASON_ on 2015/3/8.
 */
public class Right extends Parallelogram {
    public Right(int height,int width, char filled){
        super.height = height;
        super.width = width;
        if(filled == 'y' || filled == 'Y')
            super.filled = true;
        if (filled == 'n' || filled == 'N')
            super.filled = false;
    }

    public void show(){
        if(filled == true){
            for(int i = height - 1; i >= 0; i--) {
                prcahr(i, ' ');
                prcahr(width, '#');
                System.out.println();
            }
        }
        else{
            for(int i = height - 1; i >= 0; i--){
                prcahr(i, ' ');
                if(i == 0 || i == height-1)
                    prcahr(width, '#');
                else{
                    System.out.printf("#");
                    prcahr(width - 2, ' ');
                    System.out.printf("#");
                }

                System.out.println();
            }
        }

    }
}
