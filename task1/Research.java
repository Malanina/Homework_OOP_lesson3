package task1;

import java.util.ArrayList;

public class Research {
    ArrayList<String> result = new ArrayList<>();
    ArrayList<Node> tree;

    public Research(GeoTree geoTree) {
        tree = geoTree.getTree();
    }

    public ArrayList<String> spend(Person p, Relationship re) {
        for (Node t : tree) {
            if (t.p1.getFullName() == p.getFullName() && t.re == re) {
                result.add(t.p2.getFullName() + " " + t.p2.getAge() + " лет");
            }
        }
        return result;
    }

public Research(Connecting connecting) {
    tree = connecting.getTree();
}


public ArrayList<String> findRelationships(Person p, Relationship re) {
    ArrayList<String> result = new ArrayList<>();
    for (Node node : tree) {
        if (node.p1.equals(p) && node.re == re) {
            result.add(node.p2.getFullName() + " " + node.p2.getAge() + " лет");
        }
    }
    return result;
}

public ArrayList<String> allRelationships(Person p) {
    ArrayList<String> result = new ArrayList<>();
    result.add("Все отношения: " + p.getFullName());
    for (Node t : tree) {
        if (t.p1.getFullName().equals(p.getFullName())) {
            result.add(t.re + ": " + t.p2.getFullName() + " " + t.p2.getAge() + " лет");
        }
    }
    return result;
}
}

