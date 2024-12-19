package store.util;

import store.domain.Product;
import store.domain.Promotion;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MarkdownReader {

    private final String PRODUCT_PATH = "/products.md";
    private final String PROMOTION_PATH = "/promotions.md";
    private final String DELIMITER = ",";

    private BufferedReader setPath(String path) {
        InputStream inputStream = getClass().getResourceAsStream(path);
        return new BufferedReader(new InputStreamReader(inputStream));
    }

    private List<String> separateByDelimiter(String line, String delimiter) {
        return new ArrayList<>(List.of(line.split(delimiter)));
    }

}
