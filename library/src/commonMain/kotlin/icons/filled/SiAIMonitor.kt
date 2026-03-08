package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiAIMonitor: ImageVector
    get() {
        if (_SiAIMonitor != null) {
            return _SiAIMonitor!!
        }
        _SiAIMonitor = ImageVector.Builder(
            name = "Filled.SiAIMonitor",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 19f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 2f)
                horizontalLineTo(9f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, -2f)
                close()
                moveTo(12f, 10.297f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.203f, 0.203f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.203f, 0.203f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.203f, -0.203f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.203f, -0.203f)
            }
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(19.775f, 3.005f)
                arcTo(3.4f, 3.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 6.4f)
                verticalLineToRelative(8.2f)
                arcToRelative(3.4f, 3.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.4f, 3.4f)
                lineTo(4.4f, 18f)
                arcTo(3.4f, 3.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 14.6f)
                lineTo(1f, 6.4f)
                arcTo(3.4f, 3.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.4f, 3f)
                horizontalLineToRelative(15.2f)
                close()
                moveTo(12.922f, 8.095f)
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
            }
        }.build()

        return _SiAIMonitor!!
    }

@Suppress("ObjectPropertyName")
private var _SiAIMonitor: ImageVector? = null
