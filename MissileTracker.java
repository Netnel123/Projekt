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
    private String[] isOWERORNOTMISEL(String[] drones,int numOfDrones){
        String[] tretdrones;
        int numOfTretdrones=0;
        for (int i = 0; i < numOfDrones; i++) {
            if (drones[i]=="A" || drones[i]=="IRN"){
                numOfTretdrones++;
            }
        }
        tretdrones = new String[numOfDrones];
        for (int i = 0; i < numOfTretdrones; i++) {
            if (drones[i]=="A"){
                tretdrones[i]=drones[i];
            }
        }
        return tretdrones;
    }
}
