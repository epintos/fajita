package ar.edu.generated.junit;

import java.lang.reflect.Method;
import java.lang.reflect.Field;
import org.junit.Test;

public class LinkedListTest_containsTest_0 {

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
        roops.core.objectsInstrumented.LinkedList instance = null;
        roops.core.objectsInstrumented.LinkedList list_LinkedList_1 = new roops.core.objectsInstrumented.LinkedList();
        roops.core.objectsInstrumented.LinkedListNode _LinkedListNode_1 = new roops.core.objectsInstrumented.LinkedListNode();
        roops.core.objectsInstrumented.LinkedListNode _LinkedListNode_2 = new roops.core.objectsInstrumented.LinkedListNode();
        java.lang.Object arg_Throwable_1 = new java.lang.Object();
        // Parameter Initialization
        // Fields Initialization for 'list_LinkedList_1'
        // Fields Initialization for '_LinkedListNode_1'
        // Fields Initialization for '_LinkedListNode_2'
        updateValue(_LinkedListNode_2, "previous", _LinkedListNode_1);
        updateValue(_LinkedListNode_2, "next", _LinkedListNode_1);
        updateValue(_LinkedListNode_2, "object_value", _LinkedListNode_1);
        updateValue(_LinkedListNode_1, "previous", _LinkedListNode_2);
        updateValue(_LinkedListNode_1, "next", _LinkedListNode_2);
        updateValue(_LinkedListNode_1, "object_value", _LinkedListNode_1);
        updateValue(list_LinkedList_1, "header", _LinkedListNode_1);
        updateValue(list_LinkedList_1, "size", 1);
        updateValue(list_LinkedList_1, "modCount", 0);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.LinkedList", "containsTest", true);
        try {
            method.invoke(instance, new Object[]{list_LinkedList_1, arg_Throwable_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testcontainsTest_1() {
        roops.core.objectsInstrumented.LinkedList instance = null;
        roops.core.objectsInstrumented.LinkedList list_LinkedList_1 = new roops.core.objectsInstrumented.LinkedList();
        roops.core.objectsInstrumented.LinkedListNode _LinkedListNode_1 = new roops.core.objectsInstrumented.LinkedListNode();
        roops.core.objectsInstrumented.LinkedListNode arg_LinkedListNode_2 = new roops.core.objectsInstrumented.LinkedListNode();
        java.lang.RuntimeException _RuntimeException_1 = new java.lang.RuntimeException();
        // Parameter Initialization
        // Fields Initialization for 'list_LinkedList_1'
        // Fields Initialization for '_LinkedListNode_1'
        // Fields Initialization for 'arg_LinkedListNode_2'
        updateValue(arg_LinkedListNode_2, "previous", _LinkedListNode_1);
        updateValue(arg_LinkedListNode_2, "next", _LinkedListNode_1);
        updateValue(arg_LinkedListNode_2, "object_value", arg_LinkedListNode_2);
        updateValue(_LinkedListNode_1, "previous", arg_LinkedListNode_2);
        updateValue(_LinkedListNode_1, "next", arg_LinkedListNode_2);
        updateValue(_LinkedListNode_1, "object_value", _RuntimeException_1);
        updateValue(list_LinkedList_1, "header", _LinkedListNode_1);
        updateValue(list_LinkedList_1, "size", 1);
        updateValue(list_LinkedList_1, "modCount", 0);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.LinkedList", "containsTest", true);
        try {
            method.invoke(instance, new Object[]{list_LinkedList_1, arg_LinkedListNode_2});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testcontainsTest_2() {
        roops.core.objectsInstrumented.LinkedList instance = null;
        roops.core.objectsInstrumented.LinkedList list_LinkedList_1 = new roops.core.objectsInstrumented.LinkedList();
        roops.core.objectsInstrumented.LinkedListNode _LinkedListNode_1 = new roops.core.objectsInstrumented.LinkedListNode();
        roops.core.objectsInstrumented.LinkedListNode _LinkedListNode_2 = new roops.core.objectsInstrumented.LinkedListNode();
        java.lang.Object arg_LinkedListNode_3 = new java.lang.Object();
        // Parameter Initialization
        // Fields Initialization for 'list_LinkedList_1'
        // Fields Initialization for '_LinkedListNode_1'
        // Fields Initialization for '_LinkedListNode_2'
        updateValue(_LinkedListNode_2, "previous", _LinkedListNode_1);
        updateValue(_LinkedListNode_2, "next", _LinkedListNode_1);
        updateValue(_LinkedListNode_2, "object_value", null);
        updateValue(_LinkedListNode_1, "previous", _LinkedListNode_2);
        updateValue(_LinkedListNode_1, "next", _LinkedListNode_2);
        updateValue(_LinkedListNode_1, "object_value", _LinkedListNode_2);
        updateValue(list_LinkedList_1, "header", _LinkedListNode_1);
        updateValue(list_LinkedList_1, "size", 1);
        updateValue(list_LinkedList_1, "modCount", 0);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.LinkedList", "containsTest", true);
        try {
            method.invoke(instance, new Object[]{list_LinkedList_1, arg_LinkedListNode_3});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testcontainsTest_3() {
        roops.core.objectsInstrumented.LinkedList instance = null;
        roops.core.objectsInstrumented.LinkedList list_LinkedList_1 = new roops.core.objectsInstrumented.LinkedList();
        roops.core.objectsInstrumented.LinkedListNode arg_LinkedListNode_1 = new roops.core.objectsInstrumented.LinkedListNode();
        java.lang.RuntimeException _RuntimeException_1 = new java.lang.RuntimeException();
        // Parameter Initialization
        // Fields Initialization for 'list_LinkedList_1'
        // Fields Initialization for 'arg_LinkedListNode_1'
        updateValue(arg_LinkedListNode_1, "previous", arg_LinkedListNode_1);
        updateValue(arg_LinkedListNode_1, "next", arg_LinkedListNode_1);
        updateValue(arg_LinkedListNode_1, "object_value", _RuntimeException_1);
        updateValue(list_LinkedList_1, "header", arg_LinkedListNode_1);
        updateValue(list_LinkedList_1, "size", 0);
        updateValue(list_LinkedList_1, "modCount", 0);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.LinkedList", "containsTest", true);
        try {
            method.invoke(instance, new Object[]{list_LinkedList_1, arg_LinkedListNode_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testcontainsTest_4() {
        roops.core.objectsInstrumented.LinkedList instance = null;
        java.lang.Object arg_LinkedListNode_1 = new java.lang.Object();
        // Parameter Initialization
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.LinkedList", "containsTest", true);
        try {
            method.invoke(instance, new Object[]{instance, arg_LinkedListNode_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testcontainsTest_5() {
        roops.core.objectsInstrumented.LinkedList instance = null;
        roops.core.objectsInstrumented.LinkedList arg_LinkedList_1 = new roops.core.objectsInstrumented.LinkedList();
        roops.core.objectsInstrumented.LinkedListNode _LinkedListNode_1 = new roops.core.objectsInstrumented.LinkedListNode();
        roops.core.objectsInstrumented.LinkedListNode _LinkedListNode_2 = new roops.core.objectsInstrumented.LinkedListNode();
        // Parameter Initialization
        // Fields Initialization for 'arg_LinkedList_1'
        // Fields Initialization for '_LinkedListNode_1'
        // Fields Initialization for '_LinkedListNode_2'
        updateValue(_LinkedListNode_2, "previous", _LinkedListNode_1);
        updateValue(_LinkedListNode_2, "next", _LinkedListNode_1);
        updateValue(_LinkedListNode_2, "object_value", arg_LinkedList_1);
        updateValue(_LinkedListNode_1, "previous", _LinkedListNode_2);
        updateValue(_LinkedListNode_1, "next", _LinkedListNode_2);
        updateValue(_LinkedListNode_1, "object_value", null);
        updateValue(arg_LinkedList_1, "header", _LinkedListNode_1);
        updateValue(arg_LinkedList_1, "size", 1);
        updateValue(arg_LinkedList_1, "modCount", 0);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.LinkedList", "containsTest", true);
        try {
            method.invoke(instance, new Object[]{arg_LinkedList_1, arg_LinkedList_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testcontainsTest_6() {
        roops.core.objectsInstrumented.LinkedList instance = null;
        roops.core.objectsInstrumented.LinkedList list_LinkedList_1 = new roops.core.objectsInstrumented.LinkedList();
        roops.core.objectsInstrumented.LinkedListNode _LinkedListNode_1 = new roops.core.objectsInstrumented.LinkedListNode();
        roops.core.objectsInstrumented.LinkedListNode arg_LinkedListNode_2 = new roops.core.objectsInstrumented.LinkedListNode();
        java.lang.NullPointerException _NullPointerException_1 = new java.lang.NullPointerException();
        // Parameter Initialization
        // Fields Initialization for 'list_LinkedList_1'
        // Fields Initialization for '_LinkedListNode_1'
        // Fields Initialization for 'arg_LinkedListNode_2'
        updateValue(arg_LinkedListNode_2, "previous", _LinkedListNode_1);
        updateValue(arg_LinkedListNode_2, "next", _LinkedListNode_1);
        updateValue(arg_LinkedListNode_2, "object_value", _LinkedListNode_1);
        updateValue(_LinkedListNode_1, "previous", arg_LinkedListNode_2);
        updateValue(_LinkedListNode_1, "next", arg_LinkedListNode_2);
        updateValue(_LinkedListNode_1, "object_value", _NullPointerException_1);
        updateValue(list_LinkedList_1, "header", _LinkedListNode_1);
        updateValue(list_LinkedList_1, "size", 1);
        updateValue(list_LinkedList_1, "modCount", 0);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.LinkedList", "containsTest", true);
        try {
            method.invoke(instance, new Object[]{list_LinkedList_1, arg_LinkedListNode_2});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testcontainsTest_7() {
        roops.core.objectsInstrumented.LinkedList instance = null;
        roops.core.objectsInstrumented.LinkedList list_LinkedList_1 = new roops.core.objectsInstrumented.LinkedList();
        roops.core.objectsInstrumented.LinkedListNode _LinkedListNode_1 = new roops.core.objectsInstrumented.LinkedListNode();
        roops.core.objectsInstrumented.LinkedListNode arg_LinkedListNode_2 = new roops.core.objectsInstrumented.LinkedListNode();
        // Parameter Initialization
        // Fields Initialization for 'list_LinkedList_1'
        // Fields Initialization for '_LinkedListNode_1'
        // Fields Initialization for 'arg_LinkedListNode_2'
        updateValue(arg_LinkedListNode_2, "previous", _LinkedListNode_1);
        updateValue(arg_LinkedListNode_2, "next", _LinkedListNode_1);
        updateValue(arg_LinkedListNode_2, "object_value", null);
        updateValue(_LinkedListNode_1, "previous", arg_LinkedListNode_2);
        updateValue(_LinkedListNode_1, "next", arg_LinkedListNode_2);
        updateValue(_LinkedListNode_1, "object_value", _LinkedListNode_1);
        updateValue(list_LinkedList_1, "header", _LinkedListNode_1);
        updateValue(list_LinkedList_1, "size", 1);
        updateValue(list_LinkedList_1, "modCount", 0);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.LinkedList", "containsTest", true);
        try {
            method.invoke(instance, new Object[]{list_LinkedList_1, arg_LinkedListNode_2});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testcontainsTest_8() {
        roops.core.objectsInstrumented.LinkedList instance = null;
        java.lang.Object arg_Exception_1 = new java.lang.Object();
        // Parameter Initialization
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.LinkedList", "containsTest", true);
        try {
            method.invoke(instance, new Object[]{instance, arg_Exception_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testcontainsTest_9() {
        roops.core.objectsInstrumented.LinkedList instance = null;
        roops.core.objectsInstrumented.LinkedList list_LinkedList_1 = new roops.core.objectsInstrumented.LinkedList();
        roops.core.objectsInstrumented.LinkedListNode _LinkedListNode_1 = new roops.core.objectsInstrumented.LinkedListNode();
        roops.core.objectsInstrumented.LinkedListNode arg_LinkedListNode_2 = new roops.core.objectsInstrumented.LinkedListNode();
        java.lang.Exception _Exception_1 = new java.lang.Exception();
        // Parameter Initialization
        // Fields Initialization for 'list_LinkedList_1'
        // Fields Initialization for '_LinkedListNode_1'
        // Fields Initialization for 'arg_LinkedListNode_2'
        updateValue(arg_LinkedListNode_2, "previous", _LinkedListNode_1);
        updateValue(arg_LinkedListNode_2, "next", _LinkedListNode_1);
        updateValue(arg_LinkedListNode_2, "object_value", _LinkedListNode_1);
        updateValue(_LinkedListNode_1, "previous", arg_LinkedListNode_2);
        updateValue(_LinkedListNode_1, "next", arg_LinkedListNode_2);
        updateValue(_LinkedListNode_1, "object_value", _Exception_1);
        updateValue(list_LinkedList_1, "header", _LinkedListNode_1);
        updateValue(list_LinkedList_1, "size", 1);
        updateValue(list_LinkedList_1, "modCount", 0);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.LinkedList", "containsTest", true);
        try {
            method.invoke(instance, new Object[]{list_LinkedList_1, arg_LinkedListNode_2});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testcontainsTest_10() {
        roops.core.objectsInstrumented.LinkedList instance = null;
        roops.core.objectsInstrumented.LinkedList list_LinkedList_1 = new roops.core.objectsInstrumented.LinkedList();
        roops.core.objectsInstrumented.LinkedListNode _LinkedListNode_1 = new roops.core.objectsInstrumented.LinkedListNode();
        roops.core.objectsInstrumented.LinkedListNode _LinkedListNode_2 = new roops.core.objectsInstrumented.LinkedListNode();
        roops.core.objectsInstrumented.LinkedListNode _LinkedListNode_3 = new roops.core.objectsInstrumented.LinkedListNode();
        java.lang.Exception arg_Exception_1 = new java.lang.Exception();
        java.lang.Exception _Exception_2 = new java.lang.Exception();
        // Parameter Initialization
        // Fields Initialization for 'list_LinkedList_1'
        // Fields Initialization for '_LinkedListNode_1'
        // Fields Initialization for '_LinkedListNode_2'
        // Fields Initialization for '_LinkedListNode_3'
        updateValue(_LinkedListNode_3, "previous", _LinkedListNode_1);
        updateValue(_LinkedListNode_3, "next", _LinkedListNode_2);
        updateValue(_LinkedListNode_3, "object_value", arg_Exception_1);
        updateValue(_LinkedListNode_2, "previous", _LinkedListNode_3);
        updateValue(_LinkedListNode_2, "next", _LinkedListNode_1);
        updateValue(_LinkedListNode_2, "object_value", _LinkedListNode_1);
        updateValue(_LinkedListNode_1, "previous", _LinkedListNode_2);
        updateValue(_LinkedListNode_1, "next", _LinkedListNode_3);
        updateValue(_LinkedListNode_1, "object_value", _Exception_2);
        updateValue(list_LinkedList_1, "header", _LinkedListNode_1);
        updateValue(list_LinkedList_1, "size", 2);
        updateValue(list_LinkedList_1, "modCount", 0);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.LinkedList", "containsTest", true);
        try {
            method.invoke(instance, new Object[]{list_LinkedList_1, arg_Exception_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testcontainsTest_11() {
        roops.core.objectsInstrumented.LinkedList instance = null;
        roops.core.objectsInstrumented.LinkedList list_LinkedList_1 = new roops.core.objectsInstrumented.LinkedList();
        roops.core.objectsInstrumented.LinkedListNode arg_LinkedListNode_1 = new roops.core.objectsInstrumented.LinkedListNode();
        // Parameter Initialization
        // Fields Initialization for 'list_LinkedList_1'
        // Fields Initialization for 'arg_LinkedListNode_1'
        updateValue(arg_LinkedListNode_1, "previous", arg_LinkedListNode_1);
        updateValue(arg_LinkedListNode_1, "next", arg_LinkedListNode_1);
        updateValue(arg_LinkedListNode_1, "object_value", arg_LinkedListNode_1);
        updateValue(list_LinkedList_1, "header", arg_LinkedListNode_1);
        updateValue(list_LinkedList_1, "size", 0);
        updateValue(list_LinkedList_1, "modCount", 0);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.LinkedList", "containsTest", true);
        try {
            method.invoke(instance, new Object[]{list_LinkedList_1, arg_LinkedListNode_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testcontainsTest_12() {
        roops.core.objectsInstrumented.LinkedList instance = null;
        roops.core.objectsInstrumented.LinkedList list_LinkedList_1 = new roops.core.objectsInstrumented.LinkedList();
        roops.core.objectsInstrumented.LinkedListNode _LinkedListNode_1 = new roops.core.objectsInstrumented.LinkedListNode();
        roops.core.objectsInstrumented.LinkedListNode _LinkedListNode_2 = new roops.core.objectsInstrumented.LinkedListNode();
        java.lang.Object arg_LinkedListNode_3 = new java.lang.Object();
        // Parameter Initialization
        // Fields Initialization for 'list_LinkedList_1'
        // Fields Initialization for '_LinkedListNode_1'
        // Fields Initialization for '_LinkedListNode_2'
        updateValue(_LinkedListNode_2, "previous", _LinkedListNode_1);
        updateValue(_LinkedListNode_2, "next", _LinkedListNode_1);
        updateValue(_LinkedListNode_2, "object_value", null);
        updateValue(_LinkedListNode_1, "previous", _LinkedListNode_2);
        updateValue(_LinkedListNode_1, "next", _LinkedListNode_2);
        updateValue(_LinkedListNode_1, "object_value", _LinkedListNode_2);
        updateValue(list_LinkedList_1, "header", _LinkedListNode_1);
        updateValue(list_LinkedList_1, "size", 1);
        updateValue(list_LinkedList_1, "modCount", 0);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.LinkedList", "containsTest", true);
        try {
            method.invoke(instance, new Object[]{list_LinkedList_1, arg_LinkedListNode_3});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testcontainsTest_13() {
        roops.core.objectsInstrumented.LinkedList instance = null;
        java.lang.Object arg_Throwable_1 = new java.lang.Object();
        // Parameter Initialization
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.LinkedList", "containsTest", true);
        try {
            method.invoke(instance, new Object[]{instance, arg_Throwable_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testcontainsTest_14() {
        roops.core.objectsInstrumented.LinkedList instance = null;
        java.lang.Object arg_Exception_1 = new java.lang.Object();
        // Parameter Initialization
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.LinkedList", "containsTest", true);
        try {
            method.invoke(instance, new Object[]{instance, arg_Exception_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testcontainsTest_15() {
        roops.core.objectsInstrumented.LinkedList instance = null;
        roops.core.objectsInstrumented.LinkedList list_LinkedList_1 = new roops.core.objectsInstrumented.LinkedList();
        roops.core.objectsInstrumented.LinkedListNode _LinkedListNode_1 = new roops.core.objectsInstrumented.LinkedListNode();
        roops.core.objectsInstrumented.LinkedListNode arg_LinkedListNode_2 = new roops.core.objectsInstrumented.LinkedListNode();
        java.lang.Exception _Exception_1 = new java.lang.Exception();
        // Parameter Initialization
        // Fields Initialization for 'list_LinkedList_1'
        // Fields Initialization for '_LinkedListNode_1'
        // Fields Initialization for 'arg_LinkedListNode_2'
        updateValue(arg_LinkedListNode_2, "previous", _LinkedListNode_1);
        updateValue(arg_LinkedListNode_2, "next", _LinkedListNode_1);
        updateValue(arg_LinkedListNode_2, "object_value", _LinkedListNode_1);
        updateValue(_LinkedListNode_1, "previous", arg_LinkedListNode_2);
        updateValue(_LinkedListNode_1, "next", arg_LinkedListNode_2);
        updateValue(_LinkedListNode_1, "object_value", _Exception_1);
        updateValue(list_LinkedList_1, "header", _LinkedListNode_1);
        updateValue(list_LinkedList_1, "size", 1);
        updateValue(list_LinkedList_1, "modCount", 0);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.LinkedList", "containsTest", true);
        try {
            method.invoke(instance, new Object[]{list_LinkedList_1, arg_LinkedListNode_2});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testcontainsTest_16() {
        roops.core.objectsInstrumented.LinkedList instance = null;
        roops.core.objectsInstrumented.LinkedList list_LinkedList_1 = new roops.core.objectsInstrumented.LinkedList();
        roops.core.objectsInstrumented.LinkedListNode _LinkedListNode_1 = new roops.core.objectsInstrumented.LinkedListNode();
        roops.core.objectsInstrumented.LinkedListNode _LinkedListNode_2 = new roops.core.objectsInstrumented.LinkedListNode();
        roops.core.objectsInstrumented.LinkedListNode _LinkedListNode_3 = new roops.core.objectsInstrumented.LinkedListNode();
        java.lang.Exception arg_Exception_1 = new java.lang.Exception();
        java.lang.Exception _Exception_2 = new java.lang.Exception();
        // Parameter Initialization
        // Fields Initialization for 'list_LinkedList_1'
        // Fields Initialization for '_LinkedListNode_1'
        // Fields Initialization for '_LinkedListNode_2'
        // Fields Initialization for '_LinkedListNode_3'
        updateValue(_LinkedListNode_3, "previous", _LinkedListNode_1);
        updateValue(_LinkedListNode_3, "next", _LinkedListNode_2);
        updateValue(_LinkedListNode_3, "object_value", arg_Exception_1);
        updateValue(_LinkedListNode_2, "previous", _LinkedListNode_3);
        updateValue(_LinkedListNode_2, "next", _LinkedListNode_1);
        updateValue(_LinkedListNode_2, "object_value", _LinkedListNode_1);
        updateValue(_LinkedListNode_1, "previous", _LinkedListNode_2);
        updateValue(_LinkedListNode_1, "next", _LinkedListNode_3);
        updateValue(_LinkedListNode_1, "object_value", _Exception_2);
        updateValue(list_LinkedList_1, "header", _LinkedListNode_1);
        updateValue(list_LinkedList_1, "size", 2);
        updateValue(list_LinkedList_1, "modCount", 0);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.LinkedList", "containsTest", true);
        try {
            method.invoke(instance, new Object[]{list_LinkedList_1, arg_Exception_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testcontainsTest_17() {
        roops.core.objectsInstrumented.LinkedList instance = null;
        roops.core.objectsInstrumented.LinkedList list_LinkedList_1 = new roops.core.objectsInstrumented.LinkedList();
        roops.core.objectsInstrumented.LinkedListNode arg_LinkedListNode_1 = new roops.core.objectsInstrumented.LinkedListNode();
        // Parameter Initialization
        // Fields Initialization for 'list_LinkedList_1'
        // Fields Initialization for 'arg_LinkedListNode_1'
        updateValue(arg_LinkedListNode_1, "previous", arg_LinkedListNode_1);
        updateValue(arg_LinkedListNode_1, "next", arg_LinkedListNode_1);
        updateValue(arg_LinkedListNode_1, "object_value", arg_LinkedListNode_1);
        updateValue(list_LinkedList_1, "header", arg_LinkedListNode_1);
        updateValue(list_LinkedList_1, "size", 0);
        updateValue(list_LinkedList_1, "modCount", 0);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.LinkedList", "containsTest", true);
        try {
            method.invoke(instance, new Object[]{list_LinkedList_1, arg_LinkedListNode_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testcontainsTest_18() {
        roops.core.objectsInstrumented.LinkedList instance = null;
        roops.core.objectsInstrumented.LinkedList list_LinkedList_1 = new roops.core.objectsInstrumented.LinkedList();
        roops.core.objectsInstrumented.LinkedListNode _LinkedListNode_1 = new roops.core.objectsInstrumented.LinkedListNode();
        roops.core.objectsInstrumented.LinkedListNode _LinkedListNode_2 = new roops.core.objectsInstrumented.LinkedListNode();
        java.lang.Object arg_LinkedListNode_3 = new java.lang.Object();
        // Parameter Initialization
        // Fields Initialization for 'list_LinkedList_1'
        // Fields Initialization for '_LinkedListNode_1'
        // Fields Initialization for '_LinkedListNode_2'
        updateValue(_LinkedListNode_2, "previous", _LinkedListNode_1);
        updateValue(_LinkedListNode_2, "next", _LinkedListNode_1);
        updateValue(_LinkedListNode_2, "object_value", null);
        updateValue(_LinkedListNode_1, "previous", _LinkedListNode_2);
        updateValue(_LinkedListNode_1, "next", _LinkedListNode_2);
        updateValue(_LinkedListNode_1, "object_value", _LinkedListNode_2);
        updateValue(list_LinkedList_1, "header", _LinkedListNode_1);
        updateValue(list_LinkedList_1, "size", 1);
        updateValue(list_LinkedList_1, "modCount", 0);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.LinkedList", "containsTest", true);
        try {
            method.invoke(instance, new Object[]{list_LinkedList_1, arg_LinkedListNode_3});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }
}