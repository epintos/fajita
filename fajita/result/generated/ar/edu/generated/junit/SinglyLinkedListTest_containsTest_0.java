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
        int value_param_Integer_1 = 327697;
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
        int value_param_Integer_1 = 327697;
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
    public void testcontainsTest_2() {
        roops.core.objectsInstrumented.SinglyLinkedList instance = null;
        roops.core.objectsInstrumented.SinglyLinkedList list_SinglyLinkedList_1 = new roops.core.objectsInstrumented.SinglyLinkedList();
        roops.core.objectsInstrumented.SinglyLinkedListNode _SinglyLinkedListNode_1 = new roops.core.objectsInstrumented.SinglyLinkedListNode();
        int value_param_Integer_1 = -1203080001;
        // Parameter Initialization
        // Fields Initialization for 'list_SinglyLinkedList_1'
        // Fields Initialization for '_SinglyLinkedListNode_1'
        updateValue(_SinglyLinkedListNode_1, "next", null);
        updateValue(_SinglyLinkedListNode_1, "value", -1203080001);
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
        int value_param_Integer_1 = -2088494114;
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
    public void testcontainsTest_4() {
        roops.core.objectsInstrumented.SinglyLinkedList instance = null;
        roops.core.objectsInstrumented.SinglyLinkedList list_SinglyLinkedList_1 = new roops.core.objectsInstrumented.SinglyLinkedList();
        int value_param_Integer_1 = -43801152;
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
    public void testcontainsTest_5() {
        roops.core.objectsInstrumented.SinglyLinkedList instance = null;
        roops.core.objectsInstrumented.SinglyLinkedList list_SinglyLinkedList_1 = new roops.core.objectsInstrumented.SinglyLinkedList();
        roops.core.objectsInstrumented.SinglyLinkedListNode _SinglyLinkedListNode_1 = new roops.core.objectsInstrumented.SinglyLinkedListNode();
        int value_param_Integer_1 = 961548420;
        // Parameter Initialization
        // Fields Initialization for 'list_SinglyLinkedList_1'
        // Fields Initialization for '_SinglyLinkedListNode_1'
        updateValue(_SinglyLinkedListNode_1, "next", null);
        updateValue(_SinglyLinkedListNode_1, "value", -957354117);
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
        int value_param_Integer_1 = -1203080001;
        // Parameter Initialization
        // Fields Initialization for 'list_SinglyLinkedList_1'
        // Fields Initialization for '_SinglyLinkedListNode_1'
        updateValue(_SinglyLinkedListNode_1, "next", null);
        updateValue(_SinglyLinkedListNode_1, "value", -1203080001);
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
        int value_param_Integer_1 = -2088494114;
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
        int value_param_Integer_1 = -43801152;
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
    public void testcontainsTest_9() {
        roops.core.objectsInstrumented.SinglyLinkedList instance = null;
        roops.core.objectsInstrumented.SinglyLinkedList list_SinglyLinkedList_1 = new roops.core.objectsInstrumented.SinglyLinkedList();
        roops.core.objectsInstrumented.SinglyLinkedListNode _SinglyLinkedListNode_1 = new roops.core.objectsInstrumented.SinglyLinkedListNode();
        int value_param_Integer_1 = 961548420;
        // Parameter Initialization
        // Fields Initialization for 'list_SinglyLinkedList_1'
        // Fields Initialization for '_SinglyLinkedListNode_1'
        updateValue(_SinglyLinkedListNode_1, "next", null);
        updateValue(_SinglyLinkedListNode_1, "value", -957354117);
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
    public void testcontainsTest_10() {
        roops.core.objectsInstrumented.SinglyLinkedList instance = null;
        roops.core.objectsInstrumented.SinglyLinkedList list_SinglyLinkedList_1 = new roops.core.objectsInstrumented.SinglyLinkedList();
        roops.core.objectsInstrumented.SinglyLinkedListNode _SinglyLinkedListNode_1 = new roops.core.objectsInstrumented.SinglyLinkedListNode();
        int value_param_Integer_1 = -1203080001;
        // Parameter Initialization
        // Fields Initialization for 'list_SinglyLinkedList_1'
        // Fields Initialization for '_SinglyLinkedListNode_1'
        updateValue(_SinglyLinkedListNode_1, "next", null);
        updateValue(_SinglyLinkedListNode_1, "value", -1203080001);
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
    public void testcontainsTest_11() {
        roops.core.objectsInstrumented.SinglyLinkedList instance = null;
        roops.core.objectsInstrumented.SinglyLinkedList list_SinglyLinkedList_1 = new roops.core.objectsInstrumented.SinglyLinkedList();
        roops.core.objectsInstrumented.SinglyLinkedListNode _SinglyLinkedListNode_1 = new roops.core.objectsInstrumented.SinglyLinkedListNode();
        int value_param_Integer_1 = -1203080001;
        // Parameter Initialization
        // Fields Initialization for 'list_SinglyLinkedList_1'
        // Fields Initialization for '_SinglyLinkedListNode_1'
        updateValue(_SinglyLinkedListNode_1, "next", null);
        updateValue(_SinglyLinkedListNode_1, "value", -1203080001);
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
    public void testcontainsTest_12() {
        roops.core.objectsInstrumented.SinglyLinkedList instance = null;
        int value_param_Integer_1 = -2088494114;
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
    public void testcontainsTest_13() {
        roops.core.objectsInstrumented.SinglyLinkedList instance = null;
        roops.core.objectsInstrumented.SinglyLinkedList list_SinglyLinkedList_1 = new roops.core.objectsInstrumented.SinglyLinkedList();
        int value_param_Integer_1 = -43801152;
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
    public void testcontainsTest_14() {
        roops.core.objectsInstrumented.SinglyLinkedList instance = null;
        roops.core.objectsInstrumented.SinglyLinkedList list_SinglyLinkedList_1 = new roops.core.objectsInstrumented.SinglyLinkedList();
        roops.core.objectsInstrumented.SinglyLinkedListNode _SinglyLinkedListNode_1 = new roops.core.objectsInstrumented.SinglyLinkedListNode();
        int value_param_Integer_1 = 961548420;
        // Parameter Initialization
        // Fields Initialization for 'list_SinglyLinkedList_1'
        // Fields Initialization for '_SinglyLinkedListNode_1'
        updateValue(_SinglyLinkedListNode_1, "next", null);
        updateValue(_SinglyLinkedListNode_1, "value", -957354117);
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