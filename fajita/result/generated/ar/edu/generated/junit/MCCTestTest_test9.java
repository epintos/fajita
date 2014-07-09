package ar.edu.generated.junit;

import java.lang.reflect.Method;
import java.lang.reflect.Field;
import org.junit.Test;

public class MCCTestTest_test9 {

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
    public void testtest9_0() {
        roops.core.objectsInstrumented.MCCTest instance = new roops.core.objectsInstrumented.MCCTest();
        
        // Parameter Initialization
        boolean a_Boolean_1 = true;
        boolean d_Boolean_2 = false;
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.MCCTest", "test9", true);
        try {
            method.invoke(instance, a_Boolean_1, a_Boolean_1, a_Boolean_1, d_Boolean_2, d_Boolean_2);
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testtest9_1() {
        roops.core.objectsInstrumented.MCCTest instance = new roops.core.objectsInstrumented.MCCTest();
        
        // Parameter Initialization
        boolean a_Boolean_1 = true;
        boolean e_Boolean_2 = false;
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.MCCTest", "test9", true);
        try {
            method.invoke(instance, a_Boolean_1, a_Boolean_1, a_Boolean_1, a_Boolean_1, e_Boolean_2);
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testtest9_2() {
        roops.core.objectsInstrumented.MCCTest instance = new roops.core.objectsInstrumented.MCCTest();
        
        // Parameter Initialization
        boolean a_Boolean_1 = true;
        boolean d_Boolean_2 = false;
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.MCCTest", "test9", true);
        try {
            method.invoke(instance, a_Boolean_1, a_Boolean_1, a_Boolean_1, d_Boolean_2, a_Boolean_1);
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testtest9_3() {
        roops.core.objectsInstrumented.MCCTest instance = new roops.core.objectsInstrumented.MCCTest();
        
        // Parameter Initialization
        boolean a_Boolean_1 = true;
        boolean b_Boolean_2 = false;
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.MCCTest", "test9", true);
        try {
            method.invoke(instance, a_Boolean_1, b_Boolean_2, b_Boolean_2, a_Boolean_1, a_Boolean_1);
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }
}