public class Box {
    private int width, length, height;
    private int volume;
    Box(int w, int l, int h){
        width = w;
        length = l;
        height = h;
        volume = w * l * h;
    }

    public int getVolume(){
        return volume;
    }

    Box whosLargest(Box box1, Box box2){
    
        if(box1.volume > box2.volume){
            return box1;
        }else{
            return box2;
        }
    }

    boolean isSameBox(Box box){
       
        if(width == box.width && length == box.length && height == box.height){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Box b1 = new Box(10, 20, 50);
        Box b2 = new Box(10, 30, 30);
        System.out.println("첫 번째 박스의 부피 : " + b1.getVolume());
        System.out.println("두 번째 박스의 부피 : " + b2.getVolume());
    }

}
