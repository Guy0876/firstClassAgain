public class Taxi {
    private String taxiId;
    private int taxiNum;
    private String driverName;
    private int numPass;
    private boolean available;

    public String getTaxiId() {
        return taxiId;
    }

    public boolean isAvailable() {
        return available;
    }

    public int getNumPass() {
        return numPass;
    }

    public Taxi(String taxiId, String driverName) {
        this.taxiId = taxiId;
        this.driverName = driverName;
        this.numPass = 4;
    }
    public Taxi(String taxiId, String driverName, int numPass) {
        this.taxiId = taxiId;
        this.driverName = driverName;
        this.numPass = numPass;
    }
    public void taxiBusy() {
        this.available = false;
    }

    public String getDriverName() {
        return driverName;
    }

    public int getTaxiNum() {
        return taxiNum;
    }


}
