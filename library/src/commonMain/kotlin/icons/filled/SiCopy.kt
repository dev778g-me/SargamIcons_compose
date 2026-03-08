package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiCopy: ImageVector
    get() {
        if (_SiCopy != null) {
            return _SiCopy!!
        }
        _SiCopy = ImageVector.Builder(
            name = "Filled.SiCopy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 5.4f)
                curveTo(4f, 4.622f, 4.622f, 4f, 5.4f, 4f)
                horizontalLineToRelative(7.2f)
                curveToRelative(0.778f, 0f, 1.4f, 0.622f, 1.4f, 1.4f)
                verticalLineTo(6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2f, 0f)
                verticalLineToRelative(-0.6f)
                curveTo(16f, 3.518f, 14.482f, 2f, 12.6f, 2f)
                horizontalLineTo(5.4f)
                arcTo(3.394f, 3.394f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 5.4f)
                verticalLineToRelative(7.2f)
                curveTo(2f, 14.482f, 3.518f, 16f, 5.4f, 16f)
                horizontalLineTo(6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -2f)
                horizontalLineToRelative(-0.6f)
                curveToRelative(-0.778f, 0f, -1.4f, -0.622f, -1.4f, -1.4f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 11.4f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.4f, 9f)
                horizontalLineToRelative(7.2f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.4f, 2.4f)
                verticalLineToRelative(7.2f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.4f, 2.4f)
                horizontalLineToRelative(-7.2f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 18.6f)
                close()
            }
        }.build()

        return _SiCopy!!
    }

@Suppress("ObjectPropertyName")
private var _SiCopy: ImageVector? = null
