package uebung10.vzb.ch.zhaw.anderni2;

public class Lieferung extends Liefertour{



    private int plz;
    private String empfaenger;

    public Lieferung (int plz, String empfaenger){
        this.plz = plz;
        this.empfaenger = empfaenger;
    }




    public int getPlz(){
        return plz;
    }

    public String getEmpfaenger(){
       return empfaenger;
    }

    public void print(){

    }
}
