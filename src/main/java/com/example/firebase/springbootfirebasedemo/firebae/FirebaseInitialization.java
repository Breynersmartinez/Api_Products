package com.example.firebase.springbootfirebasedemo.firebae;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

@Service
public class FirebaseInitialization {


    @PostConstruct
    public void initialization(){

        FileInputStream serviceAccount =
                null;
        try {
            serviceAccount = new FileInputStream("./dbproyecttest.json");

        FirebaseOptions options = new FirebaseOptions.Builder()
                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                .build();

        FirebaseApp.initializeApp(options);
        System.out.println(" Conexion!  ");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
