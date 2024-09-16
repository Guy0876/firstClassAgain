public class TaxiStation {
    private String stationName;
    private Taxi [] taxies;
    private int counter;

    public TaxiStation(String stationName, Taxi[] taxies) {
        this.stationName = stationName;
        this.taxies = new Taxi[80];
    }
    public void addTaxi(String driverName, String taxiId, int numPass){

        this.taxies[counter] = new Taxi(driverName, taxiId, numPass);
        counter++;
    }
    public int getCounter() {
        return counter;
    }
    private String getTaxi(int peopleNum){
        for (int i = 0; i < getCounter(); i++) {
            if(this.taxies[i].isAvailable() && this.taxies[i].getNumPass() == peopleNum) {
                this.taxies[i].taxiBusy();
                return this.taxies[i].getTaxiId();
            }
        }
        return "-1";
    }
}
