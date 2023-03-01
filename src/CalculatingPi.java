import java.awt.*;
import java.util.Random;
import java.util.Scanner;
/**
 * Auto Coin Lab
 * Author: Keira
 * Collaborator(s): Megan
 * On My Honor, I confirm that I followed all collaboration policy guidelines and that the work I am submitting is my own: KAK
 **/
public class CalculatingPi {
    public static void main(String[] args) {
        System.out.println("Welcome to the Monte Carlo Pi Calculator! Enter the number of points you would like to generate to calculate pi:"); // prompting the user
        Scanner s = new Scanner(System.in); // creating a scanner
        Random r = new Random(); // creating a random variable
        double points = s.nextInt(); // reading in the input and creating a variable
        double square = 500; // creating a square variable
        double circle = (500/2); // creating a circle variable
        double count = 1; // creating a count variable
        double squareArea = 500 * 500; // determining the area of the square
        double circleArea = 3.141592 * (250*250); // finding the area of the circle inside the quare
        while (count <= points) { // creating a while loop for if the points are larger than the count
            int pointX = r.nextInt(501); // finding a random x value
            int pointY = r.nextInt(502); // finding a random y value
            Point center = new Point (250, 250); // creating a center point for the circle
            Point p = new Point (pointX, pointY); // creating  point out of the random x and y values
            double distance = center.distance(p); // finding the distance from the orgin to the random point
            if (distance <= 250){ // determining if it is a circle or less than the radius of the circle
                circle++; // updating the circle variable
            }else{ // creating an else statement if it is not in the circle
                square++; // updating the square variable
            }
            count++; // updating the count variable
        }
        double calcPi = circleArea /squareArea * 4; // calculating the pi from the created points
        double pi = 3.141592; // declaring a variable for the value of pi
        double percent = (calcPi-pi)/pi * 100; // calculating the percent error/ difference between the points
        System.out.println("I calculated pi to be " + calcPi + ". The percent error is " + percent); // printing the answers
    }
}
