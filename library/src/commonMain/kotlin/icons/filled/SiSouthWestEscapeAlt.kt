package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiSouthWestEscapeAlt: ImageVector
    get() {
        if (_SiSouthWestEscapeAlt != null) {
            return _SiSouthWestEscapeAlt!!
        }
        _SiSouthWestEscapeAlt = ImageVector.Builder(
            name = "Filled.SiSouthWestEscapeAlt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 8.4f)
                curveTo(8f, 6.518f, 9.518f, 5f, 11.4f, 5f)
                horizontalLineToRelative(4.2f)
                curveTo(17.482f, 5f, 19f, 6.518f, 19f, 8.4f)
                verticalLineToRelative(4.2f)
                curveToRelative(0f, 1.882f, -1.518f, 3.4f, -3.4f, 3.4f)
                lineTo(15f, 16f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, -2f)
                horizontalLineToRelative(0.6f)
                curveToRelative(0.778f, 0f, 1.4f, -0.622f, 1.4f, -1.4f)
                lineTo(17f, 8.4f)
                curveToRelative(0f, -0.778f, -0.622f, -1.4f, -1.4f, -1.4f)
                horizontalLineToRelative(-4.2f)
                curveToRelative(-0.778f, 0f, -1.4f, 0.622f, -1.4f, 1.4f)
                lineTo(10f, 9f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
                close()
                moveTo(14.707f, 9.293f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.414f)
                lineTo(8.414f, 17f)
                lineTo(10f, 17f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 2f)
                lineTo(6f, 19f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                verticalLineToRelative(-4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                verticalLineToRelative(1.586f)
                lineToRelative(6.293f, -6.293f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.414f, 0f)
            }
        }.build()

        return _SiSouthWestEscapeAlt!!
    }

@Suppress("ObjectPropertyName")
private var _SiSouthWestEscapeAlt: ImageVector? = null
