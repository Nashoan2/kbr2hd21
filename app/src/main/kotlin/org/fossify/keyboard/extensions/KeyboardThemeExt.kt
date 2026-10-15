package org.fossify.keyboard.extensions

import android.content.Context
import android.graphics.Color
import org.fossify.commons.models.RadioItem
import org.fossify.keyboard.R
import org.fossify.keyboard.helpers.THEME_HONEY_3D
import org.fossify.keyboard.helpers.THEME_IOS_DARK
import org.fossify.keyboard.helpers.THEME_NEON_CYBER
import org.fossify.keyboard.helpers.THEME_PIANO_3D
import org.fossify.keyboard.helpers.THEME_RETRO_1995

data class KeyboardThemeData(
    val id: Int,
    val nameRes: Int,
    val keyboardBgColor: Int,
    val toolbarBgColor: Int,
    val toolbarIconColor: Int,
    // Normal Keys
    val normalKeyTopColor: Int,
    val normalKeyBottomColor: Int,
    val normalKeyHighlightColor: Int,
    val normalKeyShadowColor: Int,
    val normalKeyPressedColor: Int,
    val normalTextColor: Int,
    val normalTextPressedColor: Int,
    val subTextColor: Int,
    // Accent Keys (Shift, 123, AR/EN)
    val accentKeyTopColor: Int,
    val accentKeyBottomColor: Int,
    val accentKeyHighlightColor: Int,
    val accentKeyShadowColor: Int,
    val accentKeyPressedColor: Int,
    val accentTextColor: Int,
    // Enter Key
    val enterKeyTopColor: Int,
    val enterKeyBottomColor: Int,
    val enterKeyHighlightColor: Int,
    val enterKeyShadowColor: Int,
    val enterKeyPressedColor: Int,
    val enterIconColor: Int,
    // Delete Key
    val deleteKeyTopColor: Int,
    val deleteKeyBottomColor: Int,
    val deleteKeyHighlightColor: Int,
    val deleteKeyShadowColor: Int,
    val deleteKeyPressedColor: Int,
    val deleteIconColor: Int,
    // Space Key
    val spaceKeyTopColor: Int,
    val spaceKeyBottomColor: Int,
    // Dimensions
    val cornerRadiusDp: Float,
    val elevationDp: Float
)

val CYBER_NEON_THEME = KeyboardThemeData(
    id = THEME_NEON_CYBER,
    nameRes = R.string.theme_cyber_neon,
    keyboardBgColor = Color.parseColor("#081022"),
    toolbarBgColor = Color.parseColor("#0B152B"),
    toolbarIconColor = Color.parseColor("#00E5FF"),
    normalKeyTopColor = Color.parseColor("#1B2A45"),
    normalKeyBottomColor = Color.parseColor("#131F33"),
    normalKeyHighlightColor = Color.parseColor("#2E456E"),
    normalKeyShadowColor = Color.parseColor("#080D18"),
    normalKeyPressedColor = Color.parseColor("#24385C"),
    normalTextColor = Color.parseColor("#FFFFFF"),
    normalTextPressedColor = Color.parseColor("#B0FFFFFF"),
    subTextColor = Color.parseColor("#00E5FF"),
    accentKeyTopColor = Color.parseColor("#1F3354"),
    accentKeyBottomColor = Color.parseColor("#17263E"),
    accentKeyHighlightColor = Color.parseColor("#00E5FF"),
    accentKeyShadowColor = Color.parseColor("#080D18"),
    accentKeyPressedColor = Color.parseColor("#29426B"),
    accentTextColor = Color.parseColor("#00E5FF"),
    enterKeyTopColor = Color.parseColor("#006B9E"),
    enterKeyBottomColor = Color.parseColor("#004C73"),
    enterKeyHighlightColor = Color.parseColor("#00E5FF"),
    enterKeyShadowColor = Color.parseColor("#00283E"),
    enterKeyPressedColor = Color.parseColor("#0086C4"),
    enterIconColor = Color.parseColor("#00E5FF"),
    deleteKeyTopColor = Color.parseColor("#1F3354"),
    deleteKeyBottomColor = Color.parseColor("#17263E"),
    deleteKeyHighlightColor = Color.parseColor("#2E456E"),
    deleteKeyShadowColor = Color.parseColor("#080D18"),
    deleteKeyPressedColor = Color.parseColor("#29426B"),
    deleteIconColor = Color.parseColor("#00E5FF"),
    spaceKeyTopColor = Color.parseColor("#16233B"),
    spaceKeyBottomColor = Color.parseColor("#121D30"),
    cornerRadiusDp = 10f,
    elevationDp = 3.5f
)

