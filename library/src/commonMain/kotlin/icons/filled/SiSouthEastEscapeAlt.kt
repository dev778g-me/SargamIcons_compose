package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiSouthEastEscapeAlt: ImageVector
    get() {
        if (_SiSouthEastEscapeAlt != null) {
            return _SiSouthEastEscapeAlt!!
        }
        _SiSouthEastEscapeAlt = ImageVector.Builder(
            name = "Filled.SiSouthEastEscapeAlt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.4f, 7f)
                curveTo(7.622f, 7f, 7f, 7.622f, 7f, 8.4f)
                verticalLineToRelative(4.2f)
                curveToRelative(0f, 0.778f, 0.622f, 1.4f, 1.4f, 1.4f)
                lineTo(9f, 14f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 2f)
                horizontalLineToRelative(-0.6f)
                arcTo(3.394f, 3.394f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 12.6f)
                lineTo(5f, 8.4f)
                curveTo(5f, 6.518f, 6.518f, 5f, 8.4f, 5f)
                horizontalLineToRelative(4.2f)
                curveTo(14.482f, 5f, 16f, 6.518f, 16f, 8.4f)
                lineTo(16f, 9f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
                verticalLineToRelative(-0.6f)
                curveToRelative(0f, -0.778f, -0.622f, -1.4f, -1.4f, -1.4f)
                close()
                moveTo(9.293f, 9.293f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.414f, 0f)
                lineTo(17f, 15.586f)
                lineTo(17f, 14f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
                verticalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                horizontalLineToRelative(-4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                horizontalLineToRelative(1.586f)
                lineToRelative(-6.293f, -6.293f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.414f)
            }
        }.build()

        return _SiSouthEastEscapeAlt!!
    }

@Suppress("ObjectPropertyName")
private var _SiSouthEastEscapeAlt: ImageVector? = null
