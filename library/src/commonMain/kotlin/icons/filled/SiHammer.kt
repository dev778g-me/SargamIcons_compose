package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiHammer: ImageVector
    get() {
        if (_SiHammer != null) {
            return _SiHammer!!
        }
        _SiHammer = ImageVector.Builder(
            name = "Filled.SiHammer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.377f, 4.72f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.62f, 1.209f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.414f, -1.414f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.728f, 0f)
                lineToRelative(5.94f, 5.94f)
                arcToRelative(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 3.676f)
                lineToRelative(-1.273f, 1.273f)
                arcToRelative(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.677f, 0f)
                lineTo(14.657f, 13f)
                lineTo(5.89f, 21.768f)
                arcToRelative(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.677f, 0f)
                lineToRelative(-0.566f, -0.566f)
                arcToRelative(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -3.677f)
                lineToRelative(8.769f, -8.768f)
                close()
                moveTo(20.314f, 11.586f)
                lineTo(18.193f, 13.707f)
                lineTo(18.475f, 13.99f)
                arcToRelative(0.6f, 0.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.849f, 0f)
                lineToRelative(1.273f, -1.273f)
                arcToRelative(0.6f, 0.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -0.848f)
                close()
                moveTo(11.122f, 13.707f)
                lineTo(9.707f, 12.293f)
                lineTo(3.06f, 18.94f)
                arcToRelative(0.6f, 0.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 0.848f)
                lineToRelative(0.566f, 0.566f)
                arcToRelative(0.6f, 0.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.849f, 0f)
                close()
            }
        }.build()

        return _SiHammer!!
    }

@Suppress("ObjectPropertyName")
private var _SiHammer: ImageVector? = null
