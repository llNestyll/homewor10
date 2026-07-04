//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
   /// Q1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName+" "+firstName+" "+middleName;
        System.out.println("Ф. И. О. сотрудника — "+fullName);
    /// Q2
        System.out.println("");
        System.out.println(fullName.toUpperCase());
    /// Q3
        System.out.println("");
        String fullname = "Иванов Семён Семёнович";
        fullname = fullname.replace("ё","е");
        System.out.println(fullname);
    }
}