package ar.edu.generated.junit;

import java.lang.reflect.Method;
import java.lang.reflect.Field;
import org.junit.Test;

public class AvlTreeTest_searchNodeTest_0 {

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
    public void testsearchNodeTest_0() {
        roops.core.objectsInstrumented.AvlTree instance = null;
        roops.core.objectsInstrumented.AvlTree tree_AvlTree_1 = new roops.core.objectsInstrumented.AvlTree();
        roops.core.objectsInstrumented.AvlNode _AvlNode_1 = new roops.core.objectsInstrumented.AvlNode();
        int x_Integer_1 = 1;
        // Parameter Initialization
        // Fields Initialization for 'tree_AvlTree_1'
        // Fields Initialization for '_AvlNode_1'
        updateValue(_AvlNode_1, "element", 1);
        updateValue(_AvlNode_1, "left", null);
        updateValue(_AvlNode_1, "right", null);
        updateValue(_AvlNode_1, "height", 0);
        updateValue(tree_AvlTree_1, "root", _AvlNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.AvlTree", "searchNodeTest", true);
        try {
            method.invoke(instance, new Object[]{tree_AvlTree_1, x_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testsearchNodeTest_1() {
        roops.core.objectsInstrumented.AvlTree instance = null;
        roops.core.objectsInstrumented.AvlTree tree_AvlTree_1 = new roops.core.objectsInstrumented.AvlTree();
        roops.core.objectsInstrumented.AvlNode _AvlNode_1 = new roops.core.objectsInstrumented.AvlNode();
        roops.core.objectsInstrumented.AvlNode _AvlNode_2 = new roops.core.objectsInstrumented.AvlNode();
        int x_Integer_1 = -35405248;
        // Parameter Initialization
        // Fields Initialization for 'tree_AvlTree_1'
        // Fields Initialization for '_AvlNode_1'
        updateValue(_AvlNode_1, "element", 0);
        updateValue(_AvlNode_1, "left", null);
        // Fields Initialization for '_AvlNode_2'
        updateValue(_AvlNode_2, "element", 1690189010);
        updateValue(_AvlNode_2, "left", null);
        updateValue(_AvlNode_2, "right", null);
        updateValue(_AvlNode_2, "height", 0);
        updateValue(_AvlNode_1, "right", _AvlNode_2);
        updateValue(_AvlNode_1, "height", 1);
        updateValue(tree_AvlTree_1, "root", _AvlNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.AvlTree", "searchNodeTest", true);
        try {
            method.invoke(instance, new Object[]{tree_AvlTree_1, x_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testsearchNodeTest_2() {
        roops.core.objectsInstrumented.AvlTree instance = null;
        roops.core.objectsInstrumented.AvlTree tree_AvlTree_1 = new roops.core.objectsInstrumented.AvlTree();
        roops.core.objectsInstrumented.AvlNode _AvlNode_1 = new roops.core.objectsInstrumented.AvlNode();
        int x_Integer_1 = 2147483646;
        // Parameter Initialization
        // Fields Initialization for 'tree_AvlTree_1'
        // Fields Initialization for '_AvlNode_1'
        updateValue(_AvlNode_1, "element", -2147483647);
        updateValue(_AvlNode_1, "left", null);
        updateValue(_AvlNode_1, "right", null);
        updateValue(_AvlNode_1, "height", 0);
        updateValue(tree_AvlTree_1, "root", _AvlNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.AvlTree", "searchNodeTest", true);
        try {
            method.invoke(instance, new Object[]{tree_AvlTree_1, x_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testsearchNodeTest_3() {
        roops.core.objectsInstrumented.AvlTree instance = null;
        roops.core.objectsInstrumented.AvlTree tree_AvlTree_1 = new roops.core.objectsInstrumented.AvlTree();
        roops.core.objectsInstrumented.AvlNode _AvlNode_1 = new roops.core.objectsInstrumented.AvlNode();
        int x_Integer_1 = 1;
        // Parameter Initialization
        // Fields Initialization for 'tree_AvlTree_1'
        // Fields Initialization for '_AvlNode_1'
        updateValue(_AvlNode_1, "element", 1);
        updateValue(_AvlNode_1, "left", null);
        updateValue(_AvlNode_1, "right", null);
        updateValue(_AvlNode_1, "height", 0);
        updateValue(tree_AvlTree_1, "root", _AvlNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.AvlTree", "searchNodeTest", true);
        try {
            method.invoke(instance, new Object[]{tree_AvlTree_1, x_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testsearchNodeTest_4() {
        roops.core.objectsInstrumented.AvlTree instance = null;
        roops.core.objectsInstrumented.AvlTree tree_AvlTree_1 = new roops.core.objectsInstrumented.AvlTree();
        roops.core.objectsInstrumented.AvlNode _AvlNode_1 = new roops.core.objectsInstrumented.AvlNode();
        roops.core.objectsInstrumented.AvlNode _AvlNode_2 = new roops.core.objectsInstrumented.AvlNode();
        int x_Integer_1 = -35405248;
        // Parameter Initialization
        // Fields Initialization for 'tree_AvlTree_1'
        // Fields Initialization for '_AvlNode_1'
        updateValue(_AvlNode_1, "element", 0);
        updateValue(_AvlNode_1, "left", null);
        // Fields Initialization for '_AvlNode_2'
        updateValue(_AvlNode_2, "element", 1690189010);
        updateValue(_AvlNode_2, "left", null);
        updateValue(_AvlNode_2, "right", null);
        updateValue(_AvlNode_2, "height", 0);
        updateValue(_AvlNode_1, "right", _AvlNode_2);
        updateValue(_AvlNode_1, "height", 1);
        updateValue(tree_AvlTree_1, "root", _AvlNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.AvlTree", "searchNodeTest", true);
        try {
            method.invoke(instance, new Object[]{tree_AvlTree_1, x_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testsearchNodeTest_5() {
        roops.core.objectsInstrumented.AvlTree instance = null;
        roops.core.objectsInstrumented.AvlTree tree_AvlTree_1 = new roops.core.objectsInstrumented.AvlTree();
        roops.core.objectsInstrumented.AvlNode _AvlNode_1 = new roops.core.objectsInstrumented.AvlNode();
        int x_Integer_1 = 2147483646;
        // Parameter Initialization
        // Fields Initialization for 'tree_AvlTree_1'
        // Fields Initialization for '_AvlNode_1'
        updateValue(_AvlNode_1, "element", -2147483647);
        updateValue(_AvlNode_1, "left", null);
        updateValue(_AvlNode_1, "right", null);
        updateValue(_AvlNode_1, "height", 0);
        updateValue(tree_AvlTree_1, "root", _AvlNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.AvlTree", "searchNodeTest", true);
        try {
            method.invoke(instance, new Object[]{tree_AvlTree_1, x_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testsearchNodeTest_6() {
        roops.core.objectsInstrumented.AvlTree instance = null;
        roops.core.objectsInstrumented.AvlTree tree_AvlTree_1 = new roops.core.objectsInstrumented.AvlTree();
        roops.core.objectsInstrumented.AvlNode _AvlNode_1 = new roops.core.objectsInstrumented.AvlNode();
        int x_Integer_1 = 1;
        // Parameter Initialization
        // Fields Initialization for 'tree_AvlTree_1'
        // Fields Initialization for '_AvlNode_1'
        updateValue(_AvlNode_1, "element", 1);
        updateValue(_AvlNode_1, "left", null);
        updateValue(_AvlNode_1, "right", null);
        updateValue(_AvlNode_1, "height", 0);
        updateValue(tree_AvlTree_1, "root", _AvlNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.AvlTree", "searchNodeTest", true);
        try {
            method.invoke(instance, new Object[]{tree_AvlTree_1, x_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testsearchNodeTest_7() {
        roops.core.objectsInstrumented.AvlTree instance = null;
        roops.core.objectsInstrumented.AvlTree tree_AvlTree_1 = new roops.core.objectsInstrumented.AvlTree();
        roops.core.objectsInstrumented.AvlNode _AvlNode_1 = new roops.core.objectsInstrumented.AvlNode();
        roops.core.objectsInstrumented.AvlNode _AvlNode_2 = new roops.core.objectsInstrumented.AvlNode();
        int x_Integer_1 = -35405248;
        // Parameter Initialization
        // Fields Initialization for 'tree_AvlTree_1'
        // Fields Initialization for '_AvlNode_1'
        updateValue(_AvlNode_1, "element", 0);
        updateValue(_AvlNode_1, "left", null);
        // Fields Initialization for '_AvlNode_2'
        updateValue(_AvlNode_2, "element", 1690189010);
        updateValue(_AvlNode_2, "left", null);
        updateValue(_AvlNode_2, "right", null);
        updateValue(_AvlNode_2, "height", 0);
        updateValue(_AvlNode_1, "right", _AvlNode_2);
        updateValue(_AvlNode_1, "height", 1);
        updateValue(tree_AvlTree_1, "root", _AvlNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.AvlTree", "searchNodeTest", true);
        try {
            method.invoke(instance, new Object[]{tree_AvlTree_1, x_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testsearchNodeTest_8() {
        roops.core.objectsInstrumented.AvlTree instance = null;
        roops.core.objectsInstrumented.AvlTree tree_AvlTree_1 = new roops.core.objectsInstrumented.AvlTree();
        roops.core.objectsInstrumented.AvlNode _AvlNode_1 = new roops.core.objectsInstrumented.AvlNode();
        int x_Integer_1 = 2147483646;
        // Parameter Initialization
        // Fields Initialization for 'tree_AvlTree_1'
        // Fields Initialization for '_AvlNode_1'
        updateValue(_AvlNode_1, "element", -2147483647);
        updateValue(_AvlNode_1, "left", null);
        updateValue(_AvlNode_1, "right", null);
        updateValue(_AvlNode_1, "height", 0);
        updateValue(tree_AvlTree_1, "root", _AvlNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.AvlTree", "searchNodeTest", true);
        try {
            method.invoke(instance, new Object[]{tree_AvlTree_1, x_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testsearchNodeTest_9() {
        roops.core.objectsInstrumented.AvlTree instance = null;
        roops.core.objectsInstrumented.AvlTree tree_AvlTree_1 = new roops.core.objectsInstrumented.AvlTree();
        roops.core.objectsInstrumented.AvlNode _AvlNode_1 = new roops.core.objectsInstrumented.AvlNode();
        int x_Integer_1 = 1;
        // Parameter Initialization
        // Fields Initialization for 'tree_AvlTree_1'
        // Fields Initialization for '_AvlNode_1'
        updateValue(_AvlNode_1, "element", 1);
        updateValue(_AvlNode_1, "left", null);
        updateValue(_AvlNode_1, "right", null);
        updateValue(_AvlNode_1, "height", 0);
        updateValue(tree_AvlTree_1, "root", _AvlNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.AvlTree", "searchNodeTest", true);
        try {
            method.invoke(instance, new Object[]{tree_AvlTree_1, x_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testsearchNodeTest_10() {
        roops.core.objectsInstrumented.AvlTree instance = null;
        roops.core.objectsInstrumented.AvlTree tree_AvlTree_1 = new roops.core.objectsInstrumented.AvlTree();
        roops.core.objectsInstrumented.AvlNode _AvlNode_1 = new roops.core.objectsInstrumented.AvlNode();
        roops.core.objectsInstrumented.AvlNode _AvlNode_2 = new roops.core.objectsInstrumented.AvlNode();
        int x_Integer_1 = -35405248;
        // Parameter Initialization
        // Fields Initialization for 'tree_AvlTree_1'
        // Fields Initialization for '_AvlNode_1'
        updateValue(_AvlNode_1, "element", 0);
        updateValue(_AvlNode_1, "left", null);
        // Fields Initialization for '_AvlNode_2'
        updateValue(_AvlNode_2, "element", 1690189010);
        updateValue(_AvlNode_2, "left", null);
        updateValue(_AvlNode_2, "right", null);
        updateValue(_AvlNode_2, "height", 0);
        updateValue(_AvlNode_1, "right", _AvlNode_2);
        updateValue(_AvlNode_1, "height", 1);
        updateValue(tree_AvlTree_1, "root", _AvlNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.AvlTree", "searchNodeTest", true);
        try {
            method.invoke(instance, new Object[]{tree_AvlTree_1, x_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testsearchNodeTest_11() {
        roops.core.objectsInstrumented.AvlTree instance = null;
        roops.core.objectsInstrumented.AvlTree tree_AvlTree_1 = new roops.core.objectsInstrumented.AvlTree();
        roops.core.objectsInstrumented.AvlNode _AvlNode_1 = new roops.core.objectsInstrumented.AvlNode();
        int x_Integer_1 = 2147483646;
        // Parameter Initialization
        // Fields Initialization for 'tree_AvlTree_1'
        // Fields Initialization for '_AvlNode_1'
        updateValue(_AvlNode_1, "element", -2147483647);
        updateValue(_AvlNode_1, "left", null);
        updateValue(_AvlNode_1, "right", null);
        updateValue(_AvlNode_1, "height", 0);
        updateValue(tree_AvlTree_1, "root", _AvlNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.AvlTree", "searchNodeTest", true);
        try {
            method.invoke(instance, new Object[]{tree_AvlTree_1, x_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testsearchNodeTest_12() {
        roops.core.objectsInstrumented.AvlTree instance = null;
        int x_Integer_1 = 0;
        // Parameter Initialization
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.AvlTree", "searchNodeTest", true);
        try {
            method.invoke(instance, new Object[]{instance, x_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }
}