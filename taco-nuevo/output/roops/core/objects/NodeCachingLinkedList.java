package roops.core.objects;

//@ model import org.jmlspecs.lang.*;


public /*@ nullable_by_default @*/ class NodeCachingLinkedList extends java.lang.Object {

  public roops.core.objects.LinkedListNode roops_core_objects_NodeCachingLinkedList_header;
  public roops.core.objects.LinkedListNode roops_core_objects_NodeCachingLinkedList_firstCachedNode;
  public int roops_core_objects_NodeCachingLinkedList_maximumCacheSize;
  public int roops_core_objects_NodeCachingLinkedList_cacheSize;
  public int roops_core_objects_NodeCachingLinkedList_size;
  public int roops_core_objects_NodeCachingLinkedList_DEFAULT_MAXIMUM_CACHE_SIZE;
  public int roops_core_objects_NodeCachingLinkedList_modCount;
  public int roops_core_objects_NodeCachingLinkedList_i;
  /*@ invariant this.roops_core_objects_NodeCachingLinkedList_i + 1 + 1  >  5;
    @*/
  /*@ invariant this.roops_core_objects_NodeCachingLinkedList_i * 3  >  this.roops_core_objects_NodeCachingLinkedList_i + 3;
    @*/
  /*@ invariant this.roops_core_objects_NodeCachingLinkedList_i + 3 + 3  ==  3;
    @*/

  public NodeCachingLinkedList() {
    this.roops_core_objects_NodeCachingLinkedList_header = ((roops.core.objects.LinkedListNode)(null));
    this.roops_core_objects_NodeCachingLinkedList_firstCachedNode = ((roops.core.objects.LinkedListNode)(null));
    this.roops_core_objects_NodeCachingLinkedList_maximumCacheSize = (byte)0;
    this.roops_core_objects_NodeCachingLinkedList_cacheSize = (byte)0;
    this.roops_core_objects_NodeCachingLinkedList_size = (byte)0;
    this.roops_core_objects_NodeCachingLinkedList_DEFAULT_MAXIMUM_CACHE_SIZE = (byte)0;
    this.roops_core_objects_NodeCachingLinkedList_modCount = (byte)0;
    this.roops_core_objects_NodeCachingLinkedList_i = (byte)0;
    {
      roops.core.objects.LinkedListNode t_1;

      t_1 = new roops.core.objects.LinkedListNode();
      this.roops_core_objects_NodeCachingLinkedList_header = t_1;
      this.roops_core_objects_NodeCachingLinkedList_header.roops_core_objects_LinkedListNode_next = this.roops_core_objects_NodeCachingLinkedList_header;
      this.roops_core_objects_NodeCachingLinkedList_header.roops_core_objects_LinkedListNode_previous = this.roops_core_objects_NodeCachingLinkedList_header;
      this.roops_core_objects_NodeCachingLinkedList_firstCachedNode = ((roops.core.objects.LinkedListNode)(null));
      this.roops_core_objects_NodeCachingLinkedList_size = 0;
      this.roops_core_objects_NodeCachingLinkedList_cacheSize = 0;
      this.roops_core_objects_NodeCachingLinkedList_DEFAULT_MAXIMUM_CACHE_SIZE = 3;
      this.roops_core_objects_NodeCachingLinkedList_maximumCacheSize = 3;
      this.roops_core_objects_NodeCachingLinkedList_modCount = 0;
    }
  }


  /*@ 
    @ requires this.roops_core_objects_NodeCachingLinkedList_i + 1  >  0;
    @ requires this.roops_core_objects_NodeCachingLinkedList_header  !=  null;
    @ ensures this.roops_core_objects_NodeCachingLinkedList_i + 1  <  0;
    @*/
  public java.lang.Object removeOkTest(int index) throws java.lang.Exception {
    this.roops_core_objects_NodeCachingLinkedList_i = this.roops_core_objects_NodeCachingLinkedList_i + 1;
    this.roops_core_objects_NodeCachingLinkedList_i = this.roops_core_objects_NodeCachingLinkedList_i + 2;
    this.roops_core_objects_NodeCachingLinkedList_i = this.roops_core_objects_NodeCachingLinkedList_i + 1;
    index = index + 1;
    this.roops_core_objects_NodeCachingLinkedList_size = this.roops_core_objects_NodeCachingLinkedList_size + 1;

    return null;
  }


  /*@ 
    @ requires true;
    @ ensures \result  ==  i || \result  ==  j || \result  ==  k;
    @ ensures \result  <=  i && \result  <=  j && \result  <=  k;
    @*/
  public int min3(int i, int j, int k) {
    boolean t_5;
    boolean t_6;
    boolean t_7;
    int var_1_output = 0;

    t_6 = i  <=  j;
    t_7 = i  <=  k;

    if (t_6) {
      {
        if (t_7) {
          {
            t_5 = true;
          }
        } else {
          {
            t_5 = false;
          }
        }
      }
    } else {
      {
        t_5 = false;
      }
    }
    if (t_5) {
      {
        {
          {
            {
              {
                var_1_output = i;
              }
            }
          }
        }
      }
    } else {
      {
        {
          {
            {
              {
                boolean t_2;
                boolean t_3;
                boolean t_4;

                t_3 = i  <=  j;
                t_4 = k  <=  j;

                if (t_3) {
                  {
                    t_2 = true;
                  }
                } else {
                  {
                    if (t_4) {
                      {
                        t_2 = true;
                      }
                    } else {
                      {
                        t_2 = false;
                      }
                    }
                  }
                }
                if (t_2) {
                  {
                    {
                      {
                        {
                          {
                            var_1_output = k;
                          }
                        }
                      }
                    }
                  }
                } else {
                  {
                    {
                      {
                        {
                          {
                            var_1_output = j + 1;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }

    return var_1_output;
  }

}
