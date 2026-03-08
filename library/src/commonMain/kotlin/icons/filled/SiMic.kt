package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiMic: ImageVector
    get() {
        if (_SiMic != null) {
            return _SiMic!!
        }
        _SiMic = ImageVector.Builder(
            name = "Filled.SiMic",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 2f)
                curveTo(9.769f, 2f, 8f, 3.757f, 8f, 5.828f)
                verticalLineToRelative(6.344f)
                curveTo(8f, 14.242f, 9.769f, 16f, 12f, 16f)
                reflectiveCurveToRelative(4f, -1.758f, 4f, -3.828f)
                verticalLineTo(5.828f)
                curveTo(16f, 3.758f, 14.231f, 2f, 12f, 2f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 20.945f)
                verticalLineTo(23f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
                verticalLineToRelative(-2.055f)
                curveTo(6.5f, 20.448f, 3f, 16.633f, 3f, 12f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = true, isPositiveArc = false, 14f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                curveToRelative(0f, 4.633f, -3.5f, 8.448f, -8f, 8.945f)
            }
        }.build()

        return _SiMic!!
    }

@Suppress("ObjectPropertyName")
private var _SiMic: ImageVector? = null
