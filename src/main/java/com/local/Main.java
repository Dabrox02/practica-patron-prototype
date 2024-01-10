package com.local;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Document> documents = new ArrayList<>();
        TextDocument doc = new TextDocument("asdasdas");
        ImageDocument image = new ImageDocument("archivo.jpg");
        documents.add(doc);
        documents.add((Document) doc.clone());
        documents.add(image);
        for (Document document : documents) {
            if (document.getClass().getSimpleName().equalsIgnoreCase("textdocument")) {
                TextDocument txt = (TextDocument) document;
                System.out.println(txt.getTexto());
            }
            if (document.getClass().getSimpleName().equalsIgnoreCase("imagedocument")) {
                ImageDocument txt = (ImageDocument) document;
                System.out.println(txt.getFilename());
            }

        }

    }
}