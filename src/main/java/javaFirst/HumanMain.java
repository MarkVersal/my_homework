package javaFirst;

import java.util.*;

import static java.util.Arrays.asList;

public class HumanMain {

    public static void main(String[] args) {
        String[] hobbies = new String[3];
        hobbies[0] = "Футбол";
        hobbies[1] = "Java";
        hobbies[2] = "Гражданская оборона";

        String[] hobbiesAnother = new String[] {
                "Футбол", "Java", "Hockey"
        };

        int length = hobbiesAnother.length;
//        Arrays.stream(hobbiesAnother).count()
//        asList(hobbiesAnother).contains("Java");

        List<String> hobbiesList = new ArrayList<>();
        hobbiesList.add("Футбол");
        hobbiesList.add("Java");
        hobbiesList.add("Гражданская оборона");

        List<String> hobbiesListAnother = List.of(
                "Футбол", "Java", "Hockey"
        );


        Set<String> hobbiesSet = new HashSet<>();
        hobbiesSet.add("Футбол");
        hobbiesSet.add("Java");
        hobbiesSet.add("Гражданская оборона");

        Set<String> hobbiesAnotherSet = Set.of(
                "Футбол", "Java", "Hockey"
        );


        Human dima = new Human("Дима", 33, hobbies);
        Human roma = new Human("Дима", 33, hobbies);
        boolean equals = dima.equals(roma);

        Map<String, Human> humans = new HashMap<>();
        humans.put("1234556", dima);
        humans.put("1234556", roma);

        for (int i = 0; i < hobbies.length; i++){
            System.out.println(hobbies[i]);
        }

        for (String hobby:hobbies){
            System.out.println(hobby);

        }

        for (String hobby:hobbiesList){

        }
boolean arrayContainJava = false;
        int index = 0;
        while (!arrayContainJava && index < hobbies.length){
            if (hobbies[index].equals("Java")) {
                arrayContainJava = true;
            }
            index++;
        }
do {
    if (hobbies[index].equals("Java")) {
        arrayContainJava = true;
    }
    index++;
} while (!arrayContainJava && index < hobbies.length)


    }
}
