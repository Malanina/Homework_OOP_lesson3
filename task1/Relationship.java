package task1;

public enum Relationship {
parent {
    public Relationship getOppositeRelationship() {
        return children;
    }
},
children {
    public Relationship getOppositeRelationship() {
        return parent;
    }
},
sister {
    public Relationship getOppositeRelationship() {
        return sister;
    }
},
Grandparent {
    public Relationship getOppositeRelationship() {
        return Grandchild;
    }
},
Grandchild {
    public Relationship getOppositeRelationship() {
        return Grandparent;
    }
};



public abstract Relationship getOppositeRelationship();
}
