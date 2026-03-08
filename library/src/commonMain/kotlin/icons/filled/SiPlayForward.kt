package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiPlayForward: ImageVector
    get() {
        if (_SiPlayForward != null) {
            return _SiPlayForward!!
        }
        _SiPlayForward = ImageVector.Builder(
            name = "Filled.SiPlayForward",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.573f, 4.18f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 5f)
                verticalLineToRelative(14f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.573f, 0.82f)
                lineTo(10f, 16.02f)
                verticalLineTo(19f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.573f, 0.82f)
                lineToRelative(10f, -7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.64f)
                lineToRelative(-10f, -7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 5f)
                verticalLineToRelative(2.98f)
                close()
                moveTo(12f, 9.38f)
                lineToRelative(2.573f, 1.8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.64f)
                lineTo(12f, 14.62f)
                verticalLineToRelative(2.46f)
                lineTo(19.256f, 12f)
                lineTo(12f, 6.92f)
                close()
            }
        }.build()

        return _SiPlayForward!!
    }

@Suppress("ObjectPropertyName")
private var _SiPlayForward: ImageVector? = null
