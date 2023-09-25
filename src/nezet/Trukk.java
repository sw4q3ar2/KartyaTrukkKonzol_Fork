
package nezet;

import main.*;
import java.util.Scanner;
import modell.Lap;
import modell.Pakli;

public class Trukk {
    
    private static Scanner sc;
    private final Pakli pakli;
    
    public Trukk() {
        Trukk.sc = new Scanner(System.in);
        pakli = new Pakli();
        indit();
    }
    
    private int melyik(){
        boolean jo;
        int oszlop;
        do {
            System.out.print("melyik oszlop (1-3): ");
            oszlop = sc.nextInt();
            jo = oszlop >= 1 && oszlop <= 3;
        } while (!jo);
        return oszlop;
    }
    
    void indit(){
        for (int i = 0; i < 3; i++) {
            System.out.println(kirak());
            int oszlop = melyik();
            pakli.kever(oszlop);
        }
        System.out.print("A kiválasztott lap: " + pakli.ezVolt().getLeiras());
    }
    
    public String kirak(){
        
       StringBuilder txt = new StringBuilder();
       
        for (int i = 1; i < pakli.getLapok().length; i++) {
            txt.append(String.format("%-8s", pakli.getLapok()[i].getLeiras()));
            if (i % 3 == 0) {
                txt.append(System.lineSeparator());
            }
        }
        return txt.toString();
    }



}
