package E_23;


public class DMaker {

    public boolean Decide(String decision){
        if(decision.compareTo("y") == 0 || decision.compareTo("Y") == 0){
            return true;
        }else{
            return false;
        }
    }

}
