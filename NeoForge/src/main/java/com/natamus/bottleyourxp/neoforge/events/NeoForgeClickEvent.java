package com.natamus.bottleyourxp.neoforge.events;

import com.natamus.bottleyourxp.events.ClickEvent;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;

@EventBusSubscriber
public class NeoForgeClickEvent {
	@SubscribeEvent
	public static void onClickBottle(PlayerInteractEvent.RightClickItem e) {
		ClickEvent.onClickBottle(e.getEntity(), e.getLevel(), e.getHand());
	}
}
