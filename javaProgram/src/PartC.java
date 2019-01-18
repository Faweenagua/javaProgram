public class PartC {



    private static String reverseString(String statement){
        String reverse = "";
        for(int i=statement.length()-1; i>-1; i--){
            reverse = reverse.concat("" + statement.charAt(i));
        }
        return reverse;
    }

    private static void circumArea(double radius){
        double circumference = 2*Math.PI*radius;
        double area = Math.PI*radius*radius;
        System.out.println("Area: " + area + " units square\nCircumference: "+ circumference +" units\n");
    }

    public static void main(String[] args) {
        circumArea(7);
    }
}
