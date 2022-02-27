package ro.itschool.Incapsulare;

public class PC {

    private int numarProcesoare;
    private int memorieRam;
    private int capacitateHDD;

    public void setNumarProcesoare(int nrProcesoare){
        if(nrProcesoare > 0 ){
            numarProcesoare = nrProcesoare;
        }
    }

    public void setMemorieRam(int memorieRam){
        this.memorieRam = memorieRam;
    }

    public void setCapacitateHDD(int capacitateHDD){
        this.capacitateHDD = capacitateHDD;
    }

    public int getMemorieRam(){
        return memorieRam;    // merge si this.memorieRam
    }

    public int getNumarProcesoare(){
        return numarProcesoare;
    }

    public int getCapacitateHDD(){
        return capacitateHDD;
    }
}
