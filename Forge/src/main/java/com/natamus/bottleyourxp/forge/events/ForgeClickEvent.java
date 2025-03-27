package com.natamus.bottleyourxp.forge.events;

import com.natamus.bottleyourxp.events.ClickEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ForgeClickEvent {
	@SubscribeEvent
	public static void onClickBottle(PlayerInteractEvent.RightClickItem e) {
		ClickEvent.onClickBottle(e.getEntity(), e.getLevel(), e.getHand());
	}
}
