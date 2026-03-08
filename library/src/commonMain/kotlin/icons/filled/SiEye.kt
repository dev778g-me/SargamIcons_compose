package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiEye: ImageVector
    get() {
        if (_SiEye != null) {
            return _SiEye!!
        }
        _SiEye = ImageVector.Builder(
            name = "Filled.SiEye",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 5f)
                curveToRelative(6.074f, 0f, 11f, 7f, 11f, 7f)
                curveToRelative(-0.001f, 0.002f, -4.927f, 7f, -11f, 7f)
                reflectiveCurveTo(1f, 12f, 1f, 12f)
                reflectiveCurveToRelative(4.926f, -7f, 11f, -7f)
                moveToRelative(0f, 3f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 8f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -8f)
            }
        }.build()

        return _SiEye!!
    }

@Suppress("ObjectPropertyName")
private var _SiEye: ImageVector? = null
