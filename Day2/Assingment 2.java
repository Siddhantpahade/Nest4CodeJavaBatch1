public class Convertor
{
    public static void main(String[] args)
    {
        double result_height  = heightConvertor(5,10);
        double result_weight = weightConvertor(60);
        System.out.println("Height in cm : " + result_height);
        System.out.println("Weight in pounds : " + result_weight);
    }    

    static double heightConvertor(int heightFeetPart, int heightInchPart)
    {
        double cm = ((heightFeetPart*30.48 ) + (heightInchPart*2.54));
        return cm;
    }
    
    static double weightConvertor(int weight)
    {
        double pounds = (2.2*weight);
        return pounds;
    }
}