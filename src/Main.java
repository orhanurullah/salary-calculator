public class Main {

    public static void main(String[] args) {
        Employee orhan = new Employee("Orhan", 4250, 45, 2020);
        System.out.println(orhan.toString());

        System.out.println("****************************");
        Employee mehmet = new Employee("Mehmet", 6500, 40, 2010);
        System.out.println(mehmet.toString());

        System.out.println("****************************");
        Employee ahmet = new Employee("Ahmet", 5750, 50, 2002);
        System.out.println(ahmet.toString());
    }
}
