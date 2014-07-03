package ar.edu.generated.junit;

import java.lang.reflect.Method;
import java.lang.reflect.Field;
import org.junit.Test;

public class OurTestsTest_test1 {

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
    public void testtest1_0() {
        roops.core.objectsInstrumented.OurTests instance = new roops.core.objectsInstrumented.OurTests();
        
        // Parameter Initialization
        int o_Integer_1 = 0;
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.OurTests", "test1", true);
        try {
            method.invoke(instance, o_Integer_1);
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testtest1_1() {
        roops.core.objectsInstrumented.OurTests instance = new roops.core.objectsInstrumented.OurTests();
        
        // Parameter Initialization
        int m_Integer_1 = 5;
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.OurTests", "test1", true);
        try {
            method.invoke(instance, m_Integer_1);
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testtest1_2() {
        roops.core.objectsInstrumented.OurTests instance = new roops.core.objectsInstrumented.OurTests();
        
        // Parameter Initialization
        int m_Integer_1 = 5;
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.OurTests", "test1", true);
        try {
            method.invoke(instance, m_Integer_1);
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testtest1_3() {
        roops.core.objectsInstrumented.OurTests instance = new roops.core.objectsInstrumented.OurTests();
        
        // Parameter Initialization
        int m_Integer_1 = 5;
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.OurTests", "test1", true);
        try {
            method.invoke(instance, m_Integer_1);
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testtest1_4() {
        roops.core.objectsInstrumented.OurTests instance = new roops.core.objectsInstrumented.OurTests();
        
        // Parameter Initialization
        int m_Integer_1 = 5;
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.OurTests", "test1", true);
        try {
            method.invoke(instance, m_Integer_1);
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testtest1_5() {
        roops.core.objectsInstrumented.OurTests instance = new roops.core.objectsInstrumented.OurTests();
        
        // Parameter Initialization
        int m_Integer_1 = 5;
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.OurTests", "test1", true);
        try {
            method.invoke(instance, m_Integer_1);
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testtest1_6() {
        roops.core.objectsInstrumented.OurTests instance = new roops.core.objectsInstrumented.OurTests();
        
        // Parameter Initialization
        int m_Integer_1 = 5;
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.OurTests", "test1", true);
        try {
            method.invoke(instance, m_Integer_1);
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testtest1_7() {
        roops.core.objectsInstrumented.OurTests instance = new roops.core.objectsInstrumented.OurTests();
        
        // Parameter Initialization
        int m_Integer_1 = 5;
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.OurTests", "test1", true);
        try {
            method.invoke(instance, m_Integer_1);
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testtest1_8() {
        roops.core.objectsInstrumented.OurTests instance = new roops.core.objectsInstrumented.OurTests();
        
        // Parameter Initialization
        int m_Integer_1 = 0;
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.OurTests", "test1", true);
        try {
            method.invoke(instance, m_Integer_1);
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testtest1_9() {
        roops.core.objectsInstrumented.OurTests instance = new roops.core.objectsInstrumented.OurTests();
        
        // Parameter Initialization
        int m_Integer_1 = 0;
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.OurTests", "test1", true);
        try {
            method.invoke(instance, m_Integer_1);
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testtest1_10() {
        roops.core.objectsInstrumented.OurTests instance = new roops.core.objectsInstrumented.OurTests();
        
        // Parameter Initialization
        int m_Integer_1 = 5;
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.OurTests", "test1", true);
        try {
            method.invoke(instance, m_Integer_1);
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testtest1_11() {
        roops.core.objectsInstrumented.OurTests instance = new roops.core.objectsInstrumented.OurTests();
        
        // Parameter Initialization
        int m_Integer_1 = 5;
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.OurTests", "test1", true);
        try {
            method.invoke(instance, m_Integer_1);
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testtest1_12() {
        roops.core.objectsInstrumented.OurTests instance = new roops.core.objectsInstrumented.OurTests();
        
        // Parameter Initialization
        int m_Integer_1 = 5;
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.OurTests", "test1", true);
        try {
            method.invoke(instance, m_Integer_1);
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testtest1_13() {
        roops.core.objectsInstrumented.OurTests instance = new roops.core.objectsInstrumented.OurTests();
        
        // Parameter Initialization
        int m_Integer_1 = 5;
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.OurTests", "test1", true);
        try {
            method.invoke(instance, m_Integer_1);
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testtest1_14() {
        roops.core.objectsInstrumented.OurTests instance = new roops.core.objectsInstrumented.OurTests();
        
        // Parameter Initialization
        int m_Integer_1 = 4;
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.OurTests", "test1", true);
        try {
            method.invoke(instance, m_Integer_1);
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testtest1_15() {
        roops.core.objectsInstrumented.OurTests instance = new roops.core.objectsInstrumented.OurTests();
        
        // Parameter Initialization
        int m_Integer_1 = 5;
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.OurTests", "test1", true);
        try {
            method.invoke(instance, m_Integer_1);
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testtest1_16() {
        roops.core.objectsInstrumented.OurTests instance = new roops.core.objectsInstrumented.OurTests();
        
        // Parameter Initialization
        int m_Integer_1 = 4;
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.OurTests", "test1", true);
        try {
            method.invoke(instance, m_Integer_1);
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testtest1_17() {
        roops.core.objectsInstrumented.OurTests instance = new roops.core.objectsInstrumented.OurTests();
        
        // Parameter Initialization
        int m_Integer_1 = 1450704623;
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.OurTests", "test1", true);
        try {
            method.invoke(instance, m_Integer_1);
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testtest1_18() {
        roops.core.objectsInstrumented.OurTests instance = new roops.core.objectsInstrumented.OurTests();
        
        // Parameter Initialization
        int m_Integer_1 = 0;
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.OurTests", "test1", true);
        try {
            method.invoke(instance, m_Integer_1);
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testtest1_19() {
        roops.core.objectsInstrumented.OurTests instance = new roops.core.objectsInstrumented.OurTests();
        
        // Parameter Initialization
        int m_Integer_1 = 0;
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.OurTests", "test1", true);
        try {
            method.invoke(instance, m_Integer_1);
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testtest1_20() {
        roops.core.objectsInstrumented.OurTests instance = new roops.core.objectsInstrumented.OurTests();
        
        // Parameter Initialization
        int m_Integer_1 = 0;
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.OurTests", "test1", true);
        try {
            method.invoke(instance, m_Integer_1);
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }

    @Test
    public void testtest1_21() {
        roops.core.objectsInstrumented.OurTests instance = new roops.core.objectsInstrumented.OurTests();
        
        // Parameter Initialization
        int m_Integer_1 = 0;
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objectsInstrumented.OurTests", "test1", true);
        try {
            method.invoke(instance, m_Integer_1);
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }
}