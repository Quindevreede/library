package nl.quin.library.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController {

    @GetMapping("/secure")
    public ResponseEntity<Object> librarySecure() {
        return ResponseEntity.ok("Security demo - ADMIN only");
    }

    @GetMapping("/users_only")
    public ResponseEntity<Object> libraryPublic() {
        return ResponseEntity.ok("Security demo - USER and ADMIN access");
    }

    @GetMapping("/all")
    public ResponseEntity<Object> libraryEverybody() {
        return ResponseEntity.ok("Landingspagina for everybody");
    }

}