package roops.core.objectsInstrumented;

//@ model import org.jmlspecs.lang.*;

/** 
 @Invariant all n : BinTreeNode | n in this.root.*(left @+ right ) => ( 
            ( n !in n.^(left @+ right) ) && 
            ( all m: BinTreeNode | m in n.left.*(left @+right) => m.key < n.key ) && 
            ( all m: BinTreeNode | m in n.right.*(left @+right) => n.key < m.key ) && 
            ( n.left!=null => n.left.parent=n ) &&
            ( n.right!=null=> n.right.parent=n ) && 
            ( n=this.root => n.parent=null ) ) ;
 
*/
public class BinTree extends java.lang.Object {

  public /*@ nullable @*/ roops.core.objectsInstrumented.BinTreeNode roops_core_objectsInstrumented_BinTree_root;
  public static boolean roops_goal_5;
  public static boolean roops_goal_6;
  public static boolean roops_goal_7;
  public static roops.utilInstrumented.RoopsArray myRoopsArray;

  public static void addTest(roops.core.objectsInstrumented.BinTree tree, int x) {
    boolean t_41;
    boolean t_42;
    boolean t_43;

    t_42 = tree  !=  null;

    if (t_42) {
      {
        {
          t_43 = tree.repOK();
          if (t_43) {
            {
              t_41 = true;
            }
          } else {
            {
              t_41 = false;
            }
          }
        }
      }
    } else {
      {
        t_41 = false;
      }
    }
    if (t_41) {
      {
        {
          {
            {
              {
                tree.add(x);
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
              }
            }
          }
        }
      }
    }
  }
/** @Modifies_Everything
 @Ensures false;
*/

  public static void containsTest(roops.core.objectsInstrumented.BinTree tree, int x) {
    boolean t_45;
    boolean t_46;
    boolean t_47;

    fajita_roopsGoal_initialization();
    boolean var_16_ret_val;

    t_46 = tree  !=  null;

    if (t_46) {
      {
        {
          t_47 = tree.repOK();
          if (t_47) {
            {
              t_45 = true;
            }
          } else {
            {
              t_45 = false;
            }
          }
        }
      }
    } else {
      {
        t_45 = false;
      }
    }
    if (t_45) {
      {
        {
          {
            {
              {
                boolean t_44;

                t_44 = tree.contains(x);
                var_16_ret_val = t_44;
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
              }
            }
          }
        }
      }
    }
  }


  public static void removeTest(roops.core.objectsInstrumented.BinTree tree, roops.core.objectsInstrumented.BinTreeNode z) {
    boolean t_49;
    boolean t_50;
    boolean t_51;
    boolean t_52;
    boolean t_53;
    roops.core.objectsInstrumented.BinTreeNode var_17_ret_val;

    t_51 = tree  !=  null;

    if (t_51) {
      {
        {
          t_52 = z  !=  null;
          if (t_52) {
            {
              t_50 = true;
            }
          } else {
            {
              t_50 = false;
            }
          }
        }
      }
    } else {
      {
        t_50 = false;
      }
    }

    if (t_50) {
      {
        {
          t_53 = tree.repOK();
          if (t_53) {
            {
              t_49 = true;
            }
          } else {
            {
              t_49 = false;
            }
          }
        }
      }
    } else {
      {
        t_49 = false;
      }
    }
    if (t_49) {
      {
        {
          {
            {
              {
                roops.core.objectsInstrumented.BinTreeNode t_48;

                t_48 = tree.remove(z);
                var_17_ret_val = t_48;
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
              }
            }
          }
        }
      }
    }
  }


