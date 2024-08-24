package com.uta.edu.plc.controller;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class SrcMLExample {

    public static void main(String[] args) {
        String inputFilePath = " D:\\Satheesh\\Personal\\UTA\\GRA\\Sample\\Sample EQ\\Old EQ\\LOGEQUOld.S05";
        String outputFilePath = "D:\\Satheesh\\Personal\\UTA\\GRA\\Sample\\Sample EQ\\Old EQ\\LOGEQUOld1213.xml";

        try {
            // Run srcML command
            runSrcML(inputFilePath, outputFilePath);

            // Read and print the generated XML
            String xmlContent = new String(Files.readAllBytes(Paths.get(outputFilePath)));
            System.out.println(xmlContent);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void runSrcML(String inputFilePath, String outputFilePath) throws IOException {
        ProcessBuilder processBuilder = new ProcessBuilder("srcml", inputFilePath, "-o", outputFilePath, " --language Java ");//--language Java 
        processBuilder.redirectErrorStream(true);
        Process process = processBuilder.start();

        try (InputStream inputStream = process.getInputStream()) {
            StringBuilder output = new StringBuilder();
            int i;
            while ((i = inputStream.read()) != -1) {
                output.append((char) i);
            }
            System.out.println(output.toString());
        }
    }
}

