/**
 * Created by JASON_ on 2015/3/9.
 */
public class DownIsosceles extends Triangle{
    public DownIsosceles(int height, char filled){
        super.height = height;
        if(filled == 'y' || filled == 'Y')
            super.filled = true;
        if (filled == 'n' || filled == 'N')
            super.filled = false;
    }

    public void show(){
        if(filled == true){
            for(int i = height; i >= 1; i--) {
                prcahr(height - i ,' ');
                prcahr(i*2-1, '#');
                System.out.println();
            }
        }
        else{
            for(int i = height; i >= 1; i--){
                prcahr(height - i ,' ');
                if(i == 1 || i == height)
                    prcahr(i*2-1, '#');
                else{
                    System.out.print('#');
                    prcahr(i*2-3, ' ');
                    System.out.print('#');
                }
                System.out.println();
            }
        }

    }
}
