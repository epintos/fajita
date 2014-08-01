package ar.edu.generated.junit;

import java.lang.reflect.Method;
import java.lang.reflect.Field;
import org.junit.Test;

public class BinTreeTest_removeTest_0 {

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
    public void testremoveTest_0() {
        roops.core.objectsInstrumented.BinTree instance = null;
        roops.core.objectsInstrumented.BinTree tree_BinTree_1 = new roops.core.objectsInstrumented.BinTree();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_1 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode z_BinTreeNode_2 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_3 = new roops.core.objectsInstrumented.BinTreeNode();
        // Parameter Initialization
        // Fields Initialization for 'tree_BinTree_1'
        // Fields Initialization for '_BinTreeNode_1'
        updateValue(_BinTreeNode_1, "key", 182340553);
        updateValue(_BinTreeNode_1, "left", null);
        updateValue(_BinTreeNode_1, "right", null);
        updateValue(_BinTreeNode_1, "parent", null);
        updateValue(tree_BinTree_1, "root", _BinTreeNode_1);
        // Fields Initialization for 'z_BinTreeNode_2'
        updateValue(z_BinTreeNode_2, "key", -1143983245);
        updateValue(z_BinTreeNode_2, "left", null);
        updateValue(z_BinTreeNode_2, "right", null);
        // Fields Initialization for '_BinTreeNode_3'
        updateValue(_BinTreeNode_3, "key", -986842066);
        updateValue(_BinTreeNode_3, "left", z_BinTreeNode_2);
        updateValue(_BinTreeNode_3, "right", _BinTreeNode_3);
        updateValue(_BinTreeNode_3, "parent", _BinTreeNode_1);
        updateValue(z_BinTreeNode_2, "parent", _BinTreeNode_3);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.BinTree", "removeTest", true);
        try {
            method.invoke(instance, new Object[]{tree_BinTree_1, z_BinTreeNode_2});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testremoveTest_1() {
        roops.core.objectsInstrumented.BinTree instance = null;
        roops.core.objectsInstrumented.BinTree tree_BinTree_1 = new roops.core.objectsInstrumented.BinTree();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_1 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode z_BinTreeNode_2 = new roops.core.objectsInstrumented.BinTreeNode();
        // Parameter Initialization
        // Fields Initialization for 'tree_BinTree_1'
        // Fields Initialization for '_BinTreeNode_1'
        updateValue(_BinTreeNode_1, "key", 729989028);
        updateValue(_BinTreeNode_1, "left", null);
        updateValue(_BinTreeNode_1, "right", null);
        updateValue(_BinTreeNode_1, "parent", null);
        updateValue(tree_BinTree_1, "root", _BinTreeNode_1);
        // Fields Initialization for 'z_BinTreeNode_2'
        updateValue(z_BinTreeNode_2, "key", -260221606);
        updateValue(z_BinTreeNode_2, "left", null);
        updateValue(z_BinTreeNode_2, "right", z_BinTreeNode_2);
        updateValue(z_BinTreeNode_2, "parent", null);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.BinTree", "removeTest", true);
        try {
            method.invoke(instance, new Object[]{tree_BinTree_1, z_BinTreeNode_2});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testremoveTest_2() {
        roops.core.objectsInstrumented.BinTree instance = null;
        roops.core.objectsInstrumented.BinTreeNode z_BinTreeNode_1 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_2 = new roops.core.objectsInstrumented.BinTreeNode();
        // Parameter Initialization
        // Fields Initialization for 'z_BinTreeNode_1'
        updateValue(z_BinTreeNode_1, "key", -487512556);
        updateValue(z_BinTreeNode_1, "left", z_BinTreeNode_1);
        updateValue(z_BinTreeNode_1, "right", z_BinTreeNode_1);
        // Fields Initialization for '_BinTreeNode_2'
        updateValue(_BinTreeNode_2, "key", 1561219611);
        updateValue(_BinTreeNode_2, "left", null);
        updateValue(_BinTreeNode_2, "right", null);
        updateValue(_BinTreeNode_2, "parent", null);
        updateValue(z_BinTreeNode_1, "parent", _BinTreeNode_2);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.BinTree", "removeTest", true);
        try {
            method.invoke(instance, new Object[]{instance, z_BinTreeNode_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testremoveTest_3() {
        roops.core.objectsInstrumented.BinTree instance = null;
        roops.core.objectsInstrumented.BinTree tree_BinTree_1 = new roops.core.objectsInstrumented.BinTree();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_1 = new roops.core.objectsInstrumented.BinTreeNode();
        // Parameter Initialization
        // Fields Initialization for 'tree_BinTree_1'
        // Fields Initialization for '_BinTreeNode_1'
        updateValue(_BinTreeNode_1, "key", 1610612995);
        updateValue(_BinTreeNode_1, "left", null);
        updateValue(_BinTreeNode_1, "right", null);
        updateValue(_BinTreeNode_1, "parent", null);
        updateValue(tree_BinTree_1, "root", _BinTreeNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.BinTree", "removeTest", true);
        try {
            method.invoke(instance, new Object[]{tree_BinTree_1, instance});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testremoveTest_4() {
        roops.core.objectsInstrumented.BinTree instance = null;
        roops.core.objectsInstrumented.BinTree tree_BinTree_1 = new roops.core.objectsInstrumented.BinTree();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_1 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode z_BinTreeNode_2 = new roops.core.objectsInstrumented.BinTreeNode();
        // Parameter Initialization
        // Fields Initialization for 'tree_BinTree_1'
        // Fields Initialization for '_BinTreeNode_1'
        updateValue(_BinTreeNode_1, "key", -67174532);
        updateValue(_BinTreeNode_1, "left", null);
        updateValue(_BinTreeNode_1, "right", null);
        updateValue(_BinTreeNode_1, "parent", null);
        updateValue(tree_BinTree_1, "root", _BinTreeNode_1);
        // Fields Initialization for 'z_BinTreeNode_2'
        updateValue(z_BinTreeNode_2, "key", -1853292542);
        updateValue(z_BinTreeNode_2, "left", _BinTreeNode_1);
        updateValue(z_BinTreeNode_2, "right", _BinTreeNode_1);
        updateValue(z_BinTreeNode_2, "parent", _BinTreeNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.BinTree", "removeTest", true);
        try {
            method.invoke(instance, new Object[]{tree_BinTree_1, z_BinTreeNode_2});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testremoveTest_5() {
        roops.core.objectsInstrumented.BinTree instance = null;
        roops.core.objectsInstrumented.BinTree tree_BinTree_1 = new roops.core.objectsInstrumented.BinTree();
        roops.core.objectsInstrumented.BinTreeNode z_BinTreeNode_1 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_2 = new roops.core.objectsInstrumented.BinTreeNode();
        // Parameter Initialization
        // Fields Initialization for 'tree_BinTree_1'
        // Fields Initialization for 'z_BinTreeNode_1'
        updateValue(z_BinTreeNode_1, "key", 1781560672);
        // Fields Initialization for '_BinTreeNode_2'
        updateValue(_BinTreeNode_2, "key", -1781741025);
        updateValue(_BinTreeNode_2, "left", null);
        updateValue(_BinTreeNode_2, "right", null);
        updateValue(_BinTreeNode_2, "parent", z_BinTreeNode_1);
        updateValue(z_BinTreeNode_1, "left", _BinTreeNode_2);
        updateValue(z_BinTreeNode_1, "right", null);
        updateValue(z_BinTreeNode_1, "parent", null);
        updateValue(tree_BinTree_1, "root", z_BinTreeNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.BinTree", "removeTest", true);
        try {
            method.invoke(instance, new Object[]{tree_BinTree_1, z_BinTreeNode_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testremoveTest_6() {
        roops.core.objectsInstrumented.BinTree instance = null;
        roops.core.objectsInstrumented.BinTree tree_BinTree_1 = new roops.core.objectsInstrumented.BinTree();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_1 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode z_BinTreeNode_2 = new roops.core.objectsInstrumented.BinTreeNode();
        // Parameter Initialization
        // Fields Initialization for 'tree_BinTree_1'
        // Fields Initialization for '_BinTreeNode_1'
        updateValue(_BinTreeNode_1, "key", -987832824);
        updateValue(_BinTreeNode_1, "left", null);
        updateValue(_BinTreeNode_1, "right", null);
        updateValue(_BinTreeNode_1, "parent", null);
        updateValue(tree_BinTree_1, "root", _BinTreeNode_1);
        // Fields Initialization for 'z_BinTreeNode_2'
        updateValue(z_BinTreeNode_2, "key", -220191774);
        updateValue(z_BinTreeNode_2, "left", z_BinTreeNode_2);
        updateValue(z_BinTreeNode_2, "right", null);
        updateValue(z_BinTreeNode_2, "parent", z_BinTreeNode_2);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.BinTree", "removeTest", true);
        try {
            method.invoke(instance, new Object[]{tree_BinTree_1, z_BinTreeNode_2});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testremoveTest_7() {
        roops.core.objectsInstrumented.BinTree instance = null;
        roops.core.objectsInstrumented.BinTree tree_BinTree_1 = new roops.core.objectsInstrumented.BinTree();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_1 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode z_BinTreeNode_2 = new roops.core.objectsInstrumented.BinTreeNode();
        // Parameter Initialization
        // Fields Initialization for 'tree_BinTree_1'
        // Fields Initialization for '_BinTreeNode_1'
        updateValue(_BinTreeNode_1, "key", 440091303);
        updateValue(_BinTreeNode_1, "left", null);
        updateValue(_BinTreeNode_1, "right", null);
        updateValue(_BinTreeNode_1, "parent", null);
        updateValue(tree_BinTree_1, "root", _BinTreeNode_1);
        // Fields Initialization for 'z_BinTreeNode_2'
        updateValue(z_BinTreeNode_2, "key", -547357711);
        updateValue(z_BinTreeNode_2, "left", _BinTreeNode_1);
        updateValue(z_BinTreeNode_2, "right", null);
        updateValue(z_BinTreeNode_2, "parent", z_BinTreeNode_2);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.BinTree", "removeTest", true);
        try {
            method.invoke(instance, new Object[]{tree_BinTree_1, z_BinTreeNode_2});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testremoveTest_8() {
        roops.core.objectsInstrumented.BinTree instance = null;
        roops.core.objectsInstrumented.BinTree tree_BinTree_1 = new roops.core.objectsInstrumented.BinTree();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_1 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode z_BinTreeNode_2 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_3 = new roops.core.objectsInstrumented.BinTreeNode();
        // Parameter Initialization
        // Fields Initialization for 'tree_BinTree_1'
        // Fields Initialization for '_BinTreeNode_1'
        updateValue(_BinTreeNode_1, "key", 1073889284);
        updateValue(_BinTreeNode_1, "left", null);
        updateValue(_BinTreeNode_1, "right", null);
        updateValue(_BinTreeNode_1, "parent", null);
        updateValue(tree_BinTree_1, "root", _BinTreeNode_1);
        // Fields Initialization for 'z_BinTreeNode_2'
        updateValue(z_BinTreeNode_2, "key", 1073889284);
        // Fields Initialization for '_BinTreeNode_3'
        updateValue(_BinTreeNode_3, "key", -147458);
        updateValue(_BinTreeNode_3, "left", null);
        updateValue(_BinTreeNode_3, "right", _BinTreeNode_3);
        updateValue(_BinTreeNode_3, "parent", null);
        updateValue(z_BinTreeNode_2, "left", _BinTreeNode_3);
        updateValue(z_BinTreeNode_2, "right", z_BinTreeNode_2);
        updateValue(z_BinTreeNode_2, "parent", null);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.BinTree", "removeTest", true);
        try {
            method.invoke(instance, new Object[]{tree_BinTree_1, z_BinTreeNode_2});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testremoveTest_9() {
        roops.core.objectsInstrumented.BinTree instance = null;
        roops.core.objectsInstrumented.BinTree tree_BinTree_1 = new roops.core.objectsInstrumented.BinTree();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_1 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode z_BinTreeNode_2 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_3 = new roops.core.objectsInstrumented.BinTreeNode();
        // Parameter Initialization
        // Fields Initialization for 'tree_BinTree_1'
        // Fields Initialization for '_BinTreeNode_1'
        updateValue(_BinTreeNode_1, "key", -2143158270);
        updateValue(_BinTreeNode_1, "left", null);
        updateValue(_BinTreeNode_1, "right", null);
        updateValue(_BinTreeNode_1, "parent", null);
        updateValue(tree_BinTree_1, "root", _BinTreeNode_1);
        // Fields Initialization for 'z_BinTreeNode_2'
        updateValue(z_BinTreeNode_2, "key", -2143158270);
        updateValue(z_BinTreeNode_2, "left", null);
        // Fields Initialization for '_BinTreeNode_3'
        updateValue(_BinTreeNode_3, "key", 2143158268);
        updateValue(_BinTreeNode_3, "left", _BinTreeNode_1);
        updateValue(_BinTreeNode_3, "right", _BinTreeNode_1);
        updateValue(_BinTreeNode_3, "parent", z_BinTreeNode_2);
        updateValue(z_BinTreeNode_2, "right", _BinTreeNode_3);
        updateValue(z_BinTreeNode_2, "parent", null);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.BinTree", "removeTest", true);
        try {
            method.invoke(instance, new Object[]{tree_BinTree_1, z_BinTreeNode_2});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testremoveTest_10() {
        roops.core.objectsInstrumented.BinTree instance = null;
        roops.core.objectsInstrumented.BinTreeNode z_BinTreeNode_1 = new roops.core.objectsInstrumented.BinTreeNode();
        // Parameter Initialization
        // Fields Initialization for 'z_BinTreeNode_1'
        updateValue(z_BinTreeNode_1, "key", -1961912915);
        updateValue(z_BinTreeNode_1, "left", z_BinTreeNode_1);
        updateValue(z_BinTreeNode_1, "right", z_BinTreeNode_1);
        updateValue(z_BinTreeNode_1, "parent", z_BinTreeNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.BinTree", "removeTest", true);
        try {
            method.invoke(instance, new Object[]{instance, z_BinTreeNode_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testremoveTest_11() {
        roops.core.objectsInstrumented.BinTree instance = null;
        roops.core.objectsInstrumented.BinTree tree_BinTree_1 = new roops.core.objectsInstrumented.BinTree();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_1 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode z_BinTreeNode_2 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_3 = new roops.core.objectsInstrumented.BinTreeNode();
        // Parameter Initialization
        // Fields Initialization for 'tree_BinTree_1'
        // Fields Initialization for '_BinTreeNode_1'
        updateValue(_BinTreeNode_1, "key", 153592522);
        updateValue(_BinTreeNode_1, "left", null);
        updateValue(_BinTreeNode_1, "right", null);
        updateValue(_BinTreeNode_1, "parent", null);
        updateValue(tree_BinTree_1, "root", _BinTreeNode_1);
        // Fields Initialization for 'z_BinTreeNode_2'
        updateValue(z_BinTreeNode_2, "key", -170115161);
        updateValue(z_BinTreeNode_2, "left", z_BinTreeNode_2);
        // Fields Initialization for '_BinTreeNode_3'
        updateValue(_BinTreeNode_3, "key", -170115161);
        updateValue(_BinTreeNode_3, "left", _BinTreeNode_3);
        updateValue(_BinTreeNode_3, "right", null);
        updateValue(_BinTreeNode_3, "parent", z_BinTreeNode_2);
        updateValue(z_BinTreeNode_2, "right", _BinTreeNode_3);
        updateValue(z_BinTreeNode_2, "parent", _BinTreeNode_3);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.BinTree", "removeTest", true);
        try {
            method.invoke(instance, new Object[]{tree_BinTree_1, z_BinTreeNode_2});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testremoveTest_12() {
        roops.core.objectsInstrumented.BinTree instance = null;
        roops.core.objectsInstrumented.BinTree tree_BinTree_1 = new roops.core.objectsInstrumented.BinTree();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_1 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode z_BinTreeNode_2 = new roops.core.objectsInstrumented.BinTreeNode();
        // Parameter Initialization
        // Fields Initialization for 'tree_BinTree_1'
        // Fields Initialization for '_BinTreeNode_1'
        updateValue(_BinTreeNode_1, "key", 1728884272);
        updateValue(_BinTreeNode_1, "left", null);
        updateValue(_BinTreeNode_1, "right", null);
        updateValue(_BinTreeNode_1, "parent", null);
        updateValue(tree_BinTree_1, "root", _BinTreeNode_1);
        // Fields Initialization for 'z_BinTreeNode_2'
        updateValue(z_BinTreeNode_2, "key", -1610019920);
        updateValue(z_BinTreeNode_2, "left", z_BinTreeNode_2);
        updateValue(z_BinTreeNode_2, "right", null);
        updateValue(z_BinTreeNode_2, "parent", _BinTreeNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.BinTree", "removeTest", true);
        try {
            method.invoke(instance, new Object[]{tree_BinTree_1, z_BinTreeNode_2});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testremoveTest_13() {
        roops.core.objectsInstrumented.BinTree instance = null;
        roops.core.objectsInstrumented.BinTree tree_BinTree_1 = new roops.core.objectsInstrumented.BinTree();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_1 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode z_BinTreeNode_2 = new roops.core.objectsInstrumented.BinTreeNode();
        // Parameter Initialization
        // Fields Initialization for 'tree_BinTree_1'
        // Fields Initialization for '_BinTreeNode_1'
        updateValue(_BinTreeNode_1, "key", 1067801835);
        updateValue(_BinTreeNode_1, "left", null);
        updateValue(_BinTreeNode_1, "right", null);
        updateValue(_BinTreeNode_1, "parent", null);
        updateValue(tree_BinTree_1, "root", _BinTreeNode_1);
        // Fields Initialization for 'z_BinTreeNode_2'
        updateValue(z_BinTreeNode_2, "key", -2141683636);
        updateValue(z_BinTreeNode_2, "left", null);
        updateValue(z_BinTreeNode_2, "right", _BinTreeNode_1);
        updateValue(z_BinTreeNode_2, "parent", _BinTreeNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.BinTree", "removeTest", true);
        try {
            method.invoke(instance, new Object[]{tree_BinTree_1, z_BinTreeNode_2});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testremoveTest_14() {
        roops.core.objectsInstrumented.BinTree instance = null;
        roops.core.objectsInstrumented.BinTree tree_BinTree_1 = new roops.core.objectsInstrumented.BinTree();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_1 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode z_BinTreeNode_2 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_3 = new roops.core.objectsInstrumented.BinTreeNode();
        // Parameter Initialization
        // Fields Initialization for 'tree_BinTree_1'
        // Fields Initialization for '_BinTreeNode_1'
        updateValue(_BinTreeNode_1, "key", 174181871);
        updateValue(_BinTreeNode_1, "left", null);
        updateValue(_BinTreeNode_1, "right", null);
        updateValue(_BinTreeNode_1, "parent", null);
        updateValue(tree_BinTree_1, "root", _BinTreeNode_1);
        // Fields Initialization for 'z_BinTreeNode_2'
        updateValue(z_BinTreeNode_2, "key", 174181871);
        updateValue(z_BinTreeNode_2, "left", z_BinTreeNode_2);
        // Fields Initialization for '_BinTreeNode_3'
        updateValue(_BinTreeNode_3, "key", -711052646);
        updateValue(_BinTreeNode_3, "left", z_BinTreeNode_2);
        updateValue(_BinTreeNode_3, "right", z_BinTreeNode_2);
        updateValue(_BinTreeNode_3, "parent", null);
        updateValue(z_BinTreeNode_2, "right", _BinTreeNode_3);
        updateValue(z_BinTreeNode_2, "parent", null);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.BinTree", "removeTest", true);
        try {
            method.invoke(instance, new Object[]{tree_BinTree_1, z_BinTreeNode_2});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testremoveTest_15() {
        roops.core.objectsInstrumented.BinTree instance = null;
        roops.core.objectsInstrumented.BinTree tree_BinTree_1 = new roops.core.objectsInstrumented.BinTree();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_1 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode z_BinTreeNode_2 = new roops.core.objectsInstrumented.BinTreeNode();
        // Parameter Initialization
        // Fields Initialization for 'tree_BinTree_1'
        // Fields Initialization for '_BinTreeNode_1'
        updateValue(_BinTreeNode_1, "key", 805580022);
        updateValue(_BinTreeNode_1, "left", null);
        updateValue(_BinTreeNode_1, "right", null);
        updateValue(_BinTreeNode_1, "parent", null);
        updateValue(tree_BinTree_1, "root", _BinTreeNode_1);
        // Fields Initialization for 'z_BinTreeNode_2'
        updateValue(z_BinTreeNode_2, "key", 1341903625);
        updateValue(z_BinTreeNode_2, "left", null);
        updateValue(z_BinTreeNode_2, "right", z_BinTreeNode_2);
        updateValue(z_BinTreeNode_2, "parent", null);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.BinTree", "removeTest", true);
        try {
            method.invoke(instance, new Object[]{tree_BinTree_1, z_BinTreeNode_2});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testremoveTest_16() {
        roops.core.objectsInstrumented.BinTree instance = null;
        roops.core.objectsInstrumented.BinTree tree_BinTree_1 = new roops.core.objectsInstrumented.BinTree();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_1 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode z_BinTreeNode_2 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_3 = new roops.core.objectsInstrumented.BinTreeNode();
        // Parameter Initialization
        // Fields Initialization for 'tree_BinTree_1'
        // Fields Initialization for '_BinTreeNode_1'
        updateValue(_BinTreeNode_1, "key", -230548848);
        updateValue(_BinTreeNode_1, "left", null);
        updateValue(_BinTreeNode_1, "right", null);
        updateValue(_BinTreeNode_1, "parent", null);
        updateValue(tree_BinTree_1, "root", _BinTreeNode_1);
        // Fields Initialization for 'z_BinTreeNode_2'
        updateValue(z_BinTreeNode_2, "key", 202818414);
        // Fields Initialization for '_BinTreeNode_3'
        updateValue(_BinTreeNode_3, "key", -206750575);
        updateValue(_BinTreeNode_3, "left", null);
        updateValue(_BinTreeNode_3, "right", _BinTreeNode_3);
        updateValue(_BinTreeNode_3, "parent", z_BinTreeNode_2);
        updateValue(z_BinTreeNode_2, "left", _BinTreeNode_3);
        updateValue(z_BinTreeNode_2, "right", z_BinTreeNode_2);
        updateValue(z_BinTreeNode_2, "parent", z_BinTreeNode_2);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.BinTree", "removeTest", true);
        try {
            method.invoke(instance, new Object[]{tree_BinTree_1, z_BinTreeNode_2});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testremoveTest_17() {
        roops.core.objectsInstrumented.BinTree instance = null;
        roops.core.objectsInstrumented.BinTree tree_BinTree_1 = new roops.core.objectsInstrumented.BinTree();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_1 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode z_BinTreeNode_2 = new roops.core.objectsInstrumented.BinTreeNode();
        // Parameter Initialization
        // Fields Initialization for 'tree_BinTree_1'
        // Fields Initialization for '_BinTreeNode_1'
        updateValue(_BinTreeNode_1, "key", 2079059967);
        updateValue(_BinTreeNode_1, "left", null);
        updateValue(_BinTreeNode_1, "right", null);
        updateValue(_BinTreeNode_1, "parent", null);
        updateValue(tree_BinTree_1, "root", _BinTreeNode_1);
        // Fields Initialization for 'z_BinTreeNode_2'
        updateValue(z_BinTreeNode_2, "key", 68423681);
        updateValue(z_BinTreeNode_2, "left", z_BinTreeNode_2);
        updateValue(z_BinTreeNode_2, "right", z_BinTreeNode_2);
        updateValue(z_BinTreeNode_2, "parent", z_BinTreeNode_2);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.BinTree", "removeTest", true);
        try {
            method.invoke(instance, new Object[]{tree_BinTree_1, z_BinTreeNode_2});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testremoveTest_18() {
        roops.core.objectsInstrumented.BinTree instance = null;
        roops.core.objectsInstrumented.BinTree tree_BinTree_1 = new roops.core.objectsInstrumented.BinTree();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_1 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode z_BinTreeNode_2 = new roops.core.objectsInstrumented.BinTreeNode();
        // Parameter Initialization
        // Fields Initialization for 'tree_BinTree_1'
        // Fields Initialization for '_BinTreeNode_1'
        updateValue(_BinTreeNode_1, "key", -732473998);
        updateValue(_BinTreeNode_1, "left", null);
        updateValue(_BinTreeNode_1, "right", null);
        updateValue(_BinTreeNode_1, "parent", null);
        updateValue(tree_BinTree_1, "root", _BinTreeNode_1);
        // Fields Initialization for 'z_BinTreeNode_2'
        updateValue(z_BinTreeNode_2, "key", 732473996);
        updateValue(z_BinTreeNode_2, "left", z_BinTreeNode_2);
        updateValue(z_BinTreeNode_2, "right", z_BinTreeNode_2);
        updateValue(z_BinTreeNode_2, "parent", _BinTreeNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.BinTree", "removeTest", true);
        try {
            method.invoke(instance, new Object[]{tree_BinTree_1, z_BinTreeNode_2});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testremoveTest_19() {
        roops.core.objectsInstrumented.BinTree instance = null;
        roops.core.objectsInstrumented.BinTree tree_BinTree_1 = new roops.core.objectsInstrumented.BinTree();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_1 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode z_BinTreeNode_2 = new roops.core.objectsInstrumented.BinTreeNode();
        // Parameter Initialization
        // Fields Initialization for 'tree_BinTree_1'
        // Fields Initialization for '_BinTreeNode_1'
        updateValue(_BinTreeNode_1, "key", 1457691534);
        updateValue(_BinTreeNode_1, "left", null);
        updateValue(_BinTreeNode_1, "right", null);
        updateValue(_BinTreeNode_1, "parent", null);
        updateValue(tree_BinTree_1, "root", _BinTreeNode_1);
        // Fields Initialization for 'z_BinTreeNode_2'
        updateValue(z_BinTreeNode_2, "key", -1457691535);
        updateValue(z_BinTreeNode_2, "left", null);
        updateValue(z_BinTreeNode_2, "right", null);
        updateValue(z_BinTreeNode_2, "parent", _BinTreeNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.BinTree", "removeTest", true);
        try {
            method.invoke(instance, new Object[]{tree_BinTree_1, z_BinTreeNode_2});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testremoveTest_20() {
        roops.core.objectsInstrumented.BinTree instance = null;
        roops.core.objectsInstrumented.BinTree tree_BinTree_1 = new roops.core.objectsInstrumented.BinTree();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_1 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode z_BinTreeNode_2 = new roops.core.objectsInstrumented.BinTreeNode();
        // Parameter Initialization
        // Fields Initialization for 'tree_BinTree_1'
        // Fields Initialization for '_BinTreeNode_1'
        updateValue(_BinTreeNode_1, "key", -1931302232);
        updateValue(_BinTreeNode_1, "left", null);
        updateValue(_BinTreeNode_1, "right", null);
        updateValue(_BinTreeNode_1, "parent", null);
        updateValue(tree_BinTree_1, "root", _BinTreeNode_1);
        // Fields Initialization for 'z_BinTreeNode_2'
        updateValue(z_BinTreeNode_2, "key", -1931302232);
        updateValue(z_BinTreeNode_2, "left", null);
        updateValue(z_BinTreeNode_2, "right", null);
        updateValue(z_BinTreeNode_2, "parent", null);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.BinTree", "removeTest", true);
        try {
            method.invoke(instance, new Object[]{tree_BinTree_1, z_BinTreeNode_2});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testremoveTest_21() {
        roops.core.objectsInstrumented.BinTree instance = null;
        roops.core.objectsInstrumented.BinTree tree_BinTree_1 = new roops.core.objectsInstrumented.BinTree();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_1 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode z_BinTreeNode_2 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_3 = new roops.core.objectsInstrumented.BinTreeNode();
        // Parameter Initialization
        // Fields Initialization for 'tree_BinTree_1'
        // Fields Initialization for '_BinTreeNode_1'
        updateValue(_BinTreeNode_1, "key", 832784040);
        updateValue(_BinTreeNode_1, "left", null);
        updateValue(_BinTreeNode_1, "right", null);
        updateValue(_BinTreeNode_1, "parent", null);
        updateValue(tree_BinTree_1, "root", _BinTreeNode_1);
        // Fields Initialization for 'z_BinTreeNode_2'
        updateValue(z_BinTreeNode_2, "key", 240957782);
        // Fields Initialization for '_BinTreeNode_3'
        updateValue(_BinTreeNode_3, "key", 832784040);
        updateValue(_BinTreeNode_3, "left", _BinTreeNode_1);
        updateValue(_BinTreeNode_3, "right", null);
        updateValue(_BinTreeNode_3, "parent", z_BinTreeNode_2);
        updateValue(z_BinTreeNode_2, "left", _BinTreeNode_3);
        updateValue(z_BinTreeNode_2, "right", null);
        updateValue(z_BinTreeNode_2, "parent", null);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.BinTree", "removeTest", true);
        try {
            method.invoke(instance, new Object[]{tree_BinTree_1, z_BinTreeNode_2});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testremoveTest_22() {
        roops.core.objectsInstrumented.BinTree instance = null;
        roops.core.objectsInstrumented.BinTree tree_BinTree_1 = new roops.core.objectsInstrumented.BinTree();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_1 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode z_BinTreeNode_2 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_3 = new roops.core.objectsInstrumented.BinTreeNode();
        // Parameter Initialization
        // Fields Initialization for 'tree_BinTree_1'
        // Fields Initialization for '_BinTreeNode_1'
        updateValue(_BinTreeNode_1, "key", -148974255);
        updateValue(_BinTreeNode_1, "left", null);
        updateValue(_BinTreeNode_1, "right", null);
        updateValue(_BinTreeNode_1, "parent", null);
        updateValue(tree_BinTree_1, "root", _BinTreeNode_1);
        // Fields Initialization for 'z_BinTreeNode_2'
        updateValue(z_BinTreeNode_2, "key", 148974254);
        updateValue(z_BinTreeNode_2, "left", null);
        updateValue(z_BinTreeNode_2, "right", _BinTreeNode_1);
        // Fields Initialization for '_BinTreeNode_3'
        updateValue(_BinTreeNode_3, "key", 148974254);
        updateValue(_BinTreeNode_3, "left", z_BinTreeNode_2);
        updateValue(_BinTreeNode_3, "right", _BinTreeNode_3);
        updateValue(_BinTreeNode_3, "parent", null);
        updateValue(z_BinTreeNode_2, "parent", _BinTreeNode_3);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.BinTree", "removeTest", true);
        try {
            method.invoke(instance, new Object[]{tree_BinTree_1, z_BinTreeNode_2});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testremoveTest_23() {
        roops.core.objectsInstrumented.BinTree instance = null;
        roops.core.objectsInstrumented.BinTree tree_BinTree_1 = new roops.core.objectsInstrumented.BinTree();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_1 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode z_BinTreeNode_2 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_3 = new roops.core.objectsInstrumented.BinTreeNode();
        // Parameter Initialization
        // Fields Initialization for 'tree_BinTree_1'
        // Fields Initialization for '_BinTreeNode_1'
        updateValue(_BinTreeNode_1, "key", 682527656);
        updateValue(_BinTreeNode_1, "left", null);
        updateValue(_BinTreeNode_1, "right", null);
        updateValue(_BinTreeNode_1, "parent", null);
        updateValue(tree_BinTree_1, "root", _BinTreeNode_1);
        // Fields Initialization for 'z_BinTreeNode_2'
        updateValue(z_BinTreeNode_2, "key", 682527656);
        updateValue(z_BinTreeNode_2, "left", null);
        updateValue(z_BinTreeNode_2, "right", null);
        // Fields Initialization for '_BinTreeNode_3'
        updateValue(_BinTreeNode_3, "key", 682527656);
        updateValue(_BinTreeNode_3, "left", z_BinTreeNode_2);
        updateValue(_BinTreeNode_3, "right", null);
        updateValue(_BinTreeNode_3, "parent", null);
        updateValue(z_BinTreeNode_2, "parent", _BinTreeNode_3);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.BinTree", "removeTest", true);
        try {
            method.invoke(instance, new Object[]{tree_BinTree_1, z_BinTreeNode_2});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testremoveTest_24() {
        roops.core.objectsInstrumented.BinTree instance = null;
        roops.core.objectsInstrumented.BinTree tree_BinTree_1 = new roops.core.objectsInstrumented.BinTree();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_1 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode z_BinTreeNode_2 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_3 = new roops.core.objectsInstrumented.BinTreeNode();
        // Parameter Initialization
        // Fields Initialization for 'tree_BinTree_1'
        // Fields Initialization for '_BinTreeNode_1'
        updateValue(_BinTreeNode_1, "key", -682405803);
        updateValue(_BinTreeNode_1, "left", null);
        updateValue(_BinTreeNode_1, "right", null);
        updateValue(_BinTreeNode_1, "parent", null);
        updateValue(tree_BinTree_1, "root", _BinTreeNode_1);
        // Fields Initialization for 'z_BinTreeNode_2'
        updateValue(z_BinTreeNode_2, "key", 682404778);
        updateValue(z_BinTreeNode_2, "left", _BinTreeNode_1);
        updateValue(z_BinTreeNode_2, "right", null);
        // Fields Initialization for '_BinTreeNode_3'
        updateValue(_BinTreeNode_3, "key", 682404778);
        updateValue(_BinTreeNode_3, "left", z_BinTreeNode_2);
        updateValue(_BinTreeNode_3, "right", z_BinTreeNode_2);
        updateValue(_BinTreeNode_3, "parent", null);
        updateValue(z_BinTreeNode_2, "parent", _BinTreeNode_3);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.BinTree", "removeTest", true);
        try {
            method.invoke(instance, new Object[]{tree_BinTree_1, z_BinTreeNode_2});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testremoveTest_25() {
        roops.core.objectsInstrumented.BinTree instance = null;
        roops.core.objectsInstrumented.BinTree tree_BinTree_1 = new roops.core.objectsInstrumented.BinTree();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_1 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode z_BinTreeNode_2 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_3 = new roops.core.objectsInstrumented.BinTreeNode();
        // Parameter Initialization
        // Fields Initialization for 'tree_BinTree_1'
        // Fields Initialization for '_BinTreeNode_1'
        updateValue(_BinTreeNode_1, "key", -509481422);
        updateValue(_BinTreeNode_1, "left", null);
        updateValue(_BinTreeNode_1, "right", null);
        updateValue(_BinTreeNode_1, "parent", null);
        updateValue(tree_BinTree_1, "root", _BinTreeNode_1);
        // Fields Initialization for 'z_BinTreeNode_2'
        updateValue(z_BinTreeNode_2, "key", 509505989);
        // Fields Initialization for '_BinTreeNode_3'
        updateValue(_BinTreeNode_3, "key", -509481422);
        updateValue(_BinTreeNode_3, "left", z_BinTreeNode_2);
        updateValue(_BinTreeNode_3, "right", _BinTreeNode_1);
        updateValue(_BinTreeNode_3, "parent", null);
        updateValue(z_BinTreeNode_2, "left", _BinTreeNode_3);
        updateValue(z_BinTreeNode_2, "right", _BinTreeNode_3);
        updateValue(z_BinTreeNode_2, "parent", null);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.BinTree", "removeTest", true);
        try {
            method.invoke(instance, new Object[]{tree_BinTree_1, z_BinTreeNode_2});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testremoveTest_26() {
        roops.core.objectsInstrumented.BinTree instance = null;
        roops.core.objectsInstrumented.BinTree tree_BinTree_1 = new roops.core.objectsInstrumented.BinTree();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_1 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode z_BinTreeNode_2 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_3 = new roops.core.objectsInstrumented.BinTreeNode();
        // Parameter Initialization
        // Fields Initialization for 'tree_BinTree_1'
        // Fields Initialization for '_BinTreeNode_1'
        updateValue(_BinTreeNode_1, "key", -1021304520);
        updateValue(_BinTreeNode_1, "left", null);
        updateValue(_BinTreeNode_1, "right", null);
        updateValue(_BinTreeNode_1, "parent", null);
        updateValue(tree_BinTree_1, "root", _BinTreeNode_1);
        // Fields Initialization for 'z_BinTreeNode_2'
        updateValue(z_BinTreeNode_2, "key", 1021304391);
        // Fields Initialization for '_BinTreeNode_3'
        updateValue(_BinTreeNode_3, "key", -1021304520);
        updateValue(_BinTreeNode_3, "left", z_BinTreeNode_2);
        updateValue(_BinTreeNode_3, "right", z_BinTreeNode_2);
        updateValue(_BinTreeNode_3, "parent", z_BinTreeNode_2);
        updateValue(z_BinTreeNode_2, "left", _BinTreeNode_3);
        updateValue(z_BinTreeNode_2, "right", _BinTreeNode_3);
        updateValue(z_BinTreeNode_2, "parent", _BinTreeNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.BinTree", "removeTest", true);
        try {
            method.invoke(instance, new Object[]{tree_BinTree_1, z_BinTreeNode_2});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testremoveTest_27() {
        roops.core.objectsInstrumented.BinTree instance = null;
        roops.core.objectsInstrumented.BinTree tree_BinTree_1 = new roops.core.objectsInstrumented.BinTree();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_1 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode z_BinTreeNode_2 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_3 = new roops.core.objectsInstrumented.BinTreeNode();
        // Parameter Initialization
        // Fields Initialization for 'tree_BinTree_1'
        // Fields Initialization for '_BinTreeNode_1'
        updateValue(_BinTreeNode_1, "key", -1876682152);
        updateValue(_BinTreeNode_1, "left", null);
        updateValue(_BinTreeNode_1, "right", null);
        updateValue(_BinTreeNode_1, "parent", null);
        updateValue(tree_BinTree_1, "root", _BinTreeNode_1);
        // Fields Initialization for 'z_BinTreeNode_2'
        updateValue(z_BinTreeNode_2, "key", 1876682151);
        updateValue(z_BinTreeNode_2, "left", _BinTreeNode_1);
        // Fields Initialization for '_BinTreeNode_3'
        updateValue(_BinTreeNode_3, "key", -1876682152);
        updateValue(_BinTreeNode_3, "left", null);
        updateValue(_BinTreeNode_3, "right", null);
        updateValue(_BinTreeNode_3, "parent", z_BinTreeNode_2);
        updateValue(z_BinTreeNode_2, "right", _BinTreeNode_3);
        updateValue(z_BinTreeNode_2, "parent", null);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.BinTree", "removeTest", true);
        try {
            method.invoke(instance, new Object[]{tree_BinTree_1, z_BinTreeNode_2});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testremoveTest_28() {
        roops.core.objectsInstrumented.BinTree instance = null;
        roops.core.objectsInstrumented.BinTree tree_BinTree_1 = new roops.core.objectsInstrumented.BinTree();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_1 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode z_BinTreeNode_2 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_3 = new roops.core.objectsInstrumented.BinTreeNode();
        // Parameter Initialization
        // Fields Initialization for 'tree_BinTree_1'
        // Fields Initialization for '_BinTreeNode_1'
        updateValue(_BinTreeNode_1, "key", -827804680);
        updateValue(_BinTreeNode_1, "left", null);
        updateValue(_BinTreeNode_1, "right", null);
        updateValue(_BinTreeNode_1, "parent", null);
        updateValue(tree_BinTree_1, "root", _BinTreeNode_1);
        // Fields Initialization for 'z_BinTreeNode_2'
        updateValue(z_BinTreeNode_2, "key", -827804680);
        updateValue(z_BinTreeNode_2, "left", _BinTreeNode_1);
        // Fields Initialization for '_BinTreeNode_3'
        updateValue(_BinTreeNode_3, "key", -827804680);
        updateValue(_BinTreeNode_3, "left", null);
        updateValue(_BinTreeNode_3, "right", null);
        updateValue(_BinTreeNode_3, "parent", null);
        updateValue(z_BinTreeNode_2, "right", _BinTreeNode_3);
        updateValue(z_BinTreeNode_2, "parent", null);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.BinTree", "removeTest", true);
        try {
            method.invoke(instance, new Object[]{tree_BinTree_1, z_BinTreeNode_2});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testremoveTest_29() {
        roops.core.objectsInstrumented.BinTree instance = null;
        roops.core.objectsInstrumented.BinTree tree_BinTree_1 = new roops.core.objectsInstrumented.BinTree();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_1 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode z_BinTreeNode_2 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_3 = new roops.core.objectsInstrumented.BinTreeNode();
        // Parameter Initialization
        // Fields Initialization for 'tree_BinTree_1'
        // Fields Initialization for '_BinTreeNode_1'
        updateValue(_BinTreeNode_1, "key", -2136839632);
        updateValue(_BinTreeNode_1, "left", null);
        updateValue(_BinTreeNode_1, "right", null);
        updateValue(_BinTreeNode_1, "parent", null);
        updateValue(tree_BinTree_1, "root", _BinTreeNode_1);
        // Fields Initialization for 'z_BinTreeNode_2'
        updateValue(z_BinTreeNode_2, "key", 2136839630);
        updateValue(z_BinTreeNode_2, "left", _BinTreeNode_1);
        // Fields Initialization for '_BinTreeNode_3'
        updateValue(_BinTreeNode_3, "key", -2136839632);
        updateValue(_BinTreeNode_3, "left", null);
        updateValue(_BinTreeNode_3, "right", z_BinTreeNode_2);
        updateValue(_BinTreeNode_3, "parent", null);
        updateValue(z_BinTreeNode_2, "right", _BinTreeNode_3);
        updateValue(z_BinTreeNode_2, "parent", null);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.BinTree", "removeTest", true);
        try {
            method.invoke(instance, new Object[]{tree_BinTree_1, z_BinTreeNode_2});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testremoveTest_30() {
        roops.core.objectsInstrumented.BinTree instance = null;
        roops.core.objectsInstrumented.BinTree tree_BinTree_1 = new roops.core.objectsInstrumented.BinTree();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_1 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_2 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode z_BinTreeNode_3 = new roops.core.objectsInstrumented.BinTreeNode();
        // Parameter Initialization
        // Fields Initialization for 'tree_BinTree_1'
        // Fields Initialization for '_BinTreeNode_1'
        updateValue(_BinTreeNode_1, "key", 321961233);
        // Fields Initialization for '_BinTreeNode_2'
        updateValue(_BinTreeNode_2, "key", -590396690);
        updateValue(_BinTreeNode_2, "left", null);
        updateValue(_BinTreeNode_2, "right", null);
        updateValue(_BinTreeNode_2, "parent", _BinTreeNode_1);
        updateValue(_BinTreeNode_1, "left", _BinTreeNode_2);
        updateValue(_BinTreeNode_1, "right", null);
        updateValue(_BinTreeNode_1, "parent", null);
        updateValue(tree_BinTree_1, "root", _BinTreeNode_1);
        // Fields Initialization for 'z_BinTreeNode_3'
        updateValue(z_BinTreeNode_3, "key", -590396690);
        updateValue(z_BinTreeNode_3, "left", _BinTreeNode_1);
        updateValue(z_BinTreeNode_3, "right", _BinTreeNode_2);
        updateValue(z_BinTreeNode_3, "parent", _BinTreeNode_2);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.BinTree", "removeTest", true);
        try {
            method.invoke(instance, new Object[]{tree_BinTree_1, z_BinTreeNode_3});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testremoveTest_31() {
        roops.core.objectsInstrumented.BinTree instance = null;
        roops.core.objectsInstrumented.BinTree tree_BinTree_1 = new roops.core.objectsInstrumented.BinTree();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_1 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode z_BinTreeNode_2 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_3 = new roops.core.objectsInstrumented.BinTreeNode();
        // Parameter Initialization
        // Fields Initialization for 'tree_BinTree_1'
        // Fields Initialization for '_BinTreeNode_1'
        updateValue(_BinTreeNode_1, "key", -2080374784);
        updateValue(_BinTreeNode_1, "left", null);
        updateValue(_BinTreeNode_1, "right", null);
        updateValue(_BinTreeNode_1, "parent", null);
        updateValue(tree_BinTree_1, "root", _BinTreeNode_1);
        // Fields Initialization for 'z_BinTreeNode_2'
        updateValue(z_BinTreeNode_2, "key", 2080374782);
        updateValue(z_BinTreeNode_2, "left", _BinTreeNode_1);
        // Fields Initialization for '_BinTreeNode_3'
        updateValue(_BinTreeNode_3, "key", -2080374784);
        updateValue(_BinTreeNode_3, "left", null);
        updateValue(_BinTreeNode_3, "right", _BinTreeNode_1);
        updateValue(_BinTreeNode_3, "parent", z_BinTreeNode_2);
        updateValue(z_BinTreeNode_2, "right", _BinTreeNode_3);
        updateValue(z_BinTreeNode_2, "parent", null);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.BinTree", "removeTest", true);
        try {
            method.invoke(instance, new Object[]{tree_BinTree_1, z_BinTreeNode_2});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testremoveTest_32() {
        roops.core.objectsInstrumented.BinTree instance = null;
        roops.core.objectsInstrumented.BinTree tree_BinTree_1 = new roops.core.objectsInstrumented.BinTree();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_1 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode z_BinTreeNode_2 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_3 = new roops.core.objectsInstrumented.BinTreeNode();
        // Parameter Initialization
        // Fields Initialization for 'tree_BinTree_1'
        // Fields Initialization for '_BinTreeNode_1'
        updateValue(_BinTreeNode_1, "key", -683551157);
        updateValue(_BinTreeNode_1, "left", null);
        updateValue(_BinTreeNode_1, "right", null);
        updateValue(_BinTreeNode_1, "parent", null);
        updateValue(tree_BinTree_1, "root", _BinTreeNode_1);
        // Fields Initialization for 'z_BinTreeNode_2'
        updateValue(z_BinTreeNode_2, "key", 683551208);
        // Fields Initialization for '_BinTreeNode_3'
        updateValue(_BinTreeNode_3, "key", 683551208);
        updateValue(_BinTreeNode_3, "left", null);
        updateValue(_BinTreeNode_3, "right", z_BinTreeNode_2);
        updateValue(_BinTreeNode_3, "parent", z_BinTreeNode_2);
        updateValue(z_BinTreeNode_2, "left", _BinTreeNode_3);
        updateValue(z_BinTreeNode_2, "right", _BinTreeNode_3);
        updateValue(z_BinTreeNode_2, "parent", null);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.BinTree", "removeTest", true);
        try {
            method.invoke(instance, new Object[]{tree_BinTree_1, z_BinTreeNode_2});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testremoveTest_33() {
        roops.core.objectsInstrumented.BinTree instance = null;
        roops.core.objectsInstrumented.BinTree tree_BinTree_1 = new roops.core.objectsInstrumented.BinTree();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_1 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode z_BinTreeNode_2 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_3 = new roops.core.objectsInstrumented.BinTreeNode();
        // Parameter Initialization
        // Fields Initialization for 'tree_BinTree_1'
        // Fields Initialization for '_BinTreeNode_1'
        updateValue(_BinTreeNode_1, "key", -2136847812);
        updateValue(_BinTreeNode_1, "left", null);
        updateValue(_BinTreeNode_1, "right", null);
        updateValue(_BinTreeNode_1, "parent", null);
        updateValue(tree_BinTree_1, "root", _BinTreeNode_1);
        // Fields Initialization for 'z_BinTreeNode_2'
        updateValue(z_BinTreeNode_2, "key", 2136847819);
        // Fields Initialization for '_BinTreeNode_3'
        updateValue(_BinTreeNode_3, "key", -2136847812);
        updateValue(_BinTreeNode_3, "left", null);
        updateValue(_BinTreeNode_3, "right", null);
        updateValue(_BinTreeNode_3, "parent", null);
        updateValue(z_BinTreeNode_2, "left", _BinTreeNode_3);
        updateValue(z_BinTreeNode_2, "right", z_BinTreeNode_2);
        updateValue(z_BinTreeNode_2, "parent", null);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.BinTree", "removeTest", true);
        try {
            method.invoke(instance, new Object[]{tree_BinTree_1, z_BinTreeNode_2});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testremoveTest_34() {
        roops.core.objectsInstrumented.BinTree instance = null;
        roops.core.objectsInstrumented.BinTree tree_BinTree_1 = new roops.core.objectsInstrumented.BinTree();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_1 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode z_BinTreeNode_2 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_3 = new roops.core.objectsInstrumented.BinTreeNode();
        // Parameter Initialization
        // Fields Initialization for 'tree_BinTree_1'
        // Fields Initialization for '_BinTreeNode_1'
        updateValue(_BinTreeNode_1, "key", -2136839664);
        updateValue(_BinTreeNode_1, "left", null);
        updateValue(_BinTreeNode_1, "right", null);
        updateValue(_BinTreeNode_1, "parent", null);
        updateValue(tree_BinTree_1, "root", _BinTreeNode_1);
        // Fields Initialization for 'z_BinTreeNode_2'
        updateValue(z_BinTreeNode_2, "key", 2136839662);
        // Fields Initialization for '_BinTreeNode_3'
        updateValue(_BinTreeNode_3, "key", -2136839664);
        updateValue(_BinTreeNode_3, "left", null);
        updateValue(_BinTreeNode_3, "right", z_BinTreeNode_2);
        updateValue(_BinTreeNode_3, "parent", null);
        updateValue(z_BinTreeNode_2, "left", _BinTreeNode_3);
        updateValue(z_BinTreeNode_2, "right", z_BinTreeNode_2);
        updateValue(z_BinTreeNode_2, "parent", null);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.BinTree", "removeTest", true);
        try {
            method.invoke(instance, new Object[]{tree_BinTree_1, z_BinTreeNode_2});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testremoveTest_35() {
        roops.core.objectsInstrumented.BinTree instance = null;
        roops.core.objectsInstrumented.BinTree tree_BinTree_1 = new roops.core.objectsInstrumented.BinTree();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_1 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode z_BinTreeNode_2 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_3 = new roops.core.objectsInstrumented.BinTreeNode();
        // Parameter Initialization
        // Fields Initialization for 'tree_BinTree_1'
        // Fields Initialization for '_BinTreeNode_1'
        updateValue(_BinTreeNode_1, "key", -2136594414);
        updateValue(_BinTreeNode_1, "left", null);
        updateValue(_BinTreeNode_1, "right", null);
        updateValue(_BinTreeNode_1, "parent", null);
        updateValue(tree_BinTree_1, "root", _BinTreeNode_1);
        // Fields Initialization for 'z_BinTreeNode_2'
        updateValue(z_BinTreeNode_2, "key", 2136594413);
        // Fields Initialization for '_BinTreeNode_3'
        updateValue(_BinTreeNode_3, "key", -2136594414);
        updateValue(_BinTreeNode_3, "left", null);
        updateValue(_BinTreeNode_3, "right", null);
        updateValue(_BinTreeNode_3, "parent", z_BinTreeNode_2);
        updateValue(z_BinTreeNode_2, "left", _BinTreeNode_3);
        updateValue(z_BinTreeNode_2, "right", z_BinTreeNode_2);
        updateValue(z_BinTreeNode_2, "parent", null);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.BinTree", "removeTest", true);
        try {
            method.invoke(instance, new Object[]{tree_BinTree_1, z_BinTreeNode_2});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testremoveTest_36() {
        roops.core.objectsInstrumented.BinTree instance = null;
        roops.core.objectsInstrumented.BinTree tree_BinTree_1 = new roops.core.objectsInstrumented.BinTree();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_1 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode z_BinTreeNode_2 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_3 = new roops.core.objectsInstrumented.BinTreeNode();
        // Parameter Initialization
        // Fields Initialization for 'tree_BinTree_1'
        // Fields Initialization for '_BinTreeNode_1'
        updateValue(_BinTreeNode_1, "key", 682142648);
        updateValue(_BinTreeNode_1, "left", null);
        updateValue(_BinTreeNode_1, "right", null);
        updateValue(_BinTreeNode_1, "parent", null);
        updateValue(tree_BinTree_1, "root", _BinTreeNode_1);
        // Fields Initialization for 'z_BinTreeNode_2'
        updateValue(z_BinTreeNode_2, "key", 682142648);
        // Fields Initialization for '_BinTreeNode_3'
        updateValue(_BinTreeNode_3, "key", 682142648);
        updateValue(_BinTreeNode_3, "left", null);
        updateValue(_BinTreeNode_3, "right", null);
        updateValue(_BinTreeNode_3, "parent", _BinTreeNode_3);
        updateValue(z_BinTreeNode_2, "left", _BinTreeNode_3);
        updateValue(z_BinTreeNode_2, "right", z_BinTreeNode_2);
        updateValue(z_BinTreeNode_2, "parent", null);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.BinTree", "removeTest", true);
        try {
            method.invoke(instance, new Object[]{tree_BinTree_1, z_BinTreeNode_2});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testremoveTest_37() {
        roops.core.objectsInstrumented.BinTree instance = null;
        roops.core.objectsInstrumented.BinTree tree_BinTree_1 = new roops.core.objectsInstrumented.BinTree();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_1 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode z_BinTreeNode_2 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_3 = new roops.core.objectsInstrumented.BinTreeNode();
        // Parameter Initialization
        // Fields Initialization for 'tree_BinTree_1'
        // Fields Initialization for '_BinTreeNode_1'
        updateValue(_BinTreeNode_1, "key", -2147483648);
        updateValue(_BinTreeNode_1, "left", null);
        updateValue(_BinTreeNode_1, "right", null);
        updateValue(_BinTreeNode_1, "parent", null);
        updateValue(tree_BinTree_1, "root", _BinTreeNode_1);
        // Fields Initialization for 'z_BinTreeNode_2'
        updateValue(z_BinTreeNode_2, "key", 2147483646);
        // Fields Initialization for '_BinTreeNode_3'
        updateValue(_BinTreeNode_3, "key", -2147483648);
        updateValue(_BinTreeNode_3, "left", null);
        updateValue(_BinTreeNode_3, "right", _BinTreeNode_1);
        updateValue(_BinTreeNode_3, "parent", _BinTreeNode_3);
        updateValue(z_BinTreeNode_2, "left", _BinTreeNode_3);
        updateValue(z_BinTreeNode_2, "right", z_BinTreeNode_2);
        updateValue(z_BinTreeNode_2, "parent", null);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.BinTree", "removeTest", true);
        try {
            method.invoke(instance, new Object[]{tree_BinTree_1, z_BinTreeNode_2});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testremoveTest_38() {
        roops.core.objectsInstrumented.BinTree instance = null;
        roops.core.objectsInstrumented.BinTree tree_BinTree_1 = new roops.core.objectsInstrumented.BinTree();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_1 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode z_BinTreeNode_2 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_3 = new roops.core.objectsInstrumented.BinTreeNode();
        // Parameter Initialization
        // Fields Initialization for 'tree_BinTree_1'
        // Fields Initialization for '_BinTreeNode_1'
        updateValue(_BinTreeNode_1, "key", 784341555);
        updateValue(_BinTreeNode_1, "left", null);
        updateValue(_BinTreeNode_1, "right", null);
        updateValue(_BinTreeNode_1, "parent", null);
        updateValue(tree_BinTree_1, "root", _BinTreeNode_1);
        // Fields Initialization for 'z_BinTreeNode_2'
        updateValue(z_BinTreeNode_2, "key", -784337459);
        updateValue(z_BinTreeNode_2, "left", _BinTreeNode_1);
        // Fields Initialization for '_BinTreeNode_3'
        updateValue(_BinTreeNode_3, "key", -784337459);
        updateValue(_BinTreeNode_3, "left", z_BinTreeNode_2);
        updateValue(_BinTreeNode_3, "right", null);
        updateValue(_BinTreeNode_3, "parent", null);
        updateValue(z_BinTreeNode_2, "right", _BinTreeNode_3);
        updateValue(z_BinTreeNode_2, "parent", null);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.BinTree", "removeTest", true);
        try {
            method.invoke(instance, new Object[]{tree_BinTree_1, z_BinTreeNode_2});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testremoveTest_39() {
        roops.core.objectsInstrumented.BinTree instance = null;
        roops.core.objectsInstrumented.BinTree tree_BinTree_1 = new roops.core.objectsInstrumented.BinTree();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_1 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_2 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode z_BinTreeNode_3 = new roops.core.objectsInstrumented.BinTreeNode();
        // Parameter Initialization
        // Fields Initialization for 'tree_BinTree_1'
        // Fields Initialization for '_BinTreeNode_1'
        updateValue(_BinTreeNode_1, "key", 3270965);
        // Fields Initialization for '_BinTreeNode_2'
        updateValue(_BinTreeNode_2, "key", -3270966);
        updateValue(_BinTreeNode_2, "left", null);
        updateValue(_BinTreeNode_2, "right", null);
        updateValue(_BinTreeNode_2, "parent", _BinTreeNode_1);
        updateValue(_BinTreeNode_1, "left", _BinTreeNode_2);
        updateValue(_BinTreeNode_1, "right", null);
        updateValue(_BinTreeNode_1, "parent", null);
        updateValue(tree_BinTree_1, "root", _BinTreeNode_1);
        // Fields Initialization for 'z_BinTreeNode_3'
        updateValue(z_BinTreeNode_3, "key", 3270965);
        updateValue(z_BinTreeNode_3, "left", _BinTreeNode_1);
        updateValue(z_BinTreeNode_3, "right", z_BinTreeNode_3);
        updateValue(z_BinTreeNode_3, "parent", z_BinTreeNode_3);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.BinTree", "removeTest", true);
        try {
            method.invoke(instance, new Object[]{tree_BinTree_1, z_BinTreeNode_3});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testremoveTest_40() {
        roops.core.objectsInstrumented.BinTree instance = null;
        roops.core.objectsInstrumented.BinTree tree_BinTree_1 = new roops.core.objectsInstrumented.BinTree();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_1 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode z_BinTreeNode_2 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_3 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_4 = new roops.core.objectsInstrumented.BinTreeNode();
        // Parameter Initialization
        // Fields Initialization for 'tree_BinTree_1'
        // Fields Initialization for '_BinTreeNode_1'
        updateValue(_BinTreeNode_1, "key", 2141138674);
        updateValue(_BinTreeNode_1, "left", null);
        updateValue(_BinTreeNode_1, "right", null);
        updateValue(_BinTreeNode_1, "parent", null);
        updateValue(tree_BinTree_1, "root", _BinTreeNode_1);
        // Fields Initialization for 'z_BinTreeNode_2'
        updateValue(z_BinTreeNode_2, "key", 274780426);
        // Fields Initialization for '_BinTreeNode_3'
        updateValue(_BinTreeNode_3, "key", 2141138674);
        // Fields Initialization for '_BinTreeNode_4'
        updateValue(_BinTreeNode_4, "key", 2141138674);
        updateValue(_BinTreeNode_4, "left", null);
        updateValue(_BinTreeNode_4, "right", _BinTreeNode_1);
        updateValue(_BinTreeNode_4, "parent", null);
        updateValue(_BinTreeNode_3, "left", _BinTreeNode_4);
        updateValue(_BinTreeNode_3, "right", null);
        updateValue(_BinTreeNode_3, "parent", null);
        updateValue(z_BinTreeNode_2, "left", _BinTreeNode_3);
        updateValue(z_BinTreeNode_2, "right", z_BinTreeNode_2);
        updateValue(z_BinTreeNode_2, "parent", null);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.BinTree", "removeTest", true);
        try {
            method.invoke(instance, new Object[]{tree_BinTree_1, z_BinTreeNode_2});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testremoveTest_41() {
        roops.core.objectsInstrumented.BinTree instance = null;
        roops.core.objectsInstrumented.BinTree tree_BinTree_1 = new roops.core.objectsInstrumented.BinTree();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_1 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode z_BinTreeNode_2 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_3 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_4 = new roops.core.objectsInstrumented.BinTreeNode();
        // Parameter Initialization
        // Fields Initialization for 'tree_BinTree_1'
        // Fields Initialization for '_BinTreeNode_1'
        updateValue(_BinTreeNode_1, "key", 2147393528);
        updateValue(_BinTreeNode_1, "left", null);
        updateValue(_BinTreeNode_1, "right", null);
        updateValue(_BinTreeNode_1, "parent", null);
        updateValue(tree_BinTree_1, "root", _BinTreeNode_1);
        // Fields Initialization for 'z_BinTreeNode_2'
        updateValue(z_BinTreeNode_2, "key", -1736343547);
        // Fields Initialization for '_BinTreeNode_3'
        updateValue(_BinTreeNode_3, "key", 2147393528);
        // Fields Initialization for '_BinTreeNode_4'
        updateValue(_BinTreeNode_4, "key", 2147393528);
        updateValue(_BinTreeNode_4, "left", null);
        updateValue(_BinTreeNode_4, "right", null);
        updateValue(_BinTreeNode_4, "parent", _BinTreeNode_4);
        updateValue(_BinTreeNode_3, "left", _BinTreeNode_4);
        updateValue(_BinTreeNode_3, "right", null);
        updateValue(_BinTreeNode_3, "parent", null);
        updateValue(z_BinTreeNode_2, "left", _BinTreeNode_3);
        updateValue(z_BinTreeNode_2, "right", z_BinTreeNode_2);
        updateValue(z_BinTreeNode_2, "parent", null);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.BinTree", "removeTest", true);
        try {
            method.invoke(instance, new Object[]{tree_BinTree_1, z_BinTreeNode_2});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testremoveTest_42() {
        roops.core.objectsInstrumented.BinTree instance = null;
        roops.core.objectsInstrumented.BinTree tree_BinTree_1 = new roops.core.objectsInstrumented.BinTree();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_1 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode z_BinTreeNode_2 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_3 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_4 = new roops.core.objectsInstrumented.BinTreeNode();
        // Parameter Initialization
        // Fields Initialization for 'tree_BinTree_1'
        // Fields Initialization for '_BinTreeNode_1'
        updateValue(_BinTreeNode_1, "key", -2062913752);
        updateValue(_BinTreeNode_1, "left", null);
        updateValue(_BinTreeNode_1, "right", null);
        updateValue(_BinTreeNode_1, "parent", null);
        updateValue(tree_BinTree_1, "root", _BinTreeNode_1);
        // Fields Initialization for 'z_BinTreeNode_2'
        updateValue(z_BinTreeNode_2, "key", -889878060);
        // Fields Initialization for '_BinTreeNode_3'
        updateValue(_BinTreeNode_3, "key", 2057605675);
        // Fields Initialization for '_BinTreeNode_4'
        updateValue(_BinTreeNode_4, "key", 2057605675);
        updateValue(_BinTreeNode_4, "left", null);
        updateValue(_BinTreeNode_4, "right", _BinTreeNode_1);
        updateValue(_BinTreeNode_4, "parent", _BinTreeNode_4);
        updateValue(_BinTreeNode_3, "left", _BinTreeNode_4);
        updateValue(_BinTreeNode_3, "right", null);
        updateValue(_BinTreeNode_3, "parent", z_BinTreeNode_2);
        updateValue(z_BinTreeNode_2, "left", _BinTreeNode_3);
        updateValue(z_BinTreeNode_2, "right", z_BinTreeNode_2);
        updateValue(z_BinTreeNode_2, "parent", null);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.BinTree", "removeTest", true);
        try {
            method.invoke(instance, new Object[]{tree_BinTree_1, z_BinTreeNode_2});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testremoveTest_43() {
        roops.core.objectsInstrumented.BinTree instance = null;
        roops.core.objectsInstrumented.BinTree tree_BinTree_1 = new roops.core.objectsInstrumented.BinTree();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_1 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode z_BinTreeNode_2 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_3 = new roops.core.objectsInstrumented.BinTreeNode();
        roops.core.objectsInstrumented.BinTreeNode _BinTreeNode_4 = new roops.core.objectsInstrumented.BinTreeNode();
        // Parameter Initialization
        // Fields Initialization for 'tree_BinTree_1'
        // Fields Initialization for '_BinTreeNode_1'
        updateValue(_BinTreeNode_1, "key", 65533936);
        updateValue(_BinTreeNode_1, "left", null);
        updateValue(_BinTreeNode_1, "right", null);
        updateValue(_BinTreeNode_1, "parent", null);
        updateValue(tree_BinTree_1, "root", _BinTreeNode_1);
        // Fields Initialization for 'z_BinTreeNode_2'
        updateValue(z_BinTreeNode_2, "key", -65533939);
        // Fields Initialization for '_BinTreeNode_3'
        updateValue(_BinTreeNode_3, "key", 65533936);
        // Fields Initialization for '_BinTreeNode_4'
        updateValue(_BinTreeNode_4, "key", 65533936);
        updateValue(_BinTreeNode_4, "left", null);
        updateValue(_BinTreeNode_4, "right", _BinTreeNode_1);
        updateValue(_BinTreeNode_4, "parent", _BinTreeNode_3);
        updateValue(_BinTreeNode_3, "left", _BinTreeNode_4);
        updateValue(_BinTreeNode_3, "right", null);
        updateValue(_BinTreeNode_3, "parent", null);
        updateValue(z_BinTreeNode_2, "left", _BinTreeNode_3);
        updateValue(z_BinTreeNode_2, "right", z_BinTreeNode_2);
        updateValue(z_BinTreeNode_2, "parent", _BinTreeNode_4);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.BinTree", "removeTest", true);
        try {
            method.invoke(instance, new Object[]{tree_BinTree_1, z_BinTreeNode_2});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }
}