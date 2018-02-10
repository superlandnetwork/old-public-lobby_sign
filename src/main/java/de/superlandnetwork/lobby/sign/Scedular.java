//  _            _      _             ___   _               
// | |     ___  | |__  | |__   _  _  / __| (_)  __ _   _ _  
// | |__  / _ \ | '_ \ | '_ \ | || | \__ \ | | / _` | | ' \ 
// |____| \___/ |_.__/ |_.__/  \_, | |___/ |_| \__, | |_||_|
//                             |__/            |___/        
//
// Copyright (C) Filli-IT (Einzelunternehmen) & Ursin Filli - All Rights Reserverd
// Unauthorized copying of the this file, via any medium is strictly prohibited
// Proprietary and confidential
// Written by Ursin Filli <ursin.filli@Filli-IT.ch>

package de.superlandnetwork.lobby.sign;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.block.Sign;

import de.superlandnetwork.API.API;
import de.superlandnetwork.API.ServerAPI.Server;

public class Scedular {

	public static int CD;

	public void startScedular(){
		CD = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getInstance(), new Runnable() {

			@Override
			public void run() {
				if(Bukkit.getOnlinePlayers().size() != 0) {
					godWheter();
					updateSignsKFFA();
					updateSignsOITC();
					updateSignsBedWars();
					updateSignsSG();
					updateSignsQSG();
					updateSignsSkyWars();
					return;
				}
			}
		}, 0L, 20L);

	}

	private void godWheter() {
		Bukkit.getWorld("Lobby").setThundering(false);
		Bukkit.getWorld("Lobby").setStorm(false);
		Bukkit.getWorld("Lobby").setTime(0L);
	}

	private ArrayList<Server> getKFFAServer() {
		ArrayList<Server> list = new ArrayList<>();
		ResultSet rs = API.getInstance().getMySQL()
				.getResult("SELECT * FROM `SLN_MC_Servers` WHERE GameID='1' AND isOnline='1' AND StatusID='1'");
		try {
			while (rs.next()) {
				int GameID = rs.getInt("GameID");
				int GameTypeID = rs.getInt("GameTypeID");
				int ServerID = rs.getInt("ServerID");
				int MapID = rs.getInt("MapID");
				int Players_Online = rs.getInt("Players_Online");
				int Players_Max = rs.getInt("Players_Max");
				list.add(new Server(GameID, 1, GameTypeID, ServerID, MapID, true, Players_Online, Players_Max));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	private ArrayList<Server> getOITCServer() {
		ArrayList<Server> list = new ArrayList<>();
		ResultSet rs = API.getInstance().getMySQL()
				.getResult("SELECT * FROM `SLN_MC_Servers` WHERE GameID='4' AND isOnline='1' AND StatusID='1'");
		try {
			while (rs.next()) {
				int GameID = rs.getInt("GameID");
				int GameTypeID = rs.getInt("GameTypeID");
				int ServerID = rs.getInt("ServerID");
				int MapID = rs.getInt("MapID");
				int Players_Online = rs.getInt("Players_Online");
				int Players_Max = rs.getInt("Players_Max");
				list.add(new Server(GameID, 4, GameTypeID, ServerID, MapID, true, Players_Online, Players_Max));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	private ArrayList<Server> getBedWarsServer() {
		ArrayList<Server> list = new ArrayList<>();
		ResultSet rs = API.getInstance().getMySQL()
				.getResult("SELECT * FROM `SLN_MC_Servers` WHERE GameID='2' AND isOnline='1' AND StatusID='1'");
		try {
			while (rs.next()) {
				int GameID = rs.getInt("GameID");
				int GameTypeID = rs.getInt("GameTypeID");
				int ServerID = rs.getInt("ServerID");
				int MapID = rs.getInt("MapID");
				int Players_Online = rs.getInt("Players_Online");
				int Players_Max = rs.getInt("Players_Max");
				list.add(new Server(GameID, 2, GameTypeID, ServerID, MapID, true, Players_Online, Players_Max));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	private ArrayList<Server> getSGServer() {
		ArrayList<Server> list = new ArrayList<>();
		ResultSet rs = API.getInstance().getMySQL()
				.getResult("SELECT * FROM `SLN_MC_Servers` WHERE GameID='5' AND isOnline='1' AND StatusID='1'");
		try {
			while (rs.next()) {
				int GameID = rs.getInt("GameID");
				int GameTypeID = rs.getInt("GameTypeID");
				int ServerID = rs.getInt("ServerID");
				int MapID = rs.getInt("MapID");
				int Players_Online = rs.getInt("Players_Online");
				int Players_Max = rs.getInt("Players_Max");
				list.add(new Server(GameID, 5, GameTypeID, ServerID, MapID, true, Players_Online, Players_Max));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	private ArrayList<Server> getQSGServer() {
		ArrayList<Server> list = new ArrayList<>();
		ResultSet rs = API.getInstance().getMySQL()
				.getResult("SELECT * FROM `SLN_MC_Servers` WHERE GameID='6' AND isOnline='1' AND StatusID='1'");
		try {
			while (rs.next()) {
				int GameID = rs.getInt("GameID");
				int GameTypeID = rs.getInt("GameTypeID");
				int ServerID = rs.getInt("ServerID");
				int MapID = rs.getInt("MapID");
				int Players_Online = rs.getInt("Players_Online");
				int Players_Max = rs.getInt("Players_Max");
				list.add(new Server(GameID, 6, GameTypeID, ServerID, MapID, true, Players_Online, Players_Max));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	private ArrayList<Server> getSkyWarsServer() {
		ArrayList<Server> list = new ArrayList<>();
		ResultSet rs = API.getInstance().getMySQL()
				.getResult("SELECT * FROM `SLN_MC_Servers` WHERE GameID='9' AND isOnline='1' AND StatusID='1'");
		try {
			while (rs.next()) {
				int GameID = rs.getInt("GameID");
				int GameTypeID = rs.getInt("GameTypeID");
				int ServerID = rs.getInt("ServerID");
				int MapID = rs.getInt("MapID");
				int Players_Online = rs.getInt("Players_Online");
				int Players_Max = rs.getInt("Players_Max");
				list.add(new Server(GameID, 9, GameTypeID, ServerID, MapID, true, Players_Online, Players_Max));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	public void updateSignsKFFA() {
		ArrayList<Server> Server_KFFA = getKFFAServer();
		for(int i=0; i<Main.getInstance().Signs_KFFA.size(); i++) {
			Sign sign = Main.getInstance().Signs_KFFA.get(i);
			if(i >= Server_KFFA.size()) {
				sign.setLine(0, "§4§m------------");
				sign.setLine(1, "Server wird");
				if(sign.getLine(2).equals("geladen ."))
					sign.setLine(2, "geladen ..");
				else if(sign.getLine(2).equals("geladen .."))
					sign.setLine(2, "geladen ...");
				else if(sign.getLine(2).equals("geladen ..."))
					sign.setLine(2, "geladen .");
				else 
					sign.setLine(2, "geladen .");
				sign.setLine(3, "§4§m------------");
			} else {
				Server server = Server_KFFA.get(i);
				sign.setLine(0, "KFFA - " + server.getServerID());
				if (server.getPlayers_Online() >= server.getPlayers_Max()) {
					sign.setLine(1, "[§eLobby§0]");
				} else {
					sign.setLine(1, "[§aLobby§0]");
				}
				sign.setLine(2, "KFFA1");
				sign.setLine(3, server.getPlayers_Online()  + " / " + server.getPlayers_Max());
			}
			sign.update(true);	
		}
	}
	
	public void updateSignsOITC() {
		ArrayList<Server> Server_OITC = getOITCServer();
		for(int i=0; i<Main.getInstance().Signs_OITC.size(); i++) {
			Sign sign = Main.getInstance().Signs_OITC.get(i);
			if(i >= Server_OITC.size()) {
				sign.setLine(0, "§4§m------------");
				sign.setLine(1, "Server wird");
				if(sign.getLine(2).equals("geladen ."))
					sign.setLine(2, "geladen ..");
				else if(sign.getLine(2).equals("geladen .."))
					sign.setLine(2, "geladen ...");
				else if(sign.getLine(2).equals("geladen ..."))
					sign.setLine(2, "geladen .");
				else 
					sign.setLine(2, "geladen .");
				sign.setLine(3, "§4§m------------");
			} else {
				Server server = Server_OITC.get(i);
				sign.setLine(0, "OITC - " + server.getServerID());
				if (server.getPlayers_Online() >= server.getPlayers_Max()) {
					sign.setLine(1, "[§eLobby§0]");
				} else {
					sign.setLine(1, "[§aLobby§0]");
				}
				sign.setLine(2, "CandyLand");
				sign.setLine(3, server.getPlayers_Online()  + " / " + server.getPlayers_Max());
			}
			sign.update(true);	
		}
	}
	
	public void updateSignsBedWars() {
		ArrayList<Server> Server_BedWars = getBedWarsServer();
		for(int i=0; i<Main.getInstance().Signs_BedWars.size(); i++) {
			Sign sign = Main.getInstance().Signs_BedWars.get(i);
			if(i >= Server_BedWars.size()) {
				sign.setLine(0, "§4§m------------");
				sign.setLine(1, "Server wird");
				if(sign.getLine(2).equals("geladen ."))
					sign.setLine(2, "geladen ..");
				else if(sign.getLine(2).equals("geladen .."))
					sign.setLine(2, "geladen ...");
				else if(sign.getLine(2).equals("geladen ..."))
					sign.setLine(2, "geladen .");
				else 
					sign.setLine(2, "geladen .");
				sign.setLine(3, "§4§m------------");
			} else {
				Server server = Server_BedWars.get(i);
				sign.setLine(0, "BW - " + server.getServerID());
				if (server.getPlayers_Online() >= server.getPlayers_Max()) {
					sign.setLine(1, "[§eLobby§0]");
				} else {
					sign.setLine(1, "[§aLobby§0]");
				}
				sign.setLine(2, "---");
				sign.setLine(3, server.getPlayers_Online()  + " / " + server.getPlayers_Max());
			}
			sign.update(true);	
		}
	}
	
	public void updateSignsSG() {
		ArrayList<Server> Server_SG = getSGServer();
		for(int i=0; i<Main.getInstance().Signs_SG.size(); i++) {
			Sign sign = Main.getInstance().Signs_SG.get(i);
			if(i >= Server_SG.size()) {
				sign.setLine(0, "§4§m------------");
				sign.setLine(1, "Server wird");
				if(sign.getLine(2).equals("geladen ."))
					sign.setLine(2, "geladen ..");
				else if(sign.getLine(2).equals("geladen .."))
					sign.setLine(2, "geladen ...");
				else if(sign.getLine(2).equals("geladen ..."))
					sign.setLine(2, "geladen .");
				else 
					sign.setLine(2, "geladen .");
				sign.setLine(3, "§4§m------------");
			} else {
				Server server = Server_SG.get(i);
				sign.setLine(0, "SG - " + server.getServerID());
				if (server.getPlayers_Online() >= server.getPlayers_Max()) {
					sign.setLine(1, "[§eLobby§0]");
				} else {
					sign.setLine(1, "[§aLobby§0]");
				}
				sign.setLine(2, "---");
				sign.setLine(3, server.getPlayers_Online()  + " / " + server.getPlayers_Max());
			}
			sign.update(true);	
		}
	}
	
	public void updateSignsQSG() {
		ArrayList<Server> Server_QSG = getQSGServer();
		for(int i=0; i<Main.getInstance().Signs_QSG.size(); i++) {
			Sign sign = Main.getInstance().Signs_QSG.get(i);
			if(i >= Server_QSG.size()) {
				sign.setLine(0, "§4§m------------");
				sign.setLine(1, "Server wird");
				if(sign.getLine(2).equals("geladen ."))
					sign.setLine(2, "geladen ..");
				else if(sign.getLine(2).equals("geladen .."))
					sign.setLine(2, "geladen ...");
				else if(sign.getLine(2).equals("geladen ..."))
					sign.setLine(2, "geladen .");
				else 
					sign.setLine(2, "geladen .");
				sign.setLine(3, "§4§m------------");
			} else {
				Server server = Server_QSG.get(i);
				sign.setLine(0, "QSG - " + server.getServerID());
				if (server.getPlayers_Online() >= server.getPlayers_Max()) {
					sign.setLine(1, "[§eLobby§0]");
				} else {
					sign.setLine(1, "[§aLobby§0]");
				}
				sign.setLine(2, "---");
				sign.setLine(3, server.getPlayers_Online()  + " / " + server.getPlayers_Max());
			}
			sign.update(true);	
		}
	}
	
	public void updateSignsSkyWars() {
		ArrayList<Server> Server_SkyWars = getSkyWarsServer();
		for(int i=0; i<Main.getInstance().Signs_SkyWars.size(); i++) {
			Sign sign = Main.getInstance().Signs_SkyWars.get(i);
			if(i >= Server_SkyWars.size()) {
				sign.setLine(0, "§4§m------------");
				sign.setLine(1, "Server wird");
				if(sign.getLine(2).equals("geladen ."))
					sign.setLine(2, "geladen ..");
				else if(sign.getLine(2).equals("geladen .."))
					sign.setLine(2, "geladen ...");
				else if(sign.getLine(2).equals("geladen ..."))
					sign.setLine(2, "geladen .");
				else 
					sign.setLine(2, "geladen .");
				sign.setLine(3, "§4§m------------");
			} else {
				Server server = Server_SkyWars.get(i);
				sign.setLine(0, "SkyWars - " + server.getServerID());
				if (server.getPlayers_Online() >= server.getPlayers_Max()) {
					sign.setLine(1, "[§eLobby§0]");
				} else {
					sign.setLine(1, "[§aLobby§0]");
				}
				sign.setLine(2, "---");
				sign.setLine(3, server.getPlayers_Online()  + " / " + server.getPlayers_Max());
			}
			sign.update(true);	
		}
	}

}
