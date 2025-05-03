package level03.exercise01.application;

import level03.exercise01.annotation.JsonSerializable;

/**
 * PROGRAM: AnnotationInspector
 * AUTHOR: Diego Balaguer
 * DATE: 30/04/2025
 */

public class AnnotationInspector {
    public static void inspectAnnotation(Object obj) {
        Class<?> objClass = obj.getClass();

        if (objClass.isAnnotationPresent(JsonSerializable.class)) {
            JsonSerializable annotation = objClass.getAnnotation(JsonSerializable.class);
            System.out.println("✅ Annotation found!");
            System.out.println("Directory value: " + annotation.directory());
        } else {
            System.out.println("❌ No @JsonSerializable annotation present on class: " + objClass.getSimpleName());
        }
    }
}