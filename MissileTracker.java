public class MissileTracker {
    private Missile[] missiles;
    private final int numOfMisel;
    public MissileTracker(Missile[] missiles,int numOfMisel){
        this.numOfMisel = numOfMisel;
        this.missiles = missiles;
    }
    public Missile[] getThMosTretning(){
        Missile[] tretMissiles;
        int numOfTretMissles=0;
        for (int i = 0; i < numOfMisel; i++) {
            if (missiles[i].isAThret()){
                numOfTretMissles++;
            }
        }
        tretMissiles = new Missile[numOfTretMissles];
        for (int i = 0; i < numOfMisel; i++) {
            if (missiles[i].isAThret()){
               tretMissiles[i]=missiles[i];
            }
        }
        return tretMissiles;
        //לא בטוח עם היתקבנתה תמיספר שלהם או תתילם עצמם
    }
}
