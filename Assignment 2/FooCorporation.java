import java.util.Scanner;
class FooCorporation  {
    static void employeePay(float base, float hours){
        float pay = 0;
        if(hours > 60){
            System.out.println("ERROR: Employee cannot work for more than 60 hours a week.");
        }else if(base < 8){
            System.out.println("ERROR: Employee requires a minimum wage of atleast $8.00 an hour.");
        }else{
            if(hours>40){
                pay += 40*base;
                hours -= 40;
                pay += (1.5*hours*base);
            }else{
                pay += hours*base;
            }
            System.out.println("Total pay for employee : $" + pay);
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float base1, hours1, base2, hours2, base3, hours3;
        System.out.println("Enter the base pay for Employee 1 : ");
        base1 = s.nextFloat();
        System.out.println("Enter the hours worked by Employee 1 : ");
        hours1 = s.nextFloat();
        System.out.println("Enter the base pay for Employee 2 : ");
        base2 = s.nextFloat();
        System.out.println("Enter the hours worked by Employee 2 : ");
        hours2 = s.nextFloat();
        System.out.println("Enter the base pay for Employee 3 : ");
        base3 = s.nextFloat();
        System.out.println("Enter the hours worked by Employee 3 : ");
        hours3 = s.nextFloat();
        employeePay(base1, hours1);
        employeePay(base2, hours2);
        employeePay(base3, hours3);
    }
}