package ar.edu.generated.junit;

import java.lang.reflect.Method;
import java.lang.reflect.Field;
import org.junit.Test;

public class AvlTreeTest_searchMaxTest_0 {

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
    public void testsearchMaxTest_0() {
        roops.core.objectsInstrumented.AvlTree instance = null;
        // Parameter Initialization
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.AvlTree", "searchMaxTest", true);
        try {
            method.invoke(instance, new Object[]{instance});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testsearchMaxTest_1() {
        roops.core.objectsInstrumented.AvlTree instance = null;
        roops.core.objectsInstrumented.AvlTree tree_AvlTree_1 = new roops.core.objectsInstrumented.AvlTree();
        roops.core.objectsInstrumented.AvlNode _AvlNode_1 = new roops.core.objectsInstrumented.AvlNode();
        roops.core.objectsInstrumented.AvlNode _AvlNode_2 = new roops.core.objectsInstrumented.AvlNode();
        // Parameter Initialization
        // Fields Initialization for 'tree_AvlTree_1'
        // Fields Initialization for '_AvlNode_1'
        updateValue(_AvlNode_1, "element", 0);
        updateValue(_AvlNode_1, "left", null);
        // Fields Initialization for '_AvlNode_2'
        updateValue(_AvlNode_2, "element", 1049735324);
        updateValue(_AvlNode_2, "left", null);
        updateValue(_AvlNode_2, "right", null);
        updateValue(_AvlNode_2, "height", 0);
        updateValue(_AvlNode_1, "right", _AvlNode_2);
        updateValue(_AvlNode_1, "height", 1);
        updateValue(tree_AvlTree_1, "root", _AvlNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.AvlTree", "searchMaxTest", true);
        try {
            method.invoke(instance, new Object[]{tree_AvlTree_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testsearchMaxTest_2() {
        roops.core.objectsInstrumented.AvlTree instance = null;
        roops.core.objectsInstrumented.AvlTree tree_AvlTree_1 = new roops.core.objectsInstrumented.AvlTree();
        roops.core.objectsInstrumented.AvlNode _AvlNode_1 = new roops.core.objectsInstrumented.AvlNode();
        roops.core.objectsInstrumented.AvlNode _AvlNode_2 = new roops.core.objectsInstrumented.AvlNode();
        // Parameter Initialization
        // Fields Initialization for 'tree_AvlTree_1'
        // Fields Initialization for '_AvlNode_1'
        updateValue(_AvlNode_1, "element", 1448531369);
        // Fields Initialization for '_AvlNode_2'
        updateValue(_AvlNode_2, "element", 1293979002);
        updateValue(_AvlNode_2, "left", null);
        updateValue(_AvlNode_2, "right", null);
        updateValue(_AvlNode_2, "height", 0);
        updateValue(_AvlNode_1, "left", _AvlNode_2);
        updateValue(_AvlNode_1, "right", null);
        updateValue(_AvlNode_1, "height", 1);
        updateValue(tree_AvlTree_1, "root", _AvlNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.AvlTree", "searchMaxTest", true);
        try {
            method.invoke(instance, new Object[]{tree_AvlTree_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testsearchMaxTest_3() {
        roops.core.objectsInstrumented.AvlTree instance = null;
        // Parameter Initialization
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.AvlTree", "searchMaxTest", true);
        try {
            method.invoke(instance, new Object[]{instance});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testsearchMaxTest_4() {
        roops.core.objectsInstrumented.AvlTree instance = null;
        roops.core.objectsInstrumented.AvlTree tree_AvlTree_1 = new roops.core.objectsInstrumented.AvlTree();
        roops.core.objectsInstrumented.AvlNode _AvlNode_1 = new roops.core.objectsInstrumented.AvlNode();
        roops.core.objectsInstrumented.AvlNode _AvlNode_2 = new roops.core.objectsInstrumented.AvlNode();
        // Parameter Initialization
        // Fields Initialization for 'tree_AvlTree_1'
        // Fields Initialization for '_AvlNode_1'
        updateValue(_AvlNode_1, "element", 0);
        updateValue(_AvlNode_1, "left", null);
        // Fields Initialization for '_AvlNode_2'
        updateValue(_AvlNode_2, "element", 1049735324);
        updateValue(_AvlNode_2, "left", null);
        updateValue(_AvlNode_2, "right", null);
        updateValue(_AvlNode_2, "height", 0);
        updateValue(_AvlNode_1, "right", _AvlNode_2);
        updateValue(_AvlNode_1, "height", 1);
        updateValue(tree_AvlTree_1, "root", _AvlNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.AvlTree", "searchMaxTest", true);
        try {
            method.invoke(instance, new Object[]{tree_AvlTree_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testsearchMaxTest_5() {
        roops.core.objectsInstrumented.AvlTree instance = null;
        roops.core.objectsInstrumented.AvlTree tree_AvlTree_1 = new roops.core.objectsInstrumented.AvlTree();
        roops.core.objectsInstrumented.AvlNode _AvlNode_1 = new roops.core.objectsInstrumented.AvlNode();
        roops.core.objectsInstrumented.AvlNode _AvlNode_2 = new roops.core.objectsInstrumented.AvlNode();
        // Parameter Initialization
        // Fields Initialization for 'tree_AvlTree_1'
        // Fields Initialization for '_AvlNode_1'
        updateValue(_AvlNode_1, "element", 1448531369);
        // Fields Initialization for '_AvlNode_2'
        updateValue(_AvlNode_2, "element", 1293979002);
        updateValue(_AvlNode_2, "left", null);
        updateValue(_AvlNode_2, "right", null);
        updateValue(_AvlNode_2, "height", 0);
        updateValue(_AvlNode_1, "left", _AvlNode_2);
        updateValue(_AvlNode_1, "right", null);
        updateValue(_AvlNode_1, "height", 1);
        updateValue(tree_AvlTree_1, "root", _AvlNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.AvlTree", "searchMaxTest", true);
        try {
            method.invoke(instance, new Object[]{tree_AvlTree_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testsearchMaxTest_6() {
        roops.core.objectsInstrumented.AvlTree instance = null;
        // Parameter Initialization
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.AvlTree", "searchMaxTest", true);
        try {
            method.invoke(instance, new Object[]{instance});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testsearchMaxTest_7() {
        roops.core.objectsInstrumented.AvlTree instance = null;
        // Parameter Initialization
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.AvlTree", "searchMaxTest", true);
        try {
            method.invoke(instance, new Object[]{instance});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testsearchMaxTest_8() {
        roops.core.objectsInstrumented.AvlTree instance = null;
        roops.core.objectsInstrumented.AvlTree tree_AvlTree_1 = new roops.core.objectsInstrumented.AvlTree();
        roops.core.objectsInstrumented.AvlNode _AvlNode_1 = new roops.core.objectsInstrumented.AvlNode();
        roops.core.objectsInstrumented.AvlNode _AvlNode_2 = new roops.core.objectsInstrumented.AvlNode();
        // Parameter Initialization
        // Fields Initialization for 'tree_AvlTree_1'
        // Fields Initialization for '_AvlNode_1'
        updateValue(_AvlNode_1, "element", 0);
        updateValue(_AvlNode_1, "left", null);
        // Fields Initialization for '_AvlNode_2'
        updateValue(_AvlNode_2, "element", 1049735324);
        updateValue(_AvlNode_2, "left", null);
        updateValue(_AvlNode_2, "right", null);
        updateValue(_AvlNode_2, "height", 0);
        updateValue(_AvlNode_1, "right", _AvlNode_2);
        updateValue(_AvlNode_1, "height", 1);
        updateValue(tree_AvlTree_1, "root", _AvlNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.AvlTree", "searchMaxTest", true);
        try {
            method.invoke(instance, new Object[]{tree_AvlTree_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testsearchMaxTest_9() {
        roops.core.objectsInstrumented.AvlTree instance = null;
        roops.core.objectsInstrumented.AvlTree tree_AvlTree_1 = new roops.core.objectsInstrumented.AvlTree();
        roops.core.objectsInstrumented.AvlNode _AvlNode_1 = new roops.core.objectsInstrumented.AvlNode();
        roops.core.objectsInstrumented.AvlNode _AvlNode_2 = new roops.core.objectsInstrumented.AvlNode();
        // Parameter Initialization
        // Fields Initialization for 'tree_AvlTree_1'
        // Fields Initialization for '_AvlNode_1'
        updateValue(_AvlNode_1, "element", 1448531369);
        // Fields Initialization for '_AvlNode_2'
        updateValue(_AvlNode_2, "element", 1293979002);
        updateValue(_AvlNode_2, "left", null);
        updateValue(_AvlNode_2, "right", null);
        updateValue(_AvlNode_2, "height", 0);
        updateValue(_AvlNode_1, "left", _AvlNode_2);
        updateValue(_AvlNode_1, "right", null);
        updateValue(_AvlNode_1, "height", 1);
        updateValue(tree_AvlTree_1, "root", _AvlNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.AvlTree", "searchMaxTest", true);
        try {
            method.invoke(instance, new Object[]{tree_AvlTree_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testsearchMaxTest_10() {
        roops.core.objectsInstrumented.AvlTree instance = null;
        roops.core.objectsInstrumented.AvlTree tree_AvlTree_1 = new roops.core.objectsInstrumented.AvlTree();
        roops.core.objectsInstrumented.AvlNode _AvlNode_1 = new roops.core.objectsInstrumented.AvlNode();
        // Parameter Initialization
        // Fields Initialization for 'tree_AvlTree_1'
        // Fields Initialization for '_AvlNode_1'
        updateValue(_AvlNode_1, "element", 0);
        updateValue(_AvlNode_1, "left", null);
        updateValue(_AvlNode_1, "right", null);
        updateValue(_AvlNode_1, "height", 0);
        updateValue(tree_AvlTree_1, "root", _AvlNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.AvlTree", "searchMaxTest", true);
        try {
            method.invoke(instance, new Object[]{tree_AvlTree_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testsearchMaxTest_11() {
        roops.core.objectsInstrumented.AvlTree instance = null;
        // Parameter Initialization
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.AvlTree", "searchMaxTest", true);
        try {
            method.invoke(instance, new Object[]{instance});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testsearchMaxTest_12() {
        roops.core.objectsInstrumented.AvlTree instance = null;
        roops.core.objectsInstrumented.AvlTree tree_AvlTree_1 = new roops.core.objectsInstrumented.AvlTree();
        roops.core.objectsInstrumented.AvlNode _AvlNode_1 = new roops.core.objectsInstrumented.AvlNode();
        roops.core.objectsInstrumented.AvlNode _AvlNode_2 = new roops.core.objectsInstrumented.AvlNode();
        // Parameter Initialization
        // Fields Initialization for 'tree_AvlTree_1'
        // Fields Initialization for '_AvlNode_1'
        updateValue(_AvlNode_1, "element", -1);
        updateValue(_AvlNode_1, "left", null);
        // Fields Initialization for '_AvlNode_2'
        updateValue(_AvlNode_2, "element", 0);
        updateValue(_AvlNode_2, "left", null);
        updateValue(_AvlNode_2, "right", null);
        updateValue(_AvlNode_2, "height", 0);
        updateValue(_AvlNode_1, "right", _AvlNode_2);
        updateValue(_AvlNode_1, "height", 1);
        updateValue(tree_AvlTree_1, "root", _AvlNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.AvlTree", "searchMaxTest", true);
        try {
            method.invoke(instance, new Object[]{tree_AvlTree_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testsearchMaxTest_13() {
        roops.core.objectsInstrumented.AvlTree instance = null;
        // Parameter Initialization
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.AvlTree", "searchMaxTest", true);
        try {
            method.invoke(instance, new Object[]{instance});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testsearchMaxTest_14() {
        roops.core.objectsInstrumented.AvlTree instance = null;
        // Parameter Initialization
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.AvlTree", "searchMaxTest", true);
        try {
            method.invoke(instance, new Object[]{instance});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testsearchMaxTest_15() {
        roops.core.objectsInstrumented.AvlTree instance = null;
        roops.core.objectsInstrumented.AvlTree tree_AvlTree_1 = new roops.core.objectsInstrumented.AvlTree();
        roops.core.objectsInstrumented.AvlNode _AvlNode_1 = new roops.core.objectsInstrumented.AvlNode();
        // Parameter Initialization
        // Fields Initialization for 'tree_AvlTree_1'
        // Fields Initialization for '_AvlNode_1'
        updateValue(_AvlNode_1, "element", -1);
        updateValue(_AvlNode_1, "left", null);
        updateValue(_AvlNode_1, "right", null);
        updateValue(_AvlNode_1, "height", 0);
        updateValue(tree_AvlTree_1, "root", _AvlNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.AvlTree", "searchMaxTest", true);
        try {
            method.invoke(instance, new Object[]{tree_AvlTree_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testsearchMaxTest_16() {
        roops.core.objectsInstrumented.AvlTree instance = null;
        roops.core.objectsInstrumented.AvlTree tree_AvlTree_1 = new roops.core.objectsInstrumented.AvlTree();
        roops.core.objectsInstrumented.AvlNode _AvlNode_1 = new roops.core.objectsInstrumented.AvlNode();
        roops.core.objectsInstrumented.AvlNode _AvlNode_2 = new roops.core.objectsInstrumented.AvlNode();
        // Parameter Initialization
        // Fields Initialization for 'tree_AvlTree_1'
        // Fields Initialization for '_AvlNode_1'
        updateValue(_AvlNode_1, "element", 0);
        updateValue(_AvlNode_1, "left", null);
        // Fields Initialization for '_AvlNode_2'
        updateValue(_AvlNode_2, "element", 1);
        updateValue(_AvlNode_2, "left", null);
        updateValue(_AvlNode_2, "right", null);
        updateValue(_AvlNode_2, "height", 0);
        updateValue(_AvlNode_1, "right", _AvlNode_2);
        updateValue(_AvlNode_1, "height", 1);
        updateValue(tree_AvlTree_1, "root", _AvlNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.AvlTree", "searchMaxTest", true);
        try {
            method.invoke(instance, new Object[]{tree_AvlTree_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testsearchMaxTest_17() {
        roops.core.objectsInstrumented.AvlTree instance = null;
        roops.core.objectsInstrumented.AvlTree tree_AvlTree_1 = new roops.core.objectsInstrumented.AvlTree();
        roops.core.objectsInstrumented.AvlNode _AvlNode_1 = new roops.core.objectsInstrumented.AvlNode();
        // Parameter Initialization
        // Fields Initialization for 'tree_AvlTree_1'
        // Fields Initialization for '_AvlNode_1'
        updateValue(_AvlNode_1, "element", 0);
        updateValue(_AvlNode_1, "left", null);
        updateValue(_AvlNode_1, "right", null);
        updateValue(_AvlNode_1, "height", 0);
        updateValue(tree_AvlTree_1, "root", _AvlNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.AvlTree", "searchMaxTest", true);
        try {
            method.invoke(instance, new Object[]{tree_AvlTree_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testsearchMaxTest_18() {
        roops.core.objectsInstrumented.AvlTree instance = null;
        // Parameter Initialization
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.AvlTree", "searchMaxTest", true);
        try {
            method.invoke(instance, new Object[]{instance});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testsearchMaxTest_19() {
        roops.core.objectsInstrumented.AvlTree instance = null;
        roops.core.objectsInstrumented.AvlTree tree_AvlTree_1 = new roops.core.objectsInstrumented.AvlTree();
        roops.core.objectsInstrumented.AvlNode _AvlNode_1 = new roops.core.objectsInstrumented.AvlNode();
        roops.core.objectsInstrumented.AvlNode _AvlNode_2 = new roops.core.objectsInstrumented.AvlNode();
        // Parameter Initialization
        // Fields Initialization for 'tree_AvlTree_1'
        // Fields Initialization for '_AvlNode_1'
        updateValue(_AvlNode_1, "element", -1);
        updateValue(_AvlNode_1, "left", null);
        // Fields Initialization for '_AvlNode_2'
        updateValue(_AvlNode_2, "element", 0);
        updateValue(_AvlNode_2, "left", null);
        updateValue(_AvlNode_2, "right", null);
        updateValue(_AvlNode_2, "height", 0);
        updateValue(_AvlNode_1, "right", _AvlNode_2);
        updateValue(_AvlNode_1, "height", 1);
        updateValue(tree_AvlTree_1, "root", _AvlNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.AvlTree", "searchMaxTest", true);
        try {
            method.invoke(instance, new Object[]{tree_AvlTree_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testsearchMaxTest_20() {
        roops.core.objectsInstrumented.AvlTree instance = null;
        // Parameter Initialization
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.AvlTree", "searchMaxTest", true);
        try {
            method.invoke(instance, new Object[]{instance});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testsearchMaxTest_21() {
        roops.core.objectsInstrumented.AvlTree instance = null;
        roops.core.objectsInstrumented.AvlTree tree_AvlTree_1 = new roops.core.objectsInstrumented.AvlTree();
        roops.core.objectsInstrumented.AvlNode _AvlNode_1 = new roops.core.objectsInstrumented.AvlNode();
        // Parameter Initialization
        // Fields Initialization for 'tree_AvlTree_1'
        // Fields Initialization for '_AvlNode_1'
        updateValue(_AvlNode_1, "element", 0);
        updateValue(_AvlNode_1, "left", null);
        updateValue(_AvlNode_1, "right", null);
        updateValue(_AvlNode_1, "height", 0);
        updateValue(tree_AvlTree_1, "root", _AvlNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.AvlTree", "searchMaxTest", true);
        try {
            method.invoke(instance, new Object[]{tree_AvlTree_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testsearchMaxTest_22() {
        roops.core.objectsInstrumented.AvlTree instance = null;
        // Parameter Initialization
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.AvlTree", "searchMaxTest", true);
        try {
            method.invoke(instance, new Object[]{instance});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testsearchMaxTest_23() {
        roops.core.objectsInstrumented.AvlTree instance = null;
        roops.core.objectsInstrumented.AvlTree tree_AvlTree_1 = new roops.core.objectsInstrumented.AvlTree();
        roops.core.objectsInstrumented.AvlNode _AvlNode_1 = new roops.core.objectsInstrumented.AvlNode();
        roops.core.objectsInstrumented.AvlNode _AvlNode_2 = new roops.core.objectsInstrumented.AvlNode();
        // Parameter Initialization
        // Fields Initialization for 'tree_AvlTree_1'
        // Fields Initialization for '_AvlNode_1'
        updateValue(_AvlNode_1, "element", -1);
        updateValue(_AvlNode_1, "left", null);
        // Fields Initialization for '_AvlNode_2'
        updateValue(_AvlNode_2, "element", 0);
        updateValue(_AvlNode_2, "left", null);
        updateValue(_AvlNode_2, "right", null);
        updateValue(_AvlNode_2, "height", 0);
        updateValue(_AvlNode_1, "right", _AvlNode_2);
        updateValue(_AvlNode_1, "height", 1);
        updateValue(tree_AvlTree_1, "root", _AvlNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.AvlTree", "searchMaxTest", true);
        try {
            method.invoke(instance, new Object[]{tree_AvlTree_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }
}