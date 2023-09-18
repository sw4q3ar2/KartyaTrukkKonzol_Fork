package kartyatrukkkonzolon;

public class Pakli {
    
    private final static String[] pakli = new String[22];
    
    public Pakli() {
        feltolt();
        kirak();
        kever();
        ezVolt();
    }
    
    private void feltolt() {
        String[] szinek = {"P", "T", "Z", "M"};
        String[] ertekek = {"Ász", "Kir", "Fel", "X", "IX", "VIII"};
        int i = 1;
        for (String szin : szinek) {
            for (int e = 0; e < ertekek.length && i < pakli.length; e++) {
                pakli[i++] = szin + "_" + ertekek[e];
            }
        }
    }
    
    private void kirak() {
        for (int i = 1; i < pakli.length; i++) {
            System.out.print(pakli[i] + " ");
            if (i % 3 == 0) {
                System.out.println("");
            }
        }
    }
    
    private void kever() {
        // mindig középre a választott
    }
    
    private void ezVolt() {
        System.out.println("A választott lap: " + pakli[11]);
    }
}