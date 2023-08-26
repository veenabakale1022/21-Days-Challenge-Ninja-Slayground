import java.util.Scanner;
public class Solution {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dataType = scanner.nextLine();
        
        int size = dataTypes(dataType);
        if (size != -1) {
            System.out.println("Size of " + dataType + " datatype: " + size + " bytes");
            System.out.println("Explanation: The size of a " + dataType + " variable is given as " + size + " bytes.");
        } else {
            System.out.println("Unknown data type.");
        }
        
        scanner.close();
    }
    public static int dataTypes(String type) {
        switch (type) {
            case "Integer":
                return 4;
            case "Long":
                return 8;
            case "Double":
                return 8;
            case "Float":
                return 4;
            case "Character":
                return 1;
            default:
                return -1;
        }
        
        // Write your code here
    }
}
