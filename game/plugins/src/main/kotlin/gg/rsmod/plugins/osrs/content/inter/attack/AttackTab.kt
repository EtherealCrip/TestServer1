package gg.rsmod.plugins.osrs.content.inter.attack

import gg.rsmod.game.model.entity.Player
import gg.rsmod.plugins.osrs.api.helper.getVarp
import gg.rsmod.plugins.osrs.api.helper.setVarp

/**
 * @author Tom <rspsmods@gmail.com>
 */
object AttackTab {

    const val ATTACK_STYLE_VARP = 43
    const val AUTO_RETALIATE_VARP = 172

    private const val SPECIAL_ATTACK_ENERGY_VARP = 300
    const val SPECIAL_ATTACK_VARP = 301

    fun setEnergy(p: Player, amount: Int) {
        check(amount in 0..100)
        p.setVarp(SPECIAL_ATTACK_ENERGY_VARP, amount * 10)
    }

    fun getEnergy(p: Player): Int = p.getVarp(SPECIAL_ATTACK_ENERGY_VARP) / 10
}