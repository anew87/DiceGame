package dicegame;

/**
 * @author Anthony M Newberry
 */
public class DiceGame {

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public int Roll(int die) {
        die = (int)(Math.random()*6) + 1;
        return die;
    }
    
    public void Save() {
        
    }
    
    public void Clear() {
        
    }
}
