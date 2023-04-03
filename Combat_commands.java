package me.Quan.Combat_system.commands;
import me.Quan.Combat_system.Main;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
public class Combat_commands implements CommandExecutor{
	private Main plugin;
	
	public Combat_commands (Main plugin) {
		this.plugin = plugin;
		plugin.getCommand("Hello").setExecutor(this);
		
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("Only player");
			return true;
		}
		Player p = (Player) sender;
		if (p.hasPermission("hello.use")) {
			p.sendMessage("hi!");
			return true;
		} else {
			p.sendMessage("You do not have permission");
		}
		return false;
	}
}
