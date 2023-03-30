package task1;

import java.util.ArrayList;

public class GeoTree implements Connecting{
    ArrayList<Node> tree = new ArrayList<>();

    /*public ArrayList<Node> getTree() {
        return tree;
    }


    public void append(Person parent, Person children) {
        tree.add(new Node(parent, Relationship.parent, children));
        tree.add(new Node(children, Relationship.children, parent));
    }

    public void add(Person sister1, Person sister2) {
        tree.add(new Node(sister1, Relationship.sister, sister2));
        tree.add(new Node(sister2, Relationship.sister, sister1));
    }
    
}
*/

@Override
    public void addRelationship(Person person1, Person person2, Relationship relationship) {
        if (!hasRelationship(person1, person2)) {
            Node node1 = new Node(person1, relationship, person2);
            Node node2 = new Node(person2, relationship.getOppositeRelationship(), person1);
            tree.add(node1);
            tree.add(node2);
        }
    }

    
    @Override
    public boolean hasRelationship(Person p1, Person p2) {
        for (Relationship relationship : Relationship.values()) {
            for (Node node : tree) {
                if (node.p1.equals(p1) && node.p2.equals(p2) && node.re == relationship && p1 != p2) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public ArrayList<Node> getTree() {
        return tree;
    }

}