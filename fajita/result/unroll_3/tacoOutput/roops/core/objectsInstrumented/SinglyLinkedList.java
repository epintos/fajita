package roops.core.objectsInstrumented;

//@ model import org.jmlspecs.lang.*;

/** @Invariant all n: SinglyLinkedListNode | ( ( n in this.header.*next @- null ) => ( n !in n.next.*next @- null ) ) ;
*/
public class SinglyLinkedList extends java.lang.Object {

  public roops.core.objectsInstrumented.SinglyLinkedListNode roops_core_objectsInstrumented_SinglyLinkedList_header;
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
  public static roops.utilInstrumented.RoopsArray myRoopsArray;
  public static boolean variable_definition_0;
  public static boolean variable_definition_1;
  public static boolean variable_definition_2;
  public static boolean variable_definition_3;
  public static boolean variable_definition_4;
  public static boolean variable_definition_5;
  public static boolean variable_definition_6;
  public static boolean variable_definition_7;
  public static boolean variable_definition_8;
  public static boolean variable_definition_9;
  public static boolean variable_definition_10;
  public static boolean variable_definition_11;
  public static boolean variable_definition_12;
  public static boolean variable_definition_13;
  public static boolean variable_definition_14;
  public static boolean variable_definition_15;/** @Modifies_Everything
 @Ensures false;
*/

  public static void containsTest(roops.core.objectsInstrumented.SinglyLinkedList list, java.lang.Object value_param) {
    boolean t_146;
    boolean t_147;
    boolean t_148;

    fajita_roopsGoal_initialization();
    roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_0 = true;
    roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_1 = true;
    boolean var_53_ret_val;

    roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_2 = true;
    t_147 = list  !=  null;
    t_148 = list.repOK();

    if (t_147) {
      {
        {
          if (t_148) {
            {
              {
                t_146 = true;
              }
            }
          } else {
            {
              {
                t_146 = false;
              }
            }
          }
        }
      }
    } else {
      {
        {
          t_146 = false;
        }
      }
    }
    if (t_146) {
      {
        {
          {
            {
              {
                {
                  boolean t_145;

                  t_145 = list.contains(value_param);
                  var_53_ret_val = t_145;
                  roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_2 = roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_1;
                  roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_3 = roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_0;
                  roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_3 = true;
                  roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_2 = false;
                }
              }
            }
          }
        }
      }
    }
  }


  public static void insertBackTest(roops.core.objectsInstrumented.SinglyLinkedList list, java.lang.Object arg) {
    boolean t_149;
    boolean t_150;
    boolean t_151;

    t_150 = list  !=  null;
    t_151 = list.repOK();

    if (t_150) {
      {
        {
          if (t_151) {
            {
              {
                t_149 = true;
              }
            }
          } else {
            {
              {
                t_149 = false;
              }
            }
          }
        }
      }
    } else {
      {
        {
          t_149 = false;
        }
      }
    }
    if (t_149) {
      {
        {
          {
            {
              {
                {
                  list.insertBack(arg);
                }
              }
            }
          }
        }
      }
    }
  }


  public static void removeTest(roops.core.objectsInstrumented.SinglyLinkedList list, int index) {
    boolean t_152;
    boolean t_153;
    boolean t_154;

    t_153 = list  !=  null;
    t_154 = list.repOK();

    if (t_153) {
      {
        {
          if (t_154) {
            {
              {
                t_152 = true;
              }
            }
          } else {
            {
              {
                t_152 = false;
              }
            }
          }
        }
      }
    } else {
      {
        {
          t_152 = false;
        }
      }
    }
    if (t_152) {
      {
        {
          {
            {
              {
                {
                  list.remove(index);
                }
              }
            }
          }
        }
      }
    }
  }


