package com.devtalles.project.task;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.everit.json.schema.Schema;
import org.everit.json.schema.ValidationException;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class JsonValidatorWithGson {

    /**
     * Carga un JSON Schema (person-schema.json) usando org.json + everit.
     */
    public static Schema loadSchema(String schemaPath) throws IOException {
        try (InputStream inputStream = Files.newInputStream(Path.of(schemaPath))) {
            JSONObject rawSchema = new JSONObject(new JSONTokener(inputStream));
            return SchemaLoader.load(rawSchema);
        }
    }

    /**
     * Valida una lista de Person (ya en memoria) contra el esquema dado.
     * Usa Gson para pasar de List<Person> a texto JSON, y org.json para
     * convertir ese texto en la estructura que espera la librería de validación.
     */
    public static boolean validatePersons(List<Person> persons, Schema schema) {
        Gson gson = new Gson();
        String json = gson.toJson(persons);
        JSONArray jsonArray = new JSONArray(json);

        try {
            schema.validate(jsonArray);
            System.out.println("JSON válido según el esquema.");
            return true;
        } catch (ValidationException e) {
            System.out.println("JSON inválido. Errores encontrados:");
            e.getAllMessages().forEach(msg -> System.out.println(" - " + msg));
            return false;
        }
    }

    /**
     * Lee un archivo con una lista de Person (usando Gson) y lo valida
     * contra el esquema indicado.
     */
    public static boolean validatePersonFile(String jsonPath, String schemaPath) throws IOException {
        Schema schema = loadSchema(schemaPath);

        Gson gson = new Gson();
        Type listType = new TypeToken<List<Person>>() {}.getType();
        List<Person> persons;
        try (FileReader fr = new FileReader(jsonPath)) {
            persons = gson.fromJson(fr, listType);
        }

        return validatePersons(persons, schema);
    }

    public static void main(String[] args) {
        try {
            boolean valid = validatePersonFile("person.json", "person-schema.json");
            System.out.println(valid ? "Validación exitosa" : "Validación fallida");
        } catch (IOException e) {
            System.out.println("Error leyendo archivos: " + e.getMessage());
        }
    }
}
