package roops.core.objectsInstrumented;

public class AvlNode {

    public int element;

    public /*@ nullable @*/AvlNode left;

    public /*@ nullable @*/AvlNode right;

    public int height; // Height

        public AvlNode () {}
}

/* end roops.core.objects */
