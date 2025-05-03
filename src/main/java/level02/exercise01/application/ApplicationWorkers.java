package level02.exercise01.application;

import com.fasterxml.jackson.databind.ObjectMapper;
import level02.exercise01.Utils.FileUtils;
import level02.exercise01.annotation.JsonSerializable;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * PROGRAM: AplicationWorkers
 * AUTHOR: Diego Balaguer
 * DATE: 30/04/2025
 */

public class ApplicationWorkers {
    private static final ObjectMapper mapper = new ObjectMapper();

    public static void serializeToJson(Object object) {
        Class<?> clazz = object.getClass();

        checkIsCorrectPathAnnotation(clazz);

        JsonSerializable annotation = clazz.getAnnotation(JsonSerializable.class);
        Path directoryPath = Paths.get(annotation.directory());

        FileUtils.isCorrectPath(directoryPath);

        Path filePath = directoryPath.resolve(clazz.getSimpleName() + ".json");

        try {
            mapper.writerWithDefaultPrettyPrinter().writeValue(filePath.toFile(), object);
            System.out.printf("✅ Serialized '%s' to: %s%n", clazz.getSimpleName(), filePath.toAbsolutePath());
        } catch (IOException e) {
            throw new RuntimeException("❌ Failed to serialize object: " + e.getMessage(), e);
        }
    }

    public static <T> T deserializeFromJson(Class<T> clazz) {
        checkIsCorrectPathAnnotation(clazz);

        JsonSerializable annotation = clazz.getAnnotation(JsonSerializable.class);
        Path directoryPath = Paths.get(annotation.directory());

        Path jsonFile = directoryPath.resolve(clazz.getSimpleName() + ".json");

        FileUtils.exist(jsonFile);

        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(jsonFile.toFile(), clazz);
        } catch (IOException e) {
            throw new RuntimeException("❌ Deserialization failed: " + e.getMessage(), e);
        }
    }

    private static void checkIsCorrectPathAnnotation(Class<?> clazz) {
        if (!clazz.isAnnotationPresent(JsonSerializable.class)) {
            throw new IllegalArgumentException(
                    "❌ Missing @JsonSerializable annotation on class: " + clazz.getName()
            );
        }
    }
}

