public class Main {
    public static void main(String[] args) {
        DbFunctions dbFunctions = new DbFunctions();
        dbFunctions.connectToDb("route", "postges", "istanbul");
    }
}