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
  public static boolean roops_goal_9;
  public static boolean roops_goal_11;
  public static boolean roops_goal_12;
  public static roops.utilInstrumented.RoopsArray myRoopsArray;
  public static boolean variable_definition_0;
  public static boolean variable_definition_1;
  public static boolean variable_definition_2;
  public static boolean variable_definition_3;
  public static boolean variable_definition_4;
  public static boolean variable_definition_5;
  public static boolean variable_definition_6;
  public static boolean variable_definition_7;/** @Modifies_Everything
 @Ensures false;
*/

  public static void searchNodeTest(roops.core.objectsInstrumented.AvlTree tree, int x) {
    boolean t_21;
    boolean t_22;
    boolean t_23;

    fajita_roopsGoal_initialization();
    roops.core.objectsInstrumented.AvlTree.variable_definition_0 = true;
    roops.core.objectsInstrumented.AvlTree.variable_definition_1 = true;
    t_22 = tree  !=  null;

    if (t_22) {
      {
        {
          t_23 = tree.repOK();
          if (t_23) {
            {
              t_21 = true;
            }
          } else {
            {
              t_21 = false;
            }
          }
        }
      }
    } else {
      {
        t_21 = false;
      }
    }
    if (t_21) {
      {
        {
          {
            {
              {
                roops.core.objectsInstrumented.AvlNode t_20;

                t_20 = tree.searchNode(x);
              }
            }
          }
        }
      }
    }
  }


  public static void searchMaxTest(roops.core.objectsInstrumented.AvlTree tree) {
    boolean t_25;
    boolean t_26;
    boolean t_27;

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

                t_24 = tree.searchMax();
              }
            }
          }
        }
      }
    }
  }


  public static void searchMinTest(roops.core.objectsInstrumented.AvlTree tree) {
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

                t_28 = tree.searchMin();
              }
            }
          }
        }
      }
    }
  }


  public roops.core.objectsInstrumented.AvlNode searchNode(final int x) {
    roops.core.objectsInstrumented.AvlNode t_32;

    roops.core.objectsInstrumented.AvlTree.variable_definition_2 = true;
    t_32 = this.search(x, this.roops_core_objectsInstrumented_AvlTree_root);

    return t_32;
  }


  public roops.core.objectsInstrumented.AvlNode search(final int x, final roops.core.objectsInstrumented.AvlNode arg) {
    roops.core.objectsInstrumented.AvlTree.variable_definition_3 = true;
    roops.core.objectsInstrumented.AvlTree.variable_definition_4 = true;
    roops.core.objectsInstrumented.AvlNode var_7_t = arg;

    roops.core.objectsInstrumented.AvlTree.variable_definition_5 = true;
    boolean var_8_ws_4;

    var_8_ws_4 = var_7_t  !=  null;
    while (var_8_ws_4) {
      boolean t_34;

      {
      }
      t_34 = x  <  var_7_t.roops_core_objectsInstrumented_AvlNode_element;

      if (t_34) {
        {
          {
            {
              {
                {
                  {
                  }
                  var_7_t = var_7_t.roops_core_objectsInstrumented_AvlNode_left;
                  roops.core.objectsInstrumented.AvlTree.variable_definition_6 = true;
                  roops.core.objectsInstrumented.AvlTree.variable_definition_5 = false;
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
                  boolean t_33;

                  t_33 = x  >  var_7_t.roops_core_objectsInstrumented_AvlNode_element;
                  if (t_33) {
                    {
                      {
                        {
                          {
                            {
                              {
                              }
                              var_7_t = var_7_t.roops_core_objectsInstrumented_AvlNode_right;
                              roops.core.objectsInstrumented.AvlTree.roops_goal_9 = roops.core.objectsInstrumented.AvlTree.variable_definition_6;
                              roops.core.objectsInstrumented.AvlTree.variable_definition_7 = true;
                              roops.core.objectsInstrumented.AvlTree.variable_definition_5 = false;
                              roops.core.objectsInstrumented.AvlTree.variable_definition_6 = false;
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
                              roops.core.objectsInstrumented.AvlTree.roops_goal_11 = roops.core.objectsInstrumented.AvlTree.variable_definition_6;
                              roops.core.objectsInstrumented.AvlTree.roops_goal_12 = roops.core.objectsInstrumented.AvlTree.variable_definition_7;

                              return var_7_t;
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
      var_8_ws_4 = var_7_t  !=  null;
    }
    {
    }

    return ((roops.core.objectsInstrumented.AvlNode)(null));
  }


  public roops.core.objectsInstrumented.AvlNode searchMax() {
    roops.core.objectsInstrumented.AvlNode t_35;

    t_35 = this.searchMax(this.roops_core_objectsInstrumented_AvlTree_root);

    return t_35;
  }


  public roops.core.objectsInstrumented.AvlNode searchMax(final roops.core.objectsInstrumented.AvlNode arg) {
    boolean t_36;
    roops.core.objectsInstrumented.AvlNode var_9_t = arg;

    t_36 = var_9_t  ==  null;

    if (t_36) {
      {
        {
          {
            {
              {
                {
                }

                return var_9_t;
              }
            }
          }
        }
      }
    }
    boolean var_10_ws_5;

    var_10_ws_5 = var_9_t.roops_core_objectsInstrumented_AvlNode_right  !=  null;
    while (var_10_ws_5) {
      {
      }
      var_9_t = var_9_t.roops_core_objectsInstrumented_AvlNode_right;
      var_10_ws_5 = var_9_t.roops_core_objectsInstrumented_AvlNode_right  !=  null;
    }
    {
    }

    return var_9_t;
  }


  public roops.core.objectsInstrumented.AvlNode searchMin() {
    roops.core.objectsInstrumented.AvlNode t_37;

    t_37 = this.searchMin(this.roops_core_objectsInstrumented_AvlTree_root);

    return t_37;
  }


  public roops.core.objectsInstrumented.AvlNode searchMin(final roops.core.objectsInstrumented.AvlNode arg) {
    boolean t_38;
    roops.core.objectsInstrumented.AvlNode var_11_t = arg;

    t_38 = var_11_t  ==  null;

    if (t_38) {
      {
        {
          {
            {
              {
                {
                }

                return var_11_t;
              }
            }
          }
        }
      }
    }
    boolean var_12_ws_6;

    var_12_ws_6 = var_11_t.roops_core_objectsInstrumented_AvlNode_left  !=  null;
    while (var_12_ws_6) {
      {
      }
      var_11_t = var_11_t.roops_core_objectsInstrumented_AvlNode_left;
      var_12_ws_6 = var_11_t.roops_core_objectsInstrumented_AvlNode_left  !=  null;
    }
    {
    }

    return var_11_t;
  }


  public AvlTree() {
    {
    }
  }


  public boolean repOK() {
    return true;
  }


  public static void fajita_roopsGoal_initialization() {
    roops.core.objectsInstrumented.AvlTree.roops_goal_9 = false;
    roops.core.objectsInstrumented.AvlTree.roops_goal_11 = false;
    roops.core.objectsInstrumented.AvlTree.roops_goal_12 = false;
    roops.core.objectsInstrumented.AvlTree.variable_definition_0 = false;
    roops.core.objectsInstrumented.AvlTree.variable_definition_1 = false;
    roops.core.objectsInstrumented.AvlTree.variable_definition_2 = false;
    roops.core.objectsInstrumented.AvlTree.variable_definition_3 = false;
    roops.core.objectsInstrumented.AvlTree.variable_definition_4 = false;
    roops.core.objectsInstrumented.AvlTree.variable_definition_5 = false;
    roops.core.objectsInstrumented.AvlTree.variable_definition_6 = false;
    roops.core.objectsInstrumented.AvlTree.variable_definition_7 = false;
    roops.core.objectsInstrumented.AvlTree.myRoopsArray = ((roops.utilInstrumented.RoopsArray)(null));
  }

}
