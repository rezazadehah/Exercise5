import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> s = makeStudent();

        Scanner scanner = new Scanner(System.in);
        System.out.println("name daneshjo ra vared konid");

        String name = scanner.nextLine();

        System.out.println("nomre darse it ra vared konid");

        int itValue = scanner.nextInt();

        Boolean isExist = false;

        for (int i = 0; i <s.size() ; i++) {
            if (s.get(i).getName().equals(name))
            {
                s.get(i).setItValue(itValue);

                System.out.println(s.get(i));

                isExist = true;
                break;
            }
        }

        if (!isExist)
        {
            System.out.println("daneshjoyee ba in moshakhasat peida nashod");
        }



    }

    private static ArrayList<Student> makeStudent()
    {
        ArrayList<Student> sList = new ArrayList<>();

        Student s1 = new Student("ali" ,10);
        Student s2 = new Student("mamad" ,3);
        Student s3 = new Student("chaft" ,13);
        Student s4 = new Student("amir" ,18);

        sList.add(s1);
        sList.add(s2);
        sList.add(s3);
        sList.add(s4);

        return sList;
    }
}
