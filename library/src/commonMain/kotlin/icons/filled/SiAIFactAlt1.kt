package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiAIFactAlt1: ImageVector
    get() {
        if (_SiAIFactAlt1 != null) {
            return _SiAIFactAlt1!!
        }
        _SiAIFactAlt1 = ImageVector.Builder(
            name = "Filled.SiAIFactAlt1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 11.796f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.203f, 0.203f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.203f, 0.203f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.203f, 12f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 11.796f)
            }
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.4f, 4f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 6.4f)
                verticalLineToRelative(11.2f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.4f, 20f)
                horizontalLineToRelative(17.2f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.4f, -2.4f)
                lineTo(23f, 6.4f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.6f, 4f)
                close()
                moveTo(19f, 14f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 2f)
                horizontalLineToRelative(-5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, -2f)
                close()
                moveTo(7.078f, 9.594f)
                curveToRelative(0.233f, -0.93f, 1.52f, -0.958f, 1.818f, -0.087f)
                lineToRelative(0.025f, 0.087f)
                lineToRelative(0.297f, 1.187f)
                lineToRelative(1.187f, 0.297f)
                curveToRelative(0.96f, 0.24f, 0.96f, 1.603f, 0f, 1.843f)
                lineToRelative(-1.187f, 0.297f)
                lineToRelative(-0.297f, 1.187f)
                curveToRelative(-0.24f, 0.96f, -1.603f, 0.96f, -1.843f, 0f)
                lineToRelative(-0.297f, -1.187f)
                lineToRelative(-1.187f, -0.297f)
                curveToRelative(-0.959f, -0.24f, -0.96f, -1.603f, 0f, -1.843f)
                lineToRelative(1.187f, -0.297f)
                close()
                moveTo(19f, 11f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 2f)
                horizontalLineToRelative(-5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, -2f)
                close()
                moveTo(19f, 8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 2f)
                horizontalLineToRelative(-5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, -2f)
                close()
            }
        }.build()

        return _SiAIFactAlt1!!
    }

@Suppress("ObjectPropertyName")
private var _SiAIFactAlt1: ImageVector? = null
