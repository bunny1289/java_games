import java.util.ArrayList;

public class Randomguess {
    public void number(){
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i<10;i++){
            list.add(i);
        }
        while(list.size() > 4){
            int x=(int)(Math.random()*10);
            if(x<list.size()){
                list.remove(x);
            }
        }
         
        System.out.println(list);
        }
        
        
    
    public static void main(String[] args) {
        Randomguess obj=new Randomguess();
        obj.number();

    }
    
}