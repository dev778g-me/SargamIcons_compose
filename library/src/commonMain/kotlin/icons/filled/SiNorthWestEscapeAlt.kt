package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiNorthWestEscapeAlt: ImageVector
    get() {
        if (_SiNorthWestEscapeAlt != null) {
            return _SiNorthWestEscapeAlt!!
        }
        _SiNorthWestEscapeAlt = ImageVector.Builder(
            name = "Filled.SiNorthWestEscapeAlt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7f, 8.414f)
                verticalLineTo(10f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
                verticalLineTo(6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                horizontalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 2f)
                horizontalLineTo(8.414f)
                lineToRelative(6.293f, 6.293f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.414f, 1.414f)
                close()
                moveTo(14f, 9f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                horizontalLineToRelative(0.6f)
                curveToRelative(1.882f, 0f, 3.4f, 1.518f, 3.4f, 3.4f)
                verticalLineToRelative(4.2f)
                curveToRelative(0f, 1.882f, -1.518f, 3.4f, -3.4f, 3.4f)
                horizontalLineToRelative(-4.2f)
                arcTo(3.394f, 3.394f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 15.6f)
                verticalLineTo(15f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                verticalLineToRelative(0.6f)
                curveToRelative(0f, 0.778f, 0.622f, 1.4f, 1.4f, 1.4f)
                horizontalLineToRelative(4.2f)
                curveToRelative(0.778f, 0f, 1.4f, -0.622f, 1.4f, -1.4f)
                verticalLineToRelative(-4.2f)
                curveToRelative(0f, -0.778f, -0.622f, -1.4f, -1.4f, -1.4f)
                horizontalLineTo(15f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
            }
        }.build()

        return _SiNorthWestEscapeAlt!!
    }

@Suppress("ObjectPropertyName")
private var _SiNorthWestEscapeAlt: ImageVector? = null
