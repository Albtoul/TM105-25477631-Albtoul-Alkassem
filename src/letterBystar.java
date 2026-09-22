import java.util.Scanner ;
public class letterBystar {

    public  void    getuserdata(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Name ");
        String name = input.nextLine();
        System.out.println("Enter Your ID :");
        String  ID = input.nextLine();
        if (name.isEmpty()){
            System.out.print("Error please enter Name ");
            getuserdata();
        }else if (ID.isEmpty() ){
            System.out.print("Error please enter ID ");
            getuserdata();
        }else {
            int IDNum =Integer.parseInt(ID);
            if (IDNum <= 0 ){
                System.out.println("Enter valid ID ");
                getuserdata();
            }else {
        System.out.println("---User Inforamtion ");
        System.out.println("---User Name ---"+ name);
        System.out.println("---User ID  ---"+ ID);

            input.close();}

    }}
}
