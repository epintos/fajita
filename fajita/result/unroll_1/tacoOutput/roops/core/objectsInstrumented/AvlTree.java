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
  public static boolean roops_goal_8;
  public static boolean roops_goal_9;
  public static boolean roops_goal_10;
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
    boolean t_2;
    boolean t_3;
    boolean t_4;

    fajita_roopsGoal_initialization();
    roops.core.objectsInstrumented.AvlTree.variable_definition_0 = true;
    roops.core.objectsInstrumented.AvlTree.variable_definition_1 = true;
    roops.core.objectsInstrumented.AvlTree.roops_goal_0 = roops.core.objectsInstrumented.AvlTree.variable_definition_0;
    roops.core.objectsInstrumented.AvlTree.roops_goal_1 = roops.core.objectsInstrumented.AvlTree.variable_definition_0;
    t_3 = tree  !=  null;

    if (t_3) {
      {
        {
          t_4 = tree.repOK();
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
    } else {
      {
        t_2 = false;
      }
    }
    if (t_2) {
      {
        {
          {
            {
              {
                roops.core.objectsInstrumented.AvlNode t_1;

                t_1 = tree.searchNode(x);
                roops.core.objectsInstrumented.AvlTree.roops_goal_2 = roops.core.objectsInstrumented.AvlTree.variable_definition_1;
                roops.core.objectsInstrumented.AvlTree.roops_goal_3 = roops.core.objectsInstrumented.AvlTree.variable_definition_0;
              }
            }
          }
        }
      }
    }
  }


  public static void searchMaxTest(roops.core.objectsInstrumented.AvlTree tree) {
    boolean t_6;
    boolean t_7;
    boolean t_8;

    t_7 = tree  !=  null;

    if (t_7) {
      {
        {
          t_8 = tree.repOK();
          if (t_8) {
            {
              t_6 = true;
            }
          } else {
            {
              t_6 = false;
            }
          }
        }
      }
    } else {
      {
        t_6 = false;
      }
    }
    if (t_6) {
      {
        {
          {
            {
              {
                roops.core.objectsInstrumented.AvlNode t_5;

                t_5 = tree.searchMax();
              }
            }
          }
        }
      }
    }
  }


  public static void searchMinTest(roops.core.objectsInstrumented.AvlTree tree) {
    boolean t_10;
    boolean t_11;
    boolean t_12;

    t_11 = tree  !=  null;

    if (t_11) {
      {
        {
          t_12 = tree.repOK();
          if (t_12) {
            {
              t_10 = true;
            }
          } else {
            {
              t_10 = false;
            }
          }
        }
      }
    } else {
      {
        t_10 = false;
      }
    }
    if (t_10) {
      {
        {
          {
            {
              {
                roops.core.objectsInstrumented.AvlNode t_9;

                t_9 = tree.searchMin();
              }
            }
          }
        }
      }
    }
  }


  public roops.core.objectsInstrumented.AvlNode searchNode(final int x) {
    roops.core.objectsInstrumented.AvlNode t_13;

    roops.core.objectsInstrumented.AvlTree.variable_definition_2 = true;
    roops.core.objectsInstrumented.AvlTree.roops_goal_4 = roops.core.objectsInstrumented.AvlTree.variable_definition_2;
    t_13 = this.search(x, this.roops_core_objectsInstrumented_AvlTree_root);

    return t_13;
  }


  public roops.core.objectsInstrumented.AvlNode search(final int x, final roops.core.objectsInstrumented.AvlNode arg) {
    roops.core.objectsInstrumented.AvlTree.variable_definition_3 = true;
    roops.core.objectsInstrumented.AvlTree.variable_definition_4 = true;
    roops.core.objectsInstrumented.AvlNode var_1_t = arg;

    roops.core.objectsInstrumented.AvlTree.roops_goal_5 = roops.core.objectsInstrumented.AvlTree.variable_definition_4;
    roops.core.objectsInstrumented.AvlTree.variable_definition_5 = true;
    roops.core.objectsInstrumented.AvlTree.roops_goal_6 = roops.core.objectsInstrumented.AvlTree.variable_definition_5;
    boolean var_2_ws_1;

    var_2_ws_1 = var_1_t  !=  null;
    while (var_2_ws_1) {
      boolean t_15;

      {
      }
      t_15 = x  <  var_1_t.roops_core_objectsInstrumented_AvlNode_element;

      if (t_15) {
        {
          {
            {
              {
                {
                  {
                  }
                  var_1_t = var_1_t.roops_core_objectsInstrumented_AvlNode_left;
                  roops.core.objectsInstrumented.AvlTree.roops_goal_7 = roops.core.objectsInstrumented.AvlTree.variable_definition_5;
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
                  boolean t_14;

                  t_14 = x  >  var_1_t.roops_core_objectsInstrumented_AvlNode_element;
                  if (t_14) {
                    {
                      {
                        {
                          {
                            {
                              {
                              }
                              var_1_t = var_1_t.roops_core_objectsInstrumented_AvlNode_right;
                              roops.core.objectsInstrumented.AvlTree.roops_goal_8 = roops.core.objectsInstrumented.AvlTree.variable_definition_5;
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
                              roops.core.objectsInstrumented.AvlTree.roops_goal_10 = roops.core.objectsInstrumented.AvlTree.variable_definition_5;
                              roops.core.objectsInstrumented.AvlTree.roops_goal_11 = roops.core.objectsInstrumented.AvlTree.variable_definition_6;
                              roops.core.objectsInstrumented.AvlTree.roops_goal_12 = roops.core.objectsInstrumented.AvlTree.variable_definition_7;

                              return var_1_t;
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
      var_2_ws_1 = var_1_t  !=  null;
    }
    {
    }

    return ((roops.core.objectsInstrumented.AvlNode)(null));
  }


  public roops.core.objectsInstrumented.AvlNode searchMax() {
    roops.core.objectsInstrumented.AvlNode t_16;

    t_16 = this.searchMax(this.roops_core_objectsInstrumented_AvlTree_root);

    return t_16;
  }


  public roops.core.objectsInstrumented.AvlNode searchMax(final roops.core.objectsInstrumented.AvlNode arg) {
    boolean t_17;
    roops.core.objectsInstrumented.AvlNode var_3_t = arg;

    t_17 = var_3_t  ==  null;

    if (t_17) {
      {
        {
          {
            {
              {
                {
                }

                return var_3_t;
              }
            }
          }
        }
      }
    }
    boolean var_4_ws_2;

    var_4_ws_2 = var_3_t.roops_core_objectsInstrumented_AvlNode_right  !=  null;
    while (var_4_ws_2) {
      {
      }
      var_3_t = var_3_t.roops_core_objectsInstrumented_AvlNode_right;
      var_4_ws_2 = var_3_t.roops_core_objectsInstrumented_AvlNode_right  !=  null;
    }
    {
    }

    return var_3_t;
  }


  public roops.core.objectsInstrumented.AvlNode searchMin() {
    roops.core.objectsInstrumented.AvlNode t_18;

    t_18 = this.searchMin(this.roops_core_objectsInstrumented_AvlTree_root);

    return t_18;
  }


  public roops.core.objectsInstrumented.AvlNode searchMin(final roops.core.objectsInstrumented.AvlNode arg) {
    boolean t_19;
    roops.core.objectsInstrumented.AvlNode var_5_t = arg;

    t_19 = var_5_t  ==  null;

    if (t_19) {
      {
        {
          {
            {
              {
                {
                }

                return var_5_t;
              }
            }
          }
        }
      }
    }
    boolean var_6_ws_3;

    var_6_ws_3 = var_5_t.roops_core_objectsInstrumented_AvlNode_left  !=  null;
    while (var_6_ws_3) {
      {
      }
      var_5_t = var_5_t.roops_core_objectsInstrumented_AvlNode_left;
      var_6_ws_3 = var_5_t.roops_core_objectsInstrumented_AvlNode_left  !=  null;
    }
    {
    }

    return var_5_t;
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
    roops.core.objectsInstrumented.AvlTree.roops_goal_8 = false;
    roops.core.objectsInstrumented.AvlTree.roops_goal_9 = false;
    roops.core.objectsInstrumented.AvlTree.roops_goal_10 = false;
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