val HONEY_3D_THEME = KeyboardThemeData(
    id = THEME_HONEY_3D,
    nameRes = R.string.theme_honey_3d,
    keyboardBgColor = Color.parseColor("#1A1107"),
    toolbarBgColor = Color.parseColor("#23170B"),
    toolbarIconColor = Color.parseColor("#FFC107"),
    normalKeyTopColor = Color.parseColor("#3F2814"),
    normalKeyBottomColor = Color.parseColor("#2D1B0B"),
    normalKeyHighlightColor = Color.parseColor("#664120"),
    normalKeyShadowColor = Color.parseColor("#140B04"),
    normalKeyPressedColor = Color.parseColor("#523419"),
    normalTextColor = Color.parseColor("#FFD54F"), // Warm Golden Honey, zero glare
    normalTextPressedColor = Color.parseColor("#FFE082"),
    subTextColor = Color.parseColor("#FFA000"),
    accentKeyTopColor = Color.parseColor("#4D3117"),
    accentKeyBottomColor = Color.parseColor("#38220D"),
    accentKeyHighlightColor = Color.parseColor("#805325"),
    accentKeyShadowColor = Color.parseColor("#140B04"),
    accentKeyPressedColor = Color.parseColor("#5F3C1C"),
    accentTextColor = Color.parseColor("#FFE082"),
    enterKeyTopColor = Color.parseColor("#8C5810"),
    enterKeyBottomColor = Color.parseColor("#633D07"),
    enterKeyHighlightColor = Color.parseColor("#FFB300"),
    enterKeyShadowColor = Color.parseColor("#291902"),
    enterKeyPressedColor = Color.parseColor("#A86B14"),
    enterIconColor = Color.parseColor("#FFD54F"),
    deleteKeyTopColor = Color.parseColor("#4D3117"),
    deleteKeyBottomColor = Color.parseColor("#38220D"),
    deleteKeyHighlightColor = Color.parseColor("#805325"),
    deleteKeyShadowColor = Color.parseColor("#140B04"),
    deleteKeyPressedColor = Color.parseColor("#5F3C1C"),
    deleteIconColor = Color.parseColor("#FFC107"),
    spaceKeyTopColor = Color.parseColor("#3F2814"),
    spaceKeyBottomColor = Color.parseColor("#2D1B0B"),
    cornerRadiusDp = 10f,
    elevationDp = 3.5f
)

