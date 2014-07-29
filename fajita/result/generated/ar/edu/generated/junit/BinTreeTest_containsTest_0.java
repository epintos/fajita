package ar.edu.generated.junit;

import java.lang.reflect.Method;
import java.lang.reflect.Field;
import org.junit.Test;

public class BinTreeTest_containsTest_0 {

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
    public void testcontainsTest_0() {
        roops.core.objectsInstrumented.BinTree instance = null;
        roops.core.objectsInstrumented.BinTree tree_BinTree_1 = new roops.core.objectsInstrumented.BinTree();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_1 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_2 = new roops.core.objectsInstrumented.BinTreeNode();
        int x_Integer_1 = -1193431377;
        // Parameter Initialization
        // Fields Initialization for 'tree_BinTree_1'
        // Fields Initialization for '_BinTreeNode_1'
        updateValue(_BinTreeNode_1, "key", -1193431377);
        updateValue(_BinTreeNode_1, "left", null);
        // Fields Initialization for '_BinTreeNode_2'
        updateValue(_BinTreeNode_2, "key", 1160271628);
        updateValue(_BinTreeNode_2, "left", null);
        updateValue(_BinTreeNode_2, "right", null);
        updateValue(_BinTreeNode_2, "parent", _BinTreeNode_1);
        updateValue(_BinTreeNode_1, "right", _BinTreeNode_2);
        updateValue(_BinTreeNode_1, "parent", null);
        updateValue(tree_BinTree_1, "root", _BinTreeNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.BinTree", "containsTest", true);
        try {
            method.invoke(instance, new Object[]{tree_BinTree_1, x_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testcontainsTest_1() {
        roops.core.objectsInstrumented.BinTree instance = null;
        roops.core.objectsInstrumented.BinTree tree_BinTree_1 = new roops.core.objectsInstrumented.BinTree();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_1 = new roops.core.objectsInstrumented.BinTreeNode();
        int x_Integer_1 = 1714501830;
        // Parameter Initialization
        // Fields Initialization for 'tree_BinTree_1'
        // Fields Initialization for '_BinTreeNode_1'
        updateValue(_BinTreeNode_1, "key", -908818631);
        updateValue(_BinTreeNode_1, "left", null);
        updateValue(_BinTreeNode_1, "right", null);
        updateValue(_BinTreeNode_1, "parent", null);
        updateValue(tree_BinTree_1, "root", _BinTreeNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.BinTree", "containsTest", true);
        try {
            method.invoke(instance, new Object[]{tree_BinTree_1, x_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testcontainsTest_2() {
        roops.core.objectsInstrumented.BinTree instance = null;
        roops.core.objectsInstrumented.BinTree tree_BinTree_1 = new roops.core.objectsInstrumented.BinTree();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_1 = new roops.core.objectsInstrumented.BinTreeNode();
        int x_Integer_1 = -1985478639;
        // Parameter Initialization
        // Fields Initialization for 'tree_BinTree_1'
        // Fields Initialization for '_BinTreeNode_1'
        updateValue(_BinTreeNode_1, "key", 1993605102);
        updateValue(_BinTreeNode_1, "left", null);
        updateValue(_BinTreeNode_1, "right", null);
        updateValue(_BinTreeNode_1, "parent", null);
        updateValue(tree_BinTree_1, "root", _BinTreeNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.BinTree", "containsTest", true);
        try {
            method.invoke(instance, new Object[]{tree_BinTree_1, x_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }
}