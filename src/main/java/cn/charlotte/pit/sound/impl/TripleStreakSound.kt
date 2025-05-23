package cn.charlotte.pit.sound.impl

import cn.charlotte.pit.util.sound.AbstractPitSound
import org.bukkit.Sound
import org.bukkit.entity.Player

object TripleStreakSound: AbstractPitSound() {
    override fun getMusicInternalName(): String {
        return "triple_streak"
    }

    override fun onSoundTick(player: Player, tick: Int) {
        if (tick == 0) {
            player.playSound(player.location, Sound.ORB_PICKUP, 1f, 1.7f)
        } else if (tick == 2) {
            player.playSound(player.location, Sound.ORB_PICKUP, 1f, 1.8f)
        } else if (tick == 4) {
            player.playSound(player.location, Sound.ORB_PICKUP, 1f, 1.9f)
        } else if (tick > 4) {
            end(player)
        }
    }
}