/**
 * Created by JASON_ on 2015/3/8.
 */
public class Left extends Parallelogram {
    public Left(int height,int width, char filled){
        super.height = height;
        super.width = width;
        if(filled == 'y' || filled == 'Y')
            super.filled = true;
        if (filled == 'n' || filled == 'N')
            super.filled = false;
    }

    public void show(){
        if(filled == true){
            for(int i = 0; i < height; i++) {
                prcahr(i, ' ');
                prcahr(width, '#');
                System.out.println();
            }
        }
        else{
            for(int i = 0; i < height; i++){
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
