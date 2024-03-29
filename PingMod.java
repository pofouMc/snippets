import finite.client.gui.hud.ScreenPosition;
	import finite.client.mods.ModDraggable;
	import net.minecraft.client.Minecraft;

	public class PingMod extends ModDraggable {
	    @Override
	    public int getWidth()
	    {
	        return font.getStringWidth("Ping: " +  Minecraft.getMinecraft().getNetHandler().getPlayerInfo(Minecraft.getMinecraft().thePlayer.getUniqueID()).getResponseTime());
	    }

	    @Override
	    public int getHeight()
	    {
	        return font.FONT_HEIGHT;
	    }

	    @Override
	    public void render(ScreenPosition pos) {
	        font.drawString("Ping: " +  Minecraft.getMinecraft().getNetHandler().getPlayerInfo(Minecraft.getMinecraft().thePlayer.getUniqueID()).getResponseTime(), pos.getAbsoluteX() + 1, pos.getAbsoluteY() + 1, -1);
	    }

	}