val RETRO_1995_THEME = KeyboardThemeData(
    id = THEME_RETRO_1995,
    nameRes = R.string.theme_retro_1995,
    keyboardBgColor = Color.parseColor("#1F2227"),
    toolbarBgColor = Color.parseColor("#262A30"),
    toolbarIconColor = Color.parseColor("#CFD8DC"),
    normalKeyTopColor = Color.parseColor("#424750"),
    normalKeyBottomColor = Color.parseColor("#343840"),
    normalKeyHighlightColor = Color.parseColor("#606875"),
    normalKeyShadowColor = Color.parseColor("#14161A"),
    normalKeyPressedColor = Color.parseColor("#2B2E35"),
    normalTextColor = Color.parseColor("#E2E6EA"), // Vintage mechanical keycap off-white
    normalTextPressedColor = Color.parseColor("#B0BEC5"),
    subTextColor = Color.parseColor("#90A4AE"),
    accentKeyTopColor = Color.parseColor("#363B43"),
    accentKeyBottomColor = Color.parseColor("#2A2D33"),
    accentKeyHighlightColor = Color.parseColor("#505662"),
    accentKeyShadowColor = Color.parseColor("#14161A"),
    accentKeyPressedColor = Color.parseColor("#23252A"),
    accentTextColor = Color.parseColor("#B0BEC5"),
    enterKeyTopColor = Color.parseColor("#2E4E5C"),
    enterKeyBottomColor = Color.parseColor("#203842"),
    enterKeyHighlightColor = Color.parseColor("#4B7B91"),
    enterKeyShadowColor = Color.parseColor("#0E1A1F"),
    enterKeyPressedColor = Color.parseColor("#3C6475"),
    enterIconColor = Color.parseColor("#E2E6EA"),
    deleteKeyTopColor = Color.parseColor("#363B43"),
    deleteKeyBottomColor = Color.parseColor("#2A2D33"),
    deleteKeyHighlightColor = Color.parseColor("#505662"),
    deleteKeyShadowColor = Color.parseColor("#14161A"),
    deleteKeyPressedColor = Color.parseColor("#23252A"),
    deleteIconColor = Color.parseColor("#E2E6EA"),
    spaceKeyTopColor = Color.parseColor("#424750"),
    spaceKeyBottomColor = Color.parseColor("#343840"),
    cornerRadiusDp = 6f, // Classic 1990s beveled mechanical corners
    elevationDp = 4f
)

val IOS_DARK_THEME = KeyboardThemeData(
    id = THEME_IOS_DARK,
    nameRes = R.string.theme_ios_dark,
    keyboardBgColor = Color.parseColor("#121214"),
    toolbarBgColor = Color.parseColor("#18181B"),
    toolbarIconColor = Color.parseColor("#0A84FF"),
    normalKeyTopColor = Color.parseColor("#333336"),
    normalKeyBottomColor = Color.parseColor("#28282B"),
    normalKeyHighlightColor = Color.parseColor("#46464B"),
    normalKeyShadowColor = Color.parseColor("#0E0E10"),
    normalKeyPressedColor = Color.parseColor("#48484C"),
    normalTextColor = Color.parseColor("#F2F2F7"), // iOS Clean soft typography
    normalTextPressedColor = Color.parseColor("#D1D1D6"),
    subTextColor = Color.parseColor("#8E8E93"),
    accentKeyTopColor = Color.parseColor("#222225"),
    accentKeyBottomColor = Color.parseColor("#1A1A1C"),
    accentKeyHighlightColor = Color.parseColor("#36363A"),
    accentKeyShadowColor = Color.parseColor("#0B0B0C"),
    accentKeyPressedColor = Color.parseColor("#323236"),
    accentTextColor = Color.parseColor("#0A84FF"),
    enterKeyTopColor = Color.parseColor("#0A84FF"),
    enterKeyBottomColor = Color.parseColor("#0066CC"),
    enterKeyHighlightColor = Color.parseColor("#54A6FF"),
    enterKeyShadowColor = Color.parseColor("#003870"),
    enterKeyPressedColor = Color.parseColor("#0071E3"),
    enterIconColor = Color.parseColor("#FFFFFF"),
    deleteKeyTopColor = Color.parseColor("#222225"),
    deleteKeyBottomColor = Color.parseColor("#1A1A1C"),
    deleteKeyHighlightColor = Color.parseColor("#36363A"),
    deleteKeyShadowColor = Color.parseColor("#0B0B0C"),
    deleteKeyPressedColor = Color.parseColor("#323236"),
    deleteIconColor = Color.parseColor("#D1D1D6"),
    spaceKeyTopColor = Color.parseColor("#333336"),
    spaceKeyBottomColor = Color.parseColor("#28282B"),
    cornerRadiusDp = 9f,
    elevationDp = 3f
)

