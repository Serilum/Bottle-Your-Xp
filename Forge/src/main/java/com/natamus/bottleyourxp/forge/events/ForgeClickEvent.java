package com.natamus.bottleyourxp.forge.events;

import com.natamus.bottleyourxp.events.ClickEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraftforge.eventbus.api.listener.SubscribeEvent;

import java.lang.invoke.MethodHandles;

public class ForgeClickEvent {
	public static void registerEventsInBus() {
		// BusGroup.DEFAULT.register(MethodHandles.lookup(), ForgeClickEvent.class);

		PlayerInteractEvent.RightClickItem.BUS.addListener(ForgeClickEvent::onClickBottle);
	}

	@SubscribeEvent
	public static void onClickBottle(PlayerInteractEvent.RightClickItem e) {
		ClickEvent.onClickBottle(e.getEntity(), e.getLevel(), e.getHand());
	}
}
