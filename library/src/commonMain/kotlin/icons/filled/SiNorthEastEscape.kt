package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiNorthEastEscape: ImageVector
    get() {
        if (_SiNorthEastEscape != null) {
            return _SiNorthEastEscape!!
        }
        _SiNorthEastEscape = ImageVector.Builder(
            name = "Filled.SiNorthEastEscape",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13f, 6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                horizontalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                verticalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
                verticalLineTo(8.414f)
                lineToRelative(-6.293f, 6.293f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.414f, -1.414f)
                lineTo(15.586f, 7f)
                horizontalLineTo(14f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                moveTo(5f, 9.4f)
                curveTo(5f, 7.518f, 6.518f, 6f, 8.4f, 6f)
                horizontalLineTo(9f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                horizontalLineToRelative(-0.6f)
                curveTo(7.622f, 8f, 7f, 8.622f, 7f, 9.4f)
                verticalLineToRelative(6.2f)
                curveToRelative(0f, 0.778f, 0.622f, 1.4f, 1.4f, 1.4f)
                horizontalLineToRelative(6.2f)
                curveToRelative(0.778f, 0f, 1.4f, -0.622f, 1.4f, -1.4f)
                verticalLineTo(15f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                verticalLineToRelative(0.6f)
                curveToRelative(0f, 1.882f, -1.518f, 3.4f, -3.4f, 3.4f)
                horizontalLineTo(8.4f)
                arcTo(3.394f, 3.394f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 15.6f)
                close()
            }
        }.build()

        return _SiNorthEastEscape!!
    }

@Suppress("ObjectPropertyName")
private var _SiNorthEastEscape: ImageVector? = null