  public boolean contains(java.lang.Object value_param) {
    boolean t_155;
    boolean t_156;
    boolean t_157;

    roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_4 = true;
    roops.core.objectsInstrumented.SinglyLinkedListNode var_54_current;

    roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_5 = true;
    boolean var_55_result;

    roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_6 = true;
    var_54_current = this.roops_core_objectsInstrumented_SinglyLinkedList_header;
    roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_7 = true;
    var_55_result = false;
    roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_8 = true;
    roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_4 = roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_8;
    roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_5 = roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_7;
    boolean var_56_ws_13;

    t_156 = var_55_result  ==  false;
    t_157 = var_54_current  !=  null;

    if (t_156) {
      {
        {
          if (t_157) {
            {
              {
                t_155 = true;
              }
            }
          } else {
            {
              {
                t_155 = false;
              }
            }
          }
        }
      }
    } else {
      {
        {
          t_155 = false;
        }
      }
    }
    var_56_ws_13 = t_155;
    while (var_56_ws_13) {
      boolean t_160;
      boolean t_161;
      boolean t_162;
      boolean t_163;
      boolean t_164;
      boolean t_165;
      boolean t_166;
      boolean var_57_equalVal;

      roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_9 = true;
      roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_6 = roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_4;
      roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_7 = roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_7;
      t_161 = value_param  ==  null;
      t_162 = var_54_current.roops_core_objectsInstrumented_SinglyLinkedListNode_value  ==  null;

      if (t_161) {
        {
          {
            if (t_162) {
              {
                {
                  t_160 = true;
                }
              }
            } else {
              {
                {
                  t_160 = false;
                }
              }
            }
          }
        }
      } else {
        {
          {
            t_160 = false;
          }
        }
      }

      if (t_160) {
        {
          {
            {
              {
                {
                  {
                    var_57_equalVal = true;
                    roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_10 = true;
                    roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_9 = false;
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
                  {
                    boolean t_159;

                    t_159 = value_param  !=  null;
                    if (t_159) {
                      {
                        {
                          {
                            {
                              {
                                {
                                  boolean t_158;

                                  roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_8 = roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_4;
                                  roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_9 = roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_7;
                                  t_158 = value_param  ==  var_54_current.roops_core_objectsInstrumented_SinglyLinkedListNode_value;
                                  if (t_158) {
                                    {
                                      {
                                        {
                                          {
                                            {
                                              {
                                                var_57_equalVal = true;
                                                roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_11 = true;
                                                roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_9 = false;
                                                roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_10 = false;
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
                                              {
                                                var_57_equalVal = false;
                                                roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_12 = true;
                                                roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_9 = false;
                                                roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_10 = false;
                                                roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_11 = false;
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
                                {
                                  var_57_equalVal = false;
                                  roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_13 = true;
                                  roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_9 = false;
                                  roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_10 = false;
                                  roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_11 = false;
                                  roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_12 = false;
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
      roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_10 = roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_9;
      roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_11 = roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_10;
      roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_12 = roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_11;
      roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_13 = roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_12;
      roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_14 = roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_13;
      t_163 = var_57_equalVal  ==  true;

      if (t_163) {
        {
          {
            {
              {
                {
                  {
                    var_55_result = true;
                    roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_14 = true;
                    roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_8 = false;
                  }
                }
              }
            }
          }
        }
      }
      var_54_current = var_54_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
      roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_15 = roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_7;
      roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_15 = true;
      roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_7 = false;
      t_165 = var_55_result  ==  false;
      t_166 = var_54_current  !=  null;

      if (t_165) {
        {
          {
            if (t_166) {
              {
                {
                  t_164 = true;
                }
              }
            } else {
              {
                {
                  t_164 = false;
                }
              }
            }
          }
        }
      } else {
        {
          {
            t_164 = false;
          }
        }
      }
      var_56_ws_13 = t_164;
    }
    roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_16 = roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_8;
    roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_17 = roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_14;

    return var_55_result;
  }


  public void remove(int index) {
    boolean t_168;
    boolean t_169;
    boolean t_170;
    boolean t_171;
    boolean t_177;
    boolean t_178;

    t_168 = index  <  0;

    if (t_168) {
      {
        {
          {
            {
              {
                {
                  java.lang.RuntimeException t_167;

                  t_167 = new java.lang.RuntimeException();
                  throw t_167;
                }
              }
            }
          }
        }
      }
    }
    roops.core.objectsInstrumented.SinglyLinkedListNode var_58_current;

    var_58_current = this.roops_core_objectsInstrumented_SinglyLinkedList_header;
    roops.core.objectsInstrumented.SinglyLinkedListNode var_59_previous;

    var_59_previous = ((roops.core.objectsInstrumented.SinglyLinkedListNode)(null));
    int var_60_current_index;

    var_60_current_index = 0;
    boolean var_61_found = false;
    boolean var_62_ws_14;

    t_170 = var_61_found  ==  false;
    t_171 = var_58_current  !=  null;

    if (t_170) {
      {
        {
          if (t_171) {
            {
              {
                t_169 = true;
              }
            }
          } else {
            {
              {
                t_169 = false;
              }
            }
          }
        }
      }
    } else {
      {
        {
          t_169 = false;
        }
      }
    }
    var_62_ws_14 = t_169;
    while (var_62_ws_14) {
      boolean t_172;
      boolean t_173;
      boolean t_174;
      boolean t_175;

      t_172 = index  ==  var_60_current_index;

      if (t_172) {
        {
          {
            {
              {
                {
                  {
                    var_61_found = true;
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
                  {
                    var_60_current_index = var_60_current_index + 1;
                    var_59_previous = var_58_current;
                    var_58_current = var_58_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
                  }
                }
              }
            }
          }
        }
      }
      t_174 = var_61_found  ==  false;
      t_175 = var_58_current  !=  null;

      if (t_174) {
        {
          {
            if (t_175) {
              {
                {
                  t_173 = true;
                }
              }
            } else {
              {
                {
                  t_173 = false;
                }
              }
            }
          }
        }
      } else {
        {
          {
            t_173 = false;
          }
        }
      }
      var_62_ws_14 = t_173;
    }
    t_177 = var_61_found  ==  false;

    if (t_177) {
      {
        {
          {
            {
              {
                {
                  java.lang.RuntimeException t_176;

                  t_176 = new java.lang.RuntimeException();
                  throw t_176;
                }
              }
            }
          }
        }
      }
    }
    t_178 = var_59_previous  ==  null;
    if (t_178) {
      {
        {
          {
            {
              {
                {
                  this.roops_core_objectsInstrumented_SinglyLinkedList_header = var_58_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
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
                {
                  var_59_previous.roops_core_objectsInstrumented_SinglyLinkedListNode_next = var_58_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
                }
              }
            }
          }
        }
      }
    }
  }


  public void insertBack(java.lang.Object arg) {
    roops.core.objectsInstrumented.SinglyLinkedListNode t_179;
    boolean t_180;

    t_179 = new roops.core.objectsInstrumented.SinglyLinkedListNode();
    roops.core.objectsInstrumented.SinglyLinkedListNode var_63_freshNode = t_179;

    var_63_freshNode.roops_core_objectsInstrumented_SinglyLinkedListNode_value = arg;
    var_63_freshNode.roops_core_objectsInstrumented_SinglyLinkedListNode_next = ((roops.core.objectsInstrumented.SinglyLinkedListNode)(null));
    t_180 = this.roops_core_objectsInstrumented_SinglyLinkedList_header  ==  null;
    if (t_180) {
      {
        {
          {
            {
              {
                {
                  this.roops_core_objectsInstrumented_SinglyLinkedList_header = var_63_freshNode;
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
                {
                  roops.core.objectsInstrumented.SinglyLinkedListNode var_64_current;

                  var_64_current = this.roops_core_objectsInstrumented_SinglyLinkedList_header;
                  boolean var_65_ws_15;

                  var_65_ws_15 = var_64_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next  !=  null;
                  while (var_65_ws_15) {
                    var_64_current = var_64_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
                    var_65_ws_15 = var_64_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next  !=  null;
                  }
                  var_64_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next = var_63_freshNode;
                }
              }
            }
          }
        }
      }
    }
  }


  public SinglyLinkedList() {
    {
    }
  }


  public boolean repOK() {
    return true;
  }


  public static void fajita_roopsGoal_initialization() {
    roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_2 = false;
    roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_3 = false;
    roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_4 = false;
    roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_5 = false;
    roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_6 = false;
    roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_7 = false;
    roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_8 = false;
    roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_9 = false;
    roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_10 = false;
    roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_11 = false;
    roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_12 = false;
    roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_13 = false;
    roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_14 = false;
    roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_15 = false;
    roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_16 = false;
    roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_17 = false;
    roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_0 = false;
    roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_1 = false;
    roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_2 = false;
    roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_3 = false;
    roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_4 = false;
    roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_5 = false;
    roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_6 = false;
    roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_7 = false;
    roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_8 = false;
    roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_9 = false;
    roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_10 = false;
    roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_11 = false;
    roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_12 = false;
    roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_13 = false;
    roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_14 = false;
    roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_15 = false;
    roops.core.objectsInstrumented.SinglyLinkedList.myRoopsArray = ((roops.utilInstrumented.RoopsArray)(null));
  }

}
