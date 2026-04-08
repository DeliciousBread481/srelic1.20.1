package com.dinzeer.srelic.registry.lang;

import com.dinzeer.srelic.data.SRelicBuiltInRegsitry;
import com.dinzeer.srelic.registry.SRSpecialEffectsRegistry;
import com.dinzeer.srelic.registry.SRStacksReg;
import com.dinzeer.srelic.registry.SRslashArtRegsitry;
import mods.flammpfeil.slashblade.registry.slashblade.SlashBladeDefinition;
import mods.flammpfeil.slashblade.registry.specialeffects.SpecialEffect;
import mods.flammpfeil.slashblade.slasharts.SlashArts;
import net.minecraft.resources.ResourceKey;
import net.minecraftforge.registries.RegistryObject;

import static com.dinzeer.srelic.Srelic.MODID;
import static com.dinzeer.srelic.Srelic.REGISTRATE;

public class ENUSLangRegistry {
    public static void register() {
        // 绘画
        REGISTRATE.addRawLang("painting.srelic.gwen.author", "LOL");
        REGISTRATE.addRawLang("painting.srelic.gwen.title", "Gwen");

// Items
        REGISTRATE.addRawLang(CreateItemLang(SRelicBuiltInRegsitry.YE_TACHI), "Sealed Blade Tachi \"Night Radiance\"");
        REGISTRATE.addRawLang(CreateItemLang(SRelicBuiltInRegsitry.NONE), "\"Nothingness\"");
        REGISTRATE.addRawLang(CreateItemLang(SRelicBuiltInRegsitry.START), "\"Origin\"");
        REGISTRATE.addRawLang(CreateItemLang(SRelicBuiltInRegsitry.RED_QUEEN), "Crimson Queen");
        REGISTRATE.addRawLang(CreateItemLang(SRelicBuiltInRegsitry.ICECRY), "Demonic Sword \"Frostmourne\"");
        REGISTRATE.addRawLang(CreateItemLang(SRelicBuiltInRegsitry.ETERNAL_VOWS), "Ancient \"Undercurrent\"");
        REGISTRATE.addRawLang(CreateItemLang(SRelicBuiltInRegsitry.RAIDIAN), "Dream Blade \"Musou Isshin\"");
        REGISTRATE.addRawLang(CreateItemLang(SRelicBuiltInRegsitry.YE_FIRE), "Night Radiance \"Burning Puppet\"");
        REGISTRATE.addRawLang(CreateItemLang(SRelicBuiltInRegsitry.WOLF), "Shattered Sword \"Wolf's Gravestone\"");
        REGISTRATE.addRawLang(CreateItemLang(SRelicBuiltInRegsitry.WATER), "Sword of Narzissenkreuz");
        REGISTRATE.addRawLang(CreateItemLang(SRelicBuiltInRegsitry.RAPPA), "Chaos Ninjutsu \"Chaotic Demon-Banishing\"");
        REGISTRATE.addRawLang(CreateItemLang(SRelicBuiltInRegsitry.FIRE), "Key of Destruction \"Judgement of Shamash\"");
        REGISTRATE.addRawLang(CreateItemLang(SRelicBuiltInRegsitry.ARK_FIRE), "Anomalous Greatsword \"Judgement of Shamash - Apocalypse\"");
        REGISTRATE.addRawLang(CreateItemLang(SRelicBuiltInRegsitry.END_FIRE), "Judgement of Shamash \"Endless Finality\"");
        REGISTRATE.addRawLang(CreateItemLang(SRelicBuiltInRegsitry.KAFUKA), "\"Gossamer\"");
        REGISTRATE.addRawLang(CreateItemLang(SRelicBuiltInRegsitry.STAR), "Destruction \"Stellar Trump Card\"");
        REGISTRATE.addRawLang(CreateItemLang(SRelicBuiltInRegsitry.FIRE_KNIGHT), "Preservation \"Flame Lance\"");
        REGISTRATE.addRawLang(CreateItemLang(SRelicBuiltInRegsitry.YE_STAR), "Night Radiance \"Starfall Thunder\"");
        REGISTRATE.addRawLang(CreateItemLang(SRelicBuiltInRegsitry.BLADE), "Plastic White Template");
        REGISTRATE.addRawLang(CreateItemLang(SRelicBuiltInRegsitry.LAOTIE), "\"Old Iron\"");
        REGISTRATE.addRawLang(CreateItemLang(SRelicBuiltInRegsitry.JINYUAN), "Formation Blade \"Stonefire Dream Body\"");
        REGISTRATE.addRawLang(CreateItemLang(SRelicBuiltInRegsitry.idanstar), "Eden's Star \"Cane\"");
        REGISTRATE.addRawLang(CreateItemLang(SRelicBuiltInRegsitry.redmoon), "Crimson Sickle \"Shape of the Crimson Moon\"");
        REGISTRATE.addRawLang(CreateItemLang(SRelicBuiltInRegsitry.heita), "§mHerta's Giant Diamond Hammer§r§5\"Resplendent Heavy Mallet\"");
        REGISTRATE.addRawLang(CreateItemLang(SRelicBuiltInRegsitry.santa_caterina), "Saint Caterina \"Alter\"");
        REGISTRATE.addRawLang(CreateItemLang(SRelicBuiltInRegsitry.galaxy), "Heavy Magnetic Storm \"Slash\"");
        REGISTRATE.addRawLang(CreateItemLang(SRelicBuiltInRegsitry.samu), "Firefly Type-V \"Live to Die\"");
        REGISTRATE.addRawLang(CreateItemLang(SRelicBuiltInRegsitry.lightning), "Heaven's End \"Judgment\"");
        REGISTRATE.addRawLang(CreateItemLang(SRelicBuiltInRegsitry.sika_gun), "\"Soul Night Revolver\"");
        REGISTRATE.addRawLang(CreateItemLang(SRelicBuiltInRegsitry.redsakura), "Soul Demon Blade \"Blood Cherry Annihilation\"");
        REGISTRATE.addRawLang(CreateItemLang(SRelicBuiltInRegsitry.clound), "Lone Cloud");
        REGISTRATE.addRawLang(CreateItemLang(SRelicBuiltInRegsitry.el), "Reality's Realm \"Flawless Return\"");
        REGISTRATE.addRawLang(CreateItemLang(SRelicBuiltInRegsitry.the_fire_gray), "Judgement of Shamash \"Dice of Destiny\"");
        REGISTRATE.addRawLang(CreateItemLang(SRelicBuiltInRegsitry.FIREBlue2), "Judgement of Shamash \"Frozen Edge Qi Focus\"");
        REGISTRATE.addRawLang(CreateItemLang(SRelicBuiltInRegsitry.spring), "\"Slaying Camellia\"");
        REGISTRATE.addRawLang(CreateItemLang(SRelicBuiltInRegsitry.the_fire_pink2), "Judgement of Shamash \"Falling Cherry Blossom Moment\"");
        REGISTRATE.addRawLang(CreateItemLang(SRelicBuiltInRegsitry.the_fire_green2), "Judgement of Shamash \"Storm Heaven's Eye\"");
        REGISTRATE.addRawLang(CreateItemLang(SRelicBuiltInRegsitry.ButterflyLament), "Nether Scythe \"Butterfly Lament\"");
        REGISTRATE.addRawLang(CreateItemLang(SRelicBuiltInRegsitry.staff_of_homa), "Long Spear \"Staff of Homa\"");
        REGISTRATE.addRawLang(CreateItemLang(SRelicBuiltInRegsitry.dawn_flame_feather), "Oath Flame \"Dawnfire Plume\"");
        REGISTRATE.addRawLang(CreateItemLang(SRelicBuiltInRegsitry.rose_spear), "Beauty \"Rose Spear\"");
        REGISTRATE.addRawLang(CreateItemLang(SRelicBuiltInRegsitry.The_radiance_of_stagnant_water_flow), "The Radiant Brilliance of Stagnant Waters");
        REGISTRATE.addRawLang(CreateItemLang(SRelicBuiltInRegsitry.SEELE), "Old Scythe \"Butterfly Shadow\"");
        REGISTRATE.addRawLang(CreateItemLang(SRelicBuiltInRegsitry.AIR_NONE), "Purple Scissors \"Void\"");
        REGISTRATE.addRawLang(CreateItemLang(SRelicBuiltInRegsitry.Abyss_Eye), "Eye of the Blood Abyss \"As One\"");
        REGISTRATE.addRawLang(CreateItemLang(SRelicBuiltInRegsitry.Aphrodite_Lyre), "Cradle of Orpheus");
        REGISTRATE.addRawLang(CreateItemLang(SRelicBuiltInRegsitry.conspicuous), "\"Scarlet Blade\"");
        REGISTRATE.addRawLang(CreateItemLang(SRelicBuiltInRegsitry.radiance), "\"Vermilion Feather Blaze\"");
        REGISTRATE.addRawLang(CreateItemLang(SRelicBuiltInRegsitry.dash), "War Glaive \"Rift-Sundering Skyward Charge\"");
        REGISTRATE.addRawLang(CreateItemLang(SRelicBuiltInRegsitry.sky_sword), "\"Skyward Blade\"");
        REGISTRATE.addRawLang(CreateItemLang(SRelicBuiltInRegsitry.sky_sword_ascent), "\"Skyward Pride\"");
        REGISTRATE.addRawLang(CreateItemLang(SRelicBuiltInRegsitry.SEVEN_1), "Tunnel Star's Resplendence \"Sword & Shield\"");
        REGISTRATE.addRawLang(CreateItemLang(SRelicBuiltInRegsitry.SEVEN_2), "Tunnel Star's Resplendence \"Switch Axe\"");
        REGISTRATE.addRawLang(CreateItemLang(SRelicBuiltInRegsitry.kill), "Apocalypse \"Ashless\"");
        REGISTRATE.addRawLang(CreateItemLang(SRelicBuiltInRegsitry.ice_sword), "Snow-Tombed Starsilver");
        REGISTRATE.addRawLang(CreateItemLang(SRelicBuiltInRegsitry.THIRD_RELIC), "3rd Sacred Relic");
        REGISTRATE.addRawLang(CreateItemLang(SRelicBuiltInRegsitry.FROST_SNIPER), "\"Frost Sniper\"");
        REGISTRATE.addRawLang(CreateItemLang(SRelicBuiltInRegsitry.ICE_BLUE), "Spirit-Imitating Blade \"Frosted Epiphyllum\"");
        REGISTRATE.addRawLang(CreateItemLang(SRelicBuiltInRegsitry.ICE_BLUE_EX), "Spirit-Subduing Blade \"Frozen Prison, Icy Heaven\"");
        REGISTRATE.addRawLang(CreateItemLang(SRelicBuiltInRegsitry.THIRD_BLUE_1), "\"Epiphyllum Sword\"");
        REGISTRATE.addRawLang(CreateItemLang(SRelicBuiltInRegsitry.THIRD_BLUE_2), "Soul Shift \"Epiphyllum Sword\"");
        REGISTRATE.addRawLang(CreateItemLang(SRelicBuiltInRegsitry.AFFLORDITE), "\"Aphrodite\"");
        REGISTRATE.addRawLang(CreateItemLang(SRelicBuiltInRegsitry.DOUBLE_FISH), "Star-Severing Blade \"Pisces\"");
        REGISTRATE.addRawLang(CreateItemLang(SRelicBuiltInRegsitry.NO_END), "Demon Blade \"Tailless\"");
        REGISTRATE.addRawLang(CreateItemLang(SRelicBuiltInRegsitry.THE_STAR_OF_THE_FROST), "\"Skadi of the Frost\"");
        REGISTRATE.addRawLang(CreateItemLang(SRelicBuiltInRegsitry.GENE_HARVESTER), "\"Gene Harvester\"");
        REGISTRATE.addRawLang("patchouli.srelic.book.name", "Book of Otherworldly Records");
        REGISTRATE.addRawLang("patchouli.srelic.book.landing_text", "A book from another world, documenting many ways to forge otherworldly blades. It charts the path of resonance, beginning with the White Template.");
        REGISTRATE.addRawLang("patchouli.srelic.book.categories.arrow.name", "The Origin That Links All · Super Materials");
        REGISTRATE.addRawLang("patchouli.srelic.book.categories.universal.name", "Resonance of Spirit and Destiny · Pathstrider's Rainbow Star");
        REGISTRATE.addRawLang("patchouli.srelic.book.categories.arrow.description", "This chapter documents the acquisition methods and background lore of the new materials added by the game's expansion.");
        REGISTRATE.addRawLang("patchouli.srelic.book.categories.universal.description", "This chapter documents the names and effects of the Paths added by the game's expansion.");
        REGISTRATE.addRawLang("patchouli.srelic.book.entries.arrow.ender_metal.pages.0.text", "A special metal that infuriates Endermen. It can assist the White Template in linking to worlds and taking form. Though, the recipe makes one want to say: 'Shouldn't this be called Ender Alloy?'");
        REGISTRATE.addRawLang("patchouli.srelic.book.entries.arrow.black_hole_metal.pages.0.text", "The ultimate alloy born from the detonation of Fel Metal upon the fusion of four incredibly hard Netherite ingots. It will link the White Template to resonate with items embodying the concept of a 'Black Hole' from other worlds.");
        REGISTRATE.addRawLang("patchouli.srelic.book.entries.arrow.compressed_alloy.pages.0.text", "Normally, compression wouldn't go this far, but this isn't a normal situation. After all, you have a Nether Star.");
        REGISTRATE.addRawLang("patchouli.srelic.book.entries.arrow.fel_metal.pages.0.text", "A special metal derived from the forbidden alchemy of an ancient civilization.");
        REGISTRATE.addRawLang("tips.black_hole.name", "Black Hole Compression Ritual");
        REGISTRATE.addRawLang("tips.black_hole.name_tip", "Activate by holding Fel Metal and targeting the central obsidian in the End.");
        REGISTRATE.addRawLang("tips.compressed_alloy.name", "Nether Star Compression");
        REGISTRATE.addRawLang("tips.ex_star.name", "Ceremony of the Ultimate Molten Heart");
        REGISTRATE.addRawLang("tips.flame_netherite_alloy.name", "Blazing Netherite Alloy");
        REGISTRATE.addRawLang("tips.frozen_netherite_alloy.name", "Frozen Netherite Alloy");
        REGISTRATE.addRawLang("tips.oceanic_netherite_alloy.name", "Oceanic Netherite Alloy");
        REGISTRATE.addRawLang("tips.thunder_netherite_alloy.name", "Thunderous Netherite Alloy");
        REGISTRATE.addRawLang("tips.sakura_steel_ingot.name", "Sakura-Patterned Steel Ingot");
        REGISTRATE.addRawLang("tips.compressed_alloy.name_tip", "Activate by holding a Nether Star and targeting the central Netherite block in the Nether.");
        REGISTRATE.addRawLang("tips.fel_metal.name", "Ancient Fel Forging");
        REGISTRATE.addRawLang("tips.fel_metal.name_tip", "Activate by holding a Netherite Scrap and targeting the central Cauldron.");
        REGISTRATE.addRawLang("tips.ex_star.name_tip", "Activate the ritual by right-clicking with a Nether Star in the End.");
        REGISTRATE.addRawLang("tips.frozen_netherite_alloy.name_tip", "Obtain by right-clicking Blue Ice with a Netherite Ingot while in water.");
        REGISTRATE.addRawLang("tips.oceanic_netherite_alloy.name_tip", "Obtain by right-clicking a Sea Lantern with a Netherite Ingot while in water.");
        REGISTRATE.addRawLang("tips.sakura_steel_ingot.name_tip", "Place Cherry Leaves adjacent to a Cherry Log, then right-click the log with an Iron Ingot to obtain.");
        REGISTRATE.addRawLang("tips.crimson_paper.name_tip", "Obtained by trading with a Wandering Trader.");
        REGISTRATE.addRawLang("tips.plum.name_tip", "Drops rarely when breaking Blood Soul Leaves with Shears.");
        REGISTRATE.addRawLang("tips.thunder_netherite_alloy.name_tip", "Obtain by right-clicking a Lightning Rod with a Netherite Ingot during a Thunderstorm.");
        REGISTRATE.addRawLang("patchouli.srelic.book.entries.arrow.soul_metal.pages.0.text", "A metal block composed of nanomachines, used to isolate Honkai energy. When eroded by Honkai energy, the nanomachines can self-repair.");
        REGISTRATE.addRawLang("patchouli.srelic.book.entries.arrow.soul_metal.pages.1.text", "I deceived my friends, I deceived my closest kin, I deceived the world and the rules above it...$(br2)All to grant the one true you, a second life. I have returned, Kallen.");
        REGISTRATE.addRawLang("painting.srelic.aotuo.title", "$(l)$(e)Otto Apocalypse");
        REGISTRATE.addRawLang("painting.srelic.huoqu.title", "Acquisition Method");
        REGISTRATE.addRawLang("patchouli.srelic.book.entries.arrow.spirit_butterfly.pages.0.text", "Amidst a sea of flowers, butterflies dance wildly, blooming in decay, leaving fragrance in the cycle of life and death. Ethereal fragrance lingers for lifetimes, butterflies carry the scent of blood plum.");
        REGISTRATE.addRawLang("patchouli.srelic.book.entries.arrow.spirit_butterfly.easter-egg1", "Legend says they only alight where Blood Plum blooms. Where their wing-dust falls, withered bones sprout flowers, and old memories retain their fragrance.$(br2)$(o)「Amidst myriad blossoms, butterflies swirl; in decay they bloom, in passing life they leave scent...」");
        REGISTRATE.addRawLang("patchouli.srelic.book.entries.arrow.diamond_star.pages.0.text", "A precious and hard material. The fusion of a three-headed demon's core with resilient materials yields the unexpected. The Diamond Star glitters with the light of the stars.");
        REGISTRATE.addRawLang("patchouli.srelic.book.entries.arrow.crimson_paper.pages.0.text", "Crimson origami paper, holding infinite possibilities. Different methods shape different futures, potentially influencing various things.");
        REGISTRATE.addRawLang("patchouli.srelic.book.entries.arrow.eternal_plum.pages.0.text", "Past life, present life, and future life — people change, but the plum remains constant. Butterflies and plums depend on each other, traversing decay together towards rebirth.");
        REGISTRATE.addRawLang("patchouli.srelic.book.entries.arrow.frozen_netherite_alloy.pages.0.text", "Hardened alloy tempered by extreme cold, harboring the power of ice and snow. The faint silhouette of frost can be glimpsed within.");
        REGISTRATE.addRawLang("patchouli.srelic.book.entries.arrow.flame_netherite_alloy.pages.0.text", "A metal from the Nether, tempered by magma, imbued with the power of lava. The faint rumble of magma can almost be heard.");
        REGISTRATE.addRawLang("tips.flame_netherite_alloy.name_tip", "Obtain by targeting a Magma Block with a Netherite Ingot in the Nether.");
        REGISTRATE.addRawLang("tips.pledge_flame_vermilion_strand.name_tip", "Drops from Blazes (30%% chance) or obtain by breaking Cobwebs with a Fire Aspect sword.");
        REGISTRATE.addRawLang("patchouli.srelic.book.entries.arrow.pledge_flame_vermilion_strand.pages.0.text", "Has a chance to drop from slain Blazes or can be obtained by mining Cobwebs with a sword enchanted with 'Fire Aspect'.");
        REGISTRATE.addRawLang("tips.abyssal_luminance_ingot.name_tip", "Throw a Heart of the Sea, Oceanic Alloy Ingot, and Frozen Alloy Ingot onto a Sea Lantern, then click the lantern to obtain (consumes these four items).");
        REGISTRATE.addRawLang("patchouli.srelic.book.entries.arrow.oceanic_netherite_alloy.pages.0.text", "The gentle yet resilient ocean bestows its power upon Netherite, granting it the force of tides and the harmony of ripples.");
        REGISTRATE.addRawLang("patchouli.srelic.book.entries.arrow.thunder_netherite_alloy.pages.0.text", "Having endured divine wrath, Netherite becomes more refined. The lightning swirling upon it manifests the immense power it now holds.");
        REGISTRATE.addRawLang("patchouli.srelic.book.entries.arrow.demon_ingot.pages.0.text", "An entity that should not exist, born from the fusion of the four Netherite alloys under the intervention of a Nether Star. The world has endowed it with unparalleled power.$(br2)P.S.: $(o)(What is this, Den-O Climax Form?)");
        REGISTRATE.addRawLang("patchouli.srelic.book.entries.arrow.sakura_steel_ingot.pages.0.text", "A material combining iron with cherry blossoms, possessing the hardness of steel and the fragrance of sakura. The sakura patterns on its surface enhance its aesthetic beauty.");
        REGISTRATE.addRawLang("patchouli.srelic.book.entries.arrow.ex_star.pages.0.text", "The ultimate materialization. It can temper weapons, awaken their latent power, grant new abilities, and help weapons surpass their limits.");
        REGISTRATE.addRawLang("patchouli.srelic.book.entries.arrow.windy_core.pages.0.text", "Amethyst from the depths of the earth, which must break free from 300 meters of confinement to embrace the free winds coursing atop the dome. High in the heavens, the spirit of the leylines intertwines with the untamed sky winds, forging this light yet tempestuous crystalline core. $(br)— 300 meters is the distance where Amethyst meets the wind.");
        REGISTRATE.addRawLang("tips.windy_core.name_tip", "Right-click with an Amethyst Shard at Y-level 300 or above to transform.");
        REGISTRATE.addRawLang("patchouli.srelic.book.entries.arrow.windy_core_ingot.easter-egg1", "In the wind-eye at the End's extremity, the Knights of Favonius once attempted to forge wings that could return to the surface using Netherite Embers. $(br)They smelted the resilience of Netherite but forgot the high-altitude solitude hidden within the Anemo Crystals— $(br)Thus, the Sky Alloy was born: $(br)A metal dark blue to the point of gray, like the last starlight devoured by clouds before dawn. $(br)It defies gravity with its lightness, yet can 'gift' falling damage back to the very air;");
        REGISTRATE.addRawLang("patchouli.srelic.book.entries.arrow.windy_core_ingot.easter-egg2", "It is so cold that armor made from it forever condenses a thin mist on its surface, in which occasionally flickers the remnant shadow of your first fall. $(br)Wearing it, you belong neither to the earth nor the sky— $(br)You are merely a wanderer co-signed by storms and magma, $(br)hearing, with every leap, the low sigh simultaneously uttered by the western winds and the Nether.");
        REGISTRATE.addRawLang("patchouli.srelic.book.entries.arrow.windy_core_ingot.pages.1.text", "Sky Alloy, dark blue as the first fall of night.");
        REGISTRATE.addRawLang("patchouli.srelic.book.entries.arrow.windy_core_ingot.pages.2.text", "Anemo Crystals and Netherite Alloy fused amidst thunderstorms, forged into touchable firmament. $(br)Light as a feather, hard as a star. Walking upon it, you leave behind a trail of clouds shredded by the wind. $(br)— If you toss a piece of Sky Alloy into the air on a new moon night, it will not land but quietly trade your next storm for a clear sky.");
        REGISTRATE.addRawLang("patchouli.srelic.book.entries.arrow.eternal_plum.easter-egg1", "Falling as snow, scattering as fire — The 75th Director of the Wangsheng Funeral Parlor says this is the most economical Soul-Guiding Lantern. Some die before the flowers bloom, some live just to see them. But the plum tree simply sinks its roots into tombstones, blooming year after year.");
        REGISTRATE.addRawLang("patchouli.srelic.book.entries.arrow.max_ingot.pages.0.text", "Melt the fire of the earth's core, forge the soul of spring sakura, gather the will of heroic spirits — This ingot is the first light of the breaking dawn!");
        REGISTRATE.addRawLang("patchouli.srelic.book.entries.arrow.max_ingot.easter-egg", "Touching it feels warm as the morning sun. Sakura patterns flow across its surface like a river of life, while the shimmering soul-light within resembles the smiling watch of countless heroes...");
        REGISTRATE.addRawLang("patchouli.srelic.book.entries.arrow.blue_ingot.pages.0.text", "Blue butterflies meld into Netherite, absorbing stellar power, forming two types of alloys under the influence of quantum forces.");
        REGISTRATE.addRawLang("patchouli.srelic.book.entries.arrow.rad_ingot.pages.0.text", "Blood-red butterflies meld into Netherite, gaining the power of apoptosis, forming two types of alloys within the quantum realm.");
        REGISTRATE.addRawLang("patchouli.srelic.book.entries.arrow.phantom_trace_ingot.easter-egg", "§oHe who holds this ingot sees only illusions, touches only mirages. Only pain remains undeniably real.");
        REGISTRATE.addRawLang("patchouli.srelic.book.entries.arrow.dreamweave_ingot.easter-egg", "This ingot is forged from solidified slumber. Where its edge reaches, all fall into eternal, beautiful dreams.");
        REGISTRATE.addRawLang("patchouli.srelic.book.entries.arrow.nightstalker_ingot.easter-egg", "Drinking enemy blood in the name of protection. The moment this ingot heals is also the moment of its rebirth.");
        REGISTRATE.addRawLang("patchouli.srelic.book.entries.arrow.nightmare_core_ingot.easter-egg", "Sipping anguish with a heart of guardianship. The moment this ingot is reforged is also the moment nightmares descend.");
        REGISTRATE.addRawLang("patchouli.srelic.book.entries.arrow.grammer_core.easter-egg", "Life should be like fireflies — not yearning for eternity, only seeking to burn utterly once. Moths to the flame, living towards death.");
        REGISTRATE.addRawLang("patchouli.srelic.book.entries.arrow.butterfly.easter-egg", "The wing-scales of the Phantom Butterfly forge gentle protection; the bloody dew of the Nightmare Butterfly condenses into sweet nectar. The essence of these four metals — is the supreme prize marked by the gods for 'Protection' and 'Fantasy'!");
        REGISTRATE.addRawLang("patchouli.srelic.book.entries.arrow.grammer_alloy_ex.pages.0.text", "When the last vestige of 'human' memory evaporates, the alloy shall hear destiny's call, burn the Swarm, and leave behind scattered fireflies.");
        REGISTRATE.addRawLang("patchouli.srelic.book.entries.arrow.grammer_alloy_ex.easter-egg", "Jade-green flames surge skyward, transforming into billions of firefly swarms! The swarms converge into her silhouette, flying towards deep space — where they pass, stars ignite one after another, finally exploding at the black hole's edge into never-extinguishing stellar lanterns.");
        REGISTRATE.addRawLang("patchouli.srelic.book.entries.arrow.grammer_alloy.pages.0.text", "Using insect carapaces as bones, human souls as kindling, to forge the final hope within the firmament.");
        REGISTRATE.addRawLang("patchouli.srelic.book.entries.arrow.grammer_core.pages.0.text", "It is both an engine and a coffin — burning is the Swarm's energy, extinguishing is the last ember of humanity. It turns out the ultimate forging is to forge the heart into light.");
        REGISTRATE.addRawLang("tips.grammer_alloy.name_tip", "Obtain by killing 20 Silverfish with a Blazing Netherite Alloy Ingot.");
        REGISTRATE.addRawLang("patchouli.srelic.blood_plum.name", "Blood Plum Tree");
        REGISTRATE.addRawLang("patchouli.srelic.crimson_shadow.name", "Crimson Shadow");
        REGISTRATE.addRawLang("patchouli.srelic.blood_plum_sampling_ex.name", "Enchanted Blood Plum Sapling");
        REGISTRATE.addRawLang("patchouli.srelic.book.entries.arrow.blood_plum.pages.0.text", "A sapling brought by a displaced merchant, said to be a special variety cultivated by a certain girl.$(br2)($(o)Obtained by trading with a Wandering Trader.)");
        REGISTRATE.addRawLang("patchouli.srelic.book.entries.arrow.blood_plum.easter-egg", "§o The Wangsheng Funeral Parlor once received the body of a young man, who was clutching a bag of dried plum seeds. Hu Tao buried the seeds with the youth. Unexpectedly, a plum tree with bone-like branches grew from the grave. Seven days later, the tree bore fruit eerily resembling the boy's face, which rotted before it could be picked. The Director laughed heartily: \"So, attachment is the most potent fertilizer after all!\" She then watered it with cinnabar water, and the bark peeled away to seep blood...");
        REGISTRATE.addRawLang("patchouli.srelic.book.entries.arrow.pule_apple.pages.0.text", "A strange fruit borne from the Blood Plum Tree's absorption of attachments. Its taste lies somewhere between an unripe apricot and iron rust. It may have special effects on blades. ($(4)$(l)DO NOT CONSUME!!!!!!!!)");
        REGISTRATE.addRawLang("patchouli.srelic.book.entries.arrow.pule_apple.easter-egg", "§o \"That crazy girl's graduation fruit! Eating one lets you see the life-flash of the dead! There's just one side effect—$(rb)Every graduation season from then on, your exhaled breath will condense into Blood Plum petals. (Note: $(o)Director Hu calls this 'Romantic Pulmonary Tuberculosis'. Does she handle售后服务/after-sales for this?)\"");
        REGISTRATE.addRawLang("patchouli.srelic.book.entries.arrow.blood_plum_sampling_ex.pages.1.text", "This sapling can only grow naturally; it cannot be accelerated with Bone Meal.");
        REGISTRATE.addRawLang("patchouli.srelic.book.entries.arrow.blood_plum_leaves.pages.1.text", "$(4)$(l)Breaking by hand yields NO DROPS!!!$() Using Shears to break them has a chance to drop a Blood Plum Sapling, Graduation Fruit, Samsara Plum, or Shard of Glory.");
        REGISTRATE.addRawLang("patchouli.srelic.book.entries.arrow.maxim.pages.0.text", "§b When the first light cuts the horizon, the iris raises its violet-blue sword—to sign for the delivery of yet another sunny day for the world.");
        REGISTRATE.addRawLang("patchouli.srelic.book.entries.arrow.maxim.easter-egg", "Someone asked: How can fragile flowers weather millions of years of storms? The iris answers: Sink your roots into the abyss, yet always believe the light will bend to kiss you—that is the gentlest survivalism.");
        REGISTRATE.addRawLang("patchouli.srelic.book.entries.arrow.crimson_core.pages.0.text", "A paradox engine fueled by Punishing Virus crystals. Implantation permanently dyes the user's right eye crimson. $(o) Each time it overclocks, blood-colored crystalline clusters will grow from the bones, and a random segment of 'happy memories' is deleted from the memory bank as the price.");
        REGISTRATE.addRawLang("patchouli.srelic.book.entries.arrow.crimson_core.easter-egg", "At the moment of overclocking, all frames' monitors flash the same error code: $(c)$(l)$(o) ERROR: HOPE_NOT_FOUND§r. And the Crimson Core is a love letter to this line of code. §l Humanity's choice is always one more than the apocalypse.");
        REGISTRATE.addRawLang("patchouli.srelic.book.entries.arrow.red_tide_core.pages.0.text", "When the Punishing Virus condenses into a liquid abyss— $(4)$(l)Where the Red Tide reaches, steel blossoms into flowers of flesh and blood.");
        REGISTRATE.addRawLang("patchouli.srelic.book.entries.arrow.red_tide_core.easter-egg", "Humankind named hope '$(c)$(l)Red$()'. The Red Tide used it to name humanity's epitaph— $(l) a flowing obituary. §r §c§o When destruction becomes the norm, is holding onto humanity the most romantic rebellion?");
        REGISTRATE.addRawLang("patchouli.srelic.book.entries.arrow.crimson_shadow_ore.pages.0.text", "We folded the world in the name of salvation, only to fold ourselves into the deepest blood veins of this ore. The crystallization of the resonance between the Punishing Virus and human despair— $(c)It devours shadows, yet spews crimson lies.");
        REGISTRATE.addRawLang("patchouli.srelic.book.entries.arrow.crimson_shadow_ore.easter-egg", "Humanity uses 'Crimson Shadow Ore' to forge weapons of salvation—unaware that within each ore lies a soul refusing to pass on.");
        REGISTRATE.addRawLang("patchouli.srelic.book.entries.arrow.crimson_shadow.pages.0.text", "Obtained by right-clicking any block (except bedrock and Crimson Shadow Ore) with Crimson Paper.");
        REGISTRATE.addRawLang("patchouli.srelic.book.entries.arrow.shirin_fish.pages.0.text", "A cute yet tsundere creature that has traversed time and space. A light touch makes it inflate; a gentle poke makes it deflate. It harbors special feelings for instant noodles(?)—$(o) Inflation is instinct, deflation is destiny, but deliciousness is worth risking it all!$()$(#9A5CC6)$(l)#ThisPufferfishPassesImaginaryAuthentication ##OverInflationExemptByCuteness#");
        REGISTRATE.addRawLang("tips.shirin_fish.name_tip", "Can be obtained by fishing with a chance.");
        REGISTRATE.addRawLang("patchouli.srelic.book.entries.arrow.shirin_fish.easter-egg1", "Do not be deterred by its inflated spines, nor snicker at its deflated tears. The most precious poison is $(l)the child in the Tower of Babylon who was never embraced.");
        REGISTRATE.addRawLang("patchouli.srelic.book.entries.arrow.void_ingot.easter-egg1", "The resonance of Sirin's Herrscher Core, steel that rends reality. $(l)\"This object should be sealed between the layers of fairy tales and nightmares.\" \"But someone always grips it tight to rewrite the ending.\"$()$(#FF5555)$(o) It is both a cage and a key—the children of the Tower of Babylon cry within the steel, while the newborn Herrscher forges their tears into wings. $(l)So-called god-slaying weapons are merely the dagger God hands to the victim.");
        REGISTRATE.addRawLang("patchouli.srelic.book.entries.arrow.void_core.easter-egg1", "The echo of Sirin's falling tears, ultimately becoming the diamond that tears dimensions. \"They call this a seed of destruction, forgetting that every vortex is an unsent letter—the girl who always wrote birthday wishes in the corner of the lab cried her childish wish of 'wanting a star' into a $(l)$(o)scar-grade romantic tale piercing the multiverse.");
        REGISTRATE.addRawLang("patchouli.srelic.book.entries.arrow.abyssal_luminance_ingot.pages.0.text", "Only by pouring the essence of the ocean upon a sea lantern can one awaken the eternal luminance from the abyssal depths.");
        REGISTRATE.addRawLang("patchouli.srelic.book.entries.arrow.abyssal_luminance_ingot.easter-egg1", "The sea lantern breathes in the undercurrents. You clutch three creations: the Heart of the Sea pulsing with tidal rhythm, the Oceanic Alloy Ingot covered in coral etchings, the Frozen Alloy Ingot seeping glacial sighs. $(br)As they fall towards the lantern—light, devours the falling objects. The wick opens like a whale's maw, the alloys collapse and reshape in molten light, veins of frost and sea intertwine and climb within the cerulean blaze... Until a metal ingot flowing with starry seas is born from the womb of the abyss.");
        REGISTRATE.addRawLang("patchouli.srelic.book.entries.arrow.nereid_s_secret_brew.pages.0.text", "$(l)$(o)$(b)Those who drink this cup shall either drown in the deep sea, or ascend to the throne of the Hydro Archon—");
        REGISTRATE.addRawLang("patchouli.srelic.book.entries.arrow.nereid_s_secret_brew.easter-egg1", "The cheers of the masses fall silent, the grand opera concludes. Now, no longer playing the role of the deity, she offers you this secret brew, infused with both '$(#A8A8A8)divinity$()' and '$(b)humanity$()', during her private moment of respite.");
        REGISTRATE.addRawLang("patchouli.srelic.book.entries.arrow.surgeheart_vortex.pages.0.text", "The moment you use the $(b)Abyssal Luminance Ingot$() as a blade to cleave the Heart of the Sea— $(l)what flows out is not divine blood, but the remorse of a civilization from the previous epoch.");
        REGISTRATE.addRawLang("patchouli.srelic.book.entries.arrow.surgeheart_vortex.easter-egg1", "The Surging Core bursts with stellar vein cracks; thunderous storms forge a rotating iris within the wounds. Thus, the Abyssal Eye's Sacred Vortex is born: this core is alive. $(l)$(b)It is gazing at you, with tides for eyelashes and the starry sea as the pupil's backdrop.");
        REGISTRATE.addRawLang("patchouli.srelic.book.entries.arrow.ignis_cube.pages.0.text", "$(l)$(o)$(4)This cube is not an ember, but the solidified wrath of the sun. This cube is not an ember, but the solidified wrath of the sun. This cube is not an ember, but the solidified wrath of the sun.");
        REGISTRATE.addRawLang("patchouli.srelic.book.entries.arrow.ignis_cube.easter-egg1", "Along the trajectory of the greatsword's descent, solar prominences surge like divine blood, while your hair-tips turn to ash, your corneas branded with nova patterns. You know—if you do not win this battle, this cube will become your $(l)cube-shaped tombstone$, pressed upon the chest of civilization's charred corpse, a warning to the next fire-gatherer: \"$(#A8A8A8)$(o)Transcendence is not advancement, but elegant self-immolation.$()\"");
        REGISTRATE.addRawLang("patchouli.srelic.book.entries.arrow.nightterror_bloodwing.pages.0.text", "A butterfly dancing amidst the sea of flowers, dyed a bloody color for the sake of protection, while behind it, a blue butterfly dances.$(br2)$(#E70000)$(o)For those cerulean wings to forever paint dreams, I willingly steep myself in eternal night, using blood as my makeup.$(br)$()————Whispers of the Nightmare");
        REGISTRATE.addRawLang("patchouli.srelic.book.seele.arrow.butterfly.pages.0.text", "The blue butterfly constructs beautiful dreams; its fluttering wings trace the marks of fantasy, nurturing hope within shadows.$(br2)$(1)$(o)Each beat of its wings carries a moonbeam I never spoke aloud$(br)$().————Echo of the Dream Butterfly");
        REGISTRATE.addRawLang("patchouli.srelic.book.seele.arrow.butterfly.easter-egg", "A crystalline chrysalis emitting a gentle blue glow, yet deep within, a crimson thread like congealed blood is coiled. Upon touch, one seems to hear the faint tremor of wings and a silent sigh. It is the blood-stained oath of the guardian, and the undying dream of the one being guarded.");
        REGISTRATE.addRawLang("patchouli.srelic.pledge_flame_vermilion_strand.name", "$(#E70000)Threads Woven from Blazing Flames");
        REGISTRATE.addRawLang("patchouli.srelic.book.seele.arrow.pledge_flame_vermilion_strand.pages.0.text", "From the blazing flames, you gather a strand still alight, its core pulsing with a familiar energy frequency.$(br2)\"$(o)You understand this is no creation of this world. Your fingertips sense a faint pulse emanating from it, warm and resolute, as if linking to a distant consciousness. This connection belongs solely to you and her.$()\"");
        REGISTRATE.addRawLang("patchouli.srelic.scarletflame_ingot.name", "Oath-forged gold tempered by hellish flames. Its edge yet undrawn, its blazing breath already scorches the darkness.");
        REGISTRATE.addRawLang("patchouli.srelic.book.seele.arrow.scarletflame_ingot.pages.0.text", "\"A special metal ingot emitting a warm, blazing glow. Within, pink flowing fire and golden stardust seem to flow unceasingly. A light touch reveals a familiar, fiery warmth that does not burn, and a clear, resolute voice:$(br)$(o)'Gray Raven Squad Leader, Lucia. Pleased to meet you. Let's go, Commander. There is much we must accomplish together.'\"");
        REGISTRATE.addRawLang("patchouli.srelic.emberquill.name", "A flame-feather rending darkness, an oath forged of blazing fire.$(br2)\"This is not a weapon or material, but a manifested vow.\"");
        REGISTRATE.addRawLang("patchouli.srelic.book.seele.arrow.emberquill.pages.0.text", "\"It originates from the most blazing 'heart' of a Construct—when the will to protect shatters dimensional shackles, transforming into a crimson lotus that incinerates all obstacles. Its core is cold machinery, yet it burns more utterly than any flame.\"");
        REGISTRATE.addRawLang("patchouli.srelic.book.seele.arrow.emberquill.pages.1.text", "\"Holding it, you feel a warm resonance, as if connecting with a distant will. It does not demand power from you, but whispers softly: '$(o)I want to exist in the same time as you, gaze upon the same world. No matter what happens, Gray Raven will gather again—this is also my vow to you.$()'\"");
        REGISTRATE.addRawLang("patchouli.srelic.pledgeflame_heartforge.name", "\"The burning will shall never be extinguished.\"");
        REGISTRATE.addRawLang("patchouli.srelic.book.seele.arrow.pledgeflame_heartforge.pages.0.text", "After a faint crackle of static-like noise, a clear and resolute voice speaks directly in your consciousness, like the first flame ignited under a silent night sky, dispelling all chaos.) $(br)\"Can you hear me, Commander?\" $(br)$(o)(The voice carries a trace of urgency, barely noticeable, then transforms into the relief and certainty of having found its target.)");
        REGISTRATE.addRawLang("patchouli.srelic.book.seele.arrow.pledgeflame_heartforge.pages.1.text", "\"Finally... successfully anchored your coordinates.\" $(br)\"Even across the barrier of worlds, the 'connection' between us has never been severed. This resonance is the beacon that guided me here.\" $(br)\"Please, do not hesitate. Wield this blade, driven by my core and my vow.\" $(br)$(o)(The voice becomes immeasurably warm and firm, brimming with unspoken trust and power.)$() $(br)\"Because, from this moment on— $(br)$(l)We, shall once again, $(4)'Fight Side by Side.'\"$()");

        // Special Effects
        REGISTRATE.addRawLang(CreateSeLang(SRSpecialEffectsRegistry.FLAMEROSION), "Flame Erosion");
        REGISTRATE.addRawLang(CreateSeLang(SRSpecialEffectsRegistry.MAXBREAK), "Limit Break - Savior's Radiance");
        REGISTRATE.addRawLang(CreateSeLang(SRSpecialEffectsRegistry.LICH), "Undead Overture");
        REGISTRATE.addRawLang(CreateSeLang(SRSpecialEffectsRegistry.LICH) + ".desc", "When an enemy has the Wither effect, each of your attacks increases its stack by 1!");
        REGISTRATE.addRawLang(CreateSeLang(SRSpecialEffectsRegistry.LICH) + ".desc_1", "At 10 stacks, detonates and launches a high-multiplier Phantom Blade");
        REGISTRATE.addRawLang(CreateSeLang(SRSpecialEffectsRegistry.WhiteMaker), "Constructed at This Moment");
        REGISTRATE.addRawLang(CreateSeLang(SRSpecialEffectsRegistry.WhiteMaker) + ".desc", "Each attack has a chance to project a Phantom Blade");
        REGISTRATE.addRawLang(CreateSeLang(SRSpecialEffectsRegistry.PATH_OF_DESTRUCTION), "Path - Destruction");
        REGISTRATE.addRawLang(CreateSeLang(SRSpecialEffectsRegistry.PATH_OF_DESTRUCTION) + ".desc", "When HP is below 30%%, gain 150%% attack bonus and continuous regeneration. Being hit has a 25%% chance to trigger damage reflection.");
        REGISTRATE.addRawLang(CreateSeLang(SRSpecialEffectsRegistry.PATH_OF_DESTRUCTION) + ".text", "The Aeon shatters stars, transforms upon the abyss; all things return to dust. $(br)The human soul is tempered in destruction, civilization is reborn in transformation. $(br2)$(br2)When you ignite the first star— $(br)remember, that flame is your wedding candle offered to Finality.");
        REGISTRATE.addRawLang(CreateSeLang(SRSpecialEffectsRegistry.PATH_OF_THE_HUNT), "Path - The Hunt");
        REGISTRATE.addRawLang(CreateSeLang(SRSpecialEffectsRegistry.PATH_OF_THE_HUNT) + ".desc", "Each attack accumulates 'Star Arrow' stacks. At 7 stacks, release high damage.");
        REGISTRATE.addRawLang(CreateSeLang(SRSpecialEffectsRegistry.PATH_OF_THE_HUNT) + ".text", "Judging sin, hunting the abyss, star arrows pierce the void, the abyss hunter never returns, bursting with vengeful light in deepest dark, creating new life through destruction. $(br2)$(br2)When the first arrow leaves the string— $(br)listen, the bowstring's vibration is the resonant hatred of countless annihilated civilizations.");
        REGISTRATE.addRawLang(CreateSeLang(SRSpecialEffectsRegistry.PATH_OF_PRESERVATION), "Path - Preservation");
        REGISTRATE.addRawLang(CreateSeLang(SRSpecialEffectsRegistry.PATH_OF_PRESERVATION) + ".desc", "Gain damage absorption.");
        REGISTRATE.addRawLang(CreateSeLang(SRSpecialEffectsRegistry.PATH_OF_PRESERVATION) + ".text", "Amber stands firm, building walls; iron vows protect borders; crystalline tears seal oaths; the morning monument stands eternal; a thousand stars defend together. $(br2)$(br2)When the amber wall rises from the earth— $(br)look, its scars are the wounds of civilization, its top holds unextinguished stellar fire.");
        REGISTRATE.addRawLang(CreateSeLang(SRSpecialEffectsRegistry.PATH_OF_THE_GLUTTONY), "Path - Voracity");
        REGISTRATE.addRawLang(CreateSeLang(SRSpecialEffectsRegistry.PATH_OF_THE_GLUTTONY) + ".desc", "Attacks lifesteal 10%% of damage dealt. Each attack stacks a damage buff, up to 10 stacks.");
        REGISTRATE.addRawLang(CreateSeLang(SRSpecialEffectsRegistry.PATH_OF_THE_GLUTTONY) + ".text", "Devouring stars, gnawing suns, eternally hungry, eternally corroding, turning all into nourishment, repairing self, until everything is consumed. $(br2)$(br2)The horror of Voracity lies in its absurd tragic core— $(br)when he swallows the last grain of stardust, he will find he's been chewing his own reflection in the mirror.");
        REGISTRATE.addRawLang(CreateSeLang(SRSpecialEffectsRegistry.PATH_OF_THE_UNDYING), "Path - The Undying");
        REGISTRATE.addRawLang(CreateSeLang(SRSpecialEffectsRegistry.PATH_OF_THE_UNDYING) + ".desc", "When near death, triggers death immunity, restores 50%% HP, and grants 10 seconds of invincibility. Cooldown 10 minutes.");
        REGISTRATE.addRawLang(CreateSeLang(SRSpecialEffectsRegistry.PATH_OF_THE_UNDYING) + ".text", "Flesh eternal, spirit everlasting; the dragon scion inherits the will, the celestial spine bears the scales, broken scales continue the path, abyssal slumber transforms into divinity. When the last dragon scale sinks into the stellar abyss— look, within the rusted bones writhes a nascent first egg. $(br2)$(br2)The awe of Undying lies precisely in its fractured nature— $(br)the fall of the Dragon Progenitor reveals: $(o)$(l)True eternity requires millions of deaths as sacrifice.");
        REGISTRATE.addRawLang(CreateSeLang(SRSpecialEffectsRegistry.PATH_OF_ABUNDANCE), "Path - Abundance");
        REGISTRATE.addRawLang(CreateSeLang(SRSpecialEffectsRegistry.PATH_OF_ABUNDANCE) + ".desc", "Heals teammates within 8 blocks every 5 seconds. Grants group resistance increase effect.");
        REGISTRATE.addRawLang(CreateSeLang(SRSpecialEffectsRegistry.PATH_OF_ABUNDANCE) + ".text", "The Aeon could not bear the world's suffering, thus bestowed blessings. Blessings formed realms, protecting all sentient beings, one Dharma-realm heart. $(br2)$(br2)When the first drop of jade dew mends a wound— can you hear it? Your bones are cracking with the sound of new sprouts.");

// Fix duplicate key issue
        REGISTRATE.addRawLang("se.srelic.shift_nodown", "Hold Shift to view SE details");

        // 修正重复键问题
        REGISTRATE.addRawLang("se.srelic.path_of_remembrance", "Path - Remembrance");
        REGISTRATE.addRawLang("se.srelic.path_of_remembrance.desc", "Attacks have a 50%% chance to freeze the target.");
        REGISTRATE.addRawLang("se.srelic.path_of_remembrance.text", "Memory bears the ages, light cones seal eternity, echoes build the city, burning memories ignite the night, the eternal slumber bell tower freezes all. $(br)When the last memory lamp extinguishes— $(br)look, Fuli's divine form blooms with the afterglow of billions of annihilated universes. $(br2)$(br2)Memory intervenes in the cycle, letting dissipated starlight become the blade piercing the final darkness, cutting through the cycle with the ages.");
        REGISTRATE.addRawLang("se.srelic.path_of_harmony", "Path - Harmony");
        REGISTRATE.addRawLang("se.srelic.path_of_harmony.text", "Ten thousand sing as one, a thousand hearts share one rhythm, weaving the web of harmony; ten thousand spirits in symphony, a thousand souls shining together, resonating with sacred hymns. Stars align in order, swearing eternal concord. $(br2)$(br2)When a lone star tries to shine, the universe is silent; $(br)When stars beat as one, even black holes sing.");
        REGISTRATE.addRawLang("se.srelic.path_of_harmony.desc", "Group gains the Strength effect.");
        REGISTRATE.addRawLang("se.srelic.path_of_nihility", "Path - Nihility");
        REGISTRATE.addRawLang("se.srelic.path_of_nihility.text", "No thoughts, no delusions; all colors fade to black; waking and sleeping share one coffin; all things return to silence; the empty abyss devours; the embers burn forever. $(br2)$(br2)When you cheer for victory— $(br)please listen, from the embers comes the mocking laughter of all annihilated universes.");
        REGISTRATE.addRawLang("se.srelic.path_of_nihility.desc", "Successfully attacking applies Weakness and Mining Fatigue III to enemies.");
        REGISTRATE.addRawLang("se.srelic.path_of_propagation", "Path - Propagation");
        REGISTRATE.addRawLang("se.srelic.path_of_propagation.text", "The Swarm pours from its nest, ten thousand eggs devour stars; kind womb breeds monstrous offspring, infinite and endless; flesh blossoms across the firmament, insect calamity, heavenly tribulation, cosmic locust plague. $(br2)$(br2)When the first insect egg embeds in the earth's core— $(br)listen, the heartbeat of the star is gradually changing into the fetal sound of hatching.");
        REGISTRATE.addRawLang("se.srelic.path_of_propagation.desc", "Each attack on an enemy spawns one Silverfish (infinite multiplication, but limited to 40 Silverfish in the vicinity).");
        REGISTRATE.addRawLang("se.srelic.path_of_erudition", "Path - Erudition");
        REGISTRATE.addRawLang("se.srelic.path_of_erudition.text", "Burning tomes open the heavens, myriad principles weave the cosmos, freezing light forms the dome of the brain, entropy locks converge into one; knowledge is power, enchantments transform into amplification. $(br2)$(br2)When you solve the formula of all things— $(br)please remember, the deleted 'soul variable' is sneering amidst the ruins.");
        REGISTRATE.addRawLang("se.srelic.path_of_erudition.desc", "Gain additional effects based on the weapon's enchantment level: $(br2)Sharpness → Damage increase (+10%% per level) $(br2)Fire Aspect → Ignite duration doubled $(br2)Looting → Extra drop chance.");
        REGISTRATE.addRawLang("se.srelic.path_of_elation", "Path - Elation");
        REGISTRATE.addRawLang("se.srelic.path_of_elation.text", "The Fool of a thousand faces, playing games with the dusty world, teasing all living beings, turning right and wrong upside down. If someone in reality tells you, 'The codex needs a wipe,' remember to immediately turn the nearest book upside down— $(br)there might really be a candy waiting for you. $(br2)$(br2)Rule Zero: All rules can be overturned by Aha's sneeze! $(br)Ultimate Truth: Cake is more important than philosophy— $(br)especially when it's smashed in your face.");
        REGISTRATE.addRawLang("se.srelic.path_of_elation.desc", "Converts 50%% of healing into group restoration. Applies a 5-second Glowing effect to affected targets. Each trigger of group healing increases movement speed by 10%% (stacks up to 3 times).");
        REGISTRATE.addRawLang("se.srelic.path_of_equilibrium", "Path - Equilibrium");
        REGISTRATE.addRawLang("se.srelic.path_of_equilibrium.text", "Equilibrium maintains the world's balance; all contention ceases; rewards and punishments share the same contract; reason's explosion maintains stability; yin and yang harmonize. $(br2)$(br2)When civilization cheers for victory— $(br)look, the Arbitrator has already carved the countdown on the newborn tombstone.");
        REGISTRATE.addRawLang("se.srelic.path_of_equilibrium.desc", "Switching weapons changes between offensive and defensive stances. Offensive Stance: +150%% damage. Defensive Stance: +40%% damage resistance.");
        REGISTRATE.addRawLang("se.srelic.path_of_finality", "Path - Finality");
        REGISTRATE.addRawLang("se.srelic.path_of_finality.text", "Finality's echo, fate's wheel fixed forever, the end descends, the eternal epoch offers no return, eternal calamity knows no laughter, the gods shed no tears. $(br2)$(br2)\"Elation\" births farce through mischief, while \"Finality\" writes the full stop in silence— $(br)eternal calamity knows no laughter, the gods shed no tears.");
        REGISTRATE.addRawLang("se.srelic.path_of_finality.desc", "Every 3 consecutive kills triggers an area explosion. Taking damage resets the kill streak count.");
        REGISTRATE.addRawLang("se.srelic.path_of_trailblaze", "Path - Trailblaze");
        REGISTRATE.addRawLang("se.srelic.path_of_trailblaze.text", "The trailblazing train that chisels through the cosmos, traversing the unknown; building rainbows where no path exists, broken helm pointing to the stars, leaving tracks in the void sea, creating life in desolate lands, leaving behind the stories of the Nameless, creating the glory of the Nameless. When the train crashes into the universe's barrier— $(br)listen, from the cracks come the cries and cheers of ten thousand unborn worlds. $(br2)$(br2)Trailblaze born from destruction, awakening slumbering civilizations at the cost of self-annihilation, turning the impossible into possible. $(br)The true course must be paved with divine corpses; the vastest frontier is forever named after the first who fell.");
        REGISTRATE.addRawLang("se.srelic.path_of_trailblaze.desc", "Gain Speed III, Strength III, Hero of the Village I.");
        REGISTRATE.addRawLang("se.srelic.path_of_mystery", "Path - Mystery");
        REGISTRATE.addRawLang("se.srelic.path_of_mystery.text", "Distorting right and wrong, weaving paradoxes into logic, ten thousand appearances blind the eye, fabricating historical texts, abyssal knowledge corrodes wisdom, the sage of folly, tricks of illusion, true for the believer.");
        REGISTRATE.addRawLang("se.srelic.path_of_mystery.easter-egg", "When you decipher the stars, they have already collapsed into ashes in your eyes— $(br)so-called truth is merely new bricks for the prison of perception.");
        REGISTRATE.addRawLang("se.srelic.path_of_mystery.desc", "Attacks randomly trigger one of the following effects: Time Warp / Spatial Rift / Energy Backlash / Fate's Sanctuary / Chaos Burst.");
        REGISTRATE.addRawLang("se.srelic.path_of_order", "Path - Order");
        REGISTRATE.addRawLang("se.srelic.path_of_order.text", "Order maintains stability, stability grants power; all phenomena return to the mold, eternally imprisoned praise steles, commandment chains bind stars, the holy adjudicator's carving knife. $(br2)$(br2)When you cheer for the Eternal Codex— $(br)listen, the sound of gears meshing is crushing your last breath.");
        REGISTRATE.addRawLang("se.srelic.path_of_order.desc", "Gain offensive and defensive bonuses when not under negative effects. Attacks clear all buffs from enemies.");
        REGISTRATE.addRawLang("se.srelic.path_of_purity", "Path - Purity");
        REGISTRATE.addRawLang("se.srelic.path_of_purity.text", "Shattered mirror starcrown, tears sculpt the sacred realm; the one who pursues, the rainbow escapes its prison; ten thousand poems become blades, a thousand eyes condense radiance. When the last teardrop crystallizes— $(br)look, the starcrown within the cracks is closer to heaven than a whole universe. $(br2)$(br2)The silver-white knight pursues the world's beauty, sweeping away darkness with the lance in hand, seeking the shattered light in the mirror for a lifetime.");
        REGISTRATE.addRawLang("se.srelic.path_of_purity.desc", "Gain Resistance III.");
        REGISTRATE.addRawLang("se.srelic.path_of_healing", "Abundance - Mercy");
        REGISTRATE.addRawLang("se.srelic.path_of_healing.text", "A thousand eyes gaze with compassion, unable to bear the suffering of all living beings, bestowing blessings, wishing to foster harmony among all things in the world, but things go contrary to wishes, merciful flesh devours bone.");
        REGISTRATE.addRawLang("se.srelic.path_of_healing.desc", "Your attacks will heal the target you hit.");

        REGISTRATE.addRawLang("se.slashblade_addon.burst_drive.desc", "Each attack triggers a Phantom Blade");

        REGISTRATE.addRawLang("se.srelic.void_finale", "Finale - The End of Nothingness");
        REGISTRATE.addRawLang("se.srelic.void_finale.desc", "Each attack applies a stack of Weakness to the enemy; detonates at 7 stacks");

        REGISTRATE.addRawLang("se.srelic.celestial_collapse", "Destruction - Rule Breaker");
        REGISTRATE.addRawLang("se.srelic.celestial_collapse.desc", "Build up to 7 combo stacks through consecutive attacks; each stack provides 15% damage bonus");
        REGISTRATE.addRawLang("se.srelic.celestial_collapse.desc_1", "At 7 stacks, triggers Void Cleave, dealing 2.5x damage");

        REGISTRATE.addRawLang("se.srelic.blazing_heart_shield", "Preservation - Molten Heartguard");
        REGISTRATE.addRawLang("se.srelic.blazing_heart_shield.desc", "When HP falls below 30%, automatically generates a Molten Shield that absorbs 70% damage for 20 seconds; cooldown 30 seconds");
        REGISTRATE.addRawLang("se.srelic.blazing_heart_shield.desc_1", "While shielded, being hit applies 5 seconds of Burning to the attacker");
        REGISTRATE.addRawLang("se.srelic.blazing_heart_shield.desc_2", "When the shield expires, triggers a fire explosion (4-block radius)");
        REGISTRATE.addRawLang("se.srelic.blazing_heart_shield.desc_3", "And heals for 50% of the damage taken");

        REGISTRATE.addRawLang("se.srelic.lament_of_phantoms", "§5Nihility - Lament of Phantoms");
        REGISTRATE.addRawLang("se.srelic.lament_of_phantoms.desc", "§cWhen HP ≤ 25%:");
        REGISTRATE.addRawLang("se.srelic.lament_of_phantoms.desc_1", "§e• Transfers 50% of damage taken back to the attacker");
        REGISTRATE.addRawLang("se.srelic.lament_of_phantoms.desc_2", "§b• Gains 3 seconds of invulnerability §c(with Weakness II)");
        REGISTRATE.addRawLang("se.srelic.lament_of_phantoms.desc_3", "§d• Converts 30% of damage dealt into healing");
        REGISTRATE.addRawLang("se.srelic.lament_of_phantoms.desc_4", "Cooldown: 30 seconds");

        REGISTRATE.addRawLang("se.srelic.thunderstorm_slash", "\"Electromagnetic Storm\"");
        REGISTRATE.addRawLang("se.srelic.thunderstorm_slash.desc", "Each attack triggers 5 chain lightnings; each chain deals 60% of the previous damage");
        REGISTRATE.addRawLang("se.srelic.thunderstorm_slash.desc_1", "Each attack stacks Conductive layers (max 10); at max stacks, triggers a global lightning shockwave");
        REGISTRATE.addRawLang("se.srelic.thunderstorm_slash.desc_2", "When Conductive stacks are full, activates 10 seconds of Overload state");

// Blazing Overload
        REGISTRATE.addRawLang("se.srelic.sam_overdrive", "Overdrive - Blazing Form");
        REGISTRATE.addRawLang("se.srelic.sam_overdrive.desc", "【Molten Core Overdrive System】");
        REGISTRATE.addRawLang("se.srelic.sam_overdrive.desc_1", "§e• Each attack accumulates 35 Overheat (max 300)");
        REGISTRATE.addRawLang("se.srelic.sam_overdrive.desc_2", "§e• When Overheat ≥ 250, enter 20-second Overdrive Mode:");
        REGISTRATE.addRawLang("se.srelic.sam_overdrive.desc_3", "§b  - Speed III §7| §bDamage Resistance II");
        REGISTRATE.addRawLang("se.srelic.sam_overdrive.desc_4", "【Blazing Assault】");
        REGISTRATE.addRawLang("se.srelic.sam_overdrive.desc_5", "§e• Can trigger a flame dash every 1 second");
        REGISTRATE.addRawLang("se.srelic.sam_overdrive.desc_6", "§e• Dash path deals 12 area damage");
        REGISTRATE.addRawLang("se.srelic.sam_overdrive.desc_7", "【Incinerating Field】");
        REGISTRATE.addRawLang("se.srelic.sam_overdrive.desc_8", "§e• Generates a 5-block burning field during Overdrive");
        REGISTRATE.addRawLang("se.srelic.sam_overdrive.desc_9", "§e• Enemies in the field take 3 fire damage per second");
        REGISTRATE.addRawLang("se.srelic.sam_overdrive.desc_10", "§cCooldown: §730 seconds");
        REGISTRATE.addRawLang("se.srelic.sam_overdrive.desc_11", "§eIf the off-hand also has this blade, allows dual-wielding activation for wide, sweeping attacks");

        REGISTRATE.addRawLang("se.srelic.aquatic_sanctuary", "§bSanctuary - Narzissenkreuz");
        REGISTRATE.addRawLang("se.srelic.aquatic_sanctuary.desc", "§b【Life Resonance】");
        REGISTRATE.addRawLang("se.srelic.aquatic_sanctuary.desc_1", "§e• Restores 3% of max HP every 2 seconds");
        REGISTRATE.addRawLang("se.srelic.aquatic_sanctuary.desc_2", "§e• Healing produces water ring particle effects");
        REGISTRATE.addRawLang("se.srelic.aquatic_sanctuary.desc_3", "§b【Purification Field】");
        REGISTRATE.addRawLang("se.srelic.aquatic_sanctuary.desc_4", "§e• Teammates within 6 blocks gain Resistance boost");
        REGISTRATE.addRawLang("se.srelic.aquatic_sanctuary.desc_5", "§e• Clears Poison and Wither effects");
        REGISTRATE.addRawLang("se.srelic.aquatic_sanctuary.desc_6", "§b【Tidal Guardian】");
        REGISTRATE.addRawLang("se.srelic.aquatic_sanctuary.desc_7", "§e• When HP ≤ 25%, triggers a water wave impact");
        REGISTRATE.addRawLang("se.srelic.aquatic_sanctuary.desc_8", "§e• Gains a shield absorbing 8 points of damage");
        REGISTRATE.addRawLang("se.srelic.aquatic_sanctuary.desc_9", "§cCooldown: §75 seconds");
        REGISTRATE.addRawLang("se.srelic.aquatic_sanctuary.desc_10", "§eIf the off-hand also has this blade, allows dual-wielding activation for careful, precise stance");

        REGISTRATE.addRawLang("se.srelic.chaos_breaker", "§5Seven Thunders - Chain Lightning Stars");
        REGISTRATE.addRawLang("se.srelic.chaos_breaker.desc", "§5【Extreme Speed Combo】");
        REGISTRATE.addRawLang("se.srelic.chaos_breaker.desc_1", "§d• Each attack increases damage by 15% (max 7 stacks)");
        REGISTRATE.addRawLang("se.srelic.chaos_breaker.desc_2", "§d• Not attacking for 2 seconds resets combo count");
        REGISTRATE.addRawLang("se.srelic.chaos_breaker.desc_3", "§5【Lightning Core Charge】");
        REGISTRATE.addRawLang("se.srelic.chaos_breaker.desc_4", "§d• Every 3 hits accumulates 1 charge");
        REGISTRATE.addRawLang("se.srelic.chaos_breaker.desc_5", "§d• At 3 charges, enters Starbreak Mode");
        REGISTRATE.addRawLang("se.srelic.chaos_breaker.desc_6", "§5【Starbreak Burst】");
        REGISTRATE.addRawLang("se.srelic.chaos_breaker.desc_7", "§d• Speed III + Damage Boost II");
        REGISTRATE.addRawLang("se.srelic.chaos_breaker.desc_8", "§d• Attacks deal additional 120-degree fan-shaped lightning damage");
        REGISTRATE.addRawLang("se.srelic.chaos_breaker.desc_9", "§cDuration: §75 seconds");

        REGISTRATE.addRawLang("se.srelic.rianbowshoot", "§5Sevenfold - Night Soul Bullet");
        REGISTRATE.addRawLang("se.srelic.rianbowshoot.desc", "§5【Seven-Element Bullets】");
        REGISTRATE.addRawLang("se.srelic.rianbowshoot.desc_1", "§5Each attack fires elemental bullets, respectively:");
        REGISTRATE.addRawLang("se.srelic.rianbowshoot.desc_2", "§5Fire: Ignition");
        REGISTRATE.addRawLang("se.srelic.rianbowshoot.desc_3", "§5Wind: High multiplier");
        REGISTRATE.addRawLang("se.srelic.rianbowshoot.desc_4", "§5Rock: Weakness");
        REGISTRATE.addRawLang("se.srelic.rianbowshoot.desc_5", "§5Ice: Slowness");
        REGISTRATE.addRawLang("se.srelic.rianbowshoot.desc_6", "§5Water: Instant damage");
        REGISTRATE.addRawLang("se.srelic.rianbowshoot.desc_7", "§5Grass: Poison");
        REGISTRATE.addRawLang("se.srelic.rianbowshoot.desc_8", "§5Thunder: Lightning strike");

        REGISTRATE.addRawLang("se.srelic.kafka_strings", "§5Spiderweb - Strings of Fate");
        REGISTRATE.addRawLang("se.srelic.kafka_strings.desc", "§5【Neurotoxin】");
        REGISTRATE.addRawLang("se.srelic.kafka_strings.desc_1", "§d• Attacks stack toxin layers (max 5 layers)");
        REGISTRATE.addRawLang("se.srelic.kafka_strings.desc_2", "§d• Each layer slows the target and causes continuous damage");
        REGISTRATE.addRawLang("se.srelic.kafka_strings.desc_3", "§5【Thunderstorm Spiderweb】");
        REGISTRATE.addRawLang("se.srelic.kafka_strings.desc_4", "§d• Full toxin layers trigger chain lightning (3 jumps)");
        REGISTRATE.addRawLang("se.srelic.kafka_strings.desc_5", "§d• Each jump's damage decays by 30%");
        REGISTRATE.addRawLang("se.srelic.kafka_strings.desc_6", "§5【Puppet Manipulation】");
        REGISTRATE.addRawLang("se.srelic.kafka_strings.desc_7", "§d• 30% chance to temporarily confuse targets struck by lightning");
        REGISTRATE.addRawLang("se.srelic.kafka_strings.desc_8", "§d• Confused targets cannot attack and glow for 10 seconds");
        REGISTRATE.addRawLang("se.srelic.kafka_strings.desc_9", "§8Cooldown: §720 seconds");

        REGISTRATE.addRawLang("se.srelic.jingyuan_thunder", "Divine Strategy - Heaven's Thunder Splits the Sky");
        REGISTRATE.addRawLang("se.srelic.jingyuan_thunder.desc", "【Divine General's Majesty】");
        REGISTRATE.addRawLang("se.srelic.jingyuan_thunder.desc_1", "§e• Each attack accumulates Divine General layers (max 40 layers)");
        REGISTRATE.addRawLang("se.srelic.jingyuan_thunder.desc_2", "§e• Each layer increases damage by 20%, resets if no attack for 5 seconds");
        REGISTRATE.addRawLang("se.srelic.jingyuan_thunder.desc_3", "【Lightning Strike Field】");
        REGISTRATE.addRawLang("se.srelic.jingyuan_thunder.desc_4", "§e• Continuously electrocutes enemies within 5 blocks");
        REGISTRATE.addRawLang("se.srelic.jingyuan_thunder.desc_5", "§e• Damage based on current layer count");
        REGISTRATE.addRawLang("se.srelic.jingyuan_thunder.desc_6", "【Heaven's Thunder Sky-Splitting Slash】");
        REGISTRATE.addRawLang("se.srelic.jingyuan_thunder.desc_7", "§e• Consumes 10 layers to unleash a fan-shaped area slash");
        REGISTRATE.addRawLang("se.srelic.jingyuan_thunder.desc_8", "§e• Triggers 3 lightning chains on the main target");
        REGISTRATE.addRawLang("se.srelic.jingyuan_thunder.desc_9", "§cCooldown: §710 seconds");

        REGISTRATE.addRawLang("se.srelic.nero_devil_breaker", "§cDemon Sword - Crimson Overture");
        REGISTRATE.addRawLang("se.srelic.nero_devil_breaker.desc", "§c【Red Blade Charge】");
        REGISTRATE.addRawLang("se.srelic.nero_devil_breaker.desc_1", "§4• Each attack accumulates charge (max 3 layers)");
        REGISTRATE.addRawLang("se.srelic.nero_devil_breaker.desc_2", "§4• Each layer increases damage by 50%, resets if no attack for 5 seconds");
        REGISTRATE.addRawLang("se.srelic.nero_devil_breaker.desc_3", "§c【Devil Throw】");
        REGISTRATE.addRawLang("se.srelic.nero_devil_breaker.desc_4", "§4• Melee attacks grab and throw enemies (4-second cooldown)");
        REGISTRATE.addRawLang("se.srelic.nero_devil_breaker.desc_5", "§4• Landing creates a shockwave that deals damage");
        REGISTRATE.addRawLang("se.srelic.nero_devil_breaker.desc_6", "§c【Overload Burst】");
        REGISTRATE.addRawLang("se.srelic.nero_devil_breaker.desc_7", "§4• At full charge, activates 3-second Overload state");
        REGISTRATE.addRawLang("se.srelic.nero_devil_breaker.desc_8", "§4• Attacks during this state deal additional fire damage");
        REGISTRATE.addRawLang("se.srelic.nero_devil_breaker.desc_9", "§8Cooldown: §715 seconds");

        REGISTRATE.addRawLang("se.srelic.herta_cryo_stage", "§bFrost Star - Eternal Frozen Theater");
        REGISTRATE.addRawLang("se.srelic.herta_cryo_stage.desc", "§b【Frost Charge】");
        REGISTRATE.addRawLang("se.srelic.herta_cryo_stage.desc_1", "§3• Each attack accumulates frost layers (max 5 layers)");
        REGISTRATE.addRawLang("se.srelic.herta_cryo_stage.desc_2", "§3• Each layer increases freeze probability and field damage");
        REGISTRATE.addRawLang("se.srelic.herta_cryo_stage.desc_3", "§b【Frost Puppet】");
        REGISTRATE.addRawLang("se.srelic.herta_cryo_stage.desc_4", "§3• Summons an auto-attacking frost puppet every 5 seconds");
        REGISTRATE.addRawLang("se.srelic.herta_cryo_stage.desc_5", "§3• Puppet fires icicles dealing 4 damage");
        REGISTRATE.addRawLang("se.srelic.herta_cryo_stage.desc_6", "§b【Absolute Zero】");
        REGISTRATE.addRawLang("se.srelic.herta_cryo_stage.desc_7", "§3• Continuously deals frost damage within 6 blocks");
        REGISTRATE.addRawLang("se.srelic.herta_cryo_stage.desc_8", "§3• Base 30% chance to freeze enemies");
        REGISTRATE.addRawLang("se.srelic.herta_cryo_stage.desc_9", "§bFreezing applies §cSlowness III§b and §cWeakness I");

        // 在特殊效果区块添加以下内容
        REGISTRATE.addRawLang("se.srelic.welt_se", "§5Imaginary - Spacetime Singularity");
        REGISTRATE.addRawLang("se.srelic.welt_se.desc", "§5【Gravity Manipulation System】");
        REGISTRATE.addRawLang("se.srelic.welt_se.desc_1", "§d• Attacks apply Slowness");
        REGISTRATE.addRawLang("se.srelic.welt_se.desc_2", "§d• Generates reverse portal particle trails");
        REGISTRATE.addRawLang("se.srelic.welt_se.desc_3", "§5【Spacetime Stasis Field】");
        REGISTRATE.addRawLang("se.srelic.welt_se.desc_4", "§d• 30% chance to trigger a Black Hole (15s cooldown)");
        REGISTRATE.addRawLang("se.srelic.welt_se.desc_5", "§d• Enemies in range gain Mining Fatigue V + Glowing");
        REGISTRATE.addRawLang("se.srelic.welt_se.desc_6", "§5【Imaginary Collapse】");
        REGISTRATE.addRawLang("se.srelic.welt_se.desc_7", "§d• Each hit stacks 15% damage increase (max 7 stacks)");
        REGISTRATE.addRawLang("se.srelic.welt_se.desc_8", "§d• At max stacks, triggers levitation explosion + electromagnetic sparks");
        REGISTRATE.addRawLang("se.srelic.welt_se.desc_9", "§8Field Duration: §710 seconds");
        REGISTRATE.addRawLang("se.srelic.welt_se.desc_10", "§8Collapse Cooldown: §715 seconds");

        REGISTRATE.addRawLang("se.srelic.raiden_shogun", "§dEternity - The Raiden Shogun");
        REGISTRATE.addRawLang("se.srelic.raiden_shogun.desc", "§5【Chakra Desiderata】");
        REGISTRATE.addRawLang("se.srelic.raiden_shogun.desc_1", "§5• Attacks accumulate Resolve stacks (max 60 stacks)");
        REGISTRATE.addRawLang("se.srelic.raiden_shogun.desc_2", "§5• Each stack provides 0.5% damage bonus");
        REGISTRATE.addRawLang("se.srelic.raiden_shogun.desc_3", "§d【Eye of Stormy Judgment】");
        REGISTRATE.addRawLang("se.srelic.raiden_shogun.desc_4", "§5• 8-block radius continuous lightning damage field");
        REGISTRATE.addRawLang("se.srelic.raiden_shogun.desc_5", "§5• 30% chance to mark enemies, applying Glowing");
        REGISTRATE.addRawLang("se.srelic.raiden_shogun.desc_6", "§d【Secret Art: Musou Shinsetsu】");
        REGISTRATE.addRawLang("se.srelic.raiden_shogun.desc_7", "§5• Consumes all Resolve to unleash an area slash");
        REGISTRATE.addRawLang("se.srelic.raiden_shogun.desc_8", "§5• Deals base 20 + (Resolve × 0.4) damage");
        REGISTRATE.addRawLang("se.srelic.raiden_shogun.desc_9", "§8Cooldown: §71 minute");
        REGISTRATE.addRawLang("se.srelic.raiden_shogun.desc_10", "§dKilling an enemy results the Secret Art cooldown");

// Special Effects
        REGISTRATE.addRawLang("se.srelic.eternal_flow", "§bEon - Surging Undercurrent");
        REGISTRATE.addRawLang("se.srelic.eternal_flow.desc", "§b【Tidal Charge】");
        REGISTRATE.addRawLang("se.srelic.eternal_flow.desc_1", "§3• Each attack accumulates Tide stacks (max 7 stacks)");
        REGISTRATE.addRawLang("se.srelic.eternal_flow.desc_2", "§3• Each stack increases group healing by 3%");
        REGISTRATE.addRawLang("se.srelic.eternal_flow.desc_3", "§b【Water Blossom Shield】");
        REGISTRATE.addRawLang("se.srelic.eternal_flow.desc_4", "§3• When HP falls below 30%, consumes 3 stacks to generate a shield");
        REGISTRATE.addRawLang("se.srelic.eternal_flow.desc_5", "§3• Absorbs 70% damage, lasting 5 seconds");
        REGISTRATE.addRawLang("se.srelic.eternal_flow.desc_6", "§b【Torrent Burst】");
        REGISTRATE.addRawLang("se.srelic.eternal_flow.desc_7", "§3• Consumes 7 stacks to release a conical water impact");
        REGISTRATE.addRawLang("se.srelic.eternal_flow.desc_8", "§3• Deals base 12 + stack-enhanced damage");

        REGISTRATE.addRawLang("se.srelic.avenger_jeanne", "§4Avenger - Jeanne");
        REGISTRATE.addRawLang("se.srelic.avenger_jeanne.desc", "§4【Avenging Flames】");
        REGISTRATE.addRawLang("se.srelic.avenger_jeanne.desc_1", "§c• When hit, 35% chance to counterattack, applying Black Flame for 8 seconds");
        REGISTRATE.addRawLang("se.srelic.avenger_jeanne.desc_2", "§c• Attacks apply Slowness for 15 seconds");
        REGISTRATE.addRawLang("se.srelic.avenger_jeanne.desc_3", "§4【Grudge Collection】");
        REGISTRATE.addRawLang("se.srelic.avenger_jeanne.desc_4", "§c• Each time hit accumulates Vengeance stacks (max 7 stacks)");
        REGISTRATE.addRawLang("se.srelic.avenger_jeanne.desc_5", "§c• Each stack increases Black Flame damage by 10%");
        REGISTRATE.addRawLang("se.srelic.avenger_jeanne.desc_6", "§4【Noble Phantasm Release】");
        REGISTRATE.addRawLang("se.srelic.avenger_jeanne.desc_7", "§c• Consumes 7 stacks to unleash a 12-block radius AOE True Damage");
        REGISTRATE.addRawLang("se.srelic.avenger_jeanne.desc_8", "§c• Gains 200% damage bonus and Resistance boost");
        REGISTRATE.addRawLang("se.srelic.avenger_jeanne.desc_9", "§8Cooldown: §730 seconds");

        REGISTRATE.addRawLang("se.srelic.blood_sakura", "§cSoulthought - Blood Cherry Annihilation");
        REGISTRATE.addRawLang("se.srelic.blood_sakura.desc", "§4【Blood Cherry Sigil】");
        REGISTRATE.addRawLang("se.srelic.blood_sakura.desc_1", "§c• Attacks have a 40% chance to apply a Blood Cherry Mark (max 5 stacks per target)");
        REGISTRATE.addRawLang("se.srelic.blood_sakura.desc_2", "§c• Each stack increases damage against that target by 30%");
        REGISTRATE.addRawLang("se.srelic.blood_sakura.desc_3", "§4【Life Steal】");
        REGISTRATE.addRawLang("se.srelic.blood_sakura.desc_4", "§c• Attacks absorb 25% of the target's max HP");
        REGISTRATE.addRawLang("se.srelic.blood_sakura.desc_5", "§4【Demon Blade Release】");
        REGISTRATE.addRawLang("se.srelic.blood_sakura.desc_6", "§c• Consumes 3 stacks to unleash an 8-block radius slash (180% damage)");
        REGISTRATE.addRawLang("se.srelic.blood_sakura.desc_7", "§c• Gains Haste III effect for 10 seconds");
        REGISTRATE.addRawLang("se.srelic.blood_sakura.desc_8", "§8Cooldown: §720 seconds");
        REGISTRATE.addRawLang("se.srelic.crimson_moon", "§4Crimson Moon - Nightfall Pilgrimage");
        REGISTRATE.addRawLang("se.srelic.crimson_moon.desc", "§5【Blood Moon Sigil】");
        REGISTRATE.addRawLang("se.srelic.crimson_moon.desc_1", "§d• Critical hits coalesce 'Blood Echoes', increasing Crit Damage by 15% (max 8 stacks)");
        REGISTRATE.addRawLang("se.srelic.crimson_moon.desc_2", "§5【Nightfall Form】");
        REGISTRATE.addRawLang("se.srelic.crimson_moon.desc_3", "§d• When HP falls below 30%, transform into a shadow, gaining invisibility and increased damage");
        REGISTRATE.addRawLang("se.srelic.crimson_moon.desc_4", "§5【Scarlet Feast】");
        REGISTRATE.addRawLang("se.srelic.crimson_moon.desc_5", "§d• Shadow state attacks apply Blood Moon Slash");
        REGISTRATE.addRawLang("se.srelic.crimson_moon.desc_6", "§d• Life steal effectiveness increased by 150% and applies area True Damage");

        REGISTRATE.addRawLang("se.srelic.inferno_blaze", "Infernal Blaze - Heaven's Ember");
        REGISTRATE.addRawLang("se.srelic.inferno_blaze.desc", "§c【Molten Core】");
        REGISTRATE.addRawLang("se.srelic.inferno_blaze.desc_1", "• Each attack accumulates Heat, each stack increases Fire damage by 20%");
        REGISTRATE.addRawLang("se.srelic.inferno_blaze.desc_2", "§c【Crimson Path】");
        REGISTRATE.addRawLang("se.srelic.inferno_blaze.desc_3", "• Moving leaves a burning trail, continuously igniting enemies");
        REGISTRATE.addRawLang("se.srelic.inferno_blaze.desc_4", "§c【Heaven's Ember Eruption】");
        REGISTRATE.addRawLang("se.srelic.inferno_blaze.desc_5", "• At 8 stacks, releases a Molten Core Impact, resetting Heat count");
        REGISTRATE.addRawLang("se.srelic.inferno_blaze.desc_6", "• Generates a radius 5-block Flame Storm lasting 15 seconds");

        REGISTRATE.addRawLang("se.srelic.wolf_soul", "§4Northern Wolf Soul - Roar");
        REGISTRATE.addRawLang("se.srelic.wolf_soul.desc", "§4【Winter's Will】");
        REGISTRATE.addRawLang("se.srelic.wolf_soul.desc_1", "§c• When HP ≤ 40%: Damage +30%, attacks accumulate 'Wolf Soul'");
        REGISTRATE.addRawLang("se.srelic.wolf_soul.desc_2", "§c• When HP ≤ 25%: Damage +60%, 40% Life Steal");
        REGISTRATE.addRawLang("se.srelic.wolf_soul.desc_3", "§4【Permafrost Combo】");
        REGISTRATE.addRawLang("se.srelic.wolf_soul.desc_4", "§c• Increases damage");
        REGISTRATE.addRawLang("se.srelic.wolf_soul.desc_5", "§c• Attacks grant team within 10 blocks §bStrength III§c/§bSpeed II");
        REGISTRATE.addRawLang("se.srelic.wolf_soul.desc_6", "§4【Final Howl】");
        REGISTRATE.addRawLang("se.srelic.wolf_soul.desc_7", "§c• Attacks have a chance to release a Frost Shockwave: applies §4Weakness III§c/§5Glowing");
        REGISTRATE.addRawLang("se.srelic.wolf_soul.desc_8", "§8Cooldown: §725 seconds");

        REGISTRATE.addRawLang("se.srelic.dice_effect", "§dDice of Fate");
        REGISTRATE.addRawLang("se.srelic.dice_effect.desc", "$(5)【Random Rule】 $(br)• 20% chance to deal 50% damage $(br)• 40% chance for normal damage $(br)• 39% chance to heal the target for 600% of damage dealt$(br)• 1% chance to deal 1000% critical damage");
        REGISTRATE.addRawLang("se.srelic.dice_effect.text", "A die with infinite faces, it embodies luck. The abyssal plane judges fate, heaven's calamity mocks, countless outcomes collapse within a single throw. $(br)Infinite possibilities burn into one the moment the die falls. $(br)Fortune or misfortune? Heaven or hell? When you hear the die giggling softly in the void$(br2)—remember, you are not rolling the die; the die is rolling you. $(br2)$(br2)Let the gambling round begin! Wield the dice and clash$(br2)—$(o)Next strike, divine punishment or divine gift? $(l)After all, a gambler's true love isn't winning, but that heartbeat-stopping moment before the die reveals.");

        REGISTRATE.addRawLang("se.srelic.truth_realm", "Finality Law - Star's Return");
        REGISTRATE.addRawLang("se.srelic.truth_realm.desc", "§e【Spacetime Singularity】");
        REGISTRATE.addRawLang("se.srelic.truth_realm.desc_1", "§b• Attacks accumulate 'Chrono-Entropy' stacks (max 36 stacks)");
        REGISTRATE.addRawLang("se.srelic.truth_realm.desc_2", "§b• Each stack increases Attack Speed by 5% and Attack Power by 3%");
        REGISTRATE.addRawLang("se.srelic.truth_realm.desc_3", "§e【Reverse Time Corridor】");
        REGISTRATE.addRawLang("se.srelic.truth_realm.desc_4", "§b• When hit, consumes all stacks:");
        REGISTRATE.addRawLang("se.srelic.truth_realm.desc_5", "§d  - Each stack restores 2% HP and resets negative status effects");
        REGISTRATE.addRawLang("se.srelic.truth_realm.desc_6", "§d  - Generates a Chrono-Shield (absorption = stacks × 15%)");
        REGISTRATE.addRawLang("se.srelic.truth_realm.desc_7", "§e【Finality Reconstruction】");
        REGISTRATE.addRawLang("se.srelic.truth_realm.desc_8", "§b• When the shield breaks, triggers Spacetime Stasis:");
        REGISTRATE.addRawLang("se.srelic.truth_realm.desc_9", "§d  - Freezes actions of enemies within 8 blocks for 3 seconds");
        REGISTRATE.addRawLang("se.srelic.truth_realm.desc_10", "§d  - Fires 12 Spacetime Rift Slashes");
        REGISTRATE.addRawLang("se.srelic.truth_realm.desc_11", "§8Cooldown: §72 minutes");

        REGISTRATE.addRawLang("se.srelic.perfect_sanctuary", "§bTrue Self - Flawless Sanctuary");
        REGISTRATE.addRawLang("se.srelic.perfect_sanctuary.desc", "【Flawless Dome】");
        REGISTRATE.addRawLang("se.srelic.perfect_sanctuary.desc_1", "§bAutomatically generates a shield when HP falls below 50% (absorption = lost HP × 200%)");
        REGISTRATE.addRawLang("se.srelic.perfect_sanctuary.desc_2", "【Wither Field】");
        REGISTRATE.addRawLang("se.srelic.perfect_sanctuary.desc_3", "§bWhile shielded, applies Wither III per second (8-block radius)");
        REGISTRATE.addRawLang("se.srelic.perfect_sanctuary.desc_4", "【Crystal Burst】");
        REGISTRATE.addRawLang("se.srelic.perfect_sanctuary.desc_5", "§bWhen the shield ends, deals area damage equal to 80% of the remaining shield value");
        REGISTRATE.addRawLang("se.srelic.perfect_sanctuary.desc_6", "§bAnd restores 10% max HP for allies");
        REGISTRATE.addRawLang("se.srelic.perfect_sanctuary.desc_7", "§8Cooldown: §730 seconds");

        REGISTRATE.addRawLang("se.srelic.frost_forging", "§bFrozen Edge Qi Focus");
        REGISTRATE.addRawLang("se.srelic.frost_forging.desc", "§b【Frozen Edge Stacking】");
        REGISTRATE.addRawLang("se.srelic.frost_forging.desc_1", "§7While not attacking, stacks 1 layer per second (max 10 layers)");
        REGISTRATE.addRawLang("se.srelic.frost_forging.desc_2", "§b【Frost Blade Burst】");
        REGISTRATE.addRawLang("se.srelic.frost_forging.desc_3", "§7Attacks consume layers, each layer adds 1.5% of target's current HP as damage");
        REGISTRATE.addRawLang("se.srelic.frost_forging.desc_4", "§b【Winter's Sanctuary】");
        REGISTRATE.addRawLang("se.srelic.frost_forging.desc_5", "§7Each layer provides 1% damage reduction and movement speed increase");
        REGISTRATE.addRawLang("se.srelic.frost_forging.desc_6", "§b【Frost Crack Spread】");
        REGISTRATE.addRawLang("se.srelic.frost_forging.desc_7", "§7Consuming ≥5 layers applies Slowness, spreading the effect stacks Frozen Edge");
        REGISTRATE.addRawLang("se.srelic.ghost_thunder", "§dHundred Ghosts Devour Souls - Thunder Calamity");
        REGISTRATE.addRawLang("se.srelic.ghost_thunder.desc", "§5【Soul Devouring Mark】");
        REGISTRATE.addRawLang("se.srelic.ghost_thunder.desc_1", "§dKilling an enemy has a 50% chance to trigger area lightning damage and stack a mark");
        REGISTRATE.addRawLang("se.srelic.ghost_thunder.desc_2", "§5【Night Parade of One Hundred Demons】");
        REGISTRATE.addRawLang("se.srelic.ghost_thunder.desc_3", "§dAt 5 stacks, deals 400% lightning damage and generates a Thunder Wraith Field");
        REGISTRATE.addRawLang("se.srelic.ghost_thunder.desc_4", "§5【Thunder Wraith Field】");
        REGISTRATE.addRawLang("se.srelic.ghost_thunder.desc_5", "§dContinuous damage within the field and gain damage reduction");

        REGISTRATE.addRawLang("se.srelic.star_thunder", "§eStellar Thunder Strike - Divine Punishment");
        REGISTRATE.addRawLang("se.srelic.star_thunder.desc", "【Stellar Thunder Mark】");
        REGISTRATE.addRawLang("se.srelic.star_thunder.desc_1", "§eNormal attacks have a 25% chance to apply a mark (max 3 stacks)");
        REGISTRATE.addRawLang("se.srelic.star_thunder.desc_2", "【Stellar Thunder Strike】");
        REGISTRATE.addRawLang("se.srelic.star_thunder.desc_3", "§eHold right-click to charge and trigger an area thunderstorm");
        REGISTRATE.addRawLang("se.srelic.star_thunder.desc_4", "【Thunder Enhancement】");
        REGISTRATE.addRawLang("se.srelic.star_thunder.desc_5", "§eEach stack increases damage by 120%, 2 stacks add magical damage");
        REGISTRATE.addRawLang("se.srelic.star_thunder.desc_6", "【Divine Punishment Field】");
        REGISTRATE.addRawLang("se.srelic.star_thunder.desc_7", "§eAt 3 stacks, additionally applies area defense reduction effect");
        REGISTRATE.addRawLang("se.srelic.star_thunder.desc_8", "§8Combo Mechanism: Consecutive triggers increase damage multiplier");

        REGISTRATE.addRawLang("se.srelic.flame_erosion", "Flame Scale Erosion - Incineration");
        REGISTRATE.addRawLang("se.srelic.flame_erosion.desc", "§4【Eroding Flame Scales】");
        REGISTRATE.addRawLang("se.srelic.flame_erosion.desc_1", "Fire damage has a 20% chance to stack burning layers");
        REGISTRATE.addRawLang("se.srelic.flame_erosion.desc_2", "§4【Scale Explosion】");
        REGISTRATE.addRawLang("se.srelic.flame_erosion.desc_3", "At 3 stacks, triggers area explosion and vulnerability effect");
        REGISTRATE.addRawLang("se.srelic.flame_erosion.desc_4", "§4【Incineration】");
        REGISTRATE.addRawLang("se.srelic.flame_erosion.desc_5", "True damage based on target's missing health");
        REGISTRATE.addRawLang("se.srelic.flame_erosion.desc_6", "§4【Chain Reaction】");
        REGISTRATE.addRawLang("se.srelic.flame_erosion.desc_7", "Kills trigger chain explosion (damage decay)");

        REGISTRATE.addRawLang("se.srelic.crimson_annihilation", "§4Red Camellia Erosion - Annihilation");
        REGISTRATE.addRawLang("se.srelic.crimson_annihilation.desc", "§c【Annihilation Scars】");
        REGISTRATE.addRawLang("se.srelic.crimson_annihilation.desc_1", "§4Normal attacks have a 25% chance to stack magical vulnerability layers");
        REGISTRATE.addRawLang("se.srelic.crimson_annihilation.desc_2", "§c【Annihilation Burst】");
        REGISTRATE.addRawLang("se.srelic.crimson_annihilation.desc_3", "§4At 3 stacks, deals 300% magical damage + 15% of missing health");
        REGISTRATE.addRawLang("se.srelic.crimson_annihilation.desc_4", "§c【Ember Spread】");
        REGISTRATE.addRawLang("se.srelic.crimson_annihilation.desc_5", "§4After explosion, converts 50% of damage into healing");
        REGISTRATE.addRawLang("se.srelic.crimson_annihilation.desc_6", "§c【Final Red Camellia】");
        REGISTRATE.addRawLang("se.srelic.crimson_annihilation.desc_7", "§4Consecutive triggers increase explosion range");

        REGISTRATE.addRawLang("se.srelic.sakura_bloom", "§dSakura Bloom - Fleeting Glory");
        REGISTRATE.addRawLang("se.srelic.sakura_bloom.desc", "§5Each attack accumulates Sakura layers (max 7 layers)");
        REGISTRATE.addRawLang("se.srelic.sakura_bloom.desc_1", "§5Each layer provides 1.5 extra damage");
        REGISTRATE.addRawLang("se.srelic.sakura_bloom.desc_2", "§5At max layers, releases Sakura Storm: deals area damage and heals");
        REGISTRATE.addRawLang("se.srelic.sakura_bloom.desc_3", "§5Continuous Healing: Restores health every 2 seconds, effect stronger with more layers");

// Special Effects
        REGISTRATE.addRawLang("se.srelic.storm_fury", "§aGale - Fury of the Storm");
        REGISTRATE.addRawLang("se.srelic.storm_fury.desc", "§a【Wind Energy Charge】");
        REGISTRATE.addRawLang("se.srelic.storm_fury.desc_1", "§e• Attacks have a 35% chance to accumulate Wind Energy (max 5 layers)");
        REGISTRATE.addRawLang("se.srelic.storm_fury.desc_2", "§a【Hurricane Field】");
        REGISTRATE.addRawLang("se.srelic.storm_fury.desc_3", "§e• Continuous wind pressure damage and knockback within 5 blocks");
        REGISTRATE.addRawLang("se.srelic.storm_fury.desc_4", "§e• Allies gain Speed boost");
        REGISTRATE.addRawLang("se.srelic.storm_fury.desc_5", "§a【Tornado Descent】");
        REGISTRATE.addRawLang("se.srelic.storm_fury.desc_6", "§e• Consume 3 layers to summon a tornado that pulls enemies");
        REGISTRATE.addRawLang("se.srelic.storm_fury.desc_7", "§e• Movement speed increases attack speed");

// Special Effects
        REGISTRATE.addRawLang("se.srelic.ming_mang", "§5Nether - Nether Radiance Devours Souls");
        REGISTRATE.addRawLang("se.srelic.ming_mang.desc", "§5【Soulfire Sacrifice】");
        REGISTRATE.addRawLang("se.srelic.ming_mang.desc_1", "§dEach attack consumes 5% of current health to gain Nether Radiance (max 10 layers)");
        REGISTRATE.addRawLang("se.srelic.ming_mang.desc_2", "§5【Netherworld's Boon】");
        REGISTRATE.addRawLang("se.srelic.ming_mang.desc_3", "§dEach layer provides 3% attack speed and 1% damage increase");
        REGISTRATE.addRawLang("se.srelic.ming_mang.desc_4", "§5【Yellow Spring Reversal】");
        REGISTRATE.addRawLang("se.srelic.ming_mang.desc_5", "§dWhen health falls below 30%, consume Nether Radiance to heal (3% max health per layer)");
        REGISTRATE.addRawLang("se.srelic.ming_mang.desc_6", "§5【Nine Nether Burst】");
        REGISTRATE.addRawLang("se.srelic.ming_mang.desc_7", "§dAt max layers, deals Nether damage equal to (Attack + Health) x 5");
        // Special Effects
        REGISTRATE.addRawLang("se.srelic.butterfly_falling", "§5Butterfly Falls to the Netherworld - It is Death");
        REGISTRATE.addRawLang("se.srelic.butterfly_falling.desc", "§5【Soulfire Sacrifice】");
        REGISTRATE.addRawLang("se.srelic.butterfly_falling.desc_1", "§dEach attack consumes 50% of current health to gain Nether Radiance (max 10 layers)");
        REGISTRATE.addRawLang("se.srelic.butterfly_falling.desc_2", "§5【Netherworld's Boon】");
        REGISTRATE.addRawLang("se.srelic.butterfly_falling.desc_3", "§dEach layer provides 40% damage bonus");
        REGISTRATE.addRawLang("se.srelic.butterfly_falling.desc_4", "§5【Yellow Spring Reversal】");
        REGISTRATE.addRawLang("se.srelic.butterfly_falling.desc_5", "§dWhen health falls below 30%, consume Nether Radiance to heal (4% max health per layer)");
        REGISTRATE.addRawLang("se.srelic.butterfly_falling.desc_6", "§5【Nine Nether Burst】");
        REGISTRATE.addRawLang("se.srelic.butterfly_falling.desc_7", "§dAt max layers, deals Nether damage equal to ((Attack + Health) x 5) / 2");

        REGISTRATE.addRawLang("se.srelic.blood_plum_memory", "§5Blood Plum Memory - Plum of the Afterlife");
        REGISTRATE.addRawLang("se.srelic.blood_plum_memory.desc", "§5【Blood Plum Fragrance】");
        REGISTRATE.addRawLang("se.srelic.blood_plum_memory.desc_1", "§dAllows stacking of Blood Plum, max 30 layers, each layer provides 10% damage increase.");
        REGISTRATE.addRawLang("se.srelic.blood_plum_memory.desc_2", "§5【Blood Coffin】");
        REGISTRATE.addRawLang("se.srelic.blood_plum_memory.desc_3", "§Deals 300% extra damage to undead creatures.");
        REGISTRATE.addRawLang("se.srelic.blood_plum_memory.desc_4", "§5【Blood Memory】");
        REGISTRATE.addRawLang("se.srelic.blood_plum_memory.desc_5", "§dFor every 10% health lost, gain 40% damage increase, up to 280%.");

// Blazing Valor
        REGISTRATE.addRawLang("se.srelic.blazing_valor", "§cBlazing Valor");
        REGISTRATE.addRawLang("se.srelic.blazing_valor.desc", "§4【Valiant Flame】");
        REGISTRATE.addRawLang("se.srelic.blazing_valor.desc_1", "§c• Attack damage +45% §7| §cGains Fire Resistance");
        REGISTRATE.addRawLang("se.srelic.blazing_valor.desc_2", "§4【Fierce Flame】");
        REGISTRATE.addRawLang("se.srelic.blazing_valor.desc_3", "§cWhen attacking burning targets, §4ignores defense§c (Armor/Toughness)");
        REGISTRATE.addRawLang("se.srelic.blazing_valor.desc_4", "§4【Crimson Lotus War Song】");
        REGISTRATE.addRawLang("se.srelic.blazing_valor.desc_5", "§cBurning enemies dying within 10 blocks stack §4Crimson Lotus Marks§c (+10% damage per layer)");
        REGISTRATE.addRawLang("se.srelic.blazing_valor.desc_6", "§8Max Layers: §715 §7| §8Duration: §730 seconds");

// Special Effects
        REGISTRATE.addRawLang("se.srelic.pure_elegy", "Hymn of Beauty");
        REGISTRATE.addRawLang("se.srelic.pure_elegy.desc", "【Ascension】");
        REGISTRATE.addRawLang("se.srelic.pure_elegy.desc_1", "Each attack stacks Ascension (max 300 layers)");
        REGISTRATE.addRawLang("se.srelic.pure_elegy.desc_2", "【Knight's Protection】");
        REGISTRATE.addRawLang("se.srelic.pure_elegy.desc_3", "Every 75 layers gain Resistance boost");
        REGISTRATE.addRawLang("se.srelic.pure_elegy.desc_4", "【Praise】");
        REGISTRATE.addRawLang("se.srelic.pure_elegy.desc_5", "At 100 layers, sneak + right-click to dash");

// Special Effects
        REGISTRATE.addRawLang("se.srelic.water_symphony", "§bAqua Symphony");
        REGISTRATE.addRawLang("se.srelic.water_symphony.desc", "§b【Waters' Overlapping Chapters】");
        REGISTRATE.addRawLang("se.srelic.water_symphony.desc_1", "§3Layers I-III: Attacks apply §9Slowness I§3, lasting 5 seconds");
        REGISTRATE.addRawLang("se.srelic.water_symphony.desc_2", "§b【Opera Overlapping Chapters】");
        REGISTRATE.addRawLang("se.srelic.water_symphony.desc_3", "§3Layers IV-V: Each layer provides §c15%§3 damage bonus");
        REGISTRATE.addRawLang("se.srelic.water_symphony.desc_4", "§d【Finale Solo】");
        REGISTRATE.addRawLang("se.srelic.water_symphony.desc_5", "§5At max layers, gain §c40%§5 extra bonus");
        REGISTRATE.addRawLang("se.srelic.water_symphony.desc_6", "§8※Also effective when held in off-hand");

// Special Effects
        REGISTRATE.addRawLang("se.srelic.quantum_dance", "§5Quantum Scythe Dance");
        REGISTRATE.addRawLang("se.srelic.quantum_dance.desc", "§5【Reappearance - Quantum Butterfly】");
        REGISTRATE.addRawLang("se.srelic.quantum_dance.desc_1", "§dKills stack Quantum Butterfly layers§7(+40% damage per layer, max 10 layers)");
        REGISTRATE.addRawLang("se.srelic.quantum_dance.desc_2", "§5【Amplification - Quantum Edge】");
        REGISTRATE.addRawLang("se.srelic.quantum_dance.desc_3", "§dAttacks stack Quantum Edge layers§7(+50% damage per layer, max 3 layers)");
        REGISTRATE.addRawLang("se.srelic.quantum_dance.desc_4", "§5【Butterfly Resonance】");
        REGISTRATE.addRawLang("se.srelic.quantum_dance.desc_5", "§dWhen both buffs coexist, gain §bSpeed IV + Night Vision + Strength II + Glowing + Haste II");
        REGISTRATE.addRawLang("se.srelic.quantum_dance.desc_6", "§8※Effects automatically refresh during duration");

// Special Effects
        REGISTRATE.addRawLang("se.srelic.void_scissors", "§5Void Purple Scissors");
        REGISTRATE.addRawLang("se.srelic.void_scissors.desc", "§d【Cube Field】");
        REGISTRATE.addRawLang("se.srelic.void_scissors.desc_1", "§5Each layer provides §c40%§5 damage increase. At 10 layers, each layer additionally +§c10%§5 (max 500%)");
        REGISTRATE.addRawLang("se.srelic.void_scissors.desc_2", "§d【Crème Brûlée】");
        REGISTRATE.addRawLang("se.srelic.void_scissors.desc_3", "§5Continuously emits alternating gold/purple particle effects");
        REGISTRATE.addRawLang("se.srelic.void_scissors.desc_4", "§d【Blessing Flame】");
        REGISTRATE.addRawLang("se.srelic.void_scissors.desc_5", "§5Deals §c150%§5 extra damage to burning targets, 5% chance to stack Field");

// Special Effects
        REGISTRATE.addRawLang("se.srelic.nightmare_abyss", "§5Nightmare Abyss - Night of Dream Scroll");
        REGISTRATE.addRawLang("se.srelic.nightmare_abyss.desc", "§d【Scarlet Abyssal Chains】");
        REGISTRATE.addRawLang("se.srelic.nightmare_abyss.desc_1", "§5Attacks have 15% chance to gain §cScarlet Scar§5 (max 10 layers)");
        REGISTRATE.addRawLang("se.srelic.nightmare_abyss.desc_2", "§5When §cScarlet Scar ≥ 8 layers§5, lose §41%§5 max health per second");
        REGISTRATE.addRawLang("se.srelic.nightmare_abyss.desc_3", "§d【Blade of Sin and Punishment】");
        REGISTRATE.addRawLang("se.srelic.nightmare_abyss.desc_4", "§5Attacks trigger §e(7% + Scarlet Scar layers × 1%)§5 chance to summon Ice Thorns");
        REGISTRATE.addRawLang("se.srelic.nightmare_abyss.desc_5", "§5Thorn Field lasts §78 seconds§5, dealing §c30%§5 weapon base value as frost damage per second");
        REGISTRATE.addRawLang("se.srelic.nightmare_abyss.desc_6", "§5Applies §eSlowness XI§5 (90% movement speed reduction) to enemies in field");
        REGISTRATE.addRawLang("se.srelic.nightmare_abyss.desc_7", "§5After killing a target, Thorn Field will §dspread§5 to a 3-block radius");
        REGISTRATE.addRawLang("se.srelic.nightmare_abyss.desc_8", "§5Spread field duration decreases by §c30%§5, can chain spread §e3 times");
        REGISTRATE.addRawLang("se.srelic.nightmare_abyss.desc_9", "§d【Withered White Flower】");
        REGISTRATE.addRawLang("se.srelic.nightmare_abyss.desc_10", "§5When health ≤ §440%§5, gain §c20%§5 damage bonus");
        REGISTRATE.addRawLang("se.srelic.nightmare_abyss.desc_11", "§5When §eScales Collapse§5 is active, additionally gain §c25%§5 damage bonus");
        REGISTRATE.addRawLang("se.srelic.nightmare_abyss.desc_12", "§5Attacking §bfrozen targets§5 increases damage by §c30%");
        REGISTRATE.addRawLang("se.srelic.nightmare_abyss.desc_13", "§5§eScales Collapse§5 state increases freeze bonus to §c45%");
        REGISTRATE.addRawLang("se.srelic.nightmare_abyss.desc_14", "§d【Final Nightmare】");
        REGISTRATE.addRawLang("se.srelic.nightmare_abyss.desc_15", "§5Each attack stacks §8Nightmare layers§5 (max 6 layers)");
        REGISTRATE.addRawLang("se.srelic.nightmare_abyss.desc_16", "§5Each layer provides §c15%§5 damage bonus, lasting §718 seconds");
        REGISTRATE.addRawLang("se.srelic.nightmare_abyss.desc_17", "§5When §8Nightmare§5 stacks reach §46 layers§5:");
        REGISTRATE.addRawLang("se.srelic.nightmare_abyss.desc_18", "§d• Consume all layers to release §cIce Abyss Burst§d");
        REGISTRATE.addRawLang("se.srelic.nightmare_abyss.desc_19", "§d• Deals §c(200% base value + 200% missing health)§5 frost damage");
        REGISTRATE.addRawLang("se.srelic.nightmare_abyss.desc_20", "§d• Applies §bAbsolute Freeze§5 (movement prevented for 3 seconds) to enemies within §74 blocks§5");
        REGISTRATE.addRawLang("se.srelic.nightmare_abyss.desc_21", "§8※All effects can be active simultaneously. Trigger priority: Scarlet Scar → Sin/Punishment → White Flower → Nightmare");
        REGISTRATE.addRawLang("se.srelic.nightmare_abyss.desc_22", "§8※If it crashes, not responsible");

// Special Effects
        REGISTRATE.addRawLang("se.srelic.mugen_ice", "§bNo-Self - Ultimate Ice Computation");
        REGISTRATE.addRawLang("se.srelic.mugen_ice.desc", "§b【Realm of No-Self】");
        REGISTRATE.addRawLang("se.srelic.mugen_ice.desc_1", "§3Gain Resistance III, continuously accumulate Variation value");
        REGISTRATE.addRawLang("se.srelic.mugen_ice.desc_2", "§b【Time Lag Computation】");
        REGISTRATE.addRawLang("se.srelic.mugen_ice.desc_3", "§3Applies Slowness 255 within 5 blocks, lasting 120 seconds");
        REGISTRATE.addRawLang("se.srelic.mugen_ice.desc_4", "§b【Ice-Cover Amplification】");
        REGISTRATE.addRawLang("se.srelic.mugen_ice.desc_5", "§3Base damage +120%, extra +20% when off-hand holds a Slash Blade");
        REGISTRATE.addRawLang("se.srelic.mugen_ice.desc_6", "§b【Ultimate Ice Pierce】");
        REGISTRATE.addRawLang("se.srelic.mugen_ice.desc_7", "§3When Ice layers ≥ 20, continuously deals 50% base value damage within 15 blocks");
        REGISTRATE.addRawLang("se.srelic.mugen_ice.desc_8", "§b◇Variation System◇");
        REGISTRATE.addRawLang("se.srelic.mugen_ice.desc_9", "§dKills consume 100 Soul Essence to stack. At 50 layers, Storm Howl damage +100%");
        REGISTRATE.addRawLang("se.srelic.mugen_ice.desc_10", "§dAt 25 layers, Storm Howl damage +50%");
        REGISTRATE.addRawLang("se.srelic.mugen_ice.desc_11", "§b◆Ice Mechanism◆");
        REGISTRATE.addRawLang("se.srelic.mugen_ice.desc_12", "§5Every 5 kills consumes 150 Soul Essence to stack. 10 layers activate Ice-Cover");
        REGISTRATE.addRawLang("se.srelic.mugen_ice.desc_13", "§520 layers activate Ice Thorn Field");
        REGISTRATE.addRawLang("se.srelic.mugen_ice.desc_14", "§8※Cannot stack layers when Soul Essence is insufficient");

// Pledge Matrix
        REGISTRATE.addRawLang("se.srelic.pledge_matrix", "Pledge Matrix");
        REGISTRATE.addRawLang("se.srelic.pledge_matrix.desc", "§e【Radiant Node】");
        REGISTRATE.addRawLang("se.srelic.pledge_matrix.desc_1", "25% attack chance generates a continuous pulse node");
        REGISTRATE.addRawLang("se.srelic.pledge_matrix.desc_2", "§e【Glory Field】");
        REGISTRATE.addRawLang("se.srelic.pledge_matrix.desc_3", "When forming a triangular area:");
        REGISTRATE.addRawLang("se.srelic.pledge_matrix.desc_4", "§b- Allies damage +40% §7| §c- Enemies take burning damage per second");
        REGISTRATE.addRawLang("se.srelic.pledge_matrix.desc_5", "§e【Pulse Network】");
        REGISTRATE.addRawLang("se.srelic.pledge_matrix.desc_6", "Nodes automatically connect to form energy beams");
        REGISTRATE.addRawLang("se.srelic.pledge_matrix.desc_7", "§c【Crimson Flame Resonance】");
        REGISTRATE.addRawLang("se.srelic.pledge_matrix.desc_8", "§eWhen allies attack burning targets:");
        REGISTRATE.addRawLang("se.srelic.pledge_matrix.desc_9", "§b- Each layer +2% damage §7(§dmax 50 layers§7)");
        REGISTRATE.addRawLang("se.srelic.pledge_matrix.desc_10", "§c【Cooperative Combat】");
        REGISTRATE.addRawLang("se.srelic.pledge_matrix.desc_11", "§eResonance efficiency increased by 30% within the field");

        REGISTRATE.addRawLang("se.srelic.white_rose", "§dWhite Night Rose");
        REGISTRATE.addRawLang("se.srelic.white_rose.desc", "§5【Rose Bloom】");
        REGISTRATE.addRawLang("se.srelic.white_rose.desc_1", "§dSA hit +1 layer §7| §5Allies' attacks on burning +2 layers (2s CD)");
        REGISTRATE.addRawLang("se.srelic.white_rose.desc_2", "§5Layers I-V: §cPink Phantom Blade§7(90% damage) and extra 30% damage increase");
        REGISTRATE.addRawLang("se.srelic.white_rose.desc_3", "§5Layers VI-X: §b\"Heartfire\"§7 35% damage reduction");
        REGISTRATE.addRawLang("se.srelic.white_rose.desc_4", "§5Layers XI-XV: §cEach layer +10% damage");
        REGISTRATE.addRawLang("se.srelic.white_rose.desc_5", "§d【Eternal Flame Field】");
        REGISTRATE.addRawLang("se.srelic.white_rose.desc_6", "§5Attacks on burning enemies heal 35% of damage dealt");
        REGISTRATE.addRawLang("se.srelic.white_rose.desc_7", "§5Each ally within field provides:");
        REGISTRATE.addRawLang("se.srelic.white_rose.desc_8", "§c- Fire damage +10% §7| §b- Against undead +5%");
        REGISTRATE.addRawLang("se.srelic.white_rose.desc_9", "§d【Burning Chain】");
        REGISTRATE.addRawLang("se.srelic.white_rose.desc_10", "§5Allies' attacks on burning enemies add 80% fire damage");
        REGISTRATE.addRawLang("se.srelic.white_rose.desc_11", "§5Layers decrease by 1 every 45 seconds");

        // Storm Body
        REGISTRATE.addRawLang("se.srelic.storm_body", "§bImperial Bow General - Hunting Heaven's Strike");
        REGISTRATE.addRawLang("se.srelic.storm_body.desc", "§3【Storm Body】");
        REGISTRATE.addRawLang("se.srelic.storm_body.desc_1", "§bEvery 10 attacks +1 layer, each swing gathers creatures and adds one layer");
        REGISTRATE.addRawLang("se.srelic.storm_body.desc_2", "§bUsing SA consumes layers, each providing §c20%§b damage increase §7(max 30 layers)");
        REGISTRATE.addRawLang("se.srelic.storm_body.desc_3", "§3【Only the First Faces the Mound】");
        REGISTRATE.addRawLang("se.srelic.storm_body.desc_4", "§bSwing generates two homing Phantom Swords");
        REGISTRATE.addRawLang("se.srelic.storm_body.desc_5", "§3【Flowing Wind, Returning Snow】");
        REGISTRATE.addRawLang("se.srelic.storm_body.desc_6", "§bPhantom Swords automatically home in on enemies within 12 blocks");

// Special Effects
        REGISTRATE.addRawLang("se.srelic.ice_rhythm", "§bFrosty Bloom's Prelude");
        REGISTRATE.addRawLang("se.srelic.ice_rhythm.desc", "§3【Ultimate Ice Melody】");
        REGISTRATE.addRawLang("se.srelic.ice_rhythm.desc_1", "§bEach attack accumulates §3Ice Bloom layers§b (+1 layer per 5 hits, max 15 layers)");
        REGISTRATE.addRawLang("se.srelic.ice_rhythm.desc_2", "§3【Winter's Sanctuary】");
        REGISTRATE.addRawLang("se.srelic.ice_rhythm.desc_3", "§bEach layer provides §310%§b damage reduction. At max layers, gain §3Resistance II");
        REGISTRATE.addRawLang("se.srelic.ice_rhythm.desc_4", "§3【Ultimate Ice Rhapsody】");
        REGISTRATE.addRawLang("se.srelic.ice_rhythm.desc_5", "§bWhen Forging ≥ 200, adds §c5%§b of target's current health as True Damage");

        REGISTRATE.addRawLang(CreateSeLang(SRSpecialEffectsRegistry.FIRE_FLY), "Secondary Combustion");
        REGISTRATE.addRawLang(CreateSeLangDescs(SRSpecialEffectsRegistry.FIRE_FLY), "Each attack stacks 30 Overheat");
        REGISTRATE.addRawLang(CreateSeLangDescsCounts(SRSpecialEffectsRegistry.FIRE_FLY, 1), "When Overheat > 300, clears it and activates Full Combustion state");
        REGISTRATE.addRawLang(CreateSeLangDescsCounts(SRSpecialEffectsRegistry.FIRE_FLY, 2), "During Full Combustion, you can fly");
        REGISTRATE.addRawLang(CreateSeLangDescsCounts(SRSpecialEffectsRegistry.FIRE_FLY, 3), "Attacks gain 30% armor penetration, damage increased by 150%");
        REGISTRATE.addRawLang(CreateSeLangDescsCounts(SRSpecialEffectsRegistry.FIRE_FLY, 4), "Gain Speed II, Strength III, and Resistance III");
        REGISTRATE.addRawLang(CreateSeLangDescsCounts(SRSpecialEffectsRegistry.FIRE_FLY, 5), "And damages surrounding creatures");

        REGISTRATE.addRawLang(CreateSeLang(SRSpecialEffectsRegistry.RED_SCAR), "In Dream As One");
        REGISTRATE.addRawLang(CreateSeLangDescs(SRSpecialEffectsRegistry.RED_SCAR), "Attacks stack one layer of 'Scarlet Scar'");
        REGISTRATE.addRawLang(CreateSeLangDescsCounts(SRSpecialEffectsRegistry.RED_SCAR, 1), "Every two layers grants one level of Resistance and Strength");
        REGISTRATE.addRawLang(CreateSeLangDescsCounts(SRSpecialEffectsRegistry.RED_SCAR, 2), "And each layer increases damage by 10% for 15 seconds, max 8 layers");
        REGISTRATE.addRawLang(CreateSeLangDescsCounts(SRSpecialEffectsRegistry.RED_SCAR, 3), "After reaching 8 layers, each additional layer gained restores 2 HP");
        REGISTRATE.addRawLang(CreateSeLangDescsCounts(SRSpecialEffectsRegistry.RED_SCAR, 4), "After reaching 8 layers, each slash damage increased by 50%");
        REGISTRATE.addRawLang(CreateSeLangDescsCounts(SRSpecialEffectsRegistry.RED_SCAR, 5), "While held, no longer affected by natural health regeneration");
        REGISTRATE.addRawLang(CreateSeLangDescsCounts(SRSpecialEffectsRegistry.RED_SCAR, 6), "Each attack has a 10% chance to trigger Quantum Collapse (pulls creatures in and causes a small explosion)");
        REGISTRATE.addRawLang(CreateSeLangDescsCounts(SRSpecialEffectsRegistry.RED_SCAR, 7), "While 'Scarlet Scar' is active, nearby players gain Regeneration I, Absorption I");
        REGISTRATE.addRawLang(CreateSeLangDescsCounts(SRSpecialEffectsRegistry.RED_SCAR, 8), "Each layer of 'Scarlet Scar' additionally adds 2 magical damage and applies Slowness");
        REGISTRATE.addRawLang(CreateSeLangDescsCounts(SRSpecialEffectsRegistry.RED_SCAR, 9), "Each attack adds 10 Abnormal Value to monsters; when full, puts monster in a 2s Breached state, ignoring 40% of enemy armor");

        REGISTRATE.addRawLang(CreateSeLang(SRSpecialEffectsRegistry.Elemental_Explosion), "Sky Blade - Elemental Burst");
        REGISTRATE.addRawLang(CreateSeLangDescs(SRSpecialEffectsRegistry.Elemental_Explosion), "§3【Elemental Burst】");
        REGISTRATE.addRawLang(CreateSeLangDescsCounts(SRSpecialEffectsRegistry.Elemental_Explosion, 1), "Releasing Sword Skill - Sky series SA adds one layer of [Sky Blade]");
        REGISTRATE.addRawLang(CreateSeLangDescsCounts(SRSpecialEffectsRegistry.Elemental_Explosion, 2), "Each layer provides one level of Speed and one of Resistance boost (Resistance boost max level IV)");
        REGISTRATE.addRawLang(CreateSeLangDescsCounts(SRSpecialEffectsRegistry.Elemental_Explosion, 3), "Dealing damage triggers additional magical damage");
        REGISTRATE.addRawLang(CreateSeLangDescsCounts(SRSpecialEffectsRegistry.Elemental_Explosion, 4), "Lose one layer of [Sky Blade] every 30 seconds");

        REGISTRATE.addRawLang(CreateSeLang(SRSpecialEffectsRegistry.VACUUM_BLADE), "Sky Blade - Vacuum Blade");
        REGISTRATE.addRawLang(CreateSeLangDescs(SRSpecialEffectsRegistry.VACUUM_BLADE), "§3【Vacuum Blade】");
        REGISTRATE.addRawLang(CreateSeLangDescsCounts(SRSpecialEffectsRegistry.VACUUM_BLADE, 1), "Releasing Sword Skill - Sky series SA adds one layer of [Sky Blade]");
        REGISTRATE.addRawLang(CreateSeLangDescsCounts(SRSpecialEffectsRegistry.VACUUM_BLADE, 2), "Holding [Sky Blade] allows you to fire Phantom Blades with 80% multiplier");
        REGISTRATE.addRawLang(CreateSeLangDescsCounts(SRSpecialEffectsRegistry.VACUUM_BLADE, 3), "Each additional [Sky Blade] layer increases multiplier by +20%");
        REGISTRATE.addRawLang(CreateSeLangDescsCounts(SRSpecialEffectsRegistry.VACUUM_BLADE, 4), "Lose one layer of [Sky Blade] every 30 seconds");

        REGISTRATE.addRawLang(CreateSeLang(SRSpecialEffectsRegistry.CELESTIAL_STRIKE), "Heaven's Piercing Star Strike");
        REGISTRATE.addRawLang(CreateSeLangDescs(SRSpecialEffectsRegistry.CELESTIAL_STRIKE), "【Sword & Shield Mode】");
        REGISTRATE.addRawLang(CreateSeLangDescsCounts(SRSpecialEffectsRegistry.CELESTIAL_STRIKE, 1), "Each attack stacks 1 layer of 'Star Eclipse' mark on enemies (max 20 layers)");
        REGISTRATE.addRawLang(CreateSeLangDescsCounts(SRSpecialEffectsRegistry.CELESTIAL_STRIKE, 2), "Each Star Eclipse layer deals damage equal to 0.75% of the enemy's current health");
        REGISTRATE.addRawLang(CreateSeLangDescsCounts(SRSpecialEffectsRegistry.CELESTIAL_STRIKE, 3), "Releasing SA [Decisive Blast Resolution] will directly detonate any enemy with Star Eclipse within a 10-block radius");
        REGISTRATE.addRawLang(CreateSeLangDescsCounts(SRSpecialEffectsRegistry.CELESTIAL_STRIKE, 4), "Additionally, regardless of whether enemies have 20 layers, releasing SA will switch to 【Switch Axe Mode】");
        REGISTRATE.addRawLang(CreateSeLangDescsCounts(SRSpecialEffectsRegistry.CELESTIAL_STRIKE, 5), "【Switch Axe Mode】");
        REGISTRATE.addRawLang(CreateSeLangDescsCounts(SRSpecialEffectsRegistry.CELESTIAL_STRIKE, 6), "All your non-fire damage type attacks are converted into 4 segments of fire damage and stack 2 layers of Liberation Value for you");
        REGISTRATE.addRawLang(CreateSeLangDescsCounts(SRSpecialEffectsRegistry.CELESTIAL_STRIKE, 7), "Also, damage is increased by an additional amount equal to 2% of your HP");
        REGISTRATE.addRawLang(CreateSeLangDescsCounts(SRSpecialEffectsRegistry.CELESTIAL_STRIKE, 8), "When Liberation Value reaches 100, attacks have a chance to trigger Ultimate Release");
        REGISTRATE.addRawLang(CreateSeLangDescsCounts(SRSpecialEffectsRegistry.CELESTIAL_STRIKE, 9), "Releasing SA when Liberation Value = 100 deals fire damage equal to the player's attack stat in 8 segments to creatures within a 10-block radius");
        REGISTRATE.addRawLang(CreateSeLangDescsCounts(SRSpecialEffectsRegistry.CELESTIAL_STRIKE, 10), "Also, releasing SA when Liberation Value = 100 will switch back to 【Sword & Shield Mode】");

        REGISTRATE.addRawLang(CreateSeLang(SRSpecialEffectsRegistry.INFERNO_THOUSAND_TRIALS), "Infernal Ember - Thousand Calamities");
        REGISTRATE.addRawLang(CreateSeLangDescs(SRSpecialEffectsRegistry.INFERNO_THOUSAND_TRIALS), "【Infernal Ember - Thousand Calamities】");
        REGISTRATE.addRawLang(CreateSeLangDescsCounts(SRSpecialEffectsRegistry.INFERNO_THOUSAND_TRIALS, 1), "Damage you deal is increased by 200%");
        REGISTRATE.addRawLang(CreateSeLangDescsCounts(SRSpecialEffectsRegistry.INFERNO_THOUSAND_TRIALS, 2), "Also deals Void damage equal to 2% of your max health to yourself. This deducted portion is converted into extra damage amplification at a rate of 1 heart = +10%");
        REGISTRATE.addRawLang(CreateSeLangDescsCounts(SRSpecialEffectsRegistry.INFERNO_THOUSAND_TRIALS, 3), "Every 10 attacks unleashes a Flame Field dealing fire damage equal to 50% of the player's attack stat to enemies");
        REGISTRATE.addRawLang(CreateSeLangDescsCounts(SRSpecialEffectsRegistry.INFERNO_THOUSAND_TRIALS, 4), "Damage taken by the player is halved");

        REGISTRATE.addRawLang(CreateSeLang(SRSpecialEffectsRegistry.ICE_BLADE), "Skyfall - Frostbearing Nail");
        REGISTRATE.addRawLang(CreateSeLangDescs(SRSpecialEffectsRegistry.ICE_BLADE), "【Skyfall - Frostbearing Nail】");
        REGISTRATE.addRawLang(CreateSeLangDescsCounts(SRSpecialEffectsRegistry.ICE_BLADE, 1), "Damage you deal is increased by 200%");
        REGISTRATE.addRawLang(CreateSeLangDescsCounts(SRSpecialEffectsRegistry.ICE_BLADE, 2), "Attacks have a 30% chance to summon an icicle");
        REGISTRATE.addRawLang(CreateSeLangDescsCounts(SRSpecialEffectsRegistry.ICE_BLADE, 3), "Icicle damage multiplier is 360%");

        REGISTRATE.addRawLang(CreateSeLang(SRSpecialEffectsRegistry.HOLY_ENERGY_OVERFLOW), "3rd Sacred Energy Overflow");
        REGISTRATE.addRawLang(CreateSeLangDescs(SRSpecialEffectsRegistry.HOLY_ENERGY_OVERFLOW), "【3rd Sacred Energy Overflow】");
        REGISTRATE.addRawLang(CreateSeLangDescsCounts(SRSpecialEffectsRegistry.HOLY_ENERGY_OVERFLOW, 1), "Damage you deal is increased by 30%");
        REGISTRATE.addRawLang(CreateSeLangDescsCounts(SRSpecialEffectsRegistry.HOLY_ENERGY_OVERFLOW, 2), "Your attack damage is split into two segments");
        REGISTRATE.addRawLang(CreateSeLangDescsCounts(SRSpecialEffectsRegistry.HOLY_ENERGY_OVERFLOW, 3), "When your Forging Count > 100:");
        REGISTRATE.addRawLang(CreateSeLangDescsCounts(SRSpecialEffectsRegistry.HOLY_ENERGY_OVERFLOW, 4), "Damage you deal is further increased by 60%");
        REGISTRATE.addRawLang(CreateSeLangDescsCounts(SRSpecialEffectsRegistry.HOLY_ENERGY_OVERFLOW, 5), "Your attack damage is split into three segments");

        REGISTRATE.addRawLang(CreateSeLang(SRSpecialEffectsRegistry.DREAM_COMPANION), "Companionship with Dreams");
        REGISTRATE.addRawLang(CreateSeLangDescs(SRSpecialEffectsRegistry.DREAM_COMPANION), "【Companionship with Dreams】");
        REGISTRATE.addRawLang(CreateSeLangDescsCounts(SRSpecialEffectsRegistry.DREAM_COMPANION, 1), "Damage you deal is increased by 100%");
        REGISTRATE.addRawLang(CreateSeLangDescsCounts(SRSpecialEffectsRegistry.DREAM_COMPANION, 2), "Attacks stack Frost value; at full layers, slows enemies. Enemies frozen this way take 25% increased damage");
        REGISTRATE.addRawLang(CreateSeLangDescsCounts(SRSpecialEffectsRegistry.DREAM_COMPANION, 3), "Non-hostile creatures around you gain Strength III");

        REGISTRATE.addRawLang(CreateSeLang(SRSpecialEffectsRegistry.BITTER_COLD_HELL), "Bitter Cold Hell");
        REGISTRATE.addRawLang(CreateSeLangDescs(SRSpecialEffectsRegistry.BITTER_COLD_HELL), "【Bitter Cold Hell】");
        REGISTRATE.addRawLang(CreateSeLangDescsCounts(SRSpecialEffectsRegistry.BITTER_COLD_HELL, 1), "Damage you deal is increased by 50%");
        REGISTRATE.addRawLang(CreateSeLangDescsCounts(SRSpecialEffectsRegistry.BITTER_COLD_HELL, 2), "Automatically stacks 'Forget-Me-Not' layers every 3 seconds");
        REGISTRATE.addRawLang(CreateSeLangDescsCounts(SRSpecialEffectsRegistry.BITTER_COLD_HELL, 3), "Attacks consume layers to deal additional damage");
        REGISTRATE.addRawLang(CreateSeLangDescsCounts(SRSpecialEffectsRegistry.BITTER_COLD_HELL, 4), "Attacks inflict Frost effect");

        REGISTRATE.addRawLang(CreateSeLang(SRSpecialEffectsRegistry.BITTER_COLD_HELL_EX), "Transcended - Bitter Cold Hell");
        REGISTRATE.addRawLang(CreateSeLangDescs(SRSpecialEffectsRegistry.BITTER_COLD_HELL_EX), "【Transcended - Bitter Cold Hell】");
        REGISTRATE.addRawLang(CreateSeLangDescsCounts(SRSpecialEffectsRegistry.BITTER_COLD_HELL_EX, 1), "Damage you deal is increased by 100%");
        REGISTRATE.addRawLang(CreateSeLangDescsCounts(SRSpecialEffectsRegistry.BITTER_COLD_HELL_EX, 2), "Automatically stacks 'Forget-Me-Not' layers every 2 seconds");
        REGISTRATE.addRawLang(CreateSeLangDescsCounts(SRSpecialEffectsRegistry.BITTER_COLD_HELL_EX, 3), "Attacks consume layers to deal additional damage");
        REGISTRATE.addRawLang(CreateSeLangDescsCounts(SRSpecialEffectsRegistry.BITTER_COLD_HELL_EX, 4), "Attacks inflict Frost effect");

        REGISTRATE.addRawLang(CreateSeLang(SRSpecialEffectsRegistry.ICE_BLOOM), "Soul Shift");
        REGISTRATE.addRawLang(CreateSeLangDescs(SRSpecialEffectsRegistry.ICE_BLOOM), "【Soul Shift】");
        REGISTRATE.addRawLang(CreateSeLangDescsCounts(SRSpecialEffectsRegistry.ICE_BLOOM, 1), "Each attack has a chance to accumulate 'New Moon' effect");
        REGISTRATE.addRawLang(CreateSeLangDescsCounts(SRSpecialEffectsRegistry.ICE_BLOOM, 2), "When 'New Moon' effect reaches 4 layers:");
        REGISTRATE.addRawLang(CreateSeLangDescsCounts(SRSpecialEffectsRegistry.ICE_BLOOM, 3), "Enter 'Soul Shift' effect:");
        REGISTRATE.addRawLang(CreateSeLangDescsCounts(SRSpecialEffectsRegistry.ICE_BLOOM, 4), "During 'Soul Shift', damage is increased by 100%. Additional layers beyond 4 can increase damage by 10% each, up to 9 layers total.");
        REGISTRATE.addRawLang(CreateSeLangDescsCounts(SRSpecialEffectsRegistry.ICE_BLOOM, 5), "Under 'Soul Shift', gain 'Phantom Blade Storm' and Strength effect");
        REGISTRATE.addRawLang(CreateSeLangDescsCounts(SRSpecialEffectsRegistry.ICE_BLOOM, 6), "Additionally, regardless of Soul Shift state, all your damage is converted to ice damage based on your health");

        REGISTRATE.addRawLang(CreateSeLang(SRSpecialEffectsRegistry.AFFLORDITE), "Anemone");
        REGISTRATE.addRawLang(CreateSeLangDescs(SRSpecialEffectsRegistry.AFFLORDITE), "【Anemone】");
        REGISTRATE.addRawLang(CreateSeLangDescsCounts(SRSpecialEffectsRegistry.AFFLORDITE, 1), "Your damage is increased by 25%");
        REGISTRATE.addRawLang(CreateSeLangDescsCounts(SRSpecialEffectsRegistry.AFFLORDITE, 2), "Attacks have a chance to deal area damage");
        REGISTRATE.addRawLang(CreateSeLangDescsCounts(SRSpecialEffectsRegistry.AFFLORDITE, 3), "Area damage multiplier is 1.5");
        REGISTRATE.addRawLang(CreateSeLangDescsCounts(SRSpecialEffectsRegistry.AFFLORDITE, 4), "If the enemy is a boss, the multiplier is 3");

        REGISTRATE.addRawLang(CreateSeLang(SRSpecialEffectsRegistry.FROST_FLAME), "Wind Flower, Frost Moon - Cold Flame");
        REGISTRATE.addRawLang(CreateSeLangDescs(SRSpecialEffectsRegistry.FROST_FLAME), "【Wind Flower, Frost Moon - Cold Flame】");
        REGISTRATE.addRawLang(CreateSeLangDescsCounts(SRSpecialEffectsRegistry.FROST_FLAME, 1), "Damage is increased by 60%");
        REGISTRATE.addRawLang(CreateSeLangDescsCounts(SRSpecialEffectsRegistry.FROST_FLAME, 2), "Damage becomes a mix of fire damage and cold damage");
        REGISTRATE.addRawLang(CreateSeLangDescsCounts(SRSpecialEffectsRegistry.FROST_FLAME, 3), "Attacks have a chance to apply 'Frostburn' effect (On Fire + Slowness III) to the target");
        REGISTRATE.addRawLang(CreateSeLangDescsCounts(SRSpecialEffectsRegistry.FROST_FLAME, 4), "When attacking targets with 'Frostburn', damage is increased by 30%");
        REGISTRATE.addRawLang(CreateSeLangDescsCounts(SRSpecialEffectsRegistry.FROST_FLAME, 5), "Every five slashes gain one layer of 'Falling Frost', max 6 layers, lasting 6 seconds");
        REGISTRATE.addRawLang(CreateSeLangDescsCounts(SRSpecialEffectsRegistry.FROST_FLAME, 6), "Each layer of 'Falling Frost' provides 15% damage increase and ignores 30% fire/frost resistance");

        REGISTRATE.addRawLang(CreateSeLang(SRSpecialEffectsRegistry.ICE_SOUL_FROST_SKY), "Ice Soul - Frosty Moon, Icy Sky");
        REGISTRATE.addRawLang(CreateSeLangDescs(SRSpecialEffectsRegistry.ICE_SOUL_FROST_SKY), "【Ice Soul - Frosty Moon, Icy Sky】");
        REGISTRATE.addRawLang(CreateSeLangDescsCounts(SRSpecialEffectsRegistry.ICE_SOUL_FROST_SKY, 1), "Damage dealt is increased by 45%");
        REGISTRATE.addRawLang(CreateSeLangDescsCounts(SRSpecialEffectsRegistry.ICE_SOUL_FROST_SKY, 2), "Additional 15% increase when facing bosses");
        REGISTRATE.addRawLang(CreateSeLangDescsCounts(SRSpecialEffectsRegistry.ICE_SOUL_FROST_SKY, 3), "Hitting enemies adds 1 layer of Ice Erosion (max 15 layers)");
        REGISTRATE.addRawLang(CreateSeLangDescsCounts(SRSpecialEffectsRegistry.ICE_SOUL_FROST_SKY, 4), "At 15 layers, automatically triggers an SA");

        REGISTRATE.addRawLang(CreateSeLang(SRSpecialEffectsRegistry.HUNTER), "【Hunter】");
        REGISTRATE.addRawLang(CreateSeLangDescs(SRSpecialEffectsRegistry.HUNTER), "【Hunter】");
        REGISTRATE.addRawLang(CreateSeLangDescsCounts(SRSpecialEffectsRegistry.HUNTER, 1), "Movement speed increased by 25%");
        REGISTRATE.addRawLang(CreateSeLangDescsCounts(SRSpecialEffectsRegistry.HUNTER, 2), "Damage you deal is increased based on movement speed bonus");
        REGISTRATE.addRawLang(CreateSeLangDescsCounts(SRSpecialEffectsRegistry.HUNTER, 3), "Each attack stacks toxin layers");
        REGISTRATE.addRawLang(CreateSeLangDescsCounts(SRSpecialEffectsRegistry.HUNTER, 4), "Deals toxin damage every 0.5 seconds (damage value = 20% of player's base attack power × layers)");


        REGISTRATE.addRawLang(SRStacksReg.RED_SCAR.getDescriptionKey(), "§c\"Scarlet Scar\"");
        REGISTRATE.addRawLang(SRStacksReg.FROST_FLAME_STACKS.getDescriptionKey(), "§b\"Falling Frost\"");
        REGISTRATE.addRawLang(SRStacksReg.MING_MANG_STACKS.getDescriptionKey(), "§5\"Nether Radiance\"");
        REGISTRATE.addRawLang(SRStacksReg.BUTTERFLY_STACKS.getDescriptionKey(), "§5\"Nether Radiance\"");
        REGISTRATE.addRawLang(SRStacksReg.BLOOD_PLUM_STACKS.getDescriptionKey(), "§4\"Blood Plum\"");
        REGISTRATE.addRawLang(SRStacksReg.BLAZING_VALOR_STACKS.getDescriptionKey(), "§6\"Crimson Lotus\"");
        REGISTRATE.addRawLang(SRStacksReg.PureElegy.getDescriptionKey(), "§e\"Ascension\"");
        REGISTRATE.addRawLang(SRStacksReg.WATER_SYMPHONY_STACKS.getDescriptionKey(), "§3\"Wave Rhythm Praise\"");
        REGISTRATE.addRawLang(SRStacksReg.LIANG_DIE_STACKS.getDescriptionKey(), "§d\"Quantum Butterfly\"");
        REGISTRATE.addRawLang(SRStacksReg.LIANG_FENG_STACKS.getDescriptionKey(), "§d\"Quantum Edge\"");
        REGISTRATE.addRawLang(SRStacksReg.CUBE_MATRIX_STACKS.getDescriptionKey(), "§5\"Cube Field\"");
        REGISTRATE.addRawLang(SRStacksReg.CRIMSON_SCAR_STACKS.getDescriptionKey(), "§7\"WIP\"");
        REGISTRATE.addRawLang(SRStacksReg.NIGHTMARE_LAYER_STACKS.getDescriptionKey(), "§7\"WIP\"");
        REGISTRATE.addRawLang(SRStacksReg.RHYTHM_VALUE.getDescriptionKey(), "§e\"Variation Value\"");
        REGISTRATE.addRawLang(SRStacksReg.ICE_LAYER_STACK.getDescriptionKey(), "§b\"Ultimate Ice Value\"");
        REGISTRATE.addRawLang(SRStacksReg.FLAME_RESONANCE_STACKS.getDescriptionKey(), "§6\"Radiant Node\"");
        REGISTRATE.addRawLang(SRStacksReg.WHITE_ROSE_STACKS.getDescriptionKey(), "§d\"Rose\"");
        REGISTRATE.addRawLang(SRStacksReg.FLY_YELLOW_STACKS.getDescriptionKey(), "§e\"Soaring Yellow\"");
        REGISTRATE.addRawLang(SRStacksReg.ICE_RHYTHM_STACKS.getDescriptionKey(), "§b\"Ice Bloom\"");
        REGISTRATE.addRawLang(SRStacksReg.OVERHEAT_VALUE_STACKS.getDescriptionKey(), "§c\"Overheat Value\"");
        REGISTRATE.addRawLang(SRStacksReg.SECONDARY_COMBUSTION_STACKS.getDescriptionKey(), "§c\"Secondary Combustion\"");
        REGISTRATE.addRawLang(SRStacksReg.SKY_SWORD.getDescriptionKey(), "§f\"Sky Blade\"");
        REGISTRATE.addRawLang(SRStacksReg.CELESTIAL_STRIKE.getDescriptionKey(), "§6\"Liberation Value\"");
        REGISTRATE.addRawLang(SRStacksReg.ICE_BLOOM_STACKS.getDescriptionKey(), "§b\"New Moon\"");
        REGISTRATE.addRawLang(SRStacksReg.ICE_SOUL_FROST_SKY_STACKS.getDescriptionKey(), "§b\"Ice Erosion\"");
        REGISTRATE.addRawLang(SRStacksReg.BITTER_COLD_HELL_STACKS.getDescriptionKey(), "§b\"Bitter Cold Hell\"");
        REGISTRATE.addRawLang(SRStacksReg.BITTER_COLD_HELL_EX_STACKS.getDescriptionKey(), "§b\"Extreme Bitter Cold Hell\"");
        REGISTRATE.addRawLang(SRStacksReg.HUNTER_TOXIN_STACKS.getDescriptionKey(), "§a\"Toxin Adhesion\"");
        REGISTRATE.addRawLang(SRStacksReg.SAM_OVERDRIVE_STACKS.getDescriptionKey(), "§c\"Overdrive\"");
        REGISTRATE.addRawLang(SRStacksReg.CHAOS_BREAKER_STACKS.getDescriptionKey(), "§6\"Celestial Charge\"");
        REGISTRATE.addRawLang(SRStacksReg.SHRIN_FISH_STACKS.getDescriptionKey(), "§b\"Pufferfish Ashore Panting Progress\"");
        REGISTRATE.addRawLang(SRStacksReg.SANCTUARY_SHIELD.getDescriptionKey(), "§b\"Flawless Shield\"");
        REGISTRATE.addRawLang(SRStacksReg.PETAL_STACKS.getDescriptionKey(), "§l§4\"Red Camellia - Stamen\"");
        REGISTRATE.addRawLang(SRStacksReg.ResolveStacks.getDescriptionKey(), "§l§5\"Resolve\"");





        REGISTRATE.addRawLang("srelic.sword_type.other_world_on", "Illu.");
        REGISTRATE.addRawLang("srelic.sword_type.other_world", "Reso.");
        REGISTRATE.addRawLang("srelic.sword_type.other_world_off", "Seal.");

        REGISTRATE.addRawLang("item.srelic.max_armor.desc", "When wearing the full set:");
        REGISTRATE.addRawLang("item.srelic.max_armor.desc_1", "Your invincibility frames are extended to 3 seconds");
        REGISTRATE.addRawLang("item.srelic.max_armor.desc_2", "Magic damage you take is reduced by 80%");
        REGISTRATE.addRawLang("item.srelic.max_armor.desc_3", "You are immune to fire and frost damage types");
        REGISTRATE.addRawLang("item.srelic.max_armor.desc_4", "The equipped armor cannot be destroyed");
        REGISTRATE.addRawLang("item.srelic.max_armor.desc_5", "Fire, magic, and frost damage you deal is increased by 30%");

        REGISTRATE.addRawLang("item.srelic.ocean_armor.desc", "When wearing the full set and underwater:");
        REGISTRATE.addRawLang("item.srelic.ocean_armor.desc_1", "Damage you take is reduced by 30%");
        REGISTRATE.addRawLang("item.srelic.ocean_armor.desc_2", "Damage you deal is increased by 30%");

        REGISTRATE.addRawLang("item.srelic.sky_armor.desc", "When wearing the full set:");
        REGISTRATE.addRawLang("item.srelic.sky_armor.desc_1", "Creative Flight");

        REGISTRATE.addRawLang("message.srelic.grammer_alloy_obtained", "You obtained Grammer Alloy!");
        REGISTRATE.addRawLang("message.srelic.grammer_progress", "Silverfish Kill Progress: %d/%d");
        REGISTRATE.addRawLang("tooltip.srelic.grammer_progress", "Silverfish Kill Progress: %d/%d");

        REGISTRATE.addRawLang("item_group." + MODID + "." + MODID + "_slashblade",  "Game relic· Otherworldly Blades");
        REGISTRATE.addRawLang("item_group." + MODID + "." + MODID + "_se", "Game relic· Path Trajectory");
        REGISTRATE.addRawLang("item_group." + MODID + "." + MODID + "_se2",  "Game relic· SE Test Iteration");
        REGISTRATE.addRawLang("item_group." + MODID + "." + MODID + "_item","Game relic· Blade Materials");
    }


    public static String CreateItemLang(ResourceKey<SlashBladeDefinition> a) {
        return "item." + MODID + "." + a.location().getPath();
    }

    public static String CreateSeLang(RegistryObject<SpecialEffect> a) {
        return "se." + MODID + "." + a.getId().getPath();
    }

    public static String CreateSeLangDescs(RegistryObject<SpecialEffect> a) {
        return "se." + MODID + "." + a.getId().getPath() + ".desc";
    }

    public static String CreateSeLangDescsCounts(RegistryObject<SpecialEffect> a, int i) {
        return "se." + MODID + "." + a.getId().getPath() + ".desc_" + i;
    }

    public static String CreateSaLang(RegistryObject<SlashArts> a) {
        return "slash_art." + MODID + "." + a.getId().getPath();
    }


}
