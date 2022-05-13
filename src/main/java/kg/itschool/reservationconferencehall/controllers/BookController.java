package kg.itschool.reservationconferencehall.controllers;

import kg.itschool.reservationconferencehall.models.dto.BookDto;

import kg.itschool.reservationconferencehall.respons.BookSaveResponse;
import kg.itschool.reservationconferencehall.services.BookService;
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
@RequestMapping("/api/v1/book")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BookController {

    @NonNull BookService bookService;
    @NonNull ConfRoomService confRoomService;

    @PostMapping("/save")
   public ResponseEntity save(@RequestBody BookDto bookDto){
        BookSaveResponse savedBook = bookService.save(bookDto);
       return ResponseEntity.
               status(HttpStatus.OK)
               .body(savedBook);
   }

    @GetMapping("/getById")
    public BookDto findById(@RequestParam Long id){
        return bookService.findById(id);
    }


    @GetMapping("/findAllByConfRoom")
    public ResponseEntity findAllByConfRoom(@RequestParam Long confRoomDtoId ){



        return ResponseEntity
                .status(HttpStatus.OK)
                .body(bookService.findAllByConfRoomId(confRoomDtoId));
    }


}
