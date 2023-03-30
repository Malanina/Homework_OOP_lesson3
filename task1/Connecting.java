package task1;

import java.util.ArrayList;

public interface Connecting {
    void addRelationship(Person person1, Person person2, Relationship relationship);

    boolean hasRelationship(Person p1, Person p2);


    ArrayList<Node> getTree();

}

