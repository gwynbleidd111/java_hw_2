/*
* Задача № 1 ____________________________________________________________
*/

import java.util.HashMap;
import java.util.Map;

public class Task1 {

    public static void main(String[] args) {

       
        Map<String, String> params = new HashMap<String,String>();
        params.put(getList()[0].replaceAll("[^\\w+]", ""),getList()[1].replaceAll("[^\\w+]", ""));
        params.put(getList()[2].replaceAll("[^\\w+]", ""),getList()[3].replaceAll("[^\\w+]", ""));
        params.put(getList()[4].replaceAll("[^\\w+]", ""),getList()[5].replaceAll("[^\\w+]", ""));
        params.put(getList()[6].replaceAll("[^\\w+]", ""),getList()[7].replaceAll("[^\\w+]", ""));
        System.out.println(getWhere(params));
    }


    public static String[] getList() {
        String string = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        String request = string.substring(1, string.length() - 1);
        String oldString = request;
        String newString =  oldString.replace(':', ',');
        String[] list = newString.split(",");
        return list;
        
    }

    public static String getWhere(Map<String, String> params)
    {
        StringBuilder s = new StringBuilder();
        for (Map.Entry<String,String> pair : params.entrySet())
        {
            if (!pair.getValue().equals("null"))
            {
                s.append(pair.getKey() +" = '" + pair.getValue()+"' and ");
            }
        }
        s.delete(s.toString().length()-5,s.toString().length());
        return s.toString();
    }

}
