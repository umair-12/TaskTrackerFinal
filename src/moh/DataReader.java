/**
 * This class @ DataReader reads the data from file (fileName)
 */
package moh;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Umair
 * @version 2018.09.26
 */
public class DataReader {

    private final String fileName;

    /**
     * @param fileName intakes the file
     */
    public DataReader(String fileName) {
        this.fileName = fileName;
    }

    /**
     * @return the taskList
     */
    public List<ToDoTaskList> readFromFile() {

        List<ToDoTaskList> taskList = new ArrayList<>();

        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName));
            Object record = inputStream.readObject();
            ToDoTaskList task = (ToDoTaskList) record;
            while (record != null) {
                taskList.add(task);
                task = (ToDoTaskList) inputStream.readObject();
            }
            inputStream.close();

        } catch (FileNotFoundException ef) {
            System.out.print(ef.getMessage() + "File not found");
        } catch (IOException e) {
            
        } catch (ClassNotFoundException e) {
            System.out.print(e.getMessage() + "class not found");
        }

        return taskList;

    }
}