package kg.itschool.reservationconferencehall.controllers;


import kg.itschool.reservationconferencehall.models.dto.ConfRoomDto;
import kg.itschool.reservationconferencehall.models.requests.CreateConfRoomRequest;
import kg.itschool.reservationconferencehall.services.ConfRoomService;
import lombok.AccessLevel;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/conf-room")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ConfRoomController {

    @NonNull ConfRoomService confRoomService;

    @PostMapping("/create")
    public ResponseEntity create(@RequestBody CreateConfRoomRequest request){


        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(confRoomService.create(request));

    }

    @PostMapping("/save")
    public ResponseEntity save(@RequestBody ConfRoomDto confRoomDto){
         ConfRoomDto savedBook = confRoomService.save(confRoomDto);

        return ResponseEntity.
                status(HttpStatus.OK)
                .body(savedBook);
    }

    @GetMapping("/delete")
    public ResponseEntity delete(@RequestParam Long id){
        return  ResponseEntity
                .status(HttpStatus.OK)
                .body(confRoomService.delete(id));
    }

    @GetMapping("/getById")
    public ResponseEntity findById(@RequestParam Long id) {
        ConfRoomDto confRoomDto = confRoomService.findById(id);

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(confRoomDto);
    }

    @GetMapping("/get-all")
    public ResponseEntity findByAll() {


        return ResponseEntity
                .status(HttpStatus.OK)
                .body(confRoomService.findAllConfRoom());
    }

//http:/10.244.53.44/api/v1/conf-room/get-all

}
