package ar.edu.generated.junit;

import java.lang.reflect.Method;
import java.lang.reflect.Field;
import org.junit.Test;

public class LinkedListTest_addLastTest {

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
    public void testaddLastTest_0() {
        roops.core.objectsInstrumented.LinkedList instance = new roops.core.objectsInstrumented.LinkedList();
        
        // Parameter Initialization
        
        roops.core.objectsInstrumented.LinkedList list_LinkedList_1 = new roops.core.objectsInstrumented.LinkedList();
        // Fields Initialization for 'list_LinkedList_1'
        
        roops.core.objectsInstrumented.LinkedListNode _LinkedListNode_1 = new roops.core.objectsInstrumented.LinkedListNode();
        // Fields Initialization for '_LinkedListNode_1'
        
        roops.core.objectsInstrumented.LinkedListNode _LinkedListNode_2 = new roops.core.objectsInstrumented.LinkedListNode();
        // Fields Initialization for '_LinkedListNode_2'
        updateValue(_LinkedListNode_2, "previous", _LinkedListNode_1);
        updateValue(_LinkedListNode_2, "next", _LinkedListNode_1);
        
        roops.core.objectsInstrumented.LinkedList _LinkedList_2 = new roops.core.objectsInstrumented.LinkedList();
        updateValue(_LinkedListNode_2, "object_value", _LinkedList_2);
        updateValue(_LinkedListNode_1, "previous", _LinkedListNode_2);
        updateValue(_LinkedListNode_1, "next", _LinkedListNode_2);
        
        roops.core.objectsInstrumented.LinkedListNode _LinkedListNode_3 = new roops.core.objectsInstrumented.LinkedListNode();
        updateValue(_LinkedListNode_1, "object_value", _LinkedListNode_3);
        updateValue(list_LinkedList_1, "header", _LinkedListNode_1);
        updateValue(list_LinkedList_1, "size", 1);
        updateValue(list_LinkedList_1, "modCount", 2);
        
        java.lang.Object o_LinkedList_3 = new java.lang.Object();
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.LinkedList", "addLastTest", true);
        try {
            method.invoke(instance, list_LinkedList_1, o_LinkedList_3);
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testaddLastTest_1() {
        roops.core.objectsInstrumented.LinkedList instance = new roops.core.objectsInstrumented.LinkedList();
        
        // Parameter Initialization
        
        roops.core.objectsInstrumented.LinkedList list_LinkedList_1 = new roops.core.objectsInstrumented.LinkedList();
        // Fields Initialization for 'list_LinkedList_1'
        
        roops.core.objectsInstrumented.LinkedListNode _LinkedListNode_1 = new roops.core.objectsInstrumented.LinkedListNode();
        // Fields Initialization for '_LinkedListNode_1'
        
        roops.core.objectsInstrumented.LinkedListNode _LinkedListNode_2 = new roops.core.objectsInstrumented.LinkedListNode();
        // Fields Initialization for '_LinkedListNode_2'
        updateValue(_LinkedListNode_2, "previous", _LinkedListNode_1);
        updateValue(_LinkedListNode_2, "next", _LinkedListNode_1);
        
        roops.core.objectsInstrumented.LinkedList _LinkedList_2 = new roops.core.objectsInstrumented.LinkedList();
        updateValue(_LinkedListNode_2, "object_value", _LinkedList_2);
        updateValue(_LinkedListNode_1, "previous", _LinkedListNode_2);
        updateValue(_LinkedListNode_1, "next", _LinkedListNode_2);
        
        roops.core.objectsInstrumented.LinkedListNode _LinkedListNode_3 = new roops.core.objectsInstrumented.LinkedListNode();
        updateValue(_LinkedListNode_1, "object_value", _LinkedListNode_3);
        updateValue(list_LinkedList_1, "header", _LinkedListNode_1);
        updateValue(list_LinkedList_1, "size", 1);
        updateValue(list_LinkedList_1, "modCount", 2);
        
        java.lang.Object o_LinkedList_3 = new java.lang.Object();
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.LinkedList", "addLastTest", true);
        try {
            method.invoke(instance, list_LinkedList_1, o_LinkedList_3);
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testaddLastTest_2() {
        roops.core.objectsInstrumented.LinkedList instance = new roops.core.objectsInstrumented.LinkedList();
        
        // Parameter Initialization
        
        roops.core.objectsInstrumented.LinkedList list_LinkedList_1 = new roops.core.objectsInstrumented.LinkedList();
        // Fields Initialization for 'list_LinkedList_1'
        
        roops.core.objectsInstrumented.LinkedListNode _LinkedListNode_1 = new roops.core.objectsInstrumented.LinkedListNode();
        // Fields Initialization for '_LinkedListNode_1'
        
        roops.core.objectsInstrumented.LinkedListNode _LinkedListNode_2 = new roops.core.objectsInstrumented.LinkedListNode();
        // Fields Initialization for '_LinkedListNode_2'
        updateValue(_LinkedListNode_2, "previous", _LinkedListNode_1);
        updateValue(_LinkedListNode_2, "next", _LinkedListNode_1);
        
        roops.core.objectsInstrumented.LinkedList _LinkedList_2 = new roops.core.objectsInstrumented.LinkedList();
        updateValue(_LinkedListNode_2, "object_value", _LinkedList_2);
        updateValue(_LinkedListNode_1, "previous", _LinkedListNode_2);
        updateValue(_LinkedListNode_1, "next", _LinkedListNode_2);
        
        roops.core.objectsInstrumented.LinkedListNode _LinkedListNode_3 = new roops.core.objectsInstrumented.LinkedListNode();
        updateValue(_LinkedListNode_1, "object_value", _LinkedListNode_3);
        updateValue(list_LinkedList_1, "header", _LinkedListNode_1);
        updateValue(list_LinkedList_1, "size", 1);
        updateValue(list_LinkedList_1, "modCount", 2);
        
        java.lang.Object o_LinkedList_3 = new java.lang.Object();
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.LinkedList", "addLastTest", true);
        try {
            method.invoke(instance, list_LinkedList_1, o_LinkedList_3);
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testaddLastTest_3() {
        roops.core.objectsInstrumented.LinkedList instance = new roops.core.objectsInstrumented.LinkedList();
        
        // Parameter Initialization
        
        roops.core.objectsInstrumented.LinkedList list_LinkedList_1 = new roops.core.objectsInstrumented.LinkedList();
        // Fields Initialization for 'list_LinkedList_1'
        
        roops.core.objectsInstrumented.LinkedListNode _LinkedListNode_1 = new roops.core.objectsInstrumented.LinkedListNode();
        // Fields Initialization for '_LinkedListNode_1'
        
        roops.core.objectsInstrumented.LinkedListNode _LinkedListNode_2 = new roops.core.objectsInstrumented.LinkedListNode();
        // Fields Initialization for '_LinkedListNode_2'
        updateValue(_LinkedListNode_2, "previous", _LinkedListNode_1);
        updateValue(_LinkedListNode_2, "next", _LinkedListNode_1);
        
        roops.core.objectsInstrumented.LinkedList _LinkedList_2 = new roops.core.objectsInstrumented.LinkedList();
        updateValue(_LinkedListNode_2, "object_value", _LinkedList_2);
        updateValue(_LinkedListNode_1, "previous", _LinkedListNode_2);
        updateValue(_LinkedListNode_1, "next", _LinkedListNode_2);
        
        roops.core.objectsInstrumented.LinkedListNode _LinkedListNode_3 = new roops.core.objectsInstrumented.LinkedListNode();
        updateValue(_LinkedListNode_1, "object_value", _LinkedListNode_3);
        updateValue(list_LinkedList_1, "header", _LinkedListNode_1);
        updateValue(list_LinkedList_1, "size", 1);
        updateValue(list_LinkedList_1, "modCount", 2);
        
        java.lang.Object o_LinkedList_3 = new java.lang.Object();
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.LinkedList", "addLastTest", true);
        try {
            method.invoke(instance, list_LinkedList_1, o_LinkedList_3);
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testaddLastTest_4() {
        roops.core.objectsInstrumented.LinkedList instance = new roops.core.objectsInstrumented.LinkedList();
        
        // Parameter Initialization
        
        roops.core.objectsInstrumented.LinkedList list_LinkedList_1 = new roops.core.objectsInstrumented.LinkedList();
        // Fields Initialization for 'list_LinkedList_1'
        
        roops.core.objectsInstrumented.LinkedListNode _LinkedListNode_1 = new roops.core.objectsInstrumented.LinkedListNode();
        // Fields Initialization for '_LinkedListNode_1'
        
        roops.core.objectsInstrumented.LinkedListNode _LinkedListNode_2 = new roops.core.objectsInstrumented.LinkedListNode();
        // Fields Initialization for '_LinkedListNode_2'
        updateValue(_LinkedListNode_2, "previous", _LinkedListNode_1);
        updateValue(_LinkedListNode_2, "next", _LinkedListNode_1);
        
        roops.core.objectsInstrumented.LinkedList _LinkedList_2 = new roops.core.objectsInstrumented.LinkedList();
        updateValue(_LinkedListNode_2, "object_value", _LinkedList_2);
        updateValue(_LinkedListNode_1, "previous", _LinkedListNode_2);
        updateValue(_LinkedListNode_1, "next", _LinkedListNode_2);
        
        roops.core.objectsInstrumented.LinkedListNode _LinkedListNode_3 = new roops.core.objectsInstrumented.LinkedListNode();
        updateValue(_LinkedListNode_1, "object_value", _LinkedListNode_3);
        updateValue(list_LinkedList_1, "header", _LinkedListNode_1);
        updateValue(list_LinkedList_1, "size", 1);
        updateValue(list_LinkedList_1, "modCount", 2);
        
        java.lang.Object o_LinkedList_3 = new java.lang.Object();
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.LinkedList", "addLastTest", true);
        try {
            method.invoke(instance, list_LinkedList_1, o_LinkedList_3);
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testaddLastTest_5() {
        roops.core.objectsInstrumented.LinkedList instance = new roops.core.objectsInstrumented.LinkedList();
        
        // Parameter Initialization
        
        roops.core.objectsInstrumented.LinkedList list_LinkedList_1 = new roops.core.objectsInstrumented.LinkedList();
        // Fields Initialization for 'list_LinkedList_1'
        
        roops.core.objectsInstrumented.LinkedListNode _LinkedListNode_1 = new roops.core.objectsInstrumented.LinkedListNode();
        // Fields Initialization for '_LinkedListNode_1'
        
        roops.core.objectsInstrumented.LinkedListNode _LinkedListNode_2 = new roops.core.objectsInstrumented.LinkedListNode();
        // Fields Initialization for '_LinkedListNode_2'
        updateValue(_LinkedListNode_2, "previous", _LinkedListNode_1);
        updateValue(_LinkedListNode_2, "next", _LinkedListNode_1);
        
        roops.core.objectsInstrumented.LinkedList _LinkedList_2 = new roops.core.objectsInstrumented.LinkedList();
        updateValue(_LinkedListNode_2, "object_value", _LinkedList_2);
        updateValue(_LinkedListNode_1, "previous", _LinkedListNode_2);
        updateValue(_LinkedListNode_1, "next", _LinkedListNode_2);
        
        roops.core.objectsInstrumented.LinkedListNode _LinkedListNode_3 = new roops.core.objectsInstrumented.LinkedListNode();
        updateValue(_LinkedListNode_1, "object_value", _LinkedListNode_3);
        updateValue(list_LinkedList_1, "header", _LinkedListNode_1);
        updateValue(list_LinkedList_1, "size", 1);
        updateValue(list_LinkedList_1, "modCount", 2);
        
        java.lang.Object o_LinkedList_3 = new java.lang.Object();
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.LinkedList", "addLastTest", true);
        try {
            method.invoke(instance, list_LinkedList_1, o_LinkedList_3);
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testaddLastTest_6() {
        roops.core.objectsInstrumented.LinkedList instance = new roops.core.objectsInstrumented.LinkedList();
        
        // Parameter Initialization
        
        roops.core.objectsInstrumented.LinkedList list_LinkedList_1 = new roops.core.objectsInstrumented.LinkedList();
        // Fields Initialization for 'list_LinkedList_1'
        
        roops.core.objectsInstrumented.LinkedListNode _LinkedListNode_1 = new roops.core.objectsInstrumented.LinkedListNode();
        // Fields Initialization for '_LinkedListNode_1'
        
        roops.core.objectsInstrumented.LinkedListNode _LinkedListNode_2 = new roops.core.objectsInstrumented.LinkedListNode();
        // Fields Initialization for '_LinkedListNode_2'
        updateValue(_LinkedListNode_2, "previous", _LinkedListNode_1);
        updateValue(_LinkedListNode_2, "next", _LinkedListNode_1);
        
        roops.core.objectsInstrumented.LinkedList _LinkedList_2 = new roops.core.objectsInstrumented.LinkedList();
        updateValue(_LinkedListNode_2, "object_value", _LinkedList_2);
        updateValue(_LinkedListNode_1, "previous", _LinkedListNode_2);
        updateValue(_LinkedListNode_1, "next", _LinkedListNode_2);
        
        roops.core.objectsInstrumented.LinkedListNode _LinkedListNode_3 = new roops.core.objectsInstrumented.LinkedListNode();
        updateValue(_LinkedListNode_1, "object_value", _LinkedListNode_3);
        updateValue(list_LinkedList_1, "header", _LinkedListNode_1);
        updateValue(list_LinkedList_1, "size", 1);
        updateValue(list_LinkedList_1, "modCount", 2);
        
        java.lang.Object o_LinkedList_3 = new java.lang.Object();
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.LinkedList", "addLastTest", true);
        try {
            method.invoke(instance, list_LinkedList_1, o_LinkedList_3);
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testaddLastTest_7() {
        roops.core.objectsInstrumented.LinkedList instance = new roops.core.objectsInstrumented.LinkedList();
        
        // Parameter Initialization
        
        roops.core.objectsInstrumented.LinkedList list_LinkedList_1 = new roops.core.objectsInstrumented.LinkedList();
        // Fields Initialization for 'list_LinkedList_1'
        
        roops.core.objectsInstrumented.LinkedListNode _LinkedListNode_1 = new roops.core.objectsInstrumented.LinkedListNode();
        // Fields Initialization for '_LinkedListNode_1'
        
        roops.core.objectsInstrumented.LinkedListNode _LinkedListNode_2 = new roops.core.objectsInstrumented.LinkedListNode();
        // Fields Initialization for '_LinkedListNode_2'
        updateValue(_LinkedListNode_2, "previous", _LinkedListNode_1);
        updateValue(_LinkedListNode_2, "next", _LinkedListNode_1);
        
        roops.core.objectsInstrumented.LinkedList _LinkedList_2 = new roops.core.objectsInstrumented.LinkedList();
        updateValue(_LinkedListNode_2, "object_value", _LinkedList_2);
        updateValue(_LinkedListNode_1, "previous", _LinkedListNode_2);
        updateValue(_LinkedListNode_1, "next", _LinkedListNode_2);
        
        roops.core.objectsInstrumented.LinkedListNode _LinkedListNode_3 = new roops.core.objectsInstrumented.LinkedListNode();
        updateValue(_LinkedListNode_1, "object_value", _LinkedListNode_3);
        updateValue(list_LinkedList_1, "header", _LinkedListNode_1);
        updateValue(list_LinkedList_1, "size", 1);
        updateValue(list_LinkedList_1, "modCount", 2);
        
        java.lang.Object o_LinkedList_3 = new java.lang.Object();
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.LinkedList", "addLastTest", true);
        try {
            method.invoke(instance, list_LinkedList_1, o_LinkedList_3);
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testaddLastTest_8() {
        roops.core.objectsInstrumented.LinkedList instance = new roops.core.objectsInstrumented.LinkedList();
        
        // Parameter Initialization
        
        roops.core.objectsInstrumented.LinkedList list_LinkedList_1 = new roops.core.objectsInstrumented.LinkedList();
        // Fields Initialization for 'list_LinkedList_1'
        
        roops.core.objectsInstrumented.LinkedListNode _LinkedListNode_1 = new roops.core.objectsInstrumented.LinkedListNode();
        // Fields Initialization for '_LinkedListNode_1'
        
        roops.core.objectsInstrumented.LinkedListNode _LinkedListNode_2 = new roops.core.objectsInstrumented.LinkedListNode();
        // Fields Initialization for '_LinkedListNode_2'
        updateValue(_LinkedListNode_2, "previous", _LinkedListNode_1);
        updateValue(_LinkedListNode_2, "next", _LinkedListNode_1);
        
        roops.core.objectsInstrumented.LinkedList _LinkedList_2 = new roops.core.objectsInstrumented.LinkedList();
        updateValue(_LinkedListNode_2, "object_value", _LinkedList_2);
        updateValue(_LinkedListNode_1, "previous", _LinkedListNode_2);
        updateValue(_LinkedListNode_1, "next", _LinkedListNode_2);
        
        roops.core.objectsInstrumented.LinkedListNode _LinkedListNode_3 = new roops.core.objectsInstrumented.LinkedListNode();
        updateValue(_LinkedListNode_1, "object_value", _LinkedListNode_3);
        updateValue(list_LinkedList_1, "header", _LinkedListNode_1);
        updateValue(list_LinkedList_1, "size", 1);
        updateValue(list_LinkedList_1, "modCount", 2);
        
        java.lang.Object o_LinkedList_3 = new java.lang.Object();
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.LinkedList", "addLastTest", true);
        try {
            method.invoke(instance, list_LinkedList_1, o_LinkedList_3);
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testaddLastTest_9() {
        roops.core.objectsInstrumented.LinkedList instance = new roops.core.objectsInstrumented.LinkedList();
        
        // Parameter Initialization
        
        roops.core.objectsInstrumented.LinkedList list_LinkedList_1 = new roops.core.objectsInstrumented.LinkedList();
        // Fields Initialization for 'list_LinkedList_1'
        
        roops.core.objectsInstrumented.LinkedListNode _LinkedListNode_1 = new roops.core.objectsInstrumented.LinkedListNode();
        // Fields Initialization for '_LinkedListNode_1'
        
        roops.core.objectsInstrumented.LinkedListNode _LinkedListNode_2 = new roops.core.objectsInstrumented.LinkedListNode();
        // Fields Initialization for '_LinkedListNode_2'
        updateValue(_LinkedListNode_2, "previous", _LinkedListNode_1);
        updateValue(_LinkedListNode_2, "next", _LinkedListNode_1);
        
        roops.core.objectsInstrumented.LinkedList _LinkedList_2 = new roops.core.objectsInstrumented.LinkedList();
        updateValue(_LinkedListNode_2, "object_value", _LinkedList_2);
        updateValue(_LinkedListNode_1, "previous", _LinkedListNode_2);
        updateValue(_LinkedListNode_1, "next", _LinkedListNode_2);
        
        roops.core.objectsInstrumented.LinkedListNode _LinkedListNode_3 = new roops.core.objectsInstrumented.LinkedListNode();
        updateValue(_LinkedListNode_1, "object_value", _LinkedListNode_3);
        updateValue(list_LinkedList_1, "header", _LinkedListNode_1);
        updateValue(list_LinkedList_1, "size", 1);
        updateValue(list_LinkedList_1, "modCount", 2);
        
        java.lang.Object o_LinkedList_3 = new java.lang.Object();
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.LinkedList", "addLastTest", true);
        try {
            method.invoke(instance, list_LinkedList_1, o_LinkedList_3);
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testaddLastTest_10() {
        roops.core.objectsInstrumented.LinkedList instance = new roops.core.objectsInstrumented.LinkedList();
        
        // Parameter Initialization
        
        roops.core.objectsInstrumented.LinkedList list_LinkedList_1 = new roops.core.objectsInstrumented.LinkedList();
        // Fields Initialization for 'list_LinkedList_1'
        
        roops.core.objectsInstrumented.LinkedListNode _LinkedListNode_1 = new roops.core.objectsInstrumented.LinkedListNode();
        // Fields Initialization for '_LinkedListNode_1'
        updateValue(_LinkedListNode_1, "previous", _LinkedListNode_1);
        updateValue(_LinkedListNode_1, "next", _LinkedListNode_1);
        updateValue(_LinkedListNode_1, "object_value", null);
        updateValue(list_LinkedList_1, "header", _LinkedListNode_1);
        updateValue(list_LinkedList_1, "size", 0);
        updateValue(list_LinkedList_1, "modCount", 0);
        
        java.lang.Object o_LinkedListNode_2 = new java.lang.Object();
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.LinkedList", "addLastTest", true);
        try {
            method.invoke(instance, list_LinkedList_1, o_LinkedListNode_2);
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testaddLastTest_11() {
        roops.core.objectsInstrumented.LinkedList instance = new roops.core.objectsInstrumented.LinkedList();
        
        // Parameter Initialization
        
        roops.core.objectsInstrumented.LinkedList list_LinkedList_1 = new roops.core.objectsInstrumented.LinkedList();
        // Fields Initialization for 'list_LinkedList_1'
        
        roops.core.objectsInstrumented.LinkedListNode _LinkedListNode_1 = new roops.core.objectsInstrumented.LinkedListNode();
        // Fields Initialization for '_LinkedListNode_1'
        updateValue(_LinkedListNode_1, "previous", _LinkedListNode_1);
        updateValue(_LinkedListNode_1, "next", _LinkedListNode_1);
        updateValue(_LinkedListNode_1, "object_value", null);
        updateValue(list_LinkedList_1, "header", _LinkedListNode_1);
        updateValue(list_LinkedList_1, "size", 0);
        updateValue(list_LinkedList_1, "modCount", 0);
        
        java.lang.Object o_LinkedListNode_2 = new java.lang.Object();
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.LinkedList", "addLastTest", true);
        try {
            method.invoke(instance, list_LinkedList_1, o_LinkedListNode_2);
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testaddLastTest_12() {
        roops.core.objectsInstrumented.LinkedList instance = new roops.core.objectsInstrumented.LinkedList();
        
        // Parameter Initialization
        
        roops.core.objectsInstrumented.LinkedList list_LinkedList_1 = new roops.core.objectsInstrumented.LinkedList();
        // Fields Initialization for 'list_LinkedList_1'
        
        roops.core.objectsInstrumented.LinkedListNode _LinkedListNode_1 = new roops.core.objectsInstrumented.LinkedListNode();
        // Fields Initialization for '_LinkedListNode_1'
        updateValue(_LinkedListNode_1, "previous", _LinkedListNode_1);
        updateValue(_LinkedListNode_1, "next", _LinkedListNode_1);
        updateValue(_LinkedListNode_1, "object_value", null);
        updateValue(list_LinkedList_1, "header", _LinkedListNode_1);
        updateValue(list_LinkedList_1, "size", 0);
        updateValue(list_LinkedList_1, "modCount", 0);
        
        java.lang.Object o_LinkedListNode_2 = new java.lang.Object();
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.LinkedList", "addLastTest", true);
        try {
            method.invoke(instance, list_LinkedList_1, o_LinkedListNode_2);
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testaddLastTest_13() {
        roops.core.objectsInstrumented.LinkedList instance = new roops.core.objectsInstrumented.LinkedList();
        
        // Parameter Initialization
        
        roops.core.objectsInstrumented.LinkedList list_LinkedList_1 = new roops.core.objectsInstrumented.LinkedList();
        // Fields Initialization for 'list_LinkedList_1'
        
        roops.core.objectsInstrumented.LinkedListNode _LinkedListNode_1 = new roops.core.objectsInstrumented.LinkedListNode();
        // Fields Initialization for '_LinkedListNode_1'
        updateValue(_LinkedListNode_1, "previous", _LinkedListNode_1);
        updateValue(_LinkedListNode_1, "next", _LinkedListNode_1);
        
        roops.core.objectsInstrumented.LinkedListNode _LinkedListNode_2 = new roops.core.objectsInstrumented.LinkedListNode();
        updateValue(_LinkedListNode_1, "object_value", _LinkedListNode_2);
        updateValue(list_LinkedList_1, "header", _LinkedListNode_1);
        updateValue(list_LinkedList_1, "size", 0);
        updateValue(list_LinkedList_1, "modCount", 0);
        
        java.lang.Object o_LinkedListNode_3 = new java.lang.Object();
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.LinkedList", "addLastTest", true);
        try {
            method.invoke(instance, list_LinkedList_1, o_LinkedListNode_3);
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testaddLastTest_14() {
        roops.core.objectsInstrumented.LinkedList instance = new roops.core.objectsInstrumented.LinkedList();
        
        // Parameter Initialization
        
        roops.core.objectsInstrumented.LinkedList list_LinkedList_1 = new roops.core.objectsInstrumented.LinkedList();
        // Fields Initialization for 'list_LinkedList_1'
        
        roops.core.objectsInstrumented.LinkedListNode _LinkedListNode_1 = new roops.core.objectsInstrumented.LinkedListNode();
        // Fields Initialization for '_LinkedListNode_1'
        
        roops.core.objectsInstrumented.LinkedListNode _LinkedListNode_2 = new roops.core.objectsInstrumented.LinkedListNode();
        // Fields Initialization for '_LinkedListNode_2'
        updateValue(_LinkedListNode_2, "previous", _LinkedListNode_1);
        updateValue(_LinkedListNode_2, "next", _LinkedListNode_1);
        
        java.lang.Object _Object_1 = new java.lang.Object();
        updateValue(_LinkedListNode_2, "object_value", _Object_1);
        updateValue(_LinkedListNode_1, "previous", _LinkedListNode_2);
        updateValue(_LinkedListNode_1, "next", _LinkedListNode_2);
        updateValue(_LinkedListNode_1, "object_value", _LinkedListNode_2);
        updateValue(list_LinkedList_1, "header", _LinkedListNode_1);
        updateValue(list_LinkedList_1, "size", 1);
        updateValue(list_LinkedList_1, "modCount", 2);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.LinkedList", "addLastTest", true);
        try {
            method.invoke(instance, list_LinkedList_1, instance);
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testaddLastTest_15() {
        roops.core.objectsInstrumented.LinkedList instance = new roops.core.objectsInstrumented.LinkedList();
        
        // Parameter Initialization
        
        roops.core.objectsInstrumented.LinkedList list_LinkedList_1 = new roops.core.objectsInstrumented.LinkedList();
        // Fields Initialization for 'list_LinkedList_1'
        
        roops.core.objectsInstrumented.LinkedListNode _LinkedListNode_1 = new roops.core.objectsInstrumented.LinkedListNode();
        // Fields Initialization for '_LinkedListNode_1'
        
        roops.core.objectsInstrumented.LinkedListNode o_LinkedListNode_2 = new roops.core.objectsInstrumented.LinkedListNode();
        // Fields Initialization for 'o_LinkedListNode_2'
        updateValue(o_LinkedListNode_2, "previous", _LinkedListNode_1);
        updateValue(o_LinkedListNode_2, "next", _LinkedListNode_1);
        
        java.lang.Object _Object_1 = new java.lang.Object();
        updateValue(o_LinkedListNode_2, "object_value", _Object_1);
        updateValue(_LinkedListNode_1, "previous", o_LinkedListNode_2);
        updateValue(_LinkedListNode_1, "next", o_LinkedListNode_2);
        
        java.lang.Object _Object_2 = new java.lang.Object();
        updateValue(_LinkedListNode_1, "object_value", _Object_2);
        updateValue(list_LinkedList_1, "header", _LinkedListNode_1);
        updateValue(list_LinkedList_1, "size", 1);
        updateValue(list_LinkedList_1, "modCount", 2);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.LinkedList", "addLastTest", true);
        try {
            method.invoke(instance, list_LinkedList_1, o_LinkedListNode_2);
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testaddLastTest_16() {
        roops.core.objectsInstrumented.LinkedList instance = new roops.core.objectsInstrumented.LinkedList();
        
        // Parameter Initialization
        
        roops.core.objectsInstrumented.LinkedList list_LinkedList_1 = new roops.core.objectsInstrumented.LinkedList();
        // Fields Initialization for 'list_LinkedList_1'
        
        roops.core.objectsInstrumented.LinkedListNode _LinkedListNode_1 = new roops.core.objectsInstrumented.LinkedListNode();
        // Fields Initialization for '_LinkedListNode_1'
        updateValue(_LinkedListNode_1, "previous", _LinkedListNode_1);
        updateValue(_LinkedListNode_1, "next", _LinkedListNode_1);
        updateValue(_LinkedListNode_1, "object_value", null);
        updateValue(list_LinkedList_1, "header", _LinkedListNode_1);
        updateValue(list_LinkedList_1, "size", 0);
        updateValue(list_LinkedList_1, "modCount", -1);
        
        java.lang.Object o_LinkedListNode_2 = new java.lang.Object();
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.LinkedList", "addLastTest", true);
        try {
            method.invoke(instance, list_LinkedList_1, o_LinkedListNode_2);
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }
}