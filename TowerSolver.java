
public class TowerSolver {
    private TowerModel model;

    public TowerSolver()
    {
        // Nothing to do here
    }

    public void solve(TowerModel model)
    {
        this.model = model;
        // Call the missing solve method (not this one)
        
    }
    
    // Create an overloaded solve(...) method
    // This new method will be recursive (call itself)
    //
    // [ solve method here]
    public int solve(int j){
        return( (int)Math.pow(j, 2)-1);
    }
    
    //

}
