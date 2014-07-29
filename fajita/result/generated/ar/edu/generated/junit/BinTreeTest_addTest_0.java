package ar.edu.generated.junit;

import java.lang.reflect.Method;
import java.lang.reflect.Field;
import org.junit.Test;

public class BinTreeTest_addTest_0 {

    /**
     * Auxiliar function that embed awful reflection code
     * 
     * @param instance
     * @param fieldName
     * @param value
     */
    private void updateValue(Object instance, String fieldName, Object value) {
        for (Field aField : instance.getClass().getDeclaredFields()) {
            if (aField.getName().equals(fieldName)) {
                try {
                    aField.setAccessible(true);
                    if (aField.getType().isPrimitive()) {
                        String typeSimpleName = aField.getType().getSimpleName();
                        if (typeSimpleName.equals("boolean")) {
                            aField.setBoolean(instance, (Boolean) value);
                        } else if (typeSimpleName.endsWith("byte")) {
                            aField.setByte(instance, (Byte) value);
                        } else if (typeSimpleName.endsWith("char")) {
                            aField.setChar(instance, (Character) value);
                        } else if (typeSimpleName.endsWith("double")) {
                            aField.setDouble(instance, (Double) value);
                        } else if (typeSimpleName.endsWith("float")) {
                            aField.setFloat(instance, (Float) value);
                        } else if (typeSimpleName.endsWith("int")) {
                            aField.setInt(instance, (Integer) value);
                        } else if (typeSimpleName.endsWith("long")) {
                            aField.setLong(instance, (Long) value);
                        } else if (typeSimpleName.endsWith("short")) {
                            aField.setShort(instance, (Short) value);
                        } else {
                            System.out.println("ERROR: No difinida");
                        }
                    } else {
                        aField.set(instance, value);
                    };

                    aField.setAccessible(false);
                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * Auxiliar function that embed awful reflection code
     * 
     * @param className
     * @param methodName
     * @param value
     */
    private Method getAccessibleMethod(String className, String methodName, boolean value) {
        Class<?> clazz;
        try {
            clazz = Class.forName(className);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("DYNJALLOY ERROR! " + e.getMessage());
        }

        Method methodToCheck = null;
        try {
            // Gets parameters types
            Class<?>[] parameterTypes = null;
            for (Method aMethod: clazz.getDeclaredMethods()) {
                if (aMethod.getName().equals(methodName)) {
                    parameterTypes = aMethod.getParameterTypes();
                }
            }
            methodToCheck = clazz.getDeclaredMethod(methodName, parameterTypes);
        } catch (SecurityException e) {
            throw new RuntimeException("DYNJALLOY ERROR! " + e.getMessage());
        } catch (NoSuchMethodException e) {
            throw new RuntimeException("DYNJALLOY ERROR! " + e.getMessage());
        }
        methodToCheck.setAccessible(value);

        return methodToCheck;
    }

    @Test
    public void testaddTest_0() {
        roops.core.objectsInstrumented.BinTree instance = null;
        int x_Integer_1 = 0;
        // Parameter Initialization
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.BinTree", "addTest", true);
        try {
            method.invoke(instance, new Object[]{instance, x_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testaddTest_1() {
        roops.core.objectsInstrumented.BinTree instance = null;
        roops.core.objectsInstrumented.BinTree tree_BinTree_1 = new roops.core.objectsInstrumented.BinTree();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_1 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_2 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_3 = new roops.core.objectsInstrumented.BinTreeNode();
        int x_Integer_1 = 0;
        // Parameter Initialization
        // Fields Initialization for 'tree_BinTree_1'
        // Fields Initialization for '_BinTreeNode_1'
        updateValue(_BinTreeNode_1, "key", 1769999184);
        // Fields Initialization for '_BinTreeNode_2'
        updateValue(_BinTreeNode_2, "key", 0);
        updateValue(_BinTreeNode_2, "left", null);
        updateValue(_BinTreeNode_2, "right", null);
        updateValue(_BinTreeNode_2, "parent", _BinTreeNode_1);
        updateValue(_BinTreeNode_1, "left", _BinTreeNode_2);
        // Fields Initialization for '_BinTreeNode_3'
        updateValue(_BinTreeNode_3, "key", 1834345646);
        updateValue(_BinTreeNode_3, "left", null);
        updateValue(_BinTreeNode_3, "right", null);
        updateValue(_BinTreeNode_3, "parent", _BinTreeNode_1);
        updateValue(_BinTreeNode_1, "right", _BinTreeNode_3);
        updateValue(_BinTreeNode_1, "parent", null);
        updateValue(tree_BinTree_1, "root", _BinTreeNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.BinTree", "addTest", true);
        try {
            method.invoke(instance, new Object[]{tree_BinTree_1, x_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testaddTest_2() {
        roops.core.objectsInstrumented.BinTree instance = null;
        roops.core.objectsInstrumented.BinTree tree_BinTree_1 = new roops.core.objectsInstrumented.BinTree();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_1 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_2 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_3 = new roops.core.objectsInstrumented.BinTreeNode();
        int x_Integer_1 = 0;
        // Parameter Initialization
        // Fields Initialization for 'tree_BinTree_1'
        // Fields Initialization for '_BinTreeNode_1'
        updateValue(_BinTreeNode_1, "key", 0);
        // Fields Initialization for '_BinTreeNode_2'
        updateValue(_BinTreeNode_2, "key", -442850478);
        updateValue(_BinTreeNode_2, "left", null);
        updateValue(_BinTreeNode_2, "right", null);
        updateValue(_BinTreeNode_2, "parent", _BinTreeNode_1);
        updateValue(_BinTreeNode_1, "left", _BinTreeNode_2);
        // Fields Initialization for '_BinTreeNode_3'
        updateValue(_BinTreeNode_3, "key", 409329581);
        updateValue(_BinTreeNode_3, "left", null);
        updateValue(_BinTreeNode_3, "right", null);
        updateValue(_BinTreeNode_3, "parent", _BinTreeNode_1);
        updateValue(_BinTreeNode_1, "right", _BinTreeNode_3);
        updateValue(_BinTreeNode_1, "parent", null);
        updateValue(tree_BinTree_1, "root", _BinTreeNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.BinTree", "addTest", true);
        try {
            method.invoke(instance, new Object[]{tree_BinTree_1, x_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testaddTest_3() {
        roops.core.objectsInstrumented.BinTree instance = null;
        roops.core.objectsInstrumented.BinTree tree_BinTree_1 = new roops.core.objectsInstrumented.BinTree();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_1 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_2 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_3 = new roops.core.objectsInstrumented.BinTreeNode();
        int x_Integer_1 = -66;
        // Parameter Initialization
        // Fields Initialization for 'tree_BinTree_1'
        // Fields Initialization for '_BinTreeNode_1'
        updateValue(_BinTreeNode_1, "key", 0);
        // Fields Initialization for '_BinTreeNode_2'
        updateValue(_BinTreeNode_2, "key", -659750847);
        updateValue(_BinTreeNode_2, "left", null);
        updateValue(_BinTreeNode_2, "right", null);
        updateValue(_BinTreeNode_2, "parent", _BinTreeNode_1);
        updateValue(_BinTreeNode_1, "left", _BinTreeNode_2);
        // Fields Initialization for '_BinTreeNode_3'
        updateValue(_BinTreeNode_3, "key", 659750846);
        updateValue(_BinTreeNode_3, "left", null);
        updateValue(_BinTreeNode_3, "right", null);
        updateValue(_BinTreeNode_3, "parent", _BinTreeNode_1);
        updateValue(_BinTreeNode_1, "right", _BinTreeNode_3);
        updateValue(_BinTreeNode_1, "parent", null);
        updateValue(tree_BinTree_1, "root", _BinTreeNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.BinTree", "addTest", true);
        try {
            method.invoke(instance, new Object[]{tree_BinTree_1, x_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testaddTest_4() {
        roops.core.objectsInstrumented.BinTree instance = null;
        roops.core.objectsInstrumented.BinTree tree_BinTree_1 = new roops.core.objectsInstrumented.BinTree();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_1 = new roops.core.objectsInstrumented.BinTreeNode();
        int x_Integer_1 = 0;
        // Parameter Initialization
        // Fields Initialization for 'tree_BinTree_1'
        // Fields Initialization for '_BinTreeNode_1'
        updateValue(_BinTreeNode_1, "key", -809615379);
        updateValue(_BinTreeNode_1, "left", null);
        updateValue(_BinTreeNode_1, "right", null);
        updateValue(_BinTreeNode_1, "parent", null);
        updateValue(tree_BinTree_1, "root", _BinTreeNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.BinTree", "addTest", true);
        try {
            method.invoke(instance, new Object[]{tree_BinTree_1, x_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testaddTest_5() {
        roops.core.objectsInstrumented.BinTree instance = null;
        roops.core.objectsInstrumented.BinTree tree_BinTree_1 = new roops.core.objectsInstrumented.BinTree();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_1 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_2 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_3 = new roops.core.objectsInstrumented.BinTreeNode();
        int x_Integer_1 = -109072388;
        // Parameter Initialization
        // Fields Initialization for 'tree_BinTree_1'
        // Fields Initialization for '_BinTreeNode_1'
        updateValue(_BinTreeNode_1, "key", 1899465807);
        // Fields Initialization for '_BinTreeNode_2'
        updateValue(_BinTreeNode_2, "key", 0);
        updateValue(_BinTreeNode_2, "left", null);
        // Fields Initialization for '_BinTreeNode_3'
        updateValue(_BinTreeNode_3, "key", 110261855);
        updateValue(_BinTreeNode_3, "left", null);
        updateValue(_BinTreeNode_3, "right", null);
        updateValue(_BinTreeNode_3, "parent", _BinTreeNode_2);
        updateValue(_BinTreeNode_2, "right", _BinTreeNode_3);
        updateValue(_BinTreeNode_2, "parent", _BinTreeNode_1);
        updateValue(_BinTreeNode_1, "left", _BinTreeNode_2);
        updateValue(_BinTreeNode_1, "right", null);
        updateValue(_BinTreeNode_1, "parent", null);
        updateValue(tree_BinTree_1, "root", _BinTreeNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.BinTree", "addTest", true);
        try {
            method.invoke(instance, new Object[]{tree_BinTree_1, x_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testaddTest_6() {
        roops.core.objectsInstrumented.BinTree instance = null;
        roops.core.objectsInstrumented.BinTree tree_BinTree_1 = new roops.core.objectsInstrumented.BinTree();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_1 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_2 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_3 = new roops.core.objectsInstrumented.BinTreeNode();
        int x_Integer_1 = -338960446;
        // Parameter Initialization
        // Fields Initialization for 'tree_BinTree_1'
        // Fields Initialization for '_BinTreeNode_1'
        updateValue(_BinTreeNode_1, "key", -1723899843);
        updateValue(_BinTreeNode_1, "left", null);
        // Fields Initialization for '_BinTreeNode_2'
        updateValue(_BinTreeNode_2, "key", -80281662);
        updateValue(_BinTreeNode_2, "left", null);
        // Fields Initialization for '_BinTreeNode_3'
        updateValue(_BinTreeNode_3, "key", 0);
        updateValue(_BinTreeNode_3, "left", null);
        updateValue(_BinTreeNode_3, "right", null);
        updateValue(_BinTreeNode_3, "parent", _BinTreeNode_2);
        updateValue(_BinTreeNode_2, "right", _BinTreeNode_3);
        updateValue(_BinTreeNode_2, "parent", _BinTreeNode_1);
        updateValue(_BinTreeNode_1, "right", _BinTreeNode_2);
        updateValue(_BinTreeNode_1, "parent", null);
        updateValue(tree_BinTree_1, "root", _BinTreeNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.BinTree", "addTest", true);
        try {
            method.invoke(instance, new Object[]{tree_BinTree_1, x_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testaddTest_7() {
        roops.core.objectsInstrumented.BinTree instance = null;
        roops.core.objectsInstrumented.BinTree tree_BinTree_1 = new roops.core.objectsInstrumented.BinTree();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_1 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_2 = new roops.core.objectsInstrumented.BinTreeNode();
        int x_Integer_1 = 613024834;
        // Parameter Initialization
        // Fields Initialization for 'tree_BinTree_1'
        // Fields Initialization for '_BinTreeNode_1'
        updateValue(_BinTreeNode_1, "key", 0);
        // Fields Initialization for '_BinTreeNode_2'
        updateValue(_BinTreeNode_2, "key", -41476689);
        updateValue(_BinTreeNode_2, "left", null);
        updateValue(_BinTreeNode_2, "right", null);
        updateValue(_BinTreeNode_2, "parent", _BinTreeNode_1);
        updateValue(_BinTreeNode_1, "left", _BinTreeNode_2);
        updateValue(_BinTreeNode_1, "right", null);
        updateValue(_BinTreeNode_1, "parent", null);
        updateValue(tree_BinTree_1, "root", _BinTreeNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.BinTree", "addTest", true);
        try {
            method.invoke(instance, new Object[]{tree_BinTree_1, x_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testaddTest_8() {
        roops.core.objectsInstrumented.BinTree instance = null;
        roops.core.objectsInstrumented.BinTree tree_BinTree_1 = new roops.core.objectsInstrumented.BinTree();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_1 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_2 = new roops.core.objectsInstrumented.BinTreeNode();
        int x_Integer_1 = -69787;
        // Parameter Initialization
        // Fields Initialization for 'tree_BinTree_1'
        // Fields Initialization for '_BinTreeNode_1'
        updateValue(_BinTreeNode_1, "key", 0);
        updateValue(_BinTreeNode_1, "left", null);
        // Fields Initialization for '_BinTreeNode_2'
        updateValue(_BinTreeNode_2, "key", 419378338);
        updateValue(_BinTreeNode_2, "left", null);
        updateValue(_BinTreeNode_2, "right", null);
        updateValue(_BinTreeNode_2, "parent", _BinTreeNode_1);
        updateValue(_BinTreeNode_1, "right", _BinTreeNode_2);
        updateValue(_BinTreeNode_1, "parent", null);
        updateValue(tree_BinTree_1, "root", _BinTreeNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.BinTree", "addTest", true);
        try {
            method.invoke(instance, new Object[]{tree_BinTree_1, x_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testaddTest_9() {
        roops.core.objectsInstrumented.BinTree instance = null;
        roops.core.objectsInstrumented.BinTree tree_BinTree_1 = new roops.core.objectsInstrumented.BinTree();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_1 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_2 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_3 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_4 = new roops.core.objectsInstrumented.BinTreeNode();
        int x_Integer_1 = 2097202;
        // Parameter Initialization
        // Fields Initialization for 'tree_BinTree_1'
        // Fields Initialization for '_BinTreeNode_1'
        updateValue(_BinTreeNode_1, "key", 2145255354);
        // Fields Initialization for '_BinTreeNode_2'
        updateValue(_BinTreeNode_2, "key", 0);
        // Fields Initialization for '_BinTreeNode_3'
        updateValue(_BinTreeNode_3, "key", -1233078274);
        updateValue(_BinTreeNode_3, "left", null);
        updateValue(_BinTreeNode_3, "right", null);
        updateValue(_BinTreeNode_3, "parent", _BinTreeNode_2);
        updateValue(_BinTreeNode_2, "left", _BinTreeNode_3);
        // Fields Initialization for '_BinTreeNode_4'
        updateValue(_BinTreeNode_4, "key", 2097202);
        updateValue(_BinTreeNode_4, "left", null);
        updateValue(_BinTreeNode_4, "right", null);
        updateValue(_BinTreeNode_4, "parent", _BinTreeNode_2);
        updateValue(_BinTreeNode_2, "right", _BinTreeNode_4);
        updateValue(_BinTreeNode_2, "parent", _BinTreeNode_1);
        updateValue(_BinTreeNode_1, "left", _BinTreeNode_2);
        updateValue(_BinTreeNode_1, "right", null);
        updateValue(_BinTreeNode_1, "parent", null);
        updateValue(tree_BinTree_1, "root", _BinTreeNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.BinTree", "addTest", true);
        try {
            method.invoke(instance, new Object[]{tree_BinTree_1, x_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testaddTest_10() {
        roops.core.objectsInstrumented.BinTree instance = null;
        roops.core.objectsInstrumented.BinTree tree_BinTree_1 = new roops.core.objectsInstrumented.BinTree();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_1 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_2 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_3 = new roops.core.objectsInstrumented.BinTreeNode();
        int x_Integer_1 = 0;
        // Parameter Initialization
        // Fields Initialization for 'tree_BinTree_1'
        // Fields Initialization for '_BinTreeNode_1'
        updateValue(_BinTreeNode_1, "key", -31375170);
        updateValue(_BinTreeNode_1, "left", null);
        // Fields Initialization for '_BinTreeNode_2'
        updateValue(_BinTreeNode_2, "key", 2130706209);
        // Fields Initialization for '_BinTreeNode_3'
        updateValue(_BinTreeNode_3, "key", 8693248);
        updateValue(_BinTreeNode_3, "left", null);
        updateValue(_BinTreeNode_3, "right", null);
        updateValue(_BinTreeNode_3, "parent", _BinTreeNode_2);
        updateValue(_BinTreeNode_2, "left", _BinTreeNode_3);
        updateValue(_BinTreeNode_2, "right", null);
        updateValue(_BinTreeNode_2, "parent", _BinTreeNode_1);
        updateValue(_BinTreeNode_1, "right", _BinTreeNode_2);
        updateValue(_BinTreeNode_1, "parent", null);
        updateValue(tree_BinTree_1, "root", _BinTreeNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.BinTree", "addTest", true);
        try {
            method.invoke(instance, new Object[]{tree_BinTree_1, x_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testaddTest_11() {
        roops.core.objectsInstrumented.BinTree instance = null;
        roops.core.objectsInstrumented.BinTree tree_BinTree_1 = new roops.core.objectsInstrumented.BinTree();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_1 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_2 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_3 = new roops.core.objectsInstrumented.BinTreeNode();
        int x_Integer_1 = 0;
        // Parameter Initialization
        // Fields Initialization for 'tree_BinTree_1'
        // Fields Initialization for '_BinTreeNode_1'
        updateValue(_BinTreeNode_1, "key", -671088133);
        updateValue(_BinTreeNode_1, "left", null);
        // Fields Initialization for '_BinTreeNode_2'
        updateValue(_BinTreeNode_2, "key", 0);
        updateValue(_BinTreeNode_2, "left", null);
        // Fields Initialization for '_BinTreeNode_3'
        updateValue(_BinTreeNode_3, "key", 1996104184);
        updateValue(_BinTreeNode_3, "left", null);
        updateValue(_BinTreeNode_3, "right", null);
        updateValue(_BinTreeNode_3, "parent", _BinTreeNode_2);
        updateValue(_BinTreeNode_2, "right", _BinTreeNode_3);
        updateValue(_BinTreeNode_2, "parent", _BinTreeNode_1);
        updateValue(_BinTreeNode_1, "right", _BinTreeNode_2);
        updateValue(_BinTreeNode_1, "parent", null);
        updateValue(tree_BinTree_1, "root", _BinTreeNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.BinTree", "addTest", true);
        try {
            method.invoke(instance, new Object[]{tree_BinTree_1, x_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testaddTest_12() {
        roops.core.objectsInstrumented.BinTree instance = null;
        roops.core.objectsInstrumented.BinTree tree_BinTree_1 = new roops.core.objectsInstrumented.BinTree();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_1 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_2 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_3 = new roops.core.objectsInstrumented.BinTreeNode();
        int x_Integer_1 = -611059478;
        // Parameter Initialization
        // Fields Initialization for 'tree_BinTree_1'
        // Fields Initialization for '_BinTreeNode_1'
        updateValue(_BinTreeNode_1, "key", 0);
        // Fields Initialization for '_BinTreeNode_2'
        updateValue(_BinTreeNode_2, "key", -553781483);
        // Fields Initialization for '_BinTreeNode_3'
        updateValue(_BinTreeNode_3, "key", -838978326);
        updateValue(_BinTreeNode_3, "left", null);
        updateValue(_BinTreeNode_3, "right", null);
        updateValue(_BinTreeNode_3, "parent", _BinTreeNode_2);
        updateValue(_BinTreeNode_2, "left", _BinTreeNode_3);
        updateValue(_BinTreeNode_2, "right", null);
        updateValue(_BinTreeNode_2, "parent", _BinTreeNode_1);
        updateValue(_BinTreeNode_1, "left", _BinTreeNode_2);
        updateValue(_BinTreeNode_1, "right", null);
        updateValue(_BinTreeNode_1, "parent", null);
        updateValue(tree_BinTree_1, "root", _BinTreeNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.BinTree", "addTest", true);
        try {
            method.invoke(instance, new Object[]{tree_BinTree_1, x_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testaddTest_13() {
        roops.core.objectsInstrumented.BinTree instance = null;
        roops.core.objectsInstrumented.BinTree tree_BinTree_1 = new roops.core.objectsInstrumented.BinTree();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_1 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_2 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_3 = new roops.core.objectsInstrumented.BinTreeNode();
        int x_Integer_1 = 0;
        // Parameter Initialization
        // Fields Initialization for 'tree_BinTree_1'
        // Fields Initialization for '_BinTreeNode_1'
        updateValue(_BinTreeNode_1, "key", -67109666);
        // Fields Initialization for '_BinTreeNode_2'
        updateValue(_BinTreeNode_2, "key", -172843042);
        updateValue(_BinTreeNode_2, "left", null);
        updateValue(_BinTreeNode_2, "right", null);
        updateValue(_BinTreeNode_2, "parent", _BinTreeNode_1);
        updateValue(_BinTreeNode_1, "left", _BinTreeNode_2);
        // Fields Initialization for '_BinTreeNode_3'
        updateValue(_BinTreeNode_3, "key", -65007127);
        updateValue(_BinTreeNode_3, "left", null);
        updateValue(_BinTreeNode_3, "right", null);
        updateValue(_BinTreeNode_3, "parent", _BinTreeNode_1);
        updateValue(_BinTreeNode_1, "right", _BinTreeNode_3);
        updateValue(_BinTreeNode_1, "parent", null);
        updateValue(tree_BinTree_1, "root", _BinTreeNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.BinTree", "addTest", true);
        try {
            method.invoke(instance, new Object[]{tree_BinTree_1, x_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testaddTest_14() {
        roops.core.objectsInstrumented.BinTree instance = null;
        roops.core.objectsInstrumented.BinTree tree_BinTree_1 = new roops.core.objectsInstrumented.BinTree();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_1 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_2 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_3 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_4 = new roops.core.objectsInstrumented.BinTreeNode();
        int x_Integer_1 = 2011682705;
        // Parameter Initialization
        // Fields Initialization for 'tree_BinTree_1'
        // Fields Initialization for '_BinTreeNode_1'
        updateValue(_BinTreeNode_1, "key", 0);
        // Fields Initialization for '_BinTreeNode_2'
        updateValue(_BinTreeNode_2, "key", -75781673);
        updateValue(_BinTreeNode_2, "left", null);
        updateValue(_BinTreeNode_2, "right", null);
        updateValue(_BinTreeNode_2, "parent", _BinTreeNode_1);
        updateValue(_BinTreeNode_1, "left", _BinTreeNode_2);
        // Fields Initialization for '_BinTreeNode_3'
        updateValue(_BinTreeNode_3, "key", 16);
        updateValue(_BinTreeNode_3, "left", null);
        // Fields Initialization for '_BinTreeNode_4'
        updateValue(_BinTreeNode_4, "key", 2011682705);
        updateValue(_BinTreeNode_4, "left", null);
        updateValue(_BinTreeNode_4, "right", null);
        updateValue(_BinTreeNode_4, "parent", _BinTreeNode_3);
        updateValue(_BinTreeNode_3, "right", _BinTreeNode_4);
        updateValue(_BinTreeNode_3, "parent", _BinTreeNode_1);
        updateValue(_BinTreeNode_1, "right", _BinTreeNode_3);
        updateValue(_BinTreeNode_1, "parent", null);
        updateValue(tree_BinTree_1, "root", _BinTreeNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.BinTree", "addTest", true);
        try {
            method.invoke(instance, new Object[]{tree_BinTree_1, x_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testaddTest_15() {
        roops.core.objectsInstrumented.BinTree instance = null;
        roops.core.objectsInstrumented.BinTree tree_BinTree_1 = new roops.core.objectsInstrumented.BinTree();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_1 = new roops.core.objectsInstrumented.BinTreeNode();
        int x_Integer_1 = 0;
        // Parameter Initialization
        // Fields Initialization for 'tree_BinTree_1'
        // Fields Initialization for '_BinTreeNode_1'
        updateValue(_BinTreeNode_1, "key", 2130706431);
        updateValue(_BinTreeNode_1, "left", null);
        updateValue(_BinTreeNode_1, "right", null);
        updateValue(_BinTreeNode_1, "parent", null);
        updateValue(tree_BinTree_1, "root", _BinTreeNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.BinTree", "addTest", true);
        try {
            method.invoke(instance, new Object[]{tree_BinTree_1, x_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testaddTest_16() {
        roops.core.objectsInstrumented.BinTree instance = null;
        int x_Integer_1 = 0;
        // Parameter Initialization
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.BinTree", "addTest", true);
        try {
            method.invoke(instance, new Object[]{instance, x_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testaddTest_17() {
        roops.core.objectsInstrumented.BinTree instance = null;
        roops.core.objectsInstrumented.BinTree tree_BinTree_1 = new roops.core.objectsInstrumented.BinTree();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_1 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_2 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_3 = new roops.core.objectsInstrumented.BinTreeNode();
        int x_Integer_1 = 0;
        // Parameter Initialization
        // Fields Initialization for 'tree_BinTree_1'
        // Fields Initialization for '_BinTreeNode_1'
        updateValue(_BinTreeNode_1, "key", 1769999184);
        // Fields Initialization for '_BinTreeNode_2'
        updateValue(_BinTreeNode_2, "key", 0);
        updateValue(_BinTreeNode_2, "left", null);
        updateValue(_BinTreeNode_2, "right", null);
        updateValue(_BinTreeNode_2, "parent", _BinTreeNode_1);
        updateValue(_BinTreeNode_1, "left", _BinTreeNode_2);
        // Fields Initialization for '_BinTreeNode_3'
        updateValue(_BinTreeNode_3, "key", 1834345646);
        updateValue(_BinTreeNode_3, "left", null);
        updateValue(_BinTreeNode_3, "right", null);
        updateValue(_BinTreeNode_3, "parent", _BinTreeNode_1);
        updateValue(_BinTreeNode_1, "right", _BinTreeNode_3);
        updateValue(_BinTreeNode_1, "parent", null);
        updateValue(tree_BinTree_1, "root", _BinTreeNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.BinTree", "addTest", true);
        try {
            method.invoke(instance, new Object[]{tree_BinTree_1, x_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testaddTest_18() {
        roops.core.objectsInstrumented.BinTree instance = null;
        roops.core.objectsInstrumented.BinTree tree_BinTree_1 = new roops.core.objectsInstrumented.BinTree();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_1 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_2 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_3 = new roops.core.objectsInstrumented.BinTreeNode();
        int x_Integer_1 = 0;
        // Parameter Initialization
        // Fields Initialization for 'tree_BinTree_1'
        // Fields Initialization for '_BinTreeNode_1'
        updateValue(_BinTreeNode_1, "key", 0);
        // Fields Initialization for '_BinTreeNode_2'
        updateValue(_BinTreeNode_2, "key", -442850478);
        updateValue(_BinTreeNode_2, "left", null);
        updateValue(_BinTreeNode_2, "right", null);
        updateValue(_BinTreeNode_2, "parent", _BinTreeNode_1);
        updateValue(_BinTreeNode_1, "left", _BinTreeNode_2);
        // Fields Initialization for '_BinTreeNode_3'
        updateValue(_BinTreeNode_3, "key", 409329581);
        updateValue(_BinTreeNode_3, "left", null);
        updateValue(_BinTreeNode_3, "right", null);
        updateValue(_BinTreeNode_3, "parent", _BinTreeNode_1);
        updateValue(_BinTreeNode_1, "right", _BinTreeNode_3);
        updateValue(_BinTreeNode_1, "parent", null);
        updateValue(tree_BinTree_1, "root", _BinTreeNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.BinTree", "addTest", true);
        try {
            method.invoke(instance, new Object[]{tree_BinTree_1, x_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testaddTest_19() {
        roops.core.objectsInstrumented.BinTree instance = null;
        roops.core.objectsInstrumented.BinTree tree_BinTree_1 = new roops.core.objectsInstrumented.BinTree();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_1 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_2 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_3 = new roops.core.objectsInstrumented.BinTreeNode();
        int x_Integer_1 = -66;
        // Parameter Initialization
        // Fields Initialization for 'tree_BinTree_1'
        // Fields Initialization for '_BinTreeNode_1'
        updateValue(_BinTreeNode_1, "key", 0);
        // Fields Initialization for '_BinTreeNode_2'
        updateValue(_BinTreeNode_2, "key", -659750847);
        updateValue(_BinTreeNode_2, "left", null);
        updateValue(_BinTreeNode_2, "right", null);
        updateValue(_BinTreeNode_2, "parent", _BinTreeNode_1);
        updateValue(_BinTreeNode_1, "left", _BinTreeNode_2);
        // Fields Initialization for '_BinTreeNode_3'
        updateValue(_BinTreeNode_3, "key", 659750846);
        updateValue(_BinTreeNode_3, "left", null);
        updateValue(_BinTreeNode_3, "right", null);
        updateValue(_BinTreeNode_3, "parent", _BinTreeNode_1);
        updateValue(_BinTreeNode_1, "right", _BinTreeNode_3);
        updateValue(_BinTreeNode_1, "parent", null);
        updateValue(tree_BinTree_1, "root", _BinTreeNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.BinTree", "addTest", true);
        try {
            method.invoke(instance, new Object[]{tree_BinTree_1, x_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testaddTest_20() {
        roops.core.objectsInstrumented.BinTree instance = null;
        roops.core.objectsInstrumented.BinTree tree_BinTree_1 = new roops.core.objectsInstrumented.BinTree();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_1 = new roops.core.objectsInstrumented.BinTreeNode();
        int x_Integer_1 = 0;
        // Parameter Initialization
        // Fields Initialization for 'tree_BinTree_1'
        // Fields Initialization for '_BinTreeNode_1'
        updateValue(_BinTreeNode_1, "key", -809615379);
        updateValue(_BinTreeNode_1, "left", null);
        updateValue(_BinTreeNode_1, "right", null);
        updateValue(_BinTreeNode_1, "parent", null);
        updateValue(tree_BinTree_1, "root", _BinTreeNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.BinTree", "addTest", true);
        try {
            method.invoke(instance, new Object[]{tree_BinTree_1, x_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testaddTest_21() {
        roops.core.objectsInstrumented.BinTree instance = null;
        roops.core.objectsInstrumented.BinTree tree_BinTree_1 = new roops.core.objectsInstrumented.BinTree();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_1 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_2 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_3 = new roops.core.objectsInstrumented.BinTreeNode();
        int x_Integer_1 = -109072388;
        // Parameter Initialization
        // Fields Initialization for 'tree_BinTree_1'
        // Fields Initialization for '_BinTreeNode_1'
        updateValue(_BinTreeNode_1, "key", 1899465807);
        // Fields Initialization for '_BinTreeNode_2'
        updateValue(_BinTreeNode_2, "key", 0);
        updateValue(_BinTreeNode_2, "left", null);
        // Fields Initialization for '_BinTreeNode_3'
        updateValue(_BinTreeNode_3, "key", 110261855);
        updateValue(_BinTreeNode_3, "left", null);
        updateValue(_BinTreeNode_3, "right", null);
        updateValue(_BinTreeNode_3, "parent", _BinTreeNode_2);
        updateValue(_BinTreeNode_2, "right", _BinTreeNode_3);
        updateValue(_BinTreeNode_2, "parent", _BinTreeNode_1);
        updateValue(_BinTreeNode_1, "left", _BinTreeNode_2);
        updateValue(_BinTreeNode_1, "right", null);
        updateValue(_BinTreeNode_1, "parent", null);
        updateValue(tree_BinTree_1, "root", _BinTreeNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.BinTree", "addTest", true);
        try {
            method.invoke(instance, new Object[]{tree_BinTree_1, x_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testaddTest_22() {
        roops.core.objectsInstrumented.BinTree instance = null;
        roops.core.objectsInstrumented.BinTree tree_BinTree_1 = new roops.core.objectsInstrumented.BinTree();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_1 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_2 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_3 = new roops.core.objectsInstrumented.BinTreeNode();
        int x_Integer_1 = -338960446;
        // Parameter Initialization
        // Fields Initialization for 'tree_BinTree_1'
        // Fields Initialization for '_BinTreeNode_1'
        updateValue(_BinTreeNode_1, "key", -1723899843);
        updateValue(_BinTreeNode_1, "left", null);
        // Fields Initialization for '_BinTreeNode_2'
        updateValue(_BinTreeNode_2, "key", -80281662);
        updateValue(_BinTreeNode_2, "left", null);
        // Fields Initialization for '_BinTreeNode_3'
        updateValue(_BinTreeNode_3, "key", 0);
        updateValue(_BinTreeNode_3, "left", null);
        updateValue(_BinTreeNode_3, "right", null);
        updateValue(_BinTreeNode_3, "parent", _BinTreeNode_2);
        updateValue(_BinTreeNode_2, "right", _BinTreeNode_3);
        updateValue(_BinTreeNode_2, "parent", _BinTreeNode_1);
        updateValue(_BinTreeNode_1, "right", _BinTreeNode_2);
        updateValue(_BinTreeNode_1, "parent", null);
        updateValue(tree_BinTree_1, "root", _BinTreeNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.BinTree", "addTest", true);
        try {
            method.invoke(instance, new Object[]{tree_BinTree_1, x_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testaddTest_23() {
        roops.core.objectsInstrumented.BinTree instance = null;
        roops.core.objectsInstrumented.BinTree tree_BinTree_1 = new roops.core.objectsInstrumented.BinTree();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_1 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_2 = new roops.core.objectsInstrumented.BinTreeNode();
        int x_Integer_1 = 613024834;
        // Parameter Initialization
        // Fields Initialization for 'tree_BinTree_1'
        // Fields Initialization for '_BinTreeNode_1'
        updateValue(_BinTreeNode_1, "key", 0);
        // Fields Initialization for '_BinTreeNode_2'
        updateValue(_BinTreeNode_2, "key", -41476689);
        updateValue(_BinTreeNode_2, "left", null);
        updateValue(_BinTreeNode_2, "right", null);
        updateValue(_BinTreeNode_2, "parent", _BinTreeNode_1);
        updateValue(_BinTreeNode_1, "left", _BinTreeNode_2);
        updateValue(_BinTreeNode_1, "right", null);
        updateValue(_BinTreeNode_1, "parent", null);
        updateValue(tree_BinTree_1, "root", _BinTreeNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.BinTree", "addTest", true);
        try {
            method.invoke(instance, new Object[]{tree_BinTree_1, x_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testaddTest_24() {
        roops.core.objectsInstrumented.BinTree instance = null;
        roops.core.objectsInstrumented.BinTree tree_BinTree_1 = new roops.core.objectsInstrumented.BinTree();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_1 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_2 = new roops.core.objectsInstrumented.BinTreeNode();
        int x_Integer_1 = -69787;
        // Parameter Initialization
        // Fields Initialization for 'tree_BinTree_1'
        // Fields Initialization for '_BinTreeNode_1'
        updateValue(_BinTreeNode_1, "key", 0);
        updateValue(_BinTreeNode_1, "left", null);
        // Fields Initialization for '_BinTreeNode_2'
        updateValue(_BinTreeNode_2, "key", 419378338);
        updateValue(_BinTreeNode_2, "left", null);
        updateValue(_BinTreeNode_2, "right", null);
        updateValue(_BinTreeNode_2, "parent", _BinTreeNode_1);
        updateValue(_BinTreeNode_1, "right", _BinTreeNode_2);
        updateValue(_BinTreeNode_1, "parent", null);
        updateValue(tree_BinTree_1, "root", _BinTreeNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.BinTree", "addTest", true);
        try {
            method.invoke(instance, new Object[]{tree_BinTree_1, x_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testaddTest_25() {
        roops.core.objectsInstrumented.BinTree instance = null;
        roops.core.objectsInstrumented.BinTree tree_BinTree_1 = new roops.core.objectsInstrumented.BinTree();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_1 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_2 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_3 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_4 = new roops.core.objectsInstrumented.BinTreeNode();
        int x_Integer_1 = 2097202;
        // Parameter Initialization
        // Fields Initialization for 'tree_BinTree_1'
        // Fields Initialization for '_BinTreeNode_1'
        updateValue(_BinTreeNode_1, "key", 2145255354);
        // Fields Initialization for '_BinTreeNode_2'
        updateValue(_BinTreeNode_2, "key", 0);
        // Fields Initialization for '_BinTreeNode_3'
        updateValue(_BinTreeNode_3, "key", -1233078274);
        updateValue(_BinTreeNode_3, "left", null);
        updateValue(_BinTreeNode_3, "right", null);
        updateValue(_BinTreeNode_3, "parent", _BinTreeNode_2);
        updateValue(_BinTreeNode_2, "left", _BinTreeNode_3);
        // Fields Initialization for '_BinTreeNode_4'
        updateValue(_BinTreeNode_4, "key", 2097202);
        updateValue(_BinTreeNode_4, "left", null);
        updateValue(_BinTreeNode_4, "right", null);
        updateValue(_BinTreeNode_4, "parent", _BinTreeNode_2);
        updateValue(_BinTreeNode_2, "right", _BinTreeNode_4);
        updateValue(_BinTreeNode_2, "parent", _BinTreeNode_1);
        updateValue(_BinTreeNode_1, "left", _BinTreeNode_2);
        updateValue(_BinTreeNode_1, "right", null);
        updateValue(_BinTreeNode_1, "parent", null);
        updateValue(tree_BinTree_1, "root", _BinTreeNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.BinTree", "addTest", true);
        try {
            method.invoke(instance, new Object[]{tree_BinTree_1, x_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testaddTest_26() {
        roops.core.objectsInstrumented.BinTree instance = null;
        roops.core.objectsInstrumented.BinTree tree_BinTree_1 = new roops.core.objectsInstrumented.BinTree();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_1 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_2 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_3 = new roops.core.objectsInstrumented.BinTreeNode();
        int x_Integer_1 = 0;
        // Parameter Initialization
        // Fields Initialization for 'tree_BinTree_1'
        // Fields Initialization for '_BinTreeNode_1'
        updateValue(_BinTreeNode_1, "key", -31375170);
        updateValue(_BinTreeNode_1, "left", null);
        // Fields Initialization for '_BinTreeNode_2'
        updateValue(_BinTreeNode_2, "key", 2130706209);
        // Fields Initialization for '_BinTreeNode_3'
        updateValue(_BinTreeNode_3, "key", 8693248);
        updateValue(_BinTreeNode_3, "left", null);
        updateValue(_BinTreeNode_3, "right", null);
        updateValue(_BinTreeNode_3, "parent", _BinTreeNode_2);
        updateValue(_BinTreeNode_2, "left", _BinTreeNode_3);
        updateValue(_BinTreeNode_2, "right", null);
        updateValue(_BinTreeNode_2, "parent", _BinTreeNode_1);
        updateValue(_BinTreeNode_1, "right", _BinTreeNode_2);
        updateValue(_BinTreeNode_1, "parent", null);
        updateValue(tree_BinTree_1, "root", _BinTreeNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.BinTree", "addTest", true);
        try {
            method.invoke(instance, new Object[]{tree_BinTree_1, x_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testaddTest_27() {
        roops.core.objectsInstrumented.BinTree instance = null;
        roops.core.objectsInstrumented.BinTree tree_BinTree_1 = new roops.core.objectsInstrumented.BinTree();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_1 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_2 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_3 = new roops.core.objectsInstrumented.BinTreeNode();
        int x_Integer_1 = 0;
        // Parameter Initialization
        // Fields Initialization for 'tree_BinTree_1'
        // Fields Initialization for '_BinTreeNode_1'
        updateValue(_BinTreeNode_1, "key", -671088133);
        updateValue(_BinTreeNode_1, "left", null);
        // Fields Initialization for '_BinTreeNode_2'
        updateValue(_BinTreeNode_2, "key", 0);
        updateValue(_BinTreeNode_2, "left", null);
        // Fields Initialization for '_BinTreeNode_3'
        updateValue(_BinTreeNode_3, "key", 1996104184);
        updateValue(_BinTreeNode_3, "left", null);
        updateValue(_BinTreeNode_3, "right", null);
        updateValue(_BinTreeNode_3, "parent", _BinTreeNode_2);
        updateValue(_BinTreeNode_2, "right", _BinTreeNode_3);
        updateValue(_BinTreeNode_2, "parent", _BinTreeNode_1);
        updateValue(_BinTreeNode_1, "right", _BinTreeNode_2);
        updateValue(_BinTreeNode_1, "parent", null);
        updateValue(tree_BinTree_1, "root", _BinTreeNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.BinTree", "addTest", true);
        try {
            method.invoke(instance, new Object[]{tree_BinTree_1, x_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testaddTest_28() {
        roops.core.objectsInstrumented.BinTree instance = null;
        roops.core.objectsInstrumented.BinTree tree_BinTree_1 = new roops.core.objectsInstrumented.BinTree();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_1 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_2 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_3 = new roops.core.objectsInstrumented.BinTreeNode();
        int x_Integer_1 = -611059478;
        // Parameter Initialization
        // Fields Initialization for 'tree_BinTree_1'
        // Fields Initialization for '_BinTreeNode_1'
        updateValue(_BinTreeNode_1, "key", 0);
        // Fields Initialization for '_BinTreeNode_2'
        updateValue(_BinTreeNode_2, "key", -553781483);
        // Fields Initialization for '_BinTreeNode_3'
        updateValue(_BinTreeNode_3, "key", -838978326);
        updateValue(_BinTreeNode_3, "left", null);
        updateValue(_BinTreeNode_3, "right", null);
        updateValue(_BinTreeNode_3, "parent", _BinTreeNode_2);
        updateValue(_BinTreeNode_2, "left", _BinTreeNode_3);
        updateValue(_BinTreeNode_2, "right", null);
        updateValue(_BinTreeNode_2, "parent", _BinTreeNode_1);
        updateValue(_BinTreeNode_1, "left", _BinTreeNode_2);
        updateValue(_BinTreeNode_1, "right", null);
        updateValue(_BinTreeNode_1, "parent", null);
        updateValue(tree_BinTree_1, "root", _BinTreeNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.BinTree", "addTest", true);
        try {
            method.invoke(instance, new Object[]{tree_BinTree_1, x_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testaddTest_29() {
        roops.core.objectsInstrumented.BinTree instance = null;
        roops.core.objectsInstrumented.BinTree tree_BinTree_1 = new roops.core.objectsInstrumented.BinTree();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_1 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_2 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_3 = new roops.core.objectsInstrumented.BinTreeNode();
        int x_Integer_1 = 0;
        // Parameter Initialization
        // Fields Initialization for 'tree_BinTree_1'
        // Fields Initialization for '_BinTreeNode_1'
        updateValue(_BinTreeNode_1, "key", -67109666);
        // Fields Initialization for '_BinTreeNode_2'
        updateValue(_BinTreeNode_2, "key", -172843042);
        updateValue(_BinTreeNode_2, "left", null);
        updateValue(_BinTreeNode_2, "right", null);
        updateValue(_BinTreeNode_2, "parent", _BinTreeNode_1);
        updateValue(_BinTreeNode_1, "left", _BinTreeNode_2);
        // Fields Initialization for '_BinTreeNode_3'
        updateValue(_BinTreeNode_3, "key", -65007127);
        updateValue(_BinTreeNode_3, "left", null);
        updateValue(_BinTreeNode_3, "right", null);
        updateValue(_BinTreeNode_3, "parent", _BinTreeNode_1);
        updateValue(_BinTreeNode_1, "right", _BinTreeNode_3);
        updateValue(_BinTreeNode_1, "parent", null);
        updateValue(tree_BinTree_1, "root", _BinTreeNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.BinTree", "addTest", true);
        try {
            method.invoke(instance, new Object[]{tree_BinTree_1, x_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testaddTest_30() {
        roops.core.objectsInstrumented.BinTree instance = null;
        roops.core.objectsInstrumented.BinTree tree_BinTree_1 = new roops.core.objectsInstrumented.BinTree();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_1 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_2 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_3 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_4 = new roops.core.objectsInstrumented.BinTreeNode();
        int x_Integer_1 = 2011682705;
        // Parameter Initialization
        // Fields Initialization for 'tree_BinTree_1'
        // Fields Initialization for '_BinTreeNode_1'
        updateValue(_BinTreeNode_1, "key", 0);
        // Fields Initialization for '_BinTreeNode_2'
        updateValue(_BinTreeNode_2, "key", -75781673);
        updateValue(_BinTreeNode_2, "left", null);
        updateValue(_BinTreeNode_2, "right", null);
        updateValue(_BinTreeNode_2, "parent", _BinTreeNode_1);
        updateValue(_BinTreeNode_1, "left", _BinTreeNode_2);
        // Fields Initialization for '_BinTreeNode_3'
        updateValue(_BinTreeNode_3, "key", 16);
        updateValue(_BinTreeNode_3, "left", null);
        // Fields Initialization for '_BinTreeNode_4'
        updateValue(_BinTreeNode_4, "key", 2011682705);
        updateValue(_BinTreeNode_4, "left", null);
        updateValue(_BinTreeNode_4, "right", null);
        updateValue(_BinTreeNode_4, "parent", _BinTreeNode_3);
        updateValue(_BinTreeNode_3, "right", _BinTreeNode_4);
        updateValue(_BinTreeNode_3, "parent", _BinTreeNode_1);
        updateValue(_BinTreeNode_1, "right", _BinTreeNode_3);
        updateValue(_BinTreeNode_1, "parent", null);
        updateValue(tree_BinTree_1, "root", _BinTreeNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.BinTree", "addTest", true);
        try {
            method.invoke(instance, new Object[]{tree_BinTree_1, x_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testaddTest_31() {
        roops.core.objectsInstrumented.BinTree instance = null;
        roops.core.objectsInstrumented.BinTree tree_BinTree_1 = new roops.core.objectsInstrumented.BinTree();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_1 = new roops.core.objectsInstrumented.BinTreeNode();
        int x_Integer_1 = 0;
        // Parameter Initialization
        // Fields Initialization for 'tree_BinTree_1'
        // Fields Initialization for '_BinTreeNode_1'
        updateValue(_BinTreeNode_1, "key", 2130706431);
        updateValue(_BinTreeNode_1, "left", null);
        updateValue(_BinTreeNode_1, "right", null);
        updateValue(_BinTreeNode_1, "parent", null);
        updateValue(tree_BinTree_1, "root", _BinTreeNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.BinTree", "addTest", true);
        try {
            method.invoke(instance, new Object[]{tree_BinTree_1, x_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }
}