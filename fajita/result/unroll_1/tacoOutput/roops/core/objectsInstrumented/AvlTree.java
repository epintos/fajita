package roops.core.objectsInstrumented;

//@ model import org.jmlspecs.lang.*;

/** @Invariant all x: AvlNode | x in this.root.*(left @+ right) @- null => 
 (
		(x !in x.^(left @+ right)) && 
		(all y: AvlNode | (y in x.left.*(left @+ right) @-null) => y.element < x.element ) && 
		(all y: AvlNode | (y in x.right.*(left @+right) @- null) => x.element < y.element ) && 
		(x.left=null && x.right=null => x.height=0) && 
		(x.left=null && x.right!=null => x.height=1 && x.right.height=0) && 
		(x.left!=null && x.right=null => x.height=1 && x.left.height=0) && 
		(x.left!=null && x.right!=null => x.height= (x.left.height>x.right.height ? x.left.height : x.right.height )+1 && ( (x.left.height > x.right.height ? x.left.height - x.right.height : x.right.height - x.left.height ))<=1)
 );
 
*/
public class AvlTree extends java.lang.Object {

  public roops.core.objectsInstrumented.AvlNode roops_core_objectsInstrumented_AvlTree_root;
  public static boolean roops_goal_0;
  public static boolean roops_goal_1;
  public static boolean roops_goal_2;
  public static boolean roops_goal_3;
  public static boolean roops_goal_4;
  public static boolean roops_goal_5;
  public static boolean roops_goal_6;
  public static boolean roops_goal_7;
  public static roops.utilInstrumented.RoopsArray myRoopsArray;/** @Modifies_Everything
 @Ensures false;
*/

  public static void searchNodeTest(roops.core.objectsInstrumented.AvlTree tree, int x) {
    boolean t_1;
    boolean t_3;
    boolean t_4;
    boolean t_5;

    fajita_roopsGoal_initialization();
    t_1 = tree  !=  null;
    roops.core.objectsInstrumented.AvlTree.roops_goal_0 = (t_1)  ==  false;
    roops.core.objectsInstrumented.AvlTree.roops_goal_1 = tree  !=  null;
    t_4 = tree  !=  null;

    if (t_4) {
      {
        {
          t_5 = tree.repOK();
          if (t_5) {
            {
              t_3 = true;
            }
          } else {
            {
              t_3 = false;
            }
          }
        }
      }
    } else {
      {
        t_3 = false;
      }
    }
    if (t_3) {
      {
        {
          {
            {
              {
                roops.core.objectsInstrumented.AvlNode t_2;

                t_2 = tree.searchNode(x);
                roops.core.objectsInstrumented.AvlNode var_1_ret_val = t_2;
              }
            }
          }
        }
      }
    }
  }


  public static void searchMaxTest(roops.core.objectsInstrumented.AvlTree tree) {
    boolean t_7;
    boolean t_8;
    boolean t_9;

    t_8 = tree  !=  null;

    if (t_8) {
      {
        {
          t_9 = tree.repOK();
          if (t_9) {
            {
              t_7 = true;
            }
          } else {
            {
              t_7 = false;
            }
          }
        }
      }
    } else {
      {
        t_7 = false;
      }
    }
    if (t_7) {
      {
        {
          {
            {
              {
                roops.core.objectsInstrumented.AvlNode t_6;

                t_6 = tree.searchMax();
                roops.core.objectsInstrumented.AvlNode var_2_ret_val = t_6;
              }
            }
          }
        }
      }
    }
  }


  public static void searchMinTest(roops.core.objectsInstrumented.AvlTree tree) {
    boolean t_11;
    boolean t_12;
    boolean t_13;

    t_12 = tree  !=  null;

    if (t_12) {
      {
        {
          t_13 = tree.repOK();
          if (t_13) {
            {
              t_11 = true;
            }
          } else {
            {
              t_11 = false;
            }
          }
        }
      }
    } else {
      {
        t_11 = false;
      }
    }
    if (t_11) {
      {
        {
          {
            {
              {
                roops.core.objectsInstrumented.AvlNode t_10;

                t_10 = tree.searchMin();
                roops.core.objectsInstrumented.AvlNode var_3_ret_val = t_10;
              }
            }
          }
        }
      }
    }
  }


  public roops.core.objectsInstrumented.AvlNode searchNode(final int x) {
    roops.core.objectsInstrumented.AvlNode t_14;

    t_14 = this.search(x, this.roops_core_objectsInstrumented_AvlTree_root);

    return t_14;
  }


