public class StudentResult{
    public static void main(String[] args) {
        int tamil = Integer.parseInt(args[0]);
        int english = Integer.parseInt(args[1]);
        int maths = Integer.parseInt(args[2]);
        int social = Integer.parseInt(args[3]);
        int science = Integer.parseInt(args[4]);

        int total = totalMarks(tamil, english, maths, social, science);
        System.out.println("Your Result is : " + result(tamil, english, maths, social, science));
        System.out.println("You have scored " + total + " marks out of 500");
        System.out.println("Your overall percentage is : " + marksPercentage(total, 500));
        System.out.println("Average marks : " + marksAverage(tamil, english, maths, social, science));
    }
    public static int totalMarks(int tamil, int english, int maths,int social, int science){
        return tamil + english + maths + social + science;
    }

     public static String result(int tamil, int english, int maths,int social, int science){
        if (tamil >= 35 || english >= 35 || maths >= 35 || social >= 35 || science >= 35 ){
            return "pass";
        }
        else {
            return "fail";
        }
    }

    public static double marksPercentage(int sum, int d){
        return (double) sum / d * 100;
    }

    public static double markscd erage(int tamil, int english, int maths,int social, int science){
        int [] numbers = {tamil, english, maths, social, science};
            int sum = 0;
            for (int num : numbers) {
                sum += num;
            }
            return (double) sum / numbers.length;

    }
    
}