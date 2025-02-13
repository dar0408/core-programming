// Write a Program to compute the volume of Earth in km^3 and miles^3
// Hint => Volume of a Sphere is (4/3) * pi * r^3 and radius of earth is 6378 km
// O/P => The volume of earth in cubic kilometers is ____ and cubic miles is ____


public class VolEarth {
    public static void main(String[] args) {
        double radius = 6378; // Radius of the Earth in kilometers

        // Calculate the volume of the Earth using the formula: (4/3) * π * r³
        double volumeInKm = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        // Convert the volume from cubic kilometers to cubic miles using the conversion factor (1 mile = 1.6 km)
        double volumeInMiles = volumeInKm / Math.pow(1.6, 3);

        System.out.println("The volume of Earth in cubic kilometers is " + volumeInKm + 
                " and in cubic miles is " + volumeInMiles);
    }
}
