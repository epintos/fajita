package ar.edu.generated.junit;

import java.lang.reflect.Method;
import java.lang.reflect.Field;
import org.junit.Test;

public class SinglyLinkedListTest_insertBackTest_0 {

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
    public void testinsertBackTest_0() {
        roops.core.objectsInstrumented.SinglyLinkedList instance = null;
        roops.core.objectsInstrumented.SinglyLinkedList list_SinglyLinkedList_1 = new roops.core.objectsInstrumented.SinglyLinkedList();
        int arg_Integer_1 = 0;
        // Parameter Initialization
        // Fields Initialization for 'list_SinglyLinkedList_1'
        updateValue(list_SinglyLinkedList_1, "header", null);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.SinglyLinkedList", "insertBackTest", true);
        try {
            method.invoke(instance, new Object[]{list_SinglyLinkedList_1, arg_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testinsertBackTest_1() {
        roops.core.objectsInstrumented.SinglyLinkedList instance = null;
        int arg_Integer_1 = -1337284319;
        // Parameter Initialization
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.SinglyLinkedList", "insertBackTest", true);
        try {
            method.invoke(instance, new Object[]{instance, arg_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testinsertBackTest_2() {
        roops.core.objectsInstrumented.SinglyLinkedList instance = null;
        roops.core.objectsInstrumented.SinglyLinkedList list_SinglyLinkedList_1 = new roops.core.objectsInstrumented.SinglyLinkedList();
        roops.core.objectsInstrumented.SinglyLinkedListNode _SinglyLinkedListNode_1 = new roops.core.objectsInstrumented.SinglyLinkedListNode();
        roops.core.objectsInstrumented.SinglyLinkedListNode _SinglyLinkedListNode_2 = new roops.core.objectsInstrumented.SinglyLinkedListNode();
        int arg_Integer_1 = 1014496820;
        // Parameter Initialization
        // Fields Initialization for 'list_SinglyLinkedList_1'
        // Fields Initialization for '_SinglyLinkedListNode_1'
        // Fields Initialization for '_SinglyLinkedListNode_2'
        updateValue(_SinglyLinkedListNode_2, "next", null);
        updateValue(_SinglyLinkedListNode_2, "value", 1014496820);
        updateValue(_SinglyLinkedListNode_1, "next", _SinglyLinkedListNode_2);
        updateValue(_SinglyLinkedListNode_1, "value", 0);
        updateValue(list_SinglyLinkedList_1, "header", _SinglyLinkedListNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.SinglyLinkedList", "insertBackTest", true);
        try {
            method.invoke(instance, new Object[]{list_SinglyLinkedList_1, arg_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testinsertBackTest_3() {
        roops.core.objectsInstrumented.SinglyLinkedList instance = null;
        roops.core.objectsInstrumented.SinglyLinkedList list_SinglyLinkedList_1 = new roops.core.objectsInstrumented.SinglyLinkedList();
        roops.core.objectsInstrumented.SinglyLinkedListNode _SinglyLinkedListNode_1 = new roops.core.objectsInstrumented.SinglyLinkedListNode();
        int arg_Integer_1 = 6561824;
        // Parameter Initialization
        // Fields Initialization for 'list_SinglyLinkedList_1'
        // Fields Initialization for '_SinglyLinkedListNode_1'
        updateValue(_SinglyLinkedListNode_1, "next", null);
        updateValue(_SinglyLinkedListNode_1, "value", 0);
        updateValue(list_SinglyLinkedList_1, "header", _SinglyLinkedListNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.SinglyLinkedList", "insertBackTest", true);
        try {
            method.invoke(instance, new Object[]{list_SinglyLinkedList_1, arg_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testinsertBackTest_4() {
        roops.core.objectsInstrumented.SinglyLinkedList instance = null;
        roops.core.objectsInstrumented.SinglyLinkedList list_SinglyLinkedList_1 = new roops.core.objectsInstrumented.SinglyLinkedList();
        roops.core.objectsInstrumented.SinglyLinkedListNode _SinglyLinkedListNode_1 = new roops.core.objectsInstrumented.SinglyLinkedListNode();
        roops.core.objectsInstrumented.SinglyLinkedListNode _SinglyLinkedListNode_2 = new roops.core.objectsInstrumented.SinglyLinkedListNode();
        roops.core.objectsInstrumented.SinglyLinkedListNode _SinglyLinkedListNode_3 = new roops.core.objectsInstrumented.SinglyLinkedListNode();
        int arg_Integer_1 = 341854006;
        // Parameter Initialization
        // Fields Initialization for 'list_SinglyLinkedList_1'
        // Fields Initialization for '_SinglyLinkedListNode_1'
        // Fields Initialization for '_SinglyLinkedListNode_2'
        // Fields Initialization for '_SinglyLinkedListNode_3'
        updateValue(_SinglyLinkedListNode_3, "next", null);
        updateValue(_SinglyLinkedListNode_3, "value", 341854006);
        updateValue(_SinglyLinkedListNode_2, "next", _SinglyLinkedListNode_3);
        updateValue(_SinglyLinkedListNode_2, "value", 0);
        updateValue(_SinglyLinkedListNode_1, "next", _SinglyLinkedListNode_2);
        updateValue(_SinglyLinkedListNode_1, "value", 0);
        updateValue(list_SinglyLinkedList_1, "header", _SinglyLinkedListNode_1);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.SinglyLinkedList", "insertBackTest", true);
        try {
            method.invoke(instance, new Object[]{list_SinglyLinkedList_1, arg_Integer_1});
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }
}