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
    boolean t_53;
    boolean t_54;
    boolean t_55;

    t_54 = tree  !=  null;

    if (t_54) {
      {
        {
          t_55 = tree.repOK();
          if (t_55) {
            {
              t_53 = true;
            }
          } else {
            {
              t_53 = false;
            }
          }
        }
      }
    } else {
      {
        t_53 = false;
      }
    }
    if (t_53) {
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
    boolean t_57;
    boolean t_58;
    boolean t_59;

    t_58 = tree  !=  null;

    if (t_58) {
      {
        {
          t_59 = tree.repOK();
          if (t_59) {
            {
              t_57 = true;
            }
          } else {
            {
              t_57 = false;
            }
          }
        }
      }
    } else {
      {
        t_57 = false;
      }
    }
    if (t_57) {
      {
        {
          {
            {
              {
                boolean t_56;

                t_56 = tree.contains(x);
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
    boolean t_61;
    boolean t_62;
    boolean t_63;
    boolean t_64;
    boolean t_65;

    fajita_roopsGoal_initialization();
    t_63 = tree  !=  null;

    if (t_63) {
      {
        {
          t_64 = z  !=  null;
          if (t_64) {
            {
              t_62 = true;
            }
          } else {
            {
              t_62 = false;
            }
          }
        }
      }
    } else {
      {
        t_62 = false;
      }
    }

    if (t_62) {
      {
        {
          t_65 = tree.repOK();
          if (t_65) {
            {
              t_61 = true;
            }
          } else {
            {
              t_61 = false;
            }
          }
        }
      }
    } else {
      {
        t_61 = false;
      }
    }
    if (t_61) {
      {
        {
          {
            {
              {
                roops.core.objectsInstrumented.BinTreeNode t_60;

                roops.core.objectsInstrumented.BinTree.roops_goal_0 = true;
                t_60 = tree.remove(z);
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
    boolean t_67;
    roops.core.objectsInstrumented.BinTreeNode var_13_current = this.roops_core_objectsInstrumented_BinTree_root;

    t_67 = this.roops_core_objectsInstrumented_BinTree_root  ==  null;

    if (t_67) {
      {
        {
          {
            {
              {
                roops.core.objectsInstrumented.BinTreeNode t_66;

                {
                }
                t_66 = new roops.core.objectsInstrumented.BinTreeNode();
                this.roops_core_objectsInstrumented_BinTree_root = t_66;
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
      boolean t_73;
      boolean t_79;
      boolean var_14_terminatesInTime = true;

      t_73 = var_13_current.roops_core_objectsInstrumented_BinTreeNode_key  !=  x;

      if (t_73) {
        {
          {
            {
              {
                {
                  boolean t_72;

                  {
                  }
                  t_72 = x  <  var_13_current.roops_core_objectsInstrumented_BinTreeNode_key;
                  if (t_72) {
                    {
                      {
                        {
                          {
                            {
                              boolean t_69;

                              {
                              }
                              t_69 = var_13_current.roops_core_objectsInstrumented_BinTreeNode_left  ==  null;
                              if (t_69) {
                                {
                                  {
                                    {
                                      {
                                        {
                                          roops.core.objectsInstrumented.BinTreeNode t_68;

                                          {
                                          }
                                          t_68 = new roops.core.objectsInstrumented.BinTreeNode();
                                          var_13_current.roops_core_objectsInstrumented_BinTreeNode_left = t_68;
                                          this.initNode(var_13_current.roops_core_objectsInstrumented_BinTreeNode_left, x);
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
                                          var_13_current = var_13_current.roops_core_objectsInstrumented_BinTreeNode_left;
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
                              boolean t_71;

                              {
                              }
                              t_71 = var_13_current.roops_core_objectsInstrumented_BinTreeNode_right  ==  null;
                              if (t_71) {
                                {
                                  {
                                    {
                                      {
                                        {
                                          roops.core.objectsInstrumented.BinTreeNode t_70;

                                          {
                                          }
                                          t_70 = new roops.core.objectsInstrumented.BinTreeNode();
                                          var_13_current.roops_core_objectsInstrumented_BinTreeNode_right = t_70;
                                          this.initNode(var_13_current.roops_core_objectsInstrumented_BinTreeNode_right, x);
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
                                          var_13_current = var_13_current.roops_core_objectsInstrumented_BinTreeNode_right;
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
      t_79 = var_13_current.roops_core_objectsInstrumented_BinTreeNode_key  !=  x;
      if (t_79) {
        {
          {
            {
              {
                {
                  boolean t_78;

                  {
                  }
                  t_78 = x  <  var_13_current.roops_core_objectsInstrumented_BinTreeNode_key;
                  if (t_78) {
                    {
                      {
                        {
                          {
                            {
                              boolean t_75;

                              {
                              }
                              t_75 = var_13_current.roops_core_objectsInstrumented_BinTreeNode_left  ==  null;
                              if (t_75) {
                                {
                                  {
                                    {
                                      {
                                        {
                                          roops.core.objectsInstrumented.BinTreeNode t_74;

                                          {
                                          }
                                          t_74 = new roops.core.objectsInstrumented.BinTreeNode();
                                          var_13_current.roops_core_objectsInstrumented_BinTreeNode_left = t_74;
                                          this.initNode(var_13_current.roops_core_objectsInstrumented_BinTreeNode_left, x);
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
                                          var_13_current = var_13_current.roops_core_objectsInstrumented_BinTreeNode_left;
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
                              boolean t_77;

                              {
                              }
                              t_77 = var_13_current.roops_core_objectsInstrumented_BinTreeNode_right  ==  null;
                              if (t_77) {
                                {
                                  {
                                    {
                                      {
                                        {
                                          roops.core.objectsInstrumented.BinTreeNode t_76;

                                          {
                                          }
                                          t_76 = new roops.core.objectsInstrumented.BinTreeNode();
                                          var_13_current.roops_core_objectsInstrumented_BinTreeNode_right = t_76;
                                          this.initNode(var_13_current.roops_core_objectsInstrumented_BinTreeNode_right, x);
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
                                          var_13_current = var_13_current.roops_core_objectsInstrumented_BinTreeNode_right;
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
    roops.core.objectsInstrumented.BinTreeNode var_15_current = this.roops_core_objectsInstrumented_BinTree_root;

    {
      boolean t_82;
      boolean t_85;
      boolean var_16_terminatesInTime = true;

      t_82 = var_15_current  !=  null;

      if (t_82) {
        {
          {
            {
              {
                {
                  boolean t_80;
                  boolean t_81;

                  {
                  }
                  t_80 = var_15_current.roops_core_objectsInstrumented_BinTreeNode_key  ==  x;

                  if (t_80) {
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
                  t_81 = x  <  var_15_current.roops_core_objectsInstrumented_BinTreeNode_key;
                  if (t_81) {
                    {
                      {
                        {
                          {
                            {
                              {
                              }
                              var_15_current = var_15_current.roops_core_objectsInstrumented_BinTreeNode_left;
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
                              var_15_current = var_15_current.roops_core_objectsInstrumented_BinTreeNode_right;
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
      t_85 = var_15_current  !=  null;
      if (t_85) {
        {
          {
            {
              {
                {
                  boolean t_83;
                  boolean t_84;

                  {
                  }
                  t_83 = var_15_current.roops_core_objectsInstrumented_BinTreeNode_key  ==  x;

                  if (t_83) {
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
                  t_84 = x  <  var_15_current.roops_core_objectsInstrumented_BinTreeNode_key;
                  if (t_84) {
                    {
                      {
                        {
                          {
                            {
                              {
                              }
                              var_15_current = var_15_current.roops_core_objectsInstrumented_BinTreeNode_left;
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
                              var_15_current = var_15_current.roops_core_objectsInstrumented_BinTreeNode_right;
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
    roops.core.objectsInstrumented.BinTreeNode var_17_x = x_param;

    {
      boolean t_86;
      boolean t_87;
      boolean var_18_terminatesInTime = true;

      t_86 = var_17_x.roops_core_objectsInstrumented_BinTreeNode_left  !=  null;

      if (t_86) {
        {
          {
            {
              {
                {
                  roops.core.objectsInstrumented.BinTree.roops_goal_2 = true;
                  {
                  }
                  var_17_x = var_17_x.roops_core_objectsInstrumented_BinTreeNode_left;
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
      t_87 = var_17_x.roops_core_objectsInstrumented_BinTreeNode_left  !=  null;
      if (t_87) {
        {
          {
            {
              {
                {
                  roops.core.objectsInstrumented.BinTree.roops_goal_4 = true;
                  {
                  }
                  var_17_x = var_17_x.roops_core_objectsInstrumented_BinTreeNode_left;
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

    return var_17_x;
  }


  public roops.core.objectsInstrumented.BinTreeNode treeSuccessor(final roops.core.objectsInstrumented.BinTreeNode x_param) {
    boolean t_95;
    roops.core.objectsInstrumented.BinTreeNode var_19_x = x_param;
    roops.core.objectsInstrumented.BinTreeNode var_20_result;

    t_95 = var_19_x.roops_core_objectsInstrumented_BinTreeNode_right  !=  null;

    if (t_95) {
      {
        {
          {
            {
              {
                roops.core.objectsInstrumented.BinTreeNode t_88;

                roops.core.objectsInstrumented.BinTree.roops_goal_6 = true;
                {
                }
                t_88 = this.treeMinimum(var_19_x.roops_core_objectsInstrumented_BinTreeNode_right);
                var_20_result = t_88;
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
                roops.core.objectsInstrumented.BinTreeNode var_21_y = var_19_x.roops_core_objectsInstrumented_BinTreeNode_parent;

                {
                  boolean t_89;
                  boolean t_90;
                  boolean t_91;
                  boolean t_92;
                  boolean t_93;
                  boolean t_94;
                  boolean var_22_terminatesInTime = true;

                  t_90 = var_21_y  !=  null;

                  if (t_90) {
                    {
                      {
                        t_91 = var_19_x  ==  var_21_y.roops_core_objectsInstrumented_BinTreeNode_right;
                        if (t_91) {
                          {
                            t_89 = true;
                          }
                        } else {
                          {
                            t_89 = false;
                          }
                        }
                      }
                    }
                  } else {
                    {
                      t_89 = false;
                    }
                  }

                  if (t_89) {
                    {
                      {
                        {
                          {
                            {
                              roops.core.objectsInstrumented.BinTree.roops_goal_8 = true;
                              {
                              }
                              var_19_x = var_21_y;
                              var_21_y = var_21_y.roops_core_objectsInstrumented_BinTreeNode_parent;
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
                  t_93 = var_21_y  !=  null;

                  if (t_93) {
                    {
                      {
                        t_94 = var_19_x  ==  var_21_y.roops_core_objectsInstrumented_BinTreeNode_right;
                        if (t_94) {
                          {
                            t_92 = true;
                          }
                        } else {
                          {
                            t_92 = false;
                          }
                        }
                      }
                    }
                  } else {
                    {
                      t_92 = false;
                    }
                  }
                  if (t_92) {
                    {
                      {
                        {
                          {
                            {
                              roops.core.objectsInstrumented.BinTree.roops_goal_10 = true;
                              {
                              }
                              var_19_x = var_21_y;
                              var_21_y = var_21_y.roops_core_objectsInstrumented_BinTreeNode_parent;
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
                var_20_result = var_21_y;
              }
            }
          }
        }
      }
    }
    {
    }

    return var_20_result;
  }


  public roops.core.objectsInstrumented.BinTreeNode remove(final roops.core.objectsInstrumented.BinTreeNode z) {
    boolean t_97;
    boolean t_98;
    boolean t_99;
    boolean t_100;
    boolean t_101;
    boolean t_103;
    boolean t_104;
    roops.core.objectsInstrumented.BinTreeNode var_23_y = ((roops.core.objectsInstrumented.BinTreeNode)(null));

    t_98 = z.roops_core_objectsInstrumented_BinTreeNode_left  ==  null;

    if (t_98) {
      {
        t_97 = true;
      }
    } else {
      {
        {
          t_99 = z.roops_core_objectsInstrumented_BinTreeNode_right  ==  null;
          if (t_99) {
            {
              t_97 = true;
            }
          } else {
            {
              t_97 = false;
            }
          }
        }
      }
    }

    if (t_97) {
      {
        {
          {
            {
              {
                roops.core.objectsInstrumented.BinTree.roops_goal_12 = true;
                {
                }
                var_23_y = z;
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
                roops.core.objectsInstrumented.BinTreeNode t_96;

                roops.core.objectsInstrumented.BinTree.roops_goal_13 = true;
                {
                }
                t_96 = this.treeSuccessor(z);
                var_23_y = t_96;
              }
            }
          }
        }
      }
    }
    roops.core.objectsInstrumented.BinTreeNode var_24_x = ((roops.core.objectsInstrumented.BinTreeNode)(null));

    t_100 = var_23_y.roops_core_objectsInstrumented_BinTreeNode_left  !=  null;

    if (t_100) {
      {
        {
          {
            {
              {
                roops.core.objectsInstrumented.BinTree.roops_goal_14 = true;
                {
                }
                var_24_x = var_23_y.roops_core_objectsInstrumented_BinTreeNode_left;
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
                var_24_x = var_23_y.roops_core_objectsInstrumented_BinTreeNode_right;
              }
            }
          }
        }
      }
    }
    t_101 = var_24_x  !=  null;

    if (t_101) {
      {
        {
          {
            {
              {
                roops.core.objectsInstrumented.BinTree.roops_goal_16 = true;
                {
                }
                var_24_x.roops_core_objectsInstrumented_BinTreeNode_parent = var_23_y.roops_core_objectsInstrumented_BinTreeNode_parent;
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
    t_103 = var_23_y.roops_core_objectsInstrumented_BinTreeNode_parent  ==  null;

    if (t_103) {
      {
        {
          {
            {
              {
                roops.core.objectsInstrumented.BinTree.roops_goal_18 = true;
                {
                }
                this.roops_core_objectsInstrumented_BinTree_root = var_24_x;
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
                boolean t_102;

                roops.core.objectsInstrumented.BinTree.roops_goal_19 = true;
                {
                }
                t_102 = var_23_y  ==  var_23_y.roops_core_objectsInstrumented_BinTreeNode_parent.roops_core_objectsInstrumented_BinTreeNode_left;
                if (t_102) {
                  {
                    {
                      {
                        {
                          {
                            roops.core.objectsInstrumented.BinTree.roops_goal_20 = true;
                            {
                            }
                            var_23_y.roops_core_objectsInstrumented_BinTreeNode_parent.roops_core_objectsInstrumented_BinTreeNode_left = var_24_x;
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
                            var_23_y.roops_core_objectsInstrumented_BinTreeNode_parent.roops_core_objectsInstrumented_BinTreeNode_right = var_24_x;
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
    t_104 = var_23_y  !=  z;

    if (t_104) {
      {
        {
          {
            {
              {
                roops.core.objectsInstrumented.BinTree.roops_goal_22 = true;
                {
                }
                z.roops_core_objectsInstrumented_BinTreeNode_key = var_23_y.roops_core_objectsInstrumented_BinTreeNode_key;
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

    return var_23_y;
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
