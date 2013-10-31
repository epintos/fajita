// This is mutant program.
// Author : ysma

package roops.core.objects;





import roops.core.objects.LinkedListNode;


/*@ nullable_by_default @*/
public class NodeCachingLinkedList
{

    public LinkedListNode header;

    public LinkedListNode firstCachedNode;

    public int maximumCacheSize;

    public int cacheSize;

    public int size;

    public int DEFAULT_MAXIMUM_CACHE_SIZE;

    public int modCount;

    public NodeCachingLinkedList()
    {
        this.header = new LinkedListNode();
        this.header.next = this.header;
        this.header.previous = this.header;
        this.firstCachedNode = null;
        this.size = 0;
        this.cacheSize = 0;
        this.DEFAULT_MAXIMUM_CACHE_SIZE = 3;
        this.maximumCacheSize = 3;
        this.modCount = 0;
    }

///*@
//	  @ invariant this.header!=null;
//	  @ invariant (\forall LinkedListNode n; 
//	  @					\reach(this.header,LinkedListNode,next).has(n); 
//	  @					n.previous!=null && n.previous.next==n && n.next!=null && n.next.previous==n );	  
//	  @ invariant this.size == \reach(this.header,LinkedListNode,next).int_size() - 1;
//	  @ invariant (\forall LinkedListNode n; 
//	  @          		\reach(this.header, LinkedListNode, next).has(n); 
//	  @          		n!=this.header ==> n.value!=null ); 
//	  @ invariant (\forall LinkedListNode m; 
//	  @					\reach(this.firstCachedNode, LinkedListNode, next).has(m);
//	  @                 \reach(m.next, LinkedListNode, next).has(m)==false && m.previous==null );
//  	  @ invariant this.cacheSize <= this.maximumCacheSize;
//	  @	invariant this.maximumCacheSize == this.DEFAULT_MAXIMUM_CACHE_SIZE;
//	  @ invariant this.header.value == null;
//	  @ invariant this.DEFAULT_MAXIMUM_CACHE_SIZE == 3;
//	  @ invariant this.cacheSize == \reach(this.firstCachedNode, LinkedListNode, next).int_size();
//      @*/
    
    
    
    
// //------------------------- removeOk -----------------------//
//    /*@
//	  @  requires index>=0;
//	  @  requires index<this.size;
//	  @  ensures this.size == \old(this.size) - 1;
//	  @  ensures (\old(this.cacheSize) < this.maximumCacheSize) ==> (this.cacheSize == \old(this.cacheSize) + 1);
//	  @  ensures this.modCount == \old(this.modCount) + 1;
//	  @  ensures (index==0 ==> \result==\old(this.header.next.value));
//	  @  ensures (index==1 ==> \result==\old(this.header.next.next.value));
//	  @  ensures (index==2 ==> \result==\old(this.header.next.next.next.value));
//	  @  ensures (index==3 ==> \result==\old(this.header.next.next.next.next.value));
//	  @  ensures (index==4 ==> \result==\old(this.header.next.next.next.next.next.value));
//	  @  ensures (index==5 ==> \result==\old(this.header.next.next.next.next.next.next.value));
//	  @  ensures (index==6 ==> \result==\old(this.header.next.next.next.next.next.next.next.value));
//	  @  signals (Exception) false;
//	  @*/
//    public java.lang.Object removeOk( int index )
//    {
//        LinkedListNode node = null;
//        java.lang.IndexOutOfBoundsException exception = null;
//        if (index < 0) {
//            exception = new java.lang.IndexOutOfBoundsException();
//            throw exception;
//        }
//        if (index == this.size) {
//            exception = new java.lang.IndexOutOfBoundsException();
//            throw exception;
//        }
//        if (index > this.size) {
//            exception = new java.lang.IndexOutOfBoundsException();
//            throw exception;
//        }
//        LinkedListNode node1 = null;
//        if (index < this.size / 2) {
//            node1 = this.header.next;
//            int currentIndex = 0;
//            while (currentIndex < index) {
//                node1 = node1.next;
//                currentIndex = currentIndex + 1;
//            }
//        } else {
//            node1 = this.header;
//            int currentIndex = this.size;
//            while (currentIndex > index) {
//                node1 = node1.previous;
//                currentIndex = currentIndex - 1;
//            }
//        }
//        node = node1;
//        java.lang.Object oldValue = node.value;
//        node.previous.next = node.next; //mutGenLimit 2
//        node.next.previous = node.previous;
//        this.size = this.size - 1 ; //mutGenLimit 1
//        this.modCount = this.modCount + 1;
//        if (this.cacheSize < this.maximumCacheSize) {
//            LinkedListNode nextCachedNode = this.firstCachedNode;
//            node.previous = null;
//            node.next = nextCachedNode;
//            node.value = null;
//            this.firstCachedNode = node;
//            this.cacheSize = this.cacheSize + 1;
//        } //mutGenLimit 1
//        return oldValue;
//    }

    
    public int i;
    
    /*@ invariant i + 1 + 1 > 5;
     @  invariant i * 3 > i + 3;
     @  invariant i + 3 + 3 == 3; 
     @*/
    
   /*@
 	 @ requires i+1 > 0;
 	 @ requires this.header!=null;
 	 @ ensures i+1 < 0;
	 @*/
    public Object removeOkTest( int index ) throws Exception
    {
    	i = i + 1;
    	i = i + 2;
    	i = i + 1;
        index = index + 1;
        size = size + 1;
        return null;
    }
    
    
    /*@ requires true;
     @ ensures \result == i || \result == j || \result == k;
     @ ensures \result <= i && \result <= j && \result <= k;
     @*/
    public int  min3(int i, int j, int k){
    	int output = 0;
    	if (i <= j && i <= k)
    		output = i;
    	else 
    		if (i <= j || k <= j)
    			output = k;
    		else
    			output = j+1;

    	return output;
    }

}
