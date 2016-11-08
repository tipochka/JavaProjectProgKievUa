package oop.lesson4.homework.fs;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Xepcoh on 30.09.2016.
 */
public class Directory {
    private List<Directory> directoryList = new ArrayList<>();
    private List<File> fileList = new ArrayList<>();

    private static int dirId = 1;
    private static int fId = 1;

    public Directory(File file, File file1) {
        add(file);
        add(file1);
    }

    public Directory() {}

    public Directory(File file) {
        add(file);
    }

    public Directory(Directory directory, File file1) {
        add(directory);
        add(file1);
    }

    public Directory add(Directory directory) {
        checkDirectory(directory);
        directoryList.add(directory);
        return this;
    }

    public Directory add(File file) {
        fileList.add(file);
        return this;
    }

    public List<Directory> getDirectoryList() {
        return directoryList;
    }

    public List<File> getFileList() {
        return fileList;
    }

    private void checkDirectory(Directory directory) {
        checkThisDirectory(directory);
        checkDirectoryList(directory);
    }

    private void checkThisDirectory(Directory directory) {
        if (this == directory) {
            throw new IllegalArgumentException("Incorrect directory");
        }
    }

    public void checkDirectoryList(Directory directory) {
        for (Directory dir : directoryList) {
            if (dir == directory) {
                throw new IllegalArgumentException("Incorrect directory");
            }
            dir.checkDirectoryList(directory);
        }
    }

    public String getSize(){
        String result = "root\n";
        result += getDirString(this, "");
        return result;
    }

    public String getDirString(Directory directory, String prefix){
        String result = "";

        for (Directory dir : directory.getDirectoryList()) {
            result += prefix+"|--- dir"+dirId + "\n";
            dirId++;
            result += dir.getDirString(dir, "|    "+prefix);
        }

        for (File file : directory.getFileList()) {
            result += prefix+"|--- f"+fId+" ("+file.getSize()+" B)\n";
            fId++;
        }
        return result;
    }
}