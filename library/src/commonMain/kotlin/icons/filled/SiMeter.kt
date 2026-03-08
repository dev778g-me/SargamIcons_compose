package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiMeter: ImageVector
    get() {
        if (_SiMeter != null) {
            return _SiMeter!!
        }
        _SiMeter = ImageVector.Builder(
            name = "Filled.SiMeter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12.388f, 3.007f)
                curveToRelative(1.934f, 0.067f, 3.819f, 0.636f, 5.463f, 1.654f)
                arcToRelative(10.9f, 10.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.061f, 4.484f)
                lineToRelative(0.162f, 0.347f)
                arcToRelative(10.7f, 10.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.855f, 5.586f)
                arcToRelative(10.77f, 10.77f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.346f, 5.553f)
                curveToRelative(-0.19f, 0.233f, -0.475f, 0.369f, -0.776f, 0.369f)
                lineTo(4.193f, 21f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.775f, -0.37f)
                arcToRelative(10.77f, 10.77f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.347f, -5.552f)
                arcToRelative(10.7f, 10.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.017f, -5.933f)
                lineToRelative(0.174f, -0.342f)
                arcTo(10.9f, 10.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.149f, 4.66f)
                arcTo(11.1f, 11.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 3f)
                close()
                moveTo(18.708f, 9.293f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.415f, 0f)
                lineToRelative(-4.777f, 4.776f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.414f, 1.414f)
                lineToRelative(4.777f, -4.776f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.414f)
            }
        }.build()

        return _SiMeter!!
    }

@Suppress("ObjectPropertyName")
private var _SiMeter: ImageVector? = null
