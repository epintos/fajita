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
  public static boolean roops_goal_7;/** @Modifies_Everything
 @Ensures false;
*/

  public static void containsTest(roops.core.objectsInstrumented.SinglyLinkedList list, int value_param) {
    boolean t_138;
    boolean t_139;
    boolean t_140;

    fajita_roopsGoal_initialization();
    boolean var_57_ret_val;

    t_139 = list  !=  null;

    if (t_139) {
      {
        {
          t_140 = list.repOK();
          if (t_140) {
            {
              t_138 = true;
            }
          } else {
            {
              t_138 = false;
            }
          }
        }
      }
    } else {
      {
        t_138 = false;
      }
    }
    if (t_138) {
      {
        {
          {
            {
              {
                boolean t_137;

                roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_0 = true;
                t_137 = list.contains(value_param);
                var_57_ret_val = t_137;
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
    boolean t_141;
    boolean t_142;
    boolean t_143;

    t_142 = list  !=  null;

    if (t_142) {
      {
        {
          t_143 = list.repOK();
          if (t_143) {
            {
              t_141 = true;
            }
          } else {
            {
              t_141 = false;
            }
          }
        }
      }
    } else {
      {
        t_141 = false;
      }
    }
    if (t_141) {
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
    boolean t_144;
    boolean t_145;
    boolean t_146;

    t_145 = list  !=  null;

    if (t_145) {
      {
        {
          t_146 = list.repOK();
          if (t_146) {
            {
              t_144 = true;
            }
          } else {
            {
              t_144 = false;
            }
          }
        }
      }
    } else {
      {
        t_144 = false;
      }
    }
    if (t_144) {
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
      boolean t_147;
      boolean t_148;
      boolean t_149;
      boolean t_155;
      boolean var_60_fajita_cicle_2 = false;
      boolean var_61_ws_10;

      t_148 = var_59_result  ==  false;

      if (t_148) {
        {
          {
            t_149 = var_58_current  !=  null;
            if (t_149) {
              {
                t_147 = true;
              }
            } else {
              {
                t_147 = false;
              }
            }
          }
        }
      } else {
        {
          t_147 = false;
        }
      }
      var_61_ws_10 = t_147;
      while (var_61_ws_10) {
        boolean t_150;
        boolean t_151;
        boolean t_152;
        boolean t_153;
        boolean t_154;

        var_60_fajita_cicle_2 = true;
        roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_2 = true;
        boolean var_62_equalVal;

        t_150 = value_param  ==  var_58_current.roops_core_objectsInstrumented_SinglyLinkedListNode_value;

        if (t_150) {
          {
            {
              {
                {
                  {
                    roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_4 = true;
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
                    roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_5 = true;
                    var_62_equalVal = false;
                  }
                }
              }
            }
          }
        }
        t_151 = var_62_equalVal  ==  true;

        if (t_151) {
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
        t_153 = var_59_result  ==  false;

        if (t_153) {
          {
            {
              t_154 = var_58_current  !=  null;
              if (t_154) {
                {
                  t_152 = true;
                }
              } else {
                {
                  t_152 = false;
                }
              }
            }
          }
        } else {
          {
            t_152 = false;
          }
        }
        var_61_ws_10 = t_152;
      }
      t_155 = ! var_60_fajita_cicle_2;
      if (t_155) {
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
    }

    return var_59_result;
  }


  public void remove(int index) {
    boolean t_157;
    boolean t_158;
    boolean t_159;
    boolean t_160;
    boolean t_166;
    boolean t_167;

    t_157 = index  <  0;

    if (t_157) {
      {
        {
          {
            {
              {
                java.lang.RuntimeException t_156;

                t_156 = new java.lang.RuntimeException();
                throw t_156;
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
    boolean var_67_ws_11;

    t_159 = var_66_found  ==  false;

    if (t_159) {
      {
        {
          t_160 = var_63_current  !=  null;
          if (t_160) {
            {
              t_158 = true;
            }
          } else {
            {
              t_158 = false;
            }
          }
        }
      }
    } else {
      {
        t_158 = false;
      }
    }
    var_67_ws_11 = t_158;
    while (var_67_ws_11) {
      boolean t_161;
      boolean t_162;
      boolean t_163;
      boolean t_164;

      t_161 = index  ==  var_65_current_index;

      if (t_161) {
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
      t_163 = var_66_found  ==  false;

      if (t_163) {
        {
          {
            t_164 = var_63_current  !=  null;
            if (t_164) {
              {
                t_162 = true;
              }
            } else {
              {
                t_162 = false;
              }
            }
          }
        }
      } else {
        {
          t_162 = false;
        }
      }
      var_67_ws_11 = t_162;
    }
    t_166 = var_66_found  ==  false;

    if (t_166) {
      {
        {
          {
            {
              {
                java.lang.RuntimeException t_165;

                t_165 = new java.lang.RuntimeException();
                throw t_165;
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
    t_167 = var_64_previous  ==  null;
    if (t_167) {
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
    roops.core.objectsInstrumented.SinglyLinkedListNode t_168;
    boolean t_169;

    t_168 = new roops.core.objectsInstrumented.SinglyLinkedListNode();
    roops.core.objectsInstrumented.SinglyLinkedListNode var_68_freshNode = t_168;

    var_68_freshNode.roops_core_objectsInstrumented_SinglyLinkedListNode_value = arg;
    var_68_freshNode.roops_core_objectsInstrumented_SinglyLinkedListNode_next = ((roops.core.objectsInstrumented.SinglyLinkedListNode)(null));
    t_169 = this.roops_core_objectsInstrumented_SinglyLinkedList_header  ==  null;
    if (t_169) {
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
                boolean var_70_ws_12;

                var_70_ws_12 = var_69_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next  !=  null;
                while (var_70_ws_12) {
                  var_69_current = var_69_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
                  var_70_ws_12 = var_69_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next  !=  null;
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
  }

}
