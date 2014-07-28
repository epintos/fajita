package roops.core.objectsInstrumented;

//@ model import org.jmlspecs.lang.*;

/** @Invariant all n: SinglyLinkedListNode | ( ( n in this.header.*next @- null ) => ( n !in n.next.*next @- null ) ) ;
*/
public class SinglyLinkedList extends java.lang.Object {

  public /*@ nullable @*/ roops.core.objectsInstrumented.SinglyLinkedListNode roops_core_objectsInstrumented_SinglyLinkedList_header;
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
  public static boolean roops_goal_13;/** @Modifies_Everything
 @Ensures false;
*/

  public static void containsTest(roops.core.objectsInstrumented.SinglyLinkedList list, int value_param) {
    boolean t_150;
    boolean t_151;
    boolean t_152;

    fajita_roopsGoal_initialization();
    boolean var_57_ret_val;

    t_151 = list  !=  null;

    if (t_151) {
      {
        {
          t_152 = list.repOK();
          if (t_152) {
            {
              t_150 = true;
            }
          } else {
            {
              t_150 = false;
            }
          }
        }
      }
    } else {
      {
        t_150 = false;
      }
    }
    if (t_150) {
      {
        {
          {
            {
              {
                boolean t_149;

                roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_0 = true;
                t_149 = list.contains(value_param);
                var_57_ret_val = t_149;
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
                roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_1 = true;
              }
            }
          }
        }
      }
    }
  }


