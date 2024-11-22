package Moves;
import ru.ifmo.se.pokemon.*;

public class FlareBlitz  extends PhysicalMove {
    public FlareBlitz(){
        super(Type.FIRE, 120, 100);
    }
    private boolean flag;

    @Override
    protected void applyOppEffects(Pokemon p){
        if (Math.random()<0.1) {
            flag=true;
            Effect.burn(p);
        }
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        if (p.getCondition().equals(Status.FREEZE)){
            p.setCondition(new Effect().condition(Status.NORMAL));
        }}

    @Override
    protected void applySelfDamage(Pokemon p, double damge){
        damge=damge/3;
        p.setMod(Stat.HP,(int)damge);

    }
    protected String describe(){
        if (flag){
            return "Использует Flare Blitz и поджигает";
        }
        return  "Использует Flare Blitz";
    }
}
