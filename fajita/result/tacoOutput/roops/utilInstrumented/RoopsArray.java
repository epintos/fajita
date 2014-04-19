package roops.utilInstrumented;

//@ model import org.jmlspecs.lang.*;


public class RoopsArray extends java.lang.Object {

  public static boolean roops_goal_0;
  public static boolean roops_goal_1;

  public static int getLength(int[] a) {
    return a.length;
  }


  public static void fajita_roopsGoal_initialization() {
    roops.utilInstrumented.RoopsArray.roops_goal_0 = false;
    roops.utilInstrumented.RoopsArray.roops_goal_1 = false;
  }


  public RoopsArray() {
  }

}