  public void add(int x) {
    boolean t_55;
    roops.core.objectsInstrumented.BinTreeNode var_18_current = this.roops_core_objectsInstrumented_BinTree_root;

    t_55 = this.roops_core_objectsInstrumented_BinTree_root  ==  null;

    if (t_55) {
      {
        {
          {
            {
              {
                roops.core.objectsInstrumented.BinTreeNode t_54;

                {
                }
                t_54 = new roops.core.objectsInstrumented.BinTreeNode();
                this.roops_core_objectsInstrumented_BinTree_root = t_54;
                this.initNode(this.roops_core_objectsInstrumented_BinTree_root, x);

                return;
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
              }
            }
          }
        }
      }
    }
    boolean var_19_ws_5;

    var_19_ws_5 = var_18_current.roops_core_objectsInstrumented_BinTreeNode_key  !=  x;
    while (var_19_ws_5) {
      boolean t_60;

      {
      }
      t_60 = x  <  var_18_current.roops_core_objectsInstrumented_BinTreeNode_key;

      if (t_60) {
        {
          {
            {
              {
                {
                  boolean t_57;

                  {
                  }
                  t_57 = var_18_current.roops_core_objectsInstrumented_BinTreeNode_left  ==  null;
                  if (t_57) {
                    {
                      {
                        {
                          {
                            {
                              roops.core.objectsInstrumented.BinTreeNode t_56;

                              {
                              }
                              t_56 = new roops.core.objectsInstrumented.BinTreeNode();
                              var_18_current.roops_core_objectsInstrumented_BinTreeNode_left = t_56;
                              this.initNode(var_18_current.roops_core_objectsInstrumented_BinTreeNode_left, x);
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
                              var_18_current = var_18_current.roops_core_objectsInstrumented_BinTreeNode_left;
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
      } else {
        {
          {
            {
              {
                {
                  boolean t_59;

                  {
                  }
                  t_59 = var_18_current.roops_core_objectsInstrumented_BinTreeNode_right  ==  null;
                  if (t_59) {
                    {
                      {
                        {
                          {
                            {
                              roops.core.objectsInstrumented.BinTreeNode t_58;

                              {
                              }
                              t_58 = new roops.core.objectsInstrumented.BinTreeNode();
                              var_18_current.roops_core_objectsInstrumented_BinTreeNode_right = t_58;
                              this.initNode(var_18_current.roops_core_objectsInstrumented_BinTreeNode_right, x);
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
                              var_18_current = var_18_current.roops_core_objectsInstrumented_BinTreeNode_right;
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
      var_19_ws_5 = var_18_current.roops_core_objectsInstrumented_BinTreeNode_key  !=  x;
    }
    {
    }
  }


  public void initNode(roops.core.objectsInstrumented.BinTreeNode node, int x) {
    node.roops_core_objectsInstrumented_BinTreeNode_key = x;
    node.roops_core_objectsInstrumented_BinTreeNode_left = ((roops.core.objectsInstrumented.BinTreeNode)(null));
    node.roops_core_objectsInstrumented_BinTreeNode_right = ((roops.core.objectsInstrumented.BinTreeNode)(null));
  }


  public boolean contains(int x) {
    roops.core.objectsInstrumented.BinTreeNode var_20_current = this.roops_core_objectsInstrumented_BinTree_root;

    {
      boolean var_21_ws_6;

      var_21_ws_6 = var_20_current  !=  null;
      while (var_21_ws_6) {
        boolean t_61;
        boolean t_62;

        {
        }
        t_61 = var_20_current.roops_core_objectsInstrumented_BinTreeNode_key  ==  x;

        if (t_61) {
          {
            {
              {
                {
                  {
                    {
                    }

                    return true;
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
                    roops.core.objectsInstrumented.BinTree.roops_goal_5 = true;
                  }
                }
              }
            }
          }
        }
        t_62 = x  <  var_20_current.roops_core_objectsInstrumented_BinTreeNode_key;

        if (t_62) {
          {
            {
              {
                {
                  {
                    roops.core.objectsInstrumented.BinTree.roops_goal_6 = true;
                    {
                    }
                    var_20_current = var_20_current.roops_core_objectsInstrumented_BinTreeNode_left;
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
                    roops.core.objectsInstrumented.BinTree.roops_goal_7 = true;
                    {
                    }
                    var_20_current = var_20_current.roops_core_objectsInstrumented_BinTreeNode_right;
                  }
                }
              }
            }
          }
        }
        var_21_ws_6 = var_20_current  !=  null;
      }
    }
    {
    }

    return false;
  }


  public roops.core.objectsInstrumented.BinTreeNode treeMinimum(final roops.core.objectsInstrumented.BinTreeNode x_param) {
    roops.core.objectsInstrumented.BinTreeNode var_22_x = x_param;
    boolean var_23_ws_7;

    var_23_ws_7 = var_22_x.roops_core_objectsInstrumented_BinTreeNode_left  !=  null;
    while (var_23_ws_7) {
      {
      }
      var_22_x = var_22_x.roops_core_objectsInstrumented_BinTreeNode_left;
      var_23_ws_7 = var_22_x.roops_core_objectsInstrumented_BinTreeNode_left  !=  null;
    }
    {
    }

    return var_22_x;
  }


  public roops.core.objectsInstrumented.BinTreeNode treeSuccessor(final roops.core.objectsInstrumented.BinTreeNode x_param) {
    boolean t_70;
    roops.core.objectsInstrumented.BinTreeNode var_24_x = x_param;
    roops.core.objectsInstrumented.BinTreeNode var_25_result;

    t_70 = var_24_x.roops_core_objectsInstrumented_BinTreeNode_right  !=  null;

    if (t_70) {
      {
        {
          {
            {
              {
                roops.core.objectsInstrumented.BinTreeNode t_63;

                {
                }
                t_63 = this.treeMinimum(var_24_x.roops_core_objectsInstrumented_BinTreeNode_right);
                var_25_result = t_63;
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
                boolean t_64;
                boolean t_65;
                boolean t_66;

                {
                }
                roops.core.objectsInstrumented.BinTreeNode var_26_y = var_24_x.roops_core_objectsInstrumented_BinTreeNode_parent;
                boolean var_27_ws_8;

                t_65 = var_26_y  !=  null;

                if (t_65) {
                  {
                    {
                      t_66 = var_24_x  ==  var_26_y.roops_core_objectsInstrumented_BinTreeNode_right;
                      if (t_66) {
                        {
                          t_64 = true;
                        }
                      } else {
                        {
                          t_64 = false;
                        }
                      }
                    }
                  }
                } else {
                  {
                    t_64 = false;
                  }
                }
                var_27_ws_8 = t_64;
                while (var_27_ws_8) {
                  boolean t_67;
                  boolean t_68;
                  boolean t_69;

                  {
                  }
                  var_24_x = var_26_y;
                  var_26_y = var_26_y.roops_core_objectsInstrumented_BinTreeNode_parent;
                  t_68 = var_26_y  !=  null;

                  if (t_68) {
                    {
                      {
                        t_69 = var_24_x  ==  var_26_y.roops_core_objectsInstrumented_BinTreeNode_right;
                        if (t_69) {
                          {
                            t_67 = true;
                          }
                        } else {
                          {
                            t_67 = false;
                          }
                        }
                      }
                    }
                  } else {
                    {
                      t_67 = false;
                    }
                  }
                  var_27_ws_8 = t_67;
                }
                var_25_result = var_26_y;
              }
            }
          }
        }
      }
    }
    {
    }

    return var_25_result;
  }


  public roops.core.objectsInstrumented.BinTreeNode remove(final roops.core.objectsInstrumented.BinTreeNode z) {
    boolean t_72;
    boolean t_73;
    boolean t_74;
    boolean t_75;
    boolean t_76;
    boolean t_78;
    boolean t_79;
    roops.core.objectsInstrumented.BinTreeNode var_28_y = ((roops.core.objectsInstrumented.BinTreeNode)(null));

    t_73 = z.roops_core_objectsInstrumented_BinTreeNode_left  ==  null;

    if (t_73) {
      {
        t_72 = true;
      }
    } else {
      {
        {
          t_74 = z.roops_core_objectsInstrumented_BinTreeNode_right  ==  null;
          if (t_74) {
            {
              t_72 = true;
            }
          } else {
            {
              t_72 = false;
            }
          }
        }
      }
    }

    if (t_72) {
      {
        {
          {
            {
              {
                {
                }
                var_28_y = z;
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
                roops.core.objectsInstrumented.BinTreeNode t_71;

                {
                }
                t_71 = this.treeSuccessor(z);
                var_28_y = t_71;
              }
            }
          }
        }
      }
    }
    roops.core.objectsInstrumented.BinTreeNode var_29_x = ((roops.core.objectsInstrumented.BinTreeNode)(null));

    t_75 = var_28_y.roops_core_objectsInstrumented_BinTreeNode_left  !=  null;

    if (t_75) {
      {
        {
          {
            {
              {
                {
                }
                var_29_x = var_28_y.roops_core_objectsInstrumented_BinTreeNode_left;
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
                var_29_x = var_28_y.roops_core_objectsInstrumented_BinTreeNode_right;
              }
            }
          }
        }
      }
    }
    t_76 = var_29_x  !=  null;

    if (t_76) {
      {
        {
          {
            {
              {
                {
                }
                var_29_x.roops_core_objectsInstrumented_BinTreeNode_parent = var_28_y.roops_core_objectsInstrumented_BinTreeNode_parent;
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
              }
            }
          }
        }
      }
    }
    t_78 = var_28_y.roops_core_objectsInstrumented_BinTreeNode_parent  ==  null;

    if (t_78) {
      {
        {
          {
            {
              {
                {
                }
                this.roops_core_objectsInstrumented_BinTree_root = var_29_x;
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
                boolean t_77;

                {
                }
                t_77 = var_28_y  ==  var_28_y.roops_core_objectsInstrumented_BinTreeNode_parent.roops_core_objectsInstrumented_BinTreeNode_left;
                if (t_77) {
                  {
                    {
                      {
                        {
                          {
                            {
                            }
                            var_28_y.roops_core_objectsInstrumented_BinTreeNode_parent.roops_core_objectsInstrumented_BinTreeNode_left = var_29_x;
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
                            var_28_y.roops_core_objectsInstrumented_BinTreeNode_parent.roops_core_objectsInstrumented_BinTreeNode_right = var_29_x;
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
    t_79 = var_28_y  !=  z;

    if (t_79) {
      {
        {
          {
            {
              {
                {
                }
                z.roops_core_objectsInstrumented_BinTreeNode_key = var_28_y.roops_core_objectsInstrumented_BinTreeNode_key;
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
              }
            }
          }
        }
      }
    }
    {
    }

    return var_28_y;
  }


  public BinTree() {
    this.roops_core_objectsInstrumented_BinTree_root = ((roops.core.objectsInstrumented.BinTreeNode)(null));
    {
    }
  }


  public boolean repOK() {
    return true;
  }


  public static void fajita_roopsGoal_initialization() {
    roops.core.objectsInstrumented.BinTree.roops_goal_5 = false;
    roops.core.objectsInstrumented.BinTree.roops_goal_6 = false;
    roops.core.objectsInstrumented.BinTree.roops_goal_7 = false;
    roops.core.objectsInstrumented.BinTree.myRoopsArray = ((roops.utilInstrumented.RoopsArray)(null));
  }

}
