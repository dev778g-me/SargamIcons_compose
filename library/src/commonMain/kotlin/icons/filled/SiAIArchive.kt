package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiAIArchive: ImageVector
    get() {
        if (_SiAIArchive != null) {
            return _SiAIArchive!!
        }
        _SiAIArchive = ImageVector.Builder(
            name = "Filled.SiAIArchive",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 12.797f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.203f, 0.203f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.203f, 0.203f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.203f, -0.203f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.203f, -0.203f)
            }
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(21.4f, 2f)
                arcTo(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 4.6f)
                verticalLineToRelative(0.8f)
                arcTo(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.4f, 8f)
                horizontalLineToRelative(-0.486f)
                lineTo(20f, 18.6f)
                curveToRelative(0f, 1.33f, -1.07f, 2.4f, -2.4f, 2.4f)
                lineTo(6.4f, 21f)
                curveTo(5.07f, 21f, 4f, 19.93f, 4f, 18.6f)
                lineTo(3.086f, 8f)
                lineTo(2.6f, 8f)
                arcTo(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 5.4f)
                verticalLineToRelative(-0.8f)
                arcTo(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.6f, 2f)
                close()
                moveTo(12.922f, 10.595f)
                curveToRelative(-0.232f, -0.93f, -1.52f, -0.959f, -1.818f, -0.087f)
                lineToRelative(-0.025f, 0.087f)
                lineToRelative(-0.297f, 1.187f)
                lineToRelative(-1.187f, 0.297f)
                curveToRelative(-0.96f, 0.24f, -0.96f, 1.603f, 0f, 1.843f)
                lineToRelative(1.187f, 0.297f)
                lineToRelative(0.297f, 1.187f)
                curveToRelative(0.24f, 0.959f, 1.603f, 0.96f, 1.843f, 0f)
                lineToRelative(0.297f, -1.187f)
                lineToRelative(1.187f, -0.297f)
                curveToRelative(0.96f, -0.24f, 0.959f, -1.603f, 0f, -1.843f)
                lineToRelative(-1.187f, -0.297f)
                close()
                moveTo(2.6f, 4f)
                arcToRelative(0.6f, 0.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.6f, 0.6f)
                verticalLineToRelative(0.8f)
                arcToRelative(0.6f, 0.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.6f, 0.6f)
                horizontalLineToRelative(18.8f)
                arcToRelative(0.6f, 0.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.6f, -0.6f)
                verticalLineToRelative(-0.8f)
                arcToRelative(0.6f, 0.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.6f, -0.6f)
                close()
            }
        }.build()

        return _SiAIArchive!!
    }

@Suppress("ObjectPropertyName")
private var _SiAIArchive: ImageVector? = null
