import java.util.LinkedList;

public class DeleteNodesValueMoreThan25 {

    private static void insertTillNumbersTill50(LinkedList<String> list) {
        for (int i = 1; i <= 50; i++) {
            list.add(String.valueOf(i));
        }
    }
    private static void DeleteMoreThan50(LinkedList<Integer> list) {

    }

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        //Inserting all Numbers from 1 to 50
        insertTillNumbersTill50(list);
        //Printing List
        System.out.println(list);

        //Deleting all Numbers More than 50
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+"->");

            String current = list.get(i);
            int x = Integer.parseInt(current);
            if(x >  25) {
                System.out.println("INDEX "+i+" VALUE "+list.get(i));
                list.remove(i);
            }
        }


        System.out.println("Printing List");
        //Printing List
        System.out.println(list);
    }




}
