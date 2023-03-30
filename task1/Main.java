package task1;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
        
        public static void main(String[] args) {
            Person galya = new Person("Галина", 61);
            Person tanya = new Person("Таня", 34);
            Person kate = new Person("Катя", 37);
            Person pavel = new Person("Павел", 63);
            Person ivan = new Person("Ваня", 8);
            GeoTree gt = new GeoTree();
            /*gt.append(galya, tanya);
            gt.append(galya, kate);
            gt.append(pavel, tanya);
            gt.append(pavel, kate);
            gt.append(tanya, ivan);
            gt.add(kate, tanya);

            System.out.println(new Research(gt).spend(galya,
                    Relationship.parent));
            System.out.println(new Research(gt).spend(ivan,
                    Relationship.children));
            System.out.println(new Research(gt).spend(kate,
                    Relationship.sister));        

        }*/
        gt.addRelationship(galya, tanya, Relationship.children);
        gt.addRelationship(galya, kate, Relationship.children);
        gt.addRelationship(pavel, tanya, Relationship.children);
        gt.addRelationship(pavel, kate, Relationship.children);
        gt.addRelationship(tanya, ivan, Relationship.children);
        gt.addRelationship(galya, ivan, Relationship.Grandchild);
        gt.addRelationship(pavel, ivan, Relationship.Grandchild);
        gt.addRelationship(tanya, kate, Relationship.sister);

        System.out.println(new Research(gt).spend(galya, Relationship.Grandchild));

        System.out.println(new Research(gt).allRelationships(pavel));
        System.out.println(new Research(gt).findRelationships(ivan, Relationship.parent));

        ArrayList<Person> list = new ArrayList<>();

        list.add(galya);
        list.add(tanya);
        list.add(kate);
        list.add(pavel);
        list.add(ivan);

        Collections.sort(list, new PersonAgeComparator());

        System.out.println(list);
    }
}