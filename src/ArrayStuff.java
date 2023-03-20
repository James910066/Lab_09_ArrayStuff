import java.util.Scanner; //Import of Scanner Utility
import java.util.Random; //Import of Random generator utility

public class ArrayStuff
{
    public static void main(String[] args)
    {   //1a.
        int[] dataPoints; //Declaration of integer array
        dataPoints = new int[100]; //Set index size of the array
        Scanner in = new Scanner(System.in); //Scanner for user input
        Random rnd = new Random(); //Variable name assignment of Random utility
        int total = 0; //Declaration and assignment of variable for holding sum of the array
        //1b.
        for (int x = 0; x < dataPoints.length; x++) //For loop to iterate through the array to last index
            {
                dataPoints[x] = rnd.nextInt(100) + 1; //Assigning random integer to each index of the array using numbers between 1 and 100
                //System.out.println(x + " " + dataPoints[x]); //Output of each index and it's random integer in sequence
            }
//////////////////////////////////////////////////////////////////////////////////
        //1c.
        for (int x = 0; x < dataPoints.length; x++) //For loop to iterate through the array to last index
            {
                    System.out.printf(dataPoints[x] + " | "); //Formatting output of each number in array separated by pipe on single line
            }
        System.out.println(); //Add line because previous output does not.
//////////////////////////////////////////////////////////////////////////////////
        //1d. Average
        for (int x = 0; x < dataPoints.length; x++) //For loop to iterate through the array to last index
            {
                total = total + dataPoints[x]; //Accumulating sum for adding each index to variable per loop
            }
        int avg = total / dataPoints.length; //Calculating average and assigning variable the value
        System.out.println("The average of the array is " + avg); //Output array average to user
////////////////////////////////////////////////////////////////////////////////
        //1d. Sum
        total = 0; //Resetting variable to zero from last assigned value from previous program block
        for (int x = 0; x < dataPoints.length; x++) //For loop to iterate through the array to last index
            {
                total = total + dataPoints[x]; //Accumulating sum for adding each index to variable per loop

            }
        System.out.println("The total of the array is " + total); //Output the array total to user
//////////////////////////////////////////////////////////////////////////////////
        //2a & 2b
        int findIntNum = 0; //Declaring variable to set user input to
        boolean foundIntNum = false; //Boolean variable used for decision logic if input is found or not
        int count = 0; //Variable to track how many times a number was found in the array
        findIntNum = SafeInput.getRangedInt(in, "Enter number to search", 1, 100); //Calling method and assigning legit value if in range to variable
        for (int x = 0; x < dataPoints.length; x++) //For loop to iterate through the array to last index
            {
                if (dataPoints[x] == findIntNum) //Check to see if user input is found in array
                    {
                        count = count + 1; //Accumulating each time user input is found to final total
                    }
            }
            if(count != 0) //Check if number was found
                {
                    System.out.println("Found number " + findIntNum + " this many times: " + count); //Output to user that number was found and how many times
                }
           else //If no number found
               {
                    System.out.println("Your number " + findIntNum + " was not found"); //Output to user that their number was not found
               }

////////////////////////////////////////////////////////////////////////////////////
        //2c.
        int findInt; //Declaring variable to set user input to
        boolean foundInt = false; //Boolean variable used for decision logic if input is found or not
        foundInt = false; //Resetting boolean variable
        findInt = SafeInput.getRangedInt(in, "Enter number to search", 1, 100); //Calling method and assigning legit value if in range to variable
        for (int x = 0; x < dataPoints.length; x++) //For loop to iterate through the array to last index
            {
                if (dataPoints[x] == findInt) //Check to see if user input is found in array
                    {
                        foundInt = true; //Reset variable to break for loop when input is found
                        System.out.println("The value " + findInt + " that you entered was found at index location " + x); //Output to user stating number was found and which index in array
                        break; //Stop loop when value entered is first found in array
                    }
            }
        if(!foundInt) //Last block to run when user input is not found
            {
                System.out.println("The value " + findInt + " was not found"); //Output to user that their number was not found
            }
////////////////////////////////////////////////////////////////////////////////////
        //2d.
        int min = dataPoints[0]; //Setting first index value to variable as smallest value
        int max = dataPoints[0]; //Setting first index value to variable as largest value
        for (int x = 0; x < dataPoints.length; x++) //For loop to iterate through the array to last index
            {
               if(min > dataPoints[x]) //Check if variable value is larger than value at each index per loop
                   {
                       min = dataPoints[x]; //Resetting variable to new smaller value found at current array index being compared
                   }
               if(max < dataPoints[x]) //Check if variable value is smaller than value at each index per loop
                   {
                        max = dataPoints[x]; //Resetting variable to new larger value found at current array index being compared
                   }
            }
        System.out.println("The minimum value in the array is " + min); //Output of smallest value in the array to user
        System.out.println("The maximum value in the array is " + max); //Output of largest value in the array to user
////////////////////////////////////////////////////////////////////////////////////
    // 2e.
        double[] doubleArray ; //Declaration of new array
        double arrayTotal = 1.0; //Declaring and assigning of variable
        doubleArray = new double[100]; //Setting size of array
        System.out.println("Average of doubleArray is: " +  getAverage(doubleArray)); //Call on method to find AVG of array if input is a legit double. Format to 2 decimal places to compare against test
        for (int x = 0; x < doubleArray.length; x++) //For loop to iterate through the array to last index
            {
                arrayTotal = arrayTotal + doubleArray[x]; //Accumulating sum for adding each index to variable per loop
            }
        double arrayAvg = arrayTotal / doubleArray.length; //Calculating average and assigning variable the value
        System.out.println("Testing the avg function of method " + arrayAvg); //Verifying that the method is averaging correctly
   }
////////////////////////////////////////////////////////////////////////////////////
    //2e Static method getAverage
    public static double getAverage(double doubleArray[]) //Creation of static method for getting average of array
    {
        double total = 0; //Declaring and initializing variable
        double avg =0; //Declaring and initializing variable
        Random rnd = new Random(); //Variable name assignment of Random utility
        for (int x = 0; x < doubleArray.length; x++) //For loop to iterate through the array to last index.
            {
                doubleArray[x] = rnd.nextInt(100) + 1; //Use Random generator to assign value to each index in the array
                total = total + doubleArray[x]; //Accumulating of each value in array to new total
                avg = total / doubleArray.length; //Calculating average of array
            }
        return avg; //This returns the value of avg variable back to main method where getAverage method was called.
    }
}