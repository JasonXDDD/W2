/**
 * Created by JASON_ on 2015/3/8.
 */
public class Rect extends Rectangle{

    public Rect(int height, int width, char filled){
        super.height = height;
        super.width = width;
        if(filled == 'y' || filled == 'Y')
            super.filled = true;
        if (filled == 'n' || filled == 'N')
            super.filled = false;
    }

    public void show(){
        if(filled == true){
            for(int i = 1; i <= height; i++) {
                for(int j = 1; j <= width; j++)
                    System.out.printf("#");
                System.out.println();
            }
        }
        else{
            for(int i = 1; i <= height; i++){
                for(int j = 1; j <= width; j++){
                    if(i == 1 || i == height || j == 1 || j == width)
                        System.out.print('#');
                    else
                        System.out.print(' ');
                }
                System.out.println();
            }
        }

    }
}
