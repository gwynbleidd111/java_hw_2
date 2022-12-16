/*
* Задача № 3 ____________________________________________________________
*/


import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class Task3 {
    
    public static void main(String[] args) {
        printList(getList());
    }

    public static String[] getList() {
        String string = "{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}, {\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}, {\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}";
        String[] list  = string.split(", ");
        return list;
    }

    private static void printList(String[] list){
        for (int i = 0; i < list.length; i++) {
            Object object = JSONValue.parse(list[i]);
            JSONObject newObj = (JSONObject) object;
            String lastName = (String) newObj.get("фамилия");
            String rating = (String) newObj.get("оценка");
            String subject = (String) newObj.get("предмет");

            System.out.println("Студент " + lastName + " получил " + rating + " по предмету "+ subject +".");
        }
    }
}
