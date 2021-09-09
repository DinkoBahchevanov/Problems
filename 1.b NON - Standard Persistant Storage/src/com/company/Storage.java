package com.company;

import java.io.*;

public class Storage {

    private CustomMap<String, Object> map;
    private final String directoryPath;
    private final String directory;
    private FileWriter fileWriter;
    private File file;
    private File data;

    public Storage() throws IOException {
        directoryPath = "src/com/company/";
        directory = directoryPath.concat("database/");

        file = new File(directory);
        data = new File(directory + "data.txt");

        if (!file.exists()) {
            file.mkdir();
            data.createNewFile();
        }
        map = new CustomMap<>();
        fillMap();
        fileWriter = new FileWriter(data.getPath(), true);
    }

    private void fillMap() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(data));
        String currentLine;
        while ((currentLine = reader.readLine()) != null) {
            String[] line = currentLine.split(" - ");
            map.put(line[0], line[1]);
        }
        reader.close();
    }

    public void put(String key, Object value) throws IOException {
        map.put(key, value);

        fileWriter.append(key).append(" - ").append(value.toString()).append(System.lineSeparator());
        fileWriter.flush();
    }

    public Object get(String key) {
        return map.get(key);
    }

    public boolean contains(String key) {
        return map.containsKey(key);
    }

    public boolean remove(String key) throws IOException {
        if (map.containsKey(key)) {
            BufferedReader reader = new BufferedReader(new FileReader(data));
            File tempData = new File(directory + "tempData.txt");
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempData));

            String currentLine;

            while ((currentLine = reader.readLine()) != null) {
                String trimmedLine = currentLine.trim();
                if (trimmedLine.contains(key)) continue;
                writer.write(currentLine + System.lineSeparator());
            }
            reader.close();
            writer.close();

            map.remove(key);
            fileWriter.close();

            data.delete();
            tempData.renameTo(new File("src/com/company/database/data.txt"));
            return true;
        }
        return false;
    }
}
