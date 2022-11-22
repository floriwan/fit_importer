package org.floriwan.fit.rest;

import com.garmin.fit.FitDecoder;
import com.garmin.fit.FitMessages;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.floriwan.fit.data.FileIdRepository;
import org.floriwan.fit.data.FitUploadRepository;
import org.floriwan.fit.data.RecordRepository;
import org.floriwan.fit.data.SessionRepository;
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
    public ResponseEntity<String> handleFitUpload(@RequestParam("file") MultipartFile file,
                                                  RedirectAttributes redirectAttributes)
    {

        log.info("upload fit file [" + file.getOriginalFilename() + "]" );
        log.debug("upload file size : " + file.getSize());

        FileInputStream inputStream;
        FitDecoder fitDecoder = new FitDecoder();

        try {
            inputStream = (FileInputStream) file.getInputStream();
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("cannot read upload file [" + file.getOriginalFilename() + "]");
        }

        FitMessages fitMessages = fitDecoder.decode(inputStream);

        FitImporter.getInstance().Import(
                fitUploadRepository,
                fileIdRepository,
                sessionRepository,
                recordRepository,
                file.getOriginalFilename(),
                fitMessages);

        return ResponseEntity.status(HttpStatus.OK).body("upload success");
    }

    @Autowired
    public FitUploadRepository fitUploadRepository;

    @Autowired
    public FileIdRepository fileIdRepository;

    @Autowired
    public SessionRepository sessionRepository;

    @Autowired
    public RecordRepository recordRepository;
}
