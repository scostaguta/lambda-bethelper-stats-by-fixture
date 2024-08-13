package cl.bethelper.main.util;

import cl.bethelper.main.vo.Root;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;

public class JSONUtil {
    private static final ObjectMapper MAPPER = new ObjectMapper();

    /**
     *
     * @param path
     * @return
     */
    public static Root readJSONFixtures(String path){
        Root root = null;
        try (FileReader reader = new FileReader(path)) {
            root = MAPPER.readValue(reader, Root.class);
        } catch (IOException e) {
            System.out.println(" error " + e.getMessage());
        }
        return root;
    }

    /**
     *
     * @param is
     * @return
     */
    public static Root readJSONFixtures(InputStream is){
        Root root = null;
        try (Reader reader = new InputStreamReader(is)) {
            root = MAPPER.readValue(reader, Root.class);
        } catch (IOException e) {
            System.out.println(" error " + e.getMessage());
        }
        return root;
    }


    public static String DtoToJSON(Root root){
        String json = null;
        try {
            json = MAPPER.writeValueAsString(root);

        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

        return json;
    }
}
