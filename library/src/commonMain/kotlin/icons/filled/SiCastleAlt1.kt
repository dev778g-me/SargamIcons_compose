package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiCastleAlt1: ImageVector
    get() {
        if (_SiCastleAlt1 != null) {
            return _SiCastleAlt1!!
        }
        _SiCastleAlt1 = ImageVector.Builder(
            name = "Filled.SiCastleAlt1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.2f, 1f)
                arcTo(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 2.8f)
                lineTo(11f, 5f)
                horizontalLineToRelative(2f)
                lineTo(13f, 2.8f)
                arcTo(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.8f, 1f)
                horizontalLineToRelative(2.4f)
                arcTo(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 2.8f)
                lineTo(19f, 7f)
                horizontalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 2f)
                verticalLineToRelative(10.6f)
                arcToRelative(3.4f, 3.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.4f, 3.4f)
                lineTo(4.5f, 23f)
                curveTo(2.65f, 23f, 1f, 21.458f, 1f, 19.553f)
                lineTo(1f, 9f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                horizontalLineToRelative(4f)
                lineTo(5f, 2.8f)
                arcTo(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.8f, 1f)
                close()
                moveTo(10.8f, 17f)
                arcTo(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 18.8f)
                lineTo(9f, 22f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3.2f)
                arcToRelative(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.8f, -1.8f)
                close()
                moveTo(10f, 13f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 2f)
                horizontalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -2f)
                close()
                moveTo(11f, 9f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 2f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -2f)
                close()
                moveTo(8f, 3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                moveToRelative(8f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
            }
        }.build()

        return _SiCastleAlt1!!
    }

@Suppress("ObjectPropertyName")
private var _SiCastleAlt1: ImageVector? = null
