package com.natamus.bottleyourxp.forge.events;

import com.natamus.bottleyourxp.events.ClickEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber
public class ForgeClickEvent {
	@SubscribeEvent
	public void onClickBottle(PlayerInteractEvent.RightClickItem e) {
		ClickEvent.onClickBottle(e.getEntity(), e.getLevel(), e.getHand());
	}
}
