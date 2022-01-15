public class Employee {

    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(){
        if(this.salary < 1000){
//            System.out.println("Vergi Uygulanmamıştır. ");
            return 0.0;
        }
//        System.out.println("Vergi Uygulanmıştır.");
        return this.salary * 0.03;
    }

    public double bonus(){
        if(this.workHours <= 40){
//            System.out.println("Mesai Yapılmadığından bonus uygulanmamıştır.");
            return 0.0;
        }
//        System.out.println("Mesai yapılmış, bonus uygulanmıştır.");
        return (this.workHours-40) *30;
    }

    public double raiseSalary(){
//        System.out.println("Maaş'a zam uygulama");
        if(2021-hireYear > 19){
            return this.salary * 0.15;
        }else if(2021-hireYear > 9 && 2021-hireYear < 20){
            return this.salary * 0.10;
        }else{
            return this.salary * 0.05;
        }
    }
    public double paySalary(){
        return this.salary + this.bonus() - this.tax();
    }
    public String toString(){
        return  "Adı : " + this.name + "\nMaaşı : " + this.salary +
                "\nÇalışma Saati : " + this.workHours +
                "\nBaşlangıç Yılı : " + this.hireYear +
                "\nVergi : " + this.tax() + "\nBonus : " + this.bonus() +
                "\nMaaş Artışı : " + this.raiseSalary() +
                "\nVergi ve Bonuslar ile Maaş : " + this.paySalary() +
                "\nZamlı Toplam Maaş : " + (this.salary + this.raiseSalary());
    }
}
