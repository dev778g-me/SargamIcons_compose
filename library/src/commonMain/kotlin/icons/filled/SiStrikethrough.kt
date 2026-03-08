package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiStrikethrough: ImageVector
    get() {
        if (_SiStrikethrough != null) {
            return _SiStrikethrough!!
        }
        _SiStrikethrough = ImageVector.Builder(
            name = "Filled.SiStrikethrough",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 16.773f)
                curveToRelative(0f, -0.883f, -0.218f, -1.492f, -0.743f, -2.054f)
                curveToRelative(-0.511f, -0.547f, -1.357f, -1.098f, -2.746f, -1.719f)
                horizontalLineTo(4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, -2f)
                horizontalLineToRelative(4.893f)
                curveTo(7.545f, 9.9f, 6.762f, 8.553f, 6.762f, 6.895f)
                curveToRelative(0f, -1.346f, 0.744f, -2.575f, 1.739f, -3.435f)
                curveTo(9.506f, 2.591f, 10.876f, 2f, 12.333f, 2f)
                horizontalLineToRelative(0.031f)
                arcToRelative(9.6f, 9.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.786f, 1.483f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.063f, 1.694f)
                arcTo(7.6f, 7.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.313f, 4f)
                curveToRelative(-0.916f, 0.005f, -1.824f, 0.386f, -2.504f, 0.974f)
                curveToRelative(-0.696f, 0.6f, -1.047f, 1.319f, -1.047f, 1.92f)
                curveToRelative(0f, 1.412f, 1.013f, 2.778f, 3.957f, 4.017f)
                lineToRelative(0.206f, 0.089f)
                horizontalLineTo(20f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 2f)
                horizontalLineToRelative(-3.644f)
                quadToRelative(0.194f, 0.172f, 0.363f, 0.354f)
                curveToRelative(0.927f, 0.993f, 1.281f, 2.118f, 1.281f, 3.42f)
                curveToRelative(0f, 1.771f, -0.935f, 3.109f, -2.167f, 3.966f)
                curveToRelative(-1.212f, 0.843f, -2.75f, 1.26f, -4.166f, 1.26f)
                curveToRelative(-1.858f, 0f, -3.677f, -0.53f, -5.233f, -1.6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.132f, -1.649f)
                curveToRelative(1.206f, 0.83f, 2.626f, 1.249f, 4.101f, 1.249f)
                curveToRelative(1.06f, 0f, 2.188f, -0.32f, 3.023f, -0.901f)
                curveToRelative(0.816f, -0.568f, 1.31f, -1.343f, 1.31f, -2.326f)
            }
        }.build()

        return _SiStrikethrough!!
    }

@Suppress("ObjectPropertyName")
private var _SiStrikethrough: ImageVector? = null
