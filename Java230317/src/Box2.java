package Java230317.src;

public class Box2 {
    int width;
    int length;
    int height;
    Box2(int w, int l, int h){
        width = w;
        length = l;
        height = l;
    }
    boolean isSameBox(Box2 obj){
        if((obj.width == width) && (obj.length == length) && (obj.height == height)){
            return true;
        }else{
            return false;
        }
    }
}
