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

  public roops.core.objectsInstrumented.BinTreeNode roops_core_objectsInstrumented_BinTree_root;
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
  public static boolean roops_goal_13;
  public static boolean roops_goal_14;
  public static boolean roops_goal_15;
  public static boolean roops_goal_16;
  public static boolean roops_goal_17;
  public static boolean roops_goal_18;
  public static boolean roops_goal_19;
  public static boolean roops_goal_20;
  public static boolean roops_goal_21;
  public static boolean roops_goal_22;
  public static boolean roops_goal_23;
  public static roops.utilInstrumented.RoopsArray myRoopsArray;

  public static void addTest(roops.core.objectsInstrumented.BinTree tree, int x) {
    boolean t_1;
    boolean t_2;
    boolean t_3;

    t_2 = tree  !=  null;

    if (t_2) {
      {
        {
          t_3 = tree.repOK();
          if (t_3) {
            {
              t_1 = true;
            }
          } else {
            {
              t_1 = false;
            }
          }
        }
      }
    } else {
      {
        t_1 = false;
      }
    }
    if (t_1) {
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


  public static void containsTest(roops.core.objectsInstrumented.BinTree tree, int x) {
    boolean t_5;
    boolean t_6;
    boolean t_7;

    t_6 = tree  !=  null;

    if (t_6) {
      {
        {
          t_7 = tree.repOK();
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
                boolean t_4;

                t_4 = tree.contains(x);
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

  public static void removeTest(roops.core.objectsInstrumented.BinTree tree, roops.core.objectsInstrumented.BinTreeNode z) {
    boolean t_9;
    boolean t_10;
    boolean t_11;
    boolean t_12;
    boolean t_13;

    fajita_roopsGoal_initialization();
    t_11 = tree  !=  null;

    if (t_11) {
      {
        {
          t_12 = z  !=  null;
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
          t_13 = tree.repOK();
          if (t_13) {
            {
              t_9 = true;
            }
          } else {
            {
              t_9 = false;
            }
          }
        }
      }
    } else {
      {
        t_9 = false;
      }
    }
    if (t_9) {
      {
        {
          {
            {
              {
                roops.core.objectsInstrumented.BinTreeNode t_8;

                roops.core.objectsInstrumented.BinTree.roops_goal_0 = true;
                t_8 = tree.remove(z);
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
                roops.core.objectsInstrumented.BinTree.roops_goal_1 = true;
              }
            }
          }
        }
      }
    }
  }


  public void add(int x) {
    boolean t_15;
    roops.core.objectsInstrumented.BinTreeNode var_1_current = this.roops_core_objectsInstrumented_BinTree_root;

    t_15 = this.roops_core_objectsInstrumented_BinTree_root  ==  null;

    if (t_15) {
      {
        {
          {
            {
              {
                roops.core.objectsInstrumented.BinTreeNode t_14;

                {
                }
                t_14 = new roops.core.objectsInstrumented.BinTreeNode();
                this.roops_core_objectsInstrumented_BinTree_root = t_14;
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
    {
      boolean t_21;
      boolean t_27;
      boolean var_2_terminatesInTime = true;

      t_21 = var_1_current.roops_core_objectsInstrumented_BinTreeNode_key  !=  x;

      if (t_21) {
        {
          {
            {
              {
                {
                  boolean t_20;

                  {
                  }
                  t_20 = x  <  var_1_current.roops_core_objectsInstrumented_BinTreeNode_key;
                  if (t_20) {
                    {
                      {
                        {
                          {
                            {
                              boolean t_17;

                              {
                              }
                              t_17 = var_1_current.roops_core_objectsInstrumented_BinTreeNode_left  ==  null;
                              if (t_17) {
                                {
                                  {
                                    {
                                      {
                                        {
                                          roops.core.objectsInstrumented.BinTreeNode t_16;

                                          {
                                          }
                                          t_16 = new roops.core.objectsInstrumented.BinTreeNode();
                                          var_1_current.roops_core_objectsInstrumented_BinTreeNode_left = t_16;
                                          this.initNode(var_1_current.roops_core_objectsInstrumented_BinTreeNode_left, x);
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
                                          var_1_current = var_1_current.roops_core_objectsInstrumented_BinTreeNode_left;
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
                              boolean t_19;

                              {
                              }
                              t_19 = var_1_current.roops_core_objectsInstrumented_BinTreeNode_right  ==  null;
                              if (t_19) {
                                {
                                  {
                                    {
                                      {
                                        {
                                          roops.core.objectsInstrumented.BinTreeNode t_18;

                                          {
                                          }
                                          t_18 = new roops.core.objectsInstrumented.BinTreeNode();
                                          var_1_current.roops_core_objectsInstrumented_BinTreeNode_right = t_18;
                                          this.initNode(var_1_current.roops_core_objectsInstrumented_BinTreeNode_right, x);
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
                                          var_1_current = var_1_current.roops_core_objectsInstrumented_BinTreeNode_right;
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
      t_27 = var_1_current.roops_core_objectsInstrumented_BinTreeNode_key  !=  x;
      if (t_27) {
        {
          {
            {
              {
                {
                  boolean t_26;

                  {
                  }
                  t_26 = x  <  var_1_current.roops_core_objectsInstrumented_BinTreeNode_key;
                  if (t_26) {
                    {
                      {
                        {
                          {
                            {
                              boolean t_23;

                              {
                              }
                              t_23 = var_1_current.roops_core_objectsInstrumented_BinTreeNode_left  ==  null;
                              if (t_23) {
                                {
                                  {
                                    {
                                      {
                                        {
                                          roops.core.objectsInstrumented.BinTreeNode t_22;

                                          {
                                          }
                                          t_22 = new roops.core.objectsInstrumented.BinTreeNode();
                                          var_1_current.roops_core_objectsInstrumented_BinTreeNode_left = t_22;
                                          this.initNode(var_1_current.roops_core_objectsInstrumented_BinTreeNode_left, x);
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
                                          var_1_current = var_1_current.roops_core_objectsInstrumented_BinTreeNode_left;
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
                              boolean t_25;

                              {
                              }
                              t_25 = var_1_current.roops_core_objectsInstrumented_BinTreeNode_right  ==  null;
                              if (t_25) {
                                {
                                  {
                                    {
                                      {
                                        {
                                          roops.core.objectsInstrumented.BinTreeNode t_24;

                                          {
                                          }
                                          t_24 = new roops.core.objectsInstrumented.BinTreeNode();
                                          var_1_current.roops_core_objectsInstrumented_BinTreeNode_right = t_24;
                                          this.initNode(var_1_current.roops_core_objectsInstrumented_BinTreeNode_right, x);
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
                                          var_1_current = var_1_current.roops_core_objectsInstrumented_BinTreeNode_right;
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
    {
    }
  }


  public void initNode(roops.core.objectsInstrumented.BinTreeNode node, int x) {
    node.roops_core_objectsInstrumented_BinTreeNode_key = x;
    node.roops_core_objectsInstrumented_BinTreeNode_left = ((roops.core.objectsInstrumented.BinTreeNode)(null));
    node.roops_core_objectsInstrumented_BinTreeNode_right = ((roops.core.objectsInstrumented.BinTreeNode)(null));
  }


  public boolean contains(int x) {
    roops.core.objectsInstrumented.BinTreeNode var_3_current = this.roops_core_objectsInstrumented_BinTree_root;

    {
      boolean t_30;
      boolean t_33;
      boolean var_4_terminatesInTime = true;

      t_30 = var_3_current  !=  null;

      if (t_30) {
        {
          {
            {
              {
                {
                  boolean t_28;
                  boolean t_29;

                  {
                  }
                  t_28 = var_3_current.roops_core_objectsInstrumented_BinTreeNode_key  ==  x;

                  if (t_28) {
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
                            }
                          }
                        }
                      }
                    }
                  }
                  t_29 = x  <  var_3_current.roops_core_objectsInstrumented_BinTreeNode_key;
                  if (t_29) {
                    {
                      {
                        {
                          {
                            {
                              {
                              }
                              var_3_current = var_3_current.roops_core_objectsInstrumented_BinTreeNode_left;
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
                              var_3_current = var_3_current.roops_core_objectsInstrumented_BinTreeNode_right;
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
                }
              }
            }
          }
        }
      }
      t_33 = var_3_current  !=  null;
      if (t_33) {
        {
          {
            {
              {
                {
                  boolean t_31;
                  boolean t_32;

                  {
                  }
                  t_31 = var_3_current.roops_core_objectsInstrumented_BinTreeNode_key  ==  x;

                  if (t_31) {
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
                            }
                          }
                        }
                      }
                    }
                  }
                  t_32 = x  <  var_3_current.roops_core_objectsInstrumented_BinTreeNode_key;
                  if (t_32) {
                    {
                      {
                        {
                          {
                            {
                              {
                              }
                              var_3_current = var_3_current.roops_core_objectsInstrumented_BinTreeNode_left;
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
                              var_3_current = var_3_current.roops_core_objectsInstrumented_BinTreeNode_right;
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
                }
              }
            }
          }
        }
      }
    }
    {
    }

    return false;
  }


  public roops.core.objectsInstrumented.BinTreeNode treeMinimum(final roops.core.objectsInstrumented.BinTreeNode x_param) {
    roops.core.objectsInstrumented.BinTreeNode var_5_x = x_param;

    {
      boolean t_34;
      boolean t_35;
      boolean var_6_terminatesInTime = true;

      t_34 = var_5_x.roops_core_objectsInstrumented_BinTreeNode_left  !=  null;

      if (t_34) {
        {
          {
            {
              {
                {
                  roops.core.objectsInstrumented.BinTree.roops_goal_2 = true;
                  {
                  }
                  var_5_x = var_5_x.roops_core_objectsInstrumented_BinTreeNode_left;
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
                  roops.core.objectsInstrumented.BinTree.roops_goal_3 = true;
                }
              }
            }
          }
        }
      }
      t_35 = var_5_x.roops_core_objectsInstrumented_BinTreeNode_left  !=  null;
      if (t_35) {
        {
          {
            {
              {
                {
                  roops.core.objectsInstrumented.BinTree.roops_goal_4 = true;
                  {
                  }
                  var_5_x = var_5_x.roops_core_objectsInstrumented_BinTreeNode_left;
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
    }
    {
    }

    return var_5_x;
  }


  public roops.core.objectsInstrumented.BinTreeNode treeSuccessor(final roops.core.objectsInstrumented.BinTreeNode x_param) {
    boolean t_43;
    roops.core.objectsInstrumented.BinTreeNode var_7_x = x_param;
    roops.core.objectsInstrumented.BinTreeNode var_8_result;

    t_43 = var_7_x.roops_core_objectsInstrumented_BinTreeNode_right  !=  null;

    if (t_43) {
      {
        {
          {
            {
              {
                roops.core.objectsInstrumented.BinTreeNode t_36;

                roops.core.objectsInstrumented.BinTree.roops_goal_6 = true;
                {
                }
                t_36 = this.treeMinimum(var_7_x.roops_core_objectsInstrumented_BinTreeNode_right);
                var_8_result = t_36;
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
                roops.core.objectsInstrumented.BinTreeNode var_9_y = var_7_x.roops_core_objectsInstrumented_BinTreeNode_parent;

                {
                  boolean t_37;
                  boolean t_38;
                  boolean t_39;
                  boolean t_40;
                  boolean t_41;
                  boolean t_42;
                  boolean var_10_terminatesInTime = true;

                  t_38 = var_9_y  !=  null;

                  if (t_38) {
                    {
                      {
                        t_39 = var_7_x  ==  var_9_y.roops_core_objectsInstrumented_BinTreeNode_right;
                        if (t_39) {
                          {
                            t_37 = true;
                          }
                        } else {
                          {
                            t_37 = false;
                          }
                        }
                      }
                    }
                  } else {
                    {
                      t_37 = false;
                    }
                  }

                  if (t_37) {
                    {
                      {
                        {
                          {
                            {
                              roops.core.objectsInstrumented.BinTree.roops_goal_8 = true;
                              {
                              }
                              var_7_x = var_9_y;
                              var_9_y = var_9_y.roops_core_objectsInstrumented_BinTreeNode_parent;
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
                              roops.core.objectsInstrumented.BinTree.roops_goal_9 = true;
                            }
                          }
                        }
                      }
                    }
                  }
                  t_41 = var_9_y  !=  null;

                  if (t_41) {
                    {
                      {
                        t_42 = var_7_x  ==  var_9_y.roops_core_objectsInstrumented_BinTreeNode_right;
                        if (t_42) {
                          {
                            t_40 = true;
                          }
                        } else {
                          {
                            t_40 = false;
                          }
                        }
                      }
                    }
                  } else {
                    {
                      t_40 = false;
                    }
                  }
                  if (t_40) {
                    {
                      {
                        {
                          {
                            {
                              roops.core.objectsInstrumented.BinTree.roops_goal_10 = true;
                              {
                              }
                              var_7_x = var_9_y;
                              var_9_y = var_9_y.roops_core_objectsInstrumented_BinTreeNode_parent;
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
                              roops.core.objectsInstrumented.BinTree.roops_goal_11 = true;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                var_8_result = var_9_y;
              }
            }
          }
        }
      }
    }
    {
    }

    return var_8_result;
  }


  public roops.core.objectsInstrumented.BinTreeNode remove(final roops.core.objectsInstrumented.BinTreeNode z) {
    boolean t_45;
    boolean t_46;
    boolean t_47;
    boolean t_48;
    boolean t_49;
    boolean t_51;
    boolean t_52;
    roops.core.objectsInstrumented.BinTreeNode var_11_y = ((roops.core.objectsInstrumented.BinTreeNode)(null));

    t_46 = z.roops_core_objectsInstrumented_BinTreeNode_left  ==  null;

    if (t_46) {
      {
        t_45 = true;
      }
    } else {
      {
        {
          t_47 = z.roops_core_objectsInstrumented_BinTreeNode_right  ==  null;
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
    }

    if (t_45) {
      {
        {
          {
            {
              {
                roops.core.objectsInstrumented.BinTree.roops_goal_12 = true;
                {
                }
                var_11_y = z;
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
                roops.core.objectsInstrumented.BinTreeNode t_44;

                roops.core.objectsInstrumented.BinTree.roops_goal_13 = true;
                {
                }
                t_44 = this.treeSuccessor(z);
                var_11_y = t_44;
              }
            }
          }
        }
      }
    }
    roops.core.objectsInstrumented.BinTreeNode var_12_x = ((roops.core.objectsInstrumented.BinTreeNode)(null));

    t_48 = var_11_y.roops_core_objectsInstrumented_BinTreeNode_left  !=  null;

    if (t_48) {
      {
        {
          {
            {
              {
                roops.core.objectsInstrumented.BinTree.roops_goal_14 = true;
                {
                }
                var_12_x = var_11_y.roops_core_objectsInstrumented_BinTreeNode_left;
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
                roops.core.objectsInstrumented.BinTree.roops_goal_15 = true;
                {
                }
                var_12_x = var_11_y.roops_core_objectsInstrumented_BinTreeNode_right;
              }
            }
          }
        }
      }
    }
    t_49 = var_12_x  !=  null;

    if (t_49) {
      {
        {
          {
            {
              {
                roops.core.objectsInstrumented.BinTree.roops_goal_16 = true;
                {
                }
                var_12_x.roops_core_objectsInstrumented_BinTreeNode_parent = var_11_y.roops_core_objectsInstrumented_BinTreeNode_parent;
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
                roops.core.objectsInstrumented.BinTree.roops_goal_17 = true;
              }
            }
          }
        }
      }
    }
    t_51 = var_11_y.roops_core_objectsInstrumented_BinTreeNode_parent  ==  null;

    if (t_51) {
      {
        {
          {
            {
              {
                roops.core.objectsInstrumented.BinTree.roops_goal_18 = true;
                {
                }
                this.roops_core_objectsInstrumented_BinTree_root = var_12_x;
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
                boolean t_50;

                roops.core.objectsInstrumented.BinTree.roops_goal_19 = true;
                {
                }
                t_50 = var_11_y  ==  var_11_y.roops_core_objectsInstrumented_BinTreeNode_parent.roops_core_objectsInstrumented_BinTreeNode_left;
                if (t_50) {
                  {
                    {
                      {
                        {
                          {
                            roops.core.objectsInstrumented.BinTree.roops_goal_20 = true;
                            {
                            }
                            var_11_y.roops_core_objectsInstrumented_BinTreeNode_parent.roops_core_objectsInstrumented_BinTreeNode_left = var_12_x;
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
                            roops.core.objectsInstrumented.BinTree.roops_goal_21 = true;
                            {
                            }
                            var_11_y.roops_core_objectsInstrumented_BinTreeNode_parent.roops_core_objectsInstrumented_BinTreeNode_right = var_12_x;
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
    t_52 = var_11_y  !=  z;

    if (t_52) {
      {
        {
          {
            {
              {
                roops.core.objectsInstrumented.BinTree.roops_goal_22 = true;
                {
                }
                z.roops_core_objectsInstrumented_BinTreeNode_key = var_11_y.roops_core_objectsInstrumented_BinTreeNode_key;
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
                roops.core.objectsInstrumented.BinTree.roops_goal_23 = true;
              }
            }
          }
        }
      }
    }
    {
    }

    return var_11_y;
  }


  public BinTree() {
    {
    }
  }


  public boolean repOK() {
    return true;
  }


  public static void fajita_roopsGoal_initialization() {
    roops.core.objectsInstrumented.BinTree.roops_goal_0 = false;
    roops.core.objectsInstrumented.BinTree.roops_goal_1 = false;
    roops.core.objectsInstrumented.BinTree.roops_goal_2 = false;
    roops.core.objectsInstrumented.BinTree.roops_goal_3 = false;
    roops.core.objectsInstrumented.BinTree.roops_goal_4 = false;
    roops.core.objectsInstrumented.BinTree.roops_goal_5 = false;
    roops.core.objectsInstrumented.BinTree.roops_goal_6 = false;
    roops.core.objectsInstrumented.BinTree.roops_goal_7 = false;
    roops.core.objectsInstrumented.BinTree.roops_goal_8 = false;
    roops.core.objectsInstrumented.BinTree.roops_goal_9 = false;
    roops.core.objectsInstrumented.BinTree.roops_goal_10 = false;
    roops.core.objectsInstrumented.BinTree.roops_goal_11 = false;
    roops.core.objectsInstrumented.BinTree.roops_goal_12 = false;
    roops.core.objectsInstrumented.BinTree.roops_goal_13 = false;
    roops.core.objectsInstrumented.BinTree.roops_goal_14 = false;
    roops.core.objectsInstrumented.BinTree.roops_goal_15 = false;
    roops.core.objectsInstrumented.BinTree.roops_goal_16 = false;
    roops.core.objectsInstrumented.BinTree.roops_goal_17 = false;
    roops.core.objectsInstrumented.BinTree.roops_goal_18 = false;
    roops.core.objectsInstrumented.BinTree.roops_goal_19 = false;
    roops.core.objectsInstrumented.BinTree.roops_goal_20 = false;
    roops.core.objectsInstrumented.BinTree.roops_goal_21 = false;
    roops.core.objectsInstrumented.BinTree.roops_goal_22 = false;
    roops.core.objectsInstrumented.BinTree.roops_goal_23 = false;
    roops.core.objectsInstrumented.BinTree.myRoopsArray = ((roops.utilInstrumented.RoopsArray)(null));
  }

}
