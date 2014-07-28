package ar.edu.generated.junit;

import java.lang.reflect.Method;
import java.lang.reflect.Field;
import org.junit.Test;

public class SinglyLinkedListTest_containsTest_0 {

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
        roops.core.objectsInstrumented.SinglyLinkedList instance = null;
        int value_param_Integer_1 = 633274062;
        // Parameter Initialization
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.SinglyLinkedList", "containsTest", true);
        try {
            method.invoke(instance, new Object[]{instance, value_param_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testcontainsTest_1() {
        roops.core.objectsInstrumented.SinglyLinkedList instance = null;
        roops.core.objectsInstrumented.SinglyLinkedList list_SinglyLinkedList_1 = new roops.core.objectsInstrumented.SinglyLinkedList();
        roops.core.objectsInstrumented.SinglyLinkedListNode _SinglyLinkedListNode_1 = new roops.core.objectsInstrumented.SinglyLinkedListNode();
        int value_param_Integer_1 = -2146762112;
        // Parameter Initialization
        // Fields Initialization for 'list_SinglyLinkedList_1'
        // Fields Initialization for '_SinglyLinkedListNode_1'
        updateValue(_SinglyLinkedListNode_1, "next", null);
        updateValue(_SinglyLinkedListNode_1, "value", -2146762112);
        updateValue(list_SinglyLinkedList_1, "header", _SinglyLinkedListNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.SinglyLinkedList", "containsTest", true);
        try {
            method.invoke(instance, new Object[]{list_SinglyLinkedList_1, value_param_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testcontainsTest_2() {
        roops.core.objectsInstrumented.SinglyLinkedList instance = null;
        roops.core.objectsInstrumented.SinglyLinkedList list_SinglyLinkedList_1 = new roops.core.objectsInstrumented.SinglyLinkedList();
        roops.core.objectsInstrumented.SinglyLinkedListNode _SinglyLinkedListNode_1 = new roops.core.objectsInstrumented.SinglyLinkedListNode();
        roops.core.objectsInstrumented.SinglyLinkedListNode _SinglyLinkedListNode_2 = new roops.core.objectsInstrumented.SinglyLinkedListNode();
        int value_param_Integer_1 = 32784;
        // Parameter Initialization
        // Fields Initialization for 'list_SinglyLinkedList_1'
        // Fields Initialization for '_SinglyLinkedListNode_1'
        // Fields Initialization for '_SinglyLinkedListNode_2'
        updateValue(_SinglyLinkedListNode_2, "next", null);
        updateValue(_SinglyLinkedListNode_2, "value", 32784);
        updateValue(_SinglyLinkedListNode_1, "next", _SinglyLinkedListNode_2);
        updateValue(_SinglyLinkedListNode_1, "value", -163857);
        updateValue(list_SinglyLinkedList_1, "header", _SinglyLinkedListNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.SinglyLinkedList", "containsTest", true);
        try {
            method.invoke(instance, new Object[]{list_SinglyLinkedList_1, value_param_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testcontainsTest_3() {
        roops.core.objectsInstrumented.SinglyLinkedList instance = null;
        roops.core.objectsInstrumented.SinglyLinkedList list_SinglyLinkedList_1 = new roops.core.objectsInstrumented.SinglyLinkedList();
        int value_param_Integer_1 = 4144;
        // Parameter Initialization
        // Fields Initialization for 'list_SinglyLinkedList_1'
        updateValue(list_SinglyLinkedList_1, "header", null);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.SinglyLinkedList", "containsTest", true);
        try {
            method.invoke(instance, new Object[]{list_SinglyLinkedList_1, value_param_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testcontainsTest_4() {
        roops.core.objectsInstrumented.SinglyLinkedList instance = null;
        roops.core.objectsInstrumented.SinglyLinkedList list_SinglyLinkedList_1 = new roops.core.objectsInstrumented.SinglyLinkedList();
        roops.core.objectsInstrumented.SinglyLinkedListNode _SinglyLinkedListNode_1 = new roops.core.objectsInstrumented.SinglyLinkedListNode();
        int value_param_Integer_1 = 1611006213;
        // Parameter Initialization
        // Fields Initialization for 'list_SinglyLinkedList_1'
        // Fields Initialization for '_SinglyLinkedListNode_1'
        updateValue(_SinglyLinkedListNode_1, "next", null);
        updateValue(_SinglyLinkedListNode_1, "value", 536412027);
        updateValue(list_SinglyLinkedList_1, "header", _SinglyLinkedListNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.SinglyLinkedList", "containsTest", true);
        try {
            method.invoke(instance, new Object[]{list_SinglyLinkedList_1, value_param_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testcontainsTest_5() {
        roops.core.objectsInstrumented.SinglyLinkedList instance = null;
        roops.core.objectsInstrumented.SinglyLinkedList list_SinglyLinkedList_1 = new roops.core.objectsInstrumented.SinglyLinkedList();
        roops.core.objectsInstrumented.SinglyLinkedListNode _SinglyLinkedListNode_1 = new roops.core.objectsInstrumented.SinglyLinkedListNode();
        roops.core.objectsInstrumented.SinglyLinkedListNode _SinglyLinkedListNode_2 = new roops.core.objectsInstrumented.SinglyLinkedListNode();
        int value_param_Integer_1 = 1082425474;
        // Parameter Initialization
        // Fields Initialization for 'list_SinglyLinkedList_1'
        // Fields Initialization for '_SinglyLinkedListNode_1'
        // Fields Initialization for '_SinglyLinkedListNode_2'
        updateValue(_SinglyLinkedListNode_2, "next", null);
        updateValue(_SinglyLinkedListNode_2, "value", 1064861181);
        updateValue(_SinglyLinkedListNode_1, "next", _SinglyLinkedListNode_2);
        updateValue(_SinglyLinkedListNode_1, "value", 1064861181);
        updateValue(list_SinglyLinkedList_1, "header", _SinglyLinkedListNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.SinglyLinkedList", "containsTest", true);
        try {
            method.invoke(instance, new Object[]{list_SinglyLinkedList_1, value_param_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testcontainsTest_6() {
        roops.core.objectsInstrumented.SinglyLinkedList instance = null;
        roops.core.objectsInstrumented.SinglyLinkedList list_SinglyLinkedList_1 = new roops.core.objectsInstrumented.SinglyLinkedList();
        roops.core.objectsInstrumented.SinglyLinkedListNode _SinglyLinkedListNode_1 = new roops.core.objectsInstrumented.SinglyLinkedListNode();
        int value_param_Integer_1 = -422523407;
        // Parameter Initialization
        // Fields Initialization for 'list_SinglyLinkedList_1'
        // Fields Initialization for '_SinglyLinkedListNode_1'
        updateValue(_SinglyLinkedListNode_1, "next", null);
        updateValue(_SinglyLinkedListNode_1, "value", -422523407);
        updateValue(list_SinglyLinkedList_1, "header", _SinglyLinkedListNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.SinglyLinkedList", "containsTest", true);
        try {
            method.invoke(instance, new Object[]{list_SinglyLinkedList_1, value_param_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testcontainsTest_7() {
        roops.core.objectsInstrumented.SinglyLinkedList instance = null;
        int value_param_Integer_1 = -1451864235;
        // Parameter Initialization
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.SinglyLinkedList", "containsTest", true);
        try {
            method.invoke(instance, new Object[]{instance, value_param_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testcontainsTest_8() {
        roops.core.objectsInstrumented.SinglyLinkedList instance = null;
        roops.core.objectsInstrumented.SinglyLinkedList list_SinglyLinkedList_1 = new roops.core.objectsInstrumented.SinglyLinkedList();
        roops.core.objectsInstrumented.SinglyLinkedListNode _SinglyLinkedListNode_1 = new roops.core.objectsInstrumented.SinglyLinkedListNode();
        roops.core.objectsInstrumented.SinglyLinkedListNode _SinglyLinkedListNode_2 = new roops.core.objectsInstrumented.SinglyLinkedListNode();
        roops.core.objectsInstrumented.SinglyLinkedListNode _SinglyLinkedListNode_3 = new roops.core.objectsInstrumented.SinglyLinkedListNode();
        roops.core.objectsInstrumented.SinglyLinkedListNode _SinglyLinkedListNode_4 = new roops.core.objectsInstrumented.SinglyLinkedListNode();
        int value_param_Integer_1 = -1836217881;
        // Parameter Initialization
        // Fields Initialization for 'list_SinglyLinkedList_1'
        // Fields Initialization for '_SinglyLinkedListNode_1'
        // Fields Initialization for '_SinglyLinkedListNode_2'
        // Fields Initialization for '_SinglyLinkedListNode_3'
        // Fields Initialization for '_SinglyLinkedListNode_4'
        updateValue(_SinglyLinkedListNode_4, "next", null);
        updateValue(_SinglyLinkedListNode_4, "value", -1836217881);
        updateValue(_SinglyLinkedListNode_3, "next", _SinglyLinkedListNode_4);
        updateValue(_SinglyLinkedListNode_3, "value", -1836217881);
        updateValue(_SinglyLinkedListNode_2, "next", _SinglyLinkedListNode_3);
        updateValue(_SinglyLinkedListNode_2, "value", -1836217881);
        updateValue(_SinglyLinkedListNode_1, "next", _SinglyLinkedListNode_2);
        updateValue(_SinglyLinkedListNode_1, "value", 221402713);
        updateValue(list_SinglyLinkedList_1, "header", _SinglyLinkedListNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.SinglyLinkedList", "containsTest", true);
        try {
            method.invoke(instance, new Object[]{list_SinglyLinkedList_1, value_param_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testcontainsTest_9() {
        roops.core.objectsInstrumented.SinglyLinkedList instance = null;
        roops.core.objectsInstrumented.SinglyLinkedList list_SinglyLinkedList_1 = new roops.core.objectsInstrumented.SinglyLinkedList();
        int value_param_Integer_1 = 80709606;
        // Parameter Initialization
        // Fields Initialization for 'list_SinglyLinkedList_1'
        updateValue(list_SinglyLinkedList_1, "header", null);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.SinglyLinkedList", "containsTest", true);
        try {
            method.invoke(instance, new Object[]{list_SinglyLinkedList_1, value_param_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testcontainsTest_10() {
        roops.core.objectsInstrumented.SinglyLinkedList instance = null;
        roops.core.objectsInstrumented.SinglyLinkedList list_SinglyLinkedList_1 = new roops.core.objectsInstrumented.SinglyLinkedList();
        int value_param_Integer_1 = 1357759279;
        // Parameter Initialization
        // Fields Initialization for 'list_SinglyLinkedList_1'
        updateValue(list_SinglyLinkedList_1, "header", null);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.SinglyLinkedList", "containsTest", true);
        try {
            method.invoke(instance, new Object[]{list_SinglyLinkedList_1, value_param_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testcontainsTest_11() {
        roops.core.objectsInstrumented.SinglyLinkedList instance = null;
        int value_param_Integer_1 = -1600609245;
        // Parameter Initialization
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.SinglyLinkedList", "containsTest", true);
        try {
            method.invoke(instance, new Object[]{instance, value_param_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testcontainsTest_12() {
        roops.core.objectsInstrumented.SinglyLinkedList instance = null;
        roops.core.objectsInstrumented.SinglyLinkedList list_SinglyLinkedList_1 = new roops.core.objectsInstrumented.SinglyLinkedList();
        roops.core.objectsInstrumented.SinglyLinkedListNode _SinglyLinkedListNode_1 = new roops.core.objectsInstrumented.SinglyLinkedListNode();
        int value_param_Integer_1 = 1689981196;
        // Parameter Initialization
        // Fields Initialization for 'list_SinglyLinkedList_1'
        // Fields Initialization for '_SinglyLinkedListNode_1'
        updateValue(_SinglyLinkedListNode_1, "next", null);
        updateValue(_SinglyLinkedListNode_1, "value", 557583027);
        updateValue(list_SinglyLinkedList_1, "header", _SinglyLinkedListNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.SinglyLinkedList", "containsTest", true);
        try {
            method.invoke(instance, new Object[]{list_SinglyLinkedList_1, value_param_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testcontainsTest_13() {
        roops.core.objectsInstrumented.SinglyLinkedList instance = null;
        roops.core.objectsInstrumented.SinglyLinkedList list_SinglyLinkedList_1 = new roops.core.objectsInstrumented.SinglyLinkedList();
        roops.core.objectsInstrumented.SinglyLinkedListNode _SinglyLinkedListNode_1 = new roops.core.objectsInstrumented.SinglyLinkedListNode();
        roops.core.objectsInstrumented.SinglyLinkedListNode _SinglyLinkedListNode_2 = new roops.core.objectsInstrumented.SinglyLinkedListNode();
        roops.core.objectsInstrumented.SinglyLinkedListNode _SinglyLinkedListNode_3 = new roops.core.objectsInstrumented.SinglyLinkedListNode();
        roops.core.objectsInstrumented.SinglyLinkedListNode _SinglyLinkedListNode_4 = new roops.core.objectsInstrumented.SinglyLinkedListNode();
        int value_param_Integer_1 = 144098934;
        // Parameter Initialization
        // Fields Initialization for 'list_SinglyLinkedList_1'
        // Fields Initialization for '_SinglyLinkedListNode_1'
        // Fields Initialization for '_SinglyLinkedListNode_2'
        // Fields Initialization for '_SinglyLinkedListNode_3'
        // Fields Initialization for '_SinglyLinkedListNode_4'
        updateValue(_SinglyLinkedListNode_4, "next", null);
        updateValue(_SinglyLinkedListNode_4, "value", 144098934);
        updateValue(_SinglyLinkedListNode_3, "next", _SinglyLinkedListNode_4);
        updateValue(_SinglyLinkedListNode_3, "value", 144098934);
        updateValue(_SinglyLinkedListNode_2, "next", _SinglyLinkedListNode_3);
        updateValue(_SinglyLinkedListNode_2, "value", 144098934);
        updateValue(_SinglyLinkedListNode_1, "next", _SinglyLinkedListNode_2);
        updateValue(_SinglyLinkedListNode_1, "value", -185884279);
        updateValue(list_SinglyLinkedList_1, "header", _SinglyLinkedListNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.SinglyLinkedList", "containsTest", true);
        try {
            method.invoke(instance, new Object[]{list_SinglyLinkedList_1, value_param_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testcontainsTest_14() {
        roops.core.objectsInstrumented.SinglyLinkedList instance = null;
        roops.core.objectsInstrumented.SinglyLinkedList list_SinglyLinkedList_1 = new roops.core.objectsInstrumented.SinglyLinkedList();
        roops.core.objectsInstrumented.SinglyLinkedListNode _SinglyLinkedListNode_1 = new roops.core.objectsInstrumented.SinglyLinkedListNode();
        int value_param_Integer_1 = -2135138890;
        // Parameter Initialization
        // Fields Initialization for 'list_SinglyLinkedList_1'
        // Fields Initialization for '_SinglyLinkedListNode_1'
        updateValue(_SinglyLinkedListNode_1, "next", null);
        updateValue(_SinglyLinkedListNode_1, "value", -855012241);
        updateValue(list_SinglyLinkedList_1, "header", _SinglyLinkedListNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.SinglyLinkedList", "containsTest", true);
        try {
            method.invoke(instance, new Object[]{list_SinglyLinkedList_1, value_param_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testcontainsTest_15() {
        roops.core.objectsInstrumented.SinglyLinkedList instance = null;
        int value_param_Integer_1 = 53382054;
        // Parameter Initialization
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.SinglyLinkedList", "containsTest", true);
        try {
            method.invoke(instance, new Object[]{instance, value_param_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testcontainsTest_16() {
        roops.core.objectsInstrumented.SinglyLinkedList instance = null;
        roops.core.objectsInstrumented.SinglyLinkedList list_SinglyLinkedList_1 = new roops.core.objectsInstrumented.SinglyLinkedList();
        int value_param_Integer_1 = 1181487482;
        // Parameter Initialization
        // Fields Initialization for 'list_SinglyLinkedList_1'
        updateValue(list_SinglyLinkedList_1, "header", null);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.SinglyLinkedList", "containsTest", true);
        try {
            method.invoke(instance, new Object[]{list_SinglyLinkedList_1, value_param_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testcontainsTest_17() {
        roops.core.objectsInstrumented.SinglyLinkedList instance = null;
        roops.core.objectsInstrumented.SinglyLinkedList list_SinglyLinkedList_1 = new roops.core.objectsInstrumented.SinglyLinkedList();
        roops.core.objectsInstrumented.SinglyLinkedListNode _SinglyLinkedListNode_1 = new roops.core.objectsInstrumented.SinglyLinkedListNode();
        int value_param_Integer_1 = 679647525;
        // Parameter Initialization
        // Fields Initialization for 'list_SinglyLinkedList_1'
        // Fields Initialization for '_SinglyLinkedListNode_1'
        updateValue(_SinglyLinkedListNode_1, "next", null);
        updateValue(_SinglyLinkedListNode_1, "value", 679647525);
        updateValue(list_SinglyLinkedList_1, "header", _SinglyLinkedListNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.SinglyLinkedList", "containsTest", true);
        try {
            method.invoke(instance, new Object[]{list_SinglyLinkedList_1, value_param_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testcontainsTest_18() {
        roops.core.objectsInstrumented.SinglyLinkedList instance = null;
        int value_param_Integer_1 = 1933016727;
        // Parameter Initialization
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.SinglyLinkedList", "containsTest", true);
        try {
            method.invoke(instance, new Object[]{instance, value_param_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testcontainsTest_19() {
        roops.core.objectsInstrumented.SinglyLinkedList instance = null;
        roops.core.objectsInstrumented.SinglyLinkedList list_SinglyLinkedList_1 = new roops.core.objectsInstrumented.SinglyLinkedList();
        roops.core.objectsInstrumented.SinglyLinkedListNode _SinglyLinkedListNode_1 = new roops.core.objectsInstrumented.SinglyLinkedListNode();
        roops.core.objectsInstrumented.SinglyLinkedListNode _SinglyLinkedListNode_2 = new roops.core.objectsInstrumented.SinglyLinkedListNode();
        roops.core.objectsInstrumented.SinglyLinkedListNode _SinglyLinkedListNode_3 = new roops.core.objectsInstrumented.SinglyLinkedListNode();
        roops.core.objectsInstrumented.SinglyLinkedListNode _SinglyLinkedListNode_4 = new roops.core.objectsInstrumented.SinglyLinkedListNode();
        int value_param_Integer_1 = -39216634;
        // Parameter Initialization
        // Fields Initialization for 'list_SinglyLinkedList_1'
        // Fields Initialization for '_SinglyLinkedListNode_1'
        // Fields Initialization for '_SinglyLinkedListNode_2'
        // Fields Initialization for '_SinglyLinkedListNode_3'
        // Fields Initialization for '_SinglyLinkedListNode_4'
        updateValue(_SinglyLinkedListNode_4, "next", null);
        updateValue(_SinglyLinkedListNode_4, "value", 2144550640);
        updateValue(_SinglyLinkedListNode_3, "next", _SinglyLinkedListNode_4);
        updateValue(_SinglyLinkedListNode_3, "value", -1827213959);
        updateValue(_SinglyLinkedListNode_2, "next", _SinglyLinkedListNode_3);
        updateValue(_SinglyLinkedListNode_2, "value", -1827213959);
        updateValue(_SinglyLinkedListNode_1, "next", _SinglyLinkedListNode_2);
        updateValue(_SinglyLinkedListNode_1, "value", -39216634);
        updateValue(list_SinglyLinkedList_1, "header", _SinglyLinkedListNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.SinglyLinkedList", "containsTest", true);
        try {
            method.invoke(instance, new Object[]{list_SinglyLinkedList_1, value_param_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testcontainsTest_20() {
        roops.core.objectsInstrumented.SinglyLinkedList instance = null;
        roops.core.objectsInstrumented.SinglyLinkedList list_SinglyLinkedList_1 = new roops.core.objectsInstrumented.SinglyLinkedList();
        int value_param_Integer_1 = 1073842186;
        // Parameter Initialization
        // Fields Initialization for 'list_SinglyLinkedList_1'
        updateValue(list_SinglyLinkedList_1, "header", null);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.SinglyLinkedList", "containsTest", true);
        try {
            method.invoke(instance, new Object[]{list_SinglyLinkedList_1, value_param_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testcontainsTest_21() {
        roops.core.objectsInstrumented.SinglyLinkedList instance = null;
        roops.core.objectsInstrumented.SinglyLinkedList list_SinglyLinkedList_1 = new roops.core.objectsInstrumented.SinglyLinkedList();
        roops.core.objectsInstrumented.SinglyLinkedListNode _SinglyLinkedListNode_1 = new roops.core.objectsInstrumented.SinglyLinkedListNode();
        int value_param_Integer_1 = -1006019628;
        // Parameter Initialization
        // Fields Initialization for 'list_SinglyLinkedList_1'
        // Fields Initialization for '_SinglyLinkedListNode_1'
        updateValue(_SinglyLinkedListNode_1, "next", null);
        updateValue(_SinglyLinkedListNode_1, "value", -1604212157);
        updateValue(list_SinglyLinkedList_1, "header", _SinglyLinkedListNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.SinglyLinkedList", "containsTest", true);
        try {
            method.invoke(instance, new Object[]{list_SinglyLinkedList_1, value_param_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testcontainsTest_22() {
        roops.core.objectsInstrumented.SinglyLinkedList instance = null;
        roops.core.objectsInstrumented.SinglyLinkedList list_SinglyLinkedList_1 = new roops.core.objectsInstrumented.SinglyLinkedList();
        roops.core.objectsInstrumented.SinglyLinkedListNode _SinglyLinkedListNode_1 = new roops.core.objectsInstrumented.SinglyLinkedListNode();
        roops.core.objectsInstrumented.SinglyLinkedListNode _SinglyLinkedListNode_2 = new roops.core.objectsInstrumented.SinglyLinkedListNode();
        roops.core.objectsInstrumented.SinglyLinkedListNode _SinglyLinkedListNode_3 = new roops.core.objectsInstrumented.SinglyLinkedListNode();
        roops.core.objectsInstrumented.SinglyLinkedListNode _SinglyLinkedListNode_4 = new roops.core.objectsInstrumented.SinglyLinkedListNode();
        roops.core.objectsInstrumented.SinglyLinkedListNode _SinglyLinkedListNode_5 = new roops.core.objectsInstrumented.SinglyLinkedListNode();
        int value_param_Integer_1 = 930436637;
        // Parameter Initialization
        // Fields Initialization for 'list_SinglyLinkedList_1'
        // Fields Initialization for '_SinglyLinkedListNode_1'
        // Fields Initialization for '_SinglyLinkedListNode_2'
        // Fields Initialization for '_SinglyLinkedListNode_3'
        // Fields Initialization for '_SinglyLinkedListNode_4'
        // Fields Initialization for '_SinglyLinkedListNode_5'
        updateValue(_SinglyLinkedListNode_5, "next", null);
        updateValue(_SinglyLinkedListNode_5, "value", 930436637);
        updateValue(_SinglyLinkedListNode_4, "next", _SinglyLinkedListNode_5);
        updateValue(_SinglyLinkedListNode_4, "value", 930436637);
        updateValue(_SinglyLinkedListNode_3, "next", _SinglyLinkedListNode_4);
        updateValue(_SinglyLinkedListNode_3, "value", -2038395996);
        updateValue(_SinglyLinkedListNode_2, "next", _SinglyLinkedListNode_3);
        updateValue(_SinglyLinkedListNode_2, "value", 958323455);
        updateValue(_SinglyLinkedListNode_1, "next", _SinglyLinkedListNode_2);
        updateValue(_SinglyLinkedListNode_1, "value", -1005604960);
        updateValue(list_SinglyLinkedList_1, "header", _SinglyLinkedListNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.SinglyLinkedList", "containsTest", true);
        try {
            method.invoke(instance, new Object[]{list_SinglyLinkedList_1, value_param_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testcontainsTest_23() {
        roops.core.objectsInstrumented.SinglyLinkedList instance = null;
        int value_param_Integer_1 = 1037373353;
        // Parameter Initialization
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.SinglyLinkedList", "containsTest", true);
        try {
            method.invoke(instance, new Object[]{instance, value_param_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testcontainsTest_24() {
        roops.core.objectsInstrumented.SinglyLinkedList instance = null;
        roops.core.objectsInstrumented.SinglyLinkedList list_SinglyLinkedList_1 = new roops.core.objectsInstrumented.SinglyLinkedList();
        int value_param_Integer_1 = -1408114158;
        // Parameter Initialization
        // Fields Initialization for 'list_SinglyLinkedList_1'
        updateValue(list_SinglyLinkedList_1, "header", null);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.SinglyLinkedList", "containsTest", true);
        try {
            method.invoke(instance, new Object[]{list_SinglyLinkedList_1, value_param_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testcontainsTest_25() {
        roops.core.objectsInstrumented.SinglyLinkedList instance = null;
        roops.core.objectsInstrumented.SinglyLinkedList list_SinglyLinkedList_1 = new roops.core.objectsInstrumented.SinglyLinkedList();
        int value_param_Integer_1 = -1686742320;
        // Parameter Initialization
        // Fields Initialization for 'list_SinglyLinkedList_1'
        updateValue(list_SinglyLinkedList_1, "header", null);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.SinglyLinkedList", "containsTest", true);
        try {
            method.invoke(instance, new Object[]{list_SinglyLinkedList_1, value_param_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testcontainsTest_26() {
        roops.core.objectsInstrumented.SinglyLinkedList instance = null;
        int value_param_Integer_1 = -1442612122;
        // Parameter Initialization
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.SinglyLinkedList", "containsTest", true);
        try {
            method.invoke(instance, new Object[]{instance, value_param_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testcontainsTest_27() {
        roops.core.objectsInstrumented.SinglyLinkedList instance = null;
        roops.core.objectsInstrumented.SinglyLinkedList list_SinglyLinkedList_1 = new roops.core.objectsInstrumented.SinglyLinkedList();
        roops.core.objectsInstrumented.SinglyLinkedListNode _SinglyLinkedListNode_1 = new roops.core.objectsInstrumented.SinglyLinkedListNode();
        int value_param_Integer_1 = -1632424030;
        // Parameter Initialization
        // Fields Initialization for 'list_SinglyLinkedList_1'
        // Fields Initialization for '_SinglyLinkedListNode_1'
        updateValue(_SinglyLinkedListNode_1, "next", null);
        updateValue(_SinglyLinkedListNode_1, "value", -749264097);
        updateValue(list_SinglyLinkedList_1, "header", _SinglyLinkedListNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.SinglyLinkedList", "containsTest", true);
        try {
            method.invoke(instance, new Object[]{list_SinglyLinkedList_1, value_param_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testcontainsTest_28() {
        roops.core.objectsInstrumented.SinglyLinkedList instance = null;
        roops.core.objectsInstrumented.SinglyLinkedList list_SinglyLinkedList_1 = new roops.core.objectsInstrumented.SinglyLinkedList();
        roops.core.objectsInstrumented.SinglyLinkedListNode _SinglyLinkedListNode_1 = new roops.core.objectsInstrumented.SinglyLinkedListNode();
        roops.core.objectsInstrumented.SinglyLinkedListNode _SinglyLinkedListNode_2 = new roops.core.objectsInstrumented.SinglyLinkedListNode();
        int value_param_Integer_1 = 673523154;
        // Parameter Initialization
        // Fields Initialization for 'list_SinglyLinkedList_1'
        // Fields Initialization for '_SinglyLinkedListNode_1'
        // Fields Initialization for '_SinglyLinkedListNode_2'
        updateValue(_SinglyLinkedListNode_2, "next", null);
        updateValue(_SinglyLinkedListNode_2, "value", 673523154);
        updateValue(_SinglyLinkedListNode_1, "next", _SinglyLinkedListNode_2);
        updateValue(_SinglyLinkedListNode_1, "value", -674047443);
        updateValue(list_SinglyLinkedList_1, "header", _SinglyLinkedListNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.SinglyLinkedList", "containsTest", true);
        try {
            method.invoke(instance, new Object[]{list_SinglyLinkedList_1, value_param_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }
}