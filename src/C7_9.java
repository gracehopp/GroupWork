import java.util.Scanner;
public class C7_9 {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        // prompts the user to fill the array with ten values
        double[] array = new double[10];
        System.out.print("Enter 10 numbers >> ");
        
        for (int i = 0; i < array.length; i++){
            array[i] = input.nextDouble();
        }
        
        // calls and prints the min value
        System.out.print("The minimum value is ");
        System.out.println(min(array));
        
    }
    
    
    // method uses a for loop to find the minimum value in the array
    public static double min(double[] array) {
    double min = array[0];
    for (int i = 1; i < array.length; i++) {
        if (array[i] < min) {
            min = array[i];
        }
    }
    return min;
}

}
