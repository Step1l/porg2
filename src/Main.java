import ru.ifmo.se.pokemon.*;
import MyPokemons.*;
public class Main {
    public static void main(String[] args){
        Battle b = new Battle();
        Pokemon p1 = new Volcanion("вулкан", 1);
        Pokemon p2 = new Clauncher("рак", 1);
        Pokemon p3 = new Clawitzer("супер рак",1);
        Pokemon p4 = new Seedot("орех",1);
        Pokemon p5 =new Nuzleaf("орех с ногами",1);
        Pokemon p6=new Shiftry("орех с листьями", 1);
        b.addFoe(p1);
        b.addFoe(p2);
        b.addFoe(p3);
        b.addAlly(p4);
        b.addAlly(p5);
        b.addAlly(p6);
        b.go();
    }
}
