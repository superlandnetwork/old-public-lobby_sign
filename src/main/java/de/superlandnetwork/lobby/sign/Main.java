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

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Sign;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	private static Main instance;
	
	public Scedular scedular = new Scedular();
	
	public ArrayList<Sign> Signs_KFFA = new ArrayList<>();
	public ArrayList<Sign> Signs_OITC = new ArrayList<>();
	public ArrayList<Sign> Signs_BedWars = new ArrayList<>();
	public ArrayList<Sign> Signs_SG = new ArrayList<>();
	public ArrayList<Sign> Signs_QSG = new ArrayList<>();
	public ArrayList<Sign> Signs_SkyWars = new ArrayList<>();
	
	@Override
	public void onEnable() {
		instance = this;
		updateSignsKFFA();
		updateSignsOITC();
		updateSignsBedWars();
		updateSignsSG();
		updateSignsQSG();
		updateSignsSkyWars();
		scedular.startScedular();
	}
	
	@SuppressWarnings("deprecation")
	private void updateSignsKFFA() {
		Location Loc1 = new Location(Bukkit.getWorld("Lobby"), 242D, 101D, -83D);
		Loc1.getBlock().setTypeIdAndData(Material.WALL_SIGN.getId(), (byte)3, true);
		Sign sign1 = (Sign) Loc1.getBlock().getState();
		Signs_KFFA.add(sign1);
		
		Location Loc2 = new Location(Bukkit.getWorld("Lobby"), 243D, 101D, -83D);
		Loc2.getBlock().setTypeIdAndData(Material.WALL_SIGN.getId(), (byte)3, true);
		Sign sign2 = (Sign) Loc2.getBlock().getState();
		Signs_KFFA.add(sign2);
		
		Location Loc3 = new Location(Bukkit.getWorld("Lobby"), 244D, 101D, -83D);
		Loc3.getBlock().setTypeIdAndData(Material.WALL_SIGN.getId(), (byte)3, true);
		Sign sign3 = (Sign) Loc3.getBlock().getState();
		Signs_KFFA.add(sign3);
		
		Location Loc4 = new Location(Bukkit.getWorld("Lobby"), 242D, 100D, -83D);
		Loc4.getBlock().setTypeIdAndData(Material.WALL_SIGN.getId(), (byte)3, true);
		Sign sign4 = (Sign) Loc4.getBlock().getState();
		Signs_KFFA.add(sign4);
		
		Location Loc5 = new Location(Bukkit.getWorld("Lobby"), 243D, 100D, -83D);
		Loc5.getBlock().setTypeIdAndData(Material.WALL_SIGN.getId(), (byte)3, true);
		Sign sign5 = (Sign) Loc5.getBlock().getState();
		Signs_KFFA.add(sign5);
		
		Location Loc6 = new Location(Bukkit.getWorld("Lobby"), 244D, 100D, -83D);
		Loc6.getBlock().setTypeIdAndData(Material.WALL_SIGN.getId(), (byte)3, true);
		Sign sign6 = (Sign) Loc6.getBlock().getState();
		Signs_KFFA.add(sign6);
		
		Location Loc7 = new Location(Bukkit.getWorld("Lobby"), 254D, 101D, -83D);
		Loc7.getBlock().setTypeIdAndData(Material.WALL_SIGN.getId(), (byte)3, true);
		Sign sign7 = (Sign) Loc7.getBlock().getState();
		Signs_KFFA.add(sign7);
		
		Location Loc8 = new Location(Bukkit.getWorld("Lobby"), 255D, 101D, -83D);
		Loc8.getBlock().setTypeIdAndData(Material.WALL_SIGN.getId(), (byte)3, true);
		Sign sign8 = (Sign) Loc8.getBlock().getState();
		Signs_KFFA.add(sign8);
		
		Location Loc9 = new Location(Bukkit.getWorld("Lobby"), 256D, 101D, -83D);
		Loc9.getBlock().setTypeIdAndData(Material.WALL_SIGN.getId(), (byte)3, true);
		Sign sign9 = (Sign) Loc9.getBlock().getState();
		Signs_KFFA.add(sign9);
		
		Location Loc10 = new Location(Bukkit.getWorld("Lobby"), 254D, 100D, -83D);
		Loc10.getBlock().setTypeIdAndData(Material.WALL_SIGN.getId(), (byte)3, true);
		Sign sign10 = (Sign) Loc10.getBlock().getState();
		Signs_KFFA.add(sign10);
		
		Location Loc11 = new Location(Bukkit.getWorld("Lobby"), 255D, 100D, -83D);
		Loc11.getBlock().setTypeIdAndData(Material.WALL_SIGN.getId(), (byte)3, true);
		Sign sign11 = (Sign) Loc11.getBlock().getState();
		Signs_KFFA.add(sign11);
		
		Location Loc12 = new Location(Bukkit.getWorld("Lobby"), 256D, 100D, -83D);
		Loc12.getBlock().setTypeIdAndData(Material.WALL_SIGN.getId(), (byte)3, true);
		Sign sign12 = (Sign) Loc12.getBlock().getState();
		Signs_KFFA.add(sign12);
	}

	@SuppressWarnings("deprecation")
	private void updateSignsOITC() {
		Location Loc1 = new Location(Bukkit.getWorld("Lobby"), 364D, 101D, 25D);
		Loc1.getBlock().setTypeIdAndData(Material.WALL_SIGN.getId(), (byte)4, true);
		Sign sign1 = (Sign) Loc1.getBlock().getState();
		Signs_OITC.add(sign1);
		
		Location Loc2 = new Location(Bukkit.getWorld("Lobby"), 364D, 101D, 26D);
		Loc2.getBlock().setTypeIdAndData(Material.WALL_SIGN.getId(), (byte)4, true);
		Sign sign2 = (Sign) Loc2.getBlock().getState();
		Signs_OITC.add(sign2);
		
		Location Loc3 = new Location(Bukkit.getWorld("Lobby"), 364D, 101D, 27D);
		Loc3.getBlock().setTypeIdAndData(Material.WALL_SIGN.getId(), (byte)4, true);
		Sign sign3 = (Sign) Loc3.getBlock().getState();
		Signs_OITC.add(sign3);
		
		Location Loc4 = new Location(Bukkit.getWorld("Lobby"), 364D, 100D, 25D);
		Loc4.getBlock().setTypeIdAndData(Material.WALL_SIGN.getId(), (byte)4, true);
		Sign sign4 = (Sign) Loc4.getBlock().getState();
		Signs_OITC.add(sign4);
		
		Location Loc5 = new Location(Bukkit.getWorld("Lobby"), 364D, 100D, 26D);
		Loc5.getBlock().setTypeIdAndData(Material.WALL_SIGN.getId(), (byte)4, true);
		Sign sign5 = (Sign) Loc5.getBlock().getState();
		Signs_OITC.add(sign5);
		
		Location Loc6 = new Location(Bukkit.getWorld("Lobby"), 364D, 100D, 27D);
		Loc6.getBlock().setTypeIdAndData(Material.WALL_SIGN.getId(), (byte)4, true);
		Sign sign6 = (Sign) Loc6.getBlock().getState();
		Signs_OITC.add(sign6);
		
		Location Loc7 = new Location(Bukkit.getWorld("Lobby"), 364D, 101D, 37D);
		Loc7.getBlock().setTypeIdAndData(Material.WALL_SIGN.getId(), (byte)4, true);
		Sign sign7 = (Sign) Loc7.getBlock().getState();
		Signs_OITC.add(sign7);
		
		Location Loc8 = new Location(Bukkit.getWorld("Lobby"), 364D, 101D, 38D);
		Loc8.getBlock().setTypeIdAndData(Material.WALL_SIGN.getId(), (byte)4, true);
		Sign sign8 = (Sign) Loc8.getBlock().getState();
		Signs_OITC.add(sign8);
		
		Location Loc9 = new Location(Bukkit.getWorld("Lobby"), 364D, 101D, 39D);
		Loc9.getBlock().setTypeIdAndData(Material.WALL_SIGN.getId(), (byte)4, true);
		Sign sign9 = (Sign) Loc9.getBlock().getState();
		Signs_OITC.add(sign9);
		
		Location Loc10 = new Location(Bukkit.getWorld("Lobby"), 364D, 100D, 37D);
		Loc10.getBlock().setTypeIdAndData(Material.WALL_SIGN.getId(), (byte)4, true);
		Sign sign10 = (Sign) Loc10.getBlock().getState();
		Signs_OITC.add(sign10);
		
		Location Loc11 = new Location(Bukkit.getWorld("Lobby"), 364D, 100D, 38D);
		Loc11.getBlock().setTypeIdAndData(Material.WALL_SIGN.getId(), (byte)4, true);
		Sign sign11 = (Sign) Loc11.getBlock().getState();
		Signs_OITC.add(sign11);
		
		Location Loc12 = new Location(Bukkit.getWorld("Lobby"), 364D, 100D, 39D);
		Loc12.getBlock().setTypeIdAndData(Material.WALL_SIGN.getId(), (byte)4, true);
		Sign sign12 = (Sign) Loc12.getBlock().getState();
		Signs_OITC.add(sign12);
	}
	
	@SuppressWarnings("deprecation")
	private void updateSignsBedWars() {
		Location Loc1 = new Location(Bukkit.getWorld("Lobby"), 134D, 101D, 39D);
		Loc1.getBlock().setTypeIdAndData(Material.WALL_SIGN.getId(), (byte)5, true);
		Sign sign1 = (Sign) Loc1.getBlock().getState();
		Signs_BedWars.add(sign1);
		
		Location Loc2 = new Location(Bukkit.getWorld("Lobby"), 134D, 101D, 38D);
		Loc2.getBlock().setTypeIdAndData(Material.WALL_SIGN.getId(), (byte)5, true);
		Sign sign2 = (Sign) Loc2.getBlock().getState();
		Signs_BedWars.add(sign2);
		
		Location Loc3 = new Location(Bukkit.getWorld("Lobby"), 134D, 101D, 37D);
		Loc3.getBlock().setTypeIdAndData(Material.WALL_SIGN.getId(), (byte)5, true);
		Sign sign3 = (Sign) Loc3.getBlock().getState();
		Signs_BedWars.add(sign3);
		
		Location Loc4 = new Location(Bukkit.getWorld("Lobby"), 134D, 100D, 39D);
		Loc4.getBlock().setTypeIdAndData(Material.WALL_SIGN.getId(), (byte)5, true);
		Sign sign4 = (Sign) Loc4.getBlock().getState();
		Signs_BedWars.add(sign4);
		
		Location Loc5 = new Location(Bukkit.getWorld("Lobby"), 134D, 100D, 38D);
		Loc5.getBlock().setTypeIdAndData(Material.WALL_SIGN.getId(), (byte)5, true);
		Sign sign5 = (Sign) Loc5.getBlock().getState();
		Signs_BedWars.add(sign5);
		
		Location Loc6 = new Location(Bukkit.getWorld("Lobby"), 134D, 100D, 37D);
		Loc6.getBlock().setTypeIdAndData(Material.WALL_SIGN.getId(), (byte)5, true);
		Sign sign6 = (Sign) Loc6.getBlock().getState();
		Signs_BedWars.add(sign6);
		
		Location Loc7 = new Location(Bukkit.getWorld("Lobby"), 134D, 101D, 27D);
		Loc7.getBlock().setTypeIdAndData(Material.WALL_SIGN.getId(), (byte)5, true);
		Sign sign7 = (Sign) Loc7.getBlock().getState();
		Signs_BedWars.add(sign7);
		
		Location Loc8 = new Location(Bukkit.getWorld("Lobby"), 134D, 101D, 26D);
		Loc8.getBlock().setTypeIdAndData(Material.WALL_SIGN.getId(), (byte)5, true);
		Sign sign8 = (Sign) Loc8.getBlock().getState();
		Signs_BedWars.add(sign8);
		
		Location Loc9 = new Location(Bukkit.getWorld("Lobby"), 134D, 101D, 25D);
		Loc9.getBlock().setTypeIdAndData(Material.WALL_SIGN.getId(), (byte)5, true);
		Sign sign9 = (Sign) Loc9.getBlock().getState();
		Signs_BedWars.add(sign9);
		
		Location Loc10 = new Location(Bukkit.getWorld("Lobby"), 134D, 100D, 27D);
		Loc10.getBlock().setTypeIdAndData(Material.WALL_SIGN.getId(), (byte)5, true);
		Sign sign10 = (Sign) Loc10.getBlock().getState();
		Signs_BedWars.add(sign10);
		
		Location Loc11 = new Location(Bukkit.getWorld("Lobby"), 134D, 100D, 26D);
		Loc11.getBlock().setTypeIdAndData(Material.WALL_SIGN.getId(), (byte)5, true);
		Sign sign11 = (Sign) Loc11.getBlock().getState();
		Signs_BedWars.add(sign11);
		
		Location Loc12 = new Location(Bukkit.getWorld("Lobby"), 134D, 100D, 25D);
		Loc12.getBlock().setTypeIdAndData(Material.WALL_SIGN.getId(), (byte)5, true);
		Sign sign12 = (Sign) Loc12.getBlock().getState();
		Signs_BedWars.add(sign12);
	}
	
	@SuppressWarnings("deprecation")
	private void updateSignsSG() {
		Location Loc1 = new Location(Bukkit.getWorld("Lobby"), 138D, 101D, -72D);
		Loc1.getBlock().setTypeIdAndData(Material.WALL_SIGN.getId(), (byte)5, true);
		Sign sign1 = (Sign) Loc1.getBlock().getState();
		Signs_SG.add(sign1);
		
		Location Loc2 = new Location(Bukkit.getWorld("Lobby"), 138D, 101D, -73D);
		Loc2.getBlock().setTypeIdAndData(Material.WALL_SIGN.getId(), (byte)5, true);
		Sign sign2 = (Sign) Loc2.getBlock().getState();
		Signs_SG.add(sign2);
		
		Location Loc3 = new Location(Bukkit.getWorld("Lobby"), 138D, 101D, -74D);
		Loc3.getBlock().setTypeIdAndData(Material.WALL_SIGN.getId(), (byte)5, true);
		Sign sign3 = (Sign) Loc3.getBlock().getState();
		Signs_SG.add(sign3);
		
		Location Loc4 = new Location(Bukkit.getWorld("Lobby"), 138D, 100D, -72D);
		Loc4.getBlock().setTypeIdAndData(Material.WALL_SIGN.getId(), (byte)5, true);
		Sign sign4 = (Sign) Loc4.getBlock().getState();
		Signs_SG.add(sign4);
		
		Location Loc5 = new Location(Bukkit.getWorld("Lobby"), 138D, 100D, -73D);
		Loc5.getBlock().setTypeIdAndData(Material.WALL_SIGN.getId(), (byte)5, true);
		Sign sign5 = (Sign) Loc5.getBlock().getState();
		Signs_SG.add(sign5);
		
		Location Loc6 = new Location(Bukkit.getWorld("Lobby"), 138D, 100D, -74D);
		Loc6.getBlock().setTypeIdAndData(Material.WALL_SIGN.getId(), (byte)5, true);
		Sign sign6 = (Sign) Loc6.getBlock().getState();
		Signs_SG.add(sign6);
	}
	
	@SuppressWarnings("deprecation")
	private void updateSignsQSG() {
		Location Loc1 = new Location(Bukkit.getWorld("Lobby"), 142D, 101D, -79D);
		Loc1.getBlock().setTypeIdAndData(Material.WALL_SIGN.getId(), (byte)3, true);
		Sign sign1 = (Sign) Loc1.getBlock().getState();
		Signs_QSG.add(sign1);
		
		Location Loc2 = new Location(Bukkit.getWorld("Lobby"), 143D, 101D, -79D);
		Loc2.getBlock().setTypeIdAndData(Material.WALL_SIGN.getId(), (byte)3, true);
		Sign sign2 = (Sign) Loc2.getBlock().getState();
		Signs_QSG.add(sign2);
		
		Location Loc3 = new Location(Bukkit.getWorld("Lobby"), 144D, 101D, -79D);
		Loc3.getBlock().setTypeIdAndData(Material.WALL_SIGN.getId(), (byte)3, true);
		Sign sign3 = (Sign) Loc3.getBlock().getState();
		Signs_QSG.add(sign3);
		
		Location Loc4 = new Location(Bukkit.getWorld("Lobby"), 142D, 100D, -79D);
		Loc4.getBlock().setTypeIdAndData(Material.WALL_SIGN.getId(), (byte)3, true);
		Sign sign4 = (Sign) Loc4.getBlock().getState();
		Signs_QSG.add(sign4);
		
		Location Loc5 = new Location(Bukkit.getWorld("Lobby"), 143D, 100D, -79D);
		Loc5.getBlock().setTypeIdAndData(Material.WALL_SIGN.getId(), (byte)3, true);
		Sign sign5 = (Sign) Loc5.getBlock().getState();
		Signs_QSG.add(sign5);
		
		Location Loc6 = new Location(Bukkit.getWorld("Lobby"), 144D, 100D, -79D);
		Loc6.getBlock().setTypeIdAndData(Material.WALL_SIGN.getId(), (byte)3, true);
		Sign sign6 = (Sign) Loc6.getBlock().getState();
		Signs_QSG.add(sign6);
	}
	
	@SuppressWarnings("deprecation")
	private void updateSignsSkyWars() {
		Location Loc1 = new Location(Bukkit.getWorld("Lobby"), 256D, 101D, 147D);
		Loc1.getBlock().setTypeIdAndData(Material.WALL_SIGN.getId(), (byte)2, true);
		Sign sign1 = (Sign) Loc1.getBlock().getState();
		Signs_SkyWars.add(sign1);
		
		Location Loc2 = new Location(Bukkit.getWorld("Lobby"), 255D, 101D, 147D);
		Loc2.getBlock().setTypeIdAndData(Material.WALL_SIGN.getId(), (byte)2, true);
		Sign sign2 = (Sign) Loc2.getBlock().getState();
		Signs_SkyWars.add(sign2);
		
		Location Loc3 = new Location(Bukkit.getWorld("Lobby"), 254D, 101D, 147D);
		Loc3.getBlock().setTypeIdAndData(Material.WALL_SIGN.getId(), (byte)2, true);
		Sign sign3 = (Sign) Loc3.getBlock().getState();
		Signs_SkyWars.add(sign3);
		
		Location Loc4 = new Location(Bukkit.getWorld("Lobby"), 256D, 100D, 147D);
		Loc4.getBlock().setTypeIdAndData(Material.WALL_SIGN.getId(), (byte)2, true);
		Sign sign4 = (Sign) Loc4.getBlock().getState();
		Signs_SkyWars.add(sign4);
		
		Location Loc5 = new Location(Bukkit.getWorld("Lobby"), 255D, 100D, 147D);
		Loc5.getBlock().setTypeIdAndData(Material.WALL_SIGN.getId(), (byte)2, true);
		Sign sign5 = (Sign) Loc5.getBlock().getState();
		Signs_SkyWars.add(sign5);
		
		Location Loc6 = new Location(Bukkit.getWorld("Lobby"), 254D, 100D, 147D);
		Loc6.getBlock().setTypeIdAndData(Material.WALL_SIGN.getId(), (byte)2, true);
		Sign sign6 = (Sign) Loc6.getBlock().getState();
		Signs_SkyWars.add(sign6);
		
		Location Loc7 = new Location(Bukkit.getWorld("Lobby"), 244D, 101D, 147D);
		Loc7.getBlock().setTypeIdAndData(Material.WALL_SIGN.getId(), (byte)2, true);
		Sign sign7 = (Sign) Loc7.getBlock().getState();
		Signs_SkyWars.add(sign7);
		
		Location Loc8 = new Location(Bukkit.getWorld("Lobby"), 243D, 101D, 147D);
		Loc8.getBlock().setTypeIdAndData(Material.WALL_SIGN.getId(), (byte)2, true);
		Sign sign8 = (Sign) Loc8.getBlock().getState();
		Signs_SkyWars.add(sign8);
		
		Location Loc9 = new Location(Bukkit.getWorld("Lobby"), 242D, 101D, 147D);
		Loc9.getBlock().setTypeIdAndData(Material.WALL_SIGN.getId(), (byte)2, true);
		Sign sign9 = (Sign) Loc9.getBlock().getState();
		Signs_SkyWars.add(sign9);
		
		Location Loc10 = new Location(Bukkit.getWorld("Lobby"), 244D, 100D, 147D);
		Loc10.getBlock().setTypeIdAndData(Material.WALL_SIGN.getId(), (byte)2, true);
		Sign sign10 = (Sign) Loc10.getBlock().getState();
		Signs_SkyWars.add(sign10);
		
		Location Loc11 = new Location(Bukkit.getWorld("Lobby"), 243D, 100D, 147D);
		Loc11.getBlock().setTypeIdAndData(Material.WALL_SIGN.getId(), (byte)2, true);
		Sign sign11 = (Sign) Loc11.getBlock().getState();
		Signs_SkyWars.add(sign11);
		
		Location Loc12 = new Location(Bukkit.getWorld("Lobby"), 242D, 100D, 147D);
		Loc12.getBlock().setTypeIdAndData(Material.WALL_SIGN.getId(), (byte)2, true);
		Sign sign12 = (Sign) Loc12.getBlock().getState();
		Signs_SkyWars.add(sign12);
	}
	
	public static Main getInstance() {
		return instance;
	}
	
}
