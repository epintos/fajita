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
  public static boolean roops_goal_6;
  public static roops.utilInstrumented.RoopsArray myRoopsArray;/** @Modifies_Everything
 @Ensures false;
*/

  public static void searchNodeTest(roops.core.objectsInstrumented.AvlTree tree, int x) {
    boolean t_25;
    boolean t_26;
    boolean t_27;

    fajita_roopsGoal_initialization();
    t_26 = tree  !=  null;

    if (t_26) {
      {
        {
          t_27 = tree.repOK();
          if (t_27) {
            {
              t_25 = true;
            }
          } else {
            {
              t_25 = false;
            }
          }
        }
      }
    } else {
      {
        t_25 = false;
      }
    }
    if (t_25) {
      {
        {
          {
            {
              {
                roops.core.objectsInstrumented.AvlNode t_24;

                t_24 = tree.searchNode(x);
                roops.core.objectsInstrumented.AvlNode var_10_ret_val = t_24;
              }
            }
          }
        }
      }
    }
  }


  public static void searchMaxTest(roops.core.objectsInstrumented.AvlTree tree) {
    boolean t_29;
    boolean t_30;
    boolean t_31;

    t_30 = tree  !=  null;

    if (t_30) {
      {
        {
          t_31 = tree.repOK();
          if (t_31) {
            {
              t_29 = true;
            }
          } else {
            {
              t_29 = false;
            }
          }
        }
      }
    } else {
      {
        t_29 = false;
      }
    }
    if (t_29) {
      {
        {
          {
            {
              {
                roops.core.objectsInstrumented.AvlNode t_28;

                t_28 = tree.searchMax();
                roops.core.objectsInstrumented.AvlNode var_11_ret_val = t_28;
              }
            }
          }
        }
      }
    }
  }


  public static void searchMinTest(roops.core.objectsInstrumented.AvlTree tree) {
    boolean t_33;
    boolean t_34;
    boolean t_35;

    t_34 = tree  !=  null;

    if (t_34) {
      {
        {
          t_35 = tree.repOK();
          if (t_35) {
            {
              t_33 = true;
            }
          } else {
            {
              t_33 = false;
            }
          }
        }
      }
    } else {
      {
        t_33 = false;
      }
    }
    if (t_33) {
      {
        {
          {
            {
              {
                roops.core.objectsInstrumented.AvlNode t_32;

                t_32 = tree.searchMin();
                roops.core.objectsInstrumented.AvlNode var_12_ret_val = t_32;
              }
            }
          }
        }
      }
    }
  }


  public roops.core.objectsInstrumented.AvlNode searchNode(final int x) {
    roops.core.objectsInstrumented.AvlNode t_36;

    t_36 = this.search(x, this.roops_core_objectsInstrumented_AvlTree_root);

    return t_36;
  }


  public roops.core.objectsInstrumented.AvlNode search(final int x, final roops.core.objectsInstrumented.AvlNode arg) {
    boolean t_37;
    roops.core.objectsInstrumented.AvlNode var_13_t = arg;

    t_37 = var_13_t  !=  null;
    roops.core.objectsInstrumented.AvlTree.roops_goal_6 = (t_37)  ==  false;
    boolean var_14_ws_4;

    var_14_ws_4 = var_13_t  !=  null;
    while (var_14_ws_4) {
      boolean t_39;

      {
      }
      t_39 = x  <  var_13_t.roops_core_objectsInstrumented_AvlNode_element;

      if (t_39) {
        {
          {
            {
              {
                {
                  {
                  }
                  var_13_t = var_13_t.roops_core_objectsInstrumented_AvlNode_left;
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
                  boolean t_38;

                  t_38 = x  >  var_13_t.roops_core_objectsInstrumented_AvlNode_element;
                  if (t_38) {
                    {
                      {
                        {
                          {
                            {
                              {
                              }
                              var_13_t = var_13_t.roops_core_objectsInstrumented_AvlNode_right;
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

                              return var_13_t;
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
      var_14_ws_4 = var_13_t  !=  null;
    }
    {
    }

    return ((roops.core.objectsInstrumented.AvlNode)(null));
  }


  public roops.core.objectsInstrumented.AvlNode searchMax() {
    roops.core.objectsInstrumented.AvlNode t_40;

    t_40 = this.searchMax(this.roops_core_objectsInstrumented_AvlTree_root);

    return t_40;
  }


  public roops.core.objectsInstrumented.AvlNode searchMax(final roops.core.objectsInstrumented.AvlNode arg) {
    boolean t_41;
    roops.core.objectsInstrumented.AvlNode var_15_t = arg;

    t_41 = var_15_t  ==  null;

    if (t_41) {
      {
        {
          {
            {
              {
                {
                }

                return var_15_t;
              }
            }
          }
        }
      }
    }
    boolean var_16_ws_5;

    var_16_ws_5 = var_15_t.roops_core_objectsInstrumented_AvlNode_right  !=  null;
    while (var_16_ws_5) {
      {
      }
      var_15_t = var_15_t.roops_core_objectsInstrumented_AvlNode_right;
      var_16_ws_5 = var_15_t.roops_core_objectsInstrumented_AvlNode_right  !=  null;
    }
    {
    }

    return var_15_t;
  }


  public roops.core.objectsInstrumented.AvlNode searchMin() {
    roops.core.objectsInstrumented.AvlNode t_42;

    t_42 = this.searchMin(this.roops_core_objectsInstrumented_AvlTree_root);

    return t_42;
  }


  public roops.core.objectsInstrumented.AvlNode searchMin(final roops.core.objectsInstrumented.AvlNode arg) {
    boolean t_43;
    roops.core.objectsInstrumented.AvlNode var_17_t = arg;

    t_43 = var_17_t  ==  null;

    if (t_43) {
      {
        {
          {
            {
              {
                {
                }

                return var_17_t;
              }
            }
          }
        }
      }
    }
    boolean var_18_ws_6;

    var_18_ws_6 = var_17_t.roops_core_objectsInstrumented_AvlNode_left  !=  null;
    while (var_18_ws_6) {
      {
      }
      var_17_t = var_17_t.roops_core_objectsInstrumented_AvlNode_left;
      var_18_ws_6 = var_17_t.roops_core_objectsInstrumented_AvlNode_left  !=  null;
    }
    {
    }

    return var_17_t;
  }


  public AvlTree() {
    {
    }
  }


  public boolean repOK() {
    return true;
  }


  public static void fajita_roopsGoal_initialization() {
    roops.core.objectsInstrumented.AvlTree.roops_goal_6 = false;
    roops.core.objectsInstrumented.AvlTree.myRoopsArray = ((roops.utilInstrumented.RoopsArray)(null));
  }

}
