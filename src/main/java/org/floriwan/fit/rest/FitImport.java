package org.floriwan.fit.rest;

import com.garmin.fit.FitDecoder;
import com.garmin.fit.FitMessages;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.FileInputStream;
import java.io.IOException;

public class FitImport {
    @PostMapping("/")
    public String handleFitUpload(@RequestParam("file") MultipartFile file,
                                  RedirectAttributes redirectAttributes) {

        FileInputStream inputStream;
        FitDecoder fitDecoder = new FitDecoder();

        try {
            inputStream = (FileInputStream) file.getInputStream();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        FitMessages fitMessages = fitDecoder.decode(inputStream);
        System.out.println("file decoded");
        printMessageSummary(fitMessages);

        return "redirect:/";
    }

    private static void printMessageSummary(FitMessages fitMessages) {
        if(!fitMessages.getFileIdMesgs().isEmpty()) {
            System.out.println("file id messages  : " + fitMessages.getFileIdMesgs().size());
            System.out.println("activity messages : " + fitMessages.getActivityMesgs().size());
            System.out.println("activity messages : " + fitMessages.getRecordMesgs().size());
        }
    }

}
