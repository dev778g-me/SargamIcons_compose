package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiMoon: ImageVector
    get() {
        if (_SiMoon != null) {
            return _SiMoon!!
        }
        _SiMoon = ImageVector.Builder(
            name = "Filled.SiMoon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.272f, 2.406f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.23f, -1.355f)
                curveTo(6.59f, 1.535f, 5.432f, 2.488f, 4.37f, 3.55f)
                arcToRelative(11.4f, 11.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16.182f)
                curveToRelative(4.518f, 4.519f, 11.51f, 4.261f, 15.976f, -0.205f)
                curveToRelative(1.062f, -1.062f, 2.014f, -2.22f, 2.498f, -3.673f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.55f, 14.6f)
                curveToRelative(-3.59f, 1.322f, -7.675f, 0.734f, -10.433f, -2.025f)
                curveTo(8.35f, 9.808f, 7.788f, 5.744f, 9.272f, 2.406f)
            }
        }.build()

        return _SiMoon!!
    }

@Suppress("ObjectPropertyName")
private var _SiMoon: ImageVector? = null
