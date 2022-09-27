public class Main{
    public static void main(String[] args){
        NumberOfDaysInMonth numberOfDaysInMonth = new NumberOfDaysInMonth();
        System.out.println(numberOfDaysInMonth.getNumberOfDaysInMonth(1, 1));
        System.out.println(numberOfDaysInMonth.getNumberOfDaysInMonth(4, 10000));
        System.out.println(numberOfDaysInMonth.getNumberOfDaysInMonth(16, 824));
        System.out.println(numberOfDaysInMonth.getNumberOfDaysInMonth(2, 2000));
        System.out.println(numberOfDaysInMonth.getNumberOfDaysInMonth(2, 2022));
        System.out.println(numberOfDaysInMonth.getNumberOfDaysInMonth(7, 0));
        System.out.println(numberOfDaysInMonth.getNumberOfDaysInMonth(9, 1973));
    }
}
