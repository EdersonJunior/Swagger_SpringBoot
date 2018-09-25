package com.pokergame.poker.controller;

import com.pokergame.poker.model.Tournament;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tournaments")
@Api(value = "tournaments", description = "Endpoint for tournaments management")
public class TournamentController {

    @ApiOperation(notes = "Register a new tournament with players already in", value = "register tournament", nickname = "register",
            tags = {"Billings"})
    @ApiResponses({
            @ApiResponse(code = 200, message = "Tournament registered successfuly!", response = Tournament.class),
            @ApiResponse(code = 400, message = "Error at trying to regitrer tournament", response = ApiResponse.class),
            @ApiResponse(code = 404, message = "Resource not found", response = ApiResponse.class)
    })
    @PostMapping
    public void register(@RequestBody Tournament tournament) {
        System.out.println(tournament.getName() + " starts at " + tournament.getLocalDateTime());
    }
}