  public static void insertBackTest(roops.core.objectsInstrumented.SinglyLinkedList list, int arg) {
    boolean t_153;
    boolean t_154;
    boolean t_155;

    t_154 = list  !=  null;

    if (t_154) {
      {
        {
          t_155 = list.repOK();
          if (t_155) {
            {
              t_153 = true;
            }
          } else {
            {
              t_153 = false;
            }
          }
        }
      }
    } else {
      {
        t_153 = false;
      }
    }
    if (t_153) {
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


  public static void removeTest(roops.core.objectsInstrumented.SinglyLinkedList list, int index) {
    boolean t_156;
    boolean t_157;
    boolean t_158;

    t_157 = list  !=  null;

    if (t_157) {
      {
        {
          t_158 = list.repOK();
          if (t_158) {
            {
              t_156 = true;
            }
          } else {
            {
              t_156 = false;
            }
          }
        }
      }
    } else {
      {
        t_156 = false;
      }
    }
    if (t_156) {
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


  public boolean contains(int value_param) {
    roops.core.objectsInstrumented.SinglyLinkedListNode var_58_current;
    boolean var_59_result;

    var_58_current = this.roops_core_objectsInstrumented_SinglyLinkedList_header;
    var_59_result = false;
    {
      boolean t_161;
      boolean t_162;
      boolean t_163;
      boolean t_166;
      boolean t_167;
      boolean t_168;
      boolean var_60_terminatesInTime = true;

      t_162 = var_59_result  ==  false;

      if (t_162) {
        {
          {
            t_163 = var_58_current  !=  null;
            if (t_163) {
              {
                t_161 = true;
              }
            } else {
              {
                t_161 = false;
              }
            }
          }
        }
      } else {
        {
          t_161 = false;
        }
      }

      if (t_161) {
        {
          {
            {
              {
                {
                  boolean t_159;
                  boolean t_160;

                  roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_2 = true;
                  boolean var_61_equalVal;

                  t_159 = value_param  ==  var_58_current.roops_core_objectsInstrumented_SinglyLinkedListNode_value;

                  if (t_159) {
                    {
                      {
                        {
                          {
                            {
                              roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_4 = true;
                              var_61_equalVal = true;
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
                              roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_5 = true;
                              var_61_equalVal = false;
                            }
                          }
                        }
                      }
                    }
                  }
                  t_160 = var_61_equalVal  ==  true;

                  if (t_160) {
                    {
                      {
                        {
                          {
                            {
                              roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_6 = true;
                              var_59_result = true;
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
                              roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_7 = true;
                            }
                          }
                        }
                      }
                    }
                  }
                  var_58_current = var_58_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
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
                  roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_3 = true;
                }
              }
            }
          }
        }
      }
      t_167 = var_59_result  ==  false;

      if (t_167) {
        {
          {
            t_168 = var_58_current  !=  null;
            if (t_168) {
              {
                t_166 = true;
              }
            } else {
              {
                t_166 = false;
              }
            }
          }
        }
      } else {
        {
          t_166 = false;
        }
      }
      if (t_166) {
        {
          {
            {
              {
                {
                  boolean t_164;
                  boolean t_165;

                  roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_8 = true;
                  boolean var_62_equalVal;

                  t_164 = value_param  ==  var_58_current.roops_core_objectsInstrumented_SinglyLinkedListNode_value;

                  if (t_164) {
                    {
                      {
                        {
                          {
                            {
                              roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_10 = true;
                              var_62_equalVal = true;
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
                              roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_11 = true;
                              var_62_equalVal = false;
                            }
                          }
                        }
                      }
                    }
                  }
                  t_165 = var_62_equalVal  ==  true;

                  if (t_165) {
                    {
                      {
                        {
                          {
                            {
                              roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_12 = true;
                              var_59_result = true;
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
                              roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_13 = true;
                            }
                          }
                        }
                      }
                    }
                  }
                  var_58_current = var_58_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
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
                  roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_9 = true;
                }
              }
            }
          }
        }
      }
    }

    return var_59_result;
  }


  public void remove(int index) {
    boolean t_170;
    boolean t_180;
    boolean t_181;

    t_170 = index  <  0;

    if (t_170) {
      {
        {
          {
            {
              {
                java.lang.RuntimeException t_169;

                t_169 = new java.lang.RuntimeException();
                throw t_169;
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
    roops.core.objectsInstrumented.SinglyLinkedListNode var_63_current;

    var_63_current = this.roops_core_objectsInstrumented_SinglyLinkedList_header;
    roops.core.objectsInstrumented.SinglyLinkedListNode var_64_previous;

    var_64_previous = ((roops.core.objectsInstrumented.SinglyLinkedListNode)(null));
    int var_65_current_index;

    var_65_current_index = 0;
    boolean var_66_found = false;

    {
      boolean t_172;
      boolean t_173;
      boolean t_174;
      boolean t_176;
      boolean t_177;
      boolean t_178;
      boolean var_67_terminatesInTime = true;

      t_173 = var_66_found  ==  false;

      if (t_173) {
        {
          {
            t_174 = var_63_current  !=  null;
            if (t_174) {
              {
                t_172 = true;
              }
            } else {
              {
                t_172 = false;
              }
            }
          }
        }
      } else {
        {
          t_172 = false;
        }
      }

      if (t_172) {
        {
          {
            {
              {
                {
                  boolean t_171;

                  t_171 = index  ==  var_65_current_index;
                  if (t_171) {
                    {
                      {
                        {
                          {
                            {
                              var_66_found = true;
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
                              var_65_current_index = var_65_current_index + 1;
                              var_64_previous = var_63_current;
                              var_63_current = var_63_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
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
      t_177 = var_66_found  ==  false;

      if (t_177) {
        {
          {
            t_178 = var_63_current  !=  null;
            if (t_178) {
              {
                t_176 = true;
              }
            } else {
              {
                t_176 = false;
              }
            }
          }
        }
      } else {
        {
          t_176 = false;
        }
      }
      if (t_176) {
        {
          {
            {
              {
                {
                  boolean t_175;

                  t_175 = index  ==  var_65_current_index;
                  if (t_175) {
                    {
                      {
                        {
                          {
                            {
                              var_66_found = true;
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
                              var_65_current_index = var_65_current_index + 1;
                              var_64_previous = var_63_current;
                              var_63_current = var_63_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
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
    t_180 = var_66_found  ==  false;

    if (t_180) {
      {
        {
          {
            {
              {
                java.lang.RuntimeException t_179;

                t_179 = new java.lang.RuntimeException();
                throw t_179;
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
    t_181 = var_64_previous  ==  null;
    if (t_181) {
      {
        {
          {
            {
              {
                this.roops_core_objectsInstrumented_SinglyLinkedList_header = var_63_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
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
                var_64_previous.roops_core_objectsInstrumented_SinglyLinkedListNode_next = var_63_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
              }
            }
          }
        }
      }
    }
  }


  public void insertBack(int arg) {
    roops.core.objectsInstrumented.SinglyLinkedListNode t_182;
    boolean t_185;

    t_182 = new roops.core.objectsInstrumented.SinglyLinkedListNode();
    roops.core.objectsInstrumented.SinglyLinkedListNode var_68_freshNode = t_182;

    var_68_freshNode.roops_core_objectsInstrumented_SinglyLinkedListNode_value = arg;
    var_68_freshNode.roops_core_objectsInstrumented_SinglyLinkedListNode_next = ((roops.core.objectsInstrumented.SinglyLinkedListNode)(null));
    t_185 = this.roops_core_objectsInstrumented_SinglyLinkedList_header  ==  null;
    if (t_185) {
      {
        {
          {
            {
              {
                this.roops_core_objectsInstrumented_SinglyLinkedList_header = var_68_freshNode;
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
                roops.core.objectsInstrumented.SinglyLinkedListNode var_69_current;

                var_69_current = this.roops_core_objectsInstrumented_SinglyLinkedList_header;
                {
                  boolean t_183;
                  boolean t_184;
                  boolean var_70_terminatesInTime = true;

                  t_183 = var_69_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next  !=  null;

                  if (t_183) {
                    {
                      {
                        {
                          {
                            {
                              var_69_current = var_69_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
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
                  t_184 = var_69_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next  !=  null;
                  if (t_184) {
                    {
                      {
                        {
                          {
                            {
                              var_69_current = var_69_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
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
                var_69_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next = var_68_freshNode;
              }
            }
          }
        }
      }
    }
  }


  public SinglyLinkedList() {
    this.roops_core_objectsInstrumented_SinglyLinkedList_header = ((roops.core.objectsInstrumented.SinglyLinkedListNode)(null));
    {
    }
  }


  public boolean repOK() {
    return true;
  }


  public static void fajita_roopsGoal_initialization() {
    roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_0 = false;
    roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_1 = false;
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
  }

}
