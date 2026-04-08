package com.dinzeer.srelic.specialeffects.base.blessing;

import com.dinzeer.legendreliclib.lib.util.slashblade.AbstractSpecialEffect;
import com.dinzeer.legendreliclib.lib.util.slashblade.SlashBladeUtil;
import com.dinzeer.srelic.registry.SRSpecialEffectsRegistry;
import com.dinzeer.srelic.registry.SRStacksReg;
import mods.flammpfeil.slashblade.event.SlashBladeEvent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class HunterStarBreakMoon extends AbstractSpecialEffect {
    public HunterStarBreakMoon() {
        super(30);
    }

    @Override
    public void handleUpdate(SlashBladeEvent.UpdateEvent event, LivingEntity attacker) {
        if (attacker instanceof Player player){
       if (SRStacksReg.PowerBoost.getCurrentStacks(player)>=(SRStacksReg.PowerBoost.getMaxStacks())){
           SlashBladeUtil.getState(player.getMainHandItem()).setComboSeq(SlashBladeUtil.getState(player.getMainHandItem()).getComboSeq());
           SRStacksReg.PowerBoost.resetStacks(player);
       }
        }
    }
//    @SubscribeEvent
//    public static void onTargetDeath(LivingDeathEvent event){
//
//        if (event.getSource().getEntity() instanceof ServerPlayer player){
//            if (SlashBladeUtil.getState(player.getMainHandItem()).hasSpecialEffect(SRSpecialEffectsRegistry.HunterStarBreakMoon.getId())){
//                SRStacksReg.PowerBoost.addStacks(player,60);
//            }
//
//        }
//    }
}
