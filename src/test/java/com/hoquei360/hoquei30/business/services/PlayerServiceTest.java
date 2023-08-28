package com.hoquei360.hoquei30.business.services;


import com.hoquei360.hoquei30.business.persistant.player.Player;
import com.hoquei360.hoquei30.business.persistant.player.PositionRole;
import com.hoquei360.hoquei30.business.persistant.player.PreferredHand;
import com.hoquei360.hoquei30.business.persistant.repositories.PlayerRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)

public class PlayerServiceTest {

    @Mock
    private PlayerRepository playerRepository;

    @InjectMocks
    private PlayerService playerService;
    private Player player1;
    private Player player2;
    private Player player3;


//    @BeforeEach
//    void setUp() {
//        player1 = new Player(1L, "João", "Monteiro", LocalDate.of(1989, 5, 30), PositionRole.PIVOT, PreferredHand.RIGHT, "BIR", "No injury");
//        player2 = new Player(2L, "Antonio", "Roberto", LocalDate.of(1989, 5, 30), PositionRole.PIVOT, PreferredHand.RIGHT, "BIR", "No injury");
//    }


//    @Test
//    public void testFindAll() {
//        List<Player> players = new ArrayList<>();
//        players.add(player1);
//        players.add(player2);
//
//        when(playerRepository.findAll()).thenReturn(players);
//        List<Player> result = playerService.findAll();
//
//        assertEquals(2, result.size());
//        assertEquals(player1, result.get(0));
//
//
//        when(playerRepository.findAll()).thenReturn(new ArrayList<>());
//        List<Player> emptyResult = playerService.findAll();
//        assertTrue(emptyResult.isEmpty(), "The list should be empty");
//
//    }
//
//    @Test
//    public void testFindPlayerById() {
//
//        when(playerRepository.getReferenceById(anyLong())).thenReturn(player1);
//        Player playerActual = playerService.findPlayerById(1);
//
//        verify(playerRepository).getReferenceById(1L);
//        assertEquals(player1, playerActual);
//    }
//
//    @Test
//    public void testCreatePlayer() {
//        player3 = new Player(3L, "Antonio", "", LocalDate.of(1989, 5, 30), PositionRole.PIVOT, PreferredHand.RIGHT, "BIR", "No injury");
//
//
//        when(playerRepository.save(player3)).thenReturn(player3);
//
//        Player createdPlayer = playerService.createPlayer(player3);
//
//        assertEquals(player3, createdPlayer);
//
//        assertEquals("Antonio", createdPlayer.getName());
//        assertEquals(3, createdPlayer.getId());
//        assertEquals("", createdPlayer.getLastName());
//        assertEquals(LocalDate.of(1989, 5, 30), createdPlayer.getBirthDate());
//        assertEquals(PositionRole.PIVOT, createdPlayer.getPosition());
//        assertEquals(PreferredHand.RIGHT, createdPlayer.getPreferredHand());
//        assertEquals("BIR", createdPlayer.getCurrentTeam());
//        assertEquals("No injury", createdPlayer.getInjuryHistory());
//    }
//
//    @Test()
//    public void testCreatePlayerNullPointExceptionLastName() {
//
//        player3 = new Player(3L, "Antonio", null, LocalDate.of(1989, 5, 30), PositionRole.PIVOT, PreferredHand.RIGHT, "BIR", "No injury");
//
//        NullPointerException thrown = Assertions
//                .assertThrows(NullPointerException.class, () -> {
//                    player3.setLastName(null);
//                }, "NullPointException error was expected");
//
//        Assertions.assertEquals("lastName is marked non-null but is null", thrown.getMessage());
//    }
//    @Test()
//    public void testCreatePlayerNullPointExceptionFirstName() {
//
//        player3 = new Player(3L, "", "", LocalDate.of(1989, 5, 30), PositionRole.PIVOT, PreferredHand.RIGHT, "BIR", "No injury");
//
//        NullPointerException thrown = Assertions
//                .assertThrows(NullPointerException.class, () -> {
//                    player3.setName(null);
//                }, "NullPointException error was expected");
//
//        Assertions.assertEquals("name is marked non-null but is null", thrown.getMessage());
//    }
//
//    @Test()
//    public void testCreatePlayerNullPointExceptionDate(){
//        player3 = new Player(3L, "", "", LocalDate.of(1989, 5, 30), PositionRole.PIVOT, PreferredHand.RIGHT, "BIR", "No injury");
//        NullPointerException thrown = Assertions
//                .assertThrows(NullPointerException.class, () -> {
//                    player3.setBirthDate(null);
//                }, "NullPointException error was expected");
//        Assertions.assertEquals("birthDate is marked non-null but is null", thrown.getMessage());
//    }

//    @Test
//    public void testUpdatePlayer() {
//        when(playerRepository.save(player1)).thenReturn(player1);
//
//        Player createdPlayer = playerService.createPlayer(player1);
//        createdPlayer.setName("Luis");
//        createdPlayer.setLastName("Almeida");
//        createdPlayer.setBirthDate(LocalDate.of(1979, 5, 30));
//        createdPlayer.setPosition(PositionRole.FORWARD);
//        createdPlayer.setPreferredHand(PreferredHand.LEFT);
////        createdPlayer.setCurrentTeam("Bla");
//        createdPlayer.setInjuryHistory("Injury");
//
//        assertEquals(player1, createdPlayer);
//
//        assertEquals("Luis", createdPlayer.getName());
//        assertEquals(1, createdPlayer.getId());
//        assertEquals("Almeida", createdPlayer.getLastName());
//        assertEquals(LocalDate.of(1979, 5, 30), createdPlayer.getBirthDate());
//        assertEquals(PositionRole.FORWARD, createdPlayer.getPosition());
//        assertEquals(PreferredHand.LEFT, createdPlayer.getPreferredHand());
////        assertEquals("Bla", createdPlayer.getCurrentTeam());
//        assertEquals("Injury", createdPlayer.getInjuryHistory());
//    }

//    @Test
//    public void testDeletePlayer() {
//
//        when(playerRepository.deleteById(player1.getId()));
//
//        Long playerId = 1L;
//
//
//        playerService.deletePlayer(playerId);
//
//        verify(playerRepository).deleteById(playerId);
//        assertEquals(playerId, null);
//    }
}