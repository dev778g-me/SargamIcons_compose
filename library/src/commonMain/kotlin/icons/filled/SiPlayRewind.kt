package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiPlayRewind: ImageVector
    get() {
        if (_SiPlayRewind != null) {
            return _SiPlayRewind!!
        }
        _SiPlayRewind = ImageVector.Builder(
            name = "Filled.SiPlayRewind",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14f, 5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.573f, -0.82f)
                lineToRelative(-10f, 7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.64f)
                lineToRelative(10f, 7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 19f)
                verticalLineToRelative(-2.98f)
                lineToRelative(5.427f, 3.8f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 19f)
                lineTo(21f, 5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.573f, -0.82f)
                lineTo(14f, 7.98f)
                close()
                moveTo(12f, 9.38f)
                lineTo(12f, 6.92f)
                lineTo(4.744f, 12f)
                lineTo(12f, 17.08f)
                verticalLineToRelative(-2.46f)
                lineToRelative(-2.573f, -1.8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.64f)
                close()
            }
        }.build()

        return _SiPlayRewind!!
    }

@Suppress("ObjectPropertyName")
private var _SiPlayRewind: ImageVector? = null