  public roops.core.objectsInstrumented.AvlNode search(final int x, final roops.core.objectsInstrumented.AvlNode arg) {
    boolean t_15;
    roops.core.objectsInstrumented.AvlNode var_4_t = arg;

    t_15 = var_4_t  !=  null;
    roops.core.objectsInstrumented.AvlTree.roops_goal_6 = (t_15)  ==  false;
    roops.core.objectsInstrumented.AvlTree.roops_goal_7 = var_4_t  !=  null;
    boolean var_5_ws_1;

    var_5_ws_1 = var_4_t  !=  null;
    while (var_5_ws_1) {
      boolean t_16;
      boolean t_17;
      boolean t_19;

      {
      }
      t_16 = x  <  var_4_t.roops_core_objectsInstrumented_AvlNode_element;
      roops.core.objectsInstrumented.AvlTree.roops_goal_2 = (t_16)  ==  false;
      roops.core.objectsInstrumented.AvlTree.roops_goal_3 = x  <  var_4_t.roops_core_objectsInstrumented_AvlNode_element;
      t_17 = x  >  var_4_t.roops_core_objectsInstrumented_AvlNode_element;
      roops.core.objectsInstrumented.AvlTree.roops_goal_4 = (t_17)  ==  false;
      roops.core.objectsInstrumented.AvlTree.roops_goal_5 = x  >  var_4_t.roops_core_objectsInstrumented_AvlNode_element;
      t_19 = x  <  var_4_t.roops_core_objectsInstrumented_AvlNode_element;

      if (t_19) {
        {
          {
            {
              {
                {
                  {
                  }
                  var_4_t = var_4_t.roops_core_objectsInstrumented_AvlNode_left;
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
                  boolean t_18;

                  t_18 = x  >  var_4_t.roops_core_objectsInstrumented_AvlNode_element;
                  if (t_18) {
                    {
                      {
                        {
                          {
                            {
                              {
                              }
                              var_4_t = var_4_t.roops_core_objectsInstrumented_AvlNode_right;
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
                              {
                              }

                              return var_4_t;
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
      var_5_ws_1 = var_4_t  !=  null;
    }
    {
    }

    return ((roops.core.objectsInstrumented.AvlNode)(null));
  }


  public roops.core.objectsInstrumented.AvlNode searchMax() {
    roops.core.objectsInstrumented.AvlNode t_20;

    t_20 = this.searchMax(this.roops_core_objectsInstrumented_AvlTree_root);

    return t_20;
  }


  public roops.core.objectsInstrumented.AvlNode searchMax(final roops.core.objectsInstrumented.AvlNode arg) {
    boolean t_21;
    roops.core.objectsInstrumented.AvlNode var_6_t = arg;

    t_21 = var_6_t  ==  null;

    if (t_21) {
      {
        {
          {
            {
              {
                {
                }

                return var_6_t;
              }
            }
          }
        }
      }
    }
    boolean var_7_ws_2;

    var_7_ws_2 = var_6_t.roops_core_objectsInstrumented_AvlNode_right  !=  null;
    while (var_7_ws_2) {
      {
      }
      var_6_t = var_6_t.roops_core_objectsInstrumented_AvlNode_right;
      var_7_ws_2 = var_6_t.roops_core_objectsInstrumented_AvlNode_right  !=  null;
    }
    {
    }

    return var_6_t;
  }


  public roops.core.objectsInstrumented.AvlNode searchMin() {
    roops.core.objectsInstrumented.AvlNode t_22;

    t_22 = this.searchMin(this.roops_core_objectsInstrumented_AvlTree_root);

    return t_22;
  }


  public roops.core.objectsInstrumented.AvlNode searchMin(final roops.core.objectsInstrumented.AvlNode arg) {
    boolean t_23;
    roops.core.objectsInstrumented.AvlNode var_8_t = arg;

    t_23 = var_8_t  ==  null;

    if (t_23) {
      {
        {
          {
            {
              {
                {
                }

                return var_8_t;
              }
            }
          }
        }
      }
    }
    boolean var_9_ws_3;

    var_9_ws_3 = var_8_t.roops_core_objectsInstrumented_AvlNode_left  !=  null;
    while (var_9_ws_3) {
      {
      }
      var_8_t = var_8_t.roops_core_objectsInstrumented_AvlNode_left;
      var_9_ws_3 = var_8_t.roops_core_objectsInstrumented_AvlNode_left  !=  null;
    }
    {
    }

    return var_8_t;
  }


  public AvlTree() {
    {
    }
  }


  public boolean repOK() {
    return true;
  }


  public static void fajita_roopsGoal_initialization() {
    roops.core.objectsInstrumented.AvlTree.roops_goal_0 = false;
    roops.core.objectsInstrumented.AvlTree.roops_goal_1 = false;
    roops.core.objectsInstrumented.AvlTree.roops_goal_2 = false;
    roops.core.objectsInstrumented.AvlTree.roops_goal_3 = false;
    roops.core.objectsInstrumented.AvlTree.roops_goal_4 = false;
    roops.core.objectsInstrumented.AvlTree.roops_goal_5 = false;
    roops.core.objectsInstrumented.AvlTree.roops_goal_6 = false;
    roops.core.objectsInstrumented.AvlTree.roops_goal_7 = false;
    roops.core.objectsInstrumented.AvlTree.myRoopsArray = ((roops.utilInstrumented.RoopsArray)(null));
  }

}
