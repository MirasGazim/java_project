class Employee{
    double basePay, hoursWorked;

    Employee(double basePay, double hoursWorked){
        this.basePay = basePay;
        this.hoursWorked = hoursWorked;

    }   

    double calculateSalary() {
        if (basePay < 8.00) {
            System.out.println("error: Basic bid " + basePay + "ниже минимальной $8.00. ");
            return -1;
        } if (hoursWorked > 60) {
            System.out.println("error: отработано " + hoursWorked + " часов ю что превышает максимум (60 часов)");
            return -1;
        }

        double salary = 0;

        if (hoursWorked <= 40){
            salary = basePay * hoursWorked;
        } else {
            double overtime = hoursWorked - 40;
            salary = (basePay * 40) + (overtime * basePay * 1.5);
        }
        return salary;

    
    }

}

public class lab3{
    public static void main(String[] args){
        Employee emp1 = new Employee(7.50, 35);
        Employee emp2 = new Employee(8.20, 47);
        Employee emp3 = new Employee(10.00, 73);

        System.out.println( "Зарплата содтрудника 1: " + emp1.calculateSalary());
        System.out.println( "Зарплата содтрудника 2: " + emp2.calculateSalary());
        System.out.println( "Зарплата содтрудника 3: " + emp3.calculateSalary());

        String[] names = {"Alibek", "Almaz", "Nursultan", "Madiyar", "Madiyar2", "Dauren", "Dauren2", "Batyr", "Nailya ", "Dayana", "Yersultan", "Saltanat", "Aisha", "Aisha2 ", "Arai", "Dana" };
        int[] times = { 347, 361, 423, 351, 383, 354, 356, 350, 419, 451, 349, 424, 439, 444, 440, 430};
        for(int i = 0; i < times.length - 1; i++){
            for(int j = i + 1; j < times.length; j++){
                if (times[i] > times[j]){
                    String tempName = names[i];
                    names[i] = names[j];
                    names[j] = tempName;

                    int tempTime = times[i];
                    times[i] = times[j];
                    times[j] = tempTime;

                }
            }
        }
        System.out.println("\nотсортирование результаты марафона (от самого быстрого) ");
        for(int i = 0; i < times.length; i++){
            System.out.println((i + 1) + ". " + names[i] + " - " + times[i] + " second");
        }
        System.out.println("\nсамый быстрый участник: " + names[0] + " с результатом " + times[0] + " second");
    }
    
}