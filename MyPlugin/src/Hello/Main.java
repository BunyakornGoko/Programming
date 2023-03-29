package Hello;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.entity.Player;
import org.bukkit.*;
import org.bukkit.inventory.*;
public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        Bukkit.getServer().getLogger().info("Plugin Enabled");
    }

    @Override
    public void onDisable() {
        Bukkit.getServer().getLogger().info("Plugin Disabled");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        //instanof เป็นการเช็ครูปแบบของsender ว่าเป็น Obj ที่สร้างจาก Player หรือปล่าว
        // ในที่นี้หมายความว่า ถ้าคนส่งเข้ามาไม่ได้เป็น Player จะทำการ sendMessage ว่า NONONONO
        if (!(sender instanceof Player)){
            sender.sendMessage(ChatColor.RED+"NONONONO");
        }
        Player player=(Player)sender;
        if(command.getName().equalsIgnoreCase("hello")){
            player.sendMessage(ChatColor.BLUE+"Hello Plugin");
            return true;
        }
        //command เพิ่มเลือด
        if(command.getName().equalsIgnoreCase("health")){
            if(args.length==0){
                player.setHealth(20.0);
                player.sendMessage(ChatColor.GREEN+"Heal Complete");
                return true;
            }
            Player target = Bukkit.getServer().getPlayer(args[0]);
            if(target == null){
                player.sendMessage(ChatColor.RED+"Not Found Player");
                return true;
            }
            target.setHealth(20.0);
            player.sendMessage(ChatColor.GREEN+"Heal Complete");
            player.sendMessage(ChatColor.GREEN+""+target.getPlayer()+"Heal Complete");
        }
        //command เพิ่่มอาหาร
        if(command.getName().equalsIgnoreCase("food")){
            if(args.length==0){
                player.setFoodLevel(20);
                player.sendMessage(ChatColor.GREEN+"Food Complete");
                return true;
            }
            Player target = Bukkit.getServer().getPlayer(args[0]);
            if(target == null){
                player.sendMessage(ChatColor.RED+"Not Found Player");
                return true;
            }
            target.setFoodLevel(20);
            player.sendMessage(ChatColor.GREEN+"Food Complete");
            player.sendMessage(ChatColor.GREEN+""+target.getPlayer()+"Food Complete");
        }

        //command เพิ่มItem เข้าตัว
        PlayerInventory item = player.getInventory();
        if(command.getName().equalsIgnoreCase("pick")){
            item.addItem(new ItemStack(Material.STONE_SWORD));
            item.addItem(new ItemStack(Material.FIRE));
            item.addItem(new ItemStack(Material.APPLE));
            player.sendMessage(ChatColor.GREEN+"Add Item Inventory Complete");
        }
        if(command.getName().equalsIgnoreCase("clear")){
            item.clear();
            player.sendMessage(ChatColor.GREEN+"Clear All Item");
        }
        //command ฆ่าตัวตาย
        if(command.getName().equalsIgnoreCase("Dead")){
            if(args.length==0){
                player.setHealth(0);
                player.sendMessage(ChatColor.GREEN+"You Died");
                return  true;
            }
            Player target = Bukkit.getServer().getPlayer(args[0]);
            if(target == null){
                player.sendMessage(ChatColor.RED+"Not Found Player");
                return true;
            }
            target.setHealth(0);
            player.sendMessage(ChatColor.GREEN+"You Died");
            player.sendMessage(ChatColor.RED+""+target.getPlayer()+"You Dead");
        }
        return true;
    }

}