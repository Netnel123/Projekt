public class Missile {
    private final int id;
    private int distance;
    public String[] type;
    public Missile(int id,int distance,String[] type){
        this.id = id;
        this.distance = distance;
        this.type = type;
    }
    public boolean isAThret(){
        if (distance<1000){
            return true;
        }else {
            return false;
        }
    }
}
