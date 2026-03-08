package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiPin: ImageVector
    get() {
        if (_SiPin != null) {
            return _SiPin!!
        }
        _SiPin = ImageVector.Builder(
            name = "Filled.SiPin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.672f, 4.095f)
                arcToRelative(9.017f, 9.017f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.627f, -0.03f)
                horizontalLineToRelative(0.002f)
                lineToRelative(0.032f, 0.03f)
                curveToRelative(3.545f, 3.487f, 3.552f, 9.088f, 0.042f, 12.54f)
                lineToRelative(-5.671f, 5.578f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.403f, 0f)
                lineTo(5.63f, 16.635f)
                arcToRelative(8.74f, 8.74f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -12.499f)
                close()
                moveTo(12f, 6.5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 6f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -6f)
            }
        }.build()

        return _SiPin!!
    }

@Suppress("ObjectPropertyName")
private var _SiPin: ImageVector? = null
