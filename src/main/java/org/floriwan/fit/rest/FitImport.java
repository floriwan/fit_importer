package org.floriwan.fit.rest;

import com.garmin.fit.FitDecoder;
import com.garmin.fit.FitMessages;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.floriwan.fit.data.FileIdRepository;
import org.floriwan.fit.data.FitFileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.FileInputStream;
import java.io.IOException;

@RestController
public class FitImport {

    private static Log log = LogFactory.getLog(FitImport.class);

    @PostMapping("/test")
    public ResponseEntity<String> handleTest() {
        log.debug("handle test debug ...");
        log.info("handle test info ...");
        return ResponseEntity.status(HttpStatus.OK).body("test ok");
    }

    @PostMapping("/")
    public String handleFitUpload(@RequestParam("file") MultipartFile file,
                                  RedirectAttributes redirectAttributes)
            throws IOException {

        log.info("handle fit file upload ...");
        log.debug("handle fit file upload ...");

        long size = file.getSize();
        log.info("upload file size : " + size);

        FileInputStream inputStream;
        FitDecoder fitDecoder = new FitDecoder();
        inputStream = (FileInputStream) file.getInputStream();
        FitMessages fitMessages = fitDecoder.decode(inputStream);

        FitImporter.getInstance().Import(
                fitFileRepository,
                fileIdRepository,
                file.getOriginalFilename(),
                fitMessages);

        //printMessageSummary(fitMessages);
        //log.info("import date : " + fitMessages.getDeviceInfoMesgs().get(0).getTimestamp());
        //log.info("file name : " + file.getOriginalFilename());

        return "redirect:/";
    }

    @Autowired
    public FitFileRepository fitFileRepository;

    @Autowired
    public FileIdRepository fileIdRepository;

    /*
    private static void printMessageSummary(FitMessages fitMessages) {
        if(!fitMessages.getFileIdMesgs().isEmpty()) {
            System.out.println("file id messages  : " + fitMessages.getFileIdMesgs().size());
            System.out.println("device info messages  : " + fitMessages.getDeviceInfoMesgs().size());
            System.out.println("activity messages : " + fitMessages.getActivityMesgs().size());
            System.out.println("record messages : " + fitMessages.getRecordMesgs().size());
        }
    }*/

}
