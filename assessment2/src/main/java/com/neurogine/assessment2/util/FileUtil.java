package com.neurogine.assessment2.util;

import java.io.File;
import java.io.IOException;

/**
 * @version : 1.0.0
 * @description :
 * @author : SanWaiLwin
 * @date : Jun 27, 2024 3:46:53 PM
 */
public class FileUtil {

	public static File createFile(String fileName) throws IOException {
        File file = new File(fileName);
        if (!file.exists()) {
            if (!file.createNewFile()) {
                throw new IOException("Failed to create file: " + fileName);
            }
        }
        return file;
    }

    public static void deleteFile(String fileName) throws IOException {
        File file = new File(fileName);
        if (file.exists()) {
            if (!file.delete()) {
                throw new IOException("Failed to delete file: " + fileName);
            }
        }
    }
}
