/**
 * Created by JASON_ on 2015/3/3.
 */

public class DownLeft extends Triangle {

    public DownLeft(int height, char filled){
        super.height = height;
        if(filled == 'y' || filled == 'Y')
            super.filled = true;
        if (filled == 'n' || filled == 'N')
            super.filled = false;
    }

    public void show(){
        if(filled == true){
            for(int i = height; i >= 1; i--) {
                prcahr(i, '#');
                System.out.println();
            }
        }
        else{
            for(int i = height; i >= 1; i--){
                if(i == 1 || i == height)
                    prcahr(i, '#');
                else{
                    System.out.print('#');
                    prcahr(i-2, ' ');
                    System.out.print('#');
                }
                System.out.println();
            }
        }

    }
}