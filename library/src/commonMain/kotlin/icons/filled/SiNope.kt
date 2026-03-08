package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiNope: ImageVector
    get() {
        if (_SiNope != null) {
            return _SiNope!!
        }
        _SiNope = ImageVector.Builder(
            name = "Filled.SiNope",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 1f)
                arcToRelative(10.96f, 10.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.65f, 3.099f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.477f, 0.488f)
                arcTo(10.96f, 10.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 12f)
                curveToRelative(0f, 6.075f, -4.925f, 11f, -11f, 11f)
                reflectiveCurveTo(1f, 18.075f, 1f, 12f)
                reflectiveCurveTo(5.925f, 1f, 12f, 1f)
                moveTo(4.297f, 18.332f)
                lineToRelative(1.406f, 1.423f)
                lineTo(19.92f, 5.712f)
                lineToRelative(-1.405f, -1.424f)
                close()
            }
        }.build()

        return _SiNope!!
    }

@Suppress("ObjectPropertyName")
private var _SiNope: ImageVector? = null
