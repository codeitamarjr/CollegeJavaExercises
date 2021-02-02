public class financeAssistant
{
    public static void main(String[] args){
        double saving = 2000.25;
        int salaryPerHour = 13;
        int weeklyWorkingHours = 20;
        int monthlyRent = 600;
        
        double savingIn3Month = saving-(monthlyRent*3)+salaryPerHour*weeklyWorkingHours*12;
        
        System.out.println("In 3 month, my saving is now: " +  savingIn3Month);
        
        double bd = 16.8;
        double totalBookPriceDublin = 16.8*12;
        
        System.out.println("is: " +  totalBookPriceDublin);
        
        System.out.format("is %.2f", totalBookPriceDublin);
        System.out.println();
        
        System.out.format("is %.2f, %.3f", totalBookPriceDublin, totalBookPriceDublin);

        
    }
}