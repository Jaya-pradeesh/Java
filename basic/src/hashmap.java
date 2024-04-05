import java.util.HashMap;

public class hashmap {
    public static void main(String args[]){

        HashMap<String,Integer> examScores= new HashMap<String,Integer>();

        examScores.put("Maths",90);
        examScores.put("Science",95);
        examScores.put("Social Science",98);
        examScores.put("Robotics",80);
        examScores.put("Information Technology",78);

        examScores.forEach((subject, mark) ->{
            System.out.println(subject+"-"+mark);
            examScores.replace(subject,mark-5);
            System.out.println(examScores.toString());
        });

        HashMap<String,Integer> age= new HashMap<String,Integer>();
        age.put("Jayapradeesh",22);
        age.put("Nishanthini",22);
        age.put("Ramesh",20);
        age.put("suresh",10);
        System.out.println(age.containsKey("Ramesh"));
        age.clear();

        System.out.println(age.toString());
        System.out.println(examScores.size());
        //examScores.remove(key) removes the element in the hashMap
        //age.containsKey(key) checks for the key in age hashmap
        //age.containsValue() checks for the value in age hashmap



        System.out.println(examScores.getOrDefault("Networking",100));

    }
}