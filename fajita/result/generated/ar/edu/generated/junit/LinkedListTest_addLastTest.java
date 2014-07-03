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
        updateValue(_LinkedListNode_1, "previous", _LinkedListNode_1);
        updateValue(_LinkedListNode_1, "next", _LinkedListNode_1);
        
        java.lang.Object _Object_1 = new java.lang.Object();
        updateValue(_LinkedListNode_1, "object_value", _Object_1);
        updateValue(list_LinkedList_1, "header", _LinkedListNode_1);
        updateValue(list_LinkedList_1, "size", 0);
        updateValue(list_LinkedList_1, "modCount", 1656988586);
        
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
    public void testaddLastTest_1() {
        roops.core.objectsInstrumented.LinkedList instance = new roops.core.objectsInstrumented.LinkedList();
        
        // Parameter Initialization
        
        roops.core.objectsInstrumented.LinkedList list_LinkedList_1 = new roops.core.objectsInstrumented.LinkedList();
        // Fields Initialization for 'list_LinkedList_1'
        
        roops.core.objectsInstrumented.LinkedListNode _LinkedListNode_1 = new roops.core.objectsInstrumented.LinkedListNode();
        // Fields Initialization for '_LinkedListNode_1'
        updateValue(_LinkedListNode_1, "previous", _LinkedListNode_1);
        updateValue(_LinkedListNode_1, "next", _LinkedListNode_1);
        
        java.lang.Object _Object_1 = new java.lang.Object();
        updateValue(_LinkedListNode_1, "object_value", _Object_1);
        updateValue(list_LinkedList_1, "header", _LinkedListNode_1);
        updateValue(list_LinkedList_1, "size", 0);
        updateValue(list_LinkedList_1, "modCount", 0);
        
        java.lang.Object o_Object_2 = new java.lang.Object();
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.LinkedList", "addLastTest", true);
        try {
            method.invoke(instance, list_LinkedList_1, o_Object_2);
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
        updateValue(_LinkedListNode_1, "previous", _LinkedListNode_1);
        updateValue(_LinkedListNode_1, "next", _LinkedListNode_1);
        
        java.lang.Object _Object_1 = new java.lang.Object();
        updateValue(_LinkedListNode_1, "object_value", _Object_1);
        updateValue(list_LinkedList_1, "header", _LinkedListNode_1);
        updateValue(list_LinkedList_1, "size", 0);
        updateValue(list_LinkedList_1, "modCount", 0);
        
        java.lang.Object o_Object_2 = new java.lang.Object();
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.LinkedList", "addLastTest", true);
        try {
            method.invoke(instance, list_LinkedList_1, o_Object_2);
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
        updateValue(_LinkedListNode_1, "previous", _LinkedListNode_1);
        updateValue(_LinkedListNode_1, "next", _LinkedListNode_1);
        
        java.lang.Object _Object_1 = new java.lang.Object();
        updateValue(_LinkedListNode_1, "object_value", _Object_1);
        updateValue(list_LinkedList_1, "header", _LinkedListNode_1);
        updateValue(list_LinkedList_1, "size", 0);
        updateValue(list_LinkedList_1, "modCount", 0);
        
        java.lang.Object o_Object_2 = new java.lang.Object();
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.LinkedList", "addLastTest", true);
        try {
            method.invoke(instance, list_LinkedList_1, o_Object_2);
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }
}