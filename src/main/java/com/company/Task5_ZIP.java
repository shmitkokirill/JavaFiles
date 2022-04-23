package com.company;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class Task5_ZIP {
    public void createZipArchive(String sourceFile) throws IOException {
        File fileToZip = new File(sourceFile);
        FileOutputStream fos =
                new FileOutputStream(fileToZip.getName() + ".zip");
        ZipOutputStream zipOut = new ZipOutputStream(fos);
        FileInputStream fis = new FileInputStream(fileToZip);
        ZipEntry zipEntry = new ZipEntry(fileToZip.getName());
        zipOut.putNextEntry(zipEntry);
        byte[] bytes = new byte[1024];
        int length;
        while((length = fis.read(bytes)) >= 0) {
            zipOut.write(bytes, 0, length);
        }
        zipOut.close();
        fis.close();
        fos.close();
    }

    public String unzipFile(String fileName) throws IOException {
        byte[] buffer = new byte[1024];
        ZipInputStream zis = new ZipInputStream(new FileInputStream(fileName));
        ZipEntry zipEntry = zis.getNextEntry();
        String fileInfo = new String();
        File newFile =
                new File(
                        "UZ_" +
                                fileName.substring(0, fileName.length() - 4)

                );
        // write file content
        FileOutputStream fos = new FileOutputStream(newFile);
        int len;
        while ((len = zis.read(buffer)) > 0) {
            fos.write(buffer, 0, len);
        }
        fos.close();
        fileInfo += "Zip file info...\n";
        fileInfo += "Size of input file: " + zipEntry.getSize() + "\n";
        fileInfo +=
                "Size of compressed file: " +
                        zipEntry.getCompressedSize() +
                        "\n";
        zis.closeEntry();
        zis.close();
        return fileInfo;
    }
}