val PIANO_3D_THEME = KeyboardThemeData(
    id = THEME_PIANO_3D,
    nameRes = R.string.theme_piano_3d,
    keyboardBgColor = Color.parseColor("#0B0B0E"),
    toolbarBgColor = Color.parseColor("#131317"),
    toolbarIconColor = Color.parseColor("#E8D7B8"),
    normalKeyTopColor = Color.parseColor("#38332A"),
    normalKeyBottomColor = Color.parseColor("#2A261F"),
    normalKeyHighlightColor = Color.parseColor("#564E40"),
    normalKeyShadowColor = Color.parseColor("#100E0B"),
    normalKeyPressedColor = Color.parseColor("#4A4337"),
    normalTextColor = Color.parseColor("#F7EBD7"), // Antique Champagne Ivory, warm and clear
    normalTextPressedColor = Color.parseColor("#E0C9A6"),
    subTextColor = Color.parseColor("#C5A059"),
    accentKeyTopColor = Color.parseColor("#1C1C24"),
    accentKeyBottomColor = Color.parseColor("#121217"),
    accentKeyHighlightColor = Color.parseColor("#353544"),
    accentKeyShadowColor = Color.parseColor("#060608"),
    accentKeyPressedColor = Color.parseColor("#2B2B36"),
    accentTextColor = Color.parseColor("#E8D7B8"),
    enterKeyTopColor = Color.parseColor("#7A5D1E"),
    enterKeyBottomColor = Color.parseColor("#544013"),
    enterKeyHighlightColor = Color.parseColor("#A88332"),
    enterKeyShadowColor = Color.parseColor("#241B05"),
    enterKeyPressedColor = Color.parseColor("#8F6E24"),
    enterIconColor = Color.parseColor("#F7EBD7"),
    deleteKeyTopColor = Color.parseColor("#1C1C24"),
    deleteKeyBottomColor = Color.parseColor("#121217"),
    deleteKeyHighlightColor = Color.parseColor("#353544"),
    deleteKeyShadowColor = Color.parseColor("#060608"),
    deleteKeyPressedColor = Color.parseColor("#2B2B36"),
    deleteIconColor = Color.parseColor("#E8D7B8"),
    spaceKeyTopColor = Color.parseColor("#38332A"),
    spaceKeyBottomColor = Color.parseColor("#2A261F"),
    cornerRadiusDp = 8f,
    elevationDp = 4f
)

fun Context.getCurrentKeyboardTheme(): KeyboardThemeData {
    return when (config.keyboardTheme) {
        THEME_HONEY_3D -> HONEY_3D_THEME
        THEME_RETRO_1995 -> RETRO_1995_THEME
        THEME_IOS_DARK -> IOS_DARK_THEME
        THEME_PIANO_3D -> PIANO_3D_THEME
        else -> CYBER_NEON_THEME
    }
}

fun Context.getKeyboardBackgroundColor(): Int {
    return getCurrentKeyboardTheme().keyboardBgColor
}

fun Context.getStrokeColor(): Int {
    return getCurrentKeyboardTheme().normalKeyHighlightColor
}

fun Context.getKeyboardThemesRadioItems(): ArrayList<RadioItem> {
    return arrayListOf(
        RadioItem(THEME_NEON_CYBER, getString(R.string.theme_cyber_neon)),
        RadioItem(THEME_HONEY_3D, getString(R.string.theme_honey_3d)),
        RadioItem(THEME_RETRO_1995, getString(R.string.theme_retro_1995)),
        RadioItem(THEME_IOS_DARK, getString(R.string.theme_ios_dark)),
        RadioItem(THEME_PIANO_3D, getString(R.string.theme_piano_3d))
    )
}

fun Context.getKeyboardThemeName(themeId: Int): String {
    return when (themeId) {
        THEME_HONEY_3D -> getString(R.string.theme_honey_3d)
        THEME_RETRO_1995 -> getString(R.string.theme_retro_1995)
        THEME_IOS_DARK -> getString(R.string.theme_ios_dark)
        THEME_PIANO_3D -> getString(R.string.theme_piano_3d)
        else -> getString(R.string.theme_cyber_neon)
    }
}
