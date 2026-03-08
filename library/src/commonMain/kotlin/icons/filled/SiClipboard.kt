package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiClipboard: ImageVector
    get() {
        if (_SiClipboard != null) {
            return _SiClipboard!!
        }
        _SiClipboard = ImageVector.Builder(
            name = "Filled.SiClipboard",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7f, 3f)
                lineTo(7f, 1.8f)
                arcTo(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.8f, 0f)
                horizontalLineToRelative(6.4f)
                arcTo(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 1.8f)
                lineTo(17f, 3f)
                horizontalLineToRelative(1.6f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 5.4f)
                verticalLineToRelative(15.2f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.4f, 2.4f)
                lineTo(5.4f, 23f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 20.6f)
                lineTo(3f, 5.4f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.4f, 3f)
                close()
                moveTo(9f, 2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                lineTo(9f, 4f)
                close()
            }
        }.build()

        return _SiClipboard!!
    }

@Suppress("ObjectPropertyName")
private var _SiClipboard: ImageVector? = null
