package ar.edu.generated.junit;

import java.lang.reflect.Method;
import java.lang.reflect.Field;
import org.junit.Test;

public class LinkedListTest_removeIndexTest_0 {

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
    public void testremoveIndexTest_0() {
        roops.core.objectsInstrumented.LinkedList instance = null;
        int index_Integer_1 = 1092059307;
        // Parameter Initialization
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.LinkedList", "removeIndexTest", true);
        try {
            method.invoke(instance, new Object[]{instance, index_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testremoveIndexTest_1() {
        roops.core.objectsInstrumented.LinkedList instance = null;
        roops.core.objectsInstrumented.LinkedList list_LinkedList_1 = new roops.core.objectsInstrumented.LinkedList();
        roops.core.objectsInstrumented.LinkedListNode _LinkedListNode_1 = new roops.core.objectsInstrumented.LinkedListNode();
        roops.core.objectsInstrumented.LinkedListNode _LinkedListNode_2 = new roops.core.objectsInstrumented.LinkedListNode();
        roops.core.objectsInstrumented.LinkedListNode _LinkedListNode_3 = new roops.core.objectsInstrumented.LinkedListNode();
        int index_Integer_1 = 32769;
        // Parameter Initialization
        // Fields Initialization for 'list_LinkedList_1'
        // Fields Initialization for '_LinkedListNode_1'
        // Fields Initialization for '_LinkedListNode_2'
        // Fields Initialization for '_LinkedListNode_3'
        updateValue(_LinkedListNode_3, "previous", _LinkedListNode_1);
        updateValue(_LinkedListNode_3, "next", _LinkedListNode_2);
        updateValue(_LinkedListNode_3, "object_value", _LinkedListNode_2);
        updateValue(_LinkedListNode_2, "previous", _LinkedListNode_3);
        updateValue(_LinkedListNode_2, "next", _LinkedListNode_1);
        updateValue(_LinkedListNode_2, "object_value", _LinkedListNode_2);
        updateValue(_LinkedListNode_1, "previous", _LinkedListNode_2);
        updateValue(_LinkedListNode_1, "next", _LinkedListNode_3);
        updateValue(_LinkedListNode_1, "object_value", _LinkedListNode_2);
        updateValue(list_LinkedList_1, "header", _LinkedListNode_1);
        updateValue(list_LinkedList_1, "size", 2);
        updateValue(list_LinkedList_1, "modCount", 1538293760);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.LinkedList", "removeIndexTest", true);
        try {
            method.invoke(instance, new Object[]{list_LinkedList_1, index_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testremoveIndexTest_2() {
        roops.core.objectsInstrumented.LinkedList instance = null;
        roops.core.objectsInstrumented.LinkedList list_LinkedList_1 = new roops.core.objectsInstrumented.LinkedList();
        roops.core.objectsInstrumented.LinkedListNode _LinkedListNode_1 = new roops.core.objectsInstrumented.LinkedListNode();
        roops.core.objectsInstrumented.LinkedListNode _LinkedListNode_2 = new roops.core.objectsInstrumented.LinkedListNode();
        int index_Integer_1 = 1;
        // Parameter Initialization
        // Fields Initialization for 'list_LinkedList_1'
        // Fields Initialization for '_LinkedListNode_1'
        // Fields Initialization for '_LinkedListNode_2'
        updateValue(_LinkedListNode_2, "previous", _LinkedListNode_1);
        updateValue(_LinkedListNode_2, "next", _LinkedListNode_1);
        updateValue(_LinkedListNode_2, "object_value", _LinkedListNode_2);
        updateValue(_LinkedListNode_1, "previous", _LinkedListNode_2);
        updateValue(_LinkedListNode_1, "next", _LinkedListNode_2);
        updateValue(_LinkedListNode_1, "object_value", _LinkedListNode_1);
        updateValue(list_LinkedList_1, "header", _LinkedListNode_1);
        updateValue(list_LinkedList_1, "size", 1);
        updateValue(list_LinkedList_1, "modCount", -269481600);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.LinkedList", "removeIndexTest", true);
        try {
            method.invoke(instance, new Object[]{list_LinkedList_1, index_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testremoveIndexTest_3() {
        roops.core.objectsInstrumented.LinkedList instance = null;
        roops.core.objectsInstrumented.LinkedList list_LinkedList_1 = new roops.core.objectsInstrumented.LinkedList();
        roops.core.objectsInstrumented.LinkedListNode _LinkedListNode_1 = new roops.core.objectsInstrumented.LinkedListNode();
        roops.core.objectsInstrumented.LinkedListNode _LinkedListNode_2 = new roops.core.objectsInstrumented.LinkedListNode();
        roops.core.objectsInstrumented.LinkedListNode _LinkedListNode_3 = new roops.core.objectsInstrumented.LinkedListNode();
        int index_Integer_1 = -1;
        // Parameter Initialization
        // Fields Initialization for 'list_LinkedList_1'
        // Fields Initialization for '_LinkedListNode_1'
        // Fields Initialization for '_LinkedListNode_2'
        updateValue(_LinkedListNode_2, "previous", _LinkedListNode_1);
        updateValue(_LinkedListNode_2, "next", _LinkedListNode_1);
        updateValue(_LinkedListNode_2, "object_value", _LinkedListNode_3);
        updateValue(_LinkedListNode_1, "previous", _LinkedListNode_2);
        updateValue(_LinkedListNode_1, "next", _LinkedListNode_2);
        updateValue(_LinkedListNode_1, "object_value", _LinkedListNode_3);
        updateValue(list_LinkedList_1, "header", _LinkedListNode_1);
        updateValue(list_LinkedList_1, "size", 1);
        updateValue(list_LinkedList_1, "modCount", 4096);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.LinkedList", "removeIndexTest", true);
        try {
            method.invoke(instance, new Object[]{list_LinkedList_1, index_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testremoveIndexTest_4() {
        roops.core.objectsInstrumented.LinkedList instance = null;
        roops.core.objectsInstrumented.LinkedList list_LinkedList_1 = new roops.core.objectsInstrumented.LinkedList();
        roops.core.objectsInstrumented.LinkedListNode _LinkedListNode_1 = new roops.core.objectsInstrumented.LinkedListNode();
        roops.core.objectsInstrumented.LinkedListNode _LinkedListNode_2 = new roops.core.objectsInstrumented.LinkedListNode();
        java.lang.Throwable _Throwable_1 = new java.lang.Throwable();
        int index_Integer_1 = 0;
        // Parameter Initialization
        // Fields Initialization for 'list_LinkedList_1'
        // Fields Initialization for '_LinkedListNode_1'
        // Fields Initialization for '_LinkedListNode_2'
        updateValue(_LinkedListNode_2, "previous", _LinkedListNode_1);
        updateValue(_LinkedListNode_2, "next", _LinkedListNode_1);
        updateValue(_LinkedListNode_2, "object_value", null);
        updateValue(_LinkedListNode_1, "previous", _LinkedListNode_2);
        updateValue(_LinkedListNode_1, "next", _LinkedListNode_2);
        updateValue(_LinkedListNode_1, "object_value", _Throwable_1);
        updateValue(list_LinkedList_1, "header", _LinkedListNode_1);
        updateValue(list_LinkedList_1, "size", 1);
        updateValue(list_LinkedList_1, "modCount", 1337834969);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.LinkedList", "removeIndexTest", true);
        try {
            method.invoke(instance, new Object[]{list_LinkedList_1, index_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testremoveIndexTest_5() {
        roops.core.objectsInstrumented.LinkedList instance = null;
        roops.core.objectsInstrumented.LinkedList list_LinkedList_1 = new roops.core.objectsInstrumented.LinkedList();
        roops.core.objectsInstrumented.LinkedListNode _LinkedListNode_1 = new roops.core.objectsInstrumented.LinkedListNode();
        roops.core.objectsInstrumented.LinkedListNode _LinkedListNode_2 = new roops.core.objectsInstrumented.LinkedListNode();
        roops.core.objectsInstrumented.LinkedListNode _LinkedListNode_3 = new roops.core.objectsInstrumented.LinkedListNode();
        java.lang.ArithmeticException _ArithmeticException_1 = new java.lang.ArithmeticException();
        int index_Integer_1 = 0;
        // Parameter Initialization
        // Fields Initialization for 'list_LinkedList_1'
        // Fields Initialization for '_LinkedListNode_1'
        // Fields Initialization for '_LinkedListNode_2'
        // Fields Initialization for '_LinkedListNode_3'
        updateValue(_LinkedListNode_3, "previous", _LinkedListNode_1);
        updateValue(_LinkedListNode_3, "next", _LinkedListNode_2);
        updateValue(_LinkedListNode_3, "object_value", _ArithmeticException_1);
        updateValue(_LinkedListNode_2, "previous", _LinkedListNode_3);
        updateValue(_LinkedListNode_2, "next", _LinkedListNode_1);
        updateValue(_LinkedListNode_2, "object_value", _LinkedListNode_3);
        updateValue(_LinkedListNode_1, "previous", _LinkedListNode_2);
        updateValue(_LinkedListNode_1, "next", _LinkedListNode_3);
        updateValue(_LinkedListNode_1, "object_value", _LinkedListNode_3);
        updateValue(list_LinkedList_1, "header", _LinkedListNode_1);
        updateValue(list_LinkedList_1, "size", 2);
        updateValue(list_LinkedList_1, "modCount", -467399426);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.LinkedList", "removeIndexTest", true);
        try {
            method.invoke(instance, new Object[]{list_LinkedList_1, index_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }
}