package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiCloseSquare: ImageVector
    get() {
        if (_SiCloseSquare != null) {
            return _SiCloseSquare!!
        }
        _SiCloseSquare = ImageVector.Builder(
            name = "Filled.SiCloseSquare",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.4f, 3f)
                horizontalLineToRelative(13.2f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 5.4f)
                verticalLineToRelative(13.2f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.4f, 2.4f)
                horizontalLineTo(5.4f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 18.6f)
                verticalLineTo(5.4f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.4f, 3f)
                moveToRelative(11.55f, 4.05f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.414f)
                lineTo(13.414f, 12f)
                lineToRelative(3.536f, 3.536f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.414f, 1.414f)
                lineTo(12f, 13.414f)
                lineTo(8.464f, 16.95f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.414f, -1.414f)
                lineTo(10.586f, 12f)
                lineTo(7.05f, 8.464f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 8.464f, 7.05f)
                lineTo(12f, 10.586f)
                lineToRelative(3.536f, -3.536f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.414f, 0f)
            }
        }.build()

        return _SiCloseSquare!!
    }

@Suppress("ObjectPropertyName")
private var _SiCloseSquare: ImageVector? = null
