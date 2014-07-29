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
        int x_Integer_1 = 259732415;
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
        int x_Integer_1 = 0;
        // Parameter Initialization
        // Fields Initialization for 'tree_BinTree_1'
        // Fields Initialization for '_BinTreeNode_1'
        updateValue(_BinTreeNode_1, "key", 0);
        updateValue(_BinTreeNode_1, "left", null);
        // Fields Initialization for '_BinTreeNode_2'
        updateValue(_BinTreeNode_2, "key", 129523721);
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
        updateValue(_BinTreeNode_1, "key", 1608318972);
        // Fields Initialization for '_BinTreeNode_2'
        updateValue(_BinTreeNode_2, "key", 0);
        updateValue(_BinTreeNode_2, "left", null);
        updateValue(_BinTreeNode_2, "right", null);
        updateValue(_BinTreeNode_2, "parent", _BinTreeNode_1);
        updateValue(_BinTreeNode_1, "left", _BinTreeNode_2);
        // Fields Initialization for '_BinTreeNode_3'
        updateValue(_BinTreeNode_3, "key", 1870398182);
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
        int x_Integer_1 = -2128609279;
        // Parameter Initialization
        // Fields Initialization for 'tree_BinTree_1'
        // Fields Initialization for '_BinTreeNode_1'
        updateValue(_BinTreeNode_1, "key", -2132934660);
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
    public void testaddTest_4() {
        roops.core.objectsInstrumented.BinTree instance = null;
        roops.core.objectsInstrumented.BinTree tree_BinTree_1 = new roops.core.objectsInstrumented.BinTree();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_1 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_2 = new roops.core.objectsInstrumented.BinTreeNode();
        int x_Integer_1 = 759168974;
        // Parameter Initialization
        // Fields Initialization for 'tree_BinTree_1'
        // Fields Initialization for '_BinTreeNode_1'
        updateValue(_BinTreeNode_1, "key", -624951247);
        updateValue(_BinTreeNode_1, "left", null);
        // Fields Initialization for '_BinTreeNode_2'
        updateValue(_BinTreeNode_2, "key", 759168974);
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
    public void testaddTest_5() {
        roops.core.objectsInstrumented.BinTree instance = null;
        roops.core.objectsInstrumented.BinTree tree_BinTree_1 = new roops.core.objectsInstrumented.BinTree();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_1 = new roops.core.objectsInstrumented.BinTreeNode();
        int x_Integer_1 = -2;
        // Parameter Initialization
        // Fields Initialization for 'tree_BinTree_1'
        // Fields Initialization for '_BinTreeNode_1'
        updateValue(_BinTreeNode_1, "key", 0);
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