package com.example.crudUniversirario.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Passgenerator {

	
    public static void main(String ...args) {
    	
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(4);
        //El String que mandamos al metodo encode es el password que queremos encriptar.
        System.out.println(bCryptPasswordEncoder.encode("user12345"));
    }
    
    
}

//admin12345   --  $2a$04$gKqCR85.4GEaTIh22fNXf.EkBdUpAIaIFRwAUiirFVRXfCgRDPCGK
//user12345    --  $2a$04$WCNBLZTITBaokkglOU7.DeVjbHeQwsFR3mYa91IJq.fyR1FGb2Dd.
