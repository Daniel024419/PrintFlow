package com.spring.printFlow.controllers;

// import java.io.FileInputStream;
import java.util.Arrays;

// import org.apache.poi.xslf.usermodel.XMLSlideShow;
// import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.mindrot.jbcrypt.BCrypt;

public class ValidationController {
    // hash password helper
    // Hash the password using BCrypt
    public static String hashPassword(String plainTextPassword) {
        // The higher the workload factor, the more time is needed to hash the password
        int workload = 12;
        return BCrypt.hashpw(plainTextPassword, BCrypt.gensalt(workload));
    }

    public static boolean isImageFile(String filename) {
        // Add logic to check if the file extension corresponds to common image types
        String[] allowedImageExtensions = { "jpg", "jpeg", "png", "gif", "pdf", "doc", "docx", "txt", "ppt", "pptx" };
        String fileExtension = getFileExtension(filename);

        return Arrays.asList(allowedImageExtensions).contains(fileExtension.toLowerCase());
    }

    public static String getFileExtension(String filename) {
        int lastDotIndex = filename.lastIndexOf('.');
        if (lastDotIndex > 0) {
            return filename.substring(lastDotIndex + 1);
        }
        return "";
    }

    public static boolean checkPassword(String enteredPassword, String hashedPassword) {
        return BCrypt.checkpw(enteredPassword, hashedPassword);
    }


    //hash to ken
    /***
     * hash token
     * **/
    public static String hashToken(String plainToken) {
        // The higher the workload factor, the more time is needed to hash the password
        int workload = 12;
        return BCrypt.hashpw(plainToken, BCrypt.gensalt(workload));
    }

    /**
     * check token 
     *
     * */
    public static boolean checkToken(String headerToken, String hashedToken) {
        return BCrypt.checkpw(headerToken, hashedToken);
    }


}
