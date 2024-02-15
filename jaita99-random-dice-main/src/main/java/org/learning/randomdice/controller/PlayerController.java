package org.learning.randomdice.controller;

import java.util.ArrayList;
import java.util.List;
import org.learning.randomdice.model.Player;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/players")
public class PlayerController {

  @GetMapping // metodo che ritorna una pagina con i nomi dei giocatori
  public String playerList(Model model) {
    // recupero dal metodo getPlayers la lista di Player
    List<Player> players = getPlayers();
    /*String playersConcat = "";
    for (Player player : players) {
      playersConcat += player.getName() + ", ";
    }
    playersConcat = playersConcat.substring(0, playersConcat.length() - 2);
*/
    // passo la lista di Player al model come attributo
    model.addAttribute("players", players);
    return "players-list";
  }

  // metodo che ritorna una pagina con le informazioni di un giocatore preso per nome
  // 1. il browser deve mandarmi il nome del giocatore
  // 2. devo recuperare dalla lista solo il giocatore con quel nome
  // 3. devo passare al template i dati di quel giocatore
  @GetMapping("/details")
  public String playerDetails(@RequestParam(name = "name", required = true) String playerName,
      Model model) {
    // cerco il player con il nome arrivato come parametro
    Player player = getPlayerByName(playerName);
    model.addAttribute("player", player);
    return "player-details";
  }

  // metodo alternativo per mostrare i dettagli di un Player
  @GetMapping("/details/{playerName}")
  public String playerDetailsPath(@PathVariable String playerName, Model model) {
    Player player = getPlayerByName(playerName);
    model.addAttribute("player", player);
    return "player-details";
  }

  // metodo che simula di recuperare una lista di players da una base dati
  private List<Player> getPlayers() {
    List<Player> players = new ArrayList<>();

    players.add(new Player("Nadar", 289888));
    players.add(new Player("Rohan", 123658));
    players.add(new Player("Laureen", 487552));
    players.add(new Player("Candelora", 78993));

    return players;
  }

  private Player getPlayerByName(String playerName) {
    // cerco il player con il nome arrivato come parametro
    Player player = null;
    for (Player p : getPlayers()) {
      if (p.getName().equals(playerName)) {
        player = p;
        break;
      }
    }
    return player;
  }
}
