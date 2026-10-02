package com.serilum.bottleyourxp.forge.events;

import com.serilum.bottleyourxp.events.ClickEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ForgeClickEvent {
	@SubscribeEvent
	public static void onClickBottle(PlayerInteractEvent.RightClickItem e) {
		ClickEvent.onClickBottle(e.getEntity(), e.getLevel(), e.getHand());
	}
}
