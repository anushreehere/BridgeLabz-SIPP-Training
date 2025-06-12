public class q3 {
    public static void main(String[] args) {
        double radiusKm = 6378; // radius of Earth in kilometers
        double radiusMiles = radiusKm * 0.621371; // converting km to miles

        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);
        double volumeMiles3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);

        System.out.println("The volume of Earth in cubic kilometers is " + volumeKm3 + " and cubic miles is " + volumeMiles3);
    }
}
