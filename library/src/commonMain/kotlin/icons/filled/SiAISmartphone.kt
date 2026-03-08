package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiAISmartphone: ImageVector
    get() {
        if (_SiAISmartphone != null) {
            return _SiAISmartphone!!
        }
        _SiAISmartphone = ImageVector.Builder(
            name = "Filled.SiAISmartphone",
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
                moveTo(15.6f, 1f)
                arcTo(3.4f, 3.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 4.4f)
                verticalLineToRelative(15.2f)
                arcToRelative(3.4f, 3.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.4f, 3.4f)
                lineTo(8.4f, 23f)
                arcToRelative(3.4f, 3.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.395f, -3.225f)
                lineTo(5f, 19.6f)
                lineTo(5f, 4.4f)
                arcTo(3.4f, 3.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.4f, 1f)
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
                moveTo(11f, 4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 2f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -2f)
                close()
            }
        }.build()

        return _SiAISmartphone!!
    }

@Suppress("ObjectPropertyName")
private var _SiAISmartphone: ImageVector? = null
