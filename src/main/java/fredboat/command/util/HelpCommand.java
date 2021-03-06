package fredboat.command.util;

import fredboat.commandmeta.abs.Command;
import fredboat.commandmeta.abs.IMusicBackupCommand;
import fredboat.util.BotConstants;
import net.dv8tion.jda.entities.Guild;
import net.dv8tion.jda.entities.Message;
import net.dv8tion.jda.entities.TextChannel;
import net.dv8tion.jda.entities.User;

public class HelpCommand extends Command implements IMusicBackupCommand {

    @Override
    public void onInvoke(Guild guild, TextChannel channel, User invoker, Message message, String[] args) {
        invoker.getPrivateChannel().sendMessage(BotConstants.HELP_TEXT);
        channel.sendMessage(invoker.getUsername() + ": Documentation has been sent to your direct messages!");
    }
    
}
