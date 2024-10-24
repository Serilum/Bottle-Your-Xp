package com.natamus.bottleyourxp.events;

import com.natamus.bottleyourxp.config.ConfigHandler;
import com.natamus.collective.functions.EntityFunctions;
import com.natamus.collective.functions.ExperienceFunctions;
import com.natamus.collective.functions.ItemFunctions;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;

public class ClickEvent {
	public static InteractionResult onClickBottle(Player player, Level world, InteractionHand hand) {
		ItemStack itemstack = player.getItemInHand(hand);
		if (world.isClientSide) {
			return InteractionResult.PASS;
		}
		
		if (itemstack.getItem().equals(Items.GLASS_BOTTLE)) {
			if (player.isCrouching()) {
				if (ExperienceFunctions.canConsumeXp(player, ConfigHandler.rawXpConsumedOnCreation)) {
					if (ConfigHandler.damageOnCreation && !player.isCreative()) {
						int damage = ConfigHandler.halfHeartDamageAmount;
						if (!EntityFunctions.doesEntitySurviveThisDamage(player, damage)) {
							return InteractionResult.PASS;
						}
					}
					
					ExperienceFunctions.addPlayerXP(player, -ConfigHandler.rawXpConsumedOnCreation);
					ItemFunctions.shrinkGiveOrDropItemStack(player, hand, itemstack, new ItemStack(Items.EXPERIENCE_BOTTLE, 1));
				}
			}
		}
		
		return InteractionResult.PASS;
	}
}
